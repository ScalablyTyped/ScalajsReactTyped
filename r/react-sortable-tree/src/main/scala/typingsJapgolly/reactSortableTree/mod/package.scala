package typingsJapgolly.reactSortableTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetTreeItemChildrenFn = js.Function1[/* data */ typingsJapgolly.reactSortableTree.mod.GetTreeItemChildren, scala.Unit]
  type NodeRenderer = typingsJapgolly.react.mod.ComponentType[typingsJapgolly.reactSortableTree.mod.NodeRendererProps]
  type NumberOrStringArray = js.Array[java.lang.String | scala.Double]
  type PlaceholderRenderer = typingsJapgolly.react.mod.ComponentType[typingsJapgolly.reactSortableTree.mod.PlaceholderRendererProps]
  type TreeRenderer = typingsJapgolly.react.mod.ComponentType[typingsJapgolly.reactSortableTree.mod.TreeRendererProps]
}
