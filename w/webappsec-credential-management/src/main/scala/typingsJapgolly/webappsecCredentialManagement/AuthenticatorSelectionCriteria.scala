package typingsJapgolly.webappsecCredentialManagement

import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.`cross-platform`
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.discouraged
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.platform
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.preferred
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-authenticatorselectioncriteria}
  */
trait AuthenticatorSelectionCriteria extends StObject {
  
  var authenticatorAttachment: js.UndefOr[platform | `cross-platform`] = js.undefined
  
  var requireResidentKey: js.UndefOr[Boolean] = js.undefined
  
  var userVerification: js.UndefOr[required | preferred | discouraged] = js.undefined
}
object AuthenticatorSelectionCriteria {
  
  inline def apply(): AuthenticatorSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticatorSelectionCriteria]
  }
  
  extension [Self <: AuthenticatorSelectionCriteria](x: Self) {
    
    inline def setAuthenticatorAttachment(value: platform | `cross-platform`): Self = StObject.set(x, "authenticatorAttachment", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatorAttachmentUndefined: Self = StObject.set(x, "authenticatorAttachment", js.undefined)
    
    inline def setRequireResidentKey(value: Boolean): Self = StObject.set(x, "requireResidentKey", value.asInstanceOf[js.Any])
    
    inline def setRequireResidentKeyUndefined: Self = StObject.set(x, "requireResidentKey", js.undefined)
    
    inline def setUserVerification(value: required | preferred | discouraged): Self = StObject.set(x, "userVerification", value.asInstanceOf[js.Any])
    
    inline def setUserVerificationUndefined: Self = StObject.set(x, "userVerification", js.undefined)
  }
}
