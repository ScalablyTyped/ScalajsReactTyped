package typingsJapgolly.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Properties extends StObject {
  
  var name: String
  
  var properties: BaseUri
}
object Properties {
  
  inline def apply(name: String, properties: BaseUri): Properties = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  
  extension [Self <: Properties](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: BaseUri): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
