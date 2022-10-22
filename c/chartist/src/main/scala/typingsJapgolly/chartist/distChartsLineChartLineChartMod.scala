package typingsJapgolly.chartist

import org.scalajs.dom.Element
import typingsJapgolly.chartist.chartistStrings.areaBase
import typingsJapgolly.chartist.chartistStrings.axisX
import typingsJapgolly.chartist.chartistStrings.axisY
import typingsJapgolly.chartist.chartistStrings.chartPadding
import typingsJapgolly.chartist.chartistStrings.classNames
import typingsJapgolly.chartist.chartistStrings.fullWidth
import typingsJapgolly.chartist.chartistStrings.height
import typingsJapgolly.chartist.chartistStrings.high
import typingsJapgolly.chartist.chartistStrings.lineSmooth
import typingsJapgolly.chartist.chartistStrings.low
import typingsJapgolly.chartist.chartistStrings.plugins
import typingsJapgolly.chartist.chartistStrings.referenceValue
import typingsJapgolly.chartist.chartistStrings.reverseData
import typingsJapgolly.chartist.chartistStrings.showArea
import typingsJapgolly.chartist.chartistStrings.showGridBackground
import typingsJapgolly.chartist.chartistStrings.showLine
import typingsJapgolly.chartist.chartistStrings.showPoint
import typingsJapgolly.chartist.chartistStrings.width
import typingsJapgolly.chartist.distChartsBaseChartMod.BaseChart
import typingsJapgolly.chartist.distChartsLineChartLineChartDottypesMod.LineChartData
import typingsJapgolly.chartist.distChartsLineChartLineChartDottypesMod.LineChartEventsTypes
import typingsJapgolly.chartist.distChartsLineChartLineChartDottypesMod.LineChartOptions
import typingsJapgolly.chartist.distChartsLineChartLineChartDottypesMod.LineChartOptionsWithDefaults
import typingsJapgolly.chartist.distCoreTypesMod.AxisOptions
import typingsJapgolly.chartist.distCoreTypesMod.ResponsiveOptions
import typingsJapgolly.chartist.distCoreTypesMod.Series
import typingsJapgolly.chartist.distCoreTypesMod.SeriesObject
import typingsJapgolly.chartist.distCoreTypesMod.SeriesPrimitiveValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChartsLineChartLineChartMod {
  
  @JSImport("chartist/dist/charts/LineChart/LineChart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chartist/dist/charts/LineChart/LineChart", "LineChart")
  @js.native
  open class LineChart protected () extends BaseChart[LineChartEventsTypes] {
    /**
      * This method creates a new line chart.
      * @param query A selector query string or directly a DOM element
      * @param data The data object that needs to consist of a labels and a series array
      * @param options The options object with options that override the default options. Check the examples for a detailed list.
      * @param responsiveOptions Specify an array of responsive option arrays which are a media query and options object pair => [[mediaQueryString, optionsObject],[more...]]
      * @return An object which exposes the API for the created chart
      *
      * @example
      * ```ts
      * // Create a simple line chart
      * const data = {
      *   // A labels array that can contain any sort of values
      *   labels: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri'],
      *   // Our series array that contains series objects or in this case series data arrays
      *   series: [
      *     [5, 2, 4, 2, 0]
      *   ]
      * };
      *
      * // As options we currently only set a static size of 300x200 px
      * const options = {
      *   width: '300px',
      *   height: '200px'
      * };
      *
      * // In the global name space Chartist we call the Line function to initialize a line chart. As a first parameter we pass in a selector where we would like to get our chart created. Second parameter is the actual data object and as a third parameter we pass in our options
      * new LineChart('.ct-chart', data, options);
      * ```
      *
      * @example
      * ```ts
      * // Use specific interpolation function with configuration from the Chartist.Interpolation module
      *
      * const chart = new LineChart('.ct-chart', {
      *   labels: [1, 2, 3, 4, 5],
      *   series: [
      *     [1, 1, 8, 1, 7]
      *   ]
      * }, {
      *   lineSmooth: Chartist.Interpolation.cardinal({
      *     tension: 0.2
      *   })
      * });
      * ```
      *
      * @example
      * ```ts
      * // Create a line chart with responsive options
      *
      * const data = {
      *   // A labels array that can contain any sort of values
      *   labels: ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday'],
      *   // Our series array that contains series objects or in this case series data arrays
      *   series: [
      *     [5, 2, 4, 2, 0]
      *   ]
      * };
      *
      * // In addition to the regular options we specify responsive option overrides that will override the default configutation based on the matching media queries.
      * const responsiveOptions = [
      *   ['screen and (min-width: 641px) and (max-width: 1024px)', {
      *     showPoint: false,
      *     axisX: {
      *       labelInterpolationFnc: function(value) {
      *         // Will return Mon, Tue, Wed etc. on medium screens
      *         return value.slice(0, 3);
      *       }
      *     }
      *   }],
      *   ['screen and (max-width: 640px)', {
      *     showLine: false,
      *     axisX: {
      *       labelInterpolationFnc: function(value) {
      *         // Will return M, T, W etc. on small screens
      *         return value[0];
      *       }
      *     }
      *   }]
      * ];
      *
      * new LineChart('.ct-chart', data, null, responsiveOptions);
      * ```
      */
    def this(query: String, data: LineChartData) = this()
    def this(query: Element, data: LineChartData) = this()
    def this(query: Null, data: LineChartData) = this()
    def this(query: String, data: LineChartData, options: LineChartOptions[AxisOptions, AxisOptions]) = this()
    def this(query: Element, data: LineChartData, options: LineChartOptions[AxisOptions, AxisOptions]) = this()
    def this(query: Null, data: LineChartData, options: LineChartOptions[AxisOptions, AxisOptions]) = this()
    def this(
      query: String,
      data: LineChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[LineChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: String,
      data: LineChartData,
      options: LineChartOptions[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[LineChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Element,
      data: LineChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[LineChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Element,
      data: LineChartData,
      options: LineChartOptions[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[LineChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Null,
      data: LineChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[LineChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Null,
      data: LineChartData,
      options: LineChartOptions[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[LineChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    
    /**
      * Creates a new chart
      */
    def createChart(options: LineChartOptionsWithDefaults): Unit = js.native
    
    /* protected */ @JSName("data")
    var data_LineChart: LineChartData = js.native
  }
  
  inline def getSeriesOption[T /* <: /* keyof chartist.anon.OmitLineChartOptionsWithD */ plugins | width | height | reverseData | low | lineSmooth | showLine | high | referenceValue | showArea | showPoint | chartPadding | fullWidth | showGridBackground | axisX | axisY | areaBase | classNames */](series: SeriesObject[SeriesPrimitiveValue], options: LineChartOptionsWithDefaults, key: T): /* import warning: importer.ImportType#apply Failed type conversion: chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptionsWithDefaults[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSeriesOption")(series.asInstanceOf[js.Any], options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptionsWithDefaults[T] */ js.Any]
  inline def getSeriesOption[T /* <: /* keyof chartist.anon.OmitLineChartOptionsWithD */ plugins | width | height | reverseData | low | lineSmooth | showLine | high | referenceValue | showArea | showPoint | chartPadding | fullWidth | showGridBackground | axisX | axisY | areaBase | classNames */](series: Series[SeriesPrimitiveValue], options: LineChartOptionsWithDefaults, key: T): /* import warning: importer.ImportType#apply Failed type conversion: chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptionsWithDefaults[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSeriesOption")(series.asInstanceOf[js.Any], options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptionsWithDefaults[T] */ js.Any]
}
