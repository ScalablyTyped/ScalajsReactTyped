package typingsJapgolly.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMembersRequest extends js.Object {
  /**
    * The list of account IDs for the member accounts to delete.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.native
}

object DeleteMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList = null): DeleteMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (AccountIds != null) __obj.updateDynamic("AccountIds")(AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMembersRequest]
  }
}

