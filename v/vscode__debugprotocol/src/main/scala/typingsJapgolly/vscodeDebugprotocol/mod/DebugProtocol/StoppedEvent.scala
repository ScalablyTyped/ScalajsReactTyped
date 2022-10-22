package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import typingsJapgolly.vscodeDebugprotocol.anon.AllThreadsStopped
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'stopped' event type.
		The event indicates that the execution of the debuggee has stopped due to some condition.
		This can be caused by a break point previously set, a stepping request has completed, by executing a debugger statement etc.
	*/
trait StoppedEvent
  extends StObject
     with Event {
  
  // event: 'stopped';
  @JSName("body")
  var body_StoppedEvent: AllThreadsStopped
}
object StoppedEvent {
  
  inline def apply(body: AllThreadsStopped, event: String, seq: Double, `type`: request | response | event | String): StoppedEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoppedEvent]
  }
  
  extension [Self <: StoppedEvent](x: Self) {
    
    inline def setBody(value: AllThreadsStopped): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
