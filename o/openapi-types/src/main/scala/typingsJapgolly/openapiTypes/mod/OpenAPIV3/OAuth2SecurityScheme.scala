package typingsJapgolly.openapiTypes.mod.OpenAPIV3

import typingsJapgolly.openapiTypes.anon.AuthorizationCode
import typingsJapgolly.openapiTypes.openapiTypesStrings.oauth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2SecurityScheme
  extends StObject
     with SecuritySchemeObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var flows: AuthorizationCode
  
  var `type`: oauth2
}
object OAuth2SecurityScheme {
  
  inline def apply(flows: AuthorizationCode): OAuth2SecurityScheme = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[OAuth2SecurityScheme]
  }
  
  extension [Self <: OAuth2SecurityScheme](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFlows(value: AuthorizationCode): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    inline def setType(value: oauth2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
