package typingsJapgolly.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIdentityProviderRequest extends StObject {
  
  /**
    * The ARN of the identity provider.
    */
  var identityProviderArn: ARN
}
object DeleteIdentityProviderRequest {
  
  inline def apply(identityProviderArn: ARN): DeleteIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(identityProviderArn = identityProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentityProviderRequest]
  }
  
  extension [Self <: DeleteIdentityProviderRequest](x: Self) {
    
    inline def setIdentityProviderArn(value: ARN): Self = StObject.set(x, "identityProviderArn", value.asInstanceOf[js.Any])
  }
}
