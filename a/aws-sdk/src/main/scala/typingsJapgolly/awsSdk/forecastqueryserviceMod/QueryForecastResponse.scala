package typingsJapgolly.awsSdk.forecastqueryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryForecastResponse extends js.Object {
  /**
    * The forecast.
    */
  var Forecast: js.UndefOr[typingsJapgolly.awsSdk.forecastqueryserviceMod.Forecast] = js.native
}

object QueryForecastResponse {
  @scala.inline
  def apply(Forecast: Forecast = null): QueryForecastResponse = {
    val __obj = js.Dynamic.literal()
    if (Forecast != null) __obj.updateDynamic("Forecast")(Forecast.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryForecastResponse]
  }
}

