package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyPendingMaintenanceActionResult extends js.Object {
  var ResourcePendingMaintenanceActions: js.UndefOr[typingsJapgolly.awsSdk.rdsMod.ResourcePendingMaintenanceActions] = js.native
}

object ApplyPendingMaintenanceActionResult {
  @scala.inline
  def apply(ResourcePendingMaintenanceActions: ResourcePendingMaintenanceActions = null): ApplyPendingMaintenanceActionResult = {
    val __obj = js.Dynamic.literal()
    if (ResourcePendingMaintenanceActions != null) __obj.updateDynamic("ResourcePendingMaintenanceActions")(ResourcePendingMaintenanceActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPendingMaintenanceActionResult]
  }
}

