package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.EmulateNetworkConditionsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  var paramsType: js.Array[EmulateNetworkConditionsRequest]
  
  var returnType: Unit
}
object `129` {
  
  inline def apply(paramsType: js.Array[EmulateNetworkConditionsRequest], returnType: Unit): `129` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`129`]
  }
  
  extension [Self <: `129`](x: Self) {
    
    inline def setParamsType(value: js.Array[EmulateNetworkConditionsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: EmulateNetworkConditionsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
