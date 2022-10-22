package typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWasmBytecodeRequest extends StObject {
  
  /**
    * Id of the Wasm script to get source for.
    */
  var scriptId: ScriptId
}
object GetWasmBytecodeRequest {
  
  inline def apply(scriptId: ScriptId): GetWasmBytecodeRequest = {
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWasmBytecodeRequest]
  }
  
  extension [Self <: GetWasmBytecodeRequest](x: Self) {
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
  }
}
