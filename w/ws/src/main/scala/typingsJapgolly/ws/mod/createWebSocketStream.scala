package typingsJapgolly.ws.mod

import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.DuplexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ws", "createWebSocketStream")
@js.native
object createWebSocketStream extends js.Object {
  // WebSocket stream
  def apply(websocket: WebSocket, options: DuplexOptions): Duplex = js.native
}

