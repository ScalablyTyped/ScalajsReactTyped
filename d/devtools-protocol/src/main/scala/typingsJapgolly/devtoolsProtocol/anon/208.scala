package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.ClearCookiesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `208` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[ClearCookiesRequest]]
  
  var returnType: Unit
}
object `208` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[ClearCookiesRequest]], returnType: Unit): `208` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`208`]
  }
  
  extension [Self <: `208`](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[ClearCookiesRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[ClearCookiesRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
