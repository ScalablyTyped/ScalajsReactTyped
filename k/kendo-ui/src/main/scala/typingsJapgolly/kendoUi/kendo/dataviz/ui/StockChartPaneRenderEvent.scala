package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartPaneRenderEvent extends StockChartEvent {
  var index: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pane: js.UndefOr[StockChart] = js.undefined
}

object StockChartPaneRenderEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: StockChart,
    index: Int | Double = null,
    name: String = null,
    pane: StockChart = null
  ): StockChartPaneRenderEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartPaneRenderEvent]
  }
}

