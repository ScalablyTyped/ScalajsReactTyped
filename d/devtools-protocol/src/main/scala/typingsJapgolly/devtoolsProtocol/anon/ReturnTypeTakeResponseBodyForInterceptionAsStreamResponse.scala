package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.TakeResponseBodyForInterceptionAsStreamRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.TakeResponseBodyForInterceptionAsStreamResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse extends StObject {
  
  var paramsType: js.Array[TakeResponseBodyForInterceptionAsStreamRequest]
  
  var returnType: TakeResponseBodyForInterceptionAsStreamResponse
}
object ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse {
  
  inline def apply(
    paramsType: js.Array[TakeResponseBodyForInterceptionAsStreamRequest],
    returnType: TakeResponseBodyForInterceptionAsStreamResponse
  ): ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse]
  }
  
  extension [Self <: ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[TakeResponseBodyForInterceptionAsStreamRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: TakeResponseBodyForInterceptionAsStreamRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: TakeResponseBodyForInterceptionAsStreamResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
