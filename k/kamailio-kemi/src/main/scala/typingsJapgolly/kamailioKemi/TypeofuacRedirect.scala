package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofuacRedirect extends js.Object {
  def get_redirects(max_c: Double, max_b: Double): Double
  def get_redirects_acc(max_c: Double, max_b: Double, reason: String): Double
  def get_redirects_all(): Double
}

object TypeofuacRedirect {
  @scala.inline
  def apply(
    get_redirects: (Double, Double) => CallbackTo[Double],
    get_redirects_acc: (Double, Double, String) => CallbackTo[Double],
    get_redirects_all: CallbackTo[Double]
  ): TypeofuacRedirect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get_redirects")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => get_redirects(t0, t1).runNow()))
    __obj.updateDynamic("get_redirects_acc")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: java.lang.String) => get_redirects_acc(t0, t1, t2).runNow()))
    __obj.updateDynamic("get_redirects_all")(get_redirects_all.toJsFn)
    __obj.asInstanceOf[TypeofuacRedirect]
  }
}

