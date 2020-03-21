package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarks extends IAnnotation {
  var arrow: IArrow
  var drawEvery: Double
  var series: ISeries
  var style: String
}

object IMarks {
  @scala.inline
  def apply(
    active: Boolean,
    add: String => CallbackTo[IAnnotation],
    arrow: IArrow,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => CallbackTo[Boolean],
    draw: Callback,
    drawEvery: Double,
    format: IFormat,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Any => CallbackTo[Boolean],
    mousemove: js.Any => CallbackTo[Boolean],
    position: IPoint,
    resize: Callback,
    series: ISeries,
    style: String,
    text: String,
    transparent: Boolean,
    visible: Boolean
  ): IMarks = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], arrow = arrow.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], drawEvery = drawEvery.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: java.lang.String) => add(t0).runNow()))
    __obj.updateDynamic("clicked")(js.Any.fromFunction1((t0: typingsJapgolly.teechart.Tee.IPoint) => clicked(t0).runNow()))
    __obj.updateDynamic("draw")(draw.toJsFn)
    __obj.updateDynamic("mousedown")(js.Any.fromFunction1((t0: js.Any) => mousedown(t0).runNow()))
    __obj.updateDynamic("mousemove")(js.Any.fromFunction1((t0: js.Any) => mousemove(t0).runNow()))
    __obj.updateDynamic("resize")(resize.toJsFn)
    __obj.asInstanceOf[IMarks]
  }
}

