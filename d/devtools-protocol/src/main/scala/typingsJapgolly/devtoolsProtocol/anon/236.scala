package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAuthn.EnableRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `236` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[EnableRequest]]
  
  var returnType: Unit
}
object `236` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[EnableRequest]], returnType: Unit): `236` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`236`]
  }
  
  extension [Self <: `236`](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[EnableRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[EnableRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
