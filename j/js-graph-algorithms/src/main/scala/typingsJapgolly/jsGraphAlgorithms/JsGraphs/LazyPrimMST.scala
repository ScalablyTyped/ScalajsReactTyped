package typingsJapgolly.jsGraphAlgorithms.JsGraphs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LazyPrimMST extends StObject {
  
  /* private */ var marked: Any
  
  var mst: js.Array[Edge]
  
  /* private */ var pq: Any
  
  def visit(G: WeightedGraph, v: Double): Unit
}
object LazyPrimMST {
  
  inline def apply(marked: Any, mst: js.Array[Edge], pq: Any, visit: (WeightedGraph, Double) => Callback): LazyPrimMST = {
    val __obj = js.Dynamic.literal(marked = marked.asInstanceOf[js.Any], mst = mst.asInstanceOf[js.Any], pq = pq.asInstanceOf[js.Any], visit = js.Any.fromFunction2((t0: WeightedGraph, t1: Double) => (visit(t0, t1)).runNow()))
    __obj.asInstanceOf[LazyPrimMST]
  }
  
  extension [Self <: LazyPrimMST](x: Self) {
    
    inline def setMarked(value: Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    inline def setMst(value: js.Array[Edge]): Self = StObject.set(x, "mst", value.asInstanceOf[js.Any])
    
    inline def setMstVarargs(value: Edge*): Self = StObject.set(x, "mst", js.Array(value*))
    
    inline def setPq(value: Any): Self = StObject.set(x, "pq", value.asInstanceOf[js.Any])
    
    inline def setVisit(value: (WeightedGraph, Double) => Callback): Self = StObject.set(x, "visit", js.Any.fromFunction2((t0: WeightedGraph, t1: Double) => (value(t0, t1)).runNow()))
  }
}
