package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupIDEx extends js.Object {
  val IndirectProperty: IIndirectPropertyID
  val UserOrGroupID: Double
  val UserOrGroupType: MFUserOrUserGroupType
  val WorkflowState: Double
  def Clone(): IUserOrUserGroupIDEx
  def SetIndirectPropertyPseudoUser(PseudoUserID: IIndirectPropertyID): Unit
  def SetUserAccount(UserAccount: Double): Unit
  def SetUserGroup(UserGroup: Double): Unit
  def SetWorkflowStatePseudoUser(WorkflowState: Double): Unit
}

object IUserOrUserGroupIDEx {
  @scala.inline
  def apply(
    Clone: CallbackTo[IUserOrUserGroupIDEx],
    IndirectProperty: IIndirectPropertyID,
    SetIndirectPropertyPseudoUser: IIndirectPropertyID => Callback,
    SetUserAccount: Double => Callback,
    SetUserGroup: Double => Callback,
    SetWorkflowStatePseudoUser: Double => Callback,
    UserOrGroupID: Double,
    UserOrGroupType: MFUserOrUserGroupType,
    WorkflowState: Double
  ): IUserOrUserGroupIDEx = {
    val __obj = js.Dynamic.literal(IndirectProperty = IndirectProperty.asInstanceOf[js.Any], UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any], UserOrGroupType = UserOrGroupType.asInstanceOf[js.Any], WorkflowState = WorkflowState.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("SetIndirectPropertyPseudoUser")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IIndirectPropertyID) => SetIndirectPropertyPseudoUser(t0).runNow()))
    __obj.updateDynamic("SetUserAccount")(js.Any.fromFunction1((t0: scala.Double) => SetUserAccount(t0).runNow()))
    __obj.updateDynamic("SetUserGroup")(js.Any.fromFunction1((t0: scala.Double) => SetUserGroup(t0).runNow()))
    __obj.updateDynamic("SetWorkflowStatePseudoUser")(js.Any.fromFunction1((t0: scala.Double) => SetWorkflowStatePseudoUser(t0).runNow()))
    __obj.asInstanceOf[IUserOrUserGroupIDEx]
  }
}

