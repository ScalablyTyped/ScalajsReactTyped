package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultUserSettingOperations extends StObject {
  
  def ChangeVaultLanguage(Language: Double): Unit
  
  def GetSubstituteUsers(): IUserOrUserGroupIDs
  
  def GetVaultLanguage(): Double
  
  def GetVaultLanguageCode(): String
  
  def SetSubstituteUsers(UserOrUserGroupIDs: IUserOrUserGroupIDs): Unit
}
object IVaultUserSettingOperations {
  
  inline def apply(
    ChangeVaultLanguage: Double => Callback,
    GetSubstituteUsers: CallbackTo[IUserOrUserGroupIDs],
    GetVaultLanguage: CallbackTo[Double],
    GetVaultLanguageCode: CallbackTo[String],
    SetSubstituteUsers: IUserOrUserGroupIDs => Callback
  ): IVaultUserSettingOperations = {
    val __obj = js.Dynamic.literal(ChangeVaultLanguage = js.Any.fromFunction1((t0: Double) => ChangeVaultLanguage(t0).runNow()), GetSubstituteUsers = GetSubstituteUsers.toJsFn, GetVaultLanguage = GetVaultLanguage.toJsFn, GetVaultLanguageCode = GetVaultLanguageCode.toJsFn, SetSubstituteUsers = js.Any.fromFunction1((t0: IUserOrUserGroupIDs) => SetSubstituteUsers(t0).runNow()))
    __obj.asInstanceOf[IVaultUserSettingOperations]
  }
  
  extension [Self <: IVaultUserSettingOperations](x: Self) {
    
    inline def setChangeVaultLanguage(value: Double => Callback): Self = StObject.set(x, "ChangeVaultLanguage", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setGetSubstituteUsers(value: CallbackTo[IUserOrUserGroupIDs]): Self = StObject.set(x, "GetSubstituteUsers", value.toJsFn)
    
    inline def setGetVaultLanguage(value: CallbackTo[Double]): Self = StObject.set(x, "GetVaultLanguage", value.toJsFn)
    
    inline def setGetVaultLanguageCode(value: CallbackTo[String]): Self = StObject.set(x, "GetVaultLanguageCode", value.toJsFn)
    
    inline def setSetSubstituteUsers(value: IUserOrUserGroupIDs => Callback): Self = StObject.set(x, "SetSubstituteUsers", js.Any.fromFunction1((t0: IUserOrUserGroupIDs) => value(t0).runNow()))
  }
}
