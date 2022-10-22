package typingsJapgolly.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesQueryString extends StObject {
  
  var name: String
  
  var properties: QueryString
}
object PropertiesQueryString {
  
  inline def apply(name: String, properties: QueryString): PropertiesQueryString = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesQueryString]
  }
  
  extension [Self <: PropertiesQueryString](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: QueryString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
