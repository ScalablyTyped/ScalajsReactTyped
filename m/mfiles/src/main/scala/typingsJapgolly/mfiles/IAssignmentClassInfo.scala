package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFAssignmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssignmentClassInfo extends js.Object {
  var ApprovalAssignmentClassInfo: IApprovalAssignmentClassInfo
  val AssignmentType: MFAssignmentType
  var TaskAssignmentClassInfo: ITaskAssignmentClassInfo
  def Clone(): IAssignmentClassInfo
}

object IAssignmentClassInfo {
  @scala.inline
  def apply(
    ApprovalAssignmentClassInfo: IApprovalAssignmentClassInfo,
    AssignmentType: MFAssignmentType,
    Clone: CallbackTo[IAssignmentClassInfo],
    TaskAssignmentClassInfo: ITaskAssignmentClassInfo
  ): IAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(ApprovalAssignmentClassInfo = ApprovalAssignmentClassInfo.asInstanceOf[js.Any], AssignmentType = AssignmentType.asInstanceOf[js.Any], TaskAssignmentClassInfo = TaskAssignmentClassInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IAssignmentClassInfo]
  }
}

