package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'loadedSource' event type.
		The event indicates that some source has been added, changed, or removed from the set of all loaded sources.
	*/
trait LoadedSourceEvent
  extends StObject
     with Event {
  
  // event: 'loadedSource';
  @JSName("body")
  var body_LoadedSourceEvent: typingsJapgolly.vscodeDebugprotocol.anon.Source
}
object LoadedSourceEvent {
  
  inline def apply(
    body: typingsJapgolly.vscodeDebugprotocol.anon.Source,
    event: String,
    seq: Double,
    `type`: request | response | event | String
  ): LoadedSourceEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadedSourceEvent]
  }
  
  extension [Self <: LoadedSourceEvent](x: Self) {
    
    inline def setBody(value: typingsJapgolly.vscodeDebugprotocol.anon.Source): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
