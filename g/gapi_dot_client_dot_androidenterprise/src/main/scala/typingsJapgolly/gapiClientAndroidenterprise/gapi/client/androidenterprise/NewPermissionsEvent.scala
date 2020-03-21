package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewPermissionsEvent extends js.Object {
  /**
    * The set of permissions that the enterprise admin has already approved for this application. Use Permissions.Get on the EMM API to retrieve details
    * about these permissions.
    */
  var approvedPermissions: js.UndefOr[js.Array[String]] = js.undefined
  /** The id of the product (e.g. "app:com.google.android.gm") for which new permissions were added. This field will always be present. */
  var productId: js.UndefOr[String] = js.undefined
  /** The set of permissions that the app is currently requesting. Use Permissions.Get on the EMM API to retrieve details about these permissions. */
  var requestedPermissions: js.UndefOr[js.Array[String]] = js.undefined
}

object NewPermissionsEvent {
  @scala.inline
  def apply(
    approvedPermissions: js.Array[String] = null,
    productId: String = null,
    requestedPermissions: js.Array[String] = null
  ): NewPermissionsEvent = {
    val __obj = js.Dynamic.literal()
    if (approvedPermissions != null) __obj.updateDynamic("approvedPermissions")(approvedPermissions.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (requestedPermissions != null) __obj.updateDynamic("requestedPermissions")(requestedPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewPermissionsEvent]
  }
}

