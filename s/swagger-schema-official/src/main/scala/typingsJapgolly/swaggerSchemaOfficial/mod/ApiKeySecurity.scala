package typingsJapgolly.swaggerSchemaOfficial.mod

import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.apiKey
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.header
import typingsJapgolly.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKeySecurity
  extends StObject
     with BaseSecurity
     with Security {
  
  var in: query | header
  
  var name: String
  
  @JSName("type")
  var type_ApiKeySecurity: apiKey
}
object ApiKeySecurity {
  
  inline def apply(in: query | header, name: String): ApiKeySecurity = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("apiKey")
    __obj.asInstanceOf[ApiKeySecurity]
  }
  
  extension [Self <: ApiKeySecurity](x: Self) {
    
    inline def setIn(value: query | header): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: apiKey): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
