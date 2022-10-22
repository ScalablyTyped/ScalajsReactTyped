package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.ClearTrustTokensRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.ClearTrustTokensResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeClearTrustTokensResponse extends StObject {
  
  var paramsType: js.Array[ClearTrustTokensRequest]
  
  var returnType: ClearTrustTokensResponse
}
object ReturnTypeClearTrustTokensResponse {
  
  inline def apply(paramsType: js.Array[ClearTrustTokensRequest], returnType: ClearTrustTokensResponse): ReturnTypeClearTrustTokensResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeClearTrustTokensResponse]
  }
  
  extension [Self <: ReturnTypeClearTrustTokensResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[ClearTrustTokensRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ClearTrustTokensRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: ClearTrustTokensResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
