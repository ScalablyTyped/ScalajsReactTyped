package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import typingsJapgolly.vscodeDebugprotocol.anon.BreakpointsArray
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response to `setBreakpoints` request.
		Returned is information about each breakpoint created by this request.
		This includes the actual code location and whether the breakpoint could be verified.
		The breakpoints returned are in the same order as the elements of the `breakpoints`
		(or the deprecated `lines`) array in the arguments.
	*/
trait SetBreakpointsResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_SetBreakpointsResponse: BreakpointsArray
}
object SetBreakpointsResponse {
  
  inline def apply(
    body: BreakpointsArray,
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): SetBreakpointsResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointsResponse]
  }
  
  extension [Self <: SetBreakpointsResponse](x: Self) {
    
    inline def setBody(value: BreakpointsArray): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
