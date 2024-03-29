package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.PerformSearchRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.PerformSearchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypePerformSearchResponse extends StObject {
  
  var paramsType: js.Array[PerformSearchRequest]
  
  var returnType: PerformSearchResponse
}
object ReturnTypePerformSearchResponse {
  
  inline def apply(paramsType: js.Array[PerformSearchRequest], returnType: PerformSearchResponse): ReturnTypePerformSearchResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypePerformSearchResponse]
  }
  
  extension [Self <: ReturnTypePerformSearchResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[PerformSearchRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: PerformSearchRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: PerformSearchResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
