package typingsJapgolly.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolExecutionStep extends StObject {
  
  /** A Tool execution. - In response: present if set by create/update request - In create/update request: optional */
  var toolExecution: js.UndefOr[ToolExecution] = js.undefined
}
object ToolExecutionStep {
  
  inline def apply(): ToolExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolExecutionStep]
  }
  
  extension [Self <: ToolExecutionStep](x: Self) {
    
    inline def setToolExecution(value: ToolExecution): Self = StObject.set(x, "toolExecution", value.asInstanceOf[js.Any])
    
    inline def setToolExecutionUndefined: Self = StObject.set(x, "toolExecution", js.undefined)
  }
}
