package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Input.DispatchMouseEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  var paramsType: js.Array[DispatchMouseEventRequest]
  
  var returnType: Unit
}
object `113` {
  
  inline def apply(paramsType: js.Array[DispatchMouseEventRequest], returnType: Unit): `113` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`113`]
  }
  
  extension [Self <: `113`](x: Self) {
    
    inline def setParamsType(value: js.Array[DispatchMouseEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DispatchMouseEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
