package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsca extends js.Object {
  def call_info_update(update_mask: Double, uri_to: String, uri_from: String): Double
  def call_info_update_default(): Double
  def call_info_update_mask(umask: Double): Double
  def call_info_update_turi(umask: Double, sto: String): Double
  def handle_subscribe(): Double
}

object Typeofsca {
  @scala.inline
  def apply(
    call_info_update: (Double, String, String) => CallbackTo[Double],
    call_info_update_default: CallbackTo[Double],
    call_info_update_mask: Double => CallbackTo[Double],
    call_info_update_turi: (Double, String) => CallbackTo[Double],
    handle_subscribe: CallbackTo[Double]
  ): Typeofsca = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("call_info_update")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: java.lang.String) => call_info_update(t0, t1, t2).runNow()))
    __obj.updateDynamic("call_info_update_default")(call_info_update_default.toJsFn)
    __obj.updateDynamic("call_info_update_mask")(js.Any.fromFunction1((t0: scala.Double) => call_info_update_mask(t0).runNow()))
    __obj.updateDynamic("call_info_update_turi")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => call_info_update_turi(t0, t1).runNow()))
    __obj.updateDynamic("handle_subscribe")(handle_subscribe.toJsFn)
    __obj.asInstanceOf[Typeofsca]
  }
}

