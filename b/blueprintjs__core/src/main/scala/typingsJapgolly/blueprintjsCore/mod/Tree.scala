package typingsJapgolly.blueprintjsCore.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.blueprintjsCore.treeMod.ITreeProps
import typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "Tree")
@js.native
class Tree[T] ()
  extends typingsJapgolly.blueprintjsCore.componentsMod.Tree[T]

/* static members */
@JSImport("@blueprintjs/core", "Tree")
@js.native
object Tree extends js.Object {
  var displayName: String = js.native
  def nodeFromPath(path: js.Array[Double], treeNodes: js.Array[ITreeNode[js.Object]]): ITreeNode[js.Object] = js.native
  def ofType[T](): Instantiable1[/* props */ ITreeProps[T], typingsJapgolly.blueprintjsCore.treeMod.Tree[T]] = js.native
}

