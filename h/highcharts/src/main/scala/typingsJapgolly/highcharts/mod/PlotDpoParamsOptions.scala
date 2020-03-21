package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotDpoParamsOptions extends js.Object {
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Period for Detrended Price Oscillator
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotDpoParamsOptions {
  @scala.inline
  def apply(index: Int | Double = null, period: Int | Double = null): PlotDpoParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotDpoParamsOptions]
  }
}

