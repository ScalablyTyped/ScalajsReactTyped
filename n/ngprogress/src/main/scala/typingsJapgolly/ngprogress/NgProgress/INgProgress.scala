package typingsJapgolly.ngprogress.NgProgress

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INgProgress extends js.Object {
  def color(color: String): Unit
  def complete(): Unit
  def height(height: String): Unit
  def reset(): Unit
  def set(value: Double): Unit
  def start(): Unit
  def status(): Double
  def stop(): Unit
}

object INgProgress {
  @scala.inline
  def apply(
    color: String => Callback,
    complete: Callback,
    height: String => Callback,
    reset: Callback,
    set: Double => Callback,
    start: Callback,
    status: CallbackTo[Double],
    stop: Callback
  ): INgProgress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(js.Any.fromFunction1((t0: java.lang.String) => color(t0).runNow()))
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.updateDynamic("height")(js.Any.fromFunction1((t0: java.lang.String) => height(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: scala.Double) => set(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("status")(status.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[INgProgress]
  }
}

