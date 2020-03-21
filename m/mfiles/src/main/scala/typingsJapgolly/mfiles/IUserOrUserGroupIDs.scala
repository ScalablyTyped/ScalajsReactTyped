package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupIDs extends js.Object {
  val Count: Double
  def Add(Index: Double, UserOrUserGroupID: IUserOrUserGroupID): Unit
  def Clone(): IUserOrUserGroupIDs
  def GetUserOrUserGroupID(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupID
  def GetUserOrUserGroupIDIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double
  def Item(Index: Double): IUserOrUserGroupID
  def Remove(Index: Double): Unit
}

object IUserOrUserGroupIDs {
  @scala.inline
  def apply(
    Add: (Double, IUserOrUserGroupID) => Callback,
    Clone: CallbackTo[IUserOrUserGroupIDs],
    Count: Double,
    GetUserOrUserGroupID: (Double, MFUserOrUserGroupType) => CallbackTo[IUserOrUserGroupID],
    GetUserOrUserGroupIDIndex: (Double, MFUserOrUserGroupType) => CallbackTo[Double],
    Item: Double => CallbackTo[IUserOrUserGroupID],
    Remove: Double => Callback
  ): IUserOrUserGroupIDs = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IUserOrUserGroupID) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetUserOrUserGroupID")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType) => GetUserOrUserGroupID(t0, t1).runNow()))
    __obj.updateDynamic("GetUserOrUserGroupIDIndex")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType) => GetUserOrUserGroupIDIndex(t0, t1).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IUserOrUserGroupIDs]
  }
}

