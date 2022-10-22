package typingsJapgolly.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesItems extends StObject {
  
  var name: String
  
  var properties: Items
}
object PropertiesItems {
  
  inline def apply(name: String, properties: Items): PropertiesItems = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesItems]
  }
  
  extension [Self <: PropertiesItems](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Items): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
