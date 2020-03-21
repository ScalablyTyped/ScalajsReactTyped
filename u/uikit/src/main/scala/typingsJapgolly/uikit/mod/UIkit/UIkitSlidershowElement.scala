package typingsJapgolly.uikit.mod.UIkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitSlidershowElement extends js.Object {
  def show(index: Double): Unit
  def startAutoplay(): Unit
  def stopAutoplay(): Unit
}

object UIkitSlidershowElement {
  @scala.inline
  def apply(show: Double => Callback, startAutoplay: Callback, stopAutoplay: Callback): UIkitSlidershowElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("show")(js.Any.fromFunction1((t0: scala.Double) => show(t0).runNow()))
    __obj.updateDynamic("startAutoplay")(startAutoplay.toJsFn)
    __obj.updateDynamic("stopAutoplay")(stopAutoplay.toJsFn)
    __obj.asInstanceOf[UIkitSlidershowElement]
  }
}

