package typingsJapgolly.devextreme.mod.DevExpress.viz

import typingsJapgolly.devextreme.devextremeStrings.dash
import typingsJapgolly.devextreme.devextremeStrings.dot
import typingsJapgolly.devextreme.devextremeStrings.longDash
import typingsJapgolly.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the appearance adopted by the series when a user selects it. */
trait dxChartSeriesTypesStepAreaSeriesSelectionStyle extends dxChartSeriesTypesCommonSeriesSelectionStyle {
  /** Configures the appearance adopted by the series border (in area-like series) or the series point border (in bar-like and bubble series) when a user selects the series. */
  @JSName("border")
  var border_dxChartSeriesTypesStepAreaSeriesSelectionStyle: js.UndefOr[dxChartSeriesTypesStepAreaSeriesSelectionStyleBorder] = js.undefined
}

object dxChartSeriesTypesStepAreaSeriesSelectionStyle {
  @scala.inline
  def apply(
    border: dxChartSeriesTypesStepAreaSeriesSelectionStyleBorder = null,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hatching: dxChartSeriesTypesCommonSeriesSelectionStyleHatching = null,
    width: Int | Double = null
  ): dxChartSeriesTypesStepAreaSeriesSelectionStyle = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeriesSelectionStyle]
  }
}

