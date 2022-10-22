package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger.DisassembleWasmModuleRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger.DisassembleWasmModuleResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeDisassembleWasmModuleResponse extends StObject {
  
  var paramsType: js.Array[DisassembleWasmModuleRequest]
  
  var returnType: DisassembleWasmModuleResponse
}
object ReturnTypeDisassembleWasmModuleResponse {
  
  inline def apply(paramsType: js.Array[DisassembleWasmModuleRequest], returnType: DisassembleWasmModuleResponse): ReturnTypeDisassembleWasmModuleResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeDisassembleWasmModuleResponse]
  }
  
  extension [Self <: ReturnTypeDisassembleWasmModuleResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[DisassembleWasmModuleRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DisassembleWasmModuleRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: DisassembleWasmModuleResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
