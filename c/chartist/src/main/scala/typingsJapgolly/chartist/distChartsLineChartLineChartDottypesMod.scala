package typingsJapgolly.chartist

import typingsJapgolly.chartist.anon.Area
import typingsJapgolly.chartist.anon.OmitLineChartOptionsRequi
import typingsJapgolly.chartist.anon.PartialChartPadding
import typingsJapgolly.chartist.chartistStrings.area
import typingsJapgolly.chartist.chartistStrings.labelInterpolationFnc
import typingsJapgolly.chartist.chartistStrings.labelOffset
import typingsJapgolly.chartist.chartistStrings.line
import typingsJapgolly.chartist.chartistStrings.offset
import typingsJapgolly.chartist.chartistStrings.point
import typingsJapgolly.chartist.chartistStrings.position
import typingsJapgolly.chartist.chartistStrings.scaleMinSpace
import typingsJapgolly.chartist.chartistStrings.series
import typingsJapgolly.chartist.chartistStrings.showGrid
import typingsJapgolly.chartist.chartistStrings.showLabel
import typingsJapgolly.chartist.distAxesMod.Axis
import typingsJapgolly.chartist.distChartsTypesMod.BaseChartEventsTypes
import typingsJapgolly.chartist.distCoreTypesMod.AxesDrawEvent
import typingsJapgolly.chartist.distCoreTypesMod.AxisOptions
import typingsJapgolly.chartist.distCoreTypesMod.ChartRect
import typingsJapgolly.chartist.distCoreTypesMod.CreatedEvent
import typingsJapgolly.chartist.distCoreTypesMod.Data
import typingsJapgolly.chartist.distCoreTypesMod.DrawEvent
import typingsJapgolly.chartist.distCoreTypesMod.Meta
import typingsJapgolly.chartist.distCoreTypesMod.NormalizedSeries
import typingsJapgolly.chartist.distCoreTypesMod.NormalizedSeriesValue
import typingsJapgolly.chartist.distCoreTypesMod.Options
import typingsJapgolly.chartist.distCoreTypesMod.Plugin
import typingsJapgolly.chartist.distCoreTypesMod.SegmentData
import typingsJapgolly.chartist.distCoreTypesMod.Series
import typingsJapgolly.chartist.distCoreTypesMod.SeriesObject
import typingsJapgolly.chartist.distCoreTypesMod.SeriesPrimitiveValue
import typingsJapgolly.chartist.distSvgMod.Svg
import typingsJapgolly.chartist.distSvgMod.SvgPath
import typingsJapgolly.chartist.distUtilsTypesMod.RequiredKeys
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import typingsJapgolly.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChartsLineChartLineChartDottypesMod {
  
  trait AreaDrawEvent
    extends StObject
       with DrawEvent {
    
    var path: SvgPath
    
    @JSName("type")
    var type_AreaDrawEvent: area
    
    var values: NormalizedSeries
  }
  object AreaDrawEvent {
    
    inline def apply(
      axisX: Axis,
      axisY: Axis,
      chartRect: ChartRect,
      element: Svg,
      group: Svg,
      index: Double,
      meta: Meta,
      path: SvgPath,
      seriesIndex: Double,
      values: NormalizedSeries
    ): AreaDrawEvent = {
      val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartRect = chartRect.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("area")
      __obj.asInstanceOf[AreaDrawEvent]
    }
    
    extension [Self <: AreaDrawEvent](x: Self) {
      
      inline def setPath(value: SvgPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: area): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: NormalizedSeries): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: NormalizedSeriesValue*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type LineChartCreatedEvent = CreatedEvent[LineChartOptions[AxisOptions, AxisOptions]]
  
  type LineChartData = Data[js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]]
  
  type LineChartEventsTypes = BaseChartEventsTypes[
    LineChartCreatedEvent, 
    AxesDrawEvent | PointDrawEvent | LineDrawEvent | AreaDrawEvent
  ]
  
  trait LineChartOptions[TXAxisOptions, TYAxisOptions]
    extends StObject
       with Options[TXAxisOptions, TYAxisOptions] {
    
    /**
      * The base for the area chart that will be used to close the area shape (is normally 0)
      */
    var areaBase: js.UndefOr[Double] = js.undefined
    
    /**
      * Override the class names that get used to generate the SVG structure of the chart
      */
    @JSName("classNames")
    var classNames_LineChartOptions: js.UndefOr[Area] = js.undefined
    
    /**
      * When set to true, the last grid line on the x-axis is not drawn and the chart elements will expand to the full available width of the chart. For the last label to be drawn correctly you might need to add chart padding or offset the last label with a draw event handler.
      */
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify if the lines should be smoothed.
      * This value can be true or false where true will result in smoothing using the default smoothing interpolation function Chartist.Interpolation.cardinal and false results in Chartist.Interpolation.none.
      * You can also choose other smoothing / interpolation functions available in the Chartist.Interpolation module, or write your own interpolation function.
      * Check the examples for a brief description.
      */
    var lineSmooth: js.UndefOr[Boolean | LineInterpolation] = js.undefined
    
    /**
      * If true the whole data is reversed including labels, the series order as well as the whole series data arrays.
      */
    var reverseData: js.UndefOr[Boolean] = js.undefined
    
    var series: js.UndefOr[
        Record[
          String, 
          Omit[
            LineChartOptions[TXAxisOptions, TYAxisOptions], 
            typingsJapgolly.chartist.chartistStrings.series
          ]
        ]
      ] = js.undefined
    
    /**
      * If the line chart should draw an area
      */
    var showArea: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the line chart should add a background fill to the .ct-grids group.
      */
    var showGridBackground: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the line should be drawn or not
      */
    var showLine: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If dots should be drawn or not
      */
    var showPoint: js.UndefOr[Boolean] = js.undefined
  }
  object LineChartOptions {
    
    inline def apply[TXAxisOptions, TYAxisOptions](): LineChartOptions[TXAxisOptions, TYAxisOptions] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineChartOptions[TXAxisOptions, TYAxisOptions]]
    }
    
    extension [Self <: LineChartOptions[?, ?], TXAxisOptions, TYAxisOptions](x: Self & (LineChartOptions[TXAxisOptions, TYAxisOptions])) {
      
      inline def setAreaBase(value: Double): Self = StObject.set(x, "areaBase", value.asInstanceOf[js.Any])
      
      inline def setAreaBaseUndefined: Self = StObject.set(x, "areaBase", js.undefined)
      
      inline def setClassNames(value: Area): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setLineSmooth(value: Boolean | LineInterpolation): Self = StObject.set(x, "lineSmooth", value.asInstanceOf[js.Any])
      
      inline def setLineSmoothFunction2(value: (/* pathCoordinates */ js.Array[Double], /* valueData */ js.Array[SegmentData]) => SvgPath): Self = StObject.set(x, "lineSmooth", js.Any.fromFunction2(value))
      
      inline def setLineSmoothUndefined: Self = StObject.set(x, "lineSmooth", js.undefined)
      
      inline def setReverseData(value: Boolean): Self = StObject.set(x, "reverseData", value.asInstanceOf[js.Any])
      
      inline def setReverseDataUndefined: Self = StObject.set(x, "reverseData", js.undefined)
      
      inline def setSeries(value: Record[String, Omit[LineChartOptions[TXAxisOptions, TYAxisOptions], series]]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setShowArea(value: Boolean): Self = StObject.set(x, "showArea", value.asInstanceOf[js.Any])
      
      inline def setShowAreaUndefined: Self = StObject.set(x, "showArea", js.undefined)
      
      inline def setShowGridBackground(value: Boolean): Self = StObject.set(x, "showGridBackground", value.asInstanceOf[js.Any])
      
      inline def setShowGridBackgroundUndefined: Self = StObject.set(x, "showGridBackground", js.undefined)
      
      inline def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      inline def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
      
      inline def setShowPoint(value: Boolean): Self = StObject.set(x, "showPoint", value.asInstanceOf[js.Any])
      
      inline def setShowPointUndefined: Self = StObject.set(x, "showPoint", js.undefined)
    }
  }
  
  /* Inlined chartist.chartist/dist/utils.RequiredKeys<chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptions<chartist.chartist/dist/utils.RequiredKeys<chartist.chartist/dist/core.AxisOptions, 'offset' | 'position' | 'labelOffset' | 'showLabel' | 'showGrid' | 'labelInterpolationFnc', never>, chartist.chartist/dist/utils.RequiredKeys<chartist.chartist/dist/core.AxisOptions, 'offset' | 'position' | 'labelOffset' | 'showLabel' | 'showGrid' | 'labelInterpolationFnc' | 'scaleMinSpace', never>>, 'showLine' | 'showPoint' | 'areaBase' | 'lineSmooth' | 'chartPadding' | 'axisX' | 'axisY', 'classNames'> */
  trait LineChartOptionsWithDefaults extends StObject {
    
    /**
      * The base for the area chart that will be used to close the area shape (is normally 0)
      */
    var areaBase: js.UndefOr[Double] & Double
    
    /**
      * Options for X-Axis
      */
    var axisX: (js.UndefOr[
        RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
          scala.Nothing
        ]
      ]) & (RequiredKeys[
        AxisOptions, 
        offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
        scala.Nothing
      ])
    
    /**
      * Options for Y-Axis
      */
    var axisY: (js.UndefOr[
        RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
          scala.Nothing
        ]
      ]) & (RequiredKeys[
        AxisOptions, 
        offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
        scala.Nothing
      ])
    
    /**
      *  Padding of the chart drawing area to the container element and labels as a number or padding object.
      */
    var chartPadding: (js.UndefOr[Double | PartialChartPadding]) & (Double | PartialChartPadding)
    
    /**
      * Override the class names that get used to generate the SVG structure of the chart
      */
    var classNames: js.UndefOr[Area] & Area & Required[js.UndefOr[Area]]
    
    /**
      * When set to true, the last grid line on the x-axis is not drawn and the chart elements will expand to the full available width of the chart. For the last label to be drawn correctly you might need to add chart padding or offset the last label with a draw event handler.
      */
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify a fixed height for the chart as a string (i.e. '100px' or '50%')
      */
    var height: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Overriding the natural high of the chart allows you to zoom in or limit the charts highest displayed value
      */
    var high: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify if the lines should be smoothed.
      * This value can be true or false where true will result in smoothing using the default smoothing interpolation function Chartist.Interpolation.cardinal and false results in Chartist.Interpolation.none.
      * You can also choose other smoothing / interpolation functions available in the Chartist.Interpolation module, or write your own interpolation function.
      * Check the examples for a brief description.
      */
    var lineSmooth: (js.UndefOr[Boolean | LineInterpolation]) & (Boolean | LineInterpolation)
    
    /**
      * Overriding the natural low of the chart allows you to zoom in or limit the charts lowest displayed value
      */
    var low: js.UndefOr[Double] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Plugin | (js.Tuple2[Plugin, Any])]] = js.undefined
    
    /**
      * Unless low/high are explicitly set, bar chart will be centered at zero by default. Set referenceValue to null to auto scale.
      */
    var referenceValue: js.UndefOr[Double] = js.undefined
    
    /**
      * If true the whole data is reversed including labels, the series order as well as the whole series data arrays.
      */
    var reverseData: js.UndefOr[Boolean] = js.undefined
    
    var series: js.UndefOr[Record[String, OmitLineChartOptionsRequi]] = js.undefined
    
    /**
      * If the line chart should draw an area
      */
    var showArea: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the line chart should add a background fill to the .ct-grids group.
      */
    var showGridBackground: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the line should be drawn or not
      */
    var showLine: js.UndefOr[Boolean] & Boolean
    
    /**
      * If dots should be drawn or not
      */
    var showPoint: js.UndefOr[Boolean] & Boolean
    
    /**
      * Specify a fixed width for the chart as a string (i.e. '100px' or '50%')
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object LineChartOptionsWithDefaults {
    
    inline def apply(
      areaBase: js.UndefOr[Double] & Double,
      axisX: (js.UndefOr[
          RequiredKeys[
            AxisOptions, 
            offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
            scala.Nothing
          ]
        ]) & (RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
          scala.Nothing
        ]),
      axisY: (js.UndefOr[
          RequiredKeys[
            AxisOptions, 
            offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
            scala.Nothing
          ]
        ]) & (RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
          scala.Nothing
        ]),
      chartPadding: (js.UndefOr[Double | PartialChartPadding]) & (Double | PartialChartPadding),
      classNames: js.UndefOr[Area] & Area & Required[js.UndefOr[Area]],
      lineSmooth: (js.UndefOr[Boolean | LineInterpolation]) & (Boolean | LineInterpolation),
      showLine: js.UndefOr[Boolean] & Boolean,
      showPoint: js.UndefOr[Boolean] & Boolean
    ): LineChartOptionsWithDefaults = {
      val __obj = js.Dynamic.literal(areaBase = areaBase.asInstanceOf[js.Any], axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartPadding = chartPadding.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], lineSmooth = lineSmooth.asInstanceOf[js.Any], showLine = showLine.asInstanceOf[js.Any], showPoint = showPoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineChartOptionsWithDefaults]
    }
    
    extension [Self <: LineChartOptionsWithDefaults](x: Self) {
      
      inline def setAreaBase(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "areaBase", value.asInstanceOf[js.Any])
      
      inline def setAxisX(
        value: (js.UndefOr[
              RequiredKeys[
                AxisOptions, 
                offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
                scala.Nothing
              ]
            ]) & (RequiredKeys[
              AxisOptions, 
              offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
              scala.Nothing
            ])
      ): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
      
      inline def setAxisY(
        value: (js.UndefOr[
              RequiredKeys[
                AxisOptions, 
                offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
                scala.Nothing
              ]
            ]) & (RequiredKeys[
              AxisOptions, 
              offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
              scala.Nothing
            ])
      ): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
      
      inline def setChartPadding(value: (js.UndefOr[Double | PartialChartPadding]) & (Double | PartialChartPadding)): Self = StObject.set(x, "chartPadding", value.asInstanceOf[js.Any])
      
      inline def setClassNames(value: js.UndefOr[Area] & Area & Required[js.UndefOr[Area]]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setLineSmooth(value: (js.UndefOr[Boolean | LineInterpolation]) & (Boolean | LineInterpolation)): Self = StObject.set(x, "lineSmooth", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin | (js.Tuple2[Plugin, Any])]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (Plugin | (js.Tuple2[Plugin, Any]))*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setReferenceValue(value: Double): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
      
      inline def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
      
      inline def setReverseData(value: Boolean): Self = StObject.set(x, "reverseData", value.asInstanceOf[js.Any])
      
      inline def setReverseDataUndefined: Self = StObject.set(x, "reverseData", js.undefined)
      
      inline def setSeries(value: Record[String, OmitLineChartOptionsRequi]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setShowArea(value: Boolean): Self = StObject.set(x, "showArea", value.asInstanceOf[js.Any])
      
      inline def setShowAreaUndefined: Self = StObject.set(x, "showArea", js.undefined)
      
      inline def setShowGridBackground(value: Boolean): Self = StObject.set(x, "showGridBackground", value.asInstanceOf[js.Any])
      
      inline def setShowGridBackgroundUndefined: Self = StObject.set(x, "showGridBackground", js.undefined)
      
      inline def setShowLine(value: js.UndefOr[Boolean] & Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      inline def setShowPoint(value: js.UndefOr[Boolean] & Boolean): Self = StObject.set(x, "showPoint", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LineDrawEvent
    extends StObject
       with DrawEvent {
    
    var path: SvgPath
    
    @JSName("type")
    var type_LineDrawEvent: line
    
    var values: NormalizedSeries
  }
  object LineDrawEvent {
    
    inline def apply(
      axisX: Axis,
      axisY: Axis,
      chartRect: ChartRect,
      element: Svg,
      group: Svg,
      index: Double,
      meta: Meta,
      path: SvgPath,
      seriesIndex: Double,
      values: NormalizedSeries
    ): LineDrawEvent = {
      val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartRect = chartRect.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("line")
      __obj.asInstanceOf[LineDrawEvent]
    }
    
    extension [Self <: LineDrawEvent](x: Self) {
      
      inline def setPath(value: SvgPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: NormalizedSeries): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: NormalizedSeriesValue*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type LineInterpolation = js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ]
  
  trait PointDrawEvent
    extends StObject
       with DrawEvent {
    
    @JSName("type")
    var type_PointDrawEvent: point
    
    var value: NormalizedSeriesValue
    
    var x: Double
    
    var y: Double
  }
  object PointDrawEvent {
    
    inline def apply(
      axisX: Axis,
      axisY: Axis,
      chartRect: ChartRect,
      element: Svg,
      group: Svg,
      index: Double,
      meta: Meta,
      seriesIndex: Double,
      x: Double,
      y: Double
    ): PointDrawEvent = {
      val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartRect = chartRect.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("point")
      __obj.asInstanceOf[PointDrawEvent]
    }
    
    extension [Self <: PointDrawEvent](x: Self) {
      
      inline def setType(value: point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: NormalizedSeriesValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
