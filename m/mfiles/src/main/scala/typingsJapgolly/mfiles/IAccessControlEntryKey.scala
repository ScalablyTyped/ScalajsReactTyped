package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntryKey extends js.Object {
  val HasConcreteUserOrGroupID: Boolean
  val IsGroup: Boolean
  val IsPseudoUser: Boolean
  var PseudoUserID: IIndirectPropertyID
  val UserOrGroupID: Double
  def Clone(): IAccessControlEntryKey
  def GetResolvedPseudoUserOrGroupIDs(): IUserOrUserGroupIDs
  def ResetResolvedPseudoUserOrGroupIDs(): Unit
  def SetUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): Unit
}

object IAccessControlEntryKey {
  @scala.inline
  def apply(
    Clone: CallbackTo[IAccessControlEntryKey],
    GetResolvedPseudoUserOrGroupIDs: CallbackTo[IUserOrUserGroupIDs],
    HasConcreteUserOrGroupID: Boolean,
    IsGroup: Boolean,
    IsPseudoUser: Boolean,
    PseudoUserID: IIndirectPropertyID,
    ResetResolvedPseudoUserOrGroupIDs: Callback,
    SetUserOrGroupID: (Double, Boolean) => Callback,
    UserOrGroupID: Double
  ): IAccessControlEntryKey = {
    val __obj = js.Dynamic.literal(HasConcreteUserOrGroupID = HasConcreteUserOrGroupID.asInstanceOf[js.Any], IsGroup = IsGroup.asInstanceOf[js.Any], IsPseudoUser = IsPseudoUser.asInstanceOf[js.Any], PseudoUserID = PseudoUserID.asInstanceOf[js.Any], UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetResolvedPseudoUserOrGroupIDs")(GetResolvedPseudoUserOrGroupIDs.toJsFn)
    __obj.updateDynamic("ResetResolvedPseudoUserOrGroupIDs")(ResetResolvedPseudoUserOrGroupIDs.toJsFn)
    __obj.updateDynamic("SetUserOrGroupID")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => SetUserOrGroupID(t0, t1).runNow()))
    __obj.asInstanceOf[IAccessControlEntryKey]
  }
}

