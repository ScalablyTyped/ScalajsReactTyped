package typingsJapgolly.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsRequest extends js.Object {
  /**
    * The job ID for an array job. Specifying an array job ID with this parameter lists all child jobs from within the specified array.
    */
  var arrayJobId: js.UndefOr[String] = js.native
  /**
    * The name or full Amazon Resource Name (ARN) of the job queue with which to list jobs.
    */
  var jobQueue: js.UndefOr[String] = js.native
  /**
    * The job status with which to filter jobs in the specified queue. If you do not specify a status, only RUNNING jobs are returned.
    */
  var jobStatus: js.UndefOr[JobStatus] = js.native
  /**
    * The maximum number of results returned by ListJobs in paginated output. When this parameter is used, ListJobs only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListJobs request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListJobs returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * The job ID for a multi-node parallel job. Specifying a multi-node parallel job ID with this parameter lists all nodes that are associated with the specified job.
    */
  var multiNodeJobId: js.UndefOr[String] = js.native
  /**
    * The nextToken value returned from a previous paginated ListJobs request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListJobsRequest {
  @scala.inline
  def apply(
    arrayJobId: String = null,
    jobQueue: String = null,
    jobStatus: JobStatus = null,
    maxResults: Int | Double = null,
    multiNodeJobId: String = null,
    nextToken: String = null
  ): ListJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (arrayJobId != null) __obj.updateDynamic("arrayJobId")(arrayJobId.asInstanceOf[js.Any])
    if (jobQueue != null) __obj.updateDynamic("jobQueue")(jobQueue.asInstanceOf[js.Any])
    if (jobStatus != null) __obj.updateDynamic("jobStatus")(jobStatus.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (multiNodeJobId != null) __obj.updateDynamic("multiNodeJobId")(multiNodeJobId.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsRequest]
  }
}

