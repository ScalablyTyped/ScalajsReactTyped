package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Fetch.ContinueWithAuthRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `234` extends StObject {
  
  var paramsType: js.Array[ContinueWithAuthRequest]
  
  var returnType: Unit
}
object `234` {
  
  inline def apply(paramsType: js.Array[ContinueWithAuthRequest], returnType: Unit): `234` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`234`]
  }
  
  extension [Self <: `234`](x: Self) {
    
    inline def setParamsType(value: js.Array[ContinueWithAuthRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ContinueWithAuthRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
