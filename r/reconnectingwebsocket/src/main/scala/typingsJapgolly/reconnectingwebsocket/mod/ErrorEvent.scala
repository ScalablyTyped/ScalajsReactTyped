package typingsJapgolly.reconnectingwebsocket.mod

import typingsJapgolly.reconnectingwebsocket.reconnectingwebsocketStrings.error
import typingsJapgolly.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorEvent
  extends CustomEvent[js.Any] {
  @JSName("type")
  var type_ErrorEvent: error = js.native
}

