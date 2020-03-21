package typingsJapgolly.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartRestoreJobOutput extends js.Object {
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: js.UndefOr[typingsJapgolly.awsSdk.backupMod.RestoreJobId] = js.native
}

object StartRestoreJobOutput {
  @scala.inline
  def apply(RestoreJobId: RestoreJobId = null): StartRestoreJobOutput = {
    val __obj = js.Dynamic.literal()
    if (RestoreJobId != null) __obj.updateDynamic("RestoreJobId")(RestoreJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRestoreJobOutput]
  }
}

