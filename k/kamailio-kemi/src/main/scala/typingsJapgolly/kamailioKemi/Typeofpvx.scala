package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpvx extends js.Object {
  def evalx(dst: String, fmt: String): Double
  def pv_var_to_xavp(varname: String, xname: String): Double
  def pv_xavp_print(): Double
  def pv_xavp_to_var(xname: String): Double
  def sbranch_append(): Double
  def sbranch_reset(): Double
  def sbranch_set_ruri(): Double
  def xavp_params_explode(sparams: String, sxname: String): Double
  def xavp_params_implode(sxname: String, svname: String): Double
}

object Typeofpvx {
  @scala.inline
  def apply(
    evalx: (String, String) => CallbackTo[Double],
    pv_var_to_xavp: (String, String) => CallbackTo[Double],
    pv_xavp_print: CallbackTo[Double],
    pv_xavp_to_var: String => CallbackTo[Double],
    sbranch_append: CallbackTo[Double],
    sbranch_reset: CallbackTo[Double],
    sbranch_set_ruri: CallbackTo[Double],
    xavp_params_explode: (String, String) => CallbackTo[Double],
    xavp_params_implode: (String, String) => CallbackTo[Double]
  ): Typeofpvx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("evalx")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => evalx(t0, t1).runNow()))
    __obj.updateDynamic("pv_var_to_xavp")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => pv_var_to_xavp(t0, t1).runNow()))
    __obj.updateDynamic("pv_xavp_print")(pv_xavp_print.toJsFn)
    __obj.updateDynamic("pv_xavp_to_var")(js.Any.fromFunction1((t0: java.lang.String) => pv_xavp_to_var(t0).runNow()))
    __obj.updateDynamic("sbranch_append")(sbranch_append.toJsFn)
    __obj.updateDynamic("sbranch_reset")(sbranch_reset.toJsFn)
    __obj.updateDynamic("sbranch_set_ruri")(sbranch_set_ruri.toJsFn)
    __obj.updateDynamic("xavp_params_explode")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => xavp_params_explode(t0, t1).runNow()))
    __obj.updateDynamic("xavp_params_implode")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => xavp_params_implode(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofpvx]
  }
}

