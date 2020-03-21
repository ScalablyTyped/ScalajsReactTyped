package typingsJapgolly.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSentimentDetectionJobRequest extends js.Object {
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typingsJapgolly.awsSdk.comprehendMod.JobId = js.native
}

object DescribeSentimentDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeSentimentDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeSentimentDetectionJobRequest]
  }
}

