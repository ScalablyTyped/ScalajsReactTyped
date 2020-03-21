package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** User role collection. */
  var userRoles: js.UndefOr[js.Array[UserRole]] = js.undefined
}

object UserRolesListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, userRoles: js.Array[UserRole] = null): UserRolesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (userRoles != null) __obj.updateDynamic("userRoles")(userRoles.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRolesListResponse]
  }
}

