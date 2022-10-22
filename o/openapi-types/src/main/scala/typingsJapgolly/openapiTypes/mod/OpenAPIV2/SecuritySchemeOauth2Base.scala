package typingsJapgolly.openapiTypes.mod.OpenAPIV2

import typingsJapgolly.openapiTypes.openapiTypesStrings.`implicit`
import typingsJapgolly.openapiTypes.openapiTypesStrings.accessCode
import typingsJapgolly.openapiTypes.openapiTypesStrings.application
import typingsJapgolly.openapiTypes.openapiTypesStrings.oauth2
import typingsJapgolly.openapiTypes.openapiTypesStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeOauth2Base
  extends StObject
     with SecuritySchemeObjectBase {
  
  var flow: `implicit` | password | application | accessCode
  
  var scopes: ScopesObject
  
  @JSName("type")
  var type_SecuritySchemeOauth2Base: oauth2
}
object SecuritySchemeOauth2Base {
  
  inline def apply(flow: `implicit` | password | application | accessCode, scopes: ScopesObject): SecuritySchemeOauth2Base = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[SecuritySchemeOauth2Base]
  }
  
  extension [Self <: SecuritySchemeOauth2Base](x: Self) {
    
    inline def setFlow(value: `implicit` | password | application | accessCode): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: ScopesObject): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setType(value: oauth2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
