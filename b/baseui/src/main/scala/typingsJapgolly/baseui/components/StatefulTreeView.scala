package typingsJapgolly.baseui.components

import typingsJapgolly.baseui.treeViewTypesMod.TreeNodeData
import typingsJapgolly.baseui.treeViewTypesMod.TreeViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulTreeView {
  
  inline def apply(data: js.Array[TreeNodeData[Any]]): SharedBuilder_TreeViewProps379846013 = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_TreeViewProps379846013(js.Array(this.component, __props.asInstanceOf[TreeViewProps]))
  }
  
  @JSImport("baseui/tree-view", "StatefulTreeView")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TreeViewProps): SharedBuilder_TreeViewProps379846013 = new SharedBuilder_TreeViewProps379846013(js.Array(this.component, p.asInstanceOf[js.Any]))
}
