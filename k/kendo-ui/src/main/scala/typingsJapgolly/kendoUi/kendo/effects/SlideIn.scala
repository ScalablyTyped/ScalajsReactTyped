package typingsJapgolly.kendoUi.kendo.effects

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideIn extends Effect {
  def direction(value: String): SlideIn
}

object SlideIn {
  @scala.inline
  def apply(
    add: Effect => CallbackTo[Effect],
    direction: String => CallbackTo[SlideIn],
    duration: Double => CallbackTo[Effect],
    play: CallbackTo[JQueryPromise[js.Any]],
    reverse: CallbackTo[JQueryPromise[js.Any]],
    stop: CallbackTo[Effect]
  ): SlideIn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.kendoUi.kendo.effects.Effect) => add(t0).runNow()))
    __obj.updateDynamic("direction")(js.Any.fromFunction1((t0: java.lang.String) => direction(t0).runNow()))
    __obj.updateDynamic("duration")(js.Any.fromFunction1((t0: scala.Double) => duration(t0).runNow()))
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("reverse")(reverse.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[SlideIn]
  }
}

