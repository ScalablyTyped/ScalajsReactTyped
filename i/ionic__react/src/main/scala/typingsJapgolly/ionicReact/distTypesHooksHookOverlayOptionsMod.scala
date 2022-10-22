package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksHookOverlayOptionsMod {
  
  trait HookOverlayOptions extends StObject {
    
    var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
    
    var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
    
    var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
    
    var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  }
  object HookOverlayOptions {
    
    inline def apply(): HookOverlayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HookOverlayOptions]
    }
    
    extension [Self <: HookOverlayOptions](x: Self) {
      
      inline def setOnDidDismiss(value: /* event */ CustomEvent => Callback): Self = StObject.set(x, "onDidDismiss", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
      
      inline def setOnDidDismissUndefined: Self = StObject.set(x, "onDidDismiss", js.undefined)
      
      inline def setOnDidPresent(value: /* event */ CustomEvent => Callback): Self = StObject.set(x, "onDidPresent", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
      
      inline def setOnDidPresentUndefined: Self = StObject.set(x, "onDidPresent", js.undefined)
      
      inline def setOnWillDismiss(value: /* event */ CustomEvent => Callback): Self = StObject.set(x, "onWillDismiss", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
      
      inline def setOnWillDismissUndefined: Self = StObject.set(x, "onWillDismiss", js.undefined)
      
      inline def setOnWillPresent(value: /* event */ CustomEvent => Callback): Self = StObject.set(x, "onWillPresent", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
      
      inline def setOnWillPresentUndefined: Self = StObject.set(x, "onWillPresent", js.undefined)
    }
  }
}
