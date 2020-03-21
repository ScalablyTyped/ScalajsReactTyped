package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartLegendItemClickEvent extends StockChartEvent {
  var element: js.UndefOr[js.Any] = js.undefined
  var pointIndex: js.UndefOr[Double] = js.undefined
  var series: js.UndefOr[js.Any] = js.undefined
  var seriesIndex: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object StockChartLegendItemClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: StockChart,
    element: js.Any = null,
    pointIndex: Int | Double = null,
    series: js.Any = null,
    seriesIndex: Int | Double = null,
    text: String = null
  ): StockChartLegendItemClickEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (pointIndex != null) __obj.updateDynamic("pointIndex")(pointIndex.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesIndex != null) __obj.updateDynamic("seriesIndex")(seriesIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartLegendItemClickEvent]
  }
}

