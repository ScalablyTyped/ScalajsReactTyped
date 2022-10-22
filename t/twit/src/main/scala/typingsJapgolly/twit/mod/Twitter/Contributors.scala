package typingsJapgolly.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contributors extends StObject {
  
  var id: Double
  
  var id_str: String
  
  var screen_name: String
}
object Contributors {
  
  inline def apply(id: Double, id_str: String, screen_name: String): Contributors = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], screen_name = screen_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contributors]
  }
  
  extension [Self <: Contributors](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
    
    inline def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
  }
}
