package typingsJapgolly.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTopicsDetectionJobRequest extends js.Object {
  /**
    * The identifier assigned by the user to the detection job.
    */
  var JobId: typingsJapgolly.awsSdk.comprehendMod.JobId = js.native
}

object DescribeTopicsDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeTopicsDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTopicsDetectionJobRequest]
  }
}

