package typingsJapgolly.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAnnotationTypes extends StObject {
  
  var name: String
  
  var properties: AnnotationTypes
}
object PropertiesAnnotationTypes {
  
  inline def apply(name: String, properties: AnnotationTypes): PropertiesAnnotationTypes = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAnnotationTypes]
  }
  
  extension [Self <: PropertiesAnnotationTypes](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AnnotationTypes): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
