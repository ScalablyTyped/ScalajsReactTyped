package typingsJapgolly.ethereumProtocol.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  def sendAsync(payload: JSONRPCRequestPayload, callback: JSONRPCErrorCallback): scala.Unit
}

object Provider {
  @scala.inline
  def apply(sendAsync: (JSONRPCRequestPayload, JSONRPCErrorCallback) => Callback): Provider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sendAsync")(js.Any.fromFunction2((t0: typingsJapgolly.ethereumProtocol.mod.JSONRPCRequestPayload, t1: typingsJapgolly.ethereumProtocol.mod.JSONRPCErrorCallback) => sendAsync(t0, t1).runNow()))
    __obj.asInstanceOf[Provider]
  }
}

