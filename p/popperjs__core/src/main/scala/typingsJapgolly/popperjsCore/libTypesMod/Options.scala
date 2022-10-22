package typingsJapgolly.popperjsCore.libTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.popperjsCore.anon.PartialModifieranyany
import typingsJapgolly.popperjsCore.anon.PartialState
import typingsJapgolly.popperjsCore.libEnumsMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var modifiers: js.Array[PartialModifieranyany]
  
  var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ PartialState, Unit]] = js.undefined
  
  var placement: Placement
  
  var strategy: PositioningStrategy
}
object Options {
  
  inline def apply(modifiers: js.Array[PartialModifieranyany], placement: Placement, strategy: PositioningStrategy): Options = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setModifiers(value: js.Array[PartialModifieranyany]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersVarargs(value: PartialModifieranyany*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setOnFirstUpdate(value: /* arg0 */ PartialState => Callback): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1((t0: /* arg0 */ PartialState) => value(t0).runNow()))
    
    inline def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
