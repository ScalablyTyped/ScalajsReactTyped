package typingsJapgolly.useGestureCore.distDeclarationsSrcTypesConfigMod

import typingsJapgolly.useGestureCore.anon.PinchStateeventEventTypes
import typingsJapgolly.useGestureCore.anon.Touch
import typingsJapgolly.useGestureCore.useGestureCoreStrings.lock
import typingsJapgolly.useGestureCore.useGestureCoreStrings.pinch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinchConfig
  extends StObject
     with GestureOptions[pinch] {
  
  /**
    * Limits the angle `offset` to the specified bounds.
    */
  var angleBounds: js.UndefOr[
    PinchBounds | (js.Function1[/* state */ js.UndefOr[PinchStateeventEventTypes], PinchBounds])
  ] = js.undefined
  
  /**
    * Scales OR rotates when set to 'lock'.
    */
  var axis: js.UndefOr[lock] = js.undefined
  
  /**
    * Key that triggers scale when using the wheel. Defaults to `'ctrlKey'`.
    */
  var modifierKey: js.UndefOr[ModifierKey] = js.undefined
  
  var pointer: js.UndefOr[Touch] = js.undefined
  
  /**
    * Limits the scale `offset` to the specified bounds.
    */
  var scaleBounds: js.UndefOr[
    PinchBounds | (js.Function1[/* state */ js.UndefOr[PinchStateeventEventTypes], PinchBounds])
  ] = js.undefined
}
object PinchConfig {
  
  inline def apply(): PinchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinchConfig]
  }
  
  extension [Self <: PinchConfig](x: Self) {
    
    inline def setAngleBounds(
      value: PinchBounds | (js.Function1[/* state */ js.UndefOr[PinchStateeventEventTypes], PinchBounds])
    ): Self = StObject.set(x, "angleBounds", value.asInstanceOf[js.Any])
    
    inline def setAngleBoundsFunction1(value: /* state */ js.UndefOr[PinchStateeventEventTypes] => PinchBounds): Self = StObject.set(x, "angleBounds", js.Any.fromFunction1(value))
    
    inline def setAngleBoundsUndefined: Self = StObject.set(x, "angleBounds", js.undefined)
    
    inline def setAxis(value: lock): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setModifierKey(value: ModifierKey): Self = StObject.set(x, "modifierKey", value.asInstanceOf[js.Any])
    
    inline def setModifierKeyNull: Self = StObject.set(x, "modifierKey", null)
    
    inline def setModifierKeyUndefined: Self = StObject.set(x, "modifierKey", js.undefined)
    
    inline def setPointer(value: Touch): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
    
    inline def setScaleBounds(
      value: PinchBounds | (js.Function1[/* state */ js.UndefOr[PinchStateeventEventTypes], PinchBounds])
    ): Self = StObject.set(x, "scaleBounds", value.asInstanceOf[js.Any])
    
    inline def setScaleBoundsFunction1(value: /* state */ js.UndefOr[PinchStateeventEventTypes] => PinchBounds): Self = StObject.set(x, "scaleBounds", js.Any.fromFunction1(value))
    
    inline def setScaleBoundsUndefined: Self = StObject.set(x, "scaleBounds", js.undefined)
  }
}
