package typingsJapgolly.jestFakeTimers.jestFakeTimersMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerConfig[Ref] extends js.Object {
  def idToRef(id: Double): Ref
  def refToId(ref: Ref): Double | Unit
}

object TimerConfig {
  @scala.inline
  def apply[Ref](idToRef: Double => CallbackTo[Ref], refToId: Ref => CallbackTo[Double | Unit]): TimerConfig[Ref] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("idToRef")(js.Any.fromFunction1((t0: scala.Double) => idToRef(t0).runNow()))
    __obj.updateDynamic("refToId")(js.Any.fromFunction1((t0: Ref) => refToId(t0).runNow()))
    __obj.asInstanceOf[TimerConfig[Ref]]
  }
}

