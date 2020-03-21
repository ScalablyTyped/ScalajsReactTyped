package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonArgumentComponent
import typingsJapgolly.devextreme.AnonCancelComponentData
import typingsJapgolly.devextreme.AnonComponentDxPolarChart
import typingsJapgolly.devextreme.AnonComponentTElementDxElement
import typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny
import typingsJapgolly.devextreme.AnonConvertToAxisDataType
import typingsJapgolly.devextreme.AnonCustomizeSeriesNameField
import typingsJapgolly.devextreme.AnonDuration
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementModelTarget
import typingsJapgolly.devextreme.AnonElementTarget
import typingsJapgolly.devextreme.AnonFormatModel
import typingsJapgolly.devextreme.AnonJQueryEventModelTarget
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonModelTarget
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonPreviousRange
import typingsJapgolly.devextreme.AnonRange
import typingsJapgolly.devextreme.AnonTargetAny
import typingsJapgolly.devextreme.devextremeStrings.Bright
import typingsJapgolly.devextreme.devextremeStrings.Carmine
import typingsJapgolly.devextreme.devextremeStrings.Default
import typingsJapgolly.devextreme.devextremeStrings.Material
import typingsJapgolly.devextreme.devextremeStrings.Ocean
import typingsJapgolly.devextreme.devextremeStrings.Office
import typingsJapgolly.devextreme.devextremeStrings.Pastel
import typingsJapgolly.devextreme.devextremeStrings.Soft
import typingsJapgolly.devextreme.devextremeStrings.Vintage
import typingsJapgolly.devextreme.devextremeStrings.Violet
import typingsJapgolly.devextreme.devextremeStrings.`Dark Moon`
import typingsJapgolly.devextreme.devextremeStrings.`Dark Violet`
import typingsJapgolly.devextreme.devextremeStrings.`Green Mist`
import typingsJapgolly.devextreme.devextremeStrings.`Harmony Light`
import typingsJapgolly.devextreme.devextremeStrings.`Soft Blue`
import typingsJapgolly.devextreme.devextremeStrings.`Soft Pastel`
import typingsJapgolly.devextreme.devextremeStrings.alternate
import typingsJapgolly.devextreme.devextremeStrings.blend
import typingsJapgolly.devextreme.devextremeStrings.extrapolate
import typingsJapgolly.devextreme.devextremeStrings.genericDotcarmine
import typingsJapgolly.devextreme.devextremeStrings.genericDotcontrast
import typingsJapgolly.devextreme.devextremeStrings.genericDotdark
import typingsJapgolly.devextreme.devextremeStrings.genericDotdarkmoon
import typingsJapgolly.devextreme.devextremeStrings.genericDotdarkviolet
import typingsJapgolly.devextreme.devextremeStrings.genericDotgreenmist
import typingsJapgolly.devextreme.devextremeStrings.genericDotlight
import typingsJapgolly.devextreme.devextremeStrings.genericDotsoftblue
import typingsJapgolly.devextreme.devextremeStrings.hide
import typingsJapgolly.devextreme.devextremeStrings.ios7Dotdefault
import typingsJapgolly.devextreme.devextremeStrings.materialDotblueDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotlimeDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotorangeDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDotpurpleDotlight
import typingsJapgolly.devextreme.devextremeStrings.materialDottealDotlight
import typingsJapgolly.devextreme.devextremeStrings.multiple
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.single_
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartOptions extends BaseChartOptions[dxPolarChart] {
  /** Specifies adaptive layout options. */
  @JSName("adaptiveLayout")
  var adaptiveLayout_dxPolarChartOptions: js.UndefOr[dxPolarChartAdaptiveLayout] = js.undefined
  /** Specifies argument axis options for the PolarChart widget. */
  var argumentAxis: js.UndefOr[dxPolarChartArgumentAxis] = js.undefined
  /** Controls the padding and consequently the angular width of a group of bars with the same argument using relative units. Ignored if the barGroupWidth option is set. */
  var barGroupPadding: js.UndefOr[Double] = js.undefined
  /** Specifies a fixed angular width for groups of bars with the same argument, measured in degrees. Takes precedence over the barGroupPadding option. */
  var barGroupWidth: js.UndefOr[Double] = js.undefined
  /** @deprecated Use CommonPolarChartSeries.barPadding instead. */
  /** Specifies a common bar width as a percentage from 0 to 1. */
  var barWidth: js.UndefOr[Double] = js.undefined
  /** An object defining the configuration options that are common for all axes of the PolarChart widget. */
  var commonAxisSettings: js.UndefOr[dxPolarChartCommonAxisSettings] = js.undefined
  /** An object defining the configuration options that are common for all series of the PolarChart widget. */
  var commonSeriesSettings: js.UndefOr[dxPolarChartCommonSeriesSettings] = js.undefined
  /** Specifies the color of the parent page element. */
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  /** An object providing options for managing data from a data source. */
  var dataPrepareSettings: js.UndefOr[AnonConvertToAxisDataType] = js.undefined
  /** @deprecated Use CommonPolarChartSeries.ignoreEmptyPoints instead. */
  /** Specifies whether or not all bars in a series must have the same angle, or may have different angles if any points in other series are missing. */
  var equalBarWidth: js.UndefOr[Boolean] = js.undefined
  /** Specifies the options of a chart's legend. */
  @JSName("legend")
  var legend_dxPolarChartOptions: js.UndefOr[dxPolarChartLegend] = js.undefined
  /** Forces the widget to treat negative values as zeroes. Applies to stacked-like series only. */
  var negativesAsZeroes: js.UndefOr[Boolean] = js.undefined
  /** A function that is executed when a label on the argument axis is clicked or tapped. */
  var onArgumentAxisClick: js.UndefOr[(js.Function1[/* e */ AnonArgumentComponent, _]) | String] = js.undefined
  /** A function that is executed when a legend item is clicked or tapped. */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ AnonJQueryEventModelTarget, _]) | String] = js.undefined
  /** A function that is executed when a series is clicked or tapped. */
  var onSeriesClick: js.UndefOr[(js.Function1[/* e */ AnonJQueryEventModelTarget, _]) | String] = js.undefined
  /** A function that is executed after the pointer enters or leaves a series. */
  var onSeriesHoverChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxPolarChart, _]] = js.undefined
  /** A function that is executed when a series is selected or selection is canceled. */
  var onSeriesSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxPolarChart, _]] = js.undefined
  /** A function that is executed when zooming or panning ends. */
  var onZoomEnd: js.UndefOr[js.Function1[/* e */ AnonPreviousRange, _]] = js.undefined
  /** A function that is executed when zooming or panning begins. */
  var onZoomStart: js.UndefOr[js.Function1[/* e */ AnonRange, _]] = js.undefined
  /** Specifies how the chart must behave when series point labels overlap. */
  var resolveLabelOverlapping: js.UndefOr[hide | none] = js.undefined
  /** Specifies whether a single series or multiple series can be selected in the chart. */
  var seriesSelectionMode: js.UndefOr[multiple | single_] = js.undefined
  /** Defines options for the series template. */
  var seriesTemplate: js.UndefOr[AnonCustomizeSeriesNameField] = js.undefined
  /** Specifies options for PolarChart widget series. */
  @JSName("series")
  var series_dxPolarChartOptions: js.UndefOr[PolarChartSeries | js.Array[PolarChartSeries]] = js.undefined
  /** Configures tooltips. */
  @JSName("tooltip")
  var tooltip_dxPolarChartOptions: js.UndefOr[dxPolarChartTooltip] = js.undefined
  /** Indicates whether or not to display a "spider web". */
  var useSpiderWeb: js.UndefOr[Boolean] = js.undefined
  /** Specifies value axis options for the PolarChart widget. */
  var valueAxis: js.UndefOr[dxPolarChartValueAxis] = js.undefined
}

