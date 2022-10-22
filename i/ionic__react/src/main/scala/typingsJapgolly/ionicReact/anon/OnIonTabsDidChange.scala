package typingsJapgolly.ionicReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.CustomEvent
import typingsJapgolly.ionicReact.ionicReactStrings.bottom
import typingsJapgolly.ionicReact.ionicReactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnIonTabsDidChange extends StObject {
  
  var onIonTabsDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  
  var onIonTabsWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  
  var slot: js.UndefOr[bottom | top] = js.undefined
  
  var style: js.UndefOr[StringDictionary[String]] = js.undefined
}
object OnIonTabsDidChange {
  
  inline def apply(): OnIonTabsDidChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnIonTabsDidChange]
  }
  
  extension [Self <: OnIonTabsDidChange](x: Self) {
    
    inline def setOnIonTabsDidChange(value: /* event */ CustomEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onIonTabsDidChange", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def setOnIonTabsDidChangeUndefined: Self = StObject.set(x, "onIonTabsDidChange", js.undefined)
    
    inline def setOnIonTabsWillChange(value: /* event */ CustomEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onIonTabsWillChange", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def setOnIonTabsWillChangeUndefined: Self = StObject.set(x, "onIonTabsWillChange", js.undefined)
    
    inline def setSlot(value: bottom | top): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setStyle(value: StringDictionary[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
