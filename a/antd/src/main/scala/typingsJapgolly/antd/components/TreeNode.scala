package typingsJapgolly.antd.components

import typingsJapgolly.rcTreeSelect.esInterfaceMod.Key
import typingsJapgolly.rcTreeSelect.esTreeNodeMod.TreeNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeNode {
  
  inline def apply(value: Key): SharedBuilder_TreeNodeProps_408501178 = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new SharedBuilder_TreeNodeProps_408501178(js.Array(this.component, __props.asInstanceOf[TreeNodeProps]))
  }
  
  @JSImport("antd/lib/tree-select", "TreeNode")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TreeNodeProps): SharedBuilder_TreeNodeProps_408501178 = new SharedBuilder_TreeNodeProps_408501178(js.Array(this.component, p.asInstanceOf[js.Any]))
}
