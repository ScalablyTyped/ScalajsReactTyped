package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetOriginTrialsRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetOriginTrialsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetOriginTrialsResponse extends StObject {
  
  var paramsType: js.Array[GetOriginTrialsRequest]
  
  var returnType: GetOriginTrialsResponse
}
object ReturnTypeGetOriginTrialsResponse {
  
  inline def apply(paramsType: js.Array[GetOriginTrialsRequest], returnType: GetOriginTrialsResponse): ReturnTypeGetOriginTrialsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetOriginTrialsResponse]
  }
  
  extension [Self <: ReturnTypeGetOriginTrialsResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetOriginTrialsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetOriginTrialsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetOriginTrialsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
