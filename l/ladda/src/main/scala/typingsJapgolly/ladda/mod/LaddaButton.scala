package typingsJapgolly.ladda.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaddaButton extends js.Object {
  def isLoading(): Boolean
  def remove(): Unit
  def setProgress(progress: Double): Unit
  def start(): LaddaButton
  def startAfter(delay: Double): LaddaButton
  def stop(): LaddaButton
  def toggle(): LaddaButton
}

object LaddaButton {
  @scala.inline
  def apply(
    isLoading: CallbackTo[Boolean],
    remove: Callback,
    setProgress: Double => Callback,
    start: CallbackTo[LaddaButton],
    startAfter: Double => CallbackTo[LaddaButton],
    stop: CallbackTo[LaddaButton],
    toggle: CallbackTo[LaddaButton]
  ): LaddaButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isLoading")(isLoading.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setProgress")(js.Any.fromFunction1((t0: scala.Double) => setProgress(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("startAfter")(js.Any.fromFunction1((t0: scala.Double) => startAfter(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[LaddaButton]
  }
}

