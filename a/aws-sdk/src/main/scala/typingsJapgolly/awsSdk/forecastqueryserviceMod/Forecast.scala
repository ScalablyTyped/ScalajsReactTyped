package typingsJapgolly.awsSdk.forecastqueryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Forecast extends js.Object {
  /**
    * The forecast. The string of the string-to-array map is one of the following values:   p10   p50   p90  
    */
  var Predictions: js.UndefOr[typingsJapgolly.awsSdk.forecastqueryserviceMod.Predictions] = js.native
}

object Forecast {
  @scala.inline
  def apply(Predictions: Predictions = null): Forecast = {
    val __obj = js.Dynamic.literal()
    if (Predictions != null) __obj.updateDynamic("Predictions")(Predictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Forecast]
  }
}

