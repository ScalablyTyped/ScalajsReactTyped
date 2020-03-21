package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultUserOperations extends js.Object {
  def AddOrUndeleteUserAccount(User: IUserAccount): IUserAccount
  def AddUserAccount(User: IUserAccount): IUserAccount
  def GetLoginAccountOfUser(UserID: Double): ILoginAccount
  def GetLoginAccounts(): ILoginAccounts
  def GetUserAccount(UserID: Double): IUserAccount
  def GetUserAccounts(): IUserAccounts
  def GetUserIDByGUID(UserGUID: String): Double
  def GetUserList(): IKeyNamePairs
  def ModifyUserAccount(User: IUserAccount): Unit
  def RemoveUserAccount(UserID: Double): Unit
}

object IVaultUserOperations {
  @scala.inline
  def apply(
    AddOrUndeleteUserAccount: IUserAccount => CallbackTo[IUserAccount],
    AddUserAccount: IUserAccount => CallbackTo[IUserAccount],
    GetLoginAccountOfUser: Double => CallbackTo[ILoginAccount],
    GetLoginAccounts: CallbackTo[ILoginAccounts],
    GetUserAccount: Double => CallbackTo[IUserAccount],
    GetUserAccounts: CallbackTo[IUserAccounts],
    GetUserIDByGUID: String => CallbackTo[Double],
    GetUserList: CallbackTo[IKeyNamePairs],
    ModifyUserAccount: IUserAccount => Callback,
    RemoveUserAccount: Double => Callback
  ): IVaultUserOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddOrUndeleteUserAccount")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IUserAccount) => AddOrUndeleteUserAccount(t0).runNow()))
    __obj.updateDynamic("AddUserAccount")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IUserAccount) => AddUserAccount(t0).runNow()))
    __obj.updateDynamic("GetLoginAccountOfUser")(js.Any.fromFunction1((t0: scala.Double) => GetLoginAccountOfUser(t0).runNow()))
    __obj.updateDynamic("GetLoginAccounts")(GetLoginAccounts.toJsFn)
    __obj.updateDynamic("GetUserAccount")(js.Any.fromFunction1((t0: scala.Double) => GetUserAccount(t0).runNow()))
    __obj.updateDynamic("GetUserAccounts")(GetUserAccounts.toJsFn)
    __obj.updateDynamic("GetUserIDByGUID")(js.Any.fromFunction1((t0: java.lang.String) => GetUserIDByGUID(t0).runNow()))
    __obj.updateDynamic("GetUserList")(GetUserList.toJsFn)
    __obj.updateDynamic("ModifyUserAccount")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IUserAccount) => ModifyUserAccount(t0).runNow()))
    __obj.updateDynamic("RemoveUserAccount")(js.Any.fromFunction1((t0: scala.Double) => RemoveUserAccount(t0).runNow()))
    __obj.asInstanceOf[IVaultUserOperations]
  }
}

