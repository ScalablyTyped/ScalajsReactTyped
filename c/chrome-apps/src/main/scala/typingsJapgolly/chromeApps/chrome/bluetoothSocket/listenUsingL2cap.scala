package typingsJapgolly.chromeApps.chrome.bluetoothSocket

import typingsJapgolly.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothSocket.listenUsingL2cap")
@js.native
object listenUsingL2cap extends js.Object {
  /**
    * Listen for connections using the L2CAP protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param callback Called when listen operation completes.
    */
  def apply(socketId: integer, uuid: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Listen for connections using the L2CAP protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param options Optional additional options for the service.
    * @param callback Called when listen operation completes.
    */
  def apply(socketId: integer, uuid: String, options: ListenOptions, callback: js.Function0[Unit]): Unit = js.native
}

