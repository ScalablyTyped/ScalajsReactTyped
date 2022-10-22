package typingsJapgolly.rcTree.components

import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esTreeNodeMod.TreeNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeNode {
  
  @JSImport("rc-tree", "TreeNode")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TreeNode.type): SharedBuilder_TreeNodeProps_1074250916 = new SharedBuilder_TreeNodeProps_1074250916(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TreeNodeProps[DataNode]): SharedBuilder_TreeNodeProps_1074250916 = new SharedBuilder_TreeNodeProps_1074250916(js.Array(this.component, p.asInstanceOf[js.Any]))
}
