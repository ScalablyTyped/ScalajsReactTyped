package typingsJapgolly.primereact.dataTableMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.primereact.AnonColumns
import typingsJapgolly.primereact.AnonData
import typingsJapgolly.primereact.AnonDataField
import typingsJapgolly.primereact.AnonDataIndex
import typingsJapgolly.primereact.AnonDataOriginalEvent
import typingsJapgolly.primereact.AnonDelta
import typingsJapgolly.primereact.AnonDragIndex
import typingsJapgolly.primereact.AnonFirst
import typingsJapgolly.primereact.AnonMultiSortMeta
import typingsJapgolly.primereact.AnonType
import typingsJapgolly.primereact.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableProps extends js.Object {
  var alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined
  var autoLayout: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columnResizeMode: js.UndefOr[String] = js.undefined
  var compareSelectionBy: js.UndefOr[String] = js.undefined
  var contextMenuSelection: js.UndefOr[js.Any] = js.undefined
  var csvSeparator: js.UndefOr[String] = js.undefined
  var currentPageReportTemplate: js.UndefOr[String] = js.undefined
  var dataKey: js.UndefOr[String] = js.undefined
  var defaultSortOrder: js.UndefOr[Double] = js.undefined
  var editMode: js.UndefOr[String] = js.undefined
  var emptyMessage: js.UndefOr[String] = js.undefined
  var expandableRowGroups: js.UndefOr[Boolean] = js.undefined
  var expandedRows: js.UndefOr[js.Array[_]] = js.undefined
  var exportFilename: js.UndefOr[String] = js.undefined
  var exportFunction: js.UndefOr[js.Function1[/* e */ AnonDataField, _]] = js.undefined
  var filters: js.UndefOr[js.Object] = js.undefined
  var first: js.UndefOr[Double] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var footerColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenFooterColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenHeaderColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenValue: js.UndefOr[js.Array[_]] = js.undefined
  var frozenWidth: js.UndefOr[String] = js.undefined
  var globalFilter: js.UndefOr[js.Any] = js.undefined
  var groupField: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var headerColumnGroup: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var loadingIcon: js.UndefOr[String] = js.undefined
  var metaKeySelection: js.UndefOr[Boolean] = js.undefined
  var multiSortMeta: js.UndefOr[js.Array[_]] = js.undefined
  var onColReorder: js.UndefOr[js.Function1[/* e */ AnonColumns, Unit]] = js.undefined
  var onColumnResizeEnd: js.UndefOr[js.Function1[/* e */ AnonDelta, Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* e */ AnonDataOriginalEvent, Unit]] = js.undefined
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var onFilter: js.UndefOr[js.Function1[/* filters */ js.Array[_], Unit]] = js.undefined
  var onPage: js.UndefOr[js.Function1[/* e */ AnonFirst, Unit]] = js.undefined
  var onRowClick: js.UndefOr[js.Function1[/* e */ AnonDataIndex, Unit]] = js.undefined
  var onRowCollapse: js.UndefOr[js.Function1[/* e */ AnonDataOriginalEvent, Unit]] = js.undefined
  var onRowDoubleClick: js.UndefOr[js.Function1[/* e */ AnonDataIndex, Unit]] = js.undefined
  var onRowEditCancel: js.UndefOr[js.Function1[/* e */ AnonDataIndex, Unit]] = js.undefined
  var onRowEditInit: js.UndefOr[js.Function1[/* e */ AnonDataOriginalEvent, Unit]] = js.undefined
  var onRowEditSave: js.UndefOr[js.Function1[/* e */ AnonDataOriginalEvent, Unit]] = js.undefined
  var onRowExpand: js.UndefOr[js.Function1[/* e */ AnonDataOriginalEvent, Unit]] = js.undefined
  var onRowReorder: js.UndefOr[js.Function1[/* e */ AnonDragIndex, Unit]] = js.undefined
  var onRowSelect: js.UndefOr[js.Function1[/* e */ AnonType, Unit]] = js.undefined
  var onRowToggle: js.UndefOr[js.Function1[/* e */ AnonData, Unit]] = js.undefined
  var onRowUnselect: js.UndefOr[js.Function1[/* e */ AnonType, Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var onSort: js.UndefOr[js.Function1[/* e */ AnonMultiSortMeta, Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ js.Array[_], Unit]] = js.undefined
  var onVirtualScroll: js.UndefOr[js.Function1[/* e */ AnonFirst, Unit]] = js.undefined
  var pageLinkSize: js.UndefOr[Double] = js.undefined
  var paginator: js.UndefOr[Boolean] = js.undefined
  var paginatorLeft: js.UndefOr[js.Any] = js.undefined
  var paginatorPosition: js.UndefOr[String] = js.undefined
  var paginatorRight: js.UndefOr[js.Any] = js.undefined
  var paginatorTemplate: js.UndefOr[String] = js.undefined
  var removableSort: js.UndefOr[Boolean] = js.undefined
  var reorderableColumns: js.UndefOr[Boolean] = js.undefined
  var resizableColumns: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var rowClassName: js.UndefOr[js.Function1[/* rowData */ js.Any, js.Object]] = js.undefined
  var rowEditorValidator: js.UndefOr[js.Function1[/* rowData */ js.Any, Boolean]] = js.undefined
  var rowExpansionTemplate: js.UndefOr[js.Function1[/* data */ js.Any, js.UndefOr[Element]]] = js.undefined
  var rowGroupFooterTemplate: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, js.UndefOr[Node]]] = js.undefined
  var rowGroupHeaderTemplate: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, js.UndefOr[Node]]] = js.undefined
  var rowGroupMode: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.undefined
  var scrollHeight: js.UndefOr[String] = js.undefined
  var scrollable: js.UndefOr[Boolean] = js.undefined
  var selection: js.UndefOr[js.Any] = js.undefined
  var selectionMode: js.UndefOr[String] = js.undefined
  var sortField: js.UndefOr[String] = js.undefined
  var sortMode: js.UndefOr[String] = js.undefined
  var sortOrder: js.UndefOr[Double] = js.undefined
  var stateKey: js.UndefOr[String] = js.undefined
  var stateStorage: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[String] = js.undefined
  var tableClassName: js.UndefOr[String] = js.undefined
  var tableStyle: js.UndefOr[js.Object] = js.undefined
  var totalRecords: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
  var virtualRowHeight: js.UndefOr[Double] = js.undefined
  var virtualScroll: js.UndefOr[Boolean] = js.undefined
  var virtualScrollDelay: js.UndefOr[Double] = js.undefined
}

