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
package mage.cards.b;

import java.util.List;
import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AllyEntersBattlefieldTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.Cards;
import mage.cards.CardsImpl;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.filter.FilterCard;
import mage.filter.common.FilterControlledPermanent;
import mage.filter.predicate.mageobject.SubtypePredicate;
import mage.game.Game;
import mage.players.Player;
import mage.target.TargetCard;
import mage.target.TargetPlayer;

/**
 *
 * @author jeffwadsworth
 */
public class BalaGedThief extends CardImpl {

    public BalaGedThief(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{3}{B}");
        this.subtype.add("Human");
        this.subtype.add("Rogue");
        this.subtype.add("Ally");

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Whenever Bala Ged Thief or another Ally enters the battlefield under your control, target player reveals a number of cards from his or her hand equal to the number of Allies you control. You choose one of them. That player discards that card.
        Ability ability = new AllyEntersBattlefieldTriggeredAbility(new BalaGedThiefEffect(), false);
        ability.addTarget(new TargetPlayer());
        this.addAbility(ability);
    }

    public BalaGedThief(final BalaGedThief card) {
        super(card);
    }

    @Override
    public BalaGedThief copy() {
        return new BalaGedThief(this);
    }
}

class BalaGedThiefEffect extends OneShotEffect {

    public BalaGedThiefEffect() {
        super(Outcome.Discard);
        this.staticText = "target player reveals a number of cards from his or her hand equal to the number of Allies you control. You choose one of them. That player discards that card";
    }

    public BalaGedThiefEffect(final BalaGedThiefEffect effect) {
        super(effect);
    }

    @Override
    public BalaGedThiefEffect copy() {
        return new BalaGedThiefEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player targetPlayer = game.getPlayer(source.getFirstTarget());

        if (targetPlayer == null) {
            return false;
        }

        Player you = game.getPlayer(source.getControllerId());

        FilterControlledPermanent filter = new FilterControlledPermanent();
        filter.add(new SubtypePredicate("Ally"));

        int numberOfAllies = game.getBattlefield().countAll(filter, you.getId(), game);

        Cards cardsInHand = new CardsImpl();
        cardsInHand.addAll(targetPlayer.getHand());

        int count = Math.min(cardsInHand.size(), numberOfAllies);

        TargetCard target = new TargetCard(count, Zone.HAND, new FilterCard());
        Cards revealedCards = new CardsImpl();

        if (targetPlayer.choose(Outcome.DrawCard, cardsInHand, target, game)) {
            List<UUID> targets = target.getTargets();
            for (UUID targetId : targets) {
                Card card = game.getCard(targetId);
                if (card != null) {
                    revealedCards.add(card);
                }
            }
        }

        TargetCard targetInHand = new TargetCard(Zone.HAND, new FilterCard("card to discard"));

        if (!revealedCards.isEmpty()) {
            targetPlayer.revealCards("Bala Ged Thief", revealedCards, game);
            you.choose(Outcome.Neutral, revealedCards, targetInHand, game);
            Card card = revealedCards.get(targetInHand.getFirstTarget(), game);
            if (card != null) {
                targetPlayer.discard(card, source, game);
                game.informPlayers(new StringBuilder("Bala Ged Thief: ").append(targetPlayer.getLogName()).append(" discarded ").append(card.getName()).toString());
            }
        }
        return true;
    }
}
