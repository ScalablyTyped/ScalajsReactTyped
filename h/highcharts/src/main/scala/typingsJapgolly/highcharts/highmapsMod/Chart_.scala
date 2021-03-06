package typingsJapgolly.highcharts.highmapsMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.highcharts.mod.ChartCallbackFunction
import typingsJapgolly.highcharts.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highmaps", "Chart")
@js.native
class Chart_ protected ()
  extends typingsJapgolly.highcharts.mod.Chart_ {
  /**
    * The Chart class. The recommended constructor is Highcharts#chart.
    *
    * @param options
    *        The chart options structure.
    *
    * @param callback
    *        Function to run when the chart has loaded and and all external
    *        images are loaded. Defining a chart.events.load handler is
    *        equivalent.
    */
  def this(options: Options) = this()
  def this(options: Options, callback: ChartCallbackFunction) = this()
  /**
    * The Chart class. The recommended constructor is Highcharts#chart.
    *
    * @param renderTo
    *        The DOM element to render to, or its id.
    *
    * @param options
    *        The chart options structure.
    *
    * @param callback
    *        Function to run when the chart has loaded and and all external
    *        images are loaded. Defining a chart.events.load handler is
    *        equivalent.
    */
  def this(renderTo: String, options: Options) = this()
  def this(renderTo: HTMLElement, options: Options) = this()
  def this(renderTo: String, options: Options, callback: ChartCallbackFunction) = this()
  def this(renderTo: HTMLElement, options: Options, callback: ChartCallbackFunction) = this()
}

