package typingsJapgolly.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRequest extends StObject {
  
  var op: String
  
  var path: String
  
  var value: Any
}
object UpdateRequest {
  
  inline def apply(op: String, path: String, value: Any): UpdateRequest = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRequest]
  }
  
  extension [Self <: UpdateRequest](x: Self) {
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
