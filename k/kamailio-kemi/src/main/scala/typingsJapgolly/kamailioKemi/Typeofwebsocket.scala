package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwebsocket extends js.Object {
  def close(): Double
  def close_conid(status: Double, reason: String, con: Double): Double
  def close_reason(status: Double, reason: String): Double
  def handle_handshake(): Double
}

object Typeofwebsocket {
  @scala.inline
  def apply(
    close: CallbackTo[Double],
    close_conid: (Double, String, Double) => CallbackTo[Double],
    close_reason: (Double, String) => CallbackTo[Double],
    handle_handshake: CallbackTo[Double]
  ): Typeofwebsocket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("close_conid")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: scala.Double) => close_conid(t0, t1, t2).runNow()))
    __obj.updateDynamic("close_reason")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => close_reason(t0, t1).runNow()))
    __obj.updateDynamic("handle_handshake")(handle_handshake.toJsFn)
    __obj.asInstanceOf[Typeofwebsocket]
  }
}

