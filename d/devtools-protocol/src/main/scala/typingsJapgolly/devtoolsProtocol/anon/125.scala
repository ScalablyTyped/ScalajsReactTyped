package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Memory.StartSamplingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `125` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[StartSamplingRequest]]
  
  var returnType: Unit
}
object `125` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[StartSamplingRequest]], returnType: Unit): `125` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`125`]
  }
  
  extension [Self <: `125`](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[StartSamplingRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[StartSamplingRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
