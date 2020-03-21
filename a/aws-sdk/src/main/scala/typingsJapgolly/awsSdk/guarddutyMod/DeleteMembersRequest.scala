package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMembersRequest extends js.Object {
  /**
    * A list of account IDs of the GuardDuty member accounts that you want to delete.
    */
  var AccountIds: typingsJapgolly.awsSdk.guarddutyMod.AccountIds = js.native
  /**
    * The unique ID of the detector of the GuardDuty account whose members you want to delete.
    */
  var DetectorId: typingsJapgolly.awsSdk.guarddutyMod.DetectorId = js.native
}

object DeleteMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): DeleteMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMembersRequest]
  }
}

