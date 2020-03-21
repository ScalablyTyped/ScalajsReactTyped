package typingsJapgolly.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryGrantableRolesResponse extends js.Object {
  /**
    * To retrieve the next page of results, set
    * `QueryGrantableRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of matching roles. */
  var roles: js.UndefOr[js.Array[Role]] = js.undefined
}

object QueryGrantableRolesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, roles: js.Array[Role] = null): QueryGrantableRolesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryGrantableRolesResponse]
  }
}

