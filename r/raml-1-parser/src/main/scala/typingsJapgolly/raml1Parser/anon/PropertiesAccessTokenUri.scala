package typingsJapgolly.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAccessTokenUri extends StObject {
  
  var name: java.lang.String
  
  var properties: AccessTokenUri
}
object PropertiesAccessTokenUri {
  
  inline def apply(name: java.lang.String, properties: AccessTokenUri): PropertiesAccessTokenUri = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAccessTokenUri]
  }
  
  extension [Self <: PropertiesAccessTokenUri](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AccessTokenUri): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
