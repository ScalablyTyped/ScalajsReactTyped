package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.GetRealtimeDataRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.GetRealtimeDataResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetRealtimeDataResponse extends StObject {
  
  var paramsType: js.Array[GetRealtimeDataRequest]
  
  var returnType: GetRealtimeDataResponse
}
object ReturnTypeGetRealtimeDataResponse {
  
  inline def apply(paramsType: js.Array[GetRealtimeDataRequest], returnType: GetRealtimeDataResponse): ReturnTypeGetRealtimeDataResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetRealtimeDataResponse]
  }
  
  extension [Self <: ReturnTypeGetRealtimeDataResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetRealtimeDataRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetRealtimeDataRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetRealtimeDataResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
