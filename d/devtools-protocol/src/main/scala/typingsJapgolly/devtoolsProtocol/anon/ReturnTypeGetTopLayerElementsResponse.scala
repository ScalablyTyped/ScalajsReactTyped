package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.GetTopLayerElementsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetTopLayerElementsResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: GetTopLayerElementsResponse
}
object ReturnTypeGetTopLayerElementsResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: GetTopLayerElementsResponse): ReturnTypeGetTopLayerElementsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetTopLayerElementsResponse]
  }
  
  extension [Self <: ReturnTypeGetTopLayerElementsResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetTopLayerElementsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
