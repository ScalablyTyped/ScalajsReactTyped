package typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddVirtualAuthenticatorResponse extends StObject {
  
  var authenticatorId: AuthenticatorId
}
object AddVirtualAuthenticatorResponse {
  
  inline def apply(authenticatorId: AuthenticatorId): AddVirtualAuthenticatorResponse = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddVirtualAuthenticatorResponse]
  }
  
  extension [Self <: AddVirtualAuthenticatorResponse](x: Self) {
    
    inline def setAuthenticatorId(value: AuthenticatorId): Self = StObject.set(x, "authenticatorId", value.asInstanceOf[js.Any])
  }
}
