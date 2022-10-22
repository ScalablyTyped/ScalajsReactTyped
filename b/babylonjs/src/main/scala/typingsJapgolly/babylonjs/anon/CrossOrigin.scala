package typingsJapgolly.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossOrigin extends StObject {
  
  var crossOrigin: String | Null
}
object CrossOrigin {
  
  inline def apply(): CrossOrigin = {
    val __obj = js.Dynamic.literal(crossOrigin = null)
    __obj.asInstanceOf[CrossOrigin]
  }
  
  extension [Self <: CrossOrigin](x: Self) {
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
  }
}
