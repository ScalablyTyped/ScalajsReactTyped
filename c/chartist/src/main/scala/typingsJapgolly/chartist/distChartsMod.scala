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
import typingsJapgolly.chartist.distChartsBarChartBarChartDottypesMod.BarChartData
import typingsJapgolly.chartist.distChartsBarChartBarChartDottypesMod.BarChartOptions
import typingsJapgolly.chartist.distChartsLineChartLineChartDottypesMod.LineChartData
import typingsJapgolly.chartist.distChartsLineChartLineChartDottypesMod.LineChartOptions
import typingsJapgolly.chartist.distChartsLineChartLineChartDottypesMod.LineChartOptionsWithDefaults
import typingsJapgolly.chartist.distChartsPieChartPieChartDottypesMod.AnchorPosition
import typingsJapgolly.chartist.distChartsPieChartPieChartDottypesMod.Dot
import typingsJapgolly.chartist.distChartsPieChartPieChartDottypesMod.LabelDirection
import typingsJapgolly.chartist.distChartsPieChartPieChartDottypesMod.PieChartData
import typingsJapgolly.chartist.distChartsPieChartPieChartDottypesMod.PieChartOptions
import typingsJapgolly.chartist.distCoreTypesMod.AllSeriesTypes
import typingsJapgolly.chartist.distCoreTypesMod.AxisOptions
import typingsJapgolly.chartist.distCoreTypesMod.Data
import typingsJapgolly.chartist.distCoreTypesMod.Options
import typingsJapgolly.chartist.distCoreTypesMod.ResponsiveOptions
import typingsJapgolly.chartist.distCoreTypesMod.Series
import typingsJapgolly.chartist.distCoreTypesMod.SeriesObject
import typingsJapgolly.chartist.distCoreTypesMod.SeriesPrimitiveValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChartsMod {
  
  @JSImport("chartist/dist/charts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chartist/dist/charts", "BarChart")
  @js.native
  open class BarChart protected ()
    extends typingsJapgolly.chartist.distChartsBarChartMod.BarChart {
    /**
      * This method creates a new bar chart and returns API object that you can use for later changes.
      * @param query A selector query string or directly a DOM element
      * @param data The data object that needs to consist of a labels and a series array
      * @param options The options object with options that override the default options. Check the examples for a detailed list.
      * @param responsiveOptions Specify an array of responsive option arrays which are a media query and options object pair => [[mediaQueryString, optionsObject],[more...]]
      * @return An object which exposes the API for the created chart
      *
      * @example
      * ```ts
      * // Create a simple bar chart
      * const data = {
      *   labels: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri'],
      *   series: [
      *     [5, 2, 4, 2, 0]
      *   ]
      * };
      *
      * // In the global name space Chartist we call the Bar function to initialize a bar chart. As a first parameter we pass in a selector where we would like to get our chart created and as a second parameter we pass our data object.
      * new BarChart('.ct-chart', data);
      * ```
      *
      * @example
      * ```ts
      * // This example creates a bipolar grouped bar chart where the boundaries are limitted to -10 and 10
      * new BarChart('.ct-chart', {
      *   labels: [1, 2, 3, 4, 5, 6, 7],
      *   series: [
      *     [1, 3, 2, -5, -3, 1, -6],
      *     [-5, -2, -4, -1, 2, -3, 1]
      *   ]
      * }, {
      *   seriesBarDistance: 12,
      *   low: -10,
      *   high: 10
      * });
      * ```
      */
    def this(query: String, data: BarChartData) = this()
    def this(query: Element, data: BarChartData) = this()
    def this(query: Null, data: BarChartData) = this()
    def this(query: String, data: BarChartData, options: BarChartOptions[AxisOptions, AxisOptions]) = this()
    def this(query: Element, data: BarChartData, options: BarChartOptions[AxisOptions, AxisOptions]) = this()
    def this(query: Null, data: BarChartData, options: BarChartOptions[AxisOptions, AxisOptions]) = this()
    def this(
      query: String,
      data: BarChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[BarChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: String,
      data: BarChartData,
      options: BarChartOptions[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[BarChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Element,
      data: BarChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[BarChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Element,
      data: BarChartData,
      options: BarChartOptions[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[BarChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Null,
      data: BarChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[BarChartOptions[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Null,
      data: BarChartData,
      options: BarChartOptions[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[BarChartOptions[AxisOptions, AxisOptions]]
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("chartist/dist/charts", "BaseChart")
  @js.native
  open class BaseChart[TEventsTypes] protected ()
    extends typingsJapgolly.chartist.distChartsBaseChartMod.BaseChart[TEventsTypes] {
    def this(
      query: String,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions]
    ) = this()
    def this(
      query: Element,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions]
    ) = this()
    def this(
      query: Null,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions]
    ) = this()
    def this(
      query: String,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[Options[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Element,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[Options[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Null,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[Options[AxisOptions, AxisOptions]]
    ) = this()
  }
  
  @JSImport("chartist/dist/charts", "LineChart")
  @js.native
  open class LineChart protected ()
    extends typingsJapgolly.chartist.distChartsLineChartMod.LineChart {
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
  }
  
  @JSImport("chartist/dist/charts", "PieChart")
  @js.native
  open class PieChart protected ()
    extends typingsJapgolly.chartist.distChartsPieChartMod.PieChart {
    /**
      * This method creates a new pie chart and returns an object that can be used to redraw the chart.
      * @param query A selector query string or directly a DOM element
      * @param data The data object in the pie chart needs to have a series property with a one dimensional data array. The values will be normalized against each other and don't necessarily need to be in percentage. The series property can also be an array of value objects that contain a value property and a className property to override the CSS class name for the series group.
      * @param options The options object with options that override the default options. Check the examples for a detailed list.
      * @param responsiveOptions Specify an array of responsive option arrays which are a media query and options object pair => [[mediaQueryString, optionsObject],[more...]]
      *
      * @example
      * ```ts
      * // Simple pie chart example with four series
      * new PieChart('.ct-chart', {
      *   series: [10, 2, 4, 3]
      * });
      * ```
      *
      * @example
      * ```ts
      * // Drawing a donut chart
      * new PieChart('.ct-chart', {
      *   series: [10, 2, 4, 3]
      * }, {
      *   donut: true
      * });
      * ```
      *
      * @example
      * ```ts
      * // Using donut, startAngle and total to draw a gauge chart
      * new PieChart('.ct-chart', {
      *   series: [20, 10, 30, 40]
      * }, {
      *   donut: true,
      *   donutWidth: 20,
      *   startAngle: 270,
      *   total: 200
      * });
      * ```
      *
      * @example
      * ```ts
      * // Drawing a pie chart with padding and labels that are outside the pie
      * new PieChart('.ct-chart', {
      *   series: [20, 10, 30, 40]
      * }, {
      *   chartPadding: 30,
      *   labelOffset: 50,
      *   labelDirection: 'explode'
      * });
      * ```
      *
      * @example
      * ```ts
      * // Overriding the class names for individual series as well as a name and meta data.
      * // The name will be written as ct:series-name attribute and the meta data will be serialized and written
      * // to a ct:meta attribute.
      * new PieChart('.ct-chart', {
      *   series: [{
      *     value: 20,
      *     name: 'Series 1',
      *     className: 'my-custom-class-one',
      *     meta: 'Meta One'
      *   }, {
      *     value: 10,
      *     name: 'Series 2',
      *     className: 'my-custom-class-two',
      *     meta: 'Meta Two'
      *   }, {
      *     value: 70,
      *     name: 'Series 3',
      *     className: 'my-custom-class-three',
      *     meta: 'Meta Three'
      *   }]
      * });
      * ```
      */
    def this(query: String, data: PieChartData) = this()
    def this(query: Element, data: PieChartData) = this()
    def this(query: Null, data: PieChartData) = this()
    def this(query: String, data: PieChartData, options: PieChartOptions) = this()
    def this(query: Element, data: PieChartData, options: PieChartOptions) = this()
    def this(query: Null, data: PieChartData, options: PieChartOptions) = this()
    def this(
      query: String,
      data: PieChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[PieChartOptions]
    ) = this()
    def this(
      query: String,
      data: PieChartData,
      options: PieChartOptions,
      responsiveOptions: ResponsiveOptions[PieChartOptions]
    ) = this()
    def this(
      query: Element,
      data: PieChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[PieChartOptions]
    ) = this()
    def this(
      query: Element,
      data: PieChartData,
      options: PieChartOptions,
      responsiveOptions: ResponsiveOptions[PieChartOptions]
    ) = this()
    def this(
      query: Null,
      data: PieChartData,
      options: Unit,
      responsiveOptions: ResponsiveOptions[PieChartOptions]
    ) = this()
    def this(
      query: Null,
      data: PieChartData,
      options: PieChartOptions,
      responsiveOptions: ResponsiveOptions[PieChartOptions]
    ) = this()
  }
  
  inline def determineAnchorPosition(center: Dot, label: Dot, direction: LabelDirection): AnchorPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("determineAnchorPosition")(center.asInstanceOf[js.Any], label.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[AnchorPosition]
  
  inline def getSeriesOption[T /* <: /* keyof chartist.anon.OmitLineChartOptionsWithD */ plugins | width | height | reverseData | low | lineSmooth | showLine | high | referenceValue | showArea | showPoint | chartPadding | fullWidth | showGridBackground | axisX | axisY | areaBase | classNames */](series: SeriesObject[SeriesPrimitiveValue], options: LineChartOptionsWithDefaults, key: T): /* import warning: importer.ImportType#apply Failed type conversion: chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptionsWithDefaults[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSeriesOption")(series.asInstanceOf[js.Any], options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptionsWithDefaults[T] */ js.Any]
  inline def getSeriesOption[T /* <: /* keyof chartist.anon.OmitLineChartOptionsWithD */ plugins | width | height | reverseData | low | lineSmooth | showLine | high | referenceValue | showArea | showPoint | chartPadding | fullWidth | showGridBackground | axisX | axisY | areaBase | classNames */](series: Series[SeriesPrimitiveValue], options: LineChartOptionsWithDefaults, key: T): /* import warning: importer.ImportType#apply Failed type conversion: chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptionsWithDefaults[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSeriesOption")(series.asInstanceOf[js.Any], options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptionsWithDefaults[T] */ js.Any]
}
