package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordProfile extends StObject {
  
  /**
    * true if the user must change her password on the next login; otherwise false. If not set, default is false. NOTE: For
    * Azure B2C tenants, set to false and instead use custom policies and user flows to force password reset at first sign
    * in. See Force password reset at first logon.
    */
  var forceChangePasswordNextSignIn: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * If true, at next sign-in, the user must perform a multi-factor authentication (MFA) before being forced to change their
    * password. The behavior is identical to forceChangePasswordNextSignIn except that the user is required to first perform
    * a multi-factor authentication before password change. After a password change, this property will be automatically
    * reset to false. If not set, default is false.
    */
  var forceChangePasswordNextSignInWithMfa: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The password for the user. This property is required when a user is created. It can be updated, but the user will be
    * required to change the password on the next login. The password must satisfy minimum requirements as specified by the
    * user’s passwordPolicies property. By default, a strong password is required.
    */
  var password: js.UndefOr[NullableOption[String]] = js.undefined
}
object PasswordProfile {
  
  inline def apply(): PasswordProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordProfile]
  }
  
  extension [Self <: PasswordProfile](x: Self) {
    
    inline def setForceChangePasswordNextSignIn(value: NullableOption[Boolean]): Self = StObject.set(x, "forceChangePasswordNextSignIn", value.asInstanceOf[js.Any])
    
    inline def setForceChangePasswordNextSignInNull: Self = StObject.set(x, "forceChangePasswordNextSignIn", null)
    
    inline def setForceChangePasswordNextSignInUndefined: Self = StObject.set(x, "forceChangePasswordNextSignIn", js.undefined)
    
    inline def setForceChangePasswordNextSignInWithMfa(value: NullableOption[Boolean]): Self = StObject.set(x, "forceChangePasswordNextSignInWithMfa", value.asInstanceOf[js.Any])
    
    inline def setForceChangePasswordNextSignInWithMfaNull: Self = StObject.set(x, "forceChangePasswordNextSignInWithMfa", null)
    
    inline def setForceChangePasswordNextSignInWithMfaUndefined: Self = StObject.set(x, "forceChangePasswordNextSignInWithMfa", js.undefined)
    
    inline def setPassword(value: NullableOption[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
  }
}
