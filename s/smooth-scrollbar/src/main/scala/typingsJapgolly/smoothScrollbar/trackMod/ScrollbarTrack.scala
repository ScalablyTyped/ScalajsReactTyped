package typingsJapgolly.smoothScrollbar.trackMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarTrack extends js.Object {
  val element: HTMLElement
  val thumb: ScrollbarThumb
  def attachTo(container: HTMLElement): Unit
  def hide(): Unit
  def show(): Unit
  def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit
}

object ScrollbarTrack {
  @scala.inline
  def apply(
    attachTo: HTMLElement => Callback,
    element: HTMLElement,
    hide: Callback,
    show: Callback,
    thumb: ScrollbarThumb,
    update: (Double, Double, Double) => Callback
  ): ScrollbarTrack = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any])
    __obj.updateDynamic("attachTo")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => attachTo(t0).runNow()))
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ScrollbarTrack]
  }
}

