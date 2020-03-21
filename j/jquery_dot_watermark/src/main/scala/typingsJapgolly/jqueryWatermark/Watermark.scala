package typingsJapgolly.jqueryWatermark

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watermark extends js.Object {
  var options: WatermarkOptions
  def hide(element: String): Unit
  def hideAll(): Unit
  def show(element: String): Unit
  def showAll(): Unit
}

object Watermark {
  @scala.inline
  def apply(
    hide: String => Callback,
    hideAll: Callback,
    options: WatermarkOptions,
    show: String => Callback,
    showAll: Callback
  ): Watermark = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: java.lang.String) => hide(t0).runNow()))
    __obj.updateDynamic("hideAll")(hideAll.toJsFn)
    __obj.updateDynamic("show")(js.Any.fromFunction1((t0: java.lang.String) => show(t0).runNow()))
    __obj.updateDynamic("showAll")(showAll.toJsFn)
    __obj.asInstanceOf[Watermark]
  }
}

