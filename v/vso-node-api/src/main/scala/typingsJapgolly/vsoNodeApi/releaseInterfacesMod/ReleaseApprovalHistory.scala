package typingsJapgolly.vsoNodeApi.releaseInterfacesMod

import typingsJapgolly.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseApprovalHistory extends js.Object {
  var approver: IdentityRef
  var changedBy: IdentityRef
  var comments: String
  var createdOn: js.Date
  var modifiedOn: js.Date
  var revision: Double
}

object ReleaseApprovalHistory {
  @scala.inline
  def apply(
    approver: IdentityRef,
    changedBy: IdentityRef,
    comments: String,
    createdOn: js.Date,
    modifiedOn: js.Date,
    revision: Double
  ): ReleaseApprovalHistory = {
    val __obj = js.Dynamic.literal(approver = approver.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseApprovalHistory]
  }
}

