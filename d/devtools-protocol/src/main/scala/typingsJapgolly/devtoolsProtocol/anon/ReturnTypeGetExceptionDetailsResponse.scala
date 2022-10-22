package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.GetExceptionDetailsRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.GetExceptionDetailsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetExceptionDetailsResponse extends StObject {
  
  var paramsType: js.Array[GetExceptionDetailsRequest]
  
  var returnType: GetExceptionDetailsResponse
}
object ReturnTypeGetExceptionDetailsResponse {
  
  inline def apply(paramsType: js.Array[GetExceptionDetailsRequest], returnType: GetExceptionDetailsResponse): ReturnTypeGetExceptionDetailsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetExceptionDetailsResponse]
  }
  
  extension [Self <: ReturnTypeGetExceptionDetailsResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetExceptionDetailsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetExceptionDetailsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetExceptionDetailsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
