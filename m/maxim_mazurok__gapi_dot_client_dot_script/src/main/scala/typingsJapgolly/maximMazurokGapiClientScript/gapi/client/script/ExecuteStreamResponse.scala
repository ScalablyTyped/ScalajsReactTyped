package typingsJapgolly.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteStreamResponse extends StObject {
  
  /** The result of the execution. */
  var result: js.UndefOr[ScriptExecutionResult] = js.undefined
}
object ExecuteStreamResponse {
  
  inline def apply(): ExecuteStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteStreamResponse]
  }
  
  extension [Self <: ExecuteStreamResponse](x: Self) {
    
    inline def setResult(value: ScriptExecutionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
