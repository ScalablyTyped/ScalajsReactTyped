package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetAutomationOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `104` extends StObject {
  
  var paramsType: js.Array[SetAutomationOverrideRequest]
  
  var returnType: Unit
}
object `104` {
  
  inline def apply(paramsType: js.Array[SetAutomationOverrideRequest], returnType: Unit): `104` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`104`]
  }
  
  extension [Self <: `104`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetAutomationOverrideRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetAutomationOverrideRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
