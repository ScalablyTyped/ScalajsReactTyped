package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Overlay.SetShowHitTestBordersRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `158` extends StObject {
  
  var paramsType: js.Array[SetShowHitTestBordersRequest]
  
  var returnType: Unit
}
object `158` {
  
  inline def apply(paramsType: js.Array[SetShowHitTestBordersRequest], returnType: Unit): `158` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`158`]
  }
  
  extension [Self <: `158`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetShowHitTestBordersRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetShowHitTestBordersRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
