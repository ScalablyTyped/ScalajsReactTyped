package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import typingsJapgolly.vscodeDebugprotocol.anon.AllThreadsContinued
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'continued' event type.
		The event indicates that the execution of the debuggee has continued.
		Please note: a debug adapter is not expected to send this event in response to a request that implies that execution continues, e.g. `launch` or `continue`.
		It is only necessary to send a `continued` event if there was no previous request that implied this.
	*/
trait ContinuedEvent
  extends StObject
     with Event {
  
  // event: 'continued';
  @JSName("body")
  var body_ContinuedEvent: AllThreadsContinued
}
object ContinuedEvent {
  
  inline def apply(body: AllThreadsContinued, event: String, seq: Double, `type`: request | response | event | String): ContinuedEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuedEvent]
  }
  
  extension [Self <: ContinuedEvent](x: Self) {
    
    inline def setBody(value: AllThreadsContinued): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
