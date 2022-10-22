package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.GetFrameOwnerRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.GetFrameOwnerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetFrameOwnerResponse extends StObject {
  
  var paramsType: js.Array[GetFrameOwnerRequest]
  
  var returnType: GetFrameOwnerResponse
}
object ReturnTypeGetFrameOwnerResponse {
  
  inline def apply(paramsType: js.Array[GetFrameOwnerRequest], returnType: GetFrameOwnerResponse): ReturnTypeGetFrameOwnerResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetFrameOwnerResponse]
  }
  
  extension [Self <: ReturnTypeGetFrameOwnerResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetFrameOwnerRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetFrameOwnerRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetFrameOwnerResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
