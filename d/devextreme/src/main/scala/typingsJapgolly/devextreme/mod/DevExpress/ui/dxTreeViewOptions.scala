package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonComponentDxTreeView
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonComponentElementModelValue
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementItemElement
import typingsJapgolly.devextreme.AnonEventItemDataItemElement
import typingsJapgolly.devextreme.AnonItemDataItemElementItemIndex
import typingsJapgolly.devextreme.AnonItemElementItemIndexModel
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonModelNode
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.devextremeStrings.both
import typingsJapgolly.devextreme.devextremeStrings.click
import typingsJapgolly.devextreme.devextremeStrings.contains
import typingsJapgolly.devextreme.devextremeStrings.dblclick_
import typingsJapgolly.devextreme.devextremeStrings.equals
import typingsJapgolly.devextreme.devextremeStrings.horizontal
import typingsJapgolly.devextreme.devextremeStrings.multiple
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.normal
import typingsJapgolly.devextreme.devextremeStrings.plain
import typingsJapgolly.devextreme.devextremeStrings.selectAll
import typingsJapgolly.devextreme.devextremeStrings.single_
import typingsJapgolly.devextreme.devextremeStrings.startswith
import typingsJapgolly.devextreme.devextremeStrings.tree
import typingsJapgolly.devextreme.devextremeStrings.vertical
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsJapgolly.devextreme.mod._Global_.JQuery
import typingsJapgolly.devextreme.mod._Global_.JQueryPromise
import typingsJapgolly.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeViewOptions
  extends HierarchicalCollectionWidgetOptions[dxTreeView]
     with SearchBoxMixinOptions[dxTreeView] {
  /** Specifies whether or not to animate item collapsing and expanding. */
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  /** Allows you to load nodes on demand. */
  var createChildren: js.UndefOr[
    js.Function1[/* parentNode */ dxTreeViewNode, Promise[_] | JQueryPromise[_] | js.Array[_]]
  ] = js.undefined
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxTreeViewOptions: js.UndefOr[String | js.Array[dxTreeViewItem] | DataSource | DataSourceOptions] = js.undefined
  /** Notifies the widget of the used data structure. */
  var dataStructure: js.UndefOr[plain | tree] = js.undefined
  /** Specifies whether or not a user can expand all tree view items by the "*" hot key. */
  var expandAllEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the event on which to expand/collapse a node. */
  var expandEvent: js.UndefOr[dblclick_ | click] = js.undefined
  /** Specifies whether or not all parent nodes of an initially expanded node are displayed expanded. */
  var expandNodesRecursive: js.UndefOr[Boolean] = js.undefined
  /** Specifies which data source field specifies whether an item is expanded. */
  var expandedExpr: js.UndefOr[String | js.Function] = js.undefined
  /** Specifies the name of the data source item field whose value defines whether or not the corresponding node includes child nodes. */
  var hasItemsExpr: js.UndefOr[String | js.Function] = js.undefined
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxTreeViewOptions: js.UndefOr[js.Array[dxTreeViewItem]] = js.undefined
  /** A function that is executed when a collection item is clicked or tapped. */
  @JSName("onItemClick")
  var onItemClick_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ AnonModelNode, _]] = js.undefined
  /** A function that is executed when a tree view item is collapsed. */
  var onItemCollapsed: js.UndefOr[js.Function1[/* e */ AnonEventItemDataItemElement, _]] = js.undefined
  /** A function that is executed when a collection item is right-clicked or pressed. */
  @JSName("onItemContextMenu")
  var onItemContextMenu_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ AnonModelNode, _]] = js.undefined
  /** A function that is executed when a tree view item is expanded. */
  var onItemExpanded: js.UndefOr[js.Function1[/* e */ AnonEventItemDataItemElement, _]] = js.undefined
  /** A function that is executed when a collection item has been held for a specified period. */
  @JSName("onItemHold")
  var onItemHold_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ AnonItemDataItemElementItemIndex, _]] = js.undefined
  /** A function that is executed after a collection item is rendered. */
  @JSName("onItemRendered")
  var onItemRendered_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ AnonItemElementItemIndexModel, _]] = js.undefined
  /** A function that is executed when a tree view item is selected or selection is canceled. */
  var onItemSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonElementItemElement, _]] = js.undefined
  /** A function that is executed when the "Select All" check box value is changed. Applies only if showCheckBoxesMode is "selectAll" and selectionMode is "multiple". */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ AnonComponentElementModelValue, _]] = js.undefined
  /** A function that is executed when a tree view item is selected or selection is canceled. */
  @JSName("onSelectionChanged")
  var onSelectionChanged_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ AnonComponentDxTreeView, _]] = js.undefined
  /** Specifies the name of the data source item field for holding the parent key of the corresponding node. */
  var parentIdExpr: js.UndefOr[String | js.Function] = js.undefined
  /** Specifies the parent ID value of the root item. */
  var rootValue: js.UndefOr[js.Any] = js.undefined
  /** A string value specifying available scrolling directions. */
  var scrollDirection: js.UndefOr[both | horizontal | vertical] = js.undefined
  /** Specifies the text displayed at the "Select All" check box. */
  var selectAllText: js.UndefOr[String] = js.undefined
  /** Specifies whether or not an item becomes selected if a user clicks it. */
  var selectByClick: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not to select nodes recursively. */
  var selectNodesRecursive: js.UndefOr[Boolean] = js.undefined
  /** Specifies item selection mode. */
  var selectionMode: js.UndefOr[multiple | single_] = js.undefined
  /** Specifies the current check boxes display mode. */
  var showCheckBoxesMode: js.UndefOr[none | normal | selectAll] = js.undefined
  /** Enables the virtual mode in which nodes are loaded on demand. Use it to enhance the performance on large datasets. */
  var virtualModeEnabled: js.UndefOr[Boolean] = js.undefined
}

object dxTreeViewOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animationEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    createChildren: /* parentNode */ dxTreeViewNode => CallbackTo[Promise[js.Any] | JQueryPromise[js.Any] | js.Array[js.Any]] = null,
    dataSource: String | js.Array[dxTreeViewItem] | DataSource | DataSourceOptions = null,
    dataStructure: plain | tree = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledExpr: String | js.Function = null,
    displayExpr: String | (js.Function1[/* item */ js.Any, String]) = null,
    elementAttr: js.Any = null,
    expandAllEnabled: js.UndefOr[Boolean] = js.undefined,
    expandEvent: dblclick_ | click = null,
    expandNodesRecursive: js.UndefOr[Boolean] = js.undefined,
    expandedExpr: String | js.Function = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    hasItemsExpr: String | js.Function = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemHoldTimeout: Int | Double = null,
    itemTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[dxTreeViewItem] = null,
    itemsExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    noDataText: String = null,
    onContentReady: /* e */ AnonComponentElement[dxTreeView] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxTreeView] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxTreeView] => CallbackTo[js.Any] = null,
    onItemClick: /* e */ AnonModelNode => CallbackTo[js.Any] = null,
    onItemCollapsed: /* e */ AnonEventItemDataItemElement => CallbackTo[js.Any] = null,
    onItemContextMenu: /* e */ AnonModelNode => CallbackTo[js.Any] = null,
    onItemExpanded: /* e */ AnonEventItemDataItemElement => CallbackTo[js.Any] = null,
    onItemHold: /* e */ AnonItemDataItemElementItemIndex => CallbackTo[js.Any] = null,
    onItemRendered: /* e */ AnonItemElementItemIndexModel => CallbackTo[js.Any] = null,
    onItemSelectionChanged: /* e */ AnonElementItemElement => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxTreeView] => CallbackTo[js.Any] = null,
    onSelectAllValueChanged: /* e */ AnonComponentElementModelValue => CallbackTo[js.Any] = null,
    onSelectionChanged: /* e */ AnonComponentDxTreeView => CallbackTo[js.Any] = null,
    parentIdExpr: String | js.Function = null,
    rootValue: js.Any = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollDirection: both | horizontal | vertical = null,
    searchEditorOptions: dxTextBoxOptions[dxTextBox] = null,
    searchEnabled: js.UndefOr[Boolean] = js.undefined,
    searchExpr: String | js.Function | (js.Array[String | js.Function]) = null,
    searchMode: contains | startswith | equals = null,
    searchTimeout: Int | Double = null,
    searchValue: String = null,
    selectAllText: String = null,
    selectByClick: js.UndefOr[Boolean] = js.undefined,
    selectNodesRecursive: js.UndefOr[Boolean] = js.undefined,
    selectedExpr: String | js.Function = null,
    selectedIndex: Int | Double = null,
    selectedItem: js.Any = null,
    selectedItemKeys: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    selectionMode: multiple | single_ = null,
    showCheckBoxesMode: none | normal | selectAll = null,
    tabIndex: Int | Double = null,
    virtualModeEnabled: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxTreeViewOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (createChildren != null) __obj.updateDynamic("createChildren")(js.Any.fromFunction1((t0: /* parentNode */ typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeViewNode) => createChildren(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataStructure != null) __obj.updateDynamic("dataStructure")(dataStructure.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledExpr != null) __obj.updateDynamic("disabledExpr")(disabledExpr.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(expandAllEnabled)) __obj.updateDynamic("expandAllEnabled")(expandAllEnabled.asInstanceOf[js.Any])
    if (expandEvent != null) __obj.updateDynamic("expandEvent")(expandEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(expandNodesRecursive)) __obj.updateDynamic("expandNodesRecursive")(expandNodesRecursive.asInstanceOf[js.Any])
    if (expandedExpr != null) __obj.updateDynamic("expandedExpr")(expandedExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (hasItemsExpr != null) __obj.updateDynamic("hasItemsExpr")(hasItemsExpr.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (itemHoldTimeout != null) __obj.updateDynamic("itemHoldTimeout")(itemHoldTimeout.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (itemsExpr != null) __obj.updateDynamic("itemsExpr")(itemsExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView]) => onInitialized(t0).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModelNode) => onItemClick(t0).runNow()))
    if (onItemCollapsed != null) __obj.updateDynamic("onItemCollapsed")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEventItemDataItemElement) => onItemCollapsed(t0).runNow()))
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModelNode) => onItemContextMenu(t0).runNow()))
    if (onItemExpanded != null) __obj.updateDynamic("onItemExpanded")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEventItemDataItemElement) => onItemExpanded(t0).runNow()))
    if (onItemHold != null) __obj.updateDynamic("onItemHold")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItemDataItemElementItemIndex) => onItemHold(t0).runNow()))
    if (onItemRendered != null) __obj.updateDynamic("onItemRendered")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonItemElementItemIndexModel) => onItemRendered(t0).runNow()))
    if (onItemSelectionChanged != null) __obj.updateDynamic("onItemSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementItemElement) => onItemSelectionChanged(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeView]) => onOptionChanged(t0).runNow()))
    if (onSelectAllValueChanged != null) __obj.updateDynamic("onSelectAllValueChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElementModelValue) => onSelectAllValueChanged(t0).runNow()))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxTreeView) => onSelectionChanged(t0).runNow()))
    if (parentIdExpr != null) __obj.updateDynamic("parentIdExpr")(parentIdExpr.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scrollDirection != null) __obj.updateDynamic("scrollDirection")(scrollDirection.asInstanceOf[js.Any])
    if (searchEditorOptions != null) __obj.updateDynamic("searchEditorOptions")(searchEditorOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(searchEnabled)) __obj.updateDynamic("searchEnabled")(searchEnabled.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchMode != null) __obj.updateDynamic("searchMode")(searchMode.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue.asInstanceOf[js.Any])
    if (selectAllText != null) __obj.updateDynamic("selectAllText")(selectAllText.asInstanceOf[js.Any])
    if (!js.isUndefined(selectByClick)) __obj.updateDynamic("selectByClick")(selectByClick.asInstanceOf[js.Any])
    if (!js.isUndefined(selectNodesRecursive)) __obj.updateDynamic("selectNodesRecursive")(selectNodesRecursive.asInstanceOf[js.Any])
    if (selectedExpr != null) __obj.updateDynamic("selectedExpr")(selectedExpr.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemKeys != null) __obj.updateDynamic("selectedItemKeys")(selectedItemKeys.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (showCheckBoxesMode != null) __obj.updateDynamic("showCheckBoxesMode")(showCheckBoxesMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualModeEnabled)) __obj.updateDynamic("virtualModeEnabled")(virtualModeEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeViewOptions]
  }
}

