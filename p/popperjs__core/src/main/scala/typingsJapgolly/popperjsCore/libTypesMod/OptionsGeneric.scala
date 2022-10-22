package typingsJapgolly.popperjsCore.libTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.popperjsCore.anon.PartialState
import typingsJapgolly.popperjsCore.libEnumsMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsGeneric[TModifier] extends StObject {
  
  var modifiers: js.Array[TModifier]
  
  var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ PartialState, Unit]] = js.undefined
  
  var placement: Placement
  
  var strategy: PositioningStrategy
}
object OptionsGeneric {
  
  inline def apply[TModifier](modifiers: js.Array[TModifier], placement: Placement, strategy: PositioningStrategy): OptionsGeneric[TModifier] = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsGeneric[TModifier]]
  }
  
  extension [Self <: OptionsGeneric[?], TModifier](x: Self & OptionsGeneric[TModifier]) {
    
    inline def setModifiers(value: js.Array[TModifier]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersVarargs(value: TModifier*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setOnFirstUpdate(value: /* arg0 */ PartialState => Callback): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1((t0: /* arg0 */ PartialState) => value(t0).runNow()))
    
    inline def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
