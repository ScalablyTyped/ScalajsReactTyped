package typingsJapgolly.blueprintjsCore.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "TreeNode")
@js.native
class TreeNode[T] ()
  extends typingsJapgolly.blueprintjsCore.componentsMod.TreeNode[T]

/* static members */
@JSImport("@blueprintjs/core", "TreeNode")
@js.native
object TreeNode extends js.Object {
  var displayName: String = js.native
  def ofType[T](): Instantiable1[
    /* props */ ITreeNodeProps[T], 
    typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T]
  ] = js.native
}

