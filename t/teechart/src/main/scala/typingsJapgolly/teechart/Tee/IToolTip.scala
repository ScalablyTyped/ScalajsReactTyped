package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToolTip extends IAnnotation {
  var animated: Double
  var autoHide: Boolean
  var autoRedraw: Boolean
  var currentIndex: Double
  var currentSeries: ISeries
  var delay: Double
  def hide(): Unit
  def refresh(series: ISeries, index: Double): Unit
}

object IToolTip {
  @scala.inline
  def apply(
    active: Boolean,
    add: String => CallbackTo[IAnnotation],
    animated: Double,
    autoHide: Boolean,
    autoRedraw: Boolean,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => CallbackTo[Boolean],
    currentIndex: Double,
    currentSeries: ISeries,
    delay: Double,
    draw: Callback,
    format: IFormat,
    hide: Callback,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Any => CallbackTo[Boolean],
    mousemove: js.Any => CallbackTo[Boolean],
    position: IPoint,
    refresh: (ISeries, Double) => Callback,
    resize: Callback,
    text: String,
    transparent: Boolean,
    visible: Boolean
  ): IToolTip = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], autoHide = autoHide.asInstanceOf[js.Any], autoRedraw = autoRedraw.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any], currentSeries = currentSeries.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: java.lang.String) => add(t0).runNow()))
    __obj.updateDynamic("clicked")(js.Any.fromFunction1((t0: typingsJapgolly.teechart.Tee.IPoint) => clicked(t0).runNow()))
    __obj.updateDynamic("draw")(draw.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("mousedown")(js.Any.fromFunction1((t0: js.Any) => mousedown(t0).runNow()))
    __obj.updateDynamic("mousemove")(js.Any.fromFunction1((t0: js.Any) => mousemove(t0).runNow()))
    __obj.updateDynamic("refresh")(js.Any.fromFunction2((t0: typingsJapgolly.teechart.Tee.ISeries, t1: scala.Double) => refresh(t0, t1).runNow()))
    __obj.updateDynamic("resize")(resize.toJsFn)
    __obj.asInstanceOf[IToolTip]
  }
}

