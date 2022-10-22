package typingsJapgolly.materialChips

import japgolly.scalajs.react.Callback
import typingsJapgolly.materialChips.deprecatedTrailingactionConstantsMod.InteractionTrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedTrailingactionAdapterMod {
  
  trait MDCChipTrailingActionAdapter extends StObject {
    
    def focus(): Unit
    
    def getAttribute(attr: String): String | Null
    
    def notifyInteraction(trigger: InteractionTrigger): Unit
    
    def notifyNavigation(key: String): Unit
    
    def setAttribute(attr: String, value: String): Unit
  }
  object MDCChipTrailingActionAdapter {
    
    inline def apply(
      focus: Callback,
      getAttribute: String => String | Null,
      notifyInteraction: InteractionTrigger => Callback,
      notifyNavigation: String => Callback,
      setAttribute: (String, String) => Callback
    ): MDCChipTrailingActionAdapter = {
      val __obj = js.Dynamic.literal(focus = focus.toJsFn, getAttribute = js.Any.fromFunction1(getAttribute), notifyInteraction = js.Any.fromFunction1((t0: InteractionTrigger) => notifyInteraction(t0).runNow()), notifyNavigation = js.Any.fromFunction1((t0: String) => notifyNavigation(t0).runNow()), setAttribute = js.Any.fromFunction2((t0: String, t1: String) => (setAttribute(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCChipTrailingActionAdapter]
    }
    
    extension [Self <: MDCChipTrailingActionAdapter](x: Self) {
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setGetAttribute(value: String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setNotifyInteraction(value: InteractionTrigger => Callback): Self = StObject.set(x, "notifyInteraction", js.Any.fromFunction1((t0: InteractionTrigger) => value(t0).runNow()))
      
      inline def setNotifyNavigation(value: String => Callback): Self = StObject.set(x, "notifyNavigation", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetAttribute(value: (String, String) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
