package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.ServiceWorker.UpdateRegistrationRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `203` extends StObject {
  
  var paramsType: js.Array[UpdateRegistrationRequest]
  
  var returnType: Unit
}
object `203` {
  
  inline def apply(paramsType: js.Array[UpdateRegistrationRequest], returnType: Unit): `203` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`203`]
  }
  
  extension [Self <: `203`](x: Self) {
    
    inline def setParamsType(value: js.Array[UpdateRegistrationRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: UpdateRegistrationRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
