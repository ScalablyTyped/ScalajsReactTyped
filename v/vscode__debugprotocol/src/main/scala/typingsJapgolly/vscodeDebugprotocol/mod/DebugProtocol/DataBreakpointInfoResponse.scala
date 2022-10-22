package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import typingsJapgolly.vscodeDebugprotocol.anon.AccessTypes
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response to `dataBreakpointInfo` request. */
trait DataBreakpointInfoResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_DataBreakpointInfoResponse: AccessTypes
}
object DataBreakpointInfoResponse {
  
  inline def apply(
    body: AccessTypes,
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): DataBreakpointInfoResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBreakpointInfoResponse]
  }
  
  extension [Self <: DataBreakpointInfoResponse](x: Self) {
    
    inline def setBody(value: AccessTypes): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
