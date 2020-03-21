package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonAllowDropInsideItem
import typingsJapgolly.devextreme.AnonAllowedPageSizes
import typingsJapgolly.devextreme.AnonApplyFilter
import typingsJapgolly.devextreme.AnonAscendingText
import typingsJapgolly.devextreme.AnonBrokenRules
import typingsJapgolly.devextreme.AnonCancelComponent
import typingsJapgolly.devextreme.AnonCellElementColumn
import typingsJapgolly.devextreme.AnonColumnIndexComponent
import typingsJapgolly.devextreme.AnonComponentData
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonCurrentDeselectedRowKeys
import typingsJapgolly.devextreme.AnonCustomLoad
import typingsJapgolly.devextreme.AnonCustomizeText
import typingsJapgolly.devextreme.AnonDataDisplayValue
import typingsJapgolly.devextreme.AnonDataElement
import typingsJapgolly.devextreme.AnonEditOnKeyPress
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementKey
import typingsJapgolly.devextreme.AnonEmptyPanelText
import typingsJapgolly.devextreme.AnonEnabled
import typingsJapgolly.devextreme.AnonError
import typingsJapgolly.devextreme.AnonEventType
import typingsJapgolly.devextreme.AnonFormOptions
import typingsJapgolly.devextreme.AnonGrouping
import typingsJapgolly.devextreme.AnonHandled
import typingsJapgolly.devextreme.AnonHeight
import typingsJapgolly.devextreme.AnonHighlightCaseSensitive
import typingsJapgolly.devextreme.AnonIndicatorSrc
import typingsJapgolly.devextreme.AnonIsHighlighted
import typingsJapgolly.devextreme.AnonKey
import typingsJapgolly.devextreme.AnonKeyModel
import typingsJapgolly.devextreme.AnonLevel
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonModelRow
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonNewData
import typingsJapgolly.devextreme.AnonNode
import typingsJapgolly.devextreme.AnonParentType
import typingsJapgolly.devextreme.AnonPrevRowIndex
import typingsJapgolly.devextreme.AnonPromise
import typingsJapgolly.devextreme.AnonReadOnly
import typingsJapgolly.devextreme.AnonRoot
import typingsJapgolly.devextreme.AnonRowRowElement
import typingsJapgolly.devextreme.AnonTarget
import typingsJapgolly.devextreme.AnonToolbarOptions
import typingsJapgolly.devextreme.AnonValues
import typingsJapgolly.devextreme.devextremeStrings.auto
import typingsJapgolly.devextreme.devextremeStrings.fullBranch
import typingsJapgolly.devextreme.devextremeStrings.matchOnly
import typingsJapgolly.devextreme.devextremeStrings.nextColumn
import typingsJapgolly.devextreme.devextremeStrings.plain
import typingsJapgolly.devextreme.devextremeStrings.tree
import typingsJapgolly.devextreme.devextremeStrings.widget
import typingsJapgolly.devextreme.devextremeStrings.withAncestors
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeListOptions extends GridBaseOptions[dxTreeList] {
  /** Specifies whether all rows are expanded initially. */
  var autoExpandAll: js.UndefOr[Boolean] = js.undefined
  /** Configures columns. */
  @JSName("columns")
  var columns_dxTreeListOptions: js.UndefOr[js.Array[dxTreeListColumn | String]] = js.undefined
  /** Customizes columns after they are created. */
  var customizeColumns: js.UndefOr[js.Function1[/* columns */ js.Array[dxTreeListColumn], _]] = js.undefined
  /** Notifies the widget of the used data structure. */
  var dataStructure: js.UndefOr[plain | tree] = js.undefined
  /** Configures editing. */
  @JSName("editing")
  var editing_dxTreeListOptions: js.UndefOr[dxTreeListEditing] = js.undefined
  /** Specifies whether nodes appear expanded or collapsed after filtering is applied. */
  var expandNodesOnFiltering: js.UndefOr[Boolean] = js.undefined
  /** Specifies keys of the initially expanded rows. */
  var expandedRowKeys: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies whether filter and search results should include matching rows only, matching rows with ancestors, or matching rows with ancestors and descendants (full branch). */
  var filterMode: js.UndefOr[fullBranch | withAncestors | matchOnly] = js.undefined
  /** Specifies which data field defines whether the node has children. */
  var hasItemsExpr: js.UndefOr[String | js.Function] = js.undefined
  /** Specifies which data field contains nested items. Set this option when your data has a hierarchical structure. */
  var itemsExpr: js.UndefOr[String | js.Function] = js.undefined
  /** Specifies which data field provides keys for nodes. */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  /** A function that is executed when a cell is clicked or tapped. Executed before onRowClick. */
  var onCellClick: js.UndefOr[(js.Function1[/* e */ AnonCellElementColumn, _]) | String] = js.undefined
  /** A function that is executed when a cell is double-clicked or double-tapped. Executed before onRowDblClick. */
  var onCellDblClick: js.UndefOr[js.Function1[/* e */ AnonColumnIndexComponent, _]] = js.undefined
  /** A function that is executed after the pointer enters or leaves a cell. */
  var onCellHoverChanged: js.UndefOr[js.Function1[/* e */ AnonEventType, _]] = js.undefined
  /** A function that is executed after a grid cell is created. */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ AnonDataDisplayValue, _]] = js.undefined
  /** A function that is executed before the context menu is rendered. */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ AnonTarget, _]] = js.undefined
  /** A function that is executed before a cell or row switches to the editing state. */
  var onEditingStart: js.UndefOr[js.Function1[/* e */ AnonKeyModel, _]] = js.undefined
  /** A function that is executed after an editor is created. Not executed for cells with an editCellTemplate. */
  var onEditorPrepared: js.UndefOr[js.Function1[/* options */ AnonParentType, _]] = js.undefined
  /** A function used to customize or replace default editors. Not executed for cells with an editCellTemplate. */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ AnonReadOnly, _]] = js.undefined
  /** A function that is executed after the focused cell changes. */
  var onFocusedCellChanged: js.UndefOr[js.Function1[/* e */ AnonModelRow, _]] = js.undefined
  /** A function that is executed before the focused cell changes. */
  var onFocusedCellChanging: js.UndefOr[js.Function1[/* e */ AnonIsHighlighted, _]] = js.undefined
  /** A function that executed when the focused row changes. Applies only when focusedRowEnabled is true. */
  var onFocusedRowChanged: js.UndefOr[js.Function1[/* e */ AnonRowRowElement, _]] = js.undefined
  /** A function that is executed before the focused row changes. Applies only when focusedRowEnabled is true. */
  var onFocusedRowChanging: js.UndefOr[js.Function1[/* e */ AnonPrevRowIndex, _]] = js.undefined
  /** A function that is executed after the loaded nodes are initialized. */
  var onNodesInitialized: js.UndefOr[js.Function1[/* e */ AnonRoot, _]] = js.undefined
  /** A function that is executed when a grid row is clicked or tapped. */
  var onRowClick: js.UndefOr[(js.Function1[/* e */ AnonLevel, _]) | String] = js.undefined
  /** A function that is executed when a row is double-clicked or double-tapped. Executed after onCellDblClick. */
  var onRowDblClick: js.UndefOr[js.Function1[/* e */ AnonValues, _]] = js.undefined
  /** A function that is executed after a row is created. */
  var onRowPrepared: js.UndefOr[js.Function1[/* e */ AnonNode, _]] = js.undefined
  /** Configures paging. */
  @JSName("paging")
  var paging_dxTreeListOptions: js.UndefOr[dxTreeListPaging] = js.undefined
  /** Specifies which data field provides parent keys. */
  var parentIdExpr: js.UndefOr[String | js.Function] = js.undefined
  /** Notifies the TreeList of the server's data processing operations. Applies only if data has a plain structure. */
  var remoteOperations: js.UndefOr[AnonGrouping | auto] = js.undefined
  /** Specifies the root node's identifier. Applies if dataStructure is "plain". */
  var rootValue: js.UndefOr[js.Any] = js.undefined
  /** Configures scrolling. */
  @JSName("scrolling")
  var scrolling_dxTreeListOptions: js.UndefOr[dxTreeListScrolling] = js.undefined
  /** Configures runtime selection. */
  @JSName("selection")
  var selection_dxTreeListOptions: js.UndefOr[dxTreeListSelection] = js.undefined
}

object dxTreeListOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowColumnReordering: js.UndefOr[Boolean] = js.undefined,
    allowColumnResizing: js.UndefOr[Boolean] = js.undefined,
    autoExpandAll: js.UndefOr[Boolean] = js.undefined,
    autoNavigateToFocusedRow: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    cacheEnabled: js.UndefOr[Boolean] = js.undefined,
    cellHintEnabled: js.UndefOr[Boolean] = js.undefined,
    columnAutoWidth: js.UndefOr[Boolean] = js.undefined,
    columnChooser: AnonEmptyPanelText = null,
    columnFixing: AnonEnabled = null,
    columnHidingEnabled: js.UndefOr[Boolean] = js.undefined,
    columnMinWidth: Int | Double = null,
    columnResizingMode: nextColumn | widget = null,
    columnWidth: Int | Double = null,
    columns: js.Array[dxTreeListColumn | String] = null,
    customizeColumns: /* columns */ js.Array[dxTreeListColumn] => CallbackTo[js.Any] = null,
    dataSource: String | js.Array[_] | DataSource | DataSourceOptions = null,
    dataStructure: plain | tree = null,
    dateSerializationFormat: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editing: dxTreeListEditing = null,
    elementAttr: js.Any = null,
    errorRowEnabled: js.UndefOr[Boolean] = js.undefined,
    expandNodesOnFiltering: js.UndefOr[Boolean] = js.undefined,
    expandedRowKeys: js.Array[_] = null,
    filterBuilder: dxFilterBuilderOptions = null,
    filterBuilderPopup: dxPopupOptions[dxPopup] = null,
    filterMode: fullBranch | withAncestors | matchOnly = null,
    filterPanel: AnonCustomizeText[dxTreeList] = null,
    filterRow: AnonApplyFilter = null,
    filterSyncEnabled: Boolean | auto = null,
    filterValue: String | js.Array[_] | js.Function = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    focusedColumnIndex: Int | Double = null,
    focusedRowEnabled: js.UndefOr[Boolean] = js.undefined,
    focusedRowIndex: Int | Double = null,
    focusedRowKey: js.Any = null,
    hasItemsExpr: String | js.Function = null,
    headerFilter: AnonHeight = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    highlightChanges: js.UndefOr[Boolean] = js.undefined,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemsExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    keyboardNavigation: AnonEditOnKeyPress = null,
    loadPanel: AnonIndicatorSrc = null,
    noDataText: String = null,
    onAdaptiveDetailRowPreparing: /* e */ AnonFormOptions[dxTreeList] => CallbackTo[js.Any] = null,
    onCellClick: (js.Function1[/* e */ AnonCellElementColumn, _]) | String = null,
    onCellDblClick: /* e */ AnonColumnIndexComponent => CallbackTo[js.Any] = null,
    onCellHoverChanged: /* e */ AnonEventType => CallbackTo[js.Any] = null,
    onCellPrepared: /* e */ AnonDataDisplayValue => CallbackTo[js.Any] = null,
    onContentReady: /* e */ AnonComponentElement[dxTreeList] => CallbackTo[js.Any] = null,
    onContextMenuPreparing: /* e */ AnonTarget => CallbackTo[js.Any] = null,
    onDataErrorOccurred: /* e */ AnonError[dxTreeList] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxTreeList] => CallbackTo[js.Any] = null,
    onEditingStart: /* e */ AnonKeyModel => CallbackTo[js.Any] = null,
    onEditorPrepared: /* options */ AnonParentType => CallbackTo[js.Any] = null,
    onEditorPreparing: /* e */ AnonReadOnly => CallbackTo[js.Any] = null,
    onFocusedCellChanged: /* e */ AnonModelRow => CallbackTo[js.Any] = null,
    onFocusedCellChanging: /* e */ AnonIsHighlighted => CallbackTo[js.Any] = null,
    onFocusedRowChanged: /* e */ AnonRowRowElement => CallbackTo[js.Any] = null,
    onFocusedRowChanging: /* e */ AnonPrevRowIndex => CallbackTo[js.Any] = null,
    onInitNewRow: /* e */ AnonPromise[dxTreeList] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxTreeList] => CallbackTo[js.Any] = null,
    onKeyDown: /* e */ AnonHandled[dxTreeList] => CallbackTo[js.Any] = null,
    onNodesInitialized: /* e */ AnonRoot => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxTreeList] => CallbackTo[js.Any] = null,
    onRowClick: (js.Function1[/* e */ AnonLevel, _]) | String = null,
    onRowCollapsed: /* e */ AnonKey[dxTreeList] => CallbackTo[js.Any] = null,
    onRowCollapsing: /* e */ AnonCancelComponent[dxTreeList] => CallbackTo[js.Any] = null,
    onRowDblClick: /* e */ AnonValues => CallbackTo[js.Any] = null,
    onRowExpanded: /* e */ AnonKey[dxTreeList] => CallbackTo[js.Any] = null,
    onRowExpanding: /* e */ AnonCancelComponent[dxTreeList] => CallbackTo[js.Any] = null,
    onRowInserted: /* e */ AnonComponentData[dxTreeList] => CallbackTo[js.Any] = null,
    onRowInserting: /* e */ AnonDataElement[dxTreeList] => CallbackTo[js.Any] = null,
    onRowPrepared: /* e */ AnonNode => CallbackTo[js.Any] = null,
    onRowRemoved: /* e */ AnonComponentData[dxTreeList] => CallbackTo[js.Any] = null,
    onRowRemoving: /* e */ AnonElementKey[dxTreeList] => CallbackTo[js.Any] = null,
    onRowUpdated: /* e */ AnonComponentData[dxTreeList] => CallbackTo[js.Any] = null,
    onRowUpdating: /* e */ AnonNewData[dxTreeList] => CallbackTo[js.Any] = null,
    onRowValidating: /* e */ AnonBrokenRules[dxTreeList] => CallbackTo[js.Any] = null,
    onSelectionChanged: /* e */ AnonCurrentDeselectedRowKeys[dxTreeList] => CallbackTo[js.Any] = null,
    onToolbarPreparing: /* e */ AnonToolbarOptions[dxTreeList] => CallbackTo[js.Any] = null,
    pager: AnonAllowedPageSizes = null,
    paging: dxTreeListPaging = null,
    parentIdExpr: String | js.Function = null,
    remoteOperations: AnonGrouping | auto = null,
    renderAsync: js.UndefOr[Boolean] = js.undefined,
    repaintChangesOnly: js.UndefOr[Boolean] = js.undefined,
    rootValue: js.Any = null,
    rowAlternationEnabled: js.UndefOr[Boolean] = js.undefined,
    rowDragging: AnonAllowDropInsideItem = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrolling: dxTreeListScrolling = null,
    searchPanel: AnonHighlightCaseSensitive = null,
    selectedRowKeys: js.Array[_] = null,
    selection: dxTreeListSelection = null,
    showBorders: js.UndefOr[Boolean] = js.undefined,
    showColumnHeaders: js.UndefOr[Boolean] = js.undefined,
    showColumnLines: js.UndefOr[Boolean] = js.undefined,
    showRowLines: js.UndefOr[Boolean] = js.undefined,
    sorting: AnonAscendingText = null,
    stateStoring: AnonCustomLoad = null,
    tabIndex: Int | Double = null,
    twoWayBindingEnabled: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  ): dxTreeListOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(allowColumnReordering)) __obj.updateDynamic("allowColumnReordering")(allowColumnReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowColumnResizing)) __obj.updateDynamic("allowColumnResizing")(allowColumnResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(autoExpandAll)) __obj.updateDynamic("autoExpandAll")(autoExpandAll.asInstanceOf[js.Any])
    if (!js.isUndefined(autoNavigateToFocusedRow)) __obj.updateDynamic("autoNavigateToFocusedRow")(autoNavigateToFocusedRow.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheEnabled)) __obj.updateDynamic("cacheEnabled")(cacheEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(cellHintEnabled)) __obj.updateDynamic("cellHintEnabled")(cellHintEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(columnAutoWidth)) __obj.updateDynamic("columnAutoWidth")(columnAutoWidth.asInstanceOf[js.Any])
    if (columnChooser != null) __obj.updateDynamic("columnChooser")(columnChooser.asInstanceOf[js.Any])
    if (columnFixing != null) __obj.updateDynamic("columnFixing")(columnFixing.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHidingEnabled)) __obj.updateDynamic("columnHidingEnabled")(columnHidingEnabled.asInstanceOf[js.Any])
    if (columnMinWidth != null) __obj.updateDynamic("columnMinWidth")(columnMinWidth.asInstanceOf[js.Any])
    if (columnResizingMode != null) __obj.updateDynamic("columnResizingMode")(columnResizingMode.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (customizeColumns != null) __obj.updateDynamic("customizeColumns")(js.Any.fromFunction1((t0: /* columns */ js.Array[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeListColumn]) => customizeColumns(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataStructure != null) __obj.updateDynamic("dataStructure")(dataStructure.asInstanceOf[js.Any])
    if (dateSerializationFormat != null) __obj.updateDynamic("dateSerializationFormat")(dateSerializationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (editing != null) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(errorRowEnabled)) __obj.updateDynamic("errorRowEnabled")(errorRowEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(expandNodesOnFiltering)) __obj.updateDynamic("expandNodesOnFiltering")(expandNodesOnFiltering.asInstanceOf[js.Any])
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys.asInstanceOf[js.Any])
    if (filterBuilder != null) __obj.updateDynamic("filterBuilder")(filterBuilder.asInstanceOf[js.Any])
    if (filterBuilderPopup != null) __obj.updateDynamic("filterBuilderPopup")(filterBuilderPopup.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (filterPanel != null) __obj.updateDynamic("filterPanel")(filterPanel.asInstanceOf[js.Any])
    if (filterRow != null) __obj.updateDynamic("filterRow")(filterRow.asInstanceOf[js.Any])
    if (filterSyncEnabled != null) __obj.updateDynamic("filterSyncEnabled")(filterSyncEnabled.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (focusedColumnIndex != null) __obj.updateDynamic("focusedColumnIndex")(focusedColumnIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(focusedRowEnabled)) __obj.updateDynamic("focusedRowEnabled")(focusedRowEnabled.asInstanceOf[js.Any])
    if (focusedRowIndex != null) __obj.updateDynamic("focusedRowIndex")(focusedRowIndex.asInstanceOf[js.Any])
    if (focusedRowKey != null) __obj.updateDynamic("focusedRowKey")(focusedRowKey.asInstanceOf[js.Any])
    if (hasItemsExpr != null) __obj.updateDynamic("hasItemsExpr")(hasItemsExpr.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightChanges)) __obj.updateDynamic("highlightChanges")(highlightChanges.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (itemsExpr != null) __obj.updateDynamic("itemsExpr")(itemsExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (keyboardNavigation != null) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation.asInstanceOf[js.Any])
    if (loadPanel != null) __obj.updateDynamic("loadPanel")(loadPanel.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onAdaptiveDetailRowPreparing != null) __obj.updateDynamic("onAdaptiveDetailRowPreparing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonFormOptions[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onAdaptiveDetailRowPreparing(t0).runNow()))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(onCellClick.asInstanceOf[js.Any])
    if (onCellDblClick != null) __obj.updateDynamic("onCellDblClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonColumnIndexComponent) => onCellDblClick(t0).runNow()))
    if (onCellHoverChanged != null) __obj.updateDynamic("onCellHoverChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEventType) => onCellHoverChanged(t0).runNow()))
    if (onCellPrepared != null) __obj.updateDynamic("onCellPrepared")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonDataDisplayValue) => onCellPrepared(t0).runNow()))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onContentReady(t0).runNow()))
    if (onContextMenuPreparing != null) __obj.updateDynamic("onContextMenuPreparing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonTarget) => onContextMenuPreparing(t0).runNow()))
    if (onDataErrorOccurred != null) __obj.updateDynamic("onDataErrorOccurred")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonError[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onDataErrorOccurred(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onDisposing(t0).runNow()))
    if (onEditingStart != null) __obj.updateDynamic("onEditingStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonKeyModel) => onEditingStart(t0).runNow()))
    if (onEditorPrepared != null) __obj.updateDynamic("onEditorPrepared")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.devextreme.AnonParentType) => onEditorPrepared(t0).runNow()))
    if (onEditorPreparing != null) __obj.updateDynamic("onEditorPreparing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonReadOnly) => onEditorPreparing(t0).runNow()))
    if (onFocusedCellChanged != null) __obj.updateDynamic("onFocusedCellChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModelRow) => onFocusedCellChanged(t0).runNow()))
    if (onFocusedCellChanging != null) __obj.updateDynamic("onFocusedCellChanging")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonIsHighlighted) => onFocusedCellChanging(t0).runNow()))
    if (onFocusedRowChanged != null) __obj.updateDynamic("onFocusedRowChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonRowRowElement) => onFocusedRowChanged(t0).runNow()))
    if (onFocusedRowChanging != null) __obj.updateDynamic("onFocusedRowChanging")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonPrevRowIndex) => onFocusedRowChanging(t0).runNow()))
    if (onInitNewRow != null) __obj.updateDynamic("onInitNewRow")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonPromise[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onInitNewRow(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onInitialized(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonHandled[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onKeyDown(t0).runNow()))
    if (onNodesInitialized != null) __obj.updateDynamic("onNodesInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonRoot) => onNodesInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onOptionChanged(t0).runNow()))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(onRowClick.asInstanceOf[js.Any])
    if (onRowCollapsed != null) __obj.updateDynamic("onRowCollapsed")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonKey[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onRowCollapsed(t0).runNow()))
    if (onRowCollapsing != null) __obj.updateDynamic("onRowCollapsing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onRowCollapsing(t0).runNow()))
    if (onRowDblClick != null) __obj.updateDynamic("onRowDblClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonValues) => onRowDblClick(t0).runNow()))
    if (onRowExpanded != null) __obj.updateDynamic("onRowExpanded")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonKey[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onRowExpanded(t0).runNow()))
    if (onRowExpanding != null) __obj.updateDynamic("onRowExpanding")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponent[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onRowExpanding(t0).runNow()))
    if (onRowInserted != null) __obj.updateDynamic("onRowInserted")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentData[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onRowInserted(t0).runNow()))
    if (onRowInserting != null) __obj.updateDynamic("onRowInserting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonDataElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onRowInserting(t0).runNow()))
    if (onRowPrepared != null) __obj.updateDynamic("onRowPrepared")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonNode) => onRowPrepared(t0).runNow()))
    if (onRowRemoved != null) __obj.updateDynamic("onRowRemoved")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentData[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onRowRemoved(t0).runNow()))
    if (onRowRemoving != null) __obj.updateDynamic("onRowRemoving")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementKey[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onRowRemoving(t0).runNow()))
    if (onRowUpdated != null) __obj.updateDynamic("onRowUpdated")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentData[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onRowUpdated(t0).runNow()))
    if (onRowUpdating != null) __obj.updateDynamic("onRowUpdating")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonNewData[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onRowUpdating(t0).runNow()))
    if (onRowValidating != null) __obj.updateDynamic("onRowValidating")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonBrokenRules[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onRowValidating(t0).runNow()))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCurrentDeselectedRowKeys[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onSelectionChanged(t0).runNow()))
    if (onToolbarPreparing != null) __obj.updateDynamic("onToolbarPreparing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonToolbarOptions[typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList]) => onToolbarPreparing(t0).runNow()))
    if (pager != null) __obj.updateDynamic("pager")(pager.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (parentIdExpr != null) __obj.updateDynamic("parentIdExpr")(parentIdExpr.asInstanceOf[js.Any])
    if (remoteOperations != null) __obj.updateDynamic("remoteOperations")(remoteOperations.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAsync)) __obj.updateDynamic("renderAsync")(renderAsync.asInstanceOf[js.Any])
    if (!js.isUndefined(repaintChangesOnly)) __obj.updateDynamic("repaintChangesOnly")(repaintChangesOnly.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (!js.isUndefined(rowAlternationEnabled)) __obj.updateDynamic("rowAlternationEnabled")(rowAlternationEnabled.asInstanceOf[js.Any])
    if (rowDragging != null) __obj.updateDynamic("rowDragging")(rowDragging.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (searchPanel != null) __obj.updateDynamic("searchPanel")(searchPanel.asInstanceOf[js.Any])
    if (selectedRowKeys != null) __obj.updateDynamic("selectedRowKeys")(selectedRowKeys.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (!js.isUndefined(showBorders)) __obj.updateDynamic("showBorders")(showBorders.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnHeaders)) __obj.updateDynamic("showColumnHeaders")(showColumnHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnLines)) __obj.updateDynamic("showColumnLines")(showColumnLines.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowLines)) __obj.updateDynamic("showRowLines")(showRowLines.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (stateStoring != null) __obj.updateDynamic("stateStoring")(stateStoring.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(twoWayBindingEnabled)) __obj.updateDynamic("twoWayBindingEnabled")(twoWayBindingEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapEnabled)) __obj.updateDynamic("wordWrapEnabled")(wordWrapEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListOptions]
  }
}

