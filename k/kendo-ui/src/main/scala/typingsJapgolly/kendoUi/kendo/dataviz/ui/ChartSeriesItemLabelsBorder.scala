package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemLabelsBorder extends js.Object {
  var color: js.UndefOr[String | js.Function] = js.undefined
  var dashType: js.UndefOr[String | js.Function] = js.undefined
  var width: js.UndefOr[Double | js.Function] = js.undefined
}

object ChartSeriesItemLabelsBorder {
  @scala.inline
  def apply(
    color: String | js.Function = null,
    dashType: String | js.Function = null,
    width: Double | js.Function = null
  ): ChartSeriesItemLabelsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemLabelsBorder]
  }
}

