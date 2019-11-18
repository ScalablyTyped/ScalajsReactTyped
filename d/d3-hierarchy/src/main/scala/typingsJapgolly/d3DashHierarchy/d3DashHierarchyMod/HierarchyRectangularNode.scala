package typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyRectangularNode[Datum] extends HierarchyNode[Datum] {
  /**
    * The left edge of the rectangle.
    */
  var x0: Double
  /**
    * The right edge of the rectangle.
    */
  var x1: Double
  /**
    * The top edge of the rectangle
    */
  var y0: Double
  /**
    * The bottom edge of the rectangle.
    */
  var y1: Double
}

object HierarchyRectangularNode {
  @scala.inline
  def apply[Datum](
    ancestors: CallbackTo[js.Array[HierarchyRectangularNode[Datum]]],
    copy: CallbackTo[HierarchyRectangularNode[Datum]],
    count: CallbackTo[HierarchyRectangularNode[Datum]],
    data: Datum,
    depth: Double,
    descendants: CallbackTo[js.Array[HierarchyRectangularNode[Datum]]],
    each: js.Function1[HierarchyRectangularNode[Datum], Unit] => CallbackTo[HierarchyRectangularNode[Datum]],
    eachAfter: js.Function1[HierarchyRectangularNode[Datum], Unit] => CallbackTo[HierarchyRectangularNode[Datum]],
    eachBefore: js.Function1[HierarchyRectangularNode[Datum], Unit] => CallbackTo[HierarchyRectangularNode[Datum]],
    height: Double,
    leaves: CallbackTo[js.Array[HierarchyRectangularNode[Datum]]],
    links: CallbackTo[js.Array[HierarchyLink[Datum]]],
    path: HierarchyRectangularNode[Datum] => CallbackTo[js.Array[HierarchyRectangularNode[Datum]]],
    sort: js.Function2[HierarchyRectangularNode[Datum], HierarchyRectangularNode[Datum], Double] => CallbackTo[HierarchyRectangularNode[Datum]],
    sum: js.Function1[Datum, Double] => CallbackTo[HierarchyRectangularNode[Datum]],
    x0: Double,
    x1: Double,
    y0: Double,
    y1: Double,
    children: js.Array[HierarchyRectangularNode[Datum]] = null,
    id: String = null,
    parent: HierarchyRectangularNode[Datum] = null,
    value: Int | Double = null
  ): HierarchyRectangularNode[Datum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.updateDynamic("ancestors")(ancestors.toJsFn)
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("descendants")(descendants.toJsFn)
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: js.Function1[
  typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod.HierarchyRectangularNode[Datum], 
  scala.Unit]) => each(t0).runNow()))
    __obj.updateDynamic("eachAfter")(js.Any.fromFunction1((t0: js.Function1[
  typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod.HierarchyRectangularNode[Datum], 
  scala.Unit]) => eachAfter(t0).runNow()))
    __obj.updateDynamic("eachBefore")(js.Any.fromFunction1((t0: js.Function1[
  typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod.HierarchyRectangularNode[Datum], 
  scala.Unit]) => eachBefore(t0).runNow()))
    __obj.updateDynamic("leaves")(leaves.toJsFn)
    __obj.updateDynamic("links")(links.toJsFn)
    __obj.updateDynamic("path")(js.Any.fromFunction1((t0: typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod.HierarchyRectangularNode[Datum]) => path(t0).runNow()))
    __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: js.Function2[
  typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod.HierarchyRectangularNode[Datum], 
  typingsJapgolly.d3DashHierarchy.d3DashHierarchyMod.HierarchyRectangularNode[Datum], 
  scala.Double]) => sort(t0).runNow()))
    __obj.updateDynamic("sum")(js.Any.fromFunction1((t0: js.Function1[Datum, scala.Double]) => sum(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyRectangularNode[Datum]]
  }
}

