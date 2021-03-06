package typingsJapgolly.highcharts.highmapsMod

import typingsJapgolly.highcharts.mod.TimeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highmaps", "Time")
@js.native
class Time_ protected ()
  extends typingsJapgolly.highcharts.mod.Time_ {
  /**
    * The Time class. Time settings are applied in general for each page using
    * `Highcharts.setOptions`, or individually for each Chart item through the
    * time options set.
    *
    * The Time object is available from Highcharts.Chart#time, which refers to
    * `Highcharts.time` if no individual time settings are applied.
    *
    * @param options
    *        Time options as defined in chart.options.time.
    */
  def this(options: TimeOptions) = this()
}

