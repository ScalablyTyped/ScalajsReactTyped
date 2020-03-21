package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIngestionsRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID of the dataset used in the ingestion.
    */
  var DataSetId: java.lang.String = js.native
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[IngestionMaxResults] = js.native
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[java.lang.String] = js.native
}

object ListIngestionsRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DataSetId: java.lang.String,
    MaxResults: Int | scala.Double = null,
    NextToken: java.lang.String = null
  ): ListIngestionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIngestionsRequest]
  }
}

