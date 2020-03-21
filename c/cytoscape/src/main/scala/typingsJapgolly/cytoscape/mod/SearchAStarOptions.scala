package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.aStar
  */
trait SearchAStarOptions extends js.Object {
  var directed: js.UndefOr[Boolean] = js.undefined
  var goal: Selector | CollectionArgument
  var heuristic: js.UndefOr[js.Function1[/* node */ NodeCollection, Double]] = js.undefined
  var root: Selector | CollectionArgument
  var weight: js.UndefOr[WeightFn] = js.undefined
}

object SearchAStarOptions {
  @scala.inline
  def apply(
    goal: Selector | CollectionArgument,
    root: Selector | CollectionArgument,
    directed: js.UndefOr[Boolean] = js.undefined,
    heuristic: /* node */ NodeCollection => CallbackTo[Double] = null,
    weight: /* edge */ EdgeCollection => CallbackTo[Double] = null
  ): SearchAStarOptions = {
    val __obj = js.Dynamic.literal(goal = goal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed.asInstanceOf[js.Any])
    if (heuristic != null) __obj.updateDynamic("heuristic")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.cytoscape.mod.NodeCollection) => heuristic(t0).runNow()))
    if (weight != null) __obj.updateDynamic("weight")(js.Any.fromFunction1((t0: /* edge */ typingsJapgolly.cytoscape.mod.EdgeCollection) => weight(t0).runNow()))
    __obj.asInstanceOf[SearchAStarOptions]
  }
}

