package typingsJapgolly.reconnectingwebsocket.mod

import typingsJapgolly.reconnectingwebsocket.reconnectingwebsocketStrings.connecting
import typingsJapgolly.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectingEvent
  extends CustomEvent[js.Any] {
  var code: Double = js.native
  var reason: String = js.native
  @JSName("type")
  var type_ConnectingEvent: connecting = js.native
  var wasClean: Boolean = js.native
}

