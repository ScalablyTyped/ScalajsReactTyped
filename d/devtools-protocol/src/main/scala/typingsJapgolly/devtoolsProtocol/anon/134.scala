package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SetCacheDisabledRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134` extends StObject {
  
  var paramsType: js.Array[SetCacheDisabledRequest]
  
  var returnType: Unit
}
object `134` {
  
  inline def apply(paramsType: js.Array[SetCacheDisabledRequest], returnType: Unit): `134` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`134`]
  }
  
  extension [Self <: `134`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetCacheDisabledRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetCacheDisabledRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
