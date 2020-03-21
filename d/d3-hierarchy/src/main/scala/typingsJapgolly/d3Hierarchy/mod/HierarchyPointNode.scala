package typingsJapgolly.d3Hierarchy.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyPointNode[Datum] extends HierarchyNode[Datum] {
  /**
    * The x-coordinate of the node.
    */
  var x: Double
  /**
    * The y-coordinate of the node.
    */
  var y: Double
}

object HierarchyPointNode {
  @scala.inline
  def apply[Datum](
    ancestors: CallbackTo[js.Array[HierarchyPointNode[Datum]]],
    copy: CallbackTo[HierarchyPointNode[Datum]],
    count: CallbackTo[HierarchyPointNode[Datum]],
    data: Datum,
    depth: Double,
    descendants: CallbackTo[js.Array[HierarchyPointNode[Datum]]],
    each: js.Function1[HierarchyPointNode[Datum], Unit] => CallbackTo[HierarchyPointNode[Datum]],
    eachAfter: js.Function1[HierarchyPointNode[Datum], Unit] => CallbackTo[HierarchyPointNode[Datum]],
    eachBefore: js.Function1[HierarchyPointNode[Datum], Unit] => CallbackTo[HierarchyPointNode[Datum]],
    height: Double,
    leaves: CallbackTo[js.Array[HierarchyPointNode[Datum]]],
    links: CallbackTo[js.Array[HierarchyLink[Datum]]],
    path: HierarchyPointNode[Datum] => CallbackTo[js.Array[HierarchyPointNode[Datum]]],
    sort: js.Function2[HierarchyPointNode[Datum], HierarchyPointNode[Datum], Double] => CallbackTo[HierarchyPointNode[Datum]],
    sum: js.Function1[Datum, Double] => CallbackTo[HierarchyPointNode[Datum]],
    x: Double,
    y: Double,
    children: js.Array[HierarchyPointNode[Datum]] = null,
    id: String = null,
    parent: HierarchyPointNode[Datum] = null,
    value: Int | Double = null
  ): HierarchyPointNode[Datum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("ancestors")(ancestors.toJsFn)
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("descendants")(descendants.toJsFn)
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.d3Hierarchy.mod.HierarchyPointNode[Datum], scala.Unit]) => each(t0).runNow()))
    __obj.updateDynamic("eachAfter")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.d3Hierarchy.mod.HierarchyPointNode[Datum], scala.Unit]) => eachAfter(t0).runNow()))
    __obj.updateDynamic("eachBefore")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.d3Hierarchy.mod.HierarchyPointNode[Datum], scala.Unit]) => eachBefore(t0).runNow()))
    __obj.updateDynamic("leaves")(leaves.toJsFn)
    __obj.updateDynamic("links")(links.toJsFn)
    __obj.updateDynamic("path")(js.Any.fromFunction1((t0: typingsJapgolly.d3Hierarchy.mod.HierarchyPointNode[Datum]) => path(t0).runNow()))
    __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: js.Function2[
  typingsJapgolly.d3Hierarchy.mod.HierarchyPointNode[Datum], 
  typingsJapgolly.d3Hierarchy.mod.HierarchyPointNode[Datum], 
  scala.Double]) => sort(t0).runNow()))
    __obj.updateDynamic("sum")(js.Any.fromFunction1((t0: js.Function1[Datum, scala.Double]) => sum(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyPointNode[Datum]]
  }
}

