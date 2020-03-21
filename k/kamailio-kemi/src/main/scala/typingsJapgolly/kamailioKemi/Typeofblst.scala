package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofblst extends js.Object {
  def blst_add(t: Double): Double
  def blst_add_default(): Double
  def blst_add_retry_after(t_min: Double, t_max: Double): Double
  def blst_clear_ignore(mask: Double): Double
  def blst_clear_ignore_all(): Double
  def blst_del(): Double
  def blst_is_blacklisted(): Double
  def blst_rpl_clear_ignore(mask: Double): Double
  def blst_rpl_clear_ignore_all(): Double
  def blst_rpl_set_ignore(mask: Double): Double
  def blst_rpl_set_ignore_all(): Double
  def blst_set_ignore(mask: Double): Double
  def blst_set_ignore_all(): Double
}

object Typeofblst {
  @scala.inline
  def apply(
    blst_add: Double => CallbackTo[Double],
    blst_add_default: CallbackTo[Double],
    blst_add_retry_after: (Double, Double) => CallbackTo[Double],
    blst_clear_ignore: Double => CallbackTo[Double],
    blst_clear_ignore_all: CallbackTo[Double],
    blst_del: CallbackTo[Double],
    blst_is_blacklisted: CallbackTo[Double],
    blst_rpl_clear_ignore: Double => CallbackTo[Double],
    blst_rpl_clear_ignore_all: CallbackTo[Double],
    blst_rpl_set_ignore: Double => CallbackTo[Double],
    blst_rpl_set_ignore_all: CallbackTo[Double],
    blst_set_ignore: Double => CallbackTo[Double],
    blst_set_ignore_all: CallbackTo[Double]
  ): Typeofblst = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blst_add")(js.Any.fromFunction1((t0: scala.Double) => blst_add(t0).runNow()))
    __obj.updateDynamic("blst_add_default")(blst_add_default.toJsFn)
    __obj.updateDynamic("blst_add_retry_after")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => blst_add_retry_after(t0, t1).runNow()))
    __obj.updateDynamic("blst_clear_ignore")(js.Any.fromFunction1((t0: scala.Double) => blst_clear_ignore(t0).runNow()))
    __obj.updateDynamic("blst_clear_ignore_all")(blst_clear_ignore_all.toJsFn)
    __obj.updateDynamic("blst_del")(blst_del.toJsFn)
    __obj.updateDynamic("blst_is_blacklisted")(blst_is_blacklisted.toJsFn)
    __obj.updateDynamic("blst_rpl_clear_ignore")(js.Any.fromFunction1((t0: scala.Double) => blst_rpl_clear_ignore(t0).runNow()))
    __obj.updateDynamic("blst_rpl_clear_ignore_all")(blst_rpl_clear_ignore_all.toJsFn)
    __obj.updateDynamic("blst_rpl_set_ignore")(js.Any.fromFunction1((t0: scala.Double) => blst_rpl_set_ignore(t0).runNow()))
    __obj.updateDynamic("blst_rpl_set_ignore_all")(blst_rpl_set_ignore_all.toJsFn)
    __obj.updateDynamic("blst_set_ignore")(js.Any.fromFunction1((t0: scala.Double) => blst_set_ignore(t0).runNow()))
    __obj.updateDynamic("blst_set_ignore_all")(blst_set_ignore_all.toJsFn)
    __obj.asInstanceOf[Typeofblst]
  }
}

