package typingsJapgolly.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetsResponse extends js.Object {
  /**
    * An array of objects that summarize each dataset's properties.
    */
  var Datasets: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.Datasets] = js.native
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.NextToken] = js.native
}

object ListDatasetsResponse {
  @scala.inline
  def apply(Datasets: Datasets = null, NextToken: NextToken = null): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    if (Datasets != null) __obj.updateDynamic("Datasets")(Datasets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetsResponse]
  }
}

