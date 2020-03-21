package typingsJapgolly.facebookInstantGames.FBInstant

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the player associated with a score entry.
  */
trait LeaderboardPlayer extends js.Object {
  /**
    * Gets the game's unique identifier for the player.
    *
    * @returns The game-scoped identifier for the player.
    */
  def getID(): String | Null
  /**
    * Gets the player's localized display name.
    *
    * @returns The player's localized display name.
    */
  def getName(): String
  /**
    * Returns a url to the player's public profile photo.
    *
    * @returns Url to the player's public profile photo.
    */
  def getPhoto(): String | Null
}

object LeaderboardPlayer {
  @scala.inline
  def apply(getID: CallbackTo[String | Null], getName: CallbackTo[String], getPhoto: CallbackTo[String | Null]): LeaderboardPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getID")(getID.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getPhoto")(getPhoto.toJsFn)
    __obj.asInstanceOf[LeaderboardPlayer]
  }
}

