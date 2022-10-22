package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.CompileScriptRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.CompileScriptResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCompileScriptResponse extends StObject {
  
  var paramsType: js.Array[CompileScriptRequest]
  
  var returnType: CompileScriptResponse
}
object ReturnTypeCompileScriptResponse {
  
  inline def apply(paramsType: js.Array[CompileScriptRequest], returnType: CompileScriptResponse): ReturnTypeCompileScriptResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCompileScriptResponse]
  }
  
  extension [Self <: ReturnTypeCompileScriptResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[CompileScriptRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: CompileScriptRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CompileScriptResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
