package typingsJapgolly.dashjs.mod

import typingsJapgolly.dashjs.dashjsStrings.error
import typingsJapgolly.dashjs.dashjsStrings.manifestError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestErrorEvent
  extends StObject
     with Event
     with ErrorEvent {
  
  var error: manifestError
  
  var event: typingsJapgolly.dashjs.anon.Event
  
  @JSName("type")
  var type_ManifestErrorEvent: error
}
object ManifestErrorEvent {
  
  inline def apply(event: typingsJapgolly.dashjs.anon.Event): ManifestErrorEvent = {
    val __obj = js.Dynamic.literal(error = "manifestError", event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[ManifestErrorEvent]
  }
  
  extension [Self <: ManifestErrorEvent](x: Self) {
    
    inline def setError(value: manifestError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: typingsJapgolly.dashjs.anon.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
