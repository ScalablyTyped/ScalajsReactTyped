package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/equalizer.html#javascript-reference
trait Equalizer extends StObject {
  
  def applyHeight(heights: js.Array[Any]): Unit
  
  def applyHeightByRow(groups: js.Array[Any]): Unit
  
  def getHeights(cb: js.Function): js.Array[Any]
  
  def getHeightsByRow(cb: js.Function): js.Array[Any]
}
object Equalizer {
  
  inline def apply(
    applyHeight: js.Array[Any] => Callback,
    applyHeightByRow: js.Array[Any] => Callback,
    getHeights: js.Function => js.Array[Any],
    getHeightsByRow: js.Function => js.Array[Any]
  ): Equalizer = {
    val __obj = js.Dynamic.literal(applyHeight = js.Any.fromFunction1((t0: js.Array[Any]) => applyHeight(t0).runNow()), applyHeightByRow = js.Any.fromFunction1((t0: js.Array[Any]) => applyHeightByRow(t0).runNow()), getHeights = js.Any.fromFunction1(getHeights), getHeightsByRow = js.Any.fromFunction1(getHeightsByRow))
    __obj.asInstanceOf[Equalizer]
  }
  
  extension [Self <: Equalizer](x: Self) {
    
    inline def setApplyHeight(value: js.Array[Any] => Callback): Self = StObject.set(x, "applyHeight", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
    
    inline def setApplyHeightByRow(value: js.Array[Any] => Callback): Self = StObject.set(x, "applyHeightByRow", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
    
    inline def setGetHeights(value: js.Function => js.Array[Any]): Self = StObject.set(x, "getHeights", js.Any.fromFunction1(value))
    
    inline def setGetHeightsByRow(value: js.Function => js.Array[Any]): Self = StObject.set(x, "getHeightsByRow", js.Any.fromFunction1(value))
  }
}
