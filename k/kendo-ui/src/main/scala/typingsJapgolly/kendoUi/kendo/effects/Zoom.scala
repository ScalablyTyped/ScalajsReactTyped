package typingsJapgolly.kendoUi.kendo.effects

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zoom extends Effect {
  def direction(value: String): Zoom
  def endValue(value: Double): Zoom
  def startValue(value: Double): Zoom
}

object Zoom {
  @scala.inline
  def apply(
    add: Effect => CallbackTo[Effect],
    direction: String => CallbackTo[Zoom],
    duration: Double => CallbackTo[Effect],
    endValue: Double => CallbackTo[Zoom],
    play: CallbackTo[JQueryPromise[js.Any]],
    reverse: CallbackTo[JQueryPromise[js.Any]],
    startValue: Double => CallbackTo[Zoom],
    stop: CallbackTo[Effect]
  ): Zoom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.kendoUi.kendo.effects.Effect) => add(t0).runNow()))
    __obj.updateDynamic("direction")(js.Any.fromFunction1((t0: java.lang.String) => direction(t0).runNow()))
    __obj.updateDynamic("duration")(js.Any.fromFunction1((t0: scala.Double) => duration(t0).runNow()))
    __obj.updateDynamic("endValue")(js.Any.fromFunction1((t0: scala.Double) => endValue(t0).runNow()))
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("reverse")(reverse.toJsFn)
    __obj.updateDynamic("startValue")(js.Any.fromFunction1((t0: scala.Double) => startValue(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[Zoom]
  }
}

