package typingsJapgolly.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionGrant extends js.Object {
  /** The android permission, e.g. android.permission.READ_CALENDAR. */
  var permission: js.UndefOr[String] = js.undefined
  /** The policy for granting the permission. */
  var policy: js.UndefOr[String] = js.undefined
}

object PermissionGrant {
  @scala.inline
  def apply(permission: String = null, policy: String = null): PermissionGrant = {
    val __obj = js.Dynamic.literal()
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionGrant]
  }
}

