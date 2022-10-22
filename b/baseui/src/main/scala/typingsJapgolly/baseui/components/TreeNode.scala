package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.treeViewTreeNodeMod.default
import typingsJapgolly.baseui.treeViewTypesMod.TreeNodeData
import typingsJapgolly.baseui.treeViewTypesMod.TreeNodeId
import typingsJapgolly.baseui.treeViewTypesMod.TreeNodeProps
import typingsJapgolly.baseui.treeViewTypesMod.TreeViewOverrides
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeNode {
  
  inline def apply(
    addRef: (TreeNodeId, Ref[HTMLLIElement]) => Any,
    getId: TreeNodeData[Any] => TreeNodeId,
    node: TreeNodeData[Any],
    removeRef: TreeNodeId => Any
  ): Builder = {
    val __props = js.Dynamic.literal(addRef = js.Any.fromFunction2(addRef), getId = js.Any.fromFunction1(getId), node = node.asInstanceOf[js.Any], removeRef = js.Any.fromFunction1(removeRef))
    new Builder(js.Array(this.component, __props.asInstanceOf[TreeNodeProps]))
  }
  
  @JSImport("baseui/tree-view/tree-node", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def indentGuides(value: Boolean): this.type = set("indentGuides", value.asInstanceOf[js.Any])
    
    inline def isFocusVisible(value: Boolean): this.type = set("isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* event */ ReactEventFrom[Element] => Any): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    inline def onFocus(value: /* event */ ReactEventFrom[Element] => Any): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    inline def onKeyDown(value: (/* e */ KeyboardEvent, /* node */ TreeNodeData[Any]) => Any): this.type = set("onKeyDown", js.Any.fromFunction2(value))
    
    inline def onToggle(value: /* node */ TreeNodeData[Any] => Callback): this.type = set("onToggle", js.Any.fromFunction1((t0: /* node */ TreeNodeData[Any]) => value(t0).runNow()))
    
    inline def overrides(value: TreeViewOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    
    inline def selectedNodeId(value: TreeNodeId): this.type = set("selectedNodeId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TreeNodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
