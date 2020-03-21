package typingsJapgolly.smoothScrollbar.scrollbarMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToOptions extends js.Object {
  def callback(): Unit
  def easing(percent: Double): Double
}

object ScrollToOptions {
  @scala.inline
  def apply(callback: Callback, easing: Double => CallbackTo[Double]): ScrollToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.updateDynamic("easing")(js.Any.fromFunction1((t0: scala.Double) => easing(t0).runNow()))
    __obj.asInstanceOf[ScrollToOptions]
  }
}

