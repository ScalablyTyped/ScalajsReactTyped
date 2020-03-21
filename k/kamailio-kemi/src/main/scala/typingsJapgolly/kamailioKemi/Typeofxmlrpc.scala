package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofxmlrpc extends js.Object {
  def dispatch_rpc(): Double
  def xmlrpc_reply(rcode: Double, reason: String): Double
}

object Typeofxmlrpc {
  @scala.inline
  def apply(dispatch_rpc: CallbackTo[Double], xmlrpc_reply: (Double, String) => CallbackTo[Double]): Typeofxmlrpc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch_rpc")(dispatch_rpc.toJsFn)
    __obj.updateDynamic("xmlrpc_reply")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => xmlrpc_reply(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofxmlrpc]
  }
}

