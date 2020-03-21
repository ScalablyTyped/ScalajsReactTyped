package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonCancelComponentData
import typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementDxElementModelAny
import typingsJapgolly.devextreme.AnonFormatModel
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonTargetAny
import typingsJapgolly.devextreme.devextremeStrings.area
import typingsJapgolly.devextreme.devextremeStrings.bar
import typingsJapgolly.devextreme.devextremeStrings.circle
import typingsJapgolly.devextreme.devextremeStrings.cross
import typingsJapgolly.devextreme.devextremeStrings.genericDotcarmine
import typingsJapgolly.devextreme.devextremeStrings.genericDotcontrast
import typingsJapgolly.devextreme.devextremeStrings.genericDotdark
import typingsJapgolly.devextreme.devextremeStrings.genericDotdarkmoon
import typingsJapgolly.devextreme.devextremeStrings.genericDotdarkviolet
import typingsJapgolly.devextreme.devextremeStrings.genericDotgreenmist
import typingsJapgolly.devextreme.devextremeStrings.genericDotlight
import typingsJapgolly.devextreme.devextremeStrings.genericDotsoftblue
import typingsJapgolly.devextreme.devextremeStrings.ios7Dotdefault
import typingsJapgolly.devextreme.devextremeStrings.line
import typingsJapgolly.devextreme.devextremeStrings.materialDotblueDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotlimeDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotorangeDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotpurpleDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDottealDotlight
import typingsJapgolly.devextreme.devextremeStrings.polygon
import typingsJapgolly.devextreme.devextremeStrings.spline
import typingsJapgolly.devextreme.devextremeStrings.splinearea
import typingsJapgolly.devextreme.devextremeStrings.square
import typingsJapgolly.devextreme.devextremeStrings.steparea
import typingsJapgolly.devextreme.devextremeStrings.stepline
import typingsJapgolly.devextreme.devextremeStrings.triangle
import typingsJapgolly.devextreme.devextremeStrings.winloss
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSparklineOptions extends BaseSparklineOptions[dxSparkline] {
  /** Specifies the data source field that provides arguments for a sparkline. */
  var argumentField: js.UndefOr[String] = js.undefined
  /** Sets a color for the bars indicating negative values. Available for a sparkline of the bar type only. */
  var barNegativeColor: js.UndefOr[String] = js.undefined
  /** Sets a color for the bars indicating positive values. Available for a sparkline of the bar type only. */
  var barPositiveColor: js.UndefOr[String] = js.undefined
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** Sets a color for the boundary of both the first and last points on a sparkline. */
  var firstLastColor: js.UndefOr[String] = js.undefined
  /** Specifies whether the sparkline should ignore null data points. */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined
  /** Sets a color for a line on a sparkline. Available for the sparklines of the line- and area-like types. */
  var lineColor: js.UndefOr[String] = js.undefined
  /** Specifies a width for a line on a sparkline. Available for the sparklines of the line- and area-like types. */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /** Sets a color for the bars indicating the values that are less than the winloss threshold. Available for a sparkline of the winloss type only. */
  var lossColor: js.UndefOr[String] = js.undefined
  /** Sets a color for the boundary of the maximum point on a sparkline. */
  var maxColor: js.UndefOr[String] = js.undefined
  /** Specifies the maximum value of the sparkline's value axis. */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** Sets a color for the boundary of the minimum point on a sparkline. */
  var minColor: js.UndefOr[String] = js.undefined
  /** Specifies the minimum value of the sparkline value axis. */
  var minValue: js.UndefOr[Double] = js.undefined
  /** Sets a color for points on a sparkline. Available for the sparklines of the line- and area-like types. */
  var pointColor: js.UndefOr[String] = js.undefined
  /** Specifies the diameter of sparkline points in pixels. Available for the sparklines of line- and area-like types. */
  var pointSize: js.UndefOr[Double] = js.undefined
  /** Specifies a symbol to use as a point marker on a sparkline. Available for the sparklines of the line- and area-like types. */
  var pointSymbol: js.UndefOr[circle | cross | polygon | square | triangle] = js.undefined
  /** Specifies whether or not to indicate both the first and last values on a sparkline. */
  var showFirstLast: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not to indicate both the minimum and maximum values on a sparkline. */
  var showMinMax: js.UndefOr[Boolean] = js.undefined
  /** Determines the type of a sparkline. */
  var `type`: js.UndefOr[area | bar | line | spline | splinearea | steparea | stepline | winloss] = js.undefined
  /** Specifies the data source field that provides values for a sparkline. */
  var valueField: js.UndefOr[String] = js.undefined
  /** Sets a color for the bars indicating the values greater than a winloss threshold. Available for a sparkline of the winloss type only. */
  var winColor: js.UndefOr[String] = js.undefined
  /** Specifies a value that serves as a threshold for the sparkline of the winloss type. */
  var winlossThreshold: js.UndefOr[Double] = js.undefined
}

