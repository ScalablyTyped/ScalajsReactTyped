package typingsJapgolly.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInvitationsResponse extends js.Object {
  /**
    * The list of AWS accounts for which the invitations were not deleted. For each account, the list includes the account ID and the email address.
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.native
}

object DeleteInvitationsResponse {
  @scala.inline
  def apply(UnprocessedAccounts: ResultList = null): DeleteInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (UnprocessedAccounts != null) __obj.updateDynamic("UnprocessedAccounts")(UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInvitationsResponse]
  }
}

