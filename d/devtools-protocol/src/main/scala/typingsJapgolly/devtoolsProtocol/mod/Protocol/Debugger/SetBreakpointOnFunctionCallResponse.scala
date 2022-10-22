package typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBreakpointOnFunctionCallResponse extends StObject {
  
  /**
    * Id of the created breakpoint for further reference.
    */
  var breakpointId: BreakpointId
}
object SetBreakpointOnFunctionCallResponse {
  
  inline def apply(breakpointId: BreakpointId): SetBreakpointOnFunctionCallResponse = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointOnFunctionCallResponse]
  }
  
  extension [Self <: SetBreakpointOnFunctionCallResponse](x: Self) {
    
    inline def setBreakpointId(value: BreakpointId): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
  }
}
