package typingsJapgolly.blueprintjsCore.treeNodeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsJapgolly.blueprintjsCore.propsMod.MaybeElement
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreeNodeProps[T] extends ITreeNode[T] {
  var children: js.UndefOr[Node] = js.undefined
  var contentRef: js.UndefOr[js.Function2[/* node */ TreeNode[T], /* element */ HTMLDivElement | Null, Unit]] = js.undefined
  var depth: Double
  var key: js.UndefOr[String | Double] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement], Unit]
  ] = js.undefined
  var onCollapse: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLSpanElement], Unit]
  ] = js.undefined
  var onContextMenu: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement], Unit]
  ] = js.undefined
  var onDoubleClick: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement], Unit]
  ] = js.undefined
  var onExpand: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLSpanElement], Unit]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement], Unit]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function2[/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement], Unit]
  ] = js.undefined
  var path: js.Array[Double]
}

object ITreeNodeProps {
  @scala.inline
  def apply[T](
    depth: Double,
    id: String | Double,
    label: String | Element,
    path: js.Array[Double],
    childNodes: js.Array[ITreeNode[T]] = null,
    children: VdomNode = null,
    className: String = null,
    contentRef: (/* node */ TreeNode[T], /* element */ HTMLDivElement | Null) => Callback = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hasCaret: js.UndefOr[Boolean] = js.undefined,
    icon: IconName | MaybeElement = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    key: String | Double = null,
    nodeData: T = null,
    onClick: (/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onCollapse: (/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLSpanElement]) => Callback = null,
    onContextMenu: (/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onDoubleClick: (/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onExpand: (/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLSpanElement]) => Callback = null,
    onMouseEnter: (/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onMouseLeave: (/* node */ TreeNode[T], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    secondaryLabel: String | MaybeElement = null
  ): ITreeNodeProps[T] = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentRef != null) __obj.updateDynamic("contentRef")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* element */ org.scalajs.dom.raw.HTMLDivElement | scala.Null) => contentRef(t0, t1).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCaret)) __obj.updateDynamic("hasCaret")(hasCaret.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodeData != null) __obj.updateDynamic("nodeData")(nodeData.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0, t1).runNow()))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLSpanElement]) => onCollapse(t0, t1).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onContextMenu(t0, t1).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDoubleClick(t0, t1).runNow()))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLSpanElement]) => onExpand(t0, t1).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseEnter(t0, t1).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.TreeNode[T], t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseLeave(t0, t1).runNow()))
    if (secondaryLabel != null) __obj.updateDynamic("secondaryLabel")(secondaryLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeNodeProps[T]]
  }
}

