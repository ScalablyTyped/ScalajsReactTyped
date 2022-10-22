package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.GetPropertiesRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.GetPropertiesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetPropertiesResponse extends StObject {
  
  var paramsType: js.Array[GetPropertiesRequest]
  
  var returnType: GetPropertiesResponse
}
object ReturnTypeGetPropertiesResponse {
  
  inline def apply(paramsType: js.Array[GetPropertiesRequest], returnType: GetPropertiesResponse): ReturnTypeGetPropertiesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetPropertiesResponse]
  }
  
  extension [Self <: ReturnTypeGetPropertiesResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetPropertiesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetPropertiesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetPropertiesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
