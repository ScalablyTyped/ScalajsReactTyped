package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicReact.distTypesComponentsCreateControllerComponentMod.OverlayBase
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[OverlayType /* <: OverlayBase */] extends StObject {
  
  var forwardedRef: js.UndefOr[
    (MutableRefObject[OverlayType | Null]) | (js.Function1[/* instance */ OverlayType | Null, Unit]) | Null
  ] = js.undefined
}
object `4` {
  
  inline def apply[OverlayType /* <: OverlayBase */](): `4`[OverlayType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[OverlayType]]
  }
  
  extension [Self <: `4`[?], OverlayType /* <: OverlayBase */](x: Self & `4`[OverlayType]) {
    
    inline def setForwardedRef(
      value: (MutableRefObject[OverlayType | Null]) | (js.Function1[/* instance */ OverlayType | Null, Unit])
    ): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefFunction1(value: /* instance */ OverlayType | Null => japgolly.scalajs.react.Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ OverlayType | Null) => value(t0).runNow()))
    
    inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    
    inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
  }
}