object DataTableProps {
  @scala.inline
  def apply(
    alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined,
    autoLayout: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    columnResizeMode: String = null,
    compareSelectionBy: String = null,
    contextMenuSelection: js.Any = null,
    csvSeparator: String = null,
    currentPageReportTemplate: String = null,
    dataKey: String = null,
    defaultSortOrder: Int | Double = null,
    editMode: String = null,
    emptyMessage: String = null,
    expandableRowGroups: js.UndefOr[Boolean] = js.undefined,
    expandedRows: js.Array[_] = null,
    exportFilename: String = null,
    exportFunction: /* e */ AnonDataField => CallbackTo[js.Any] = null,
    filters: js.Object = null,
    first: Int | Double = null,
    footer: js.Any = null,
    footerColumnGroup: js.Any = null,
    frozenFooterColumnGroup: js.Any = null,
    frozenHeaderColumnGroup: js.Any = null,
    frozenValue: js.Array[_] = null,
    frozenWidth: String = null,
    globalFilter: js.Any = null,
    groupField: String = null,
    header: js.Any = null,
    headerColumnGroup: js.Any = null,
    id: String = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    loadingIcon: String = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    multiSortMeta: js.Array[_] = null,
    onColReorder: /* e */ AnonColumns => Callback = null,
    onColumnResizeEnd: /* e */ AnonDelta => Callback = null,
    onContextMenu: /* e */ AnonDataOriginalEvent => Callback = null,
    onContextMenuSelectionChange: /* e */ AnonValue => Callback = null,
    onFilter: /* filters */ js.Array[js.Any] => Callback = null,
    onPage: /* e */ AnonFirst => Callback = null,
    onRowClick: /* e */ AnonDataIndex => Callback = null,
    onRowCollapse: /* e */ AnonDataOriginalEvent => Callback = null,
    onRowDoubleClick: /* e */ AnonDataIndex => Callback = null,
    onRowEditCancel: /* e */ AnonDataIndex => Callback = null,
    onRowEditInit: /* e */ AnonDataOriginalEvent => Callback = null,
    onRowEditSave: /* e */ AnonDataOriginalEvent => Callback = null,
    onRowExpand: /* e */ AnonDataOriginalEvent => Callback = null,
    onRowReorder: /* e */ AnonDragIndex => Callback = null,
    onRowSelect: /* e */ AnonType => Callback = null,
    onRowToggle: /* e */ AnonData => Callback = null,
    onRowUnselect: /* e */ AnonType => Callback = null,
    onSelectionChange: /* e */ AnonValue => Callback = null,
    onSort: /* e */ AnonMultiSortMeta => Callback = null,
    onValueChange: /* value */ js.Array[js.Any] => Callback = null,
    onVirtualScroll: /* e */ AnonFirst => Callback = null,
    pageLinkSize: Int | Double = null,
    paginator: js.UndefOr[Boolean] = js.undefined,
    paginatorLeft: js.Any = null,
    paginatorPosition: String = null,
    paginatorRight: js.Any = null,
    paginatorTemplate: String = null,
    removableSort: js.UndefOr[Boolean] = js.undefined,
    reorderableColumns: js.UndefOr[Boolean] = js.undefined,
    resizableColumns: js.UndefOr[Boolean] = js.undefined,
    responsive: js.UndefOr[Boolean] = js.undefined,
    rowClassName: /* rowData */ js.Any => CallbackTo[js.Object] = null,
    rowEditorValidator: /* rowData */ js.Any => CallbackTo[Boolean] = null,
    rowExpansionTemplate: /* data */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    rowGroupFooterTemplate: (/* data */ js.Any, /* index */ Double) => CallbackTo[js.UndefOr[Node]] = null,
    rowGroupHeaderTemplate: (/* data */ js.Any, /* index */ Double) => CallbackTo[js.UndefOr[Node]] = null,
    rowGroupMode: String = null,
    rows: Int | Double = null,
    rowsPerPageOptions: js.Array[Double] = null,
    scrollHeight: String = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    selection: js.Any = null,
    selectionMode: String = null,
    sortField: String = null,
    sortMode: String = null,
    sortOrder: Int | Double = null,
    stateKey: String = null,
    stateStorage: String = null,
    style: js.Object = null,
    tabIndex: String = null,
    tableClassName: String = null,
    tableStyle: js.Object = null,
    totalRecords: Int | Double = null,
    value: js.Array[_] = null,
    virtualRowHeight: Int | Double = null,
    virtualScroll: js.UndefOr[Boolean] = js.undefined,
    virtualScrollDelay: Int | Double = null
  ): DataTableProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowPaginator)) __obj.updateDynamic("alwaysShowPaginator")(alwaysShowPaginator.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLayout)) __obj.updateDynamic("autoLayout")(autoLayout.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnResizeMode != null) __obj.updateDynamic("columnResizeMode")(columnResizeMode.asInstanceOf[js.Any])
    if (compareSelectionBy != null) __obj.updateDynamic("compareSelectionBy")(compareSelectionBy.asInstanceOf[js.Any])
    if (contextMenuSelection != null) __obj.updateDynamic("contextMenuSelection")(contextMenuSelection.asInstanceOf[js.Any])
    if (csvSeparator != null) __obj.updateDynamic("csvSeparator")(csvSeparator.asInstanceOf[js.Any])
    if (currentPageReportTemplate != null) __obj.updateDynamic("currentPageReportTemplate")(currentPageReportTemplate.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (defaultSortOrder != null) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder.asInstanceOf[js.Any])
    if (editMode != null) __obj.updateDynamic("editMode")(editMode.asInstanceOf[js.Any])
    if (emptyMessage != null) __obj.updateDynamic("emptyMessage")(emptyMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(expandableRowGroups)) __obj.updateDynamic("expandableRowGroups")(expandableRowGroups.asInstanceOf[js.Any])
    if (expandedRows != null) __obj.updateDynamic("expandedRows")(expandedRows.asInstanceOf[js.Any])
    if (exportFilename != null) __obj.updateDynamic("exportFilename")(exportFilename.asInstanceOf[js.Any])
    if (exportFunction != null) __obj.updateDynamic("exportFunction")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDataField) => exportFunction(t0).runNow()))
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerColumnGroup != null) __obj.updateDynamic("footerColumnGroup")(footerColumnGroup.asInstanceOf[js.Any])
    if (frozenFooterColumnGroup != null) __obj.updateDynamic("frozenFooterColumnGroup")(frozenFooterColumnGroup.asInstanceOf[js.Any])
    if (frozenHeaderColumnGroup != null) __obj.updateDynamic("frozenHeaderColumnGroup")(frozenHeaderColumnGroup.asInstanceOf[js.Any])
    if (frozenValue != null) __obj.updateDynamic("frozenValue")(frozenValue.asInstanceOf[js.Any])
    if (frozenWidth != null) __obj.updateDynamic("frozenWidth")(frozenWidth.asInstanceOf[js.Any])
    if (globalFilter != null) __obj.updateDynamic("globalFilter")(globalFilter.asInstanceOf[js.Any])
    if (groupField != null) __obj.updateDynamic("groupField")(groupField.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerColumnGroup != null) __obj.updateDynamic("headerColumnGroup")(headerColumnGroup.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.asInstanceOf[js.Any])
    if (multiSortMeta != null) __obj.updateDynamic("multiSortMeta")(multiSortMeta.asInstanceOf[js.Any])
    if (onColReorder != null) __obj.updateDynamic("onColReorder")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonColumns) => onColReorder(t0).runNow()))
    if (onColumnResizeEnd != null) __obj.updateDynamic("onColumnResizeEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDelta) => onColumnResizeEnd(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDataOriginalEvent) => onContextMenu(t0).runNow()))
    if (onContextMenuSelectionChange != null) __obj.updateDynamic("onContextMenuSelectionChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onContextMenuSelectionChange(t0).runNow()))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1((t0: /* filters */ js.Array[js.Any]) => onFilter(t0).runNow()))
    if (onPage != null) __obj.updateDynamic("onPage")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonFirst) => onPage(t0).runNow()))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDataIndex) => onRowClick(t0).runNow()))
    if (onRowCollapse != null) __obj.updateDynamic("onRowCollapse")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDataOriginalEvent) => onRowCollapse(t0).runNow()))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDataIndex) => onRowDoubleClick(t0).runNow()))
    if (onRowEditCancel != null) __obj.updateDynamic("onRowEditCancel")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDataIndex) => onRowEditCancel(t0).runNow()))
    if (onRowEditInit != null) __obj.updateDynamic("onRowEditInit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDataOriginalEvent) => onRowEditInit(t0).runNow()))
    if (onRowEditSave != null) __obj.updateDynamic("onRowEditSave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDataOriginalEvent) => onRowEditSave(t0).runNow()))
    if (onRowExpand != null) __obj.updateDynamic("onRowExpand")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDataOriginalEvent) => onRowExpand(t0).runNow()))
    if (onRowReorder != null) __obj.updateDynamic("onRowReorder")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDragIndex) => onRowReorder(t0).runNow()))
    if (onRowSelect != null) __obj.updateDynamic("onRowSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonType) => onRowSelect(t0).runNow()))
    if (onRowToggle != null) __obj.updateDynamic("onRowToggle")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonData) => onRowToggle(t0).runNow()))
    if (onRowUnselect != null) __obj.updateDynamic("onRowUnselect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonType) => onRowUnselect(t0).runNow()))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onSelectionChange(t0).runNow()))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonMultiSortMeta) => onSort(t0).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1((t0: /* value */ js.Array[js.Any]) => onValueChange(t0).runNow()))
    if (onVirtualScroll != null) __obj.updateDynamic("onVirtualScroll")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonFirst) => onVirtualScroll(t0).runNow()))
    if (pageLinkSize != null) __obj.updateDynamic("pageLinkSize")(pageLinkSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paginator)) __obj.updateDynamic("paginator")(paginator.asInstanceOf[js.Any])
    if (paginatorLeft != null) __obj.updateDynamic("paginatorLeft")(paginatorLeft.asInstanceOf[js.Any])
    if (paginatorPosition != null) __obj.updateDynamic("paginatorPosition")(paginatorPosition.asInstanceOf[js.Any])
    if (paginatorRight != null) __obj.updateDynamic("paginatorRight")(paginatorRight.asInstanceOf[js.Any])
    if (paginatorTemplate != null) __obj.updateDynamic("paginatorTemplate")(paginatorTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(removableSort)) __obj.updateDynamic("removableSort")(removableSort.asInstanceOf[js.Any])
    if (!js.isUndefined(reorderableColumns)) __obj.updateDynamic("reorderableColumns")(reorderableColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(resizableColumns)) __obj.updateDynamic("resizableColumns")(resizableColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1((t0: /* rowData */ js.Any) => rowClassName(t0).runNow()))
    if (rowEditorValidator != null) __obj.updateDynamic("rowEditorValidator")(js.Any.fromFunction1((t0: /* rowData */ js.Any) => rowEditorValidator(t0).runNow()))
    if (rowExpansionTemplate != null) __obj.updateDynamic("rowExpansionTemplate")(js.Any.fromFunction1((t0: /* data */ js.Any) => rowExpansionTemplate(t0).runNow()))
    if (rowGroupFooterTemplate != null) __obj.updateDynamic("rowGroupFooterTemplate")(js.Any.fromFunction2((t0: /* data */ js.Any, t1: /* index */ scala.Double) => rowGroupFooterTemplate(t0, t1).runNow()))
    if (rowGroupHeaderTemplate != null) __obj.updateDynamic("rowGroupHeaderTemplate")(js.Any.fromFunction2((t0: /* data */ js.Any, t1: /* index */ scala.Double) => rowGroupHeaderTemplate(t0, t1).runNow()))
    if (rowGroupMode != null) __obj.updateDynamic("rowGroupMode")(rowGroupMode.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortMode != null) __obj.updateDynamic("sortMode")(sortMode.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (stateKey != null) __obj.updateDynamic("stateKey")(stateKey.asInstanceOf[js.Any])
    if (stateStorage != null) __obj.updateDynamic("stateStorage")(stateStorage.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tableClassName != null) __obj.updateDynamic("tableClassName")(tableClassName.asInstanceOf[js.Any])
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle.asInstanceOf[js.Any])
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (virtualRowHeight != null) __obj.updateDynamic("virtualRowHeight")(virtualRowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualScroll)) __obj.updateDynamic("virtualScroll")(virtualScroll.asInstanceOf[js.Any])
    if (virtualScrollDelay != null) __obj.updateDynamic("virtualScrollDelay")(virtualScrollDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableProps]
  }
}

