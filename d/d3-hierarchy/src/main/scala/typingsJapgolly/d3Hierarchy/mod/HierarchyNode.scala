package typingsJapgolly.d3Hierarchy.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyNode[Datum] extends js.Object {
  /**
    * An array of child nodes, if any; undefined for leaf nodes.
    */
  var children: js.UndefOr[js.Array[this.type]] = js.undefined
  /**
    * The associated data, as specified to the constructor.
    */
  var data: Datum
  /**
    * Zero for the root node, and increasing by one for each descendant generation.
    */
  val depth: Double
  /**
    * Zero for leaf nodes, and the greatest distance from any descendant leaf for internal nodes.
    */
  val height: Double
  /**
    * Optional node id string set by `StratifyOperator`, if hierarchical data was created from tabular data using stratify().
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The parent node, or null for the root node.
    */
  var parent: this.type | Null
  /**
    * Aggregated numeric value as calculated by `sum(value)` or `count()`, if previously invoked.
    */
  val value: js.UndefOr[Double] = js.undefined
  /**
    * Returns the array of ancestors nodes, starting with this node, then followed by each parent up to the root.
    */
  def ancestors(): js.Array[this.type]
  /**
    * Return a deep copy of the subtree starting at this node. The returned deep copy shares the same data, however.
    * The returned node is the root of a new tree; the returned node’s parent is always null and its depth is always zero.
    */
  def copy(): this.type
  /**
    * Computes the number of leaves under this node and assigns it to `node.value`, and similarly for every descendant of node.
    * If this node is a leaf, its count is one. Returns this node.
    */
  def count(): this.type
  /**
    * Returns the array of descendant nodes, starting with this node, then followed by each child in topological order.
    */
  def descendants(): js.Array[this.type]
  /**
    * Invokes the specified function for node and each descendant in breadth-first order,
    * such that a given node is only visited if all nodes of lesser depth have already been visited,
    * as well as all preceding nodes of the same depth.
    *
    * @param func The specified function is passed the current node.
    */
  def each(func: js.Function1[/* node */ this.type, Unit]): this.type
  /**
    * Invokes the specified function for node and each descendant in post-order traversal,
    * such that a given node is only visited after all of its descendants have already been visited.
    *
    * @param func The specified function is passed the current node.
    */
  def eachAfter(func: js.Function1[/* node */ this.type, Unit]): this.type
  /**
    * Invokes the specified function for node and each descendant in pre-order traversal,
    * such that a given node is only visited after all of its ancestors have already been visited.
    *
    * @param func The specified function is passed the current node.
    */
  def eachBefore(func: js.Function1[/* node */ this.type, Unit]): this.type
  /**
    * Returns the array of leaf nodes in traversal order; leaves are nodes with no children.
    */
  def leaves(): js.Array[this.type]
  /**
    * Returns an array of links for this node, where each link is an object that defines source and target properties.
    * The source of each link is the parent node, and the target is a child node.
    */
  def links(): js.Array[HierarchyLink[Datum]]
  /**
    * Returns the shortest path through the hierarchy from this node to the specified target node.
    * The path starts at this node, ascends to the least common ancestor of this node and the target node, and then descends to the target node.
    *
    * @param target The target node.
    */
  def path(target: this.type): js.Array[this.type]
  /**
    * Sorts the children of this node, if any, and each of this node’s descendants’ children,
    * in pre-order traversal using the specified compare function, and returns this node.
    *
    * @param compare The compare function is passed two nodes a and b to compare.
    * If a should be before b, the function must return a value less than zero;
    * if b should be before a, the function must return a value greater than zero;
    * otherwise, the relative order of a and b are not specified. See `array.sort` for more.
    */
  def sort(compare: js.Function2[/* a */ this.type, /* b */ this.type, Double]): this.type
  /**
    * Evaluates the specified value function for this node and each descendant in post-order traversal, and returns this node.
    * The `node.value` property of each node is set to the numeric value returned by the specified function plus the combined value of all descendants.
    *
    * @param value The value function is passed the node’s data, and must return a non-negative number.
    */
  def sum(value: js.Function1[/* d */ Datum, Double]): this.type
}

object HierarchyNode {
  @scala.inline
  def apply[Datum](
    ancestors: CallbackTo[js.Array[HierarchyNode[Datum]]],
    copy: CallbackTo[HierarchyNode[Datum]],
    count: CallbackTo[HierarchyNode[Datum]],
    data: Datum,
    depth: Double,
    descendants: CallbackTo[js.Array[HierarchyNode[Datum]]],
    each: js.Function1[HierarchyNode[Datum], Unit] => CallbackTo[HierarchyNode[Datum]],
    eachAfter: js.Function1[HierarchyNode[Datum], Unit] => CallbackTo[HierarchyNode[Datum]],
    eachBefore: js.Function1[HierarchyNode[Datum], Unit] => CallbackTo[HierarchyNode[Datum]],
    height: Double,
    leaves: CallbackTo[js.Array[HierarchyNode[Datum]]],
    links: CallbackTo[js.Array[HierarchyLink[Datum]]],
    path: HierarchyNode[Datum] => CallbackTo[js.Array[HierarchyNode[Datum]]],
    sort: js.Function2[HierarchyNode[Datum], HierarchyNode[Datum], Double] => CallbackTo[HierarchyNode[Datum]],
    sum: js.Function1[/* d */ Datum, Double] => CallbackTo[HierarchyNode[Datum]],
    children: js.Array[HierarchyNode[Datum]] = null,
    id: String = null,
    parent: HierarchyNode[Datum] = null,
    value: Int | Double = null
  ): HierarchyNode[Datum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.updateDynamic("ancestors")(ancestors.toJsFn)
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("descendants")(descendants.toJsFn)
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.d3Hierarchy.mod.HierarchyNode[Datum], scala.Unit]) => each(t0).runNow()))
    __obj.updateDynamic("eachAfter")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.d3Hierarchy.mod.HierarchyNode[Datum], scala.Unit]) => eachAfter(t0).runNow()))
    __obj.updateDynamic("eachBefore")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.d3Hierarchy.mod.HierarchyNode[Datum], scala.Unit]) => eachBefore(t0).runNow()))
    __obj.updateDynamic("leaves")(leaves.toJsFn)
    __obj.updateDynamic("links")(links.toJsFn)
    __obj.updateDynamic("path")(js.Any.fromFunction1((t0: typingsJapgolly.d3Hierarchy.mod.HierarchyNode[Datum]) => path(t0).runNow()))
    __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: js.Function2[
  typingsJapgolly.d3Hierarchy.mod.HierarchyNode[Datum], 
  typingsJapgolly.d3Hierarchy.mod.HierarchyNode[Datum], 
  scala.Double]) => sort(t0).runNow()))
    __obj.updateDynamic("sum")(js.Any.fromFunction1((t0: js.Function1[/* d */ Datum, scala.Double]) => sum(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyNode[Datum]]
  }
}