object dxPolarChartOptions {
  @scala.inline
  def apply(
    adaptiveLayout: dxPolarChartAdaptiveLayout = null,
    animation: AnonDuration | Boolean = null,
    argumentAxis: dxPolarChartArgumentAxis = null,
    barGroupPadding: Int | Double = null,
    barGroupWidth: Int | Double = null,
    barWidth: Int | Double = null,
    bindingOptions: js.Any = null,
    commonAxisSettings: dxPolarChartCommonAxisSettings = null,
    commonSeriesSettings: dxPolarChartCommonSeriesSettings = null,
    containerBackgroundColor: String = null,
    customizeLabel: /* pointInfo */ js.Any => CallbackTo[dxChartSeriesTypesCommonSeriesLabel] = null,
    customizePoint: /* pointInfo */ js.Any => CallbackTo[dxChartSeriesTypesCommonSeriesPoint] = null,
    dataPrepareSettings: AnonConvertToAxisDataType = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    equalBarWidth: js.UndefOr[Boolean] = js.undefined,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    legend: dxPolarChartLegend = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    negativesAsZeroes: js.UndefOr[Boolean] = js.undefined,
    onArgumentAxisClick: (js.Function1[/* e */ AnonArgumentComponent, _]) | String = null,
    onDisposing: /* e */ AnonModel[dxPolarChart] => CallbackTo[js.Any] = null,
    onDone: /* e */ AnonComponentTElementDxElement[dxPolarChart] => CallbackTo[js.Any] = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxPolarChart] => CallbackTo[js.Any] = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxPolarChart] => CallbackTo[js.Any] = null,
    onExporting: /* e */ AnonFormatModel[dxPolarChart] => CallbackTo[js.Any] = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxPolarChart] => CallbackTo[js.Any] = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxPolarChart] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxPolarChart] => CallbackTo[js.Any] = null,
    onLegendClick: (js.Function1[/* e */ AnonJQueryEventModelTarget, _]) | String = null,
    onOptionChanged: /* e */ AnonName[dxPolarChart] => CallbackTo[js.Any] = null,
    onPointClick: (js.Function1[/* e */ AnonModelTarget[dxPolarChart], _]) | String = null,
    onPointHoverChanged: /* e */ AnonElementTarget => CallbackTo[js.Any] = null,
    onPointSelectionChanged: /* e */ AnonElementTarget => CallbackTo[js.Any] = null,
    onSeriesClick: (js.Function1[/* e */ AnonJQueryEventModelTarget, _]) | String = null,
    onSeriesHoverChanged: /* e */ AnonComponentDxPolarChart => CallbackTo[js.Any] = null,
    onSeriesSelectionChanged: /* e */ AnonComponentDxPolarChart => CallbackTo[js.Any] = null,
    onTooltipHidden: /* e */ AnonElementModelTarget[dxPolarChart] => CallbackTo[js.Any] = null,
    onTooltipShown: /* e */ AnonElementModelTarget[dxPolarChart] => CallbackTo[js.Any] = null,
    onZoomEnd: /* e */ AnonPreviousRange => CallbackTo[js.Any] = null,
    onZoomStart: /* e */ AnonRange => CallbackTo[js.Any] = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    pointSelectionMode: multiple | single_ = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    resolveLabelOverlapping: hide | none = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    series: PolarChartSeries | js.Array[PolarChartSeries] = null,
    seriesSelectionMode: multiple | single_ = null,
    seriesTemplate: AnonCustomizeSeriesNameField = null,
    size: BaseWidgetSize = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: dxPolarChartTooltip = null,
    useSpiderWeb: js.UndefOr[Boolean] = js.undefined,
    valueAxis: dxPolarChartValueAxis = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxPolarChartOptions = {
    val __obj = js.Dynamic.literal()
    if (adaptiveLayout != null) __obj.updateDynamic("adaptiveLayout")(adaptiveLayout.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (argumentAxis != null) __obj.updateDynamic("argumentAxis")(argumentAxis.asInstanceOf[js.Any])
    if (barGroupPadding != null) __obj.updateDynamic("barGroupPadding")(barGroupPadding.asInstanceOf[js.Any])
    if (barGroupWidth != null) __obj.updateDynamic("barGroupWidth")(barGroupWidth.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (commonAxisSettings != null) __obj.updateDynamic("commonAxisSettings")(commonAxisSettings.asInstanceOf[js.Any])
    if (commonSeriesSettings != null) __obj.updateDynamic("commonSeriesSettings")(commonSeriesSettings.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (customizeLabel != null) __obj.updateDynamic("customizeLabel")(js.Any.fromFunction1((t0: /* pointInfo */ js.Any) => customizeLabel(t0).runNow()))
    if (customizePoint != null) __obj.updateDynamic("customizePoint")(js.Any.fromFunction1((t0: /* pointInfo */ js.Any) => customizePoint(t0).runNow()))
    if (dataPrepareSettings != null) __obj.updateDynamic("dataPrepareSettings")(dataPrepareSettings.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(equalBarWidth)) __obj.updateDynamic("equalBarWidth")(equalBarWidth.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(negativesAsZeroes)) __obj.updateDynamic("negativesAsZeroes")(negativesAsZeroes.asInstanceOf[js.Any])
    if (onArgumentAxisClick != null) __obj.updateDynamic("onArgumentAxisClick")(onArgumentAxisClick.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxPolarChart]) => onDisposing(t0).runNow()))
    if (onDone != null) __obj.updateDynamic("onDone")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElement[typingsJapgolly.devextreme.mod.DevExpress.viz.dxPolarChart]) => onDone(t0).runNow()))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxPolarChart]) => onDrawn(t0).runNow()))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxPolarChart]) => onExported(t0).runNow()))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFormatModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxPolarChart]) => onExporting(t0).runNow()))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponentData[typingsJapgolly.devextreme.mod.DevExpress.viz.dxPolarChart]) => onFileSaving(t0).runNow()))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonTargetAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxPolarChart]) => onIncidentOccurred(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.viz.dxPolarChart]) => onInitialized(t0).runNow()))
    if (onLegendClick != null) __obj.updateDynamic("onLegendClick")(onLegendClick.asInstanceOf[js.Any])
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.viz.dxPolarChart]) => onOptionChanged(t0).runNow()))
    if (onPointClick != null) __obj.updateDynamic("onPointClick")(onPointClick.asInstanceOf[js.Any])
    if (onPointHoverChanged != null) __obj.updateDynamic("onPointHoverChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementTarget) => onPointHoverChanged(t0).runNow()))
    if (onPointSelectionChanged != null) __obj.updateDynamic("onPointSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementTarget) => onPointSelectionChanged(t0).runNow()))
    if (onSeriesClick != null) __obj.updateDynamic("onSeriesClick")(onSeriesClick.asInstanceOf[js.Any])
    if (onSeriesHoverChanged != null) __obj.updateDynamic("onSeriesHoverChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxPolarChart) => onSeriesHoverChanged(t0).runNow()))
    if (onSeriesSelectionChanged != null) __obj.updateDynamic("onSeriesSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxPolarChart) => onSeriesSelectionChanged(t0).runNow()))
    if (onTooltipHidden != null) __obj.updateDynamic("onTooltipHidden")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementModelTarget[typingsJapgolly.devextreme.mod.DevExpress.viz.dxPolarChart]) => onTooltipHidden(t0).runNow()))
    if (onTooltipShown != null) __obj.updateDynamic("onTooltipShown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementModelTarget[typingsJapgolly.devextreme.mod.DevExpress.viz.dxPolarChart]) => onTooltipShown(t0).runNow()))
    if (onZoomEnd != null) __obj.updateDynamic("onZoomEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonPreviousRange) => onZoomEnd(t0).runNow()))
    if (onZoomStart != null) __obj.updateDynamic("onZoomStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonRange) => onZoomStart(t0).runNow()))
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (pointSelectionMode != null) __obj.updateDynamic("pointSelectionMode")(pointSelectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (resolveLabelOverlapping != null) __obj.updateDynamic("resolveLabelOverlapping")(resolveLabelOverlapping.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesSelectionMode != null) __obj.updateDynamic("seriesSelectionMode")(seriesSelectionMode.asInstanceOf[js.Any])
    if (seriesTemplate != null) __obj.updateDynamic("seriesTemplate")(seriesTemplate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(useSpiderWeb)) __obj.updateDynamic("useSpiderWeb")(useSpiderWeb.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartOptions]
  }
}

