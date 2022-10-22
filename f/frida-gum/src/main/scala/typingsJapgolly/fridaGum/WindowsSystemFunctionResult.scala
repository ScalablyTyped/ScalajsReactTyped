package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsSystemFunctionResult[Value /* <: NativeFunctionReturnValue */]
  extends StObject
     with SystemFunctionResult[Value] {
  
  var lastError: Double
  
  var value: Value
}
object WindowsSystemFunctionResult {
  
  inline def apply[Value /* <: NativeFunctionReturnValue */](lastError: Double, value: Value): WindowsSystemFunctionResult[Value] = {
    val __obj = js.Dynamic.literal(lastError = lastError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsSystemFunctionResult[Value]]
  }
  
  extension [Self <: WindowsSystemFunctionResult[?], Value /* <: NativeFunctionReturnValue */](x: Self & WindowsSystemFunctionResult[Value]) {
    
    inline def setLastError(value: Double): Self = StObject.set(x, "lastError", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
