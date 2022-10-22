package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response to `initialize` request. */
trait InitializeResponse
  extends StObject
     with Response {
  
  /** The capabilities of this debug adapter. */
  @JSName("body")
  var body_InitializeResponse: js.UndefOr[Capabilities] = js.undefined
}
object InitializeResponse {
  
  inline def apply(
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): InitializeResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeResponse]
  }
  
  extension [Self <: InitializeResponse](x: Self) {
    
    inline def setBody(value: Capabilities): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
