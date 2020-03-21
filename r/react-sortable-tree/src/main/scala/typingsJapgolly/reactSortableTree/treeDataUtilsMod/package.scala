package typingsJapgolly.reactSortableTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeDataUtilsMod {
  type GetNodeKeyFunction = js.Function1[
    /* data */ typingsJapgolly.reactSortableTree.mod.TreeIndex with typingsJapgolly.reactSortableTree.mod.TreeNode, 
    java.lang.String | scala.Double
  ]
}
