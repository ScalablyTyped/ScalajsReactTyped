package typingsJapgolly.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesSecuredBy extends StObject {
  
  var name: String
  
  var properties: SecuredBy
}
object PropertiesSecuredBy {
  
  inline def apply(name: String, properties: SecuredBy): PropertiesSecuredBy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesSecuredBy]
  }
  
  extension [Self <: PropertiesSecuredBy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: SecuredBy): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
