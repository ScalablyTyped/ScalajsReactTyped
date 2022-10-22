package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnLoadRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnLoadResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeAddScriptToEvaluateOnLoadResponse extends StObject {
  
  var paramsType: js.Array[AddScriptToEvaluateOnLoadRequest]
  
  var returnType: AddScriptToEvaluateOnLoadResponse
}
object ReturnTypeAddScriptToEvaluateOnLoadResponse {
  
  inline def apply(
    paramsType: js.Array[AddScriptToEvaluateOnLoadRequest],
    returnType: AddScriptToEvaluateOnLoadResponse
  ): ReturnTypeAddScriptToEvaluateOnLoadResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAddScriptToEvaluateOnLoadResponse]
  }
  
  extension [Self <: ReturnTypeAddScriptToEvaluateOnLoadResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[AddScriptToEvaluateOnLoadRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: AddScriptToEvaluateOnLoadRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: AddScriptToEvaluateOnLoadResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
