package typingsJapgolly.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsAddMemberRequest extends js.Object {
  /** Fully-qualified URLs of the User resources to add. */
  var users: js.UndefOr[js.Array[String]] = js.undefined
}

object GroupsAddMemberRequest {
  @scala.inline
  def apply(users: js.Array[String] = null): GroupsAddMemberRequest = {
    val __obj = js.Dynamic.literal()
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupsAddMemberRequest]
  }
}

