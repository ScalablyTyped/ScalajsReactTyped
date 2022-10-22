package typingsJapgolly.openapiTypes.mod.OpenAPIV3

import typingsJapgolly.openapiTypes.openapiTypesStrings.apiKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKeySecurityScheme
  extends StObject
     with SecuritySchemeObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var in: String
  
  var name: String
  
  var `type`: apiKey
}
object ApiKeySecurityScheme {
  
  inline def apply(in: String, name: String): ApiKeySecurityScheme = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("apiKey")
    __obj.asInstanceOf[ApiKeySecurityScheme]
  }
  
  extension [Self <: ApiKeySecurityScheme](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: apiKey): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
