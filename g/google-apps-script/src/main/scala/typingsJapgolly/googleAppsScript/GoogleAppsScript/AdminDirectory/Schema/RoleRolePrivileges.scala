package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleRolePrivileges extends js.Object {
  var privilegeName: js.UndefOr[String] = js.undefined
  var serviceId: js.UndefOr[String] = js.undefined
}

object RoleRolePrivileges {
  @scala.inline
  def apply(privilegeName: String = null, serviceId: String = null): RoleRolePrivileges = {
    val __obj = js.Dynamic.literal()
    if (privilegeName != null) __obj.updateDynamic("privilegeName")(privilegeName.asInstanceOf[js.Any])
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleRolePrivileges]
  }
}

