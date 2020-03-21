package typingsJapgolly.highcharts.mod

import typingsJapgolly.highcharts.highchartsNumbers.`0`
import typingsJapgolly.highcharts.highchartsNumbers.`100`
import typingsJapgolly.highcharts.highchartsStrings.dependencywheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, treemap, `type`, xAxis, yAxis */ trait SeriesDependencywheelOptions
  extends PlotDependencywheelOptions
     with SeriesOptionsType {
  /**
    * Not available
    */
  var borderRadius: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var crisp: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * (Highcharts) An array of data points for the series. For the
    * `dependencywheel` series type, points can be given in the following way:
    *
    * An array of objects with named values. The following snippet shows only a
    * few settings, see the complete options set below. If the total number of
    * data points exceeds the series' turboThreshold, this option is not
    * available. (see online documentation for example)
    */
  var data: js.UndefOr[js.Array[SeriesDependencywheelDataOptions]] = js.undefined
  /**
    * Not available
    */
  var depth: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var edgeColor: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var edgeWidth: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var groupPadding: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var groupZPadding: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var grouping: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An id for the series. This can
    * be used after render time to get a pointer to the series object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The index of the series in the
    * chart, affecting the internal index in the `chart.series` array, the
    * visible Z index as well as the order in the legend.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The sequential index of the
    * series in the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) A map data object containing a `path` definition and
    * optionally additional properties to join in the data as per the `joinBy`
    * option.
    */
  var mapData: js.UndefOr[js.Array[SeriesMapDataOptions] | js.Any] = js.undefined
  /**
    * Not available
    */
  var maxPointWidth: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var minPointLength: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
    * in the legend, tooltip etc.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) A collection of options for the individual nodes. The nodes
    * in a dependency diagram are auto-generated instances of
    * `Highcharts.Point`, but options can be applied here and linked by the
    * `id`.
    */
  var nodes: js.UndefOr[js.Array[SeriesDependencywheelNodesOptions]] = js.undefined
  /**
    * Not available
    */
  var pointPadding: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var pointWidth: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * (Highcharts, Highstock) This option allows grouping series in a stacked
    * chart. The stack option can be a string or anything else, as long as the
    * grouped series' stack options match each other after conversion into a
    * string.
    */
  var stack: js.UndefOr[Double | String] = js.undefined
  var treemap: js.UndefOr[SeriesTreemapOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | dependencywheel
  /**
    * (Highcharts, Highstock) When using dual or multiple x axes, this number
    * defines which xAxis the particular series is connected to. It refers to
    * either the axis id or the index of the axis in the xAxis array, with 0
    * being the first.
    */
  var xAxis: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts, Highstock) When using dual or multiple y axes, this number
    * defines which yAxis the particular series is connected to. It refers to
    * either the axis id or the index of the axis in the yAxis array, with 0
    * being the first.
    */
  var yAxis: js.UndefOr[Double | String] = js.undefined
}

