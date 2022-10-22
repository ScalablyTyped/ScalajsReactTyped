package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formatted extends StObject {
  
  var formatted: Any
  
  var location: Latitude
}
object Formatted {
  
  inline def apply(formatted: Any, location: Latitude): Formatted = {
    val __obj = js.Dynamic.literal(formatted = formatted.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formatted]
  }
  
  extension [Self <: Formatted](x: Self) {
    
    inline def setFormatted(value: Any): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Latitude): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
