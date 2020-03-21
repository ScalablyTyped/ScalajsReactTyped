package typingsJapgolly.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsageForecastResponse extends js.Object {
  /**
    * The forecasts for your query, in order. For DAILY forecasts, this is a list of days. For MONTHLY forecasts, this is a list of months.
    */
  var ForecastResultsByTime: js.UndefOr[typingsJapgolly.awsSdk.costexplorerMod.ForecastResultsByTime] = js.native
  /**
    * How much you're forecasted to use over the forecast period.
    */
  var Total: js.UndefOr[MetricValue] = js.native
}

object GetUsageForecastResponse {
  @scala.inline
  def apply(ForecastResultsByTime: ForecastResultsByTime = null, Total: MetricValue = null): GetUsageForecastResponse = {
    val __obj = js.Dynamic.literal()
    if (ForecastResultsByTime != null) __obj.updateDynamic("ForecastResultsByTime")(ForecastResultsByTime.asInstanceOf[js.Any])
    if (Total != null) __obj.updateDynamic("Total")(Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageForecastResponse]
  }
}

