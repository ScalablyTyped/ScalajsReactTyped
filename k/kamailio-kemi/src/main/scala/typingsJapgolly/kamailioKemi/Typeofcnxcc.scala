package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcnxcc extends js.Object {
  def get_channel_count(sclient: String, pvname: String): Double
  def set_max_channels(sclient: String, max_chan: Double): Double
  def set_max_credit(sclient: String, scredit: String, scps: String, initp: Double, finishp: Double): Double
  def set_max_time(sclient: String, max_secs: Double): Double
  def terminate_all(sclient: String): Double
  def update_max_time(sclient: String, secs: Double): Double
}

object Typeofcnxcc {
  @scala.inline
  def apply(
    get_channel_count: (String, String) => CallbackTo[Double],
    set_max_channels: (String, Double) => CallbackTo[Double],
    set_max_credit: (String, String, String, Double, Double) => CallbackTo[Double],
    set_max_time: (String, Double) => CallbackTo[Double],
    terminate_all: String => CallbackTo[Double],
    update_max_time: (String, Double) => CallbackTo[Double]
  ): Typeofcnxcc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get_channel_count")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get_channel_count(t0, t1).runNow()))
    __obj.updateDynamic("set_max_channels")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => set_max_channels(t0, t1).runNow()))
    __obj.updateDynamic("set_max_credit")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: scala.Double, t4: scala.Double) => set_max_credit(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("set_max_time")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => set_max_time(t0, t1).runNow()))
    __obj.updateDynamic("terminate_all")(js.Any.fromFunction1((t0: java.lang.String) => terminate_all(t0).runNow()))
    __obj.updateDynamic("update_max_time")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => update_max_time(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofcnxcc]
  }
}

