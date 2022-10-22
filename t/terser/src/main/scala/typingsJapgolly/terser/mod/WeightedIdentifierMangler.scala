package typingsJapgolly.terser.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightedIdentifierMangler
  extends StObject
     with SimpleIdentifierMangler {
  
  /**
    * Modifies the internal weighting of the input characters by the specified delta.
    * Will be invoked on the entire printed AST, and then deduct mangleable identifiers.
    * @param chars The characters to modify the weighting of.
    * @param delta The numeric weight to add to the characters.
    */
  def consider(chars: String, delta: Double): Double
  
  /**
    * Resets character weights.
    */
  def reset(): Unit
  
  /**
    * Sorts identifiers by character frequency, in preparation for calls to get(n).
    */
  def sort(): Unit
}
object WeightedIdentifierMangler {
  
  inline def apply(consider: (String, Double) => Double, get: Double => String, reset: Callback, sort: Callback): WeightedIdentifierMangler = {
    val __obj = js.Dynamic.literal(consider = js.Any.fromFunction2(consider), get = js.Any.fromFunction1(get), reset = reset.toJsFn, sort = sort.toJsFn)
    __obj.asInstanceOf[WeightedIdentifierMangler]
  }
  
  extension [Self <: WeightedIdentifierMangler](x: Self) {
    
    inline def setConsider(value: (String, Double) => Double): Self = StObject.set(x, "consider", js.Any.fromFunction2(value))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSort(value: Callback): Self = StObject.set(x, "sort", value.toJsFn)
  }
}
