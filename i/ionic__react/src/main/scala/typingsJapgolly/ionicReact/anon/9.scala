package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicReact.distTypesComponentsReactComponentLibCreateOverlayComponentMod.OverlayElement
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9`[OverlayType /* <: OverlayElement */] extends StObject {
  
  var forwardedRef: js.UndefOr[
    (MutableRefObject[OverlayType | Null]) | (js.Function1[/* instance */ OverlayType | Null, Unit]) | Null
  ] = js.undefined
}
object `9` {
  
  inline def apply[OverlayType /* <: OverlayElement */](): `9`[OverlayType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`9`[OverlayType]]
  }
  
  extension [Self <: `9`[?], OverlayType /* <: OverlayElement */](x: Self & `9`[OverlayType]) {
    
    inline def setForwardedRef(
      value: (MutableRefObject[OverlayType | Null]) | (js.Function1[/* instance */ OverlayType | Null, Unit])
    ): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefFunction1(value: /* instance */ OverlayType | Null => japgolly.scalajs.react.Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ OverlayType | Null) => value(t0).runNow()))
    
    inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    
    inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
  }
}
