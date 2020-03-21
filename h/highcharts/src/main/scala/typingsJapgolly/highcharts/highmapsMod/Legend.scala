package typingsJapgolly.highcharts.highmapsMod

import typingsJapgolly.highcharts.mod.LegendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highmaps", "Legend")
@js.native
class Legend protected ()
  extends typingsJapgolly.highcharts.mod.Legend {
  /**
    * The overview of the chart's series. The legend object is instanciated
    * internally in the chart constructor, and is available from the
    * `chart.legend` property. Each chart has only one legend.
    *
    * @param chart
    *        The chart instance.
    *
    * @param options
    *        Legend options.
    */
  def this(chart: typingsJapgolly.highcharts.mod.Chart_, options: LegendOptions) = this()
}

