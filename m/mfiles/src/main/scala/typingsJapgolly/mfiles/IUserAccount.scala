package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFUserAccountVaultRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserAccount extends StObject {
  
  var AccessControlList: IAccessControlList
  
  def AddVaultRoles(VaultRolesToAdd: MFUserAccountVaultRole): Unit
  
  def Clone(): IUserAccount
  
  def CloneFrom(UserAccount: IUserAccount): Unit
  
  var Enabled: Boolean
  
  var ID: Double
  
  var InternalUser: Boolean
  
  var LoginName: String
  
  def RemoveVaultRoles(VaultRolesToRemove: MFUserAccountVaultRole): Unit
  
  var VaultLanguage: Double
  
  var VaultRoles: MFUserAccountVaultRole
}
object IUserAccount {
  
  inline def apply(
    AccessControlList: IAccessControlList,
    AddVaultRoles: MFUserAccountVaultRole => Callback,
    Clone: CallbackTo[IUserAccount],
    CloneFrom: IUserAccount => Callback,
    Enabled: Boolean,
    ID: Double,
    InternalUser: Boolean,
    LoginName: String,
    RemoveVaultRoles: MFUserAccountVaultRole => Callback,
    VaultLanguage: Double,
    VaultRoles: MFUserAccountVaultRole
  ): IUserAccount = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], AddVaultRoles = js.Any.fromFunction1((t0: MFUserAccountVaultRole) => AddVaultRoles(t0).runNow()), Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: IUserAccount) => CloneFrom(t0).runNow()), Enabled = Enabled.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], InternalUser = InternalUser.asInstanceOf[js.Any], LoginName = LoginName.asInstanceOf[js.Any], RemoveVaultRoles = js.Any.fromFunction1((t0: MFUserAccountVaultRole) => RemoveVaultRoles(t0).runNow()), VaultLanguage = VaultLanguage.asInstanceOf[js.Any], VaultRoles = VaultRoles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserAccount]
  }
  
  extension [Self <: IUserAccount](x: Self) {
    
    inline def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setAddVaultRoles(value: MFUserAccountVaultRole => Callback): Self = StObject.set(x, "AddVaultRoles", js.Any.fromFunction1((t0: MFUserAccountVaultRole) => value(t0).runNow()))
    
    inline def setClone(value: CallbackTo[IUserAccount]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: IUserAccount => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: IUserAccount) => value(t0).runNow()))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setInternalUser(value: Boolean): Self = StObject.set(x, "InternalUser", value.asInstanceOf[js.Any])
    
    inline def setLoginName(value: String): Self = StObject.set(x, "LoginName", value.asInstanceOf[js.Any])
    
    inline def setRemoveVaultRoles(value: MFUserAccountVaultRole => Callback): Self = StObject.set(x, "RemoveVaultRoles", js.Any.fromFunction1((t0: MFUserAccountVaultRole) => value(t0).runNow()))
    
    inline def setVaultLanguage(value: Double): Self = StObject.set(x, "VaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setVaultRoles(value: MFUserAccountVaultRole): Self = StObject.set(x, "VaultRoles", value.asInstanceOf[js.Any])
  }
}
