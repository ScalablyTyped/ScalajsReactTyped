package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartValueAxisItemPlotBand extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
}

object StockChartValueAxisItemPlotBand {
  @scala.inline
  def apply(
    color: String = null,
    from: Int | Double = null,
    opacity: Int | Double = null,
    to: Int | Double = null
  ): StockChartValueAxisItemPlotBand = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartValueAxisItemPlotBand]
  }
}

