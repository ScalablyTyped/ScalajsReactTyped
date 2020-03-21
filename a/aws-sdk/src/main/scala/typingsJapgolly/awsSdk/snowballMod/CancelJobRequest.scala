package typingsJapgolly.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelJobRequest extends js.Object {
  /**
    * The 39-character job ID for the job that you want to cancel, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typingsJapgolly.awsSdk.snowballMod.JobId = js.native
}

object CancelJobRequest {
  @scala.inline
  def apply(JobId: JobId): CancelJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelJobRequest]
  }
}

