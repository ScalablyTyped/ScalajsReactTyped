package typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyCircularNode[Datum] extends HierarchyNode[Datum] {
  /**
    * The radius of the circle.
    */
  var r: Double
  /**
    * The x-coordinate of the circle’s center.
    */
  var x: Double
  /**
    * The y-coordinate of the circle’s center.
    */
  var y: Double
}

object HierarchyCircularNode {
  @scala.inline
  def apply[Datum](
    ancestors: CallbackTo[js.Array[HierarchyCircularNode[Datum]]],
    copy: CallbackTo[HierarchyCircularNode[Datum]],
    count: CallbackTo[HierarchyCircularNode[Datum]],
    data: Datum,
    depth: Double,
    descendants: CallbackTo[js.Array[HierarchyCircularNode[Datum]]],
    each: js.Function1[HierarchyCircularNode[Datum], Unit] => CallbackTo[HierarchyCircularNode[Datum]],
    eachAfter: js.Function1[HierarchyCircularNode[Datum], Unit] => CallbackTo[HierarchyCircularNode[Datum]],
    eachBefore: js.Function1[HierarchyCircularNode[Datum], Unit] => CallbackTo[HierarchyCircularNode[Datum]],
    height: Double,
    leaves: CallbackTo[js.Array[HierarchyCircularNode[Datum]]],
    links: CallbackTo[js.Array[HierarchyLink[Datum]]],
    path: HierarchyCircularNode[Datum] => CallbackTo[js.Array[HierarchyCircularNode[Datum]]],
    r: Double,
    sort: js.Function2[HierarchyCircularNode[Datum], HierarchyCircularNode[Datum], Double] => CallbackTo[HierarchyCircularNode[Datum]],
    sum: js.Function1[Datum, Double] => CallbackTo[HierarchyCircularNode[Datum]],
    x: Double,
    y: Double,
    children: js.Array[HierarchyCircularNode[Datum]] = null,
    id: String = null,
    parent: HierarchyCircularNode[Datum] = null,
    value: Int | Double = null
  ): HierarchyCircularNode[Datum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("ancestors")(ancestors.toJsFn)
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("descendants")(descendants.toJsFn)
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: js.Function1[
  typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod.HierarchyCircularNode[Datum], 
  scala.Unit]) => each(t0).runNow()))
    __obj.updateDynamic("eachAfter")(js.Any.fromFunction1((t0: js.Function1[
  typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod.HierarchyCircularNode[Datum], 
  scala.Unit]) => eachAfter(t0).runNow()))
    __obj.updateDynamic("eachBefore")(js.Any.fromFunction1((t0: js.Function1[
  typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod.HierarchyCircularNode[Datum], 
  scala.Unit]) => eachBefore(t0).runNow()))
    __obj.updateDynamic("leaves")(leaves.toJsFn)
    __obj.updateDynamic("links")(links.toJsFn)
    __obj.updateDynamic("path")(js.Any.fromFunction1((t0: typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod.HierarchyCircularNode[Datum]) => path(t0).runNow()))
    __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: js.Function2[
  typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod.HierarchyCircularNode[Datum], 
  typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod.HierarchyCircularNode[Datum], 
  scala.Double]) => sort(t0).runNow()))
    __obj.updateDynamic("sum")(js.Any.fromFunction1((t0: js.Function1[Datum, scala.Double]) => sum(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyCircularNode[Datum]]
  }
}

