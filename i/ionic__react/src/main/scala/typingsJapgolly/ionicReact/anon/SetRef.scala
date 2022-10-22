package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRouterOutletElement
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRef extends StObject {
  
  var forwardedRef: js.UndefOr[
    (MutableRefObject[HTMLIonRouterOutletElement | Null]) | (js.Function1[/* instance */ HTMLIonRouterOutletElement | Null, Unit]) | Null
  ] = js.undefined
  
  var setRef: js.UndefOr[js.Function1[/* val */ HTMLIonRouterOutletElement, Unit]] = js.undefined
}
object SetRef {
  
  inline def apply(): SetRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetRef]
  }
  
  extension [Self <: SetRef](x: Self) {
    
    inline def setForwardedRef(
      value: (MutableRefObject[HTMLIonRouterOutletElement | Null]) | (js.Function1[/* instance */ HTMLIonRouterOutletElement | Null, Unit])
    ): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefFunction1(value: /* instance */ HTMLIonRouterOutletElement | Null => japgolly.scalajs.react.Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ HTMLIonRouterOutletElement | Null) => value(t0).runNow()))
    
    inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    
    inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
    
    inline def setSetRef(value: /* val */ HTMLIonRouterOutletElement => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setRef", js.Any.fromFunction1((t0: /* val */ HTMLIonRouterOutletElement) => value(t0).runNow()))
    
    inline def setSetRefUndefined: Self = StObject.set(x, "setRef", js.undefined)
  }
}
