package typingsJapgolly.youtubePlayer

import typingsJapgolly.youtubePlayer.playerStatesMod.PlayerStates.ENDED
import typingsJapgolly.youtubePlayer.playerStatesMod.PlayerStates.PAUSED
import typingsJapgolly.youtubePlayer.youtubePlayerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcceptableStates extends js.Object {
  var acceptableStates: js.Tuple2[ENDED, PAUSED]
  var stateChangeRequired: `false`
}

object AnonAcceptableStates {
  @scala.inline
  def apply(acceptableStates: js.Tuple2[ENDED, PAUSED], stateChangeRequired: `false`): AnonAcceptableStates = {
    val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAcceptableStates]
  }
}

