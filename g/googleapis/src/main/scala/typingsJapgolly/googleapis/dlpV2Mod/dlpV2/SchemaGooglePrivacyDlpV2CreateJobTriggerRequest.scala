package typingsJapgolly.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for CreateJobTrigger.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CreateJobTriggerRequest extends js.Object {
  /**
    * The JobTrigger to create.
    */
  var jobTrigger: js.UndefOr[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  /**
    * The trigger id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var triggerId: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CreateJobTriggerRequest {
  @scala.inline
  def apply(jobTrigger: SchemaGooglePrivacyDlpV2JobTrigger = null, triggerId: String = null): SchemaGooglePrivacyDlpV2CreateJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    if (jobTrigger != null) __obj.updateDynamic("jobTrigger")(jobTrigger.asInstanceOf[js.Any])
    if (triggerId != null) __obj.updateDynamic("triggerId")(triggerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateJobTriggerRequest]
  }
}

