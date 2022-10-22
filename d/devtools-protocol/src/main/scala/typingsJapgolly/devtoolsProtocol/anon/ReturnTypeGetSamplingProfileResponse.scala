package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.HeapProfiler.GetSamplingProfileResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetSamplingProfileResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: GetSamplingProfileResponse
}
object ReturnTypeGetSamplingProfileResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: GetSamplingProfileResponse): ReturnTypeGetSamplingProfileResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSamplingProfileResponse]
  }
  
  extension [Self <: ReturnTypeGetSamplingProfileResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetSamplingProfileResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
