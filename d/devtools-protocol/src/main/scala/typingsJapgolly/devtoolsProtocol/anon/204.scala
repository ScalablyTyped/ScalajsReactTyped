package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.ClearDataForOriginRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `204` extends StObject {
  
  var paramsType: js.Array[ClearDataForOriginRequest]
  
  var returnType: Unit
}
object `204` {
  
  inline def apply(paramsType: js.Array[ClearDataForOriginRequest], returnType: Unit): `204` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`204`]
  }
  
  extension [Self <: `204`](x: Self) {
    
    inline def setParamsType(value: js.Array[ClearDataForOriginRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ClearDataForOriginRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
