package typingsJapgolly.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAny extends StObject {
  
  var properties: Any
}
object PropertiesAny {
  
  inline def apply(properties: Any): PropertiesAny = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAny]
  }
  
  extension [Self <: PropertiesAny](x: Self) {
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
