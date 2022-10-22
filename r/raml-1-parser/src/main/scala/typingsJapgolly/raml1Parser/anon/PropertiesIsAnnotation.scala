package typingsJapgolly.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesIsAnnotation extends StObject {
  
  var name: java.lang.String
  
  var properties: IsAnnotation
}
object PropertiesIsAnnotation {
  
  inline def apply(name: java.lang.String, properties: IsAnnotation): PropertiesIsAnnotation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesIsAnnotation]
  }
  
  extension [Self <: PropertiesIsAnnotation](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IsAnnotation): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
