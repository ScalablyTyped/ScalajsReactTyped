package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFirstOptions2
  extends SearchFirstOptionsBase
     with SearchFirstOptions {
  /**
    * The root nodes (selector or collection) to start the search from.
    */
  var roots: Selector | CollectionArgument
}

object SearchFirstOptions2 {
  @scala.inline
  def apply(
    roots: Selector | CollectionArgument,
    directed: js.UndefOr[Boolean] = js.undefined,
    visit: (/* v */ NodeSingular, /* e */ EdgeSingular, /* u */ NodeSingular, /* i */ Double, /* depth */ Double) => CallbackTo[Boolean | Unit] = null
  ): SearchFirstOptions2 = {
    val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed.asInstanceOf[js.Any])
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction5((t0: /* v */ typingsJapgolly.cytoscape.mod.NodeSingular, t1: /* e */ typingsJapgolly.cytoscape.mod.EdgeSingular, t2: /* u */ typingsJapgolly.cytoscape.mod.NodeSingular, t3: /* i */ scala.Double, t4: /* depth */ scala.Double) => visit(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[SearchFirstOptions2]
  }
}

