package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.treeViewTypesMod.TreeLabelOverrides
import typingsJapgolly.baseui.treeViewTypesMod.TreeLabelProps
import typingsJapgolly.baseui.treeViewTypesMod.TreeNodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeLabel {
  
  inline def apply(
    hasChildren: Boolean,
    label: (js.Function1[/* node */ TreeNodeData[Any], Node]) | String,
    node: TreeNodeData[Any]
  ): Builder = {
    val __props = js.Dynamic.literal(hasChildren = hasChildren.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TreeLabelProps]))
  }
  
  @JSImport("baseui/tree-view", "TreeLabel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def isExpanded(value: Boolean): this.type = set("isExpanded", value.asInstanceOf[js.Any])
    
    inline def isFocusVisible(value: Boolean): this.type = set("isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    
    inline def overrides(value: TreeLabelOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TreeLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
