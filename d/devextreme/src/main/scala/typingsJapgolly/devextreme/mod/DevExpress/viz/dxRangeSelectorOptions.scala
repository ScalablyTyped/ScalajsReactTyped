package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonAggregateByCategory
import typingsJapgolly.devextreme.AnonAllowSlidersSwap
import typingsJapgolly.devextreme.AnonBarGroupPadding
import typingsJapgolly.devextreme.AnonCancelComponentData
import typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementEventModel
import typingsJapgolly.devextreme.AnonFormatModel
import typingsJapgolly.devextreme.AnonImage
import typingsJapgolly.devextreme.AnonInvalidRangeColor
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonOpacity
import typingsJapgolly.devextreme.AnonOpacityWidth
import typingsJapgolly.devextreme.AnonRight
import typingsJapgolly.devextreme.AnonTargetAny
import typingsJapgolly.devextreme.devextremeStrings.auto
import typingsJapgolly.devextreme.devextremeStrings.genericDotcarmine
import typingsJapgolly.devextreme.devextremeStrings.genericDotcontrast
import typingsJapgolly.devextreme.devextremeStrings.genericDotdark
import typingsJapgolly.devextreme.devextremeStrings.genericDotdarkmoon
import typingsJapgolly.devextreme.devextremeStrings.genericDotdarkviolet
import typingsJapgolly.devextreme.devextremeStrings.genericDotgreenmist
import typingsJapgolly.devextreme.devextremeStrings.genericDotlight
import typingsJapgolly.devextreme.devextremeStrings.genericDotsoftblue
import typingsJapgolly.devextreme.devextremeStrings.ios7Dotdefault
import typingsJapgolly.devextreme.devextremeStrings.keep
import typingsJapgolly.devextreme.devextremeStrings.materialDotblueDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotlimeDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotorangeDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotpurpleDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDottealDotlight
import typingsJapgolly.devextreme.devextremeStrings.reset
import typingsJapgolly.devextreme.devextremeStrings.shift
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxRangeSelectorOptions extends BaseWidgetOptions[dxRangeSelector] {
  /** Specifies the options for the range selector's background. */
  var background: js.UndefOr[AnonImage] = js.undefined
  /** Specifies the RangeSelector's behavior options. */
  var behavior: js.UndefOr[AnonAllowSlidersSwap] = js.undefined
  /** Specifies the options required to display a chart as the range selector's background. */
  var chart: js.UndefOr[AnonBarGroupPadding] = js.undefined
  /** Specifies the color of the parent page element. */
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  /** Specifies a data source for the scale values and for the chart at the background. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** Specifies the data source field that provides data for the scale. */
  var dataSourceField: js.UndefOr[String] = js.undefined
  /** Range selector's indent options. */
  var indent: js.UndefOr[AnonRight] = js.undefined
  /** A function that is executed after the widget's value is changed. */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ AnonElementEventModel, _]] = js.undefined
  /** Specifies options of the range selector's scale. */
  var scale: js.UndefOr[AnonAggregateByCategory] = js.undefined
  /** Specifies the color of the selected range. */
  var selectedRangeColor: js.UndefOr[String] = js.undefined
  /** Specifies how the selected range should behave when data is updated. Applies only when the RangeSelector is bound to a data source. */
  var selectedRangeUpdateMode: js.UndefOr[auto | keep | reset | shift] = js.undefined
  /** Specifies range selector shutter options. */
  var shutter: js.UndefOr[AnonOpacity] = js.undefined
  /** Specifies the appearance of the range selector's slider handles. */
  var sliderHandle: js.UndefOr[AnonOpacityWidth] = js.undefined
  /** Defines the options of the range selector slider markers. */
  var sliderMarker: js.UndefOr[AnonInvalidRangeColor] = js.undefined
  /** The selected range (initial or current). Equals the entire scale when not set. */
  var value: js.UndefOr[(js.Array[Double | String | js.Date]) | VizRange] = js.undefined
}

object dxRangeSelectorOptions {
  @scala.inline
  def apply(
    background: AnonImage = null,
    behavior: AnonAllowSlidersSwap = null,
    bindingOptions: js.Any = null,
    chart: AnonBarGroupPadding = null,
    containerBackgroundColor: String = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    dataSourceField: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    indent: AnonRight = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    onDisposing: /* e */ AnonModel[dxRangeSelector] => CallbackTo[js.Any] = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxRangeSelector] => CallbackTo[js.Any] = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxRangeSelector] => CallbackTo[js.Any] = null,
    onExporting: /* e */ AnonFormatModel[dxRangeSelector] => CallbackTo[js.Any] = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxRangeSelector] => CallbackTo[js.Any] = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxRangeSelector] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxRangeSelector] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxRangeSelector] => CallbackTo[js.Any] = null,
    onValueChanged: /* e */ AnonElementEventModel => CallbackTo[js.Any] = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scale: AnonAggregateByCategory = null,
    selectedRangeColor: String = null,
    selectedRangeUpdateMode: auto | keep | reset | shift = null,
    shutter: AnonOpacity = null,
    size: BaseWidgetSize = null,
    sliderHandle: AnonOpacityWidth = null,
    sliderMarker: AnonInvalidRangeColor = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseWidgetTooltip = null,
    value: (js.Array[Double | String | js.Date]) | VizRange = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxRangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceField != null) __obj.updateDynamic("dataSourceField")(dataSourceField.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxRangeSelector]) => onDisposing(t0).runNow()))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxRangeSelector]) => onDrawn(t0).runNow()))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxRangeSelector]) => onExported(t0).runNow()))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFormatModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxRangeSelector]) => onExporting(t0).runNow()))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponentData[typingsJapgolly.devextreme.mod.DevExpress.viz.dxRangeSelector]) => onFileSaving(t0).runNow()))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonTargetAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxRangeSelector]) => onIncidentOccurred(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.viz.dxRangeSelector]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.viz.dxRangeSelector]) => onOptionChanged(t0).runNow()))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementEventModel) => onValueChanged(t0).runNow()))
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (selectedRangeColor != null) __obj.updateDynamic("selectedRangeColor")(selectedRangeColor.asInstanceOf[js.Any])
    if (selectedRangeUpdateMode != null) __obj.updateDynamic("selectedRangeUpdateMode")(selectedRangeUpdateMode.asInstanceOf[js.Any])
    if (shutter != null) __obj.updateDynamic("shutter")(shutter.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sliderHandle != null) __obj.updateDynamic("sliderHandle")(sliderHandle.asInstanceOf[js.Any])
    if (sliderMarker != null) __obj.updateDynamic("sliderMarker")(sliderMarker.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxRangeSelectorOptions]
  }
}

