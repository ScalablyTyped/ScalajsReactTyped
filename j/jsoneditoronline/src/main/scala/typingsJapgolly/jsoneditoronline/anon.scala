package typingsJapgolly.jsoneditoronline

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddEventListener extends StObject {
    
    def addEventListener(
      element: HTMLElement,
      action: String,
      listener: js.Function1[/* event */ js.UndefOr[Event], Unit],
      useCapture: Boolean
    ): js.Function1[/* event */ js.UndefOr[Event], Unit]
    
    def preventDefault(event: Event): Unit
    
    def removeEventListener(
      element: HTMLElement,
      action: String,
      listener: js.Function1[/* event */ js.UndefOr[Event], Unit],
      useCapture: Boolean
    ): Unit
    
    def stopPropagation(event: Event): Unit
  }
  object AddEventListener {
    
    inline def apply(
      addEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => js.Function1[/* event */ js.UndefOr[Event], Unit],
      preventDefault: Event => Callback,
      removeEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => Callback,
      stopPropagation: Event => Callback
    ): AddEventListener = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction4(addEventListener), preventDefault = js.Any.fromFunction1((t0: Event) => preventDefault(t0).runNow()), removeEventListener = js.Any.fromFunction4((t0: HTMLElement, t1: String, t2: js.Function1[/* event */ js.UndefOr[Event], Unit], t3: Boolean) => (removeEventListener(t0, t1, t2, t3)).runNow()), stopPropagation = js.Any.fromFunction1((t0: Event) => stopPropagation(t0).runNow()))
      __obj.asInstanceOf[AddEventListener]
    }
    
    extension [Self <: AddEventListener](x: Self) {
      
      inline def setAddEventListener(
        value: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => js.Function1[/* event */ js.UndefOr[Event], Unit]
      ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction4(value))
      
      inline def setPreventDefault(value: Event => Callback): Self = StObject.set(x, "preventDefault", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setRemoveEventListener(
        value: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => Callback
      ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction4((t0: HTMLElement, t1: String, t2: js.Function1[/* event */ js.UndefOr[Event], Unit], t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setStopPropagation(value: Event => Callback): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    }
  }
}
