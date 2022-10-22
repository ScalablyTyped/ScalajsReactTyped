package typingsJapgolly.tsNode

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventEmitterInternals extends StObject {
  
  var _events: Record[String, js.Function | js.Array[js.Function]]
}
object EventEmitterInternals {
  
  inline def apply(_events: Record[String, js.Function | js.Array[js.Function]]): EventEmitterInternals = {
    val __obj = js.Dynamic.literal(_events = _events.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEmitterInternals]
  }
  
  extension [Self <: EventEmitterInternals](x: Self) {
    
    inline def set_events(value: Record[String, js.Function | js.Array[js.Function]]): Self = StObject.set(x, "_events", value.asInstanceOf[js.Any])
  }
}
