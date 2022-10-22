package typingsJapgolly.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Participant extends StObject {
  
  var championId: Double
  
  var highestAchievedSeasonTier: String
  
  var masteries: js.Array[Mastery]
  
  var participantId: Double
  
  var runes: js.Array[Rune]
  
  var spell1Id: Double
  
  var spell2Id: Double
  
  var stats: ParticipantStats
  
  var teamId: Double
  
  var timeline: ParticipantTimeline
}
object Participant {
  
  inline def apply(
    championId: Double,
    highestAchievedSeasonTier: String,
    masteries: js.Array[Mastery],
    participantId: Double,
    runes: js.Array[Rune],
    spell1Id: Double,
    spell2Id: Double,
    stats: ParticipantStats,
    teamId: Double,
    timeline: ParticipantTimeline
  ): Participant = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], highestAchievedSeasonTier = highestAchievedSeasonTier.asInstanceOf[js.Any], masteries = masteries.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], runes = runes.asInstanceOf[js.Any], spell1Id = spell1Id.asInstanceOf[js.Any], spell2Id = spell2Id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Participant]
  }
  
  extension [Self <: Participant](x: Self) {
    
    inline def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
    
    inline def setHighestAchievedSeasonTier(value: String): Self = StObject.set(x, "highestAchievedSeasonTier", value.asInstanceOf[js.Any])
    
    inline def setMasteries(value: js.Array[Mastery]): Self = StObject.set(x, "masteries", value.asInstanceOf[js.Any])
    
    inline def setMasteriesVarargs(value: Mastery*): Self = StObject.set(x, "masteries", js.Array(value*))
    
    inline def setParticipantId(value: Double): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setRunes(value: js.Array[Rune]): Self = StObject.set(x, "runes", value.asInstanceOf[js.Any])
    
    inline def setRunesVarargs(value: Rune*): Self = StObject.set(x, "runes", js.Array(value*))
    
    inline def setSpell1Id(value: Double): Self = StObject.set(x, "spell1Id", value.asInstanceOf[js.Any])
    
    inline def setSpell2Id(value: Double): Self = StObject.set(x, "spell2Id", value.asInstanceOf[js.Any])
    
    inline def setStats(value: ParticipantStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTimeline(value: ParticipantTimeline): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
  }
}
