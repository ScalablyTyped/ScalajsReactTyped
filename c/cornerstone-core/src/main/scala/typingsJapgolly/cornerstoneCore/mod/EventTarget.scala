package typingsJapgolly.cornerstoneCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EventTarget - Provides the [EventTarget](https://developer.mozilla.org/en-US/docs/Web/API/EventTarget) interface
  */
trait EventTarget extends StObject {
  
  def addEventListener(`type`: Any, callback: Any): Unit
  
  def addEventNamespaceListener(`type`: Any, callback: Any): Unit
  
  def dispatchEvent(event: Any): Boolean
  
  def removeEventListener(`type`: Any, callback: Any): Unit
  
  def removeEventNamespaceListener(`type`: Any): Unit
}
object EventTarget {
  
  inline def apply(
    addEventListener: (Any, Any) => Callback,
    addEventNamespaceListener: (Any, Any) => Callback,
    dispatchEvent: Any => Boolean,
    removeEventListener: (Any, Any) => Callback,
    removeEventNamespaceListener: Any => Callback
  ): EventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: Any, t1: Any) => (addEventListener(t0, t1)).runNow()), addEventNamespaceListener = js.Any.fromFunction2((t0: Any, t1: Any) => (addEventNamespaceListener(t0, t1)).runNow()), dispatchEvent = js.Any.fromFunction1(dispatchEvent), removeEventListener = js.Any.fromFunction2((t0: Any, t1: Any) => (removeEventListener(t0, t1)).runNow()), removeEventNamespaceListener = js.Any.fromFunction1((t0: Any) => removeEventNamespaceListener(t0).runNow()))
    __obj.asInstanceOf[EventTarget]
  }
  
  extension [Self <: EventTarget](x: Self) {
    
    inline def setAddEventListener(value: (Any, Any) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setAddEventNamespaceListener(value: (Any, Any) => Callback): Self = StObject.set(x, "addEventNamespaceListener", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setDispatchEvent(value: Any => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListener(value: (Any, Any) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setRemoveEventNamespaceListener(value: Any => Callback): Self = StObject.set(x, "removeEventNamespaceListener", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
