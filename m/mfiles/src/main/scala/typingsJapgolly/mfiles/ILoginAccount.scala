package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFLicenseType
import typingsJapgolly.mfiles.MFiles.MFLoginAccountType
import typingsJapgolly.mfiles.MFiles.MFLoginServerRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILoginAccount extends StObject {
  
  val AccountName: String
  
  var AccountType: MFLoginAccountType
  
  def Clone(): ILoginAccount
  
  def CloneFrom(LoginAccount: ILoginAccount): Unit
  
  var DomainName: String
  
  var EmailAddress: String
  
  var Enabled: Boolean
  
  var FullName: String
  
  var LicenseType: MFLicenseType
  
  var ServerRoles: MFLoginServerRole
  
  def Set(
    LoginAccountType: MFLoginAccountType,
    DomainName: String,
    UserName: String,
    ServerRoles: MFLoginServerRole,
    FullName: String,
    EmailAddress: String,
    LicenseType: MFLicenseType
  ): Unit
  
  var UserName: String
}
object ILoginAccount {
  
  inline def apply(
    AccountName: String,
    AccountType: MFLoginAccountType,
    Clone: CallbackTo[ILoginAccount],
    CloneFrom: ILoginAccount => Callback,
    DomainName: String,
    EmailAddress: String,
    Enabled: Boolean,
    FullName: String,
    LicenseType: MFLicenseType,
    ServerRoles: MFLoginServerRole,
    Set: (MFLoginAccountType, String, String, MFLoginServerRole, String, String, MFLicenseType) => Callback,
    UserName: String
  ): ILoginAccount = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], AccountType = AccountType.asInstanceOf[js.Any], Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: ILoginAccount) => CloneFrom(t0).runNow()), DomainName = DomainName.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], LicenseType = LicenseType.asInstanceOf[js.Any], ServerRoles = ServerRoles.asInstanceOf[js.Any], Set = js.Any.fromFunction7((t0: MFLoginAccountType, t1: String, t2: String, t3: MFLoginServerRole, t4: String, t5: String, t6: MFLicenseType) => (Set(t0, t1, t2, t3, t4, t5, t6)).runNow()), UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginAccount]
  }
  
  extension [Self <: ILoginAccount](x: Self) {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    inline def setAccountType(value: MFLoginAccountType): Self = StObject.set(x, "AccountType", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[ILoginAccount]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: ILoginAccount => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: ILoginAccount) => value(t0).runNow()))
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    inline def setLicenseType(value: MFLicenseType): Self = StObject.set(x, "LicenseType", value.asInstanceOf[js.Any])
    
    inline def setServerRoles(value: MFLoginServerRole): Self = StObject.set(x, "ServerRoles", value.asInstanceOf[js.Any])
    
    inline def setSet(
      value: (MFLoginAccountType, String, String, MFLoginServerRole, String, String, MFLicenseType) => Callback
    ): Self = StObject.set(x, "Set", js.Any.fromFunction7((t0: MFLoginAccountType, t1: String, t2: String, t3: MFLoginServerRole, t4: String, t5: String, t6: MFLicenseType) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
