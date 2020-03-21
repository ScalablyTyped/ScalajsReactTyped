package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonActionType
import typingsJapgolly.devextreme.AnonAllowMouseWheel
import typingsJapgolly.devextreme.AnonArgument
import typingsJapgolly.devextreme.AnonAxis
import typingsJapgolly.devextreme.AnonCancelComponentData
import typingsJapgolly.devextreme.AnonCheckTypeForAllData
import typingsJapgolly.devextreme.AnonComponentDxChart
import typingsJapgolly.devextreme.AnonComponentTElementDxElement
import typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny
import typingsJapgolly.devextreme.AnonCustomizeSeries
import typingsJapgolly.devextreme.AnonDuration
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementModelTarget
import typingsJapgolly.devextreme.AnonElementTarget
import typingsJapgolly.devextreme.AnonEventJQueryEventModel
import typingsJapgolly.devextreme.AnonFormatModel
import typingsJapgolly.devextreme.AnonHorizontalLine
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonModelTarget
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonOffset
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
import typingsJapgolly.devextreme.devextremeStrings.all
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
import typingsJapgolly.devextreme.devextremeStrings.mouse
import typingsJapgolly.devextreme.devextremeStrings.multiple
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.single_
import typingsJapgolly.devextreme.devextremeStrings.stack
import typingsJapgolly.devextreme.devextremeStrings.touch
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartOptions extends BaseChartOptions[dxChart] {
  /** Specifies whether to adjust the value axis's visualRange when the argument axis is being zoomed or panned. */
  var adjustOnZoom: js.UndefOr[Boolean] = js.undefined
  /** Specifies the annotation collection. */
  var annotations: js.UndefOr[js.Array[dxChartAnnotationConfig | _]] = js.undefined
  /** Configures the argument axis. */
  var argumentAxis: js.UndefOr[dxChartArgumentAxis] = js.undefined
  /** Specifies whether to hide series point markers automatically to reduce visual clutter. */
  var autoHidePointMarkers: js.UndefOr[Boolean] = js.undefined
  /** Controls the padding and consequently the width of a group of bars with the same argument using relative units. Ignored if the barGroupWidth option is set. */
  var barGroupPadding: js.UndefOr[Double] = js.undefined
  /** Specifies a fixed width for groups of bars with the same argument, measured in pixels. Takes precedence over the barGroupPadding option. */
  var barGroupWidth: js.UndefOr[Double] = js.undefined
  /** @deprecated Use CommonSeries.barPadding instead. */
  /** Controls the width of bars in the widget. Applies only to bar-like series and when the equalBarWidth option is true. */
  var barWidth: js.UndefOr[Double] = js.undefined
  /** Specifies settings common for all annotations in the chart. */
  var commonAnnotationSettings: js.UndefOr[dxChartCommonAnnotationConfig] = js.undefined
  /** Defines common settings for both the argument and value axis in a chart. */
  var commonAxisSettings: js.UndefOr[dxChartCommonAxisSettings] = js.undefined
  /** Defines common settings for all panes in a chart. */
  var commonPaneSettings: js.UndefOr[dxChartCommonPaneSettings] = js.undefined
  /** Specifies settings common for all series in the chart. */
  var commonSeriesSettings: js.UndefOr[dxChartCommonSeriesSettings] = js.undefined
  /** Colors the background of the chart container. */
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  /** Configures the crosshair feature. */
  var crosshair: js.UndefOr[AnonHorizontalLine] = js.undefined
  /** Customizes an individual annotation. */
  var customizeAnnotation: js.UndefOr[
    js.Function1[/* annotation */ dxChartAnnotationConfig | js.Any, dxChartAnnotationConfig]
  ] = js.undefined
  /** Processes data before visualizing it. */
  var dataPrepareSettings: js.UndefOr[AnonCheckTypeForAllData] = js.undefined
  /** Specifies which pane should be used by default. */
  var defaultPane: js.UndefOr[String] = js.undefined
  /** @deprecated Use CommonSeries.ignoreEmptyPoints instead. */
  /** Specifies whether all bars should have equal width, even if some values are missing from a series. Applies only to bar-like series. */
  var equalBarWidth: js.UndefOr[Boolean] = js.undefined
  /** Specifies the options of a chart's legend. */
  @JSName("legend")
  var legend_dxChartOptions: js.UndefOr[dxChartLegend] = js.undefined
  /** Specifies a coefficient determining the diameter of the largest bubble. */
  var maxBubbleSize: js.UndefOr[Double] = js.undefined
  /** Specifies the diameter of the smallest bubble measured in pixels. */
  var minBubbleSize: js.UndefOr[Double] = js.undefined
  /** Forces the widget to treat negative values as zeroes. Applies to stacked-like series only. */
  var negativesAsZeroes: js.UndefOr[Boolean] = js.undefined
  /** A function that is executed when a label on the argument axis is clicked or tapped. */
  var onArgumentAxisClick: js.UndefOr[(js.Function1[/* e */ AnonArgument, _]) | String] = js.undefined
  /** A function that is executed when a legend item is clicked or tapped. */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ AnonEventJQueryEventModel, _]) | String] = js.undefined
  /** A function that is executed when a series is clicked or tapped. */
  var onSeriesClick: js.UndefOr[(js.Function1[/* e */ AnonEventJQueryEventModel, _]) | String] = js.undefined
  /** A function that is executed after the pointer enters or leaves a series. */
  var onSeriesHoverChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxChart, _]] = js.undefined
  /** A function that is executed when a series is selected or selection is canceled. */
  var onSeriesSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxChart, _]] = js.undefined
  /** A function that is executed when zooming or panning ends. */
  var onZoomEnd: js.UndefOr[js.Function1[/* e */ AnonActionType, _]] = js.undefined
  /** A function that is executed when zooming or panning begins. */
  var onZoomStart: js.UndefOr[js.Function1[/* e */ AnonAxis, _]] = js.undefined
  /** Declares a collection of panes. */
  var panes: js.UndefOr[dxChartPanes | js.Array[dxChartPanes]] = js.undefined
  /** Specifies whether panes can be resized if other chart elements require more space after zooming or panning. */
  var resizePanesOnZoom: js.UndefOr[Boolean] = js.undefined
  /** Specifies how the chart must behave when series point labels overlap. */
  var resolveLabelOverlapping: js.UndefOr[hide | none | stack] = js.undefined
  /** Swaps the axes around making the value axis horizontal and the argument axis vertical. */
  var rotated: js.UndefOr[Boolean] = js.undefined
  /** Specifies the settings of the scroll bar. */
  var scrollBar: js.UndefOr[AnonOffset] = js.undefined
  /** @deprecated Use the zoomAndPan option instead. */
  /** Enables scrolling in your chart. */
  var scrollingMode: js.UndefOr[all | mouse | none | touch] = js.undefined
  /** Specifies whether a single series or multiple series can be selected in the chart. */
  var seriesSelectionMode: js.UndefOr[multiple | single_] = js.undefined
  /** Defines options for the series template. */
  var seriesTemplate: js.UndefOr[AnonCustomizeSeries] = js.undefined
  /** Specifies options for Chart widget series. */
  @JSName("series")
  var series_dxChartOptions: js.UndefOr[ChartSeries | js.Array[ChartSeries]] = js.undefined
  /** Specifies whether a point should remain in the hover state when the mouse pointer moves away. */
  var stickyHovering: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether or not to synchronize value axes when they are displayed on a single pane. */
  var synchronizeMultiAxes: js.UndefOr[Boolean] = js.undefined
  /** Configures tooltips. */
  @JSName("tooltip")
  var tooltip_dxChartOptions: js.UndefOr[dxChartTooltip] = js.undefined
  /** @deprecated Use CommonSeries.aggregation.enabled instead. */
  /** Specifies whether or not to filter the series points depending on their quantity. */
  var useAggregation: js.UndefOr[Boolean] = js.undefined
  /** Configures the value axis. */
  var valueAxis: js.UndefOr[dxChartValueAxis | js.Array[dxChartValueAxis]] = js.undefined
  /** Configures zooming and panning. */
  var zoomAndPan: js.UndefOr[AnonAllowMouseWheel] = js.undefined
  /** @deprecated Use the zoomAndPan option instead. */
  /** Enables zooming in your chart. */
  var zoomingMode: js.UndefOr[all | mouse | none | touch] = js.undefined
}