object SeriesDependencywheelOptions {
  @scala.inline
  def apply(
    `type`: String | dependencywheel,
    accessibility: js.Object | PlotDependencywheelAccessibilityOptions = null,
    allAreas: js.UndefOr[Boolean] = js.undefined,
    allowPointSelect: js.UndefOr[Boolean] = js.undefined,
    animation: Boolean | AnimationOptionsObject | PlotDependencywheelAnimationOptions = null,
    boostBlending: OptionsBoostBlendingValue = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderRadius: js.UndefOr[scala.Nothing] = js.undefined,
    borderWidth: Int | Double = null,
    center: js.Array[Double | String | Null] = null,
    className: String = null,
    clip: js.UndefOr[Boolean] = js.undefined,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorByPoint: js.UndefOr[Boolean] = js.undefined,
    colorIndex: Int | Double = null,
    colors: js.Array[ColorString | GradientColorObject | PatternObject] = null,
    compare: String = null,
    compareBase: `0` | `100` = null,
    compareStart: js.UndefOr[Boolean] = js.undefined,
    connectors: PlotDependencywheelConnectorsOptions = null,
    crisp: js.UndefOr[scala.Nothing] = js.undefined,
    cursor: String | CursorValue = null,
    curveFactor: Int | Double = null,
    data: js.Array[SeriesDependencywheelDataOptions] = null,
    dataGrouping: PlotDependencywheelDataGroupingOptions = null,
    dataLabels: SeriesSankeyDataLabelsOptionsObject | js.Array[SeriesSankeyDataLabelsOptionsObject] = null,
    depth: js.UndefOr[scala.Nothing] = js.undefined,
    description: String = null,
    edgeColor: js.UndefOr[scala.Nothing] = js.undefined,
    edgeWidth: js.UndefOr[scala.Nothing] = js.undefined,
    enableMouseTracking: js.UndefOr[Boolean] = js.undefined,
    events: PlotDependencywheelEventsOptions = null,
    getExtremesFromAll: js.UndefOr[Boolean] = js.undefined,
    groupPadding: js.UndefOr[scala.Nothing] = js.undefined,
    groupZPadding: js.UndefOr[scala.Nothing] = js.undefined,
    grouping: js.UndefOr[scala.Nothing] = js.undefined,
    id: String = null,
    includeInDataExport: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    joinBy: String | js.Array[String] = null,
    keys: js.Array[String] = null,
    label: PlotDependencywheelLabelOptions = null,
    lastPrice: PlotDependencywheelLastPriceOptions = null,
    lastVisiblePrice: PlotDependencywheelLastVisiblePriceOptions = null,
    legendIndex: Int | Double = null,
    levels: js.Array[PlotDependencywheelLevelsOptions] = null,
    linkOpacity: Int | Double = null,
    linkedTo: String = null,
    mapData: js.Array[SeriesMapDataOptions] | js.Any = null,
    maxPointWidth: js.UndefOr[scala.Nothing] = js.undefined,
    minLinkWidth: Int | Double = null,
    minPointLength: js.UndefOr[scala.Nothing] = js.undefined,
    name: String = null,
    navigatorOptions: PlotSeriesOptions = null,
    nodePadding: Int | Double = null,
    nodeWidth: Int | Double = null,
    nodes: js.Array[SeriesDependencywheelNodesOptions] = null,
    opacity: Int | Double = null,
    point: PlotDependencywheelPointOptions = null,
    pointDescriptionFormatter: js.Function = null,
    pointPadding: js.UndefOr[scala.Nothing] = js.undefined,
    pointWidth: js.UndefOr[scala.Nothing] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    showInNavigator: js.UndefOr[Boolean] = js.undefined,
    skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    stack: Double | String = null,
    startAngle: Int | Double = null,
    states: PlotDependencywheelStatesOptions = null,
    stickyTracking: js.UndefOr[Boolean] = js.undefined,
    tooltip: PlotDependencywheelTooltipOptions = null,
    treemap: SeriesTreemapOptions = null,
    turboThreshold: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    xAxis: Double | String = null,
    yAxis: Double | String = null,
    zIndex: Int | Double = null
  ): SeriesDependencywheelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(allAreas)) __obj.updateDynamic("allAreas")(allAreas.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (boostBlending != null) __obj.updateDynamic("boostBlending")(boostBlending.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorByPoint)) __obj.updateDynamic("colorByPoint")(colorByPoint.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (compare != null) __obj.updateDynamic("compare")(compare.asInstanceOf[js.Any])
    if (compareBase != null) __obj.updateDynamic("compareBase")(compareBase.asInstanceOf[js.Any])
    if (!js.isUndefined(compareStart)) __obj.updateDynamic("compareStart")(compareStart.asInstanceOf[js.Any])
    if (connectors != null) __obj.updateDynamic("connectors")(connectors.asInstanceOf[js.Any])
    if (!js.isUndefined(crisp)) __obj.updateDynamic("crisp")(crisp.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (curveFactor != null) __obj.updateDynamic("curveFactor")(curveFactor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(dataGrouping.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeColor)) __obj.updateDynamic("edgeColor")(edgeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeWidth)) __obj.updateDynamic("edgeWidth")(edgeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll.asInstanceOf[js.Any])
    if (!js.isUndefined(groupPadding)) __obj.updateDynamic("groupPadding")(groupPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(groupZPadding)) __obj.updateDynamic("groupZPadding")(groupZPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(grouping)) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(includeInDataExport)) __obj.updateDynamic("includeInDataExport")(includeInDataExport.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (joinBy != null) __obj.updateDynamic("joinBy")(joinBy.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lastPrice != null) __obj.updateDynamic("lastPrice")(lastPrice.asInstanceOf[js.Any])
    if (lastVisiblePrice != null) __obj.updateDynamic("lastVisiblePrice")(lastVisiblePrice.asInstanceOf[js.Any])
    if (legendIndex != null) __obj.updateDynamic("legendIndex")(legendIndex.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (linkOpacity != null) __obj.updateDynamic("linkOpacity")(linkOpacity.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo.asInstanceOf[js.Any])
    if (mapData != null) __obj.updateDynamic("mapData")(mapData.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPointWidth)) __obj.updateDynamic("maxPointWidth")(maxPointWidth.asInstanceOf[js.Any])
    if (minLinkWidth != null) __obj.updateDynamic("minLinkWidth")(minLinkWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minPointLength)) __obj.updateDynamic("minPointLength")(minPointLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigatorOptions != null) __obj.updateDynamic("navigatorOptions")(navigatorOptions.asInstanceOf[js.Any])
    if (nodePadding != null) __obj.updateDynamic("nodePadding")(nodePadding.asInstanceOf[js.Any])
    if (nodeWidth != null) __obj.updateDynamic("nodeWidth")(nodeWidth.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(pointPadding)) __obj.updateDynamic("pointPadding")(pointPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(pointWidth)) __obj.updateDynamic("pointWidth")(pointWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(showInNavigator)) __obj.updateDynamic("showInNavigator")(showInNavigator.asInstanceOf[js.Any])
    if (!js.isUndefined(skipKeyboardNavigation)) __obj.updateDynamic("skipKeyboardNavigation")(skipKeyboardNavigation.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (treemap != null) __obj.updateDynamic("treemap")(treemap.asInstanceOf[js.Any])
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesDependencywheelOptions]
  }
}

