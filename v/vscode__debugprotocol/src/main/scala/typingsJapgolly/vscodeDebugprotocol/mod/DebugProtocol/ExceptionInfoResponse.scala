package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import typingsJapgolly.vscodeDebugprotocol.anon.BreakMode
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response to `exceptionInfo` request. */
trait ExceptionInfoResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_ExceptionInfoResponse: BreakMode
}
object ExceptionInfoResponse {
  
  inline def apply(
    body: BreakMode,
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): ExceptionInfoResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionInfoResponse]
  }
  
  extension [Self <: ExceptionInfoResponse](x: Self) {
    
    inline def setBody(value: BreakMode): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
