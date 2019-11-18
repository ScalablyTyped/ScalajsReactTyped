package typingsJapgolly.d3DashQuadtree.d3DashQuadtreeMod

import typingsJapgolly.d3DashQuadtree.d3DashQuadtreeNumbers.`4`
import typingsJapgolly.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuadtreeInternalNode[T]
  extends Array[js.UndefOr[QuadtreeInternalNode[T] | QuadtreeLeaf[T]]] {
  /**
    * The length property may be used to distinguish leaf nodes from internal nodes: it is undefined for leaf nodes, and 4 for internal nodes.
    */
  @JSName("length")
  var length_QuadtreeInternalNode: `4` = js.native
}

