package typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialRequest extends StObject {
  
  var authenticatorId: AuthenticatorId
  
  var credentialId: String
}
object GetCredentialRequest {
  
  inline def apply(authenticatorId: AuthenticatorId, credentialId: String): GetCredentialRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any], credentialId = credentialId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialRequest]
  }
  
  extension [Self <: GetCredentialRequest](x: Self) {
    
    inline def setAuthenticatorId(value: AuthenticatorId): Self = StObject.set(x, "authenticatorId", value.asInstanceOf[js.Any])
    
    inline def setCredentialId(value: String): Self = StObject.set(x, "credentialId", value.asInstanceOf[js.Any])
  }
}
