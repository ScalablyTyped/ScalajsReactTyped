package typingsJapgolly.yuka.srcYukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "HeuristicPolicyDijkstra")
@js.native
open class HeuristicPolicyDijkstra ()
  extends typingsJapgolly.yuka.srcGraphExtraHeuristicPolicyMod.HeuristicPolicyDijkstra
/* static members */
object HeuristicPolicyDijkstra {
  
  @JSImport("yuka/src/Yuka", "HeuristicPolicyDijkstra")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This heuristic always returns *0*. The {@link AStar} algorithm
    * behaves with this heuristic exactly like {@link Dijkstra}
    *
    * @param graph - The graph.
    * @param source - The index of the source node.
    * @param target - The index of the target node.
    * @return The value 0.
    */
  inline def calculate(
    graph: typingsJapgolly.yuka.srcGraphCoreGraphMod.Graph[
      typingsJapgolly.yuka.srcGraphCoreNodeMod.Node, 
      typingsJapgolly.yuka.srcGraphCoreEdgeMod.Edge
    ],
    source: Double,
    target: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
}
