package typingsJapgolly.devextreme.mod.DevExpress.viz

import typingsJapgolly.devextreme.AnonBorderColor
import typingsJapgolly.devextreme.AnonColorDashStyle
import typingsJapgolly.devextreme.AnonDisplayMode
import typingsJapgolly.devextreme.devextremeStrings.dash
import typingsJapgolly.devextreme.devextremeStrings.dot
import typingsJapgolly.devextreme.devextremeStrings.excludePoints
import typingsJapgolly.devextreme.devextremeStrings.includePoints
import typingsJapgolly.devextreme.devextremeStrings.longDash
import typingsJapgolly.devextreme.devextremeStrings.nearestPoint
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartSeriesTypesLinepolarseries extends dxPolarChartSeriesTypesCommonPolarChartSeries {
  /** Specifies series elements to be highlighted when a user points to the series. */
  @JSName("hoverMode")
  var hoverMode_dxPolarChartSeriesTypesLinepolarseries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.undefined
  /** Specifies series elements to be highlighted when a user selects the series. */
  @JSName("selectionMode")
  var selectionMode_dxPolarChartSeriesTypesLinepolarseries: js.UndefOr[includePoints | excludePoints | none] = js.undefined
}

object dxPolarChartSeriesTypesLinepolarseries {
  @scala.inline
  def apply(
    argumentField: String = null,
    barPadding: Int | Double = null,
    barWidth: Int | Double = null,
    border: AnonColorDashStyle = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hoverMode: nearestPoint | includePoints | excludePoints | none = null,
    hoverStyle: AnonBorderColor = null,
    ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined,
    label: dxPolarChartSeriesTypesCommonPolarChartSeriesLabel = null,
    maxLabelCount: Int | Double = null,
    minBarSize: Int | Double = null,
    opacity: Int | Double = null,
    point: dxPolarChartSeriesTypesCommonPolarChartSeriesPoint = null,
    selectionMode: includePoints | excludePoints | none = null,
    selectionStyle: AnonBorderColor = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    stack: String = null,
    tagField: String = null,
    valueErrorBar: AnonDisplayMode = null,
    valueField: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxPolarChartSeriesTypesLinepolarseries = {
    val __obj = js.Dynamic.literal()
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
    if (barPadding != null) __obj.updateDynamic("barPadding")(barPadding.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyPoints)) __obj.updateDynamic("ignoreEmptyPoints")(ignoreEmptyPoints.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxLabelCount != null) __obj.updateDynamic("maxLabelCount")(maxLabelCount.asInstanceOf[js.Any])
    if (minBarSize != null) __obj.updateDynamic("minBarSize")(minBarSize.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (tagField != null) __obj.updateDynamic("tagField")(tagField.asInstanceOf[js.Any])
    if (valueErrorBar != null) __obj.updateDynamic("valueErrorBar")(valueErrorBar.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartSeriesTypesLinepolarseries]
  }
}

