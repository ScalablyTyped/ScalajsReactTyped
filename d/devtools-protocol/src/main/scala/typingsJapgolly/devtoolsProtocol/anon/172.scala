package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetDeviceMetricsOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `172` extends StObject {
  
  var paramsType: js.Array[SetDeviceMetricsOverrideRequest]
  
  var returnType: Unit
}
object `172` {
  
  inline def apply(paramsType: js.Array[SetDeviceMetricsOverrideRequest], returnType: Unit): `172` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`172`]
  }
  
  extension [Self <: `172`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetDeviceMetricsOverrideRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetDeviceMetricsOverrideRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
