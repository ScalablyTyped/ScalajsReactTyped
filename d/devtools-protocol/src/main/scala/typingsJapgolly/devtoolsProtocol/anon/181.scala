package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.StartScreencastRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `181` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[StartScreencastRequest]]
  
  var returnType: Unit
}
object `181` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[StartScreencastRequest]], returnType: Unit): `181` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`181`]
  }
  
  extension [Self <: `181`](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[StartScreencastRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[StartScreencastRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
