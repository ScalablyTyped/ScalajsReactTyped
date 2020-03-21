package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerLoginAccountOperations extends js.Object {
  def AddLoginAccount(LoginAccount: ILoginAccount, Password: String): Unit
  def ForceLogout(AccountNames: IStrings): Unit
  def GetLoginAccount(AccountName: String): ILoginAccount
  def GetLoginAccounts(): ILoginAccounts
  def GetLoginAccountsWithSessions(): ILoginAccounts
  def GetPersonalInformationFromDomain(AccountName: String): ILoginAccountPersonalInformation
  def ModifyLoginAccount(LoginAccount: ILoginAccount): Unit
  def RemoveLoginAccount(AccountName: String): Unit
  def UpdateLoginPassword(AccountName: String, NewPassword: String): Unit
}

object IServerLoginAccountOperations {
  @scala.inline
  def apply(
    AddLoginAccount: (ILoginAccount, String) => Callback,
    ForceLogout: IStrings => Callback,
    GetLoginAccount: String => CallbackTo[ILoginAccount],
    GetLoginAccounts: CallbackTo[ILoginAccounts],
    GetLoginAccountsWithSessions: CallbackTo[ILoginAccounts],
    GetPersonalInformationFromDomain: String => CallbackTo[ILoginAccountPersonalInformation],
    ModifyLoginAccount: ILoginAccount => Callback,
    RemoveLoginAccount: String => Callback,
    UpdateLoginPassword: (String, String) => Callback
  ): IServerLoginAccountOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddLoginAccount")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.ILoginAccount, t1: java.lang.String) => AddLoginAccount(t0, t1).runNow()))
    __obj.updateDynamic("ForceLogout")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IStrings) => ForceLogout(t0).runNow()))
    __obj.updateDynamic("GetLoginAccount")(js.Any.fromFunction1((t0: java.lang.String) => GetLoginAccount(t0).runNow()))
    __obj.updateDynamic("GetLoginAccounts")(GetLoginAccounts.toJsFn)
    __obj.updateDynamic("GetLoginAccountsWithSessions")(GetLoginAccountsWithSessions.toJsFn)
    __obj.updateDynamic("GetPersonalInformationFromDomain")(js.Any.fromFunction1((t0: java.lang.String) => GetPersonalInformationFromDomain(t0).runNow()))
    __obj.updateDynamic("ModifyLoginAccount")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ILoginAccount) => ModifyLoginAccount(t0).runNow()))
    __obj.updateDynamic("RemoveLoginAccount")(js.Any.fromFunction1((t0: java.lang.String) => RemoveLoginAccount(t0).runNow()))
    __obj.updateDynamic("UpdateLoginPassword")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => UpdateLoginPassword(t0, t1).runNow()))
    __obj.asInstanceOf[IServerLoginAccountOperations]
  }
}

