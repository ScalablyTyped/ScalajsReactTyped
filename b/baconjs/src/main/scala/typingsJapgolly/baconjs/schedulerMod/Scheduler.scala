package typingsJapgolly.baconjs.schedulerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scheduler extends js.Object {
  def clearInterval(id: Double): js.Any
  def clearTimeout(id: Double): js.Any
  def now(): Double
  def setInterval(f: js.Function, i: Double): Double
  def setTimeout(f: js.Function, d: Double): Double
}

object Scheduler {
  @scala.inline
  def apply(
    clearInterval: Double => CallbackTo[js.Any],
    clearTimeout: Double => CallbackTo[js.Any],
    now: CallbackTo[Double],
    setInterval: (js.Function, Double) => CallbackTo[Double],
    setTimeout: (js.Function, Double) => CallbackTo[Double]
  ): Scheduler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearInterval")(js.Any.fromFunction1((t0: scala.Double) => clearInterval(t0).runNow()))
    __obj.updateDynamic("clearTimeout")(js.Any.fromFunction1((t0: scala.Double) => clearTimeout(t0).runNow()))
    __obj.updateDynamic("now")(now.toJsFn)
    __obj.updateDynamic("setInterval")(js.Any.fromFunction2((t0: js.Function, t1: scala.Double) => setInterval(t0, t1).runNow()))
    __obj.updateDynamic("setTimeout")(js.Any.fromFunction2((t0: js.Function, t1: scala.Double) => setTimeout(t0, t1).runNow()))
    __obj.asInstanceOf[Scheduler]
  }
}

