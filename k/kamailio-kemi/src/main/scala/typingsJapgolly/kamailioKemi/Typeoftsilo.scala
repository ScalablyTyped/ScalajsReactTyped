package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftsilo extends js.Object {
  def ts_append(_table: String, _ruri: String): Double
  def ts_append_to(tindex: Double, tlabel: Double, _table: String): Double
  def ts_append_to_uri(tindex: Double, tlabel: Double, _table: String, _uri: String): Double
  def ts_store(): Double
  def ts_store_uri(puri: String): Double
}

object Typeoftsilo {
  @scala.inline
  def apply(
    ts_append: (String, String) => CallbackTo[Double],
    ts_append_to: (Double, Double, String) => CallbackTo[Double],
    ts_append_to_uri: (Double, Double, String, String) => CallbackTo[Double],
    ts_store: CallbackTo[Double],
    ts_store_uri: String => CallbackTo[Double]
  ): Typeoftsilo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ts_append")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => ts_append(t0, t1).runNow()))
    __obj.updateDynamic("ts_append_to")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: java.lang.String) => ts_append_to(t0, t1, t2).runNow()))
    __obj.updateDynamic("ts_append_to_uri")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: java.lang.String, t3: java.lang.String) => ts_append_to_uri(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("ts_store")(ts_store.toJsFn)
    __obj.updateDynamic("ts_store_uri")(js.Any.fromFunction1((t0: java.lang.String) => ts_store_uri(t0).runNow()))
    __obj.asInstanceOf[Typeoftsilo]
  }
}

