package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger.PauseOnAsyncCallRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeVoid extends StObject {
  
  var paramsType: js.Array[PauseOnAsyncCallRequest]
  
  var returnType: Unit
}
object ReturnTypeVoid {
  
  inline def apply(paramsType: js.Array[PauseOnAsyncCallRequest], returnType: Unit): ReturnTypeVoid = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeVoid]
  }
  
  extension [Self <: ReturnTypeVoid](x: Self) {
    
    inline def setParamsType(value: js.Array[PauseOnAsyncCallRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: PauseOnAsyncCallRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
