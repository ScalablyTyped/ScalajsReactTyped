package typingsJapgolly.openapiTypes.mod.OpenAPIV2

import typingsJapgolly.openapiTypes.openapiTypesStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeOauth2Password
  extends StObject
     with SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  
  @JSName("flow")
  var flow_SecuritySchemeOauth2Password: password
  
  var tokenUrl: String
}
object SecuritySchemeOauth2Password {
  
  inline def apply(scopes: ScopesObject, tokenUrl: String): SecuritySchemeOauth2Password = {
    val __obj = js.Dynamic.literal(flow = "password", scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[SecuritySchemeOauth2Password]
  }
  
  extension [Self <: SecuritySchemeOauth2Password](x: Self) {
    
    inline def setFlow(value: password): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
  }
}
