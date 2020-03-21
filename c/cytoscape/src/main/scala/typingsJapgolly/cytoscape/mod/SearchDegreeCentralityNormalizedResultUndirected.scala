package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.degreeCentralityNormalized
  */
trait SearchDegreeCentralityNormalizedResultUndirected extends js.Object {
  /** the normalised degree centrality of the specified node */
  def degree(node: NodeSingular): js.Any
}

object SearchDegreeCentralityNormalizedResultUndirected {
  @scala.inline
  def apply(degree: NodeSingular => CallbackTo[js.Any]): SearchDegreeCentralityNormalizedResultUndirected = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("degree")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.NodeSingular) => degree(t0).runNow()))
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedResultUndirected]
  }
}

