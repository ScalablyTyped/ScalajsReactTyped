package typingsJapgolly.sinon.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sinon.anon.Abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinonFakeUploadProgress extends StObject {
  
  def addEventListener(event: String, listener: js.Function1[/* e */ Event, Any]): Unit
  
  def dispatchEvent(event: Event): Unit
  
  var eventListeners: Abort
  
  def removeEventListener(event: String, listener: js.Function1[/* e */ Event, Any]): Unit
}
object SinonFakeUploadProgress {
  
  inline def apply(
    addEventListener: (String, js.Function1[/* e */ Event, Any]) => Callback,
    dispatchEvent: Event => Callback,
    eventListeners: Abort,
    removeEventListener: (String, js.Function1[/* e */ Event, Any]) => Callback
  ): SinonFakeUploadProgress = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Event, Any]) => (addEventListener(t0, t1)).runNow()), dispatchEvent = js.Any.fromFunction1((t0: Event) => dispatchEvent(t0).runNow()), eventListeners = eventListeners.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Event, Any]) => (removeEventListener(t0, t1)).runNow()))
    __obj.asInstanceOf[SinonFakeUploadProgress]
  }
  
  extension [Self <: SinonFakeUploadProgress](x: Self) {
    
    inline def setAddEventListener(value: (String, js.Function1[/* e */ Event, Any]) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Event, Any]) => (value(t0, t1)).runNow()))
    
    inline def setDispatchEvent(value: Event => Callback): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setEventListeners(value: Abort): Self = StObject.set(x, "eventListeners", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: (String, js.Function1[/* e */ Event, Any]) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Event, Any]) => (value(t0, t1)).runNow()))
  }
}
