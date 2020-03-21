package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpipelimit extends js.Object {
  def pl_check(pipeid: String): Double
  def pl_check_limit(pipeid: String, alg: String, limit: Double): Double
  def pl_drop(): Double
  def pl_drop_range(rmin: Double, rmax: Double): Double
  def pl_drop_retry(rafter: Double): Double
}

object Typeofpipelimit {
  @scala.inline
  def apply(
    pl_check: String => CallbackTo[Double],
    pl_check_limit: (String, String, Double) => CallbackTo[Double],
    pl_drop: CallbackTo[Double],
    pl_drop_range: (Double, Double) => CallbackTo[Double],
    pl_drop_retry: Double => CallbackTo[Double]
  ): Typeofpipelimit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pl_check")(js.Any.fromFunction1((t0: java.lang.String) => pl_check(t0).runNow()))
    __obj.updateDynamic("pl_check_limit")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => pl_check_limit(t0, t1, t2).runNow()))
    __obj.updateDynamic("pl_drop")(pl_drop.toJsFn)
    __obj.updateDynamic("pl_drop_range")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => pl_drop_range(t0, t1).runNow()))
    __obj.updateDynamic("pl_drop_retry")(js.Any.fromFunction1((t0: scala.Double) => pl_drop_retry(t0).runNow()))
    __obj.asInstanceOf[Typeofpipelimit]
  }
}

