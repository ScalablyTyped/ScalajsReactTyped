package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.SetUserAgentOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139` extends StObject {
  
  var paramsType: js.Array[SetUserAgentOverrideRequest]
  
  var returnType: Unit
}
object `139` {
  
  inline def apply(paramsType: js.Array[SetUserAgentOverrideRequest], returnType: Unit): `139` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`139`]
  }
  
  extension [Self <: `139`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetUserAgentOverrideRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetUserAgentOverrideRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
