package typingsJapgolly.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementIdName extends StObject {
  
  var elementId: String
  
  var name: String
}
object ElementIdName {
  
  inline def apply(elementId: String, name: String): ElementIdName = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementIdName]
  }
  
  extension [Self <: ElementIdName](x: Self) {
    
    inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
