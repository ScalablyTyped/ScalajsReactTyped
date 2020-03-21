package typingsJapgolly.chalkAnimation.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  def frame(): String
  def render(): Unit
  def replace(text: String): Unit
  def start(): Unit
  def stop(): Unit
}

object Animation {
  @scala.inline
  def apply(
    frame: CallbackTo[String],
    render: Callback,
    replace: String => Callback,
    start: Callback,
    stop: Callback
  ): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frame")(frame.toJsFn)
    __obj.updateDynamic("render")(render.toJsFn)
    __obj.updateDynamic("replace")(js.Any.fromFunction1((t0: java.lang.String) => replace(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[Animation]
  }
}

