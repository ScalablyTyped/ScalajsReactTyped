package typingsJapgolly.jwplayer.jwplayer

import typingsJapgolly.jwplayer.jwplayerNumbers.`0`
import typingsJapgolly.jwplayer.jwplayerNumbers.`1`
import typingsJapgolly.jwplayer.jwplayerStrings.buffering
import typingsJapgolly.jwplayer.jwplayerStrings.playing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayParam extends js.Object {
  var oldstate: buffering | playing
  var viewable: `0` | `1`
}

object PlayParam {
  @scala.inline
  def apply(oldstate: buffering | playing, viewable: `0` | `1`): PlayParam = {
    val __obj = js.Dynamic.literal(oldstate = oldstate.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlayParam]
  }
}

