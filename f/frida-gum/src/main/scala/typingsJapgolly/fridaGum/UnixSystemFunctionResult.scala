package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnixSystemFunctionResult[Value /* <: NativeFunctionReturnValue */]
  extends StObject
     with SystemFunctionResult[Value] {
  
  var errno: Double
  
  var value: Value
}
object UnixSystemFunctionResult {
  
  inline def apply[Value /* <: NativeFunctionReturnValue */](errno: Double, value: Value): UnixSystemFunctionResult[Value] = {
    val __obj = js.Dynamic.literal(errno = errno.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixSystemFunctionResult[Value]]
  }
  
  extension [Self <: UnixSystemFunctionResult[?], Value /* <: NativeFunctionReturnValue */](x: Self & UnixSystemFunctionResult[Value]) {
    
    inline def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
