package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhtable extends js.Object {
  def sht_has_name(sname: String, sop: String, sval: String): Double
  def sht_has_str_value(sname: String, sop: String, sval: String): Double
  def sht_iterator_end(iname: String): Double
  def sht_iterator_next(iname: String): Double
  def sht_iterator_start(iname: String, hname: String): Double
  def sht_lock(htname: String, skey: String): Double
  def sht_reset(hname: String): Double
  def sht_rm(hname: String, iname: String): Double
  def sht_rm_name(sname: String, sop: String, sval: String): Double
  def sht_rm_name_re(htname: String, rexp: String): Double
  def sht_rm_value(sname: String, sop: String, sval: String): Double
  def sht_rm_value_re(htname: String, rexp: String): Double
  def sht_setex(htname: String, itname: String, itval: Double): Double
  def sht_seti(htname: String, itname: String, itval: Double): Double
  def sht_sets(htname: String, itname: String, itval: String): Double
  def sht_setxi(htname: String, itname: String, itval: Double, exval: Double): Double
  def sht_setxs(htname: String, itname: String, itval: String, exval: Double): Double
  def sht_unlock(htname: String, skey: String): Double
}

object Typeofhtable {
  @scala.inline
  def apply(
    sht_has_name: (String, String, String) => CallbackTo[Double],
    sht_has_str_value: (String, String, String) => CallbackTo[Double],
    sht_iterator_end: String => CallbackTo[Double],
    sht_iterator_next: String => CallbackTo[Double],
    sht_iterator_start: (String, String) => CallbackTo[Double],
    sht_lock: (String, String) => CallbackTo[Double],
    sht_reset: String => CallbackTo[Double],
    sht_rm: (String, String) => CallbackTo[Double],
    sht_rm_name: (String, String, String) => CallbackTo[Double],
    sht_rm_name_re: (String, String) => CallbackTo[Double],
    sht_rm_value: (String, String, String) => CallbackTo[Double],
    sht_rm_value_re: (String, String) => CallbackTo[Double],
    sht_setex: (String, String, Double) => CallbackTo[Double],
    sht_seti: (String, String, Double) => CallbackTo[Double],
    sht_sets: (String, String, String) => CallbackTo[Double],
    sht_setxi: (String, String, Double, Double) => CallbackTo[Double],
    sht_setxs: (String, String, String, Double) => CallbackTo[Double],
    sht_unlock: (String, String) => CallbackTo[Double]
  ): Typeofhtable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sht_has_name")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => sht_has_name(t0, t1, t2).runNow()))
    __obj.updateDynamic("sht_has_str_value")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => sht_has_str_value(t0, t1, t2).runNow()))
    __obj.updateDynamic("sht_iterator_end")(js.Any.fromFunction1((t0: java.lang.String) => sht_iterator_end(t0).runNow()))
    __obj.updateDynamic("sht_iterator_next")(js.Any.fromFunction1((t0: java.lang.String) => sht_iterator_next(t0).runNow()))
    __obj.updateDynamic("sht_iterator_start")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sht_iterator_start(t0, t1).runNow()))
    __obj.updateDynamic("sht_lock")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sht_lock(t0, t1).runNow()))
    __obj.updateDynamic("sht_reset")(js.Any.fromFunction1((t0: java.lang.String) => sht_reset(t0).runNow()))
    __obj.updateDynamic("sht_rm")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sht_rm(t0, t1).runNow()))
    __obj.updateDynamic("sht_rm_name")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => sht_rm_name(t0, t1, t2).runNow()))
    __obj.updateDynamic("sht_rm_name_re")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sht_rm_name_re(t0, t1).runNow()))
    __obj.updateDynamic("sht_rm_value")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => sht_rm_value(t0, t1, t2).runNow()))
    __obj.updateDynamic("sht_rm_value_re")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sht_rm_value_re(t0, t1).runNow()))
    __obj.updateDynamic("sht_setex")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => sht_setex(t0, t1, t2).runNow()))
    __obj.updateDynamic("sht_seti")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => sht_seti(t0, t1, t2).runNow()))
    __obj.updateDynamic("sht_sets")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => sht_sets(t0, t1, t2).runNow()))
    __obj.updateDynamic("sht_setxi")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: scala.Double, t3: scala.Double) => sht_setxi(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("sht_setxs")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: scala.Double) => sht_setxs(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("sht_unlock")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sht_unlock(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofhtable]
  }
}

