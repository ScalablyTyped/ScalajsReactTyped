package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import typingsJapgolly.vscodeDebugprotocol.anon.Cancellable
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'progressStart' event type.
		The event signals that a long running operation is about to start and provides additional information for the client to set up a corresponding progress and cancellation UI.
		The client is free to delay the showing of the UI in order to reduce flicker.
		This event should only be sent if the corresponding capability `supportsProgressReporting` is true
	*/
trait ProgressStartEvent
  extends StObject
     with Event {
  
  // event: 'progressStart';
  @JSName("body")
  var body_ProgressStartEvent: Cancellable
}
object ProgressStartEvent {
  
  inline def apply(body: Cancellable, event: String, seq: Double, `type`: request | response | event | String): ProgressStartEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressStartEvent]
  }
  
  extension [Self <: ProgressStartEvent](x: Self) {
    
    inline def setBody(value: Cancellable): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
