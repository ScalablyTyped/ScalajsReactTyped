package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Attach request; value of command field is 'attach'.
		The attach request is sent from the client to the debug adapter to attach to a debuggee that is already running.
		Since attaching is debugger/runtime specific, the arguments for this request are not part of this specification.
	*/
trait AttachRequest
  extends StObject
     with Request {
  
  // command: 'attach';
  @JSName("arguments")
  var arguments_AttachRequest: AttachRequestArguments
}
object AttachRequest {
  
  inline def apply(
    arguments: AttachRequestArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): AttachRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachRequest]
  }
  
  extension [Self <: AttachRequest](x: Self) {
    
    inline def setArguments(value: AttachRequestArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
