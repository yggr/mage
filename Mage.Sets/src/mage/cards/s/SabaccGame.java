/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.cards.s;

import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.continuous.GainControlTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.TargetController;
import mage.filter.FilterPermanent;
import mage.filter.predicate.permanent.ControllerIdPredicate;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.TargetPermanent;
import mage.target.targetpointer.FixedTarget;

/**
 *
 * @author Styxo
 */
public class SabaccGame extends CardImpl {

    private static final FilterPermanent filter = new FilterPermanent("permanent an opponent controls");

    static {
        filter.add(new ControllerPredicate(TargetController.OPPONENT));
    }

    public SabaccGame(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{U}");

        // Almost the same as unimplemented Mogg Assassin from Exodus
        // Not exactly. Because the permanent choosen by opponent does not have the target word in rule text it is chosen during resolution.
        /*
         * Choose target permanent an opponent controls. That opponent chooses a permanent you control.
         * Flip a coin. If you win the flip, gain control of the permanent you chose.
         * If you lose the flip, your opponent gains control of the permanent they chose.
         */
        this.getSpellAbility().getEffects().add(new SabaccGameEffect());
        this.getSpellAbility().getTargets().add(new TargetPermanent(filter));
    }

    public SabaccGame(final SabaccGame card) {
        super(card);
    }

    @Override
    public SabaccGame copy() {
        return new SabaccGame(this);
    }
}

class SabaccGameEffect extends OneShotEffect {

    public SabaccGameEffect() {
        super(Outcome.Detriment);
        this.staticText = "Choose target permanent an opponent controls. That opponent chooses a permanent you control. "
                + "Flip a coin. If you win the flip, gain control of the permanent you chose. "
                + "If you lose the flip, your opponent gains control of the permanent they chose";
    }

    public SabaccGameEffect(final SabaccGameEffect effect) {
        super(effect);
    }

    @Override
    public SabaccGameEffect copy() {
        return new SabaccGameEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            Permanent targetPermanent = game.getPermanentOrLKIBattlefield(getTargetPointer().getFirst(game, source));
            if (targetPermanent != null) {
                Player opponent = game.getPlayer(targetPermanent.getControllerId());
                if (opponent != null) {
                    FilterPermanent filter = new FilterPermanent("permanent controlled by " + controller.getName());
                    filter.add(new ControllerIdPredicate(controller.getId()));
                    TargetPermanent target = new TargetPermanent(1, 1, filter, true);
                    Permanent chosenPermanent = null;
                    if (target.chooseTarget(outcome, opponent.getId(), source, game)) {
                        chosenPermanent = game.getPermanent(target.getFirstTarget());
                    }
                    boolean flipWin = controller.flipCoin(game);
                    if (flipWin) {
                        ContinuousEffect effect = new GainControlTargetEffect(Duration.Custom, true, controller.getId());
                        effect.setTargetPointer(new FixedTarget(targetPermanent, game));
                        game.addEffect(effect, source);
                    } else if (chosenPermanent != null) {
                        ContinuousEffect effect = new GainControlTargetEffect(Duration.Custom, true, opponent.getId());
                        effect.setTargetPointer(new FixedTarget(chosenPermanent, game));
                        game.addEffect(effect, source);
                    }

                }
            }
            return true;
        }
        return false;
    }
}
