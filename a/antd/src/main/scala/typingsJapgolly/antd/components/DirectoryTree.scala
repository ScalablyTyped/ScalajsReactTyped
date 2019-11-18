package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.Anon_Checked
import typingsJapgolly.antd.Anon_Event
import typingsJapgolly.antd.esTreeDirectoryTreeMod.DirectoryTreeProps
import typingsJapgolly.antd.esTreeDirectoryTreeMod.ExpandAction
import typingsJapgolly.antd.esTreeDirectoryTreeMod.default
import typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeCheckedEvent
import typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeDragEnterEvent
import typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeDropEvent
import typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeExpandedEvent
import typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeMouseEvent
import typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeProps
import typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeSelectedEvent
import typingsJapgolly.antd.esTreeTreeMod.AntdTreeNodeAttribute
import typingsJapgolly.antd.esTreeTreeMod.TreeNodeNormal
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DirectoryTree {
  def apply(
    autoExpandParent: js.UndefOr[Boolean] = js.undefined,
    blockNode: js.UndefOr[Boolean] = js.undefined,
    checkStrictly: js.UndefOr[Boolean] = js.undefined,
    checkable: js.UndefOr[Boolean] = js.undefined,
    checkedKeys: js.Array[String] | Anon_Checked = null,
    className: String = null,
    defaultCheckedKeys: js.Array[String] = null,
    defaultExpandAll: js.UndefOr[Boolean] = js.undefined,
    defaultExpandParent: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    expandAction: ExpandAction = null,
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
    onLoad: (/* loadedKeys */ js.Array[String], /* info */ Anon_Event) => Callback = null,
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
    treeData: js.Array[TreeNodeNormal] = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DirectoryTreeProps, default, Unit, DirectoryTreeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoExpandParent)) __obj.updateDynamic("autoExpandParent")(autoExpandParent.asInstanceOf[js.Any])
    if (!js.isUndefined(blockNode)) __obj.updateDynamic("blockNode")(blockNode.asInstanceOf[js.Any])
    if (!js.isUndefined(checkStrictly)) __obj.updateDynamic("checkStrictly")(checkStrictly.asInstanceOf[js.Any])
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    if (checkedKeys != null) __obj.updateDynamic("checkedKeys")(checkedKeys.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultCheckedKeys != null) __obj.updateDynamic("defaultCheckedKeys")(defaultCheckedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAll)) __obj.updateDynamic("defaultExpandAll")(defaultExpandAll.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandParent)) __obj.updateDynamic("defaultExpandParent")(defaultExpandParent.asInstanceOf[js.Any])
    if (defaultExpandedKeys != null) __obj.updateDynamic("defaultExpandedKeys")(defaultExpandedKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (expandAction != null) __obj.updateDynamic("expandAction")(expandAction.asInstanceOf[js.Any])
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys.asInstanceOf[js.Any])
    if (filterAntTreeNode != null) __obj.updateDynamic("filterAntTreeNode")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeProps with js.Object, js.Object]) => filterAntTreeNode(t0).runNow()))
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeProps with js.Object, js.Object]) => filterTreeNode(t0).runNow()))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeProps with js.Object, js.Object]) => loadData(t0).runNow()))
    if (loadedKeys != null) __obj.updateDynamic("loadedKeys")(loadedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onCheck != null) __obj.updateDynamic("onCheck")(js.Any.fromFunction2((t0: /* checkedKeys */ js.Array[java.lang.String] | typingsJapgolly.antd.Anon_Checked, t1: /* e */ typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeCheckedEvent) => onCheck(t0, t1).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeProps with js.Object, js.Object]) => onClick(t0, t1).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeProps with js.Object, js.Object]) => onDoubleClick(t0, t1).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeMouseEvent) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeDragEnterEvent) => onDragEnter(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeMouseEvent) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeMouseEvent) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeMouseEvent) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeDropEvent) => onDrop(t0).runNow()))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2((t0: /* expandedKeys */ js.Array[java.lang.String], t1: /* info */ typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeExpandedEvent) => onExpand(t0, t1).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction2((t0: /* loadedKeys */ js.Array[java.lang.String], t1: /* info */ typingsJapgolly.antd.Anon_Event) => onLoad(t0, t1).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeMouseEvent) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeMouseEvent) => onMouseLeave(t0).runNow()))
    if (onRightClick != null) __obj.updateDynamic("onRightClick")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeMouseEvent) => onRightClick(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* selectedKeys */ js.Array[java.lang.String], t1: /* e */ typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeSelectedEvent) => onSelect(t0, t1).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (switcherIcon != null) __obj.updateDynamic("switcherIcon")(switcherIcon.rawElement.asInstanceOf[js.Any])
    if (treeData != null) __obj.updateDynamic("treeData")(treeData.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.esTreeDirectoryTreeMod.DirectoryTreeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.esTreeDirectoryTreeMod.default](js.constructorOf[typingsJapgolly.antd.esTreeDirectoryTreeMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.antd.esTreeDirectoryTreeMod.DirectoryTreeProps])(children: _*)
  }
}

