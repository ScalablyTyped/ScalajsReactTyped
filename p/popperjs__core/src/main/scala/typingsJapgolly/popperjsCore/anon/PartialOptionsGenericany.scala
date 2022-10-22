package typingsJapgolly.popperjsCore.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.popperjsCore.libTypesMod.PositioningStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/types.OptionsGeneric<any>> */
trait PartialOptionsGenericany extends StObject {
  
  var modifiers: js.UndefOr[js.Array[Any]] = js.undefined
  
  var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ PartialState, Unit]] = js.undefined
  
  var placement: js.UndefOr[typingsJapgolly.popperjsCore.libEnumsMod.Placement] = js.undefined
  
  var strategy: js.UndefOr[PositioningStrategy] = js.undefined
}
object PartialOptionsGenericany {
  
  inline def apply(): PartialOptionsGenericany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsGenericany]
  }
  
  extension [Self <: PartialOptionsGenericany](x: Self) {
    
    inline def setModifiers(value: js.Array[Any]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setModifiersVarargs(value: Any*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setOnFirstUpdate(value: /* arg0 */ PartialState => Callback): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1((t0: /* arg0 */ PartialState) => value(t0).runNow()))
    
    inline def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
    
    inline def setPlacement(value: typingsJapgolly.popperjsCore.libEnumsMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
