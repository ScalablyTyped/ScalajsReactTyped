package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProcessingJobsRequest extends js.Object {
  /**
    * A filter that returns only processing jobs created after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only processing jobs created after the specified time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only processing jobs modified after the specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only processing jobs modified before the specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * The maximum number of processing jobs to return in the response.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * A string in the processing job name. This filter returns only processing jobs whose name contains the specified string.
    */
  var NameContains: js.UndefOr[String] = js.native
  /**
    * If the result of the previous ListProcessingJobs request was truncated, the response includes a NextToken. To retrieve the next set of processing jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.SortBy] = js.native
  /**
    * The sort order for results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that retrieves only processing jobs with a specific status.
    */
  var StatusEquals: js.UndefOr[ProcessingJobStatus] = js.native
}

object ListProcessingJobsRequest {
  @scala.inline
  def apply(
    CreationTimeAfter: js.Date = null,
    CreationTimeBefore: js.Date = null,
    LastModifiedTimeAfter: js.Date = null,
    LastModifiedTimeBefore: js.Date = null,
    MaxResults: Int | Double = null,
    NameContains: String = null,
    NextToken: NextToken = null,
    SortBy: SortBy = null,
    SortOrder: SortOrder = null,
    StatusEquals: ProcessingJobStatus = null
  ): ListProcessingJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (LastModifiedTimeAfter != null) __obj.updateDynamic("LastModifiedTimeAfter")(LastModifiedTimeAfter.asInstanceOf[js.Any])
    if (LastModifiedTimeBefore != null) __obj.updateDynamic("LastModifiedTimeBefore")(LastModifiedTimeBefore.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StatusEquals != null) __obj.updateDynamic("StatusEquals")(StatusEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProcessingJobsRequest]
  }
}