object dxSparklineOptions {
  @scala.inline
  def apply(
    argumentField: String = null,
    barNegativeColor: String = null,
    barPositiveColor: String = null,
    bindingOptions: js.Any = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    firstLastColor: String = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined,
    lineColor: String = null,
    lineWidth: Int | Double = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    lossColor: String = null,
    margin: BaseWidgetMargin = null,
    maxColor: String = null,
    maxValue: Int | Double = null,
    minColor: String = null,
    minValue: Int | Double = null,
    onDisposing: /* e */ AnonModel[dxSparkline] => CallbackTo[js.Any] = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxSparkline] => CallbackTo[js.Any] = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxSparkline] => CallbackTo[js.Any] = null,
    onExporting: /* e */ AnonFormatModel[dxSparkline] => CallbackTo[js.Any] = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxSparkline] => CallbackTo[js.Any] = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxSparkline] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxSparkline] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxSparkline] => CallbackTo[js.Any] = null,
    onTooltipHidden: /* e */ AnonElementDxElementModelAny[dxSparkline] => CallbackTo[js.Any] = null,
    onTooltipShown: /* e */ AnonElementDxElementModelAny[dxSparkline] => CallbackTo[js.Any] = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    pointColor: String = null,
    pointSize: Int | Double = null,
    pointSymbol: circle | cross | polygon | square | triangle = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showFirstLast: js.UndefOr[Boolean] = js.undefined,
    showMinMax: js.UndefOr[Boolean] = js.undefined,
    size: BaseWidgetSize = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseSparklineTooltip = null,
    `type`: area | bar | line | spline | splinearea | steparea | stepline | winloss = null,
    valueField: String = null,
    width: Double | String | (js.Function0[Double | String]) = null,
    winColor: String = null,
    winlossThreshold: Int | Double = null
  ): dxSparklineOptions = {
    val __obj = js.Dynamic.literal()
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
    if (barNegativeColor != null) __obj.updateDynamic("barNegativeColor")(barNegativeColor.asInstanceOf[js.Any])
    if (barPositiveColor != null) __obj.updateDynamic("barPositiveColor")(barPositiveColor.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (firstLastColor != null) __obj.updateDynamic("firstLastColor")(firstLastColor.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyPoints)) __obj.updateDynamic("ignoreEmptyPoints")(ignoreEmptyPoints.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (lossColor != null) __obj.updateDynamic("lossColor")(lossColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxColor != null) __obj.updateDynamic("maxColor")(maxColor.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minColor != null) __obj.updateDynamic("minColor")(minColor.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSparkline]) => onDisposing(t0).runNow()))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSparkline]) => onDrawn(t0).runNow()))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSparkline]) => onExported(t0).runNow()))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFormatModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSparkline]) => onExporting(t0).runNow()))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponentData[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSparkline]) => onFileSaving(t0).runNow()))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonTargetAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSparkline]) => onIncidentOccurred(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSparkline]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSparkline]) => onOptionChanged(t0).runNow()))
    if (onTooltipHidden != null) __obj.updateDynamic("onTooltipHidden")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSparkline]) => onTooltipHidden(t0).runNow()))
    if (onTooltipShown != null) __obj.updateDynamic("onTooltipShown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxSparkline]) => onTooltipShown(t0).runNow()))
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (pointSymbol != null) __obj.updateDynamic("pointSymbol")(pointSymbol.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstLast)) __obj.updateDynamic("showFirstLast")(showFirstLast.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinMax)) __obj.updateDynamic("showMinMax")(showMinMax.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (winColor != null) __obj.updateDynamic("winColor")(winColor.asInstanceOf[js.Any])
    if (winlossThreshold != null) __obj.updateDynamic("winlossThreshold")(winlossThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSparklineOptions]
  }
}

