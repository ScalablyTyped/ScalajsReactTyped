package typingsJapgolly.highcharts.mod

import typingsJapgolly.highcharts.highchartsNumbers.`0`
import typingsJapgolly.highcharts.highchartsNumbers.`100`
import typingsJapgolly.highcharts.highchartsStrings.bubble
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, treemap, `type`, xAxis, yAxis */ trait SeriesBubbleOptions
  extends PlotBubbleOptions
     with SeriesOptionsType {
  /**
    * (Highcharts) An array of data points for the series. For the `bubble`
    * series type, points can be given in the following ways:
    *
    * 1. An array of arrays with 3 or 2 values. In this case, the values
    * correspond to `x,y,z`. If the first value is a string, it is applied as
    * the name of the point, and the `x` value is inferred. The `x` value can
    * also be omitted, in which case the inner arrays should be of length 2\.
    * Then the `x` value is automatically calculated, either starting at 0 and
    * incremented by 1, or from `pointStart` and `pointInterval` given in the
    * series options. (see online documentation for example)
    *
    * 2. An array of objects with named values. The following snippet shows
    * only a few settings, see the complete options set below. If the total
    * number of data points exceeds the series' turboThreshold, this option is
    * not available. (see online documentation for example)
    */
  var data: js.UndefOr[
    js.Array[
      (js.Tuple2[Double | String, Double]) | (js.Tuple3[Double | String, Double, Double]) | SeriesBubbleDataOptions
    ]
  ] = js.undefined
  /**
    * Not available
    */
  var dataParser: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var dataURL: js.UndefOr[scala.Nothing] = js.undefined
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
    * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
    * in the legend, tooltip etc.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Not available
    */
  var stack: js.UndefOr[Double | String] = js.undefined
  var treemap: js.UndefOr[SeriesTreemapOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | bubble
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

object SeriesBubbleOptions {
  @scala.inline
  def apply(
    `type`: String | bubble,
    accessibility: js.Object | PlotBubbleAccessibilityOptions = null,
    allAreas: js.UndefOr[Boolean] = js.undefined,
    allowPointSelect: js.UndefOr[Boolean] = js.undefined,
    animation: Boolean | AnimationOptionsObject | PlotBubbleAnimationOptions = null,
    animationLimit: Int | Double = null,
    boostBlending: OptionsBoostBlendingValue = null,
    boostThreshold: Int | Double = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderWidth: Int | Double = null,
    className: String = null,
    clip: js.UndefOr[Boolean] = js.undefined,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorAxis: Boolean | Double | String = null,
    colorIndex: Int | Double = null,
    colorKey: String = null,
    compare: String = null,
    compareBase: `0` | `100` = null,
    compareStart: js.UndefOr[Boolean] = js.undefined,
    connectEnds: js.UndefOr[Boolean] = js.undefined,
    connectNulls: js.UndefOr[Boolean] = js.undefined,
    connectors: PlotBubbleConnectorsOptions = null,
    cropThreshold: Int | Double = null,
    cursor: String | CursorValue = null,
    dashStyle: DashStyleValue = null,
    data: js.Array[
      (js.Tuple2[Double | String, Double]) | (js.Tuple3[Double | String, Double, Double]) | SeriesBubbleDataOptions
    ] = null,
    dataGrouping: PlotBubbleDataGroupingOptions = null,
    dataLabels: DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject] = null,
    dataParser: js.UndefOr[scala.Nothing] = js.undefined,
    dataURL: js.UndefOr[scala.Nothing] = js.undefined,
    description: String = null,
    displayNegative: js.UndefOr[Boolean] = js.undefined,
    dragDrop: PlotBubbleDragDropOptions = null,
    enableMouseTracking: js.UndefOr[Boolean] = js.undefined,
    events: PlotBubbleEventsOptions = null,
    findNearestPointBy: OptionsFindNearestPointByValue = null,
    gapSize: Int | Double = null,
    gapUnit: OptionsGapUnitValue = null,
    getExtremesFromAll: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    includeInDataExport: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    jitter: PlotBubbleJitterOptions = null,
    joinBy: String | js.Array[String] = null,
    keys: js.Array[String] = null,
    label: PlotBubbleLabelOptions = null,
    lastPrice: PlotBubbleLastPriceOptions = null,
    lastVisiblePrice: PlotBubbleLastVisiblePriceOptions = null,
    legendIndex: Int | Double = null,
    lineWidth: Int | Double = null,
    linecap: SeriesLinecapValue = null,
    linkedTo: String = null,
    mapData: js.Array[SeriesMapDataOptions] | js.Any = null,
    marker: PlotBubbleMarkerOptions = null,
    maxSize: Double | String = null,
    minSize: Double | String = null,
    name: String = null,
    navigatorOptions: PlotSeriesOptions = null,
    negativeColor: ColorString | GradientColorObject | PatternObject = null,
    opacity: Int | Double = null,
    point: PlotBubblePointOptions = null,
    pointDescriptionFormatter: js.Function = null,
    pointInterval: Int | Double = null,
    pointIntervalUnit: OptionsPointIntervalUnitValue = null,
    pointRange: Int | Double = null,
    pointStart: Int | Double = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    showInNavigator: js.UndefOr[Boolean] = js.undefined,
    sizeBy: BubbleSizeByValue = null,
    sizeByAbsoluteValue: js.UndefOr[Boolean] = js.undefined,
    skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    softThreshold: js.UndefOr[Boolean] = js.undefined,
    stack: Double | scala.Nothing | String = null,
    stacking: OptionsStackingValue = null,
    states: PlotBubbleStatesOptions = null,
    step: OptionsStepValue = null,
    stickyTracking: js.UndefOr[Boolean] = js.undefined,
    threshold: Int | Double = null,
    tooltip: PlotBubbleTooltipOptions = null,
    treemap: SeriesTreemapOptions = null,
    turboThreshold: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    xAxis: Double | String = null,
    yAxis: Double | String = null,
    zIndex: Int | Double = null,
    zMax: Int | Double = null,
    zMin: Int | Double = null,
    zThreshold: Int | Double = null,
    zoneAxis: String = null,
    zones: js.Array[PlotBubbleZonesOptions] = null
  ): SeriesBubbleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(allAreas)) __obj.updateDynamic("allAreas")(allAreas.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationLimit != null) __obj.updateDynamic("animationLimit")(animationLimit.asInstanceOf[js.Any])
    if (boostBlending != null) __obj.updateDynamic("boostBlending")(boostBlending.asInstanceOf[js.Any])
    if (boostThreshold != null) __obj.updateDynamic("boostThreshold")(boostThreshold.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (colorKey != null) __obj.updateDynamic("colorKey")(colorKey.asInstanceOf[js.Any])
    if (compare != null) __obj.updateDynamic("compare")(compare.asInstanceOf[js.Any])
    if (compareBase != null) __obj.updateDynamic("compareBase")(compareBase.asInstanceOf[js.Any])
    if (!js.isUndefined(compareStart)) __obj.updateDynamic("compareStart")(compareStart.asInstanceOf[js.Any])
    if (!js.isUndefined(connectEnds)) __obj.updateDynamic("connectEnds")(connectEnds.asInstanceOf[js.Any])
    if (!js.isUndefined(connectNulls)) __obj.updateDynamic("connectNulls")(connectNulls.asInstanceOf[js.Any])
    if (connectors != null) __obj.updateDynamic("connectors")(connectors.asInstanceOf[js.Any])
    if (cropThreshold != null) __obj.updateDynamic("cropThreshold")(cropThreshold.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(dataGrouping.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(dataParser)) __obj.updateDynamic("dataParser")(dataParser.asInstanceOf[js.Any])
    if (!js.isUndefined(dataURL)) __obj.updateDynamic("dataURL")(dataURL.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(displayNegative)) __obj.updateDynamic("displayNegative")(displayNegative.asInstanceOf[js.Any])
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (findNearestPointBy != null) __obj.updateDynamic("findNearestPointBy")(findNearestPointBy.asInstanceOf[js.Any])
    if (gapSize != null) __obj.updateDynamic("gapSize")(gapSize.asInstanceOf[js.Any])
    if (gapUnit != null) __obj.updateDynamic("gapUnit")(gapUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(includeInDataExport)) __obj.updateDynamic("includeInDataExport")(includeInDataExport.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (jitter != null) __obj.updateDynamic("jitter")(jitter.asInstanceOf[js.Any])
    if (joinBy != null) __obj.updateDynamic("joinBy")(joinBy.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lastPrice != null) __obj.updateDynamic("lastPrice")(lastPrice.asInstanceOf[js.Any])
    if (lastVisiblePrice != null) __obj.updateDynamic("lastVisiblePrice")(lastVisiblePrice.asInstanceOf[js.Any])
    if (legendIndex != null) __obj.updateDynamic("legendIndex")(legendIndex.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo.asInstanceOf[js.Any])
    if (mapData != null) __obj.updateDynamic("mapData")(mapData.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigatorOptions != null) __obj.updateDynamic("navigatorOptions")(navigatorOptions.asInstanceOf[js.Any])
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter.asInstanceOf[js.Any])
    if (pointInterval != null) __obj.updateDynamic("pointInterval")(pointInterval.asInstanceOf[js.Any])
    if (pointIntervalUnit != null) __obj.updateDynamic("pointIntervalUnit")(pointIntervalUnit.asInstanceOf[js.Any])
    if (pointRange != null) __obj.updateDynamic("pointRange")(pointRange.asInstanceOf[js.Any])
    if (pointStart != null) __obj.updateDynamic("pointStart")(pointStart.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(showInNavigator)) __obj.updateDynamic("showInNavigator")(showInNavigator.asInstanceOf[js.Any])
    if (sizeBy != null) __obj.updateDynamic("sizeBy")(sizeBy.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeByAbsoluteValue)) __obj.updateDynamic("sizeByAbsoluteValue")(sizeByAbsoluteValue.asInstanceOf[js.Any])
    if (!js.isUndefined(skipKeyboardNavigation)) __obj.updateDynamic("skipKeyboardNavigation")(skipKeyboardNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(softThreshold)) __obj.updateDynamic("softThreshold")(softThreshold.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (stacking != null) __obj.updateDynamic("stacking")(stacking.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (treemap != null) __obj.updateDynamic("treemap")(treemap.asInstanceOf[js.Any])
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zMax != null) __obj.updateDynamic("zMax")(zMax.asInstanceOf[js.Any])
    if (zMin != null) __obj.updateDynamic("zMin")(zMin.asInstanceOf[js.Any])
    if (zThreshold != null) __obj.updateDynamic("zThreshold")(zThreshold.asInstanceOf[js.Any])
    if (zoneAxis != null) __obj.updateDynamic("zoneAxis")(zoneAxis.asInstanceOf[js.Any])
    if (zones != null) __obj.updateDynamic("zones")(zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesBubbleOptions]
  }
}

