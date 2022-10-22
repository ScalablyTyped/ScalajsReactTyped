package typingsJapgolly.ionicReact.anon

import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnIonTabButtonClick extends StObject {
  
  var onIonTabButtonClick: js.UndefOr[js.Function1[/* e */ CustomEvent, Unit]] = js.undefined
}
object OnIonTabButtonClick {
  
  inline def apply(): OnIonTabButtonClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnIonTabButtonClick]
  }
  
  extension [Self <: OnIonTabButtonClick](x: Self) {
    
    inline def setOnIonTabButtonClick(value: /* e */ CustomEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onIonTabButtonClick", js.Any.fromFunction1((t0: /* e */ CustomEvent) => value(t0).runNow()))
    
    inline def setOnIonTabButtonClickUndefined: Self = StObject.set(x, "onIonTabButtonClick", js.undefined)
  }
}
