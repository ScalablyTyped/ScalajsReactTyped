package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmaxfwd extends js.Object {
  def is_maxfwd_lt(limit: Double): Double
  def process_maxfwd(limit: Double): Double
}

object Typeofmaxfwd {
  @scala.inline
  def apply(is_maxfwd_lt: Double => CallbackTo[Double], process_maxfwd: Double => CallbackTo[Double]): Typeofmaxfwd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("is_maxfwd_lt")(js.Any.fromFunction1((t0: scala.Double) => is_maxfwd_lt(t0).runNow()))
    __obj.updateDynamic("process_maxfwd")(js.Any.fromFunction1((t0: scala.Double) => process_maxfwd(t0).runNow()))
    __obj.asInstanceOf[Typeofmaxfwd]
  }
}

