package typingsJapgolly.jsoneditoronline

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorSearchBox extends StObject {
  
  def clearDelay(): Unit
  
  def focusActiveResult(): Unit
  
  def next(): Unit
  
  def onDelayedSearch(event: Event): Unit
  
  def onKeyDown(event: Event): Unit
  
  def onKeyUp(event: Event): Unit
  
  def onSearch(event: Event, forcedSearch: Boolean): Unit
  
  def previous(): Unit
  
  def setActiveResult(index: Double): Unit
}
object JSONEditorSearchBox {
  
  inline def apply(
    clearDelay: Callback,
    focusActiveResult: Callback,
    next: Callback,
    onDelayedSearch: Event => Callback,
    onKeyDown: Event => Callback,
    onKeyUp: Event => Callback,
    onSearch: (Event, Boolean) => Callback,
    previous: Callback,
    setActiveResult: Double => Callback
  ): JSONEditorSearchBox = {
    val __obj = js.Dynamic.literal(clearDelay = clearDelay.toJsFn, focusActiveResult = focusActiveResult.toJsFn, next = next.toJsFn, onDelayedSearch = js.Any.fromFunction1((t0: Event) => onDelayedSearch(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: Event) => onKeyDown(t0).runNow()), onKeyUp = js.Any.fromFunction1((t0: Event) => onKeyUp(t0).runNow()), onSearch = js.Any.fromFunction2((t0: Event, t1: Boolean) => (onSearch(t0, t1)).runNow()), previous = previous.toJsFn, setActiveResult = js.Any.fromFunction1((t0: Double) => setActiveResult(t0).runNow()))
    __obj.asInstanceOf[JSONEditorSearchBox]
  }
  
  extension [Self <: JSONEditorSearchBox](x: Self) {
    
    inline def setClearDelay(value: Callback): Self = StObject.set(x, "clearDelay", value.toJsFn)
    
    inline def setFocusActiveResult(value: Callback): Self = StObject.set(x, "focusActiveResult", value.toJsFn)
    
    inline def setNext(value: Callback): Self = StObject.set(x, "next", value.toJsFn)
    
    inline def setOnDelayedSearch(value: Event => Callback): Self = StObject.set(x, "onDelayedSearch", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setOnKeyDown(value: Event => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setOnKeyUp(value: Event => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setOnSearch(value: (Event, Boolean) => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction2((t0: Event, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setPrevious(value: Callback): Self = StObject.set(x, "previous", value.toJsFn)
    
    inline def setSetActiveResult(value: Double => Callback): Self = StObject.set(x, "setActiveResult", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
