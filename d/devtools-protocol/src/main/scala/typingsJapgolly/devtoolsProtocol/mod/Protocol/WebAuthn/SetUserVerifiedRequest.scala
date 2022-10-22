package typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetUserVerifiedRequest extends StObject {
  
  var authenticatorId: AuthenticatorId
  
  var isUserVerified: Boolean
}
object SetUserVerifiedRequest {
  
  inline def apply(authenticatorId: AuthenticatorId, isUserVerified: Boolean): SetUserVerifiedRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any], isUserVerified = isUserVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserVerifiedRequest]
  }
  
  extension [Self <: SetUserVerifiedRequest](x: Self) {
    
    inline def setAuthenticatorId(value: AuthenticatorId): Self = StObject.set(x, "authenticatorId", value.asInstanceOf[js.Any])
    
    inline def setIsUserVerified(value: Boolean): Self = StObject.set(x, "isUserVerified", value.asInstanceOf[js.Any])
  }
}
