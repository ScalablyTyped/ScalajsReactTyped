package typingsJapgolly.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionChange extends js.Object {
  var addedPermissions: js.UndefOr[js.Array[Permission]] = js.undefined
  var removedPermissions: js.UndefOr[js.Array[Permission]] = js.undefined
}

object PermissionChange {
  @scala.inline
  def apply(addedPermissions: js.Array[Permission] = null, removedPermissions: js.Array[Permission] = null): PermissionChange = {
    val __obj = js.Dynamic.literal()
    if (addedPermissions != null) __obj.updateDynamic("addedPermissions")(addedPermissions.asInstanceOf[js.Any])
    if (removedPermissions != null) __obj.updateDynamic("removedPermissions")(removedPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionChange]
  }
}

