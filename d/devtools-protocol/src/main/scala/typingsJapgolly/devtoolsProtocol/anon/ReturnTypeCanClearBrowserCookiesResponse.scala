package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.CanClearBrowserCookiesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCanClearBrowserCookiesResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: CanClearBrowserCookiesResponse
}
object ReturnTypeCanClearBrowserCookiesResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: CanClearBrowserCookiesResponse): ReturnTypeCanClearBrowserCookiesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCanClearBrowserCookiesResponse]
  }
  
  extension [Self <: ReturnTypeCanClearBrowserCookiesResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CanClearBrowserCookiesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
