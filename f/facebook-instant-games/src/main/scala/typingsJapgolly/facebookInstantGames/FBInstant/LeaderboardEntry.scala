package typingsJapgolly.facebookInstantGames.FBInstant

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A score entry for an Instant Game leaderboard
  */
trait LeaderboardEntry extends StObject {
  
  /**
    * Gets the developer-specified payload associated with the score, or null if one was not set.
    * @returns An optional developer-specified payload associated with the score.
    */
  def getExtraData(): String | Null
  
  /**
    * Gets the score associated with the entry, formatted with the score format associated with the leaderboard.
    * @returns Returns a formatted score.
    */
  def getFormattedScore(): String
  
  /**
    * Gets information about the player associated with the entry.
    */
  def getPlayer(): LeaderboardPlayer
  
  /**
    * Gets the rank of the player's score in the leaderboard
    * @returns Returns the entry's leaderboard ranking.
    */
  def getRank(): Double
  
  /**
    * Gets the score associated with the entry.
    * @returns Returns an integer score value.
    */
  def getScore(): Double
  
  /**
    * Gets the timestamp of when the leaderboard entry was last updated.
    * @returns Returns a Unix timestamp.
    */
  def getTimestamp(): Double
}
object LeaderboardEntry {
  
  inline def apply(
    getExtraData: CallbackTo[String | Null],
    getFormattedScore: CallbackTo[String],
    getPlayer: CallbackTo[LeaderboardPlayer],
    getRank: CallbackTo[Double],
    getScore: CallbackTo[Double],
    getTimestamp: CallbackTo[Double]
  ): LeaderboardEntry = {
    val __obj = js.Dynamic.literal(getExtraData = getExtraData.toJsFn, getFormattedScore = getFormattedScore.toJsFn, getPlayer = getPlayer.toJsFn, getRank = getRank.toJsFn, getScore = getScore.toJsFn, getTimestamp = getTimestamp.toJsFn)
    __obj.asInstanceOf[LeaderboardEntry]
  }
  
  extension [Self <: LeaderboardEntry](x: Self) {
    
    inline def setGetExtraData(value: CallbackTo[String | Null]): Self = StObject.set(x, "getExtraData", value.toJsFn)
    
    inline def setGetFormattedScore(value: CallbackTo[String]): Self = StObject.set(x, "getFormattedScore", value.toJsFn)
    
    inline def setGetPlayer(value: CallbackTo[LeaderboardPlayer]): Self = StObject.set(x, "getPlayer", value.toJsFn)
    
    inline def setGetRank(value: CallbackTo[Double]): Self = StObject.set(x, "getRank", value.toJsFn)
    
    inline def setGetScore(value: CallbackTo[Double]): Self = StObject.set(x, "getScore", value.toJsFn)
    
    inline def setGetTimestamp(value: CallbackTo[Double]): Self = StObject.set(x, "getTimestamp", value.toJsFn)
  }
}
