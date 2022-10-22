package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Schema.GetDomainsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetDomainsResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: GetDomainsResponse
}
object ReturnTypeGetDomainsResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: GetDomainsResponse): ReturnTypeGetDomainsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetDomainsResponse]
  }
  
  extension [Self <: ReturnTypeGetDomainsResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetDomainsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
