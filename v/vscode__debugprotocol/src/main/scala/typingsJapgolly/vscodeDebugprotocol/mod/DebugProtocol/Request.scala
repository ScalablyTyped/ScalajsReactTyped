package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A client or debug adapter initiated request. */
trait Request
  extends StObject
     with ProtocolMessage {
  
  /** Object containing arguments for the command. */
  var arguments: js.UndefOr[Any] = js.undefined
  
  // type: 'request';
  /** The command to execute. */
  var command: String
}
object Request {
  
  inline def apply(command: String, seq: Double, `type`: request | response | event | String): Request = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setArguments(value: Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
