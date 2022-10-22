package typingsJapgolly.jsGraphAlgorithms.JsGraphs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopologicalSort extends StObject {
  
  def dfs(G: DiGraph, v: Double): Unit
  
  /* private */ var marked: Any
  
  def order(): js.Array[Double]
  
  /* private */ var postOrder: Any
}
object TopologicalSort {
  
  inline def apply(
    dfs: (DiGraph, Double) => Callback,
    marked: Any,
    order: CallbackTo[js.Array[Double]],
    postOrder: Any
  ): TopologicalSort = {
    val __obj = js.Dynamic.literal(dfs = js.Any.fromFunction2((t0: DiGraph, t1: Double) => (dfs(t0, t1)).runNow()), marked = marked.asInstanceOf[js.Any], order = order.toJsFn, postOrder = postOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologicalSort]
  }
  
  extension [Self <: TopologicalSort](x: Self) {
    
    inline def setDfs(value: (DiGraph, Double) => Callback): Self = StObject.set(x, "dfs", js.Any.fromFunction2((t0: DiGraph, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setMarked(value: Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "order", value.toJsFn)
    
    inline def setPostOrder(value: Any): Self = StObject.set(x, "postOrder", value.asInstanceOf[js.Any])
  }
}
