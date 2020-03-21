package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionGroupsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var userRolePermissionGroups: js.UndefOr[js.Array[UserRolePermissionGroup]] = js.undefined
}

object UserRolePermissionGroupsListResponse {
  @scala.inline
  def apply(kind: String = null, userRolePermissionGroups: js.Array[UserRolePermissionGroup] = null): UserRolePermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (userRolePermissionGroups != null) __obj.updateDynamic("userRolePermissionGroups")(userRolePermissionGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRolePermissionGroupsListResponse]
  }
}

