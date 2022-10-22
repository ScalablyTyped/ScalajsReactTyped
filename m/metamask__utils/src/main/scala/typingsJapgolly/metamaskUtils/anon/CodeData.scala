package typingsJapgolly.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeData extends StObject {
  
  var code: Double
  
  var data: Double
  
  var message: String
  
  var stack: Unit
}
object CodeData {
  
  inline def apply(code: Double, data: Double, message: String, stack: Unit): CodeData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeData]
  }
  
  extension [Self <: CodeData](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setData(value: Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStack(value: Unit): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
