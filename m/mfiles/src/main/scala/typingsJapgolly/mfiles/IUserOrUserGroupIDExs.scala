package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupIDExs extends js.Object {
  val Count: Double
  def Add(Index: Double, UserOrUserGroupIDEx: IUserOrUserGroupIDEx): Unit
  def Clone(): IUserOrUserGroupIDExs
  def GetUserOrUserGroupIDEx(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupIDEx
  def GetUserOrUserGroupIDExIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double
  def Item(Index: Double): IUserOrUserGroupIDEx
  def Remove(Index: Double): Unit
}

object IUserOrUserGroupIDExs {
  @scala.inline
  def apply(
    Add: (Double, IUserOrUserGroupIDEx) => Callback,
    Clone: CallbackTo[IUserOrUserGroupIDExs],
    Count: Double,
    GetUserOrUserGroupIDEx: (Double, MFUserOrUserGroupType) => CallbackTo[IUserOrUserGroupIDEx],
    GetUserOrUserGroupIDExIndex: (Double, MFUserOrUserGroupType) => CallbackTo[Double],
    Item: Double => CallbackTo[IUserOrUserGroupIDEx],
    Remove: Double => Callback
  ): IUserOrUserGroupIDExs = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IUserOrUserGroupIDEx) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetUserOrUserGroupIDEx")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType) => GetUserOrUserGroupIDEx(t0, t1).runNow()))
    __obj.updateDynamic("GetUserOrUserGroupIDExIndex")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType) => GetUserOrUserGroupIDExIndex(t0, t1).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IUserOrUserGroupIDExs]
  }
}

