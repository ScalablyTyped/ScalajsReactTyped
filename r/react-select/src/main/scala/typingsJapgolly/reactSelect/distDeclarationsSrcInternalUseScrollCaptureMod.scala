package typingsJapgolly.reactSelect

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcInternalUseScrollCaptureMod {
  
  @JSImport("react-select/dist/declarations/src/internal/useScrollCapture", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasIsEnabledOnBottomArriveOnBottomLeaveOnTopArriveOnTopLeave: Options): js.Function1[/* element */ HTMLElement | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasIsEnabledOnBottomArriveOnBottomLeaveOnTopArriveOnTopLeave.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* element */ HTMLElement | Null, Unit]]
  
  trait Options extends StObject {
    
    val isEnabled: Boolean
    
    val onBottomArrive: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
    
    val onBottomLeave: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
    
    val onTopArrive: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
    
    val onTopLeave: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(isEnabled: Boolean): Options = {
      val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setOnBottomArrive(value: /* event */ WheelEvent | TouchEvent => Callback): Self = StObject.set(x, "onBottomArrive", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
      
      inline def setOnBottomArriveUndefined: Self = StObject.set(x, "onBottomArrive", js.undefined)
      
      inline def setOnBottomLeave(value: /* event */ WheelEvent | TouchEvent => Callback): Self = StObject.set(x, "onBottomLeave", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
      
      inline def setOnBottomLeaveUndefined: Self = StObject.set(x, "onBottomLeave", js.undefined)
      
      inline def setOnTopArrive(value: /* event */ WheelEvent | TouchEvent => Callback): Self = StObject.set(x, "onTopArrive", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
      
      inline def setOnTopArriveUndefined: Self = StObject.set(x, "onTopArrive", js.undefined)
      
      inline def setOnTopLeave(value: /* event */ WheelEvent | TouchEvent => Callback): Self = StObject.set(x, "onTopLeave", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
      
      inline def setOnTopLeaveUndefined: Self = StObject.set(x, "onTopLeave", js.undefined)
    }
  }
}
