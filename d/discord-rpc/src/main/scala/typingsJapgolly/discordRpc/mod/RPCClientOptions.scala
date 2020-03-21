package typingsJapgolly.discordRpc.mod

import typingsJapgolly.discordRpc.discordRpcStrings.ipc
import typingsJapgolly.discordRpc.discordRpcStrings.websocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCClientOptions extends js.Object {
  var transport: ipc | websocket
}

object RPCClientOptions {
  @scala.inline
  def apply(transport: ipc | websocket): RPCClientOptions = {
    val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RPCClientOptions]
  }
}

