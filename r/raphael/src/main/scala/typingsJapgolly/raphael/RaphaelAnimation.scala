package typingsJapgolly.raphael

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelAnimation extends js.Object {
  def delay(delay: Double): RaphaelAnimation
  def repeat(repeat: Double): RaphaelAnimation
}

object RaphaelAnimation {
  @scala.inline
  def apply(delay: Double => CallbackTo[RaphaelAnimation], repeat: Double => CallbackTo[RaphaelAnimation]): RaphaelAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delay")(js.Any.fromFunction1((t0: scala.Double) => delay(t0).runNow()))
    __obj.updateDynamic("repeat")(js.Any.fromFunction1((t0: scala.Double) => repeat(t0).runNow()))
    __obj.asInstanceOf[RaphaelAnimation]
  }
}

