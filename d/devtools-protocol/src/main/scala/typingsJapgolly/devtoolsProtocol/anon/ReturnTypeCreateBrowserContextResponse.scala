package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Target.CreateBrowserContextRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Target.CreateBrowserContextResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCreateBrowserContextResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[CreateBrowserContextRequest]]
  
  var returnType: CreateBrowserContextResponse
}
object ReturnTypeCreateBrowserContextResponse {
  
  inline def apply(
    paramsType: js.Array[js.UndefOr[CreateBrowserContextRequest]],
    returnType: CreateBrowserContextResponse
  ): ReturnTypeCreateBrowserContextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCreateBrowserContextResponse]
  }
  
  extension [Self <: ReturnTypeCreateBrowserContextResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[CreateBrowserContextRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[CreateBrowserContextRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CreateBrowserContextResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
