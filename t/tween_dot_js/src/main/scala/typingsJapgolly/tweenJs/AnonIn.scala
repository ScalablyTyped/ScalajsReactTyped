package typingsJapgolly.tweenJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIn extends js.Object {
  def In(k: Double): Double
  def InOut(k: Double): Double
  def Out(k: Double): Double
}

object AnonIn {
  @scala.inline
  def apply(
    In: Double => CallbackTo[Double],
    InOut: Double => CallbackTo[Double],
    Out: Double => CallbackTo[Double]
  ): AnonIn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("In")(js.Any.fromFunction1((t0: scala.Double) => In(t0).runNow()))
    __obj.updateDynamic("InOut")(js.Any.fromFunction1((t0: scala.Double) => InOut(t0).runNow()))
    __obj.updateDynamic("Out")(js.Any.fromFunction1((t0: scala.Double) => Out(t0).runNow()))
    __obj.asInstanceOf[AnonIn]
  }
}

