package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.RequestChildNodesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `59` extends StObject {
  
  var paramsType: js.Array[RequestChildNodesRequest]
  
  var returnType: Unit
}
object `59` {
  
  inline def apply(paramsType: js.Array[RequestChildNodesRequest], returnType: Unit): `59` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`59`]
  }
  
  extension [Self <: `59`](x: Self) {
    
    inline def setParamsType(value: js.Array[RequestChildNodesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RequestChildNodesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
