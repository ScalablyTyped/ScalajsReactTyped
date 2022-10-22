package typingsJapgolly.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of chart series.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
trait ChartSeriesCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the group for the specified series.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var axisGroup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Encapsulates the bin options for histogram charts and pareto charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var binOptions: js.UndefOr[ChartBinOptionsLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Encapsulates the options for the box and whisker charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var boxwhiskerOptions: js.UndefOr[ChartBoxwhiskerOptionsLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: This can be an integer value from 0 (zero) to 300, representing the percentage of the default size. This property only applies to bubble charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var bubbleScale: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Represents the chart type of a series. See `Excel.ChartType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Represents a collection of all data labels in the series.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Represents the doughnut hole size of a chart series. Only valid on doughnut and doughnut exploded charts.
    Throws an `InvalidArgument` error on invalid charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var doughnutHoleSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie).
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var explosion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies if the series is filtered. Not applicable for surface charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var filtered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts. Can be a value from 0 through 360.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var firstSliceAngle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Represents the formatting of a chart series, which includes fill and line formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartSeriesFormatLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Represents the gap width of a chart series. Only valid on bar and column charts, as well as
    specific classes of line and pie charts. Throws an invalid argument exception on invalid charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var gapWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the color for maximum value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the type for maximum value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the maximum value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the color for the midpoint value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the type for the midpoint value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the midpoint value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the color for the minimum value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the type for the minimum value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the minimum value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the series gradient style of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies if the series has data labels.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the fill color for negative data points in a series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var invertColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: True if Excel inverts the pattern in the item when it corresponds to a negative number.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var invertIfNegative: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Encapsulates the options for a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var mapOptions: js.UndefOr[ChartMapOptionsLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the marker background color of a chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the marker foreground color of a chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the marker size of a chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the marker style of a chart series. See `Excel.ChartMarkerStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the name of a series in a chart. The name's length should not be greater than 255 characters.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies how bars and columns are positioned. Can be a value between –100 and 100. Applies only to 2-D bar and 2-D column charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var overlap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the series parent label strategy area for a treemap chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var parentLabelStrategy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the plot order of a chart series within the chart group.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var plotOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Returns a collection of all points in the series.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var points: js.UndefOr[ChartPointsCollectionLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the size of the secondary section of either a pie-of-pie chart or a bar-of-pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var secondPlotSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies whether connector lines are shown in waterfall charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showConnectorLines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies whether leader lines are displayed for each data label in the series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showLeaderLines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies if the series has a shadow.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies if the series is smooth. Only applicable to line and scatter charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var smooth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the way the two sections of either a pie-of-pie chart or a bar-of-pie chart are split.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var splitType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the threshold value that separates two sections of either a pie-of-pie chart or a bar-of-pie chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var splitValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: True if Excel assigns a different color or pattern to each data marker. The chart must contain only one series.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var varyByCategories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Represents the error bar object of a chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var xErrorBars: js.UndefOr[ChartErrorBarsLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Represents the error bar object of a chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var yErrorBars: js.UndefOr[ChartErrorBarsLoadOptions] = js.undefined
}
object ChartSeriesCollectionLoadOptions {
  
  inline def apply(): ChartSeriesCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesCollectionLoadOptions]
  }
  
  extension [Self <: ChartSeriesCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAxisGroup(value: Boolean): Self = StObject.set(x, "axisGroup", value.asInstanceOf[js.Any])
    
    inline def setAxisGroupUndefined: Self = StObject.set(x, "axisGroup", js.undefined)
    
    inline def setBinOptions(value: ChartBinOptionsLoadOptions): Self = StObject.set(x, "binOptions", value.asInstanceOf[js.Any])
    
    inline def setBinOptionsUndefined: Self = StObject.set(x, "binOptions", js.undefined)
    
    inline def setBoxwhiskerOptions(value: ChartBoxwhiskerOptionsLoadOptions): Self = StObject.set(x, "boxwhiskerOptions", value.asInstanceOf[js.Any])
    
    inline def setBoxwhiskerOptionsUndefined: Self = StObject.set(x, "boxwhiskerOptions", js.undefined)
    
    inline def setBubbleScale(value: Boolean): Self = StObject.set(x, "bubbleScale", value.asInstanceOf[js.Any])
    
    inline def setBubbleScaleUndefined: Self = StObject.set(x, "bubbleScale", js.undefined)
    
    inline def setChartType(value: Boolean): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
    
    inline def setChartTypeUndefined: Self = StObject.set(x, "chartType", js.undefined)
    
    inline def setDataLabels(value: ChartDataLabelsLoadOptions): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    inline def setDoughnutHoleSize(value: Boolean): Self = StObject.set(x, "doughnutHoleSize", value.asInstanceOf[js.Any])
    
    inline def setDoughnutHoleSizeUndefined: Self = StObject.set(x, "doughnutHoleSize", js.undefined)
    
    inline def setExplosion(value: Boolean): Self = StObject.set(x, "explosion", value.asInstanceOf[js.Any])
    
    inline def setExplosionUndefined: Self = StObject.set(x, "explosion", js.undefined)
    
    inline def setFiltered(value: Boolean): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
    
    inline def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
    
    inline def setFirstSliceAngle(value: Boolean): Self = StObject.set(x, "firstSliceAngle", value.asInstanceOf[js.Any])
    
    inline def setFirstSliceAngleUndefined: Self = StObject.set(x, "firstSliceAngle", js.undefined)
    
    inline def setFormat(value: ChartSeriesFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGapWidth(value: Boolean): Self = StObject.set(x, "gapWidth", value.asInstanceOf[js.Any])
    
    inline def setGapWidthUndefined: Self = StObject.set(x, "gapWidth", js.undefined)
    
    inline def setGradientMaximumColor(value: Boolean): Self = StObject.set(x, "gradientMaximumColor", value.asInstanceOf[js.Any])
    
    inline def setGradientMaximumColorUndefined: Self = StObject.set(x, "gradientMaximumColor", js.undefined)
    
    inline def setGradientMaximumType(value: Boolean): Self = StObject.set(x, "gradientMaximumType", value.asInstanceOf[js.Any])
    
    inline def setGradientMaximumTypeUndefined: Self = StObject.set(x, "gradientMaximumType", js.undefined)
    
    inline def setGradientMaximumValue(value: Boolean): Self = StObject.set(x, "gradientMaximumValue", value.asInstanceOf[js.Any])
    
    inline def setGradientMaximumValueUndefined: Self = StObject.set(x, "gradientMaximumValue", js.undefined)
    
    inline def setGradientMidpointColor(value: Boolean): Self = StObject.set(x, "gradientMidpointColor", value.asInstanceOf[js.Any])
    
    inline def setGradientMidpointColorUndefined: Self = StObject.set(x, "gradientMidpointColor", js.undefined)
    
    inline def setGradientMidpointType(value: Boolean): Self = StObject.set(x, "gradientMidpointType", value.asInstanceOf[js.Any])
    
    inline def setGradientMidpointTypeUndefined: Self = StObject.set(x, "gradientMidpointType", js.undefined)
    
    inline def setGradientMidpointValue(value: Boolean): Self = StObject.set(x, "gradientMidpointValue", value.asInstanceOf[js.Any])
    
    inline def setGradientMidpointValueUndefined: Self = StObject.set(x, "gradientMidpointValue", js.undefined)
    
    inline def setGradientMinimumColor(value: Boolean): Self = StObject.set(x, "gradientMinimumColor", value.asInstanceOf[js.Any])
    
    inline def setGradientMinimumColorUndefined: Self = StObject.set(x, "gradientMinimumColor", js.undefined)
    
    inline def setGradientMinimumType(value: Boolean): Self = StObject.set(x, "gradientMinimumType", value.asInstanceOf[js.Any])
    
    inline def setGradientMinimumTypeUndefined: Self = StObject.set(x, "gradientMinimumType", js.undefined)
    
    inline def setGradientMinimumValue(value: Boolean): Self = StObject.set(x, "gradientMinimumValue", value.asInstanceOf[js.Any])
    
    inline def setGradientMinimumValueUndefined: Self = StObject.set(x, "gradientMinimumValue", js.undefined)
    
    inline def setGradientStyle(value: Boolean): Self = StObject.set(x, "gradientStyle", value.asInstanceOf[js.Any])
    
    inline def setGradientStyleUndefined: Self = StObject.set(x, "gradientStyle", js.undefined)
    
    inline def setHasDataLabels(value: Boolean): Self = StObject.set(x, "hasDataLabels", value.asInstanceOf[js.Any])
    
    inline def setHasDataLabelsUndefined: Self = StObject.set(x, "hasDataLabels", js.undefined)
    
    inline def setInvertColor(value: Boolean): Self = StObject.set(x, "invertColor", value.asInstanceOf[js.Any])
    
    inline def setInvertColorUndefined: Self = StObject.set(x, "invertColor", js.undefined)
    
    inline def setInvertIfNegative(value: Boolean): Self = StObject.set(x, "invertIfNegative", value.asInstanceOf[js.Any])
    
    inline def setInvertIfNegativeUndefined: Self = StObject.set(x, "invertIfNegative", js.undefined)
    
    inline def setMapOptions(value: ChartMapOptionsLoadOptions): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
    
    inline def setMapOptionsUndefined: Self = StObject.set(x, "mapOptions", js.undefined)
    
    inline def setMarkerBackgroundColor(value: Boolean): Self = StObject.set(x, "markerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerBackgroundColorUndefined: Self = StObject.set(x, "markerBackgroundColor", js.undefined)
    
    inline def setMarkerForegroundColor(value: Boolean): Self = StObject.set(x, "markerForegroundColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerForegroundColorUndefined: Self = StObject.set(x, "markerForegroundColor", js.undefined)
    
    inline def setMarkerSize(value: Boolean): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    inline def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    inline def setMarkerStyle(value: Boolean): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
    
    inline def setMarkerStyleUndefined: Self = StObject.set(x, "markerStyle", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOverlap(value: Boolean): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    inline def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
    
    inline def setParentLabelStrategy(value: Boolean): Self = StObject.set(x, "parentLabelStrategy", value.asInstanceOf[js.Any])
    
    inline def setParentLabelStrategyUndefined: Self = StObject.set(x, "parentLabelStrategy", js.undefined)
    
    inline def setPlotOrder(value: Boolean): Self = StObject.set(x, "plotOrder", value.asInstanceOf[js.Any])
    
    inline def setPlotOrderUndefined: Self = StObject.set(x, "plotOrder", js.undefined)
    
    inline def setPoints(value: ChartPointsCollectionLoadOptions): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setSecondPlotSize(value: Boolean): Self = StObject.set(x, "secondPlotSize", value.asInstanceOf[js.Any])
    
    inline def setSecondPlotSizeUndefined: Self = StObject.set(x, "secondPlotSize", js.undefined)
    
    inline def setShowConnectorLines(value: Boolean): Self = StObject.set(x, "showConnectorLines", value.asInstanceOf[js.Any])
    
    inline def setShowConnectorLinesUndefined: Self = StObject.set(x, "showConnectorLines", js.undefined)
    
    inline def setShowLeaderLines(value: Boolean): Self = StObject.set(x, "showLeaderLines", value.asInstanceOf[js.Any])
    
    inline def setShowLeaderLinesUndefined: Self = StObject.set(x, "showLeaderLines", js.undefined)
    
    inline def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
    
    inline def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
    
    inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    inline def setSplitType(value: Boolean): Self = StObject.set(x, "splitType", value.asInstanceOf[js.Any])
    
    inline def setSplitTypeUndefined: Self = StObject.set(x, "splitType", js.undefined)
    
    inline def setSplitValue(value: Boolean): Self = StObject.set(x, "splitValue", value.asInstanceOf[js.Any])
    
    inline def setSplitValueUndefined: Self = StObject.set(x, "splitValue", js.undefined)
    
    inline def setVaryByCategories(value: Boolean): Self = StObject.set(x, "varyByCategories", value.asInstanceOf[js.Any])
    
    inline def setVaryByCategoriesUndefined: Self = StObject.set(x, "varyByCategories", js.undefined)
    
    inline def setXErrorBars(value: ChartErrorBarsLoadOptions): Self = StObject.set(x, "xErrorBars", value.asInstanceOf[js.Any])
    
    inline def setXErrorBarsUndefined: Self = StObject.set(x, "xErrorBars", js.undefined)
    
    inline def setYErrorBars(value: ChartErrorBarsLoadOptions): Self = StObject.set(x, "yErrorBars", value.asInstanceOf[js.Any])
    
    inline def setYErrorBarsUndefined: Self = StObject.set(x, "yErrorBars", js.undefined)
  }
}
