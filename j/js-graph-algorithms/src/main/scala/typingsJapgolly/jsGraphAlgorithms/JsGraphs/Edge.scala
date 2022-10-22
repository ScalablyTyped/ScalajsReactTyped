package typingsJapgolly.jsGraphAlgorithms.JsGraphs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edge extends StObject {
  
  def either(): Double
  
  def from(): Double
  
  var label: js.UndefOr[String] = js.undefined
  
  def other(x: Double): Double
  
  def to(): Double
  
  /* private */ var v: Any
  
  /* private */ var w: Any
  
  var weight: Double
}
object Edge {
  
  inline def apply(
    either: CallbackTo[Double],
    from: CallbackTo[Double],
    other: Double => Double,
    to: CallbackTo[Double],
    v: Any,
    w: Any,
    weight: Double
  ): Edge = {
    val __obj = js.Dynamic.literal(either = either.toJsFn, from = from.toJsFn, other = js.Any.fromFunction1(other), to = to.toJsFn, v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  
  extension [Self <: Edge](x: Self) {
    
    inline def setEither(value: CallbackTo[Double]): Self = StObject.set(x, "either", value.toJsFn)
    
    inline def setFrom(value: CallbackTo[Double]): Self = StObject.set(x, "from", value.toJsFn)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOther(value: Double => Double): Self = StObject.set(x, "other", js.Any.fromFunction1(value))
    
    inline def setTo(value: CallbackTo[Double]): Self = StObject.set(x, "to", value.toJsFn)
    
    inline def setV(value: Any): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setW(value: Any): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
