package typingsJapgolly.jsSchema

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberConstructor extends js.Object {
  def above(n: Double): NumberConstructor
  def below(n: Double): NumberConstructor
  def max(n: Double): NumberConstructor
  def min(n: Double): NumberConstructor
  def step(n: Double): NumberConstructor
}

object NumberConstructor {
  @scala.inline
  def apply(
    above: Double => CallbackTo[NumberConstructor],
    below: Double => CallbackTo[NumberConstructor],
    max: Double => CallbackTo[NumberConstructor],
    min: Double => CallbackTo[NumberConstructor],
    step: Double => CallbackTo[NumberConstructor]
  ): NumberConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("above")(js.Any.fromFunction1((t0: scala.Double) => above(t0).runNow()))
    __obj.updateDynamic("below")(js.Any.fromFunction1((t0: scala.Double) => below(t0).runNow()))
    __obj.updateDynamic("max")(js.Any.fromFunction1((t0: scala.Double) => max(t0).runNow()))
    __obj.updateDynamic("min")(js.Any.fromFunction1((t0: scala.Double) => min(t0).runNow()))
    __obj.updateDynamic("step")(js.Any.fromFunction1((t0: scala.Double) => step(t0).runNow()))
    __obj.asInstanceOf[NumberConstructor]
  }
}

