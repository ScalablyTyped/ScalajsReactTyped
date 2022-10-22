package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger.GetStackTraceRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger.GetStackTraceResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetStackTraceResponse extends StObject {
  
  var paramsType: js.Array[GetStackTraceRequest]
  
  var returnType: GetStackTraceResponse
}
object ReturnTypeGetStackTraceResponse {
  
  inline def apply(paramsType: js.Array[GetStackTraceRequest], returnType: GetStackTraceResponse): ReturnTypeGetStackTraceResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetStackTraceResponse]
  }
  
  extension [Self <: ReturnTypeGetStackTraceResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetStackTraceRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetStackTraceRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetStackTraceResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
