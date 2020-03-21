package typingsJapgolly.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPredictorsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.NextToken] = js.native
  /**
    * An array of objects that summarize each predictor's properties.
    */
  var Predictors: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.Predictors] = js.native
}

object ListPredictorsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Predictors: Predictors = null): ListPredictorsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Predictors != null) __obj.updateDynamic("Predictors")(Predictors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPredictorsResponse]
  }
}

