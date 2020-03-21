package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonNodeOriginalEvent
import typingsJapgolly.primereact.AnonValue
import typingsJapgolly.primereact.treeMod.TreeProps
import typingsJapgolly.primereact.treeNodeMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tree {
  def apply(
    className: String = null,
    contentClassName: String = null,
    contentStyle: js.Object = null,
    contextMenuSelectionKey: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dragdropScope: String = null,
    expandedKeys: js.Any = null,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterBy: js.Any = null,
    filterMode: String = null,
    filterPlaceholder: String = null,
    id: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    loadingIcon: String = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    nodeTemplate: /* node */ js.Any => CallbackTo[Element] = null,
    onCollapse: /* e */ AnonNodeOriginalEvent => Callback = null,
    onContextMenu: /* e */ AnonNodeOriginalEvent => Callback = null,
    onContextMenuSelectionChange: /* e */ AnonValue => Callback = null,
    onDragDrop: /* e */ AnonValue => Callback = null,
    onExpand: /* e */ AnonNodeOriginalEvent => Callback = null,
    onSelect: /* e */ AnonNodeOriginalEvent => Callback = null,
    onSelectionChange: /* e */ AnonValue => Callback = null,
    onToggle: /* e */ AnonValue => Callback = null,
    onUnselect: /* e */ AnonNodeOriginalEvent => Callback = null,
    propagateSelectionDown: js.UndefOr[Boolean] = js.undefined,
    propagateSelectionUp: js.UndefOr[Boolean] = js.undefined,
    selectionKeys: js.Any = null,
    selectionMode: String = null,
    style: js.Object = null,
    value: js.Array[TreeNode] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TreeProps, typingsJapgolly.primereact.primereactTreeMod.Tree, Unit, TreeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contextMenuSelectionKey != null) __obj.updateDynamic("contextMenuSelectionKey")(contextMenuSelectionKey.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dragdropScope != null) __obj.updateDynamic("dragdropScope")(dragdropScope.asInstanceOf[js.Any])
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.asInstanceOf[js.Any])
    if (nodeTemplate != null) __obj.updateDynamic("nodeTemplate")(js.Any.fromFunction1((t0: /* node */ js.Any) => nodeTemplate(t0).runNow()))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonNodeOriginalEvent) => onCollapse(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonNodeOriginalEvent) => onContextMenu(t0).runNow()))
    if (onContextMenuSelectionChange != null) __obj.updateDynamic("onContextMenuSelectionChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onContextMenuSelectionChange(t0).runNow()))
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onDragDrop(t0).runNow()))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonNodeOriginalEvent) => onExpand(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonNodeOriginalEvent) => onSelect(t0).runNow()))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onSelectionChange(t0).runNow()))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onToggle(t0).runNow()))
    if (onUnselect != null) __obj.updateDynamic("onUnselect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonNodeOriginalEvent) => onUnselect(t0).runNow()))
    if (!js.isUndefined(propagateSelectionDown)) __obj.updateDynamic("propagateSelectionDown")(propagateSelectionDown.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateSelectionUp)) __obj.updateDynamic("propagateSelectionUp")(propagateSelectionUp.asInstanceOf[js.Any])
    if (selectionKeys != null) __obj.updateDynamic("selectionKeys")(selectionKeys.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.treeMod.TreeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactTreeMod.Tree](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.treeMod.TreeProps])(children: _*)
  }
  @JSImport("primereact/tree", "Tree")
  @js.native
  object componentImport extends js.Object
  
}

