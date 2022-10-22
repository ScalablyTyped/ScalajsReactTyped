package typingsJapgolly.plugapi.mod.Event

import typingsJapgolly.plugapi.mod.User.DJ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DJListUpdate extends StObject {
  
  var djs: js.Array[DJ]
  
  var remove: String
}
object DJListUpdate {
  
  inline def apply(djs: js.Array[DJ], remove: String): DJListUpdate = {
    val __obj = js.Dynamic.literal(djs = djs.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[DJListUpdate]
  }
  
  extension [Self <: DJListUpdate](x: Self) {
    
    inline def setDjs(value: js.Array[DJ]): Self = StObject.set(x, "djs", value.asInstanceOf[js.Any])
    
    inline def setDjsVarargs(value: DJ*): Self = StObject.set(x, "djs", js.Array(value*))
    
    inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
  }
}
