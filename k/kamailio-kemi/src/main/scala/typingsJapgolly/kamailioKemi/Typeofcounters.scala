package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcounters extends js.Object {
  def add(sname: String, v: Double): Double
  def inc(sname: String): Double
  def reset(sname: String): Double
}

object Typeofcounters {
  @scala.inline
  def apply(
    add: (String, Double) => CallbackTo[Double],
    inc: String => CallbackTo[Double],
    reset: String => CallbackTo[Double]
  ): Typeofcounters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => add(t0, t1).runNow()))
    __obj.updateDynamic("inc")(js.Any.fromFunction1((t0: java.lang.String) => inc(t0).runNow()))
    __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: java.lang.String) => reset(t0).runNow()))
    __obj.asInstanceOf[Typeofcounters]
  }
}

