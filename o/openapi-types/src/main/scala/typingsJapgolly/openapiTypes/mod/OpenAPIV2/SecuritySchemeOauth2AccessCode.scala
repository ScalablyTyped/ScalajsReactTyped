package typingsJapgolly.openapiTypes.mod.OpenAPIV2

import typingsJapgolly.openapiTypes.openapiTypesStrings.accessCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeOauth2AccessCode
  extends StObject
     with SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  
  var authorizationUrl: String
  
  @JSName("flow")
  var flow_SecuritySchemeOauth2AccessCode: accessCode
  
  var tokenUrl: String
}
object SecuritySchemeOauth2AccessCode {
  
  inline def apply(authorizationUrl: String, scopes: ScopesObject, tokenUrl: String): SecuritySchemeOauth2AccessCode = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "accessCode", scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[SecuritySchemeOauth2AccessCode]
  }
  
  extension [Self <: SecuritySchemeOauth2AccessCode](x: Self) {
    
    inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: accessCode): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
  }
}
