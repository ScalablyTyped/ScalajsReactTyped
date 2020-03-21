package typingsJapgolly.web3CoreHelpers.mod

import typingsJapgolly.node.netMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core-helpers", "IpcProviderBase")
@js.native
class IpcProviderBase protected () extends js.Object {
  def this(path: String, net: Server) = this()
  var connected: Boolean = js.native
  var connection: js.Any = js.native
  var notificationCallbacks: js.Any = js.native
  var responseCallbacks: js.Any = js.native
  def addDefaultEvents(): Unit = js.native
  def on(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  def once(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  def reconnect(): Unit = js.native
  def removeAllListeners(`type`: String): Unit = js.native
  def removeListener(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  def reset(): Unit = js.native
  def send(
    payload: JsonRpcPayload,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit = js.native
  def supportsSubscriptions(): Boolean = js.native
}

