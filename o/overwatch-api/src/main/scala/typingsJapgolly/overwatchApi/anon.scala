package typingsJapgolly.overwatchApi

import typingsJapgolly.overwatchApi.mod.Endorsement
import typingsJapgolly.overwatchApi.mod.HeroAccuracy
import typingsJapgolly.overwatchApi.mod.HeroElimsPerLife
import typingsJapgolly.overwatchApi.mod.HeroMultiKillBest
import typingsJapgolly.overwatchApi.mod.HeroObjectiveKillsAverage
import typingsJapgolly.overwatchApi.mod.HeroPlaytime
import typingsJapgolly.overwatchApi.mod.HeroWinRate
import typingsJapgolly.overwatchApi.mod.HeroWins
import typingsJapgolly.overwatchApi.mod.QuickplayCompetitiveStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Assists extends StObject {
    
    var assists: QuickplayCompetitiveStats
    
    var average: QuickplayCompetitiveStats
    
    var best: QuickplayCompetitiveStats
    
    var combat: QuickplayCompetitiveStats
    
    var game: QuickplayCompetitiveStats
    
    var match_awards: QuickplayCompetitiveStats
    
    var miscellaneous: QuickplayCompetitiveStats
    
    var top_heroes: CompetitiveQuickplay
  }
  object Assists {
    
    inline def apply(
      assists: QuickplayCompetitiveStats,
      average: QuickplayCompetitiveStats,
      best: QuickplayCompetitiveStats,
      combat: QuickplayCompetitiveStats,
      game: QuickplayCompetitiveStats,
      match_awards: QuickplayCompetitiveStats,
      miscellaneous: QuickplayCompetitiveStats,
      top_heroes: CompetitiveQuickplay
    ): Assists = {
      val __obj = js.Dynamic.literal(assists = assists.asInstanceOf[js.Any], average = average.asInstanceOf[js.Any], best = best.asInstanceOf[js.Any], combat = combat.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], match_awards = match_awards.asInstanceOf[js.Any], miscellaneous = miscellaneous.asInstanceOf[js.Any], top_heroes = top_heroes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assists]
    }
    
    extension [Self <: Assists](x: Self) {
      
      inline def setAssists(value: QuickplayCompetitiveStats): Self = StObject.set(x, "assists", value.asInstanceOf[js.Any])
      
      inline def setAverage(value: QuickplayCompetitiveStats): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
      
      inline def setBest(value: QuickplayCompetitiveStats): Self = StObject.set(x, "best", value.asInstanceOf[js.Any])
      
      inline def setCombat(value: QuickplayCompetitiveStats): Self = StObject.set(x, "combat", value.asInstanceOf[js.Any])
      
      inline def setGame(value: QuickplayCompetitiveStats): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
      
      inline def setMatch_awards(value: QuickplayCompetitiveStats): Self = StObject.set(x, "match_awards", value.asInstanceOf[js.Any])
      
      inline def setMiscellaneous(value: QuickplayCompetitiveStats): Self = StObject.set(x, "miscellaneous", value.asInstanceOf[js.Any])
      
      inline def setTop_heroes(value: CompetitiveQuickplay): Self = StObject.set(x, "top_heroes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Competitive extends StObject {
    
    var competitive: Draw
    
    var quickplay: Played
  }
  object Competitive {
    
    inline def apply(competitive: Draw, quickplay: Played): Competitive = {
      val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Competitive]
    }
    
    extension [Self <: Competitive](x: Self) {
      
      inline def setCompetitive(value: Draw): Self = StObject.set(x, "competitive", value.asInstanceOf[js.Any])
      
      inline def setQuickplay(value: Played): Self = StObject.set(x, "quickplay", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompetitiveQuickplay extends StObject {
    
    var competitive: Gameswon
    
    var quickplay: Eliminationsperlife
  }
  object CompetitiveQuickplay {
    
    inline def apply(competitive: Gameswon, quickplay: Eliminationsperlife): CompetitiveQuickplay = {
      val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompetitiveQuickplay]
    }
    
    extension [Self <: CompetitiveQuickplay](x: Self) {
      
      inline def setCompetitive(value: Gameswon): Self = StObject.set(x, "competitive", value.asInstanceOf[js.Any])
      
      inline def setQuickplay(value: Eliminationsperlife): Self = StObject.set(x, "quickplay", value.asInstanceOf[js.Any])
    }
  }
  
  trait Damage extends StObject {
    
    var damage: Rank
    
    var support: Rank
    
    var tank: Rank
  }
  object Damage {
    
    inline def apply(damage: Rank, support: Rank, tank: Rank): Damage = {
      val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], tank = tank.asInstanceOf[js.Any])
      __obj.asInstanceOf[Damage]
    }
    
    extension [Self <: Damage](x: Self) {
      
      inline def setDamage(value: Rank): Self = StObject.set(x, "damage", value.asInstanceOf[js.Any])
      
      inline def setSupport(value: Rank): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
      
      inline def setTank(value: Rank): Self = StObject.set(x, "tank", value.asInstanceOf[js.Any])
    }
  }
  
  trait Draw extends StObject {
    
    var draw: Double
    
    var lost: Double
    
    var played: Double
    
    var win_rate: Double
    
    var won: Double
  }
  object Draw {
    
    inline def apply(draw: Double, lost: Double, played: Double, win_rate: Double, won: Double): Draw = {
      val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any], lost = lost.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], win_rate = win_rate.asInstanceOf[js.Any], won = won.asInstanceOf[js.Any])
      __obj.asInstanceOf[Draw]
    }
    
    extension [Self <: Draw](x: Self) {
      
      inline def setDraw(value: Double): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
      
      inline def setLost(value: Double): Self = StObject.set(x, "lost", value.asInstanceOf[js.Any])
      
      inline def setPlayed(value: Double): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      inline def setWin_rate(value: Double): Self = StObject.set(x, "win_rate", value.asInstanceOf[js.Any])
      
      inline def setWon(value: Double): Self = StObject.set(x, "won", value.asInstanceOf[js.Any])
    }
  }
  
  trait Eliminationsperlife extends StObject {
    
    var eliminations_per_life: js.Array[HeroElimsPerLife]
    
    var games_won: js.Array[HeroWins]
    
    var multikill_best: js.Array[HeroMultiKillBest]
    
    var objective_kills_average: js.Array[HeroObjectiveKillsAverage]
    
    var played: js.Array[HeroPlaytime]
    
    var weapon_accuracy: js.Array[HeroAccuracy]
  }
  object Eliminationsperlife {
    
    inline def apply(
      eliminations_per_life: js.Array[HeroElimsPerLife],
      games_won: js.Array[HeroWins],
      multikill_best: js.Array[HeroMultiKillBest],
      objective_kills_average: js.Array[HeroObjectiveKillsAverage],
      played: js.Array[HeroPlaytime],
      weapon_accuracy: js.Array[HeroAccuracy]
    ): Eliminationsperlife = {
      val __obj = js.Dynamic.literal(eliminations_per_life = eliminations_per_life.asInstanceOf[js.Any], games_won = games_won.asInstanceOf[js.Any], multikill_best = multikill_best.asInstanceOf[js.Any], objective_kills_average = objective_kills_average.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], weapon_accuracy = weapon_accuracy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Eliminationsperlife]
    }
    
    extension [Self <: Eliminationsperlife](x: Self) {
      
      inline def setEliminations_per_life(value: js.Array[HeroElimsPerLife]): Self = StObject.set(x, "eliminations_per_life", value.asInstanceOf[js.Any])
      
      inline def setEliminations_per_lifeVarargs(value: HeroElimsPerLife*): Self = StObject.set(x, "eliminations_per_life", js.Array(value*))
      
      inline def setGames_won(value: js.Array[HeroWins]): Self = StObject.set(x, "games_won", value.asInstanceOf[js.Any])
      
      inline def setGames_wonVarargs(value: HeroWins*): Self = StObject.set(x, "games_won", js.Array(value*))
      
      inline def setMultikill_best(value: js.Array[HeroMultiKillBest]): Self = StObject.set(x, "multikill_best", value.asInstanceOf[js.Any])
      
      inline def setMultikill_bestVarargs(value: HeroMultiKillBest*): Self = StObject.set(x, "multikill_best", js.Array(value*))
      
      inline def setObjective_kills_average(value: js.Array[HeroObjectiveKillsAverage]): Self = StObject.set(x, "objective_kills_average", value.asInstanceOf[js.Any])
      
      inline def setObjective_kills_averageVarargs(value: HeroObjectiveKillsAverage*): Self = StObject.set(x, "objective_kills_average", js.Array(value*))
      
      inline def setPlayed(value: js.Array[HeroPlaytime]): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      inline def setPlayedVarargs(value: HeroPlaytime*): Self = StObject.set(x, "played", js.Array(value*))
      
      inline def setWeapon_accuracy(value: js.Array[HeroAccuracy]): Self = StObject.set(x, "weapon_accuracy", value.asInstanceOf[js.Any])
      
      inline def setWeapon_accuracyVarargs(value: HeroAccuracy*): Self = StObject.set(x, "weapon_accuracy", js.Array(value*))
    }
  }
  
  trait Frame extends StObject {
    
    var frame: String
    
    var icon: String
    
    var level: Double
    
    var shotcaller: Endorsement
    
    var sportsmanship: Endorsement
    
    var teammate: Endorsement
  }
  object Frame {
    
    inline def apply(
      frame: String,
      icon: String,
      level: Double,
      shotcaller: Endorsement,
      sportsmanship: Endorsement,
      teammate: Endorsement
    ): Frame = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], shotcaller = shotcaller.asInstanceOf[js.Any], sportsmanship = sportsmanship.asInstanceOf[js.Any], teammate = teammate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frame]
    }
    
    extension [Self <: Frame](x: Self) {
      
      inline def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setShotcaller(value: Endorsement): Self = StObject.set(x, "shotcaller", value.asInstanceOf[js.Any])
      
      inline def setSportsmanship(value: Endorsement): Self = StObject.set(x, "sportsmanship", value.asInstanceOf[js.Any])
      
      inline def setTeammate(value: Endorsement): Self = StObject.set(x, "teammate", value.asInstanceOf[js.Any])
    }
  }
  
  trait Gameswon extends StObject {
    
    var eliminations_per_life: js.Array[HeroElimsPerLife]
    
    var games_won: js.Array[HeroWins]
    
    var multikill_best: js.Array[HeroMultiKillBest]
    
    var objective_kills_average: js.Array[HeroObjectiveKillsAverage]
    
    var played: js.Array[HeroPlaytime]
    
    var weapon_accuracy: js.Array[HeroAccuracy]
    
    var win_rate: js.Array[HeroWinRate]
  }
  object Gameswon {
    
    inline def apply(
      eliminations_per_life: js.Array[HeroElimsPerLife],
      games_won: js.Array[HeroWins],
      multikill_best: js.Array[HeroMultiKillBest],
      objective_kills_average: js.Array[HeroObjectiveKillsAverage],
      played: js.Array[HeroPlaytime],
      weapon_accuracy: js.Array[HeroAccuracy],
      win_rate: js.Array[HeroWinRate]
    ): Gameswon = {
      val __obj = js.Dynamic.literal(eliminations_per_life = eliminations_per_life.asInstanceOf[js.Any], games_won = games_won.asInstanceOf[js.Any], multikill_best = multikill_best.asInstanceOf[js.Any], objective_kills_average = objective_kills_average.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], weapon_accuracy = weapon_accuracy.asInstanceOf[js.Any], win_rate = win_rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gameswon]
    }
    
    extension [Self <: Gameswon](x: Self) {
      
      inline def setEliminations_per_life(value: js.Array[HeroElimsPerLife]): Self = StObject.set(x, "eliminations_per_life", value.asInstanceOf[js.Any])
      
      inline def setEliminations_per_lifeVarargs(value: HeroElimsPerLife*): Self = StObject.set(x, "eliminations_per_life", js.Array(value*))
      
      inline def setGames_won(value: js.Array[HeroWins]): Self = StObject.set(x, "games_won", value.asInstanceOf[js.Any])
      
      inline def setGames_wonVarargs(value: HeroWins*): Self = StObject.set(x, "games_won", js.Array(value*))
      
      inline def setMultikill_best(value: js.Array[HeroMultiKillBest]): Self = StObject.set(x, "multikill_best", value.asInstanceOf[js.Any])
      
      inline def setMultikill_bestVarargs(value: HeroMultiKillBest*): Self = StObject.set(x, "multikill_best", js.Array(value*))
      
      inline def setObjective_kills_average(value: js.Array[HeroObjectiveKillsAverage]): Self = StObject.set(x, "objective_kills_average", value.asInstanceOf[js.Any])
      
      inline def setObjective_kills_averageVarargs(value: HeroObjectiveKillsAverage*): Self = StObject.set(x, "objective_kills_average", js.Array(value*))
      
      inline def setPlayed(value: js.Array[HeroPlaytime]): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      inline def setPlayedVarargs(value: HeroPlaytime*): Self = StObject.set(x, "played", js.Array(value*))
      
      inline def setWeapon_accuracy(value: js.Array[HeroAccuracy]): Self = StObject.set(x, "weapon_accuracy", value.asInstanceOf[js.Any])
      
      inline def setWeapon_accuracyVarargs(value: HeroAccuracy*): Self = StObject.set(x, "weapon_accuracy", js.Array(value*))
      
      inline def setWin_rate(value: js.Array[HeroWinRate]): Self = StObject.set(x, "win_rate", value.asInstanceOf[js.Any])
      
      inline def setWin_rateVarargs(value: HeroWinRate*): Self = StObject.set(x, "win_rate", js.Array(value*))
    }
  }
  
  trait Played extends StObject {
    
    var played: Unit
    
    var won: Double
  }
  object Played {
    
    inline def apply(played: Unit, won: Double): Played = {
      val __obj = js.Dynamic.literal(played = played.asInstanceOf[js.Any], won = won.asInstanceOf[js.Any])
      __obj.asInstanceOf[Played]
    }
    
    extension [Self <: Played](x: Self) {
      
      inline def setPlayed(value: Unit): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      inline def setWon(value: Double): Self = StObject.set(x, "won", value.asInstanceOf[js.Any])
    }
  }
  
  trait Quickplay extends StObject {
    
    var competitive: String
    
    var quickplay: String
  }
  object Quickplay {
    
    inline def apply(competitive: String, quickplay: String): Quickplay = {
      val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Quickplay]
    }
    
    extension [Self <: Quickplay](x: Self) {
      
      inline def setCompetitive(value: String): Self = StObject.set(x, "competitive", value.asInstanceOf[js.Any])
      
      inline def setQuickplay(value: String): Self = StObject.set(x, "quickplay", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rank extends StObject {
    
    var rank: Double
    
    var rank_img: String
  }
  object Rank {
    
    inline def apply(rank: Double, rank_img: String): Rank = {
      val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], rank_img = rank_img.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rank]
    }
    
    extension [Self <: Rank](x: Self) {
      
      inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      inline def setRank_img(value: String): Self = StObject.set(x, "rank_img", value.asInstanceOf[js.Any])
    }
  }
}
