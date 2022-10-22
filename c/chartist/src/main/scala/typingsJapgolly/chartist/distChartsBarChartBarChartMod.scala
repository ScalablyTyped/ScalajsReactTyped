package typingsJapgolly.chartist

import org.scalajs.dom.Element
import typingsJapgolly.chartist.distChartsBarChartBarChartDottypesMod.BarChartData
import typingsJapgolly.chartist.distChartsBarChartBarChartDottypesMod.BarChartEventsTypes
import typingsJapgolly.chartist.distChartsBarChartBarChartDottypesMod.BarChartOptions
import typingsJapgolly.chartist.distChartsBarChartBarChartDottypesMod.BarChartOptionsWithDefaults
import typingsJapgolly.chartist.distChartsBaseChartMod.BaseChart
import typingsJapgolly.chartist.distCoreTypesMod.AxisOptions
import typingsJapgolly.chartist.distCoreTypesMod.ResponsiveOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChartsBarChartBarChartMod {
  
  @JSImport("chartist/dist/charts/BarChart/BarChart", "BarChart")
  @js.native
  open class BarChart protected () extends BaseChart[BarChartEventsTypes] {
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
    
    /**
      * Creates a new chart
      */
    def createChart(options: BarChartOptionsWithDefaults): Unit = js.native
    
    /* protected */ @JSName("data")
    var data_BarChart: BarChartData = js.native
  }
}
