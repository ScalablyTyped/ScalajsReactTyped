package typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserPermissionsResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.undefined
  var userPermission: js.UndefOr[js.Array[UserPermission]] = js.undefined
}

object ListUserPermissionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, userPermission: js.Array[UserPermission] = null): ListUserPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (userPermission != null) __obj.updateDynamic("userPermission")(userPermission.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserPermissionsResponse]
  }
}

