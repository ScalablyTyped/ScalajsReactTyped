package typingsJapgolly.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListForecastsResponse extends js.Object {
  /**
    * An array of objects that summarize each forecast's properties.
    */
  var Forecasts: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.Forecasts] = js.native
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.NextToken] = js.native
}

object ListForecastsResponse {
  @scala.inline
  def apply(Forecasts: Forecasts = null, NextToken: NextToken = null): ListForecastsResponse = {
    val __obj = js.Dynamic.literal()
    if (Forecasts != null) __obj.updateDynamic("Forecasts")(Forecasts.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListForecastsResponse]
  }
}

