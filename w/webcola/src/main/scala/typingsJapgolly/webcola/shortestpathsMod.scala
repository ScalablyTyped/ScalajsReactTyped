package typingsJapgolly.webcola

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/shortestpaths", JSImport.Namespace)
@js.native
object shortestpathsMod extends js.Object {
  @js.native
  class Calculator[Link] protected () extends js.Object {
    def this(
      n: Double,
      es: js.Array[Link],
      getSourceIndex: js.Function1[/* l */ Link, Double],
      getTargetIndex: js.Function1[/* l */ Link, Double],
      getLength: js.Function1[/* l */ Link, Double]
    ) = this()
    var dijkstraNeighbours: js.Any = js.native
    var es: js.Array[Link] = js.native
    var n: Double = js.native
    var neighbours: js.Any = js.native
    def DistanceMatrix(): js.Array[js.Array[Double]] = js.native
    def DistancesFromNode(start: Double): js.Array[Double] = js.native
    def PathFromNodeToNode(start: Double, end: Double): js.Array[Double] = js.native
    def PathFromNodeToNodeWithPrevCost(
      start: Double,
      end: Double,
      prevCost: js.Function3[/* u */ Double, /* v */ Double, /* w */ Double, Double]
    ): js.Array[Double] = js.native
  }
  
}

