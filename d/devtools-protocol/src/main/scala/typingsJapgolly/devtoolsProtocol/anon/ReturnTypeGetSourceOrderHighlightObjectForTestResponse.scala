package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Overlay.GetSourceOrderHighlightObjectForTestRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Overlay.GetSourceOrderHighlightObjectForTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetSourceOrderHighlightObjectForTestResponse extends StObject {
  
  var paramsType: js.Array[GetSourceOrderHighlightObjectForTestRequest]
  
  var returnType: GetSourceOrderHighlightObjectForTestResponse
}
object ReturnTypeGetSourceOrderHighlightObjectForTestResponse {
  
  inline def apply(
    paramsType: js.Array[GetSourceOrderHighlightObjectForTestRequest],
    returnType: GetSourceOrderHighlightObjectForTestResponse
  ): ReturnTypeGetSourceOrderHighlightObjectForTestResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSourceOrderHighlightObjectForTestResponse]
  }
  
  extension [Self <: ReturnTypeGetSourceOrderHighlightObjectForTestResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetSourceOrderHighlightObjectForTestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetSourceOrderHighlightObjectForTestRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetSourceOrderHighlightObjectForTestResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
