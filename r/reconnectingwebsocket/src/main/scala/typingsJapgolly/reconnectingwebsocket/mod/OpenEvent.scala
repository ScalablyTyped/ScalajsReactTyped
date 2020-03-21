package typingsJapgolly.reconnectingwebsocket.mod

import typingsJapgolly.reconnectingwebsocket.reconnectingwebsocketStrings.open
import typingsJapgolly.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenEvent
  extends CustomEvent[js.Any] {
  var isReconnect: Boolean = js.native
  @JSName("type")
  var type_OpenEvent: open = js.native
}

