package typingsJapgolly.highcharts.drilldownMod.highchartsAugmentingMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.highcharts.mod.Point
import typingsJapgolly.highcharts.mod.SeriesOptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
  /**
    * Add a series to the chart as drilldown from a specific point in the
    * parent series. This method is used for async drilldown, when clicking
    * a point in a series should result in loading and displaying a more
    * high-resolution series. When not async, the setup is simpler using
    * the drilldown.series options structure.
    *
    * @param point
    *        The point from which the drilldown will start.
    *
    * @param options
    *        The series options for the new, detailed series.
    */
  def addSeriesAsDrilldown(point: Point, options: SeriesOptionsType): Unit
  /**
    * When the chart is drilled down to a child series, calling
    * `chart.drillUp()` will drill up to the parent series.
    */
  def drillUp(): Unit
}

object Chart {
  @scala.inline
  def apply(addSeriesAsDrilldown: (Point, SeriesOptionsType) => Callback, drillUp: Callback): Chart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addSeriesAsDrilldown")(js.Any.fromFunction2((t0: typingsJapgolly.highcharts.mod.Point, t1: typingsJapgolly.highcharts.mod.SeriesOptionsType) => addSeriesAsDrilldown(t0, t1).runNow()))
    __obj.updateDynamic("drillUp")(drillUp.toJsFn)
    __obj.asInstanceOf[Chart]
  }
}

