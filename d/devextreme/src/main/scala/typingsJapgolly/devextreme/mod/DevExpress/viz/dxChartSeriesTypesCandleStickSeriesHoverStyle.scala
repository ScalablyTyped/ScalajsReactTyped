package typingsJapgolly.devextreme.mod.DevExpress.viz

import typingsJapgolly.devextreme.devextremeStrings.dash
import typingsJapgolly.devextreme.devextremeStrings.dot
import typingsJapgolly.devextreme.devextremeStrings.longDash
import typingsJapgolly.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the appearance adopted by the series when a user points to it. */
trait dxChartSeriesTypesCandleStickSeriesHoverStyle extends dxChartSeriesTypesCommonSeriesHoverStyle {
  /** Configures hatching that applies when a user points to the series. */
  @JSName("hatching")
  var hatching_dxChartSeriesTypesCandleStickSeriesHoverStyle: js.UndefOr[dxChartSeriesTypesCandleStickSeriesHoverStyleHatching] = js.undefined
}

object dxChartSeriesTypesCandleStickSeriesHoverStyle {
  @scala.inline
  def apply(
    border: dxChartSeriesTypesCommonSeriesHoverStyleBorder = null,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hatching: dxChartSeriesTypesCandleStickSeriesHoverStyleHatching = null,
    width: Int | Double = null
  ): dxChartSeriesTypesCandleStickSeriesHoverStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeriesHoverStyle]
  }
}

