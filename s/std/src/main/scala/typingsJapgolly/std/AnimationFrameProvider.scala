package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationFrameProvider extends js.Object {
  def cancelAnimationFrame(handle: Double): Unit
  def requestAnimationFrame(callback: FrameRequestCallback): Double
}

object AnimationFrameProvider {
  @scala.inline
  def apply(
    cancelAnimationFrame: Double => Callback,
    requestAnimationFrame: FrameRequestCallback => CallbackTo[Double]
  ): AnimationFrameProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelAnimationFrame")(js.Any.fromFunction1((t0: scala.Double) => cancelAnimationFrame(t0).runNow()))
    __obj.updateDynamic("requestAnimationFrame")(js.Any.fromFunction1((t0: typingsJapgolly.std.FrameRequestCallback) => requestAnimationFrame(t0).runNow()))
    __obj.asInstanceOf[AnimationFrameProvider]
  }
}

