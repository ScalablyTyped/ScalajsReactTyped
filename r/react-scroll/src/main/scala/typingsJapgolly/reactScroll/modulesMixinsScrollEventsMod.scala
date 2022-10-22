package typingsJapgolly.reactScroll

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactScroll.modulesMixinsScrollEventsMod.Events.ScrollEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesMixinsScrollEventsMod {
  
  object default {
    
    @JSImport("react-scroll/modules/mixins/scroll-events", "default.scrollEvent")
    @js.native
    val scrollEvent: ScrollEvent = js.native
  }
  
  object Events {
    
    trait ScrollEvent extends StObject {
      
      def register(eventName: String, callback: js.Function2[/* to */ String, /* element */ Any, Unit]): Unit
      
      def remove(eventName: String): Unit
    }
    object ScrollEvent {
      
      inline def apply(
        register: (String, js.Function2[/* to */ String, /* element */ Any, Unit]) => Callback,
        remove: String => Callback
      ): ScrollEvent = {
        val __obj = js.Dynamic.literal(register = js.Any.fromFunction2((t0: String, t1: js.Function2[/* to */ String, /* element */ Any, Unit]) => (register(t0, t1)).runNow()), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()))
        __obj.asInstanceOf[ScrollEvent]
      }
      
      extension [Self <: ScrollEvent](x: Self) {
        
        inline def setRegister(value: (String, js.Function2[/* to */ String, /* element */ Any, Unit]) => Callback): Self = StObject.set(x, "register", js.Any.fromFunction2((t0: String, t1: js.Function2[/* to */ String, /* element */ Any, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      }
    }
  }
}
