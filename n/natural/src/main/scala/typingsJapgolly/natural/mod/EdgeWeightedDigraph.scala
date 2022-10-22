package typingsJapgolly.natural.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeWeightedDigraph extends StObject {
  
  def add(start: Double, end: Double, weight: Double): Unit
  
  def e(): Double
  
  def v(): Double
}
object EdgeWeightedDigraph {
  
  inline def apply(add: (Double, Double, Double) => Callback, e: CallbackTo[Double], v: CallbackTo[Double]): EdgeWeightedDigraph = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (add(t0, t1, t2)).runNow()), e = e.toJsFn, v = v.toJsFn)
    __obj.asInstanceOf[EdgeWeightedDigraph]
  }
  
  extension [Self <: EdgeWeightedDigraph](x: Self) {
    
    inline def setAdd(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setE(value: CallbackTo[Double]): Self = StObject.set(x, "e", value.toJsFn)
    
    inline def setV(value: CallbackTo[Double]): Self = StObject.set(x, "v", value.toJsFn)
  }
}
