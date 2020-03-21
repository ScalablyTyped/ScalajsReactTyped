package typingsJapgolly.highcharts.boostMod.highchartsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
  /**
    * Returns true if the chart is in series boost mode.
    *
    * @param chart
    *        the chart to check
    *
    * @return true if the chart is in series boost mode
    */
  def isChartSeriesBoosting(chart: Chart): Boolean
}

object Chart {
  @scala.inline
  def apply(isChartSeriesBoosting: Chart => CallbackTo[Boolean]): Chart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isChartSeriesBoosting")(js.Any.fromFunction1((t0: typingsJapgolly.highcharts.boostMod.highchartsAugmentingMod.Chart) => isChartSeriesBoosting(t0).runNow()))
    __obj.asInstanceOf[Chart]
  }
}

