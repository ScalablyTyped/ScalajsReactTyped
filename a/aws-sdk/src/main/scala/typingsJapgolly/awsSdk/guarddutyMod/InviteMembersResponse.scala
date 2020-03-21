package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteMembersResponse extends js.Object {
  /**
    * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
    */
  var UnprocessedAccounts: typingsJapgolly.awsSdk.guarddutyMod.UnprocessedAccounts = js.native
}

object InviteMembersResponse {
  @scala.inline
  def apply(UnprocessedAccounts: UnprocessedAccounts): InviteMembersResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InviteMembersResponse]
  }
}

