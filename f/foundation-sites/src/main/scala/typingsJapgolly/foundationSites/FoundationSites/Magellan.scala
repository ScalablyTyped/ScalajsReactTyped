package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/magellan.html#javascript-reference
trait Magellan extends StObject {
  
  def calcPoints(): Unit
  
  def reflow(): Unit
  
  def scrollToLoc(location: String): Unit
}
object Magellan {
  
  inline def apply(calcPoints: Callback, reflow: Callback, scrollToLoc: String => Callback): Magellan = {
    val __obj = js.Dynamic.literal(calcPoints = calcPoints.toJsFn, reflow = reflow.toJsFn, scrollToLoc = js.Any.fromFunction1((t0: String) => scrollToLoc(t0).runNow()))
    __obj.asInstanceOf[Magellan]
  }
  
  extension [Self <: Magellan](x: Self) {
    
    inline def setCalcPoints(value: Callback): Self = StObject.set(x, "calcPoints", value.toJsFn)
    
    inline def setReflow(value: Callback): Self = StObject.set(x, "reflow", value.toJsFn)
    
    inline def setScrollToLoc(value: String => Callback): Self = StObject.set(x, "scrollToLoc", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
