package typingsJapgolly.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitJobRequest extends js.Object {
  /** Required. The job resource. */
  var job: js.UndefOr[Job] = js.undefined
}

object SubmitJobRequest {
  @scala.inline
  def apply(job: Job = null): SubmitJobRequest = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitJobRequest]
  }
}

