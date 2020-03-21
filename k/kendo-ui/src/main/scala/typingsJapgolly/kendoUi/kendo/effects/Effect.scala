package typingsJapgolly.kendoUi.kendo.effects

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Effect extends js.Object {
  def add(effect: Effect): Effect
  def duration(value: Double): Effect
  def play(): JQueryPromise[_]
  def reverse(): JQueryPromise[_]
  def stop(): Effect
}

object Effect {
  @scala.inline
  def apply(
    add: Effect => CallbackTo[Effect],
    duration: Double => CallbackTo[Effect],
    play: CallbackTo[JQueryPromise[js.Any]],
    reverse: CallbackTo[JQueryPromise[js.Any]],
    stop: CallbackTo[Effect]
  ): Effect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.kendoUi.kendo.effects.Effect) => add(t0).runNow()))
    __obj.updateDynamic("duration")(js.Any.fromFunction1((t0: scala.Double) => duration(t0).runNow()))
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("reverse")(reverse.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[Effect]
  }
}

