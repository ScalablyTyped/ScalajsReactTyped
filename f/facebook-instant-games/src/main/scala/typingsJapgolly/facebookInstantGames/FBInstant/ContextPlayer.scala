package typingsJapgolly.facebookInstantGames.FBInstant

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents information about a player who is in the context that the current player is playing in.
  */
trait ContextPlayer extends js.Object {
  /**
    * Get the id of the context player.
    *
    * @returns The ID of the context player
    */
  def getID(): String
  /**
    * Get the player's localized display name.
    *
    * @returns The player's localized display name.
    */
  def getName(): String | Null
  /**
    * Get the player's public profile photo.
    *
    * @returns A url to the player's public profile photo
    */
  def getPhoto(): String | Null
}

object ContextPlayer {
  @scala.inline
  def apply(getID: CallbackTo[String], getName: CallbackTo[String | Null], getPhoto: CallbackTo[String | Null]): ContextPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getID")(getID.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getPhoto")(getPhoto.toJsFn)
    __obj.asInstanceOf[ContextPlayer]
  }
}

