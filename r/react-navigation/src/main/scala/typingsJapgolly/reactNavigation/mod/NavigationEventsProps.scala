package typingsJapgolly.reactNavigation.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationEventsProps
  extends StObject
     with ViewProps {
  
  var onDidBlur: js.UndefOr[NavigationEventCallback] = js.undefined
  
  var onDidFocus: js.UndefOr[NavigationEventCallback] = js.undefined
  
  var onWillBlur: js.UndefOr[NavigationEventCallback] = js.undefined
  
  var onWillFocus: js.UndefOr[NavigationEventCallback] = js.undefined
}
object NavigationEventsProps {
  
  inline def apply(): NavigationEventsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationEventsProps]
  }
  
  extension [Self <: NavigationEventsProps](x: Self) {
    
    inline def setOnDidBlur(value: /* payload */ NavigationEventPayload => Callback): Self = StObject.set(x, "onDidBlur", js.Any.fromFunction1((t0: /* payload */ NavigationEventPayload) => value(t0).runNow()))
    
    inline def setOnDidBlurUndefined: Self = StObject.set(x, "onDidBlur", js.undefined)
    
    inline def setOnDidFocus(value: /* payload */ NavigationEventPayload => Callback): Self = StObject.set(x, "onDidFocus", js.Any.fromFunction1((t0: /* payload */ NavigationEventPayload) => value(t0).runNow()))
    
    inline def setOnDidFocusUndefined: Self = StObject.set(x, "onDidFocus", js.undefined)
    
    inline def setOnWillBlur(value: /* payload */ NavigationEventPayload => Callback): Self = StObject.set(x, "onWillBlur", js.Any.fromFunction1((t0: /* payload */ NavigationEventPayload) => value(t0).runNow()))
    
    inline def setOnWillBlurUndefined: Self = StObject.set(x, "onWillBlur", js.undefined)
    
    inline def setOnWillFocus(value: /* payload */ NavigationEventPayload => Callback): Self = StObject.set(x, "onWillFocus", js.Any.fromFunction1((t0: /* payload */ NavigationEventPayload) => value(t0).runNow()))
    
    inline def setOnWillFocusUndefined: Self = StObject.set(x, "onWillFocus", js.undefined)
  }
}
