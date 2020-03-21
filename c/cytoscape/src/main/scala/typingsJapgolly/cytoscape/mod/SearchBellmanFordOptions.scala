package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.bellmanFord
  */
trait SearchBellmanFordOptions extends js.Object {
  /**
    * Indicating whether the algorithm should only go along
    * edges from source to target (default false).
    */
  var directed: Boolean
  /**
    * The root node (selector or collection) where the search starts.
    */
  var root: js.Any
  /**
    * A function that returns the positive numeric weight for this edge.
    */
  var weight: js.UndefOr[WeightFn] = js.undefined
}

object SearchBellmanFordOptions {
  @scala.inline
  def apply(directed: Boolean, root: js.Any, weight: /* edge */ EdgeCollection => CallbackTo[Double] = null): SearchBellmanFordOptions = {
    val __obj = js.Dynamic.literal(directed = directed.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(js.Any.fromFunction1((t0: /* edge */ typingsJapgolly.cytoscape.mod.EdgeCollection) => weight(t0).runNow()))
    __obj.asInstanceOf[SearchBellmanFordOptions]
  }
}

