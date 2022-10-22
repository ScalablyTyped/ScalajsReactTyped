package typingsJapgolly.jsGraphAlgorithms.JsGraphs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectedComponents extends StObject {
  
  def componentCount(): Double
  
  def componentId(v: Double): Double
  
  /* private */ var count: Any
  
  def dfs(G: Graph, v: Double): Unit
  
  /* private */ var id: Any
  
  /* private */ var marked: Any
}
object ConnectedComponents {
  
  inline def apply(
    componentCount: CallbackTo[Double],
    componentId: Double => Double,
    count: Any,
    dfs: (Graph, Double) => Callback,
    id: Any,
    marked: Any
  ): ConnectedComponents = {
    val __obj = js.Dynamic.literal(componentCount = componentCount.toJsFn, componentId = js.Any.fromFunction1(componentId), count = count.asInstanceOf[js.Any], dfs = js.Any.fromFunction2((t0: Graph, t1: Double) => (dfs(t0, t1)).runNow()), id = id.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedComponents]
  }
  
  extension [Self <: ConnectedComponents](x: Self) {
    
    inline def setComponentCount(value: CallbackTo[Double]): Self = StObject.set(x, "componentCount", value.toJsFn)
    
    inline def setComponentId(value: Double => Double): Self = StObject.set(x, "componentId", js.Any.fromFunction1(value))
    
    inline def setCount(value: Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDfs(value: (Graph, Double) => Callback): Self = StObject.set(x, "dfs", js.Any.fromFunction2((t0: Graph, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMarked(value: Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
  }
}
