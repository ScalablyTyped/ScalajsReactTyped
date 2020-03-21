package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermission extends js.Object {
  var availability: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var permissionGroupId: js.UndefOr[String] = js.undefined
}

object UserRolePermission {
  @scala.inline
  def apply(
    availability: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    permissionGroupId: String = null
  ): UserRolePermission = {
    val __obj = js.Dynamic.literal()
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionGroupId != null) __obj.updateDynamic("permissionGroupId")(permissionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRolePermission]
  }
}

