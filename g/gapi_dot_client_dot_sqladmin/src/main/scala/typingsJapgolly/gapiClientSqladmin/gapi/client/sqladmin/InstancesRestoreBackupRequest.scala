package typingsJapgolly.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesRestoreBackupRequest extends js.Object {
  /** Parameters required to perform the restore backup operation. */
  var restoreBackupContext: js.UndefOr[RestoreBackupContext] = js.undefined
}

object InstancesRestoreBackupRequest {
  @scala.inline
  def apply(restoreBackupContext: RestoreBackupContext = null): InstancesRestoreBackupRequest = {
    val __obj = js.Dynamic.literal()
    if (restoreBackupContext != null) __obj.updateDynamic("restoreBackupContext")(restoreBackupContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesRestoreBackupRequest]
  }
}

