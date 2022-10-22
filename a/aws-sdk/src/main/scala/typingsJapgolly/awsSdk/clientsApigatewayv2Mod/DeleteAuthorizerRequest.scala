package typingsJapgolly.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAuthorizerRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The authorizer identifier.
    */
  var AuthorizerId: string
}
object DeleteAuthorizerRequest {
  
  inline def apply(ApiId: string, AuthorizerId: string): DeleteAuthorizerRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], AuthorizerId = AuthorizerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAuthorizerRequest]
  }
  
  extension [Self <: DeleteAuthorizerRequest](x: Self) {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerId(value: string): Self = StObject.set(x, "AuthorizerId", value.asInstanceOf[js.Any])
  }
}
