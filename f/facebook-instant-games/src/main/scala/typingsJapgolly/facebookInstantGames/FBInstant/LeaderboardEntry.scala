package typingsJapgolly.facebookInstantGames.FBInstant

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A score entry for an Instant Game leaderboard
  */
trait LeaderboardEntry extends js.Object {
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
  @scala.inline
  def apply(
    getExtraData: CallbackTo[String | Null],
    getFormattedScore: CallbackTo[String],
    getPlayer: CallbackTo[LeaderboardPlayer],
    getRank: CallbackTo[Double],
    getScore: CallbackTo[Double],
    getTimestamp: CallbackTo[Double]
  ): LeaderboardEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getExtraData")(getExtraData.toJsFn)
    __obj.updateDynamic("getFormattedScore")(getFormattedScore.toJsFn)
    __obj.updateDynamic("getPlayer")(getPlayer.toJsFn)
    __obj.updateDynamic("getRank")(getRank.toJsFn)
    __obj.updateDynamic("getScore")(getScore.toJsFn)
    __obj.updateDynamic("getTimestamp")(getTimestamp.toJsFn)
    __obj.asInstanceOf[LeaderboardEntry]
  }
}

