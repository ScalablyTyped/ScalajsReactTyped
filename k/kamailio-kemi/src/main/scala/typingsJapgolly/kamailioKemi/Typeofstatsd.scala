package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofstatsd extends js.Object {
  def statsd_decr(key: String): Double
  def statsd_gauge(key: String, `val`: String): Double
  def statsd_incr(key: String): Double
  def statsd_set(key: String, `val`: String): Double
  def statsd_start(key: String): Double
  def statsd_stop(key: String): Double
}

object Typeofstatsd {
  @scala.inline
  def apply(
    statsd_decr: String => CallbackTo[Double],
    statsd_gauge: (String, String) => CallbackTo[Double],
    statsd_incr: String => CallbackTo[Double],
    statsd_set: (String, String) => CallbackTo[Double],
    statsd_start: String => CallbackTo[Double],
    statsd_stop: String => CallbackTo[Double]
  ): Typeofstatsd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("statsd_decr")(js.Any.fromFunction1((t0: java.lang.String) => statsd_decr(t0).runNow()))
    __obj.updateDynamic("statsd_gauge")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => statsd_gauge(t0, t1).runNow()))
    __obj.updateDynamic("statsd_incr")(js.Any.fromFunction1((t0: java.lang.String) => statsd_incr(t0).runNow()))
    __obj.updateDynamic("statsd_set")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => statsd_set(t0, t1).runNow()))
    __obj.updateDynamic("statsd_start")(js.Any.fromFunction1((t0: java.lang.String) => statsd_start(t0).runNow()))
    __obj.updateDynamic("statsd_stop")(js.Any.fromFunction1((t0: java.lang.String) => statsd_stop(t0).runNow()))
    __obj.asInstanceOf[Typeofstatsd]
  }
}

