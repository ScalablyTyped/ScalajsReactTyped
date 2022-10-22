package typingsJapgolly.reachRouter.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.reachRouter.anon.PushState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistorySource extends StObject {
  
  def addEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit
  
  var history: PushState
  
  val location: WindowLocation[Any]
  
  def removeEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit
}
object HistorySource {
  
  inline def apply(
    addEventListener: (String, js.Function1[/* event */ Event, Unit]) => Callback,
    history: PushState,
    location: WindowLocation[Any],
    removeEventListener: (String, js.Function1[/* event */ Event, Unit]) => Callback
  ): HistorySource = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Event, Unit]) => (addEventListener(t0, t1)).runNow()), history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Event, Unit]) => (removeEventListener(t0, t1)).runNow()))
    __obj.asInstanceOf[HistorySource]
  }
  
  extension [Self <: HistorySource](x: Self) {
    
    inline def setAddEventListener(value: (String, js.Function1[/* event */ Event, Unit]) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Event, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setHistory(value: PushState): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: WindowLocation[Any]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: (String, js.Function1[/* event */ Event, Unit]) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Event, Unit]) => (value(t0, t1)).runNow()))
  }
}
