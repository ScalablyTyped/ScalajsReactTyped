package typingsJapgolly.yuka.srcYukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "HeuristicPolicyEuclid")
@js.native
open class HeuristicPolicyEuclid ()
  extends typingsJapgolly.yuka.srcGraphExtraHeuristicPolicyMod.HeuristicPolicyEuclid
/* static members */
object HeuristicPolicyEuclid {
  
  @JSImport("yuka/src/Yuka", "HeuristicPolicyEuclid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Calculates the euclidean distance between two nodes.
    *
    * @param graph - The graph.
    * @param source - The index of the source node.
    * @param target - The index of the target node.
    * @return The euclidean distance between both nodes.
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
