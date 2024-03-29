package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointByUrlRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointByUrlResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetBreakpointByUrlResponse extends StObject {
  
  var paramsType: js.Array[SetBreakpointByUrlRequest]
  
  var returnType: SetBreakpointByUrlResponse
}
object ReturnTypeSetBreakpointByUrlResponse {
  
  inline def apply(paramsType: js.Array[SetBreakpointByUrlRequest], returnType: SetBreakpointByUrlResponse): ReturnTypeSetBreakpointByUrlResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetBreakpointByUrlResponse]
  }
  
  extension [Self <: ReturnTypeSetBreakpointByUrlResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[SetBreakpointByUrlRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetBreakpointByUrlRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: SetBreakpointByUrlResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
