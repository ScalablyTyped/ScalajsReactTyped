package typingsJapgolly.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCostForecastResponse extends js.Object {
  /**
    * The forecasts for your query, in order. For DAILY forecasts, this is a list of days. For MONTHLY forecasts, this is a list of months.
    */
  var ForecastResultsByTime: js.UndefOr[typingsJapgolly.awsSdk.costexplorerMod.ForecastResultsByTime] = js.native
  /**
    * How much you are forecasted to spend over the forecast period, in USD.
    */
  var Total: js.UndefOr[MetricValue] = js.native
}

object GetCostForecastResponse {
  @scala.inline
  def apply(ForecastResultsByTime: ForecastResultsByTime = null, Total: MetricValue = null): GetCostForecastResponse = {
    val __obj = js.Dynamic.literal()
    if (ForecastResultsByTime != null) __obj.updateDynamic("ForecastResultsByTime")(ForecastResultsByTime.asInstanceOf[js.Any])
    if (Total != null) __obj.updateDynamic("Total")(Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCostForecastResponse]
  }
}

