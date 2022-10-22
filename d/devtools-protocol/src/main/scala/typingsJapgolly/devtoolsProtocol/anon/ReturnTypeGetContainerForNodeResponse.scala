package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.GetContainerForNodeRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.GetContainerForNodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetContainerForNodeResponse extends StObject {
  
  var paramsType: js.Array[GetContainerForNodeRequest]
  
  var returnType: GetContainerForNodeResponse
}
object ReturnTypeGetContainerForNodeResponse {
  
  inline def apply(paramsType: js.Array[GetContainerForNodeRequest], returnType: GetContainerForNodeResponse): ReturnTypeGetContainerForNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetContainerForNodeResponse]
  }
  
  extension [Self <: ReturnTypeGetContainerForNodeResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetContainerForNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetContainerForNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetContainerForNodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
