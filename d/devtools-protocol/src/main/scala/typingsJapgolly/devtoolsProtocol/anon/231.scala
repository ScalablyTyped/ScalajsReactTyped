package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Fetch.FailRequestRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `231` extends StObject {
  
  var paramsType: js.Array[FailRequestRequest]
  
  var returnType: Unit
}
object `231` {
  
  inline def apply(paramsType: js.Array[FailRequestRequest], returnType: Unit): `231` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`231`]
  }
  
  extension [Self <: `231`](x: Self) {
    
    inline def setParamsType(value: js.Array[FailRequestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: FailRequestRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
