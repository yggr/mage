/*
 * Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.i.IcatianJavelineers;
import mage.cards.s.SwampMosquito;
import mage.constants.SetType;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;

/**
 *
 * @author North
 */
public class TimeSpiralTimeshifted extends ExpansionSet {

    private static final TimeSpiralTimeshifted fINSTANCE = new TimeSpiralTimeshifted();

    public static TimeSpiralTimeshifted getInstance() {
        return fINSTANCE;
    }

    private TimeSpiralTimeshifted() {
        super("Time Spiral \"Timeshifted\"", "TSB", ExpansionSet.buildDate(2006, 9, 9), SetType.EXPANSION);
        this.blockName = "Time Spiral";
        this.parentSet = TimeSpiral.getInstance();
        this.hasBasicLands = false;
        cards.add(new SetCardInfo("Akroma, Angel of Wrath", 1, Rarity.COMMON, mage.cards.a.AkromaAngelOfWrath.class));
        cards.add(new SetCardInfo("Arena", 117, Rarity.SPECIAL, mage.cards.a.Arena.class));
        cards.add(new SetCardInfo("Auratog", 2, Rarity.COMMON, mage.cards.a.Auratog.class));
        cards.add(new SetCardInfo("Avalanche Riders", 55, Rarity.COMMON, mage.cards.a.AvalancheRiders.class));
        cards.add(new SetCardInfo("Avatar of Woe", 37, Rarity.SPECIAL, mage.cards.a.AvatarOfWoe.class));
        cards.add(new SetCardInfo("Avoid Fate", 73, Rarity.SPECIAL, mage.cards.a.AvoidFate.class));
        cards.add(new SetCardInfo("Bad Moon", 38, Rarity.RARE, mage.cards.b.BadMoon.class));
        cards.add(new SetCardInfo("Browbeat", 56, Rarity.SPECIAL, mage.cards.b.Browbeat.class));
        cards.add(new SetCardInfo("Call of the Herd", 74, Rarity.COMMON, mage.cards.c.CallOfTheHerd.class));
        cards.add(new SetCardInfo("Celestial Dawn", 3, Rarity.SPECIAL, mage.cards.c.CelestialDawn.class));
        cards.add(new SetCardInfo("Claws of Gix", 107, Rarity.COMMON, mage.cards.c.ClawsOfGix.class));
        cards.add(new SetCardInfo("Coalition Victory", 91, Rarity.RARE, mage.cards.c.CoalitionVictory.class));
        cards.add(new SetCardInfo("Cockatrice", 75, Rarity.SPECIAL, mage.cards.c.Cockatrice.class));
        cards.add(new SetCardInfo("Conspiracy", 39, Rarity.SPECIAL, mage.cards.c.Conspiracy.class));
        cards.add(new SetCardInfo("Craw Giant", 76, Rarity.SPECIAL, mage.cards.c.CrawGiant.class));
        cards.add(new SetCardInfo("Dandan", 19, Rarity.SPECIAL, mage.cards.d.Dandan.class));
        cards.add(new SetCardInfo("Darkness", 40, Rarity.COMMON, mage.cards.d.Darkness.class));
        cards.add(new SetCardInfo("Dauthi Slayer", 41, Rarity.COMMON, mage.cards.d.DauthiSlayer.class));
        cards.add(new SetCardInfo("Desert", 118, Rarity.SPECIAL, mage.cards.d.Desert.class));
        cards.add(new SetCardInfo("Desolation Giant", 57, Rarity.SPECIAL, mage.cards.d.DesolationGiant.class));
        cards.add(new SetCardInfo("Disenchant", 6, Rarity.COMMON, mage.cards.d.Disenchant.class));
        cards.add(new SetCardInfo("Disintegrate", 58, Rarity.SPECIAL, mage.cards.d.Disintegrate.class));
        cards.add(new SetCardInfo("Dodecapod", 108, Rarity.SPECIAL, mage.cards.d.Dodecapod.class));
        cards.add(new SetCardInfo("Dragonstorm", 60, Rarity.SPECIAL, mage.cards.d.Dragonstorm.class));
        cards.add(new SetCardInfo("Dragon Whelp", 59, Rarity.COMMON, mage.cards.d.DragonWhelp.class));
        cards.add(new SetCardInfo("Enduring Renewal", 7, Rarity.SPECIAL, mage.cards.e.EnduringRenewal.class));
        cards.add(new SetCardInfo("Eron the Relentless", 61, Rarity.SPECIAL, mage.cards.e.EronTheRelentless.class));
        cards.add(new SetCardInfo("Essence Sliver", 8, Rarity.SPECIAL, mage.cards.e.EssenceSliver.class));
        cards.add(new SetCardInfo("Evil Eye of Orms-by-Gore", 42, Rarity.SPECIAL, mage.cards.e.EvilEyeOfOrmsByGore.class));
        cards.add(new SetCardInfo("Faceless Butcher", 43, Rarity.SPECIAL, mage.cards.f.FacelessButcher.class));
        cards.add(new SetCardInfo("Feldon's Cane", 109, Rarity.SPECIAL, mage.cards.f.FeldonsCane.class));
        cards.add(new SetCardInfo("Fiery Justice", 92, Rarity.SPECIAL, mage.cards.f.FieryJustice.class));
        cards.add(new SetCardInfo("Fiery Temper", 62, Rarity.SPECIAL, mage.cards.f.FieryTemper.class));
        cards.add(new SetCardInfo("Fire Whip", 63, Rarity.SPECIAL, mage.cards.f.FireWhip.class));
        cards.add(new SetCardInfo("Flying Men", 20, Rarity.COMMON, mage.cards.f.FlyingMen.class));
        cards.add(new SetCardInfo("Funeral Charm", 44, Rarity.COMMON, mage.cards.f.FuneralCharm.class));
        cards.add(new SetCardInfo("Gaea's Blessing", 77, Rarity.SPECIAL, mage.cards.g.GaeasBlessing.class));
        cards.add(new SetCardInfo("Gemstone Mine", 119, Rarity.RARE, mage.cards.g.GemstoneMine.class));
        cards.add(new SetCardInfo("Ghost Ship", 21, Rarity.SPECIAL, mage.cards.g.GhostShip.class));
        cards.add(new SetCardInfo("Goblin Snowman", 64, Rarity.UNCOMMON, mage.cards.g.GoblinSnowman.class));
        cards.add(new SetCardInfo("Grinning Totem", 110, Rarity.SPECIAL, mage.cards.g.GrinningTotem.class));
        cards.add(new SetCardInfo("Hunting Moa", 80, Rarity.COMMON, mage.cards.h.HuntingMoa.class));
        cards.add(new SetCardInfo("Icatian Javelineers", 10, Rarity.SPECIAL, IcatianJavelineers.class));
        cards.add(new SetCardInfo("Jasmine Boreal", 93, Rarity.COMMON, mage.cards.j.JasmineBoreal.class));
        cards.add(new SetCardInfo("Jolrael, Empress of Beasts", 81, Rarity.SPECIAL, mage.cards.j.JolraelEmpressOfBeasts.class));
        cards.add(new SetCardInfo("Kobold Taskmaster", 65, Rarity.SPECIAL, mage.cards.k.KoboldTaskmaster.class));
        cards.add(new SetCardInfo("Krosan Cloudscraper", 82, Rarity.SPECIAL, mage.cards.k.KrosanCloudscraper.class));
        cards.add(new SetCardInfo("Lightning Angel", 94, Rarity.COMMON, mage.cards.l.LightningAngel.class));
        cards.add(new SetCardInfo("Lord of Atlantis", 24, Rarity.RARE, mage.cards.l.LordOfAtlantis.class));
        cards.add(new SetCardInfo("Merfolk Assassin", 25, Rarity.SPECIAL, mage.cards.m.MerfolkAssassin.class));
        cards.add(new SetCardInfo("Merieke Ri Berit", 95, Rarity.SPECIAL, mage.cards.m.MeriekeRiBerit.class));
        cards.add(new SetCardInfo("Mindless Automaton", 111, Rarity.SPECIAL, mage.cards.m.MindlessAutomaton.class));
        cards.add(new SetCardInfo("Mirari", 112, Rarity.SPECIAL, mage.cards.m.Mirari.class));
        cards.add(new SetCardInfo("Moorish Cavalry", 11, Rarity.COMMON, mage.cards.m.MoorishCavalry.class));
        cards.add(new SetCardInfo("Mystic Enforcer", 96, Rarity.SPECIAL, mage.cards.m.MysticEnforcer.class));
        cards.add(new SetCardInfo("Mystic Snake", 97, Rarity.COMMON, mage.cards.m.MysticSnake.class));
        cards.add(new SetCardInfo("Nicol Bolas", 98, Rarity.SPECIAL, mage.cards.n.NicolBolas.class));
        cards.add(new SetCardInfo("Orcish Librarian", 66, Rarity.SPECIAL, mage.cards.o.OrcishLibrarian.class));
        cards.add(new SetCardInfo("Orgg", 67, Rarity.SPECIAL, mage.cards.o.Orgg.class));
        cards.add(new SetCardInfo("Pandemonium", 68, Rarity.SPECIAL, mage.cards.p.Pandemonium.class));
        cards.add(new SetCardInfo("Pendelhaven", 120, Rarity.COMMON, mage.cards.p.Pendelhaven.class));
        cards.add(new SetCardInfo("Pirate Ship", 28, Rarity.SPECIAL, mage.cards.p.PirateShip.class));
        cards.add(new SetCardInfo("Prodigal Sorcerer", 29, Rarity.COMMON, mage.cards.p.ProdigalSorcerer.class));
        cards.add(new SetCardInfo("Psionic Blast", 30, Rarity.COMMON, mage.cards.p.PsionicBlast.class));
        cards.add(new SetCardInfo("Resurrection", 12, Rarity.SPECIAL, mage.cards.r.Resurrection.class));
        cards.add(new SetCardInfo("Sacred Mesa", 13, Rarity.SPECIAL, mage.cards.s.SacredMesa.class));
        cards.add(new SetCardInfo("Safe Haven", 121, Rarity.SPECIAL, mage.cards.s.SafeHaven.class));
        cards.add(new SetCardInfo("Scragnoth", 83, Rarity.SPECIAL, mage.cards.s.Scragnoth.class));
        cards.add(new SetCardInfo("Sengir Autocrat", 45, Rarity.SPECIAL, mage.cards.s.SengirAutocrat.class));
        cards.add(new SetCardInfo("Serrated Arrows", 114, Rarity.SPECIAL, mage.cards.s.SerratedArrows.class));
        cards.add(new SetCardInfo("Shadow Guildmage", 46, Rarity.SPECIAL, mage.cards.s.ShadowGuildmage.class));
        cards.add(new SetCardInfo("Shadowmage Infiltrator", 99, Rarity.COMMON, mage.cards.s.ShadowmageInfiltrator.class));
        cards.add(new SetCardInfo("Sindbad", 31, Rarity.SPECIAL, mage.cards.s.Sindbad.class));
        cards.add(new SetCardInfo("Sol'kanar the Swamp King", 100, Rarity.COMMON, mage.cards.s.SolkanarTheSwampKing.class));
        cards.add(new SetCardInfo("Soltari Priest", 14, Rarity.COMMON, mage.cards.s.SoltariPriest.class));
        cards.add(new SetCardInfo("Soul Collector", 47, Rarity.SPECIAL, mage.cards.s.SoulCollector.class));
        cards.add(new SetCardInfo("Spike Feeder", 84, Rarity.COMMON, mage.cards.s.SpikeFeeder.class));
        cards.add(new SetCardInfo("Spined Sliver", 101, Rarity.SPECIAL, mage.cards.s.SpinedSliver.class));
        cards.add(new SetCardInfo("Squire", 15, Rarity.COMMON, mage.cards.s.Squire.class));
        cards.add(new SetCardInfo("Stormbind", 102, Rarity.SPECIAL, mage.cards.s.Stormbind.class));
        cards.add(new SetCardInfo("Stormscape Familiar", 32, Rarity.COMMON, mage.cards.s.StormscapeFamiliar.class));
        cards.add(new SetCardInfo("Stupor", 48, Rarity.COMMON, mage.cards.s.Stupor.class));
        cards.add(new SetCardInfo("Suq'Ata Lancer", 69, Rarity.COMMON, mage.cards.s.SuqAtaLancer.class));
        cards.add(new SetCardInfo("Swamp Mosquito", 49, Rarity.SPECIAL, SwampMosquito.class));
        cards.add(new SetCardInfo("Teferi's Moat", 103, Rarity.SPECIAL, mage.cards.t.TeferisMoat.class));
        cards.add(new SetCardInfo("Thallid", 86, Rarity.COMMON, mage.cards.t.Thallid.class));
        cards.add(new SetCardInfo("The Rack", 113, Rarity.SPECIAL, mage.cards.t.TheRack.class));
        cards.add(new SetCardInfo("Thornscape Battlemage", 87, Rarity.SPECIAL, mage.cards.t.ThornscapeBattlemage.class));
        cards.add(new SetCardInfo("Tormod's Crypt", 115, Rarity.COMMON, mage.cards.t.TormodsCrypt.class));
        cards.add(new SetCardInfo("Tribal Flames", 70, Rarity.COMMON, mage.cards.t.TribalFlames.class));
        cards.add(new SetCardInfo("Twisted Abomination", 50, Rarity.COMMON, mage.cards.t.TwistedAbomination.class));
        cards.add(new SetCardInfo("Uncle Istvan", 51, Rarity.SPECIAL, mage.cards.u.UncleIstvan.class));
        cards.add(new SetCardInfo("Undead Warchief", 52, Rarity.UNCOMMON, mage.cards.u.UndeadWarchief.class));
        cards.add(new SetCardInfo("Undertaker", 53, Rarity.SPECIAL, mage.cards.u.Undertaker.class));
        cards.add(new SetCardInfo("Unstable Mutation", 33, Rarity.SPECIAL, mage.cards.u.UnstableMutation.class));
        cards.add(new SetCardInfo("Uthden Troll", 71, Rarity.SPECIAL, mage.cards.u.UthdenTroll.class));
        cards.add(new SetCardInfo("Valor", 16, Rarity.SPECIAL, mage.cards.v.Valor.class));
        cards.add(new SetCardInfo("Verdeloth the Ancient", 88, Rarity.SPECIAL, mage.cards.v.VerdelothTheAncient.class));
        cards.add(new SetCardInfo("Vhati il-Dal", 104, Rarity.SPECIAL, mage.cards.v.VhatiIlDal.class));
        cards.add(new SetCardInfo("Void", 105, Rarity.SPECIAL, mage.cards.v.Void.class));
        cards.add(new SetCardInfo("Voidmage Prodigy", 34, Rarity.SPECIAL, mage.cards.v.VoidmageProdigy.class));
        cards.add(new SetCardInfo("Wall of Roots", 89, Rarity.COMMON, mage.cards.w.WallOfRoots.class));
        cards.add(new SetCardInfo("Whirling Dervish", 90, Rarity.COMMON, mage.cards.w.WhirlingDervish.class));
        cards.add(new SetCardInfo("Whispers of the Muse", 35, Rarity.SPECIAL, mage.cards.w.WhispersOfTheMuse.class));
        cards.add(new SetCardInfo("Wildfire Emissary", 72, Rarity.SPECIAL, mage.cards.w.WildfireEmissary.class));
        cards.add(new SetCardInfo("Willbender", 36, Rarity.SPECIAL, mage.cards.w.Willbender.class));
        cards.add(new SetCardInfo("Witch Hunter", 17, Rarity.SPECIAL, mage.cards.w.WitchHunter.class));
        cards.add(new SetCardInfo("Withered Wretch", 54, Rarity.RARE, mage.cards.w.WitheredWretch.class));
        cards.add(new SetCardInfo("Zhalfirin Commander", 18, Rarity.COMMON, mage.cards.z.ZhalfirinCommander.class));
    }
}
