package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAlertElement
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var forwardedRef: js.UndefOr[
    (MutableRefObject[HTMLIonAlertElement | Null]) | (js.Function1[/* instance */ HTMLIonAlertElement | Null, Unit]) | Null
  ] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setForwardedRef(
      value: (MutableRefObject[HTMLIonAlertElement | Null]) | (js.Function1[/* instance */ HTMLIonAlertElement | Null, Unit])
    ): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefFunction1(value: /* instance */ HTMLIonAlertElement | Null => japgolly.scalajs.react.Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ HTMLIonAlertElement | Null) => value(t0).runNow()))
    
    inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    
    inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
  }
}
