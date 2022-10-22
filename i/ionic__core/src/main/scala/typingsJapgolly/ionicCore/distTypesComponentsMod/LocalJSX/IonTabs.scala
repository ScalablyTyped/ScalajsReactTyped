package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.anon.Tab
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonTabsCustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonTabs extends StObject {
  
  /**
    * Emitted when the navigation has finished transitioning to a new component.
    */
  var onIonTabsDidChange: js.UndefOr[js.Function1[/* event */ IonTabsCustomEvent[Tab], Unit]] = js.undefined
  
  /**
    * Emitted when the navigation is about to transition to a new component.
    */
  var onIonTabsWillChange: js.UndefOr[js.Function1[/* event */ IonTabsCustomEvent[Tab], Unit]] = js.undefined
}
object IonTabs {
  
  inline def apply(): IonTabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonTabs]
  }
  
  extension [Self <: IonTabs](x: Self) {
    
    inline def setOnIonTabsDidChange(value: /* event */ IonTabsCustomEvent[Tab] => Callback): Self = StObject.set(x, "onIonTabsDidChange", js.Any.fromFunction1((t0: /* event */ IonTabsCustomEvent[Tab]) => value(t0).runNow()))
    
    inline def setOnIonTabsDidChangeUndefined: Self = StObject.set(x, "onIonTabsDidChange", js.undefined)
    
    inline def setOnIonTabsWillChange(value: /* event */ IonTabsCustomEvent[Tab] => Callback): Self = StObject.set(x, "onIonTabsWillChange", js.Any.fromFunction1((t0: /* event */ IonTabsCustomEvent[Tab]) => value(t0).runNow()))
    
    inline def setOnIonTabsWillChangeUndefined: Self = StObject.set(x, "onIonTabsWillChange", js.undefined)
  }
}
