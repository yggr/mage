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

import mage.cards.e.ErtaiTheCorrupted;
import mage.cards.s.SkyshipWeatherlight;
import mage.cards.t.TahngarthTalruumHero;
import mage.constants.SetType;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.cards.CardGraphicInfo;

/**
 *
 * @author North
 */
public class Planeshift extends ExpansionSet {

    private static final Planeshift fINSTANCE = new Planeshift();

    public static Planeshift getInstance() {
        return fINSTANCE;
    }

    private Planeshift() {
        super("Planeshift", "PLS", ExpansionSet.buildDate(2001, 1, 5), SetType.EXPANSION);
        this.blockName = "Invasion";
        this.parentSet = Invasion.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Allied Strategies", 20, Rarity.UNCOMMON, mage.cards.a.AlliedStrategies.class));
        cards.add(new SetCardInfo("Alpha Kavu", 77, Rarity.UNCOMMON, mage.cards.a.AlphaKavu.class));
        cards.add(new SetCardInfo("Ancient Spider", 96, Rarity.RARE, mage.cards.a.AncientSpider.class));
        cards.add(new SetCardInfo("Arctic Merfolk", 21, Rarity.COMMON, mage.cards.a.ArcticMerfolk.class));
        cards.add(new SetCardInfo("Aura Blast", 1, Rarity.COMMON, mage.cards.a.AuraBlast.class));
        cards.add(new SetCardInfo("Aurora Griffin", 2, Rarity.COMMON, mage.cards.a.AuroraGriffin.class));
        cards.add(new SetCardInfo("Bog Down", 39, Rarity.COMMON, mage.cards.b.BogDown.class));
        cards.add(new SetCardInfo("Caldera Kavu", 58, Rarity.COMMON, mage.cards.c.CalderaKavu.class));
        cards.add(new SetCardInfo("Cavern Harpy", 97, Rarity.COMMON, mage.cards.c.CavernHarpy.class));
        cards.add(new SetCardInfo("Cloud Cover", 98, Rarity.RARE, mage.cards.c.CloudCover.class));
        cards.add(new SetCardInfo("Confound", 22, Rarity.COMMON, mage.cards.c.Confound.class));
        cards.add(new SetCardInfo("Crosis's Catacombs", 136, Rarity.UNCOMMON, mage.cards.c.CrosissCatacombs.class));
        cards.add(new SetCardInfo("Crosis's Charm", 99, Rarity.UNCOMMON, mage.cards.c.CrosissCharm.class));
        cards.add(new SetCardInfo("Darigaaz's Caldera", 137, Rarity.UNCOMMON, mage.cards.d.DarigaazsCaldera.class));
        cards.add(new SetCardInfo("Darigaaz's Charm", 100, Rarity.UNCOMMON, mage.cards.d.DarigaazsCharm.class));
        cards.add(new SetCardInfo("Daring Leap", 101, Rarity.COMMON, mage.cards.d.DaringLeap.class));
        cards.add(new SetCardInfo("Deadapult", 59, Rarity.RARE, mage.cards.d.Deadapult.class));
        cards.add(new SetCardInfo("Death Bomb", 41, Rarity.COMMON, mage.cards.d.DeathBomb.class));
        cards.add(new SetCardInfo("Destructive Flow", 102, Rarity.RARE, mage.cards.d.DestructiveFlow.class));
        cards.add(new SetCardInfo("Diabolic Intent", 42, Rarity.RARE, mage.cards.d.DiabolicIntent.class));
        cards.add(new SetCardInfo("Disciple of Kangee", 3, Rarity.COMMON, mage.cards.d.DiscipleOfKangee.class));
        cards.add(new SetCardInfo("Doomsday Specter", 103, Rarity.RARE, mage.cards.d.DoomsdaySpecter.class));
        cards.add(new SetCardInfo("Draco", 131, Rarity.RARE, mage.cards.d.Draco.class));
        cards.add(new SetCardInfo("Dralnu's Pet", 23, Rarity.RARE, mage.cards.d.DralnusPet.class));
        cards.add(new SetCardInfo("Dromar's Cavern", 138, Rarity.UNCOMMON, mage.cards.d.DromarsCavern.class));
        cards.add(new SetCardInfo("Dromar's Charm", 105, Rarity.UNCOMMON, mage.cards.d.DromarsCharm.class));
        cards.add(new SetCardInfo("Eladamri's Call", 106, Rarity.RARE, mage.cards.e.EladamrisCall.class));
        cards.add(new SetCardInfo("Ertai's Trickery", 24, Rarity.UNCOMMON, mage.cards.e.ErtaisTrickery.class));
        cards.add(new SetCardInfo("Ertai, the Corrupted", "107a", Rarity.RARE, ErtaiTheCorrupted.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Ertai, the Corrupted", "107b", Rarity.RARE, ErtaiTheCorrupted.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Escape Routes", 25, Rarity.COMMON, mage.cards.e.EscapeRoutes.class));
        cards.add(new SetCardInfo("Exotic Disease", 43, Rarity.UNCOMMON, mage.cards.e.ExoticDisease.class));
        cards.add(new SetCardInfo("Falling Timber", 79, Rarity.COMMON, mage.cards.f.FallingTimber.class));
        cards.add(new SetCardInfo("Flametongue Kavu", 60, Rarity.UNCOMMON, mage.cards.f.FlametongueKavu.class));
        cards.add(new SetCardInfo("Fleetfoot Panther", 108, Rarity.UNCOMMON, mage.cards.f.FleetfootPanther.class));
        cards.add(new SetCardInfo("Forsaken City", 139, Rarity.RARE, mage.cards.f.ForsakenCity.class));
        cards.add(new SetCardInfo("Gaea's Herald", 80, Rarity.RARE, mage.cards.g.GaeasHerald.class));
        cards.add(new SetCardInfo("Gaea's Might", 81, Rarity.COMMON, mage.cards.g.GaeasMight.class));
        cards.add(new SetCardInfo("Gainsay", 26, Rarity.UNCOMMON, mage.cards.g.Gainsay.class));
        cards.add(new SetCardInfo("Gerrard's Command", 109, Rarity.COMMON, mage.cards.g.GerrardsCommand.class));
        cards.add(new SetCardInfo("Hobble", 7, Rarity.COMMON, mage.cards.h.Hobble.class));
        cards.add(new SetCardInfo("Honorable Scout", 8, Rarity.COMMON, mage.cards.h.HonorableScout.class));
        cards.add(new SetCardInfo("Horned Kavu", 110, Rarity.COMMON, mage.cards.h.HornedKavu.class));
        cards.add(new SetCardInfo("Hull Breach", 111, Rarity.COMMON, mage.cards.h.HullBreach.class));
        cards.add(new SetCardInfo("Hunting Drake", 27, Rarity.COMMON, mage.cards.h.HuntingDrake.class));
        cards.add(new SetCardInfo("Implode", 62, Rarity.UNCOMMON, mage.cards.i.Implode.class));
        cards.add(new SetCardInfo("Insolence", 63, Rarity.COMMON, mage.cards.i.Insolence.class));
        cards.add(new SetCardInfo("Kavu Recluse", 64, Rarity.COMMON, mage.cards.k.KavuRecluse.class));
        cards.add(new SetCardInfo("Keldon Mantle", 65, Rarity.COMMON, mage.cards.k.KeldonMantle.class));
        cards.add(new SetCardInfo("Lashknife Barrier", 9, Rarity.UNCOMMON, mage.cards.l.LashknifeBarrier.class));
        cards.add(new SetCardInfo("Lava Zombie", 113, Rarity.COMMON, mage.cards.l.LavaZombie.class));
        cards.add(new SetCardInfo("Lord of the Undead", 44, Rarity.RARE, mage.cards.l.LordOfTheUndead.class));
        cards.add(new SetCardInfo("Maggot Carrier", 45, Rarity.COMMON, mage.cards.m.MaggotCarrier.class));
        cards.add(new SetCardInfo("Magma Burst", 66, Rarity.COMMON, mage.cards.m.MagmaBurst.class));
        cards.add(new SetCardInfo("Magnigoth Treefolk", 82, Rarity.RARE, mage.cards.m.MagnigothTreefolk.class));
        cards.add(new SetCardInfo("Malicious Advice", 114, Rarity.COMMON, mage.cards.m.MaliciousAdvice.class));
        cards.add(new SetCardInfo("Mana Cylix", 132, Rarity.UNCOMMON, mage.cards.m.ManaCylix.class));
        cards.add(new SetCardInfo("March of Souls", 10, Rarity.RARE, mage.cards.m.MarchOfSouls.class));
        cards.add(new SetCardInfo("Marsh Crocodile", 115, Rarity.UNCOMMON, mage.cards.m.MarshCrocodile.class));
        cards.add(new SetCardInfo("Meddling Mage", 116, Rarity.RARE, mage.cards.m.MeddlingMage.class));
        cards.add(new SetCardInfo("Meteor Crater", 140, Rarity.RARE, mage.cards.m.MeteorCrater.class));
        cards.add(new SetCardInfo("Mire Kavu", 67, Rarity.COMMON, mage.cards.m.MireKavu.class));
        cards.add(new SetCardInfo("Mogg Jailer", 68, Rarity.UNCOMMON, mage.cards.m.MoggJailer.class));
        cards.add(new SetCardInfo("Mogg Sentry", 69, Rarity.RARE, mage.cards.m.MoggSentry.class));
        cards.add(new SetCardInfo("Morgue Toad", 46, Rarity.COMMON, mage.cards.m.MorgueToad.class));
        cards.add(new SetCardInfo("Multani's Harmony", 84, Rarity.UNCOMMON, mage.cards.m.MultanisHarmony.class));
        cards.add(new SetCardInfo("Natural Emergence", 117, Rarity.RARE, mage.cards.n.NaturalEmergence.class));
        cards.add(new SetCardInfo("Nemata, Grove Guardian", 85, Rarity.RARE, mage.cards.n.NemataGroveGuardian.class));
        cards.add(new SetCardInfo("Nightscape Battlemage", 47, Rarity.UNCOMMON, mage.cards.n.NightscapeBattlemage.class));
        cards.add(new SetCardInfo("Nightscape Familiar", 48, Rarity.COMMON, mage.cards.n.NightscapeFamiliar.class));
        cards.add(new SetCardInfo("Orim's Chant", 11, Rarity.RARE, mage.cards.o.OrimsChant.class));
        cards.add(new SetCardInfo("Phyrexian Bloodstock", 50, Rarity.COMMON, mage.cards.p.PhyrexianBloodstock.class));
        cards.add(new SetCardInfo("Phyrexian Scuta", 51, Rarity.RARE, mage.cards.p.PhyrexianScuta.class));
        cards.add(new SetCardInfo("Phyrexian Tyranny", 118, Rarity.RARE, mage.cards.p.PhyrexianTyranny.class));
        cards.add(new SetCardInfo("Planeswalker's Favor", 86, Rarity.RARE, mage.cards.p.PlaneswalkersFavor.class));
        cards.add(new SetCardInfo("Planeswalker's Fury", 70, Rarity.RARE, mage.cards.p.PlaneswalkersFury.class));
        cards.add(new SetCardInfo("Planeswalker's Mirth", 12, Rarity.RARE, mage.cards.p.PlaneswalkersMirth.class));
        cards.add(new SetCardInfo("Planeswalker's Scorn", 52, Rarity.RARE, mage.cards.p.PlaneswalkersScorn.class));
        cards.add(new SetCardInfo("Pollen Remedy", 13, Rarity.COMMON, mage.cards.p.PollenRemedy.class));
        cards.add(new SetCardInfo("Primal Growth", 87, Rarity.COMMON, mage.cards.p.PrimalGrowth.class));
        cards.add(new SetCardInfo("Pygmy Kavu", 88, Rarity.COMMON, mage.cards.p.PygmyKavu.class));
        cards.add(new SetCardInfo("Questing Phelddagrif", 119, Rarity.RARE, mage.cards.q.QuestingPhelddagrif.class));
        cards.add(new SetCardInfo("Quirion Dryad", 89, Rarity.RARE, mage.cards.q.QuirionDryad.class));
        cards.add(new SetCardInfo("Quirion Explorer", 90, Rarity.COMMON, mage.cards.q.QuirionExplorer.class));
        cards.add(new SetCardInfo("Radiant Kavu", 120, Rarity.RARE, mage.cards.r.RadiantKavu.class));
        cards.add(new SetCardInfo("Razing Snidd", 121, Rarity.UNCOMMON, mage.cards.r.RazingSnidd.class));
        cards.add(new SetCardInfo("Rith's Charm", 122, Rarity.UNCOMMON, mage.cards.r.RithsCharm.class));
        cards.add(new SetCardInfo("Rith's Grove", 141, Rarity.UNCOMMON, mage.cards.r.RithsGrove.class));
        cards.add(new SetCardInfo("Root Greevil", 91, Rarity.COMMON, mage.cards.r.RootGreevil.class));
        cards.add(new SetCardInfo("Rushing River", 30, Rarity.COMMON, mage.cards.r.RushingRiver.class));
        cards.add(new SetCardInfo("Samite Elder", 14, Rarity.RARE, mage.cards.s.SamiteElder.class));
        cards.add(new SetCardInfo("Samite Pilgrim", 15, Rarity.COMMON, mage.cards.s.SamitePilgrim.class));
        cards.add(new SetCardInfo("Sawtooth Loon", 123, Rarity.UNCOMMON, mage.cards.s.SawtoothLoon.class));
        cards.add(new SetCardInfo("Sea Snidd", 31, Rarity.COMMON, mage.cards.s.SeaSnidd.class));
        cards.add(new SetCardInfo("Shifting Sky", 32, Rarity.UNCOMMON, mage.cards.s.ShiftingSky.class));
        cards.add(new SetCardInfo("Shivan Wurm", 124, Rarity.RARE, mage.cards.s.ShivanWurm.class));
        cards.add(new SetCardInfo("Shriek of Dread", 53, Rarity.COMMON, mage.cards.s.ShriekOfDread.class));
        cards.add(new SetCardInfo("Silver Drake", 125, Rarity.COMMON, mage.cards.s.SilverDrake.class));
        cards.add(new SetCardInfo("Singe", 71, Rarity.COMMON, mage.cards.s.Singe.class));
        cards.add(new SetCardInfo("Sinister Strength", 54, Rarity.COMMON, mage.cards.s.SinisterStrength.class));
        cards.add(new SetCardInfo("Sisay's Ingenuity", 33, Rarity.COMMON, mage.cards.s.SisaysIngenuity.class));
        cards.add(new SetCardInfo("Skyship Weatherlight", "133a", Rarity.RARE, SkyshipWeatherlight.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Skyship Weatherlight", "133b", Rarity.RARE, SkyshipWeatherlight.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Skyshroud Blessing", 92, Rarity.UNCOMMON, mage.cards.s.SkyshroudBlessing.class));
        cards.add(new SetCardInfo("Slay", 55, Rarity.UNCOMMON, mage.cards.s.Slay.class));
        cards.add(new SetCardInfo("Sleeping Potion", 34, Rarity.COMMON, mage.cards.s.SleepingPotion.class));
        cards.add(new SetCardInfo("Slingshot Goblin", 72, Rarity.COMMON, mage.cards.s.SlingshotGoblin.class));
        cards.add(new SetCardInfo("Sparkcaster", 126, Rarity.UNCOMMON, mage.cards.s.Sparkcaster.class));
        cards.add(new SetCardInfo("Star Compass", 134, Rarity.UNCOMMON, mage.cards.s.StarCompass.class));
        cards.add(new SetCardInfo("Steel Leaf Paladin", 127, Rarity.COMMON, mage.cards.s.SteelLeafPaladin.class));
        cards.add(new SetCardInfo("Stone Kavu", 93, Rarity.COMMON, mage.cards.s.StoneKavu.class));
        cards.add(new SetCardInfo("Stormscape Battlemage", 35, Rarity.UNCOMMON, mage.cards.s.StormscapeBattlemage.class));
        cards.add(new SetCardInfo("Stormscape Familiar", 36, Rarity.COMMON, mage.cards.s.StormscapeFamiliar.class));
        cards.add(new SetCardInfo("Strafe", 73, Rarity.UNCOMMON, mage.cards.s.Strafe.class));
        cards.add(new SetCardInfo("Stratadon", 135, Rarity.UNCOMMON, mage.cards.s.Stratadon.class));
        cards.add(new SetCardInfo("Sunken Hope", 37, Rarity.RARE, mage.cards.s.SunkenHope.class));
        cards.add(new SetCardInfo("Sunscape Battlemage", 16, Rarity.UNCOMMON, mage.cards.s.SunscapeBattlemage.class));
        cards.add(new SetCardInfo("Sunscape Familiar", 17, Rarity.COMMON, mage.cards.s.SunscapeFamiliar.class));
        cards.add(new SetCardInfo("Tahngarth, Talruum Hero", "74a", Rarity.RARE, TahngarthTalruumHero.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Tahngarth, Talruum Hero", "74b", Rarity.RARE, TahngarthTalruumHero.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Terminal Moraine", 142, Rarity.UNCOMMON, mage.cards.t.TerminalMoraine.class));
        cards.add(new SetCardInfo("Terminate", 128, Rarity.COMMON, mage.cards.t.Terminate.class));
        cards.add(new SetCardInfo("Thornscape Battlemage", 94, Rarity.UNCOMMON, mage.cards.t.ThornscapeBattlemage.class));
        cards.add(new SetCardInfo("Thornscape Familiar", 95, Rarity.COMMON, mage.cards.t.ThornscapeFamiliar.class));
        cards.add(new SetCardInfo("Thunderscape Battlemage", 75, Rarity.UNCOMMON, mage.cards.t.ThunderscapeBattlemage.class));
        cards.add(new SetCardInfo("Thunderscape Familiar", 76, Rarity.COMMON, mage.cards.t.ThunderscapeFamiliar.class));
        cards.add(new SetCardInfo("Treva's Charm", 129, Rarity.UNCOMMON, mage.cards.t.TrevasCharm.class));
        cards.add(new SetCardInfo("Treva's Ruins", 143, Rarity.UNCOMMON, mage.cards.t.TrevasRuins.class));
        cards.add(new SetCardInfo("Urza's Guilt", 130, Rarity.RARE, mage.cards.u.UrzasGuilt.class));
        cards.add(new SetCardInfo("Voice of All", 19, Rarity.UNCOMMON, mage.cards.v.VoiceOfAll.class));
        cards.add(new SetCardInfo("Volcano Imp", 56, Rarity.COMMON, mage.cards.v.VolcanoImp.class));
        cards.add(new SetCardInfo("Warped Devotion", 57, Rarity.UNCOMMON, mage.cards.w.WarpedDevotion.class));
        cards.add(new SetCardInfo("Waterspout Elemental", 38, Rarity.RARE, mage.cards.w.WaterspoutElemental.class));
    }
}