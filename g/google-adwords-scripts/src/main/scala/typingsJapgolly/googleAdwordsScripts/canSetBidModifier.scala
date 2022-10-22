package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait canSetBidModifier extends StObject {
  
  def getBidModifier(): Double
  
  def setBidModifier(modifier: Double): Unit
}
object canSetBidModifier {
  
  inline def apply(getBidModifier: CallbackTo[Double], setBidModifier: Double => Callback): canSetBidModifier = {
    val __obj = js.Dynamic.literal(getBidModifier = getBidModifier.toJsFn, setBidModifier = js.Any.fromFunction1((t0: Double) => setBidModifier(t0).runNow()))
    __obj.asInstanceOf[canSetBidModifier]
  }
  
  extension [Self <: canSetBidModifier](x: Self) {
    
    inline def setGetBidModifier(value: CallbackTo[Double]): Self = StObject.set(x, "getBidModifier", value.toJsFn)
    
    inline def setSetBidModifier(value: Double => Callback): Self = StObject.set(x, "setBidModifier", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
