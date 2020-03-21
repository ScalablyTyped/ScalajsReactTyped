package typingsJapgolly.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCelebrityRecognitionRequest extends js.Object {
  /**
    * Job identifier for the required celebrity recognition analysis. You can get the job identifer from a call to StartCelebrityRecognition.
    */
  var JobId: typingsJapgolly.awsSdk.rekognitionMod.JobId = js.native
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.MaxResults] = js.native
  /**
    * If the previous response was incomplete (because there is more recognized celebrities to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of celebrities. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Sort to use for celebrities returned in Celebrities field. Specify ID to sort by the celebrity identifier, specify TIMESTAMP to sort by the time the celebrity was recognized.
    */
  var SortBy: js.UndefOr[CelebrityRecognitionSortBy] = js.native
}

object GetCelebrityRecognitionRequest {
  @scala.inline
  def apply(
    JobId: JobId,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null,
    SortBy: CelebrityRecognitionSortBy = null
  ): GetCelebrityRecognitionRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCelebrityRecognitionRequest]
  }
}

