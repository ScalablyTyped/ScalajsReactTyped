package typingsJapgolly.jwplayer.jwplayer

import typingsJapgolly.jwplayer.jwplayerStrings.buffering
import typingsJapgolly.jwplayer.jwplayerStrings.paused
import typingsJapgolly.jwplayer.jwplayerStrings.playing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdleParam extends js.Object {
  var oldstate: buffering | playing | paused
}

object IdleParam {
  @scala.inline
  def apply(oldstate: buffering | playing | paused): IdleParam = {
    val __obj = js.Dynamic.literal(oldstate = oldstate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdleParam]
  }
}

