package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSeriesItemStack extends js.Object {
  var group: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object StockChartNavigatorSeriesItemStack {
  @scala.inline
  def apply(group: String = null, `type`: String = null): StockChartNavigatorSeriesItemStack = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorSeriesItemStack]
  }
}

