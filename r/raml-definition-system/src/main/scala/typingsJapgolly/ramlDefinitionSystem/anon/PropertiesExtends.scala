package typingsJapgolly.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesExtends extends StObject {
  
  var name: String
  
  var properties: Extends
}
object PropertiesExtends {
  
  inline def apply(name: String, properties: Extends): PropertiesExtends = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesExtends]
  }
  
  extension [Self <: PropertiesExtends](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Extends): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
