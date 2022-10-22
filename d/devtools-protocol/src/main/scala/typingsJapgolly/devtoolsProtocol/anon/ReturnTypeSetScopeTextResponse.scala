package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.CSS.SetScopeTextRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.CSS.SetScopeTextResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetScopeTextResponse extends StObject {
  
  var paramsType: js.Array[SetScopeTextRequest]
  
  var returnType: SetScopeTextResponse
}
object ReturnTypeSetScopeTextResponse {
  
  inline def apply(paramsType: js.Array[SetScopeTextRequest], returnType: SetScopeTextResponse): ReturnTypeSetScopeTextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetScopeTextResponse]
  }
  
  extension [Self <: ReturnTypeSetScopeTextResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[SetScopeTextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetScopeTextRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: SetScopeTextResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
