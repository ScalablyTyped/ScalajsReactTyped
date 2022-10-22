package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultLoginAccountOperations extends StObject {
  
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
object IVaultLoginAccountOperations {
  
  inline def apply(
    AddLoginAccount: (ILoginAccount, String) => Callback,
    ForceLogout: IStrings => Callback,
    GetLoginAccount: String => ILoginAccount,
    GetLoginAccounts: CallbackTo[ILoginAccounts],
    GetLoginAccountsWithSessions: CallbackTo[ILoginAccounts],
    GetPersonalInformationFromDomain: String => ILoginAccountPersonalInformation,
    ModifyLoginAccount: ILoginAccount => Callback,
    RemoveLoginAccount: String => Callback,
    UpdateLoginPassword: (String, String) => Callback
  ): IVaultLoginAccountOperations = {
    val __obj = js.Dynamic.literal(AddLoginAccount = js.Any.fromFunction2((t0: ILoginAccount, t1: String) => (AddLoginAccount(t0, t1)).runNow()), ForceLogout = js.Any.fromFunction1((t0: IStrings) => ForceLogout(t0).runNow()), GetLoginAccount = js.Any.fromFunction1(GetLoginAccount), GetLoginAccounts = GetLoginAccounts.toJsFn, GetLoginAccountsWithSessions = GetLoginAccountsWithSessions.toJsFn, GetPersonalInformationFromDomain = js.Any.fromFunction1(GetPersonalInformationFromDomain), ModifyLoginAccount = js.Any.fromFunction1((t0: ILoginAccount) => ModifyLoginAccount(t0).runNow()), RemoveLoginAccount = js.Any.fromFunction1((t0: String) => RemoveLoginAccount(t0).runNow()), UpdateLoginPassword = js.Any.fromFunction2((t0: String, t1: String) => (UpdateLoginPassword(t0, t1)).runNow()))
    __obj.asInstanceOf[IVaultLoginAccountOperations]
  }
  
  extension [Self <: IVaultLoginAccountOperations](x: Self) {
    
    inline def setAddLoginAccount(value: (ILoginAccount, String) => Callback): Self = StObject.set(x, "AddLoginAccount", js.Any.fromFunction2((t0: ILoginAccount, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setForceLogout(value: IStrings => Callback): Self = StObject.set(x, "ForceLogout", js.Any.fromFunction1((t0: IStrings) => value(t0).runNow()))
    
    inline def setGetLoginAccount(value: String => ILoginAccount): Self = StObject.set(x, "GetLoginAccount", js.Any.fromFunction1(value))
    
    inline def setGetLoginAccounts(value: CallbackTo[ILoginAccounts]): Self = StObject.set(x, "GetLoginAccounts", value.toJsFn)
    
    inline def setGetLoginAccountsWithSessions(value: CallbackTo[ILoginAccounts]): Self = StObject.set(x, "GetLoginAccountsWithSessions", value.toJsFn)
    
    inline def setGetPersonalInformationFromDomain(value: String => ILoginAccountPersonalInformation): Self = StObject.set(x, "GetPersonalInformationFromDomain", js.Any.fromFunction1(value))
    
    inline def setModifyLoginAccount(value: ILoginAccount => Callback): Self = StObject.set(x, "ModifyLoginAccount", js.Any.fromFunction1((t0: ILoginAccount) => value(t0).runNow()))
    
    inline def setRemoveLoginAccount(value: String => Callback): Self = StObject.set(x, "RemoveLoginAccount", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUpdateLoginPassword(value: (String, String) => Callback): Self = StObject.set(x, "UpdateLoginPassword", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
