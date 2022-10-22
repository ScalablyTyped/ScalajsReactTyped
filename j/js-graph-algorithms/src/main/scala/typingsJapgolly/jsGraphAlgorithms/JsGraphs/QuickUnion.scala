package typingsJapgolly.jsGraphAlgorithms.JsGraphs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickUnion extends StObject {
  
  def connected(v: Double, w: Double): Boolean
  
  /* private */ var id: Any
  
  def root(q: Double): Double
  
  def union(v: Double, w: Double): Unit
}
object QuickUnion {
  
  inline def apply(
    connected: (Double, Double) => Boolean,
    id: Any,
    root: Double => Double,
    union: (Double, Double) => Callback
  ): QuickUnion = {
    val __obj = js.Dynamic.literal(connected = js.Any.fromFunction2(connected), id = id.asInstanceOf[js.Any], root = js.Any.fromFunction1(root), union = js.Any.fromFunction2((t0: Double, t1: Double) => (union(t0, t1)).runNow()))
    __obj.asInstanceOf[QuickUnion]
  }
  
  extension [Self <: QuickUnion](x: Self) {
    
    inline def setConnected(value: (Double, Double) => Boolean): Self = StObject.set(x, "connected", js.Any.fromFunction2(value))
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Double => Double): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setUnion(value: (Double, Double) => Callback): Self = StObject.set(x, "union", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
