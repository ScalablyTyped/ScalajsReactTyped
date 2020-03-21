package typingsJapgolly.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDocumentClassificationJobResponse extends js.Object {
  /**
    * The identifier generated for the job. To get the status of the job, use this identifier with the operation.
    */
  var JobId: js.UndefOr[typingsJapgolly.awsSdk.comprehendMod.JobId] = js.native
  /**
    * The status of the job:   SUBMITTED - The job has been received and queued for processing.   IN_PROGRESS - Amazon Comprehend is processing the job.   COMPLETED - The job was successfully completed and the output is available.   FAILED - The job did not complete. For details, use the operation.   STOP_REQUESTED - Amazon Comprehend has received a stop request for the job and is processing the request.   STOPPED - The job was successfully stopped without completing.  
    */
  var JobStatus: js.UndefOr[typingsJapgolly.awsSdk.comprehendMod.JobStatus] = js.native
}

object StartDocumentClassificationJobResponse {
  @scala.inline
  def apply(JobId: JobId = null, JobStatus: JobStatus = null): StartDocumentClassificationJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDocumentClassificationJobResponse]
  }
}

