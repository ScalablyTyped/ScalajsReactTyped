package typingsJapgolly.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcknowledgeThirdPartyJobOutput extends js.Object {
  /**
    * The status information for the third party job, if any.
    */
  var status: js.UndefOr[JobStatus] = js.native
}

object AcknowledgeThirdPartyJobOutput {
  @scala.inline
  def apply(status: JobStatus = null): AcknowledgeThirdPartyJobOutput = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeThirdPartyJobOutput]
  }
}

