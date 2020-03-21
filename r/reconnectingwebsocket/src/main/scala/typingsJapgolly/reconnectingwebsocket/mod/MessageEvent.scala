package typingsJapgolly.reconnectingwebsocket.mod

import typingsJapgolly.reconnectingwebsocket.reconnectingwebsocketStrings.message
import typingsJapgolly.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageEvent
  extends CustomEvent[js.Any] {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: reconnectingwebsocket.reconnectingwebsocket.GlobalMessageEvent['data'] */ js.Any = js.native
  @JSName("type")
  var type_MessageEvent: message = js.native
}

