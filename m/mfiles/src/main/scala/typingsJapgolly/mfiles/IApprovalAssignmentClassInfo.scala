package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApprovalAssignmentClassInfo extends js.Object {
  var AnyAssigneeApproves: Boolean
  var SignatureForApproval: ISignatureSettings
  var SignatureForRejection: ISignatureSettings
  def Clone(): IApprovalAssignmentClassInfo
}

object IApprovalAssignmentClassInfo {
  @scala.inline
  def apply(
    AnyAssigneeApproves: Boolean,
    Clone: CallbackTo[IApprovalAssignmentClassInfo],
    SignatureForApproval: ISignatureSettings,
    SignatureForRejection: ISignatureSettings
  ): IApprovalAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(AnyAssigneeApproves = AnyAssigneeApproves.asInstanceOf[js.Any], SignatureForApproval = SignatureForApproval.asInstanceOf[js.Any], SignatureForRejection = SignatureForRejection.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IApprovalAssignmentClassInfo]
  }
}

