package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdispatcher extends js.Object {
  def ds_is_from_list(group: Double): Double
  def ds_is_from_list_mode(vset: Double, vmode: Double): Double
  def ds_is_from_list_uri(vset: Double, vmode: Double, vuri: String): Double
  def ds_is_from_lists(): Double
  def ds_list_exists(set: Double): Double
  def ds_load_unset(): Double
  def ds_load_update(): Double
  def ds_mark_dst(): Double
  def ds_mark_dst_state(sval: String): Double
  def ds_next_domain(): Double
  def ds_next_dst(): Double
  def ds_reload(): Double
  def ds_select(set: Double, alg: Double): Double
  def ds_select_domain(set: Double, alg: Double): Double
  def ds_select_domain_limit(set: Double, alg: Double, limit: Double): Double
  def ds_select_dst(set: Double, alg: Double): Double
  def ds_select_dst_limit(set: Double, alg: Double, limit: Double): Double
  def ds_select_limit(set: Double, alg: Double, limit: Double): Double
  def ds_select_routes(srules: String, smode: String): Double
  def ds_select_routes_limit(srules: String, smode: String, rlimit: Double): Double
  def ds_set_domain(): Double
  def ds_set_dst(): Double
}

object Typeofdispatcher {
  @scala.inline
  def apply(
    ds_is_from_list: Double => CallbackTo[Double],
    ds_is_from_list_mode: (Double, Double) => CallbackTo[Double],
    ds_is_from_list_uri: (Double, Double, String) => CallbackTo[Double],
    ds_is_from_lists: CallbackTo[Double],
    ds_list_exists: Double => CallbackTo[Double],
    ds_load_unset: CallbackTo[Double],
    ds_load_update: CallbackTo[Double],
    ds_mark_dst: CallbackTo[Double],
    ds_mark_dst_state: String => CallbackTo[Double],
    ds_next_domain: CallbackTo[Double],
    ds_next_dst: CallbackTo[Double],
    ds_reload: CallbackTo[Double],
    ds_select: (Double, Double) => CallbackTo[Double],
    ds_select_domain: (Double, Double) => CallbackTo[Double],
    ds_select_domain_limit: (Double, Double, Double) => CallbackTo[Double],
    ds_select_dst: (Double, Double) => CallbackTo[Double],
    ds_select_dst_limit: (Double, Double, Double) => CallbackTo[Double],
    ds_select_limit: (Double, Double, Double) => CallbackTo[Double],
    ds_select_routes: (String, String) => CallbackTo[Double],
    ds_select_routes_limit: (String, String, Double) => CallbackTo[Double],
    ds_set_domain: CallbackTo[Double],
    ds_set_dst: CallbackTo[Double]
  ): Typeofdispatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ds_is_from_list")(js.Any.fromFunction1((t0: scala.Double) => ds_is_from_list(t0).runNow()))
    __obj.updateDynamic("ds_is_from_list_mode")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => ds_is_from_list_mode(t0, t1).runNow()))
    __obj.updateDynamic("ds_is_from_list_uri")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: java.lang.String) => ds_is_from_list_uri(t0, t1, t2).runNow()))
    __obj.updateDynamic("ds_is_from_lists")(ds_is_from_lists.toJsFn)
    __obj.updateDynamic("ds_list_exists")(js.Any.fromFunction1((t0: scala.Double) => ds_list_exists(t0).runNow()))
    __obj.updateDynamic("ds_load_unset")(ds_load_unset.toJsFn)
    __obj.updateDynamic("ds_load_update")(ds_load_update.toJsFn)
    __obj.updateDynamic("ds_mark_dst")(ds_mark_dst.toJsFn)
    __obj.updateDynamic("ds_mark_dst_state")(js.Any.fromFunction1((t0: java.lang.String) => ds_mark_dst_state(t0).runNow()))
    __obj.updateDynamic("ds_next_domain")(ds_next_domain.toJsFn)
    __obj.updateDynamic("ds_next_dst")(ds_next_dst.toJsFn)
    __obj.updateDynamic("ds_reload")(ds_reload.toJsFn)
    __obj.updateDynamic("ds_select")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => ds_select(t0, t1).runNow()))
    __obj.updateDynamic("ds_select_domain")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => ds_select_domain(t0, t1).runNow()))
    __obj.updateDynamic("ds_select_domain_limit")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => ds_select_domain_limit(t0, t1, t2).runNow()))
    __obj.updateDynamic("ds_select_dst")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => ds_select_dst(t0, t1).runNow()))
    __obj.updateDynamic("ds_select_dst_limit")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => ds_select_dst_limit(t0, t1, t2).runNow()))
    __obj.updateDynamic("ds_select_limit")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => ds_select_limit(t0, t1, t2).runNow()))
    __obj.updateDynamic("ds_select_routes")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => ds_select_routes(t0, t1).runNow()))
    __obj.updateDynamic("ds_select_routes_limit")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => ds_select_routes_limit(t0, t1, t2).runNow()))
    __obj.updateDynamic("ds_set_domain")(ds_set_domain.toJsFn)
    __obj.updateDynamic("ds_set_dst")(ds_set_dst.toJsFn)
    __obj.asInstanceOf[Typeofdispatcher]
  }
}

