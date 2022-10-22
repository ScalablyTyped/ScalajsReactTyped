package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.CollectClassNamesFromSubtreeRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.CollectClassNamesFromSubtreeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCollectClassNamesFromSubtreeResponse extends StObject {
  
  var paramsType: js.Array[CollectClassNamesFromSubtreeRequest]
  
  var returnType: CollectClassNamesFromSubtreeResponse
}
object ReturnTypeCollectClassNamesFromSubtreeResponse {
  
  inline def apply(
    paramsType: js.Array[CollectClassNamesFromSubtreeRequest],
    returnType: CollectClassNamesFromSubtreeResponse
  ): ReturnTypeCollectClassNamesFromSubtreeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCollectClassNamesFromSubtreeResponse]
  }
  
  extension [Self <: ReturnTypeCollectClassNamesFromSubtreeResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[CollectClassNamesFromSubtreeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: CollectClassNamesFromSubtreeRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CollectClassNamesFromSubtreeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
