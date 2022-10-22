package typingsJapgolly.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _FILETIME extends StObject {
  
  val dwHighDateTime: Double
  
  val dwLowDateTime: Double
}
object _FILETIME {
  
  inline def apply(dwHighDateTime: Double, dwLowDateTime: Double): _FILETIME = {
    val __obj = js.Dynamic.literal(dwHighDateTime = dwHighDateTime.asInstanceOf[js.Any], dwLowDateTime = dwLowDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FILETIME]
  }
  
  extension [Self <: _FILETIME](x: Self) {
    
    inline def setDwHighDateTime(value: Double): Self = StObject.set(x, "dwHighDateTime", value.asInstanceOf[js.Any])
    
    inline def setDwLowDateTime(value: Double): Self = StObject.set(x, "dwLowDateTime", value.asInstanceOf[js.Any])
  }
}
