package typingsJapgolly.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesLocation extends StObject {
  
  var name: String
  
  var properties: Location
}
object PropertiesLocation {
  
  inline def apply(name: String, properties: Location): PropertiesLocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesLocation]
  }
  
  extension [Self <: PropertiesLocation](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Location): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
