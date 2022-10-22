package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.ITreeNodeProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNodeInfo
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeNode {
  
  inline def apply[T](depth: Double, id: String | Double, label: String | Element, path: js.Array[Double]): Builder[T] = {
    val __props = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ITreeNodeProps[T]]))
  }
  
  @JSImport("@blueprintjs/core", "TreeNode")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.TreeNode[T]] {
    
    inline def childNodes(value: js.Array[TreeNodeInfo[T]]): this.type = set("childNodes", value.asInstanceOf[js.Any])
    
    inline def childNodesVarargs(value: TreeNodeInfo[T]*): this.type = set("childNodes", js.Array(value*))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentRef(
      value: (/* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], /* element */ HTMLDivElement | Null) => Callback
    ): this.type = set("contentRef", js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], t1: /* element */ HTMLDivElement | Null) => (value(t0, t1)).runNow()))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def hasCaret(value: Boolean): this.type = set("hasCaret", value.asInstanceOf[js.Any])
    
    inline def icon(value: BlueprintIcons16Id | MaybeElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def isExpanded(value: Boolean): this.type = set("isExpanded", value.asInstanceOf[js.Any])
    
    inline def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    
    inline def nodeData(value: T): this.type = set("nodeData", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: (/* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], t1: /* e */ ReactMouseEventFrom[HTMLDivElement]) => (value(t0, t1)).runNow()))
    
    inline def onCollapse(
      value: (/* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLSpanElement]) => Callback
    ): this.type = set("onCollapse", js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], t1: /* e */ ReactMouseEventFrom[HTMLSpanElement]) => (value(t0, t1)).runNow()))
    
    inline def onContextMenu(
      value: (/* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback
    ): this.type = set("onContextMenu", js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], t1: /* e */ ReactMouseEventFrom[HTMLDivElement]) => (value(t0, t1)).runNow()))
    
    inline def onDoubleClick(
      value: (/* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback
    ): this.type = set("onDoubleClick", js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], t1: /* e */ ReactMouseEventFrom[HTMLDivElement]) => (value(t0, t1)).runNow()))
    
    inline def onExpand(
      value: (/* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLSpanElement]) => Callback
    ): this.type = set("onExpand", js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], t1: /* e */ ReactMouseEventFrom[HTMLSpanElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(
      value: (/* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback
    ): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], t1: /* e */ ReactMouseEventFrom[HTMLDivElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(
      value: (/* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback
    ): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNode[T], t1: /* e */ ReactMouseEventFrom[HTMLDivElement]) => (value(t0, t1)).runNow()))
    
    inline def secondaryLabel(value: String | MaybeElement): this.type = set("secondaryLabel", value.asInstanceOf[js.Any])
    
    inline def secondaryLabelNull: this.type = set("secondaryLabel", null)
    
    inline def secondaryLabelVdomElement(value: VdomElement): this.type = set("secondaryLabel", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: ITreeNodeProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
