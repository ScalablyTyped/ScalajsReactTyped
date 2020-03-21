package typingsJapgolly.devextreme.mod.DevExpress.viz

import typingsJapgolly.devextreme.AnonColorLevel
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

/** Describes settings supported by a series of the step rea type. */
trait dxChartSeriesTypesStepAreaSeries extends dxChartSeriesTypesCommonSeries {
  /** Configures data aggregation for the series. */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesAggregation] = js.undefined
  /** Configures the series border (in area-like series) or the series point border (in bar-like and bubble series). */
  @JSName("border")
  var border_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesBorder] = js.undefined
  /** Specifies series elements to be highlighted when a user points to a series. */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesStepAreaSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.undefined
  /** Configures the appearance adopted by the series when a user points to it. */
  @JSName("hoverStyle")
  var hoverStyle_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesHoverStyle] = js.undefined
  /** Configures point labels. */
  @JSName("label")
  var label_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesLabel] = js.undefined
  /** Configures series points in scatter, line- and area-like series. */
  @JSName("point")
  var point_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesPoint] = js.undefined
  /** Specifies series elements to be highlighted when a user selects a series. */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesStepAreaSeries: js.UndefOr[includePoints | excludePoints | none] = js.undefined
  /** Configures the appearance adopted by the series when a user selects it. */
  @JSName("selectionStyle")
  var selectionStyle_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesSelectionStyle] = js.undefined
}

object dxChartSeriesTypesStepAreaSeries {
  @scala.inline
  def apply(
    aggregation: dxChartSeriesTypesStepAreaSeriesAggregation = null,
    argumentField: String = null,
    axis: String = null,
    barOverlapGroup: String = null,
    barPadding: Int | Double = null,
    barWidth: Int | Double = null,
    border: dxChartSeriesTypesStepAreaSeriesBorder = null,
    closeValueField: String = null,
    color: String = null,
    cornerRadius: Int | Double = null,
    dashStyle: dash | dot | longDash | solid = null,
    highValueField: String = null,
    hoverMode: nearestPoint | includePoints | excludePoints | none = null,
    hoverStyle: dxChartSeriesTypesStepAreaSeriesHoverStyle = null,
    ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined,
    innerColor: String = null,
    label: dxChartSeriesTypesStepAreaSeriesLabel = null,
    lowValueField: String = null,
    maxLabelCount: Int | Double = null,
    minBarSize: Int | Double = null,
    opacity: Int | Double = null,
    openValueField: String = null,
    pane: String = null,
    point: dxChartSeriesTypesStepAreaSeriesPoint = null,
    rangeValue1Field: String = null,
    rangeValue2Field: String = null,
    reduction: AnonColorLevel = null,
    selectionMode: includePoints | excludePoints | none = null,
    selectionStyle: dxChartSeriesTypesStepAreaSeriesSelectionStyle = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    sizeField: String = null,
    stack: String = null,
    tagField: String = null,
    valueErrorBar: AnonDisplayMode = null,
    valueField: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxChartSeriesTypesStepAreaSeries = {
    val __obj = js.Dynamic.literal()
    if (aggregation != null) __obj.updateDynamic("aggregation")(aggregation.asInstanceOf[js.Any])
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (barOverlapGroup != null) __obj.updateDynamic("barOverlapGroup")(barOverlapGroup.asInstanceOf[js.Any])
    if (barPadding != null) __obj.updateDynamic("barPadding")(barPadding.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (closeValueField != null) __obj.updateDynamic("closeValueField")(closeValueField.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (highValueField != null) __obj.updateDynamic("highValueField")(highValueField.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyPoints)) __obj.updateDynamic("ignoreEmptyPoints")(ignoreEmptyPoints.asInstanceOf[js.Any])
    if (innerColor != null) __obj.updateDynamic("innerColor")(innerColor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lowValueField != null) __obj.updateDynamic("lowValueField")(lowValueField.asInstanceOf[js.Any])
    if (maxLabelCount != null) __obj.updateDynamic("maxLabelCount")(maxLabelCount.asInstanceOf[js.Any])
    if (minBarSize != null) __obj.updateDynamic("minBarSize")(minBarSize.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (openValueField != null) __obj.updateDynamic("openValueField")(openValueField.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (rangeValue1Field != null) __obj.updateDynamic("rangeValue1Field")(rangeValue1Field.asInstanceOf[js.Any])
    if (rangeValue2Field != null) __obj.updateDynamic("rangeValue2Field")(rangeValue2Field.asInstanceOf[js.Any])
    if (reduction != null) __obj.updateDynamic("reduction")(reduction.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.asInstanceOf[js.Any])
    if (sizeField != null) __obj.updateDynamic("sizeField")(sizeField.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (tagField != null) __obj.updateDynamic("tagField")(tagField.asInstanceOf[js.Any])
    if (valueErrorBar != null) __obj.updateDynamic("valueErrorBar")(valueErrorBar.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeries]
  }
}

