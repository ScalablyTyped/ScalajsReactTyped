package typingsJapgolly.antd.libTreeTreeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.Anon_Checked
import typingsJapgolly.antd.Anon_EventLoad
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeProps extends js.Object {
  /** 是否自动展开父节点 */
  var autoExpandParent: js.UndefOr[Boolean] = js.undefined
  var blockNode: js.UndefOr[Boolean] = js.undefined
  /** checkable状态下节点选择完全受控（父子节点选中状态不再关联） */
  var checkStrictly: js.UndefOr[Boolean] = js.undefined
  /** 是否支持选中 */
  var checkable: js.UndefOr[Boolean] = js.undefined
  /** （受控）选中复选框的树节点 */
  var checkedKeys: js.UndefOr[js.Array[String] | Anon_Checked] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /** 默认选中复选框的树节点 */
  var defaultCheckedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /** 默认展开所有树节点 */
  var defaultExpandAll: js.UndefOr[Boolean] = js.undefined
  /** 默认展开对应树节点 */
  var defaultExpandParent: js.UndefOr[Boolean] = js.undefined
  /** 默认展开指定的树节点 */
  var defaultExpandedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /** 默认选中的树节点 */
  var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /** 是否禁用树 */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** 设置节点可拖拽（IE>8） */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /** （受控）展开指定的树节点 */
  var expandedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /** filter some AntTreeNodes as you need. it should return true */
  var filterAntTreeNode: js.UndefOr[js.Function1[Component[AntTreeNodeProps with js.Object, js.Object], Boolean]] = js.undefined
  var filterTreeNode: js.UndefOr[js.Function1[Component[AntTreeNodeProps with js.Object, js.Object], Boolean]] = js.undefined
  var icon: js.UndefOr[(js.Function1[/* nodeProps */ AntdTreeNodeAttribute, Node]) | Node] = js.undefined
  /** 异步加载数据 */
  var loadData: js.UndefOr[
    js.Function1[Component[AntTreeNodeProps with js.Object, js.Object], js.Thenable[Unit]]
  ] = js.undefined
  var loadedKeys: js.UndefOr[js.Array[String]] = js.undefined
  /** 是否支持多选 */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /** 点击复选框触发 */
  var onCheck: js.UndefOr[
    js.Function2[
      /* checkedKeys */ js.Array[String] | Anon_Checked, 
      /* e */ AntTreeNodeCheckedEvent, 
      Unit
    ]
  ] = js.undefined
  /** 单击树节点触发 */
  var onClick: js.UndefOr[
    js.Function2[
      /* e */ ReactMouseEventFrom[HTMLElement], 
      Component[AntTreeNodeProps with js.Object, js.Object], 
      Unit
    ]
  ] = js.undefined
  /** 双击树节点触发 */
  var onDoubleClick: js.UndefOr[
    js.Function2[
      /* e */ ReactMouseEventFrom[HTMLElement], 
      Component[AntTreeNodeProps with js.Object, js.Object], 
      Unit
    ]
  ] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, Unit]] = js.undefined
  var onDragEnter: js.UndefOr[js.Function1[/* options */ AntTreeNodeDragEnterEvent, Unit]] = js.undefined
  var onDragLeave: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, Unit]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, Unit]] = js.undefined
  var onDrop: js.UndefOr[js.Function1[/* options */ AntTreeNodeDropEvent, Unit]] = js.undefined
  /** 展开/收起节点时触发 */
  var onExpand: js.UndefOr[
    js.Function2[
      /* expandedKeys */ js.Array[String], 
      /* info */ AntTreeNodeExpandedEvent, 
      Unit | js.Thenable[Unit]
    ]
  ] = js.undefined
  var onLoad: js.UndefOr[js.Function2[/* loadedKeys */ js.Array[String], /* info */ Anon_EventLoad, Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, Unit]] = js.undefined
  /** 响应右键点击 */
  var onRightClick: js.UndefOr[js.Function1[/* options */ AntTreeNodeMouseEvent, Unit]] = js.undefined
  /** 点击树节点触发 */
  var onSelect: js.UndefOr[
    js.Function2[/* selectedKeys */ js.Array[String], /* e */ AntTreeNodeSelectedEvent, Unit]
  ] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  /** （受控）设置选中的树节点 */
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var showLine: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var switcherIcon: js.UndefOr[Element] = js.undefined
  var treeData: js.UndefOr[js.Array[TreeNodeNormal]] = js.undefined
}

