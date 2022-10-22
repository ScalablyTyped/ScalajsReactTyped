package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'progressUpdate' event type.
		The event signals that the progress reporting needs to be updated with a new message and/or percentage.
		The client does not have to update the UI immediately, but the clients needs to keep track of the message and/or percentage values.
		This event should only be sent if the corresponding capability `supportsProgressReporting` is true.
	*/
trait ProgressUpdateEvent
  extends StObject
     with Event {
  
  // event: 'progressUpdate';
  @JSName("body")
  var body_ProgressUpdateEvent: typingsJapgolly.vscodeDebugprotocol.anon.Message
}
object ProgressUpdateEvent {
  
  inline def apply(
    body: typingsJapgolly.vscodeDebugprotocol.anon.Message,
    event: String,
    seq: Double,
    `type`: request | response | event | String
  ): ProgressUpdateEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressUpdateEvent]
  }
  
  extension [Self <: ProgressUpdateEvent](x: Self) {
    
    inline def setBody(value: typingsJapgolly.vscodeDebugprotocol.anon.Message): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
