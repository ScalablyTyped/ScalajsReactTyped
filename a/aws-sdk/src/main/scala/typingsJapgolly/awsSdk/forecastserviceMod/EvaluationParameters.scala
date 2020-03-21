package typingsJapgolly.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationParameters extends js.Object {
  /**
    * The point from the end of the dataset where you want to split the data for model training and testing (evaluation). Specify the value as the number of data points. The default is the value of the forecast horizon. BackTestWindowOffset can be used to mimic a past virtual forecast start date. This value must be greater than or equal to the forecast horizon and less than half of the TARGET_TIME_SERIES dataset length.  ForecastHorizon &lt;= BackTestWindowOffset &lt; 1/2 * TARGET_TIME_SERIES dataset length
    */
  var BackTestWindowOffset: js.UndefOr[Integer] = js.native
  /**
    * The number of times to split the input data. The default is 1. Valid values are 1 through 5.
    */
  var NumberOfBacktestWindows: js.UndefOr[Integer] = js.native
}

object EvaluationParameters {
  @scala.inline
  def apply(
    BackTestWindowOffset: Int | scala.Double = null,
    NumberOfBacktestWindows: Int | scala.Double = null
  ): EvaluationParameters = {
    val __obj = js.Dynamic.literal()
    if (BackTestWindowOffset != null) __obj.updateDynamic("BackTestWindowOffset")(BackTestWindowOffset.asInstanceOf[js.Any])
    if (NumberOfBacktestWindows != null) __obj.updateDynamic("NumberOfBacktestWindows")(NumberOfBacktestWindows.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationParameters]
  }
}