object dxChartOptions {
  @scala.inline
  def apply(
    adaptiveLayout: BaseChartAdaptiveLayout = null,
    adjustOnZoom: js.UndefOr[Boolean] = js.undefined,
    animation: AnonDuration | Boolean = null,
    annotations: js.Array[dxChartAnnotationConfig | _] = null,
    argumentAxis: dxChartArgumentAxis = null,
    autoHidePointMarkers: js.UndefOr[Boolean] = js.undefined,
    barGroupPadding: Int | Double = null,
    barGroupWidth: Int | Double = null,
    barWidth: Int | Double = null,
    bindingOptions: js.Any = null,
    commonAnnotationSettings: dxChartCommonAnnotationConfig = null,
    commonAxisSettings: dxChartCommonAxisSettings = null,
    commonPaneSettings: dxChartCommonPaneSettings = null,
    commonSeriesSettings: dxChartCommonSeriesSettings = null,
    containerBackgroundColor: String = null,
    crosshair: AnonHorizontalLine = null,
    customizeAnnotation: /* annotation */ dxChartAnnotationConfig | js.Any => CallbackTo[dxChartAnnotationConfig] = null,
    customizeLabel: /* pointInfo */ js.Any => CallbackTo[dxChartSeriesTypesCommonSeriesLabel] = null,
    customizePoint: /* pointInfo */ js.Any => CallbackTo[dxChartSeriesTypesCommonSeriesPoint] = null,
    dataPrepareSettings: AnonCheckTypeForAllData = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    defaultPane: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    equalBarWidth: js.UndefOr[Boolean] = js.undefined,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    legend: dxChartLegend = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    maxBubbleSize: Int | Double = null,
    minBubbleSize: Int | Double = null,
    negativesAsZeroes: js.UndefOr[Boolean] = js.undefined,
    onArgumentAxisClick: (js.Function1[/* e */ AnonArgument, _]) | String = null,
    onDisposing: /* e */ AnonModel[dxChart] => CallbackTo[js.Any] = null,
    onDone: /* e */ AnonComponentTElementDxElement[dxChart] => CallbackTo[js.Any] = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxChart] => CallbackTo[js.Any] = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxChart] => CallbackTo[js.Any] = null,
    onExporting: /* e */ AnonFormatModel[dxChart] => CallbackTo[js.Any] = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxChart] => CallbackTo[js.Any] = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxChart] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxChart] => CallbackTo[js.Any] = null,
    onLegendClick: (js.Function1[/* e */ AnonEventJQueryEventModel, _]) | String = null,
    onOptionChanged: /* e */ AnonName[dxChart] => CallbackTo[js.Any] = null,
    onPointClick: (js.Function1[/* e */ AnonModelTarget[dxChart], _]) | String = null,
    onPointHoverChanged: /* e */ AnonElementTarget => CallbackTo[js.Any] = null,
    onPointSelectionChanged: /* e */ AnonElementTarget => CallbackTo[js.Any] = null,
    onSeriesClick: (js.Function1[/* e */ AnonEventJQueryEventModel, _]) | String = null,
    onSeriesHoverChanged: /* e */ AnonComponentDxChart => CallbackTo[js.Any] = null,
    onSeriesSelectionChanged: /* e */ AnonComponentDxChart => CallbackTo[js.Any] = null,
    onTooltipHidden: /* e */ AnonElementModelTarget[dxChart] => CallbackTo[js.Any] = null,
    onTooltipShown: /* e */ AnonElementModelTarget[dxChart] => CallbackTo[js.Any] = null,
    onZoomEnd: /* e */ AnonActionType => CallbackTo[js.Any] = null,
    onZoomStart: /* e */ AnonAxis => CallbackTo[js.Any] = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    panes: dxChartPanes | js.Array[dxChartPanes] = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    pointSelectionMode: multiple | single_ = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    resizePanesOnZoom: js.UndefOr[Boolean] = js.undefined,
    resolveLabelOverlapping: hide | none | stack = null,
    rotated: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollBar: AnonOffset = null,
    scrollingMode: all | mouse | none | touch = null,
    series: ChartSeries | js.Array[ChartSeries] = null,
    seriesSelectionMode: multiple | single_ = null,
    seriesTemplate: AnonCustomizeSeries = null,
    size: BaseWidgetSize = null,
    stickyHovering: js.UndefOr[Boolean] = js.undefined,
    synchronizeMultiAxes: js.UndefOr[Boolean] = js.undefined,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: dxChartTooltip = null,
    useAggregation: js.UndefOr[Boolean] = js.undefined,
    valueAxis: dxChartValueAxis | js.Array[dxChartValueAxis] = null,
    width: Double | String | (js.Function0[Double | String]) = null,
    zoomAndPan: AnonAllowMouseWheel = null,
    zoomingMode: all | mouse | none | touch = null
  ): dxChartOptions = {
    val __obj = js.Dynamic.literal()
    if (adaptiveLayout != null) __obj.updateDynamic("adaptiveLayout")(adaptiveLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustOnZoom)) __obj.updateDynamic("adjustOnZoom")(adjustOnZoom.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (argumentAxis != null) __obj.updateDynamic("argumentAxis")(argumentAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHidePointMarkers)) __obj.updateDynamic("autoHidePointMarkers")(autoHidePointMarkers.asInstanceOf[js.Any])
    if (barGroupPadding != null) __obj.updateDynamic("barGroupPadding")(barGroupPadding.asInstanceOf[js.Any])
    if (barGroupWidth != null) __obj.updateDynamic("barGroupWidth")(barGroupWidth.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (commonAnnotationSettings != null) __obj.updateDynamic("commonAnnotationSettings")(commonAnnotationSettings.asInstanceOf[js.Any])
    if (commonAxisSettings != null) __obj.updateDynamic("commonAxisSettings")(commonAxisSettings.asInstanceOf[js.Any])
    if (commonPaneSettings != null) __obj.updateDynamic("commonPaneSettings")(commonPaneSettings.asInstanceOf[js.Any])
    if (commonSeriesSettings != null) __obj.updateDynamic("commonSeriesSettings")(commonSeriesSettings.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (customizeAnnotation != null) __obj.updateDynamic("customizeAnnotation")(js.Any.fromFunction1((t0: /* annotation */ typingsJapgolly.devextreme.mod.DevExpress.viz.dxChartAnnotationConfig | js.Any) => customizeAnnotation(t0).runNow()))
    if (customizeLabel != null) __obj.updateDynamic("customizeLabel")(js.Any.fromFunction1((t0: /* pointInfo */ js.Any) => customizeLabel(t0).runNow()))
    if (customizePoint != null) __obj.updateDynamic("customizePoint")(js.Any.fromFunction1((t0: /* pointInfo */ js.Any) => customizePoint(t0).runNow()))
    if (dataPrepareSettings != null) __obj.updateDynamic("dataPrepareSettings")(dataPrepareSettings.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (defaultPane != null) __obj.updateDynamic("defaultPane")(defaultPane.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(equalBarWidth)) __obj.updateDynamic("equalBarWidth")(equalBarWidth.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxBubbleSize != null) __obj.updateDynamic("maxBubbleSize")(maxBubbleSize.asInstanceOf[js.Any])
    if (minBubbleSize != null) __obj.updateDynamic("minBubbleSize")(minBubbleSize.asInstanceOf[js.Any])
    if (!js.isUndefined(negativesAsZeroes)) __obj.updateDynamic("negativesAsZeroes")(negativesAsZeroes.asInstanceOf[js.Any])
    if (onArgumentAxisClick != null) __obj.updateDynamic("onArgumentAxisClick")(onArgumentAxisClick.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxChart]) => onDisposing(t0).runNow()))
    if (onDone != null) __obj.updateDynamic("onDone")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElement[typingsJapgolly.devextreme.mod.DevExpress.viz.dxChart]) => onDone(t0).runNow()))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxChart]) => onDrawn(t0).runNow()))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentTElementDxElementModelAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxChart]) => onExported(t0).runNow()))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFormatModel[typingsJapgolly.devextreme.mod.DevExpress.viz.dxChart]) => onExporting(t0).runNow()))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponentData[typingsJapgolly.devextreme.mod.DevExpress.viz.dxChart]) => onFileSaving(t0).runNow()))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonTargetAny[typingsJapgolly.devextreme.mod.DevExpress.viz.dxChart]) => onIncidentOccurred(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.viz.dxChart]) => onInitialized(t0).runNow()))
    if (onLegendClick != null) __obj.updateDynamic("onLegendClick")(onLegendClick.asInstanceOf[js.Any])
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.viz.dxChart]) => onOptionChanged(t0).runNow()))
    if (onPointClick != null) __obj.updateDynamic("onPointClick")(onPointClick.asInstanceOf[js.Any])
    if (onPointHoverChanged != null) __obj.updateDynamic("onPointHoverChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementTarget) => onPointHoverChanged(t0).runNow()))
    if (onPointSelectionChanged != null) __obj.updateDynamic("onPointSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementTarget) => onPointSelectionChanged(t0).runNow()))
    if (onSeriesClick != null) __obj.updateDynamic("onSeriesClick")(onSeriesClick.asInstanceOf[js.Any])
    if (onSeriesHoverChanged != null) __obj.updateDynamic("onSeriesHoverChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxChart) => onSeriesHoverChanged(t0).runNow()))
    if (onSeriesSelectionChanged != null) __obj.updateDynamic("onSeriesSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxChart) => onSeriesSelectionChanged(t0).runNow()))
    if (onTooltipHidden != null) __obj.updateDynamic("onTooltipHidden")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementModelTarget[typingsJapgolly.devextreme.mod.DevExpress.viz.dxChart]) => onTooltipHidden(t0).runNow()))
    if (onTooltipShown != null) __obj.updateDynamic("onTooltipShown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementModelTarget[typingsJapgolly.devextreme.mod.DevExpress.viz.dxChart]) => onTooltipShown(t0).runNow()))
    if (onZoomEnd != null) __obj.updateDynamic("onZoomEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonActionType) => onZoomEnd(t0).runNow()))
    if (onZoomStart != null) __obj.updateDynamic("onZoomStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonAxis) => onZoomStart(t0).runNow()))
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (panes != null) __obj.updateDynamic("panes")(panes.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (pointSelectionMode != null) __obj.updateDynamic("pointSelectionMode")(pointSelectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(resizePanesOnZoom)) __obj.updateDynamic("resizePanesOnZoom")(resizePanesOnZoom.asInstanceOf[js.Any])
    if (resolveLabelOverlapping != null) __obj.updateDynamic("resolveLabelOverlapping")(resolveLabelOverlapping.asInstanceOf[js.Any])
    if (!js.isUndefined(rotated)) __obj.updateDynamic("rotated")(rotated.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scrollBar != null) __obj.updateDynamic("scrollBar")(scrollBar.asInstanceOf[js.Any])
    if (scrollingMode != null) __obj.updateDynamic("scrollingMode")(scrollingMode.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesSelectionMode != null) __obj.updateDynamic("seriesSelectionMode")(seriesSelectionMode.asInstanceOf[js.Any])
    if (seriesTemplate != null) __obj.updateDynamic("seriesTemplate")(seriesTemplate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyHovering)) __obj.updateDynamic("stickyHovering")(stickyHovering.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronizeMultiAxes)) __obj.updateDynamic("synchronizeMultiAxes")(synchronizeMultiAxes.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(useAggregation)) __obj.updateDynamic("useAggregation")(useAggregation.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomAndPan != null) __obj.updateDynamic("zoomAndPan")(zoomAndPan.asInstanceOf[js.Any])
    if (zoomingMode != null) __obj.updateDynamic("zoomingMode")(zoomingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartOptions]
  }
}

