package typingsJapgolly.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDebuggeeRequest extends StObject {
  
  /** Required. Debuggee information to register. The fields `project`, `uniquifier`, `description` and `agent_version` of the debuggee must be set. */
  var debuggee: js.UndefOr[Debuggee] = js.undefined
}
object RegisterDebuggeeRequest {
  
  inline def apply(): RegisterDebuggeeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDebuggeeRequest]
  }
  
  extension [Self <: RegisterDebuggeeRequest](x: Self) {
    
    inline def setDebuggee(value: Debuggee): Self = StObject.set(x, "debuggee", value.asInstanceOf[js.Any])
    
    inline def setDebuggeeUndefined: Self = StObject.set(x, "debuggee", js.undefined)
  }
}
