package typingsJapgolly.jwplayer.jwplayer

import typingsJapgolly.jwplayer.jwplayerStrings.complete
import typingsJapgolly.jwplayer.jwplayerStrings.error
import typingsJapgolly.jwplayer.jwplayerStrings.loading
import typingsJapgolly.jwplayer.jwplayerStrings.stalled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferParam extends js.Object {
  var newstate: String
  var oldstate: String
  var reason: loading | complete | stalled | error
}

object BufferParam {
  @scala.inline
  def apply(newstate: String, oldstate: String, reason: loading | complete | stalled | error): BufferParam = {
    val __obj = js.Dynamic.literal(newstate = newstate.asInstanceOf[js.Any], oldstate = oldstate.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BufferParam]
  }
}

