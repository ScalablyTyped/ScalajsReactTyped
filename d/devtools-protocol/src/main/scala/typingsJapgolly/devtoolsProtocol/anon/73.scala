package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOMDebugger.SetEventListenerBreakpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `73` extends StObject {
  
  var paramsType: js.Array[SetEventListenerBreakpointRequest]
  
  var returnType: Unit
}
object `73` {
  
  inline def apply(paramsType: js.Array[SetEventListenerBreakpointRequest], returnType: Unit): `73` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`73`]
  }
  
  extension [Self <: `73`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetEventListenerBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetEventListenerBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
