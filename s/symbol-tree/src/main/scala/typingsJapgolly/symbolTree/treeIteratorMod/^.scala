package typingsJapgolly.symbolTree.treeIteratorMod

import typingsJapgolly.symbolTree.symbolTreeNumbers.`1`
import typingsJapgolly.symbolTree.symbolTreeNumbers.`2`
import typingsJapgolly.symbolTree.symbolTreeNumbers.`3`
import typingsJapgolly.symbolTree.symbolTreeNumbers.`4`
import typingsJapgolly.symbolTree.symbolTreeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("symbol-tree/lib/TreeIterator", JSImport.Namespace)
@js.native
class ^[T /* <: js.Object */] protected () extends TreeIterator[T] {
  def this(
    tree: typingsJapgolly.symbolTree.symbolTreeMod.^[_],
    root: T,
    firstResult: T,
    iterateFunction: IterateFunction
  ) = this()
}

@JSImport("symbol-tree/lib/TreeIterator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Iterate all tree-inclusive following nodes. */
  val FOLLOWING: `5` = js.native
  /** Iterate next sibling nodes. */
  val NEXT: `2` = js.native
  /** Iterate ancestor nodes. */
  val PARENT: `3` = js.native
  /** Iterate all tree-inclusive preceding nodes. */
  val PRECEDING: `4` = js.native
  /** Iterate previous sibling nodes. */
  val PREV: `1` = js.native
}

