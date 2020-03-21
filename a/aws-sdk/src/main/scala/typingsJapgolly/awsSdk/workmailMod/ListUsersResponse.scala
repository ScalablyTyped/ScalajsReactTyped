package typingsJapgolly.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUsersResponse extends js.Object {
  /**
    *  The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.workmailMod.NextToken] = js.native
  /**
    * The overview of users for an organization.
    */
  var Users: js.UndefOr[typingsJapgolly.awsSdk.workmailMod.Users] = js.native
}

object ListUsersResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Users: Users = null): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersResponse]
  }
}

