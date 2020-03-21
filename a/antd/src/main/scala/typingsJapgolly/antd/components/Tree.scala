package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.AnonChecked
import typingsJapgolly.antd.treeMod.default
import typingsJapgolly.antd.treeTreeMod.AntTreeNodeProps
import typingsJapgolly.antd.treeTreeMod.AntdTreeNodeAttribute
import typingsJapgolly.antd.treeTreeMod.TreeNodeNormal
import typingsJapgolly.antd.treeTreeMod.TreeProps
import typingsJapgolly.rcTree.mod.CheckData
import typingsJapgolly.rcTree.mod.ExpandData
import typingsJapgolly.rcTree.mod.InternalTreeNodeProps
import typingsJapgolly.rcTree.mod.OnDragEndData
import typingsJapgolly.rcTree.mod.OnDragEnterData
import typingsJapgolly.rcTree.mod.OnDragLeaveData
import typingsJapgolly.rcTree.mod.OnDragOverData
import typingsJapgolly.rcTree.mod.OnDragStartData
import typingsJapgolly.rcTree.mod.OnDropData
import typingsJapgolly.rcTree.mod.OnMouseEnterData
import typingsJapgolly.rcTree.mod.OnMouseLeaveData
import typingsJapgolly.rcTree.mod.OnRightClickData
import typingsJapgolly.rcTree.mod.SelectData
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tree {
  def apply(
    autoExpandParent: js.UndefOr[Boolean] = js.undefined,
    blockNode: js.UndefOr[Boolean] = js.undefined,
    checkStrictly: js.UndefOr[Boolean] = js.undefined,
    checkable: js.UndefOr[Boolean] = js.undefined,
    checkedKeys: js.Array[String] | AnonChecked = null,
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
    filterTreeNode: Component[InternalTreeNodeProps with js.Object, js.Object] => CallbackTo[Boolean] = null,
    icon: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, Node]) | Node = null,
    loadData: Component[InternalTreeNodeProps with js.Object, js.Object] => CallbackTo[js.Promise[js.Any]] = null,
    loadedKeys: js.Array[String] = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onCheck: (/* checkedKeys */ js.Array[String], /* e */ CheckData) => Callback = null,
    onDragEnd: /* props */ OnDragEndData => Callback = null,
    onDragEnter: /* props */ OnDragEnterData => Callback = null,
    onDragLeave: /* props */ OnDragLeaveData => Callback = null,
    onDragOver: /* props */ OnDragOverData => Callback = null,
    onDragStart: /* props */ OnDragStartData => Callback = null,
    onDrop: /* props */ OnDropData => Callback = null,
    onExpand: (/* expandedKeys */ js.Array[String], /* e */ ExpandData) => Callback = null,
    onMouseEnter: /* props */ OnMouseEnterData => Callback = null,
    onMouseLeave: /* props */ OnMouseLeaveData => Callback = null,
    onRightClick: /* props */ OnRightClickData => Callback = null,
    onSelect: (/* selectedKeys */ js.Array[String], /* e */ SelectData) => Callback = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showLine: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    switcherIcon: VdomElement = null,
    treeData: js.Array[TreeNodeNormal] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TreeProps, default, Unit, TreeProps] = {
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
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys.asInstanceOf[js.Any])
    if (filterAntTreeNode != null) __obj.updateDynamic("filterAntTreeNode")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.antd.treeTreeMod.AntTreeNodeProps with js.Object, js.Object]) => filterAntTreeNode(t0).runNow()))
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.rcTree.mod.InternalTreeNodeProps with js.Object, js.Object]) => filterTreeNode(t0).runNow()))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.rcTree.mod.InternalTreeNodeProps with js.Object, js.Object]) => loadData(t0).runNow()))
    if (loadedKeys != null) __obj.updateDynamic("loadedKeys")(loadedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onCheck != null) __obj.updateDynamic("onCheck")(js.Any.fromFunction2((t0: /* checkedKeys */ js.Array[java.lang.String], t1: /* e */ typingsJapgolly.rcTree.mod.CheckData) => onCheck(t0, t1).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.rcTree.mod.OnDragEndData) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.rcTree.mod.OnDragEnterData) => onDragEnter(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.rcTree.mod.OnDragLeaveData) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.rcTree.mod.OnDragOverData) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.rcTree.mod.OnDragStartData) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.rcTree.mod.OnDropData) => onDrop(t0).runNow()))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2((t0: /* expandedKeys */ js.Array[java.lang.String], t1: /* e */ typingsJapgolly.rcTree.mod.ExpandData) => onExpand(t0, t1).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.rcTree.mod.OnMouseEnterData) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.rcTree.mod.OnMouseLeaveData) => onMouseLeave(t0).runNow()))
    if (onRightClick != null) __obj.updateDynamic("onRightClick")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.rcTree.mod.OnRightClickData) => onRightClick(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* selectedKeys */ js.Array[java.lang.String], t1: /* e */ typingsJapgolly.rcTree.mod.SelectData) => onSelect(t0, t1).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (switcherIcon != null) __obj.updateDynamic("switcherIcon")(switcherIcon.rawElement.asInstanceOf[js.Any])
    if (treeData != null) __obj.updateDynamic("treeData")(treeData.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.treeTreeMod.TreeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.treeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.treeTreeMod.TreeProps])(children: _*)
  }
  @JSImport("antd/lib/tree", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

