package typingsJapgolly.subscriptionsTransportWs.clientMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  def applyMiddleware(options: OperationOptions, next: js.Function): Unit
}

object Middleware {
  @scala.inline
  def apply(applyMiddleware: (OperationOptions, js.Function) => Callback): Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyMiddleware")(js.Any.fromFunction2((t0: typingsJapgolly.subscriptionsTransportWs.clientMod.OperationOptions, t1: js.Function) => applyMiddleware(t0, t1).runNow()))
    __obj.asInstanceOf[Middleware]
  }
}

