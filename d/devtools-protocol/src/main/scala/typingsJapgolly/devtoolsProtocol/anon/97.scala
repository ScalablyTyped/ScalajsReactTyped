package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetTouchEmulationEnabledRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  var paramsType: js.Array[SetTouchEmulationEnabledRequest]
  
  var returnType: Unit
}
object `97` {
  
  inline def apply(paramsType: js.Array[SetTouchEmulationEnabledRequest], returnType: Unit): `97` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`97`]
  }
  
  extension [Self <: `97`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetTouchEmulationEnabledRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetTouchEmulationEnabledRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
