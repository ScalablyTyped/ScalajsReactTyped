package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorOptions extends StObject {
  
  /**
    * (Highstock, Gantt) Whether the navigator and scrollbar should adapt to
    * updated data in the base X axis. When loading data async, as in the demo
    * below, this should be `false`. Otherwise new data will trigger navigator
    * redraw, which will cause unwanted looping. In the demo below, the data in
    * the navigator is set only once. On navigating, only the main chart
    * content is updated.
    */
  var adaptToUpdatedData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock, Gantt) Enable or disable the navigator.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock, Gantt) Options for the handles for dragging the zoomed area.
    */
  var handles: js.UndefOr[NavigatorHandlesOptions] = js.undefined
  
  /**
    * (Highstock, Gantt) The height of the navigator.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The distance from the nearest element, the X axis or X
    * axis labels.
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The color of the mask covering the areas of the
    * navigator series that are currently not visible in the main series. The
    * default color is bluish with an opacity of 0.3 to see the series below.
    */
  var maskFill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highstock, Gantt) Whether the mask should be inside the range marking
    * the zoomed range, or outside. In Highcharts Stock 1.x it was always
    * `false`.
    */
  var maskInside: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock, Gantt) When the chart is inverted, whether to draw the
    * navigator on the opposite side.
    */
  var opposite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock, Gantt) The color of the line marking the currently zoomed
    * area in the navigator.
    */
  var outlineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highstock, Gantt) The width of the line marking the currently zoomed
    * area in the navigator.
    */
  var outlineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) Options for the navigator series. Available options
    * are the same as any series, documented at plotOptions and series.
    *
    * Unless data is explicitly defined on navigator.series, the data is
    * borrowed from the first series in the chart.
    *
    * Default series options for the navigator series are: (see online
    * documentation for example)
    */
  var series: js.UndefOr[
    NavigatorSeriesOptions | SeriesOptionsType | (js.Array[NavigatorSeriesOptions | SeriesOptionsType])
  ] = js.undefined
  
  /**
    * (Highstock, Gantt) Enable or disable navigator sticking to right, while
    * adding new points. If `undefined`, the navigator sticks to the axis
    * maximum only if it was already at the maximum prior to adding points.
    */
  var stickToMax: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock, Gantt) Options for the navigator X axis. Default series
    * options for the navigator xAxis are: (see online documentation for
    * example)
    */
  var xAxis: js.UndefOr[NavigatorXAxisOptions | js.Array[NavigatorXAxisOptions]] = js.undefined
  
  /**
    * (Highstock, Gantt) Options for the navigator Y axis. Default series
    * options for the navigator yAxis are: (see online documentation for
    * example)
    */
  var yAxis: js.UndefOr[NavigatorYAxisOptions | js.Array[NavigatorYAxisOptions]] = js.undefined
}
object NavigatorOptions {
  
  inline def apply(): NavigatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorOptions]
  }
  
  extension [Self <: NavigatorOptions](x: Self) {
    
    inline def setAdaptToUpdatedData(value: Boolean): Self = StObject.set(x, "adaptToUpdatedData", value.asInstanceOf[js.Any])
    
    inline def setAdaptToUpdatedDataUndefined: Self = StObject.set(x, "adaptToUpdatedData", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHandles(value: NavigatorHandlesOptions): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
    
    inline def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMaskFill(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "maskFill", value.asInstanceOf[js.Any])
    
    inline def setMaskFillUndefined: Self = StObject.set(x, "maskFill", js.undefined)
    
    inline def setMaskInside(value: Boolean): Self = StObject.set(x, "maskInside", value.asInstanceOf[js.Any])
    
    inline def setMaskInsideUndefined: Self = StObject.set(x, "maskInside", js.undefined)
    
    inline def setOpposite(value: Boolean): Self = StObject.set(x, "opposite", value.asInstanceOf[js.Any])
    
    inline def setOppositeUndefined: Self = StObject.set(x, "opposite", js.undefined)
    
    inline def setOutlineColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setOutlineWidth(value: Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    inline def setSeries(
      value: NavigatorSeriesOptions | SeriesOptionsType | (js.Array[NavigatorSeriesOptions | SeriesOptionsType])
    ): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: (NavigatorSeriesOptions | SeriesOptionsType)*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setStickToMax(value: Boolean): Self = StObject.set(x, "stickToMax", value.asInstanceOf[js.Any])
    
    inline def setStickToMaxUndefined: Self = StObject.set(x, "stickToMax", js.undefined)
    
    inline def setXAxis(value: NavigatorXAxisOptions | js.Array[NavigatorXAxisOptions]): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setXAxisVarargs(value: NavigatorXAxisOptions*): Self = StObject.set(x, "xAxis", js.Array(value*))
    
    inline def setYAxis(value: NavigatorYAxisOptions | js.Array[NavigatorYAxisOptions]): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    inline def setYAxisVarargs(value: NavigatorYAxisOptions*): Self = StObject.set(x, "yAxis", js.Array(value*))
  }
}
