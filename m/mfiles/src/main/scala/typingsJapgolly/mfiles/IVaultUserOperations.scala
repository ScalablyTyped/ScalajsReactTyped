package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultUserOperations extends StObject {
  
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
  
  inline def apply(
    AddOrUndeleteUserAccount: IUserAccount => IUserAccount,
    AddUserAccount: IUserAccount => IUserAccount,
    GetLoginAccountOfUser: Double => ILoginAccount,
    GetLoginAccounts: CallbackTo[ILoginAccounts],
    GetUserAccount: Double => IUserAccount,
    GetUserAccounts: CallbackTo[IUserAccounts],
    GetUserIDByGUID: String => Double,
    GetUserList: CallbackTo[IKeyNamePairs],
    ModifyUserAccount: IUserAccount => Callback,
    RemoveUserAccount: Double => Callback
  ): IVaultUserOperations = {
    val __obj = js.Dynamic.literal(AddOrUndeleteUserAccount = js.Any.fromFunction1(AddOrUndeleteUserAccount), AddUserAccount = js.Any.fromFunction1(AddUserAccount), GetLoginAccountOfUser = js.Any.fromFunction1(GetLoginAccountOfUser), GetLoginAccounts = GetLoginAccounts.toJsFn, GetUserAccount = js.Any.fromFunction1(GetUserAccount), GetUserAccounts = GetUserAccounts.toJsFn, GetUserIDByGUID = js.Any.fromFunction1(GetUserIDByGUID), GetUserList = GetUserList.toJsFn, ModifyUserAccount = js.Any.fromFunction1((t0: IUserAccount) => ModifyUserAccount(t0).runNow()), RemoveUserAccount = js.Any.fromFunction1((t0: Double) => RemoveUserAccount(t0).runNow()))
    __obj.asInstanceOf[IVaultUserOperations]
  }
  
  extension [Self <: IVaultUserOperations](x: Self) {
    
    inline def setAddOrUndeleteUserAccount(value: IUserAccount => IUserAccount): Self = StObject.set(x, "AddOrUndeleteUserAccount", js.Any.fromFunction1(value))
    
    inline def setAddUserAccount(value: IUserAccount => IUserAccount): Self = StObject.set(x, "AddUserAccount", js.Any.fromFunction1(value))
    
    inline def setGetLoginAccountOfUser(value: Double => ILoginAccount): Self = StObject.set(x, "GetLoginAccountOfUser", js.Any.fromFunction1(value))
    
    inline def setGetLoginAccounts(value: CallbackTo[ILoginAccounts]): Self = StObject.set(x, "GetLoginAccounts", value.toJsFn)
    
    inline def setGetUserAccount(value: Double => IUserAccount): Self = StObject.set(x, "GetUserAccount", js.Any.fromFunction1(value))
    
    inline def setGetUserAccounts(value: CallbackTo[IUserAccounts]): Self = StObject.set(x, "GetUserAccounts", value.toJsFn)
    
    inline def setGetUserIDByGUID(value: String => Double): Self = StObject.set(x, "GetUserIDByGUID", js.Any.fromFunction1(value))
    
    inline def setGetUserList(value: CallbackTo[IKeyNamePairs]): Self = StObject.set(x, "GetUserList", value.toJsFn)
    
    inline def setModifyUserAccount(value: IUserAccount => Callback): Self = StObject.set(x, "ModifyUserAccount", js.Any.fromFunction1((t0: IUserAccount) => value(t0).runNow()))
    
    inline def setRemoveUserAccount(value: Double => Callback): Self = StObject.set(x, "RemoveUserAccount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
