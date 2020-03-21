package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisDefaultsCrosshair extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dashType: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[ChartAxisDefaultsCrosshairTooltip] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ChartAxisDefaultsCrosshair {
  @scala.inline
  def apply(
    color: String = null,
    dashType: String = null,
    opacity: Int | Double = null,
    tooltip: ChartAxisDefaultsCrosshairTooltip = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): ChartAxisDefaultsCrosshair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisDefaultsCrosshair]
  }
}

