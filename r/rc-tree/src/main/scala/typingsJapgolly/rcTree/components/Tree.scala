package typingsJapgolly.rcTree.components

import typingsJapgolly.rcTree.esInterfaceMod.BasicDataNode
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esTreeMod.TreeProps
import typingsJapgolly.rcTree.esTreeMod.default
import typingsJapgolly.rcTree.esTreeNodeMod.TreeNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tree {
  
  inline def apply[TreeDataType /* <: DataNode | BasicDataNode */](prefixCls: String): SharedBuilder_TreeProps978924493[default[TreeDataType], TreeDataType] = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new SharedBuilder_TreeProps978924493[default[TreeDataType], TreeDataType](js.Array(this.component, __props.asInstanceOf[TreeProps[TreeDataType]]))
  }
  
  object TreeNode {
    
    @JSImport("rc-tree/es/Tree", "default.TreeNode")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: TreeNode.type): SharedBuilder_TreeNodeProps_1074250916 = new SharedBuilder_TreeNodeProps_1074250916(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TreeNodeProps[DataNode]): SharedBuilder_TreeNodeProps_1074250916 = new SharedBuilder_TreeNodeProps_1074250916(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-tree/es/Tree", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps[TreeDataType /* <: DataNode | BasicDataNode */](p: TreeProps[TreeDataType]): SharedBuilder_TreeProps978924493[default[TreeDataType], TreeDataType] = new SharedBuilder_TreeProps978924493[default[TreeDataType], TreeDataType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
