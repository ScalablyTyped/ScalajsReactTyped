package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cytoscape.mod.SearchFirstOptions1
  - typingsJapgolly.cytoscape.mod.SearchFirstOptions2
*/
trait SearchFirstOptions extends js.Object

object SearchFirstOptions {
  @scala.inline
  def SearchFirstOptions1(
    root: Selector | CollectionArgument,
    directed: js.UndefOr[Boolean] = js.undefined,
    visit: (/* v */ NodeSingular, /* e */ EdgeSingular, /* u */ NodeSingular, /* i */ Double, /* depth */ Double) => CallbackTo[Boolean | Unit] = null
  ): SearchFirstOptions = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed.asInstanceOf[js.Any])
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction5((t0: /* v */ typingsJapgolly.cytoscape.mod.NodeSingular, t1: /* e */ typingsJapgolly.cytoscape.mod.EdgeSingular, t2: /* u */ typingsJapgolly.cytoscape.mod.NodeSingular, t3: /* i */ scala.Double, t4: /* depth */ scala.Double) => visit(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[SearchFirstOptions]
  }
  @scala.inline
  def SearchFirstOptions2(
    roots: Selector | CollectionArgument,
    directed: js.UndefOr[Boolean] = js.undefined,
    visit: (/* v */ NodeSingular, /* e */ EdgeSingular, /* u */ NodeSingular, /* i */ Double, /* depth */ Double) => CallbackTo[Boolean | Unit] = null
  ): SearchFirstOptions = {
    val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed.asInstanceOf[js.Any])
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction5((t0: /* v */ typingsJapgolly.cytoscape.mod.NodeSingular, t1: /* e */ typingsJapgolly.cytoscape.mod.EdgeSingular, t2: /* u */ typingsJapgolly.cytoscape.mod.NodeSingular, t3: /* i */ scala.Double, t4: /* depth */ scala.Double) => visit(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[SearchFirstOptions]
  }
}

