package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchDegreeCentralityNormalizedResultDirected extends js.Object {
  /** the normalised indegree centrality of the specified node */
  def indegree(node: NodeSingular): js.Any
  /** the normalised outdegree centrality of the specified node */
  def outdegree(node: NodeSingular): js.Any
}

object SearchDegreeCentralityNormalizedResultDirected {
  @scala.inline
  def apply(indegree: NodeSingular => CallbackTo[js.Any], outdegree: NodeSingular => CallbackTo[js.Any]): SearchDegreeCentralityNormalizedResultDirected = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("indegree")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.NodeSingular) => indegree(t0).runNow()))
    __obj.updateDynamic("outdegree")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.NodeSingular) => outdegree(t0).runNow()))
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedResultDirected]
  }
}

