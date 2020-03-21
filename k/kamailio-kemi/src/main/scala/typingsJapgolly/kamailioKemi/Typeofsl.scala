package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsl extends js.Object {
  def send_reply(code: Double, reason: String): Double
  def sl_forward_reply(code: String, reason: String): Double
  def sl_reply_error(): Double
  def sl_send_reply(code: Double, reason: String): Double
}

object Typeofsl {
  @scala.inline
  def apply(
    send_reply: (Double, String) => CallbackTo[Double],
    sl_forward_reply: (String, String) => CallbackTo[Double],
    sl_reply_error: CallbackTo[Double],
    sl_send_reply: (Double, String) => CallbackTo[Double]
  ): Typeofsl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("send_reply")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => send_reply(t0, t1).runNow()))
    __obj.updateDynamic("sl_forward_reply")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sl_forward_reply(t0, t1).runNow()))
    __obj.updateDynamic("sl_reply_error")(sl_reply_error.toJsFn)
    __obj.updateDynamic("sl_send_reply")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => sl_send_reply(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofsl]
  }
}

