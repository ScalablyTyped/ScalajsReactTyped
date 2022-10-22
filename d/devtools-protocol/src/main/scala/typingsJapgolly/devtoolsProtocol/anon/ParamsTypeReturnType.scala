package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger.EnableRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger.EnableResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsTypeReturnType extends StObject {
  
  var paramsType: js.Array[js.UndefOr[EnableRequest]]
  
  var returnType: EnableResponse
}
object ParamsTypeReturnType {
  
  inline def apply(paramsType: js.Array[js.UndefOr[EnableRequest]], returnType: EnableResponse): ParamsTypeReturnType = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsTypeReturnType]
  }
  
  extension [Self <: ParamsTypeReturnType](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[EnableRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[EnableRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: EnableResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
