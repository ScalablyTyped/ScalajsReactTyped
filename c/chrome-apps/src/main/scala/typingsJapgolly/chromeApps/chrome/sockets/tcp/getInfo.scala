package typingsJapgolly.chromeApps.chrome.sockets.tcp

import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.chromeApps.chrome.sockets.SocketInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcp.getInfo")
@js.native
object getInfo extends js.Object {
  /**
    * Retrieves the state of the given socket.
    * @param socketId The socket identifier.
    * @param callback Called when the socket state is available. Provides an object containing the socket information.
    */
  def apply(socketId: integer, callback: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit = js.native
}

