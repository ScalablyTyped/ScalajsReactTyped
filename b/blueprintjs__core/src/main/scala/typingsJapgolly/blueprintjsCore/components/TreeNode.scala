package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsJapgolly.blueprintjsCore.propsMod.MaybeElement
import typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNode
import typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNodeProps
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeNode {
  def apply[T](
    depth: Double,
    id: String | Double,
    label: String | Element,
    path: js.Array[Double],
    childNodes: js.Array[ITreeNode[T]] = null,
    className: String = null,
    contentRef: (/* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], /* element */ HTMLDivElement | Null) => Callback = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hasCaret: js.UndefOr[Boolean] = js.undefined,
    icon: IconName | MaybeElement = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    nodeData: T = null,
    onClick: (/* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onCollapse: (/* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLSpanElement]) => Callback = null,
    onContextMenu: (/* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onDoubleClick: (/* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onExpand: (/* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLSpanElement]) => Callback = null,
    onMouseEnter: (/* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onMouseLeave: (/* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    secondaryLabel: String | MaybeElement = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ITreeNodeProps[T], 
    typingsJapgolly.blueprintjsCore.mod.TreeNode[T], 
    Unit, 
    ITreeNodeProps[T]
  ] = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
      if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentRef != null) __obj.updateDynamic("contentRef")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* element */ org.scalajs.dom.raw.HTMLDivElement | scala.Null) => contentRef(t0, t1).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCaret)) __obj.updateDynamic("hasCaret")(hasCaret.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (nodeData != null) __obj.updateDynamic("nodeData")(nodeData.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0, t1).runNow()))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLSpanElement]) => onCollapse(t0, t1).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onContextMenu(t0, t1).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDoubleClick(t0, t1).runNow()))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLSpanElement]) => onExpand(t0, t1).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseEnter(t0, t1).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseLeave(t0, t1).runNow()))
    if (secondaryLabel != null) __obj.updateDynamic("secondaryLabel")(secondaryLabel.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNodeProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.TreeNode[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNodeProps[T]])(children: _*)
  }
  @JSImport("@blueprintjs/core", "TreeNode")
  @js.native
  object componentImport extends js.Object
  
}

