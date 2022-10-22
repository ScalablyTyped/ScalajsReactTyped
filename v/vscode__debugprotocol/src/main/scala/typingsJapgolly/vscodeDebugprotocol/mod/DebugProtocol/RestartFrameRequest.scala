package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** RestartFrame request; value of command field is 'restartFrame'.
		The request restarts execution of the specified stackframe.
		The debug adapter first sends the response and then a `stopped` event (with reason `restart`) after the restart has completed.
		Clients should only call this request if the corresponding capability `supportsRestartFrame` is true.
	*/
trait RestartFrameRequest
  extends StObject
     with Request {
  
  // command: 'restartFrame';
  @JSName("arguments")
  var arguments_RestartFrameRequest: RestartFrameArguments
}
object RestartFrameRequest {
  
  inline def apply(
    arguments: RestartFrameArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): RestartFrameRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartFrameRequest]
  }
  
  extension [Self <: RestartFrameRequest](x: Self) {
    
    inline def setArguments(value: RestartFrameArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
