package typingsJapgolly.jsGraphAlgorithms.JsGraphs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightedDiGraph
  extends StObject
     with WeightedGraph {
  
  def toDiGraph(): DiGraph
}
object WeightedDiGraph {
  
  inline def apply(
    V: Double,
    addEdge: Edge => Callback,
    adj: Double => js.Array[Edge],
    adjList: js.Array[js.Array[Edge]],
    edge: (Double, Double) => Edge | Null,
    node: Double => Node,
    nodeInfo: Any,
    toDiGraph: CallbackTo[DiGraph]
  ): WeightedDiGraph = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], addEdge = js.Any.fromFunction1((t0: Edge) => addEdge(t0).runNow()), adj = js.Any.fromFunction1(adj), adjList = adjList.asInstanceOf[js.Any], edge = js.Any.fromFunction2(edge), node = js.Any.fromFunction1(node), nodeInfo = nodeInfo.asInstanceOf[js.Any], toDiGraph = toDiGraph.toJsFn)
    __obj.asInstanceOf[WeightedDiGraph]
  }
  
  extension [Self <: WeightedDiGraph](x: Self) {
    
    inline def setToDiGraph(value: CallbackTo[DiGraph]): Self = StObject.set(x, "toDiGraph", value.toJsFn)
  }
}