object TreeProps {
  @scala.inline
  def apply(
    autoExpandParent: js.UndefOr[Boolean] = js.undefined,
    blockNode: js.UndefOr[Boolean] = js.undefined,
    checkStrictly: js.UndefOr[Boolean] = js.undefined,
    checkable: js.UndefOr[Boolean] = js.undefined,
    checkedKeys: js.Array[String] | Anon_Checked = null,
    children: VdomNode = null,
    className: String = null,
    defaultCheckedKeys: js.Array[String] = null,
    defaultExpandAll: js.UndefOr[Boolean] = js.undefined,
    defaultExpandParent: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    expandedKeys: js.Array[String] = null,
    filterAntTreeNode: Component[AntTreeNodeProps with js.Object, js.Object] => CallbackTo[Boolean] = null,
    filterTreeNode: Component[AntTreeNodeProps with js.Object, js.Object] => CallbackTo[Boolean] = null,
    icon: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, Node]) | Node = null,
    loadData: Component[AntTreeNodeProps with js.Object, js.Object] => CallbackTo[js.Thenable[Unit]] = null,
    loadedKeys: js.Array[String] = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onCheck: (/* checkedKeys */ js.Array[String] | Anon_Checked, /* e */ AntTreeNodeCheckedEvent) => Callback = null,
    onClick: (/* e */ ReactMouseEventFrom[HTMLElement], Component[AntTreeNodeProps with js.Object, js.Object]) => Callback = null,
    onDoubleClick: (/* e */ ReactMouseEventFrom[HTMLElement], Component[AntTreeNodeProps with js.Object, js.Object]) => Callback = null,
    onDragEnd: /* options */ AntTreeNodeMouseEvent => Callback = null,
    onDragEnter: /* options */ AntTreeNodeDragEnterEvent => Callback = null,
    onDragLeave: /* options */ AntTreeNodeMouseEvent => Callback = null,
    onDragOver: /* options */ AntTreeNodeMouseEvent => Callback = null,
    onDragStart: /* options */ AntTreeNodeMouseEvent => Callback = null,
    onDrop: /* options */ AntTreeNodeDropEvent => Callback = null,
    onExpand: (/* expandedKeys */ js.Array[String], /* info */ AntTreeNodeExpandedEvent) => CallbackTo[Unit | js.Thenable[Unit]] = null,
    onLoad: (/* loadedKeys */ js.Array[String], /* info */ Anon_EventLoad) => Callback = null,
    onMouseEnter: /* options */ AntTreeNodeMouseEvent => Callback = null,
    onMouseLeave: /* options */ AntTreeNodeMouseEvent => Callback = null,
    onRightClick: /* options */ AntTreeNodeMouseEvent => Callback = null,
    onSelect: (/* selectedKeys */ js.Array[String], /* e */ AntTreeNodeSelectedEvent) => Callback = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showLine: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    switcherIcon: VdomElement = null,
    treeData: js.Array[TreeNodeNormal] = null
  ): TreeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpandParent)) __obj.updateDynamic("autoExpandParent")(autoExpandParent.asInstanceOf[js.Any])
    if (!js.isUndefined(blockNode)) __obj.updateDynamic("blockNode")(blockNode.asInstanceOf[js.Any])
    if (!js.isUndefined(checkStrictly)) __obj.updateDynamic("checkStrictly")(checkStrictly.asInstanceOf[js.Any])
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    if (checkedKeys != null) __obj.updateDynamic("checkedKeys")(checkedKeys.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultCheckedKeys != null) __obj.updateDynamic("defaultCheckedKeys")(defaultCheckedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAll)) __obj.updateDynamic("defaultExpandAll")(defaultExpandAll.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandParent)) __obj.updateDynamic("defaultExpandParent")(defaultExpandParent.asInstanceOf[js.Any])
    if (defaultExpandedKeys != null) __obj.updateDynamic("defaultExpandedKeys")(defaultExpandedKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys.asInstanceOf[js.Any])
    if (filterAntTreeNode != null) __obj.updateDynamic("filterAntTreeNode")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeProps with js.Object, js.Object]) => filterAntTreeNode(t0).runNow()))
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeProps with js.Object, js.Object]) => filterTreeNode(t0).runNow()))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeProps with js.Object, js.Object]) => loadData(t0).runNow()))
    if (loadedKeys != null) __obj.updateDynamic("loadedKeys")(loadedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onCheck != null) __obj.updateDynamic("onCheck")(js.Any.fromFunction2((t0: /* checkedKeys */ js.Array[java.lang.String] | typingsJapgolly.antd.Anon_Checked, t1: /* e */ typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeCheckedEvent) => onCheck(t0, t1).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeProps with js.Object, js.Object]) => onClick(t0, t1).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeProps with js.Object, js.Object]) => onDoubleClick(t0, t1).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeMouseEvent) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeDragEnterEvent) => onDragEnter(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeMouseEvent) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeMouseEvent) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeMouseEvent) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeDropEvent) => onDrop(t0).runNow()))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2((t0: /* expandedKeys */ js.Array[java.lang.String], t1: /* info */ typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeExpandedEvent) => onExpand(t0, t1).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction2((t0: /* loadedKeys */ js.Array[java.lang.String], t1: /* info */ typingsJapgolly.antd.Anon_EventLoad) => onLoad(t0, t1).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeMouseEvent) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeMouseEvent) => onMouseLeave(t0).runNow()))
    if (onRightClick != null) __obj.updateDynamic("onRightClick")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeMouseEvent) => onRightClick(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* selectedKeys */ js.Array[java.lang.String], t1: /* e */ typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeSelectedEvent) => onSelect(t0, t1).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (switcherIcon != null) __obj.updateDynamic("switcherIcon")(switcherIcon.rawElement.asInstanceOf[js.Any])
    if (treeData != null) __obj.updateDynamic("treeData")(treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeProps]
  }
}

