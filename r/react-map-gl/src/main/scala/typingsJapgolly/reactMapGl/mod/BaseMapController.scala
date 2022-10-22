package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMapController extends StObject {
  
  var events: js.Array[String]
  
  def handleEvent(event: MapControlEvent): Unit
}
object BaseMapController {
  
  inline def apply(events: js.Array[String], handleEvent: MapControlEvent => Callback): BaseMapController = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], handleEvent = js.Any.fromFunction1((t0: MapControlEvent) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[BaseMapController]
  }
  
  extension [Self <: BaseMapController](x: Self) {
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setHandleEvent(value: MapControlEvent => Callback): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1((t0: MapControlEvent) => value(t0).runNow()))
  }
}
