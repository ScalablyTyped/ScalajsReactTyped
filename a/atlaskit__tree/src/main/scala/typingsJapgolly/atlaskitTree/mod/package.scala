package typingsJapgolly.atlaskitTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FlattenedTree = js.Array[typingsJapgolly.atlaskitTree.mod.FlattenedItem]
  type ItemId = js.Any
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type Path = js.Array[scala.Double]
  type Tree = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.atlaskitTree.mod.TreeProps with js.Object, js.Object]
  type TreeDraggableStyle = typingsJapgolly.reactBeautifulDnd.mod.NotDraggingStyle | typingsJapgolly.atlaskitTree.mod.TreeDraggingStyle
  type TreeItemData = js.Any
}
