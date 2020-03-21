package typingsJapgolly.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDominantLanguageDetectionJobResponse extends js.Object {
  /**
    * The identifier generated for the job. To get the status of a job, use this identifier with the operation.
    */
  var JobId: js.UndefOr[typingsJapgolly.awsSdk.comprehendMod.JobId] = js.native
  /**
    * The status of the job.    SUBMITTED - The job has been received and is queued for processing.   IN_PROGRESS - Amazon Comprehend is processing the job.   COMPLETED - The job was successfully completed and the output is available.   FAILED - The job did not complete. To get details, use the operation.  
    */
  var JobStatus: js.UndefOr[typingsJapgolly.awsSdk.comprehendMod.JobStatus] = js.native
}

object StartDominantLanguageDetectionJobResponse {
  @scala.inline
  def apply(JobId: JobId = null, JobStatus: JobStatus = null): StartDominantLanguageDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDominantLanguageDetectionJobResponse]
  }
}

