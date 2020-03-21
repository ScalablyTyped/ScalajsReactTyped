package typingsJapgolly.reconnectingwebsocket.mod

import typingsJapgolly.reconnectingwebsocket.reconnectingwebsocketStrings.close
import typingsJapgolly.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseEvent
  extends CustomEvent[js.Any] {
  @JSName("type")
  var type_CloseEvent: close = js.native
}

