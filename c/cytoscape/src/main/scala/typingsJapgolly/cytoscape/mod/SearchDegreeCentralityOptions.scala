package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.degreeCentrality
  */
trait SearchDegreeCentralityOptions extends js.Object {
  /**
    * The alpha value for the centrality calculation, ranging on [0, 1].
    * With value 0 (default), disregards edge weights and solely uses
    * number of edges in the centrality calculation. With value 1,
    * disregards number of edges and solely uses the edge weights
    * in the centrality calculation.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Whether the directed indegree and outdegree centrality is calculated (true) or
    * whether the undirected centrality is calculated (false, default).
    */
  var directed: js.UndefOr[Boolean] = js.undefined
  /**
    * The root node (selector or collection) for which the
    * centrality calculation is made.
    */
  var root: NodeSingular | Selector
  /**  A function that returns the weight for the edge. */
  var weight: js.UndefOr[js.Function1[/* edge */ EdgeSingular, Double]] = js.undefined
}

object SearchDegreeCentralityOptions {
  @scala.inline
  def apply(
    root: NodeSingular | Selector,
    alpha: Int | Double = null,
    directed: js.UndefOr[Boolean] = js.undefined,
    weight: /* edge */ EdgeSingular => CallbackTo[Double] = null
  ): SearchDegreeCentralityOptions = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(js.Any.fromFunction1((t0: /* edge */ typingsJapgolly.cytoscape.mod.EdgeSingular) => weight(t0).runNow()))
    __obj.asInstanceOf[SearchDegreeCentralityOptions]
  }
}

