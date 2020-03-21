package typingsJapgolly.smoothScrollbar.trackMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarThumb extends js.Object {
  var displaySize: Double
  val element: HTMLElement
  var offset: Double
  var realSize: Double
  def attachTo(track: HTMLElement): Unit
  def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit
}

object ScrollbarThumb {
  @scala.inline
  def apply(
    attachTo: HTMLElement => Callback,
    displaySize: Double,
    element: HTMLElement,
    offset: Double,
    realSize: Double,
    update: (Double, Double, Double) => Callback
  ): ScrollbarThumb = {
    val __obj = js.Dynamic.literal(displaySize = displaySize.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], realSize = realSize.asInstanceOf[js.Any])
    __obj.updateDynamic("attachTo")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => attachTo(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ScrollbarThumb]
  }
}

