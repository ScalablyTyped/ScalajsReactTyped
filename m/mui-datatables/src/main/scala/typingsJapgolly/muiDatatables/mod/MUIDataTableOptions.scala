package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.muiDatatables.AnonColIndex
import typingsJapgolly.muiDatatables.AnonDataDataIndex
import typingsJapgolly.muiDatatables.AnonFilename
import typingsJapgolly.muiDatatables.AnonLookup
import typingsJapgolly.muiDatatables.AnonRowIndex
import typingsJapgolly.muiDatatables.AnonXAxis
import typingsJapgolly.muiDatatables.muiDatatablesStrings.chip
import typingsJapgolly.muiDatatables.muiDatatablesStrings.reset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var customFilterDialogFooter: js.UndefOr[js.Function1[/* filterList */ js.Array[_], Node]] = js.undefined
  var customFooter: js.UndefOr[
    js.Function5[
      /* rowCount */ Double, 
      /* page */ Double, 
      /* rowsPerPage */ Double, 
      /* changeRowsPerPage */ js.Function0[_], 
      /* changePage */ Double, 
      Node
    ]
  ] = js.undefined
  var customRowRender: js.UndefOr[
    js.Function3[/* data */ js.Array[_], /* dataIndex */ Double, /* rowIndex */ Double, Node]
  ] = js.undefined
  var customSearch: js.UndefOr[
    js.Function3[
      /* searchQuery */ String, 
      /* currentRow */ js.Array[_], 
      /* columns */ js.Array[_], 
      Boolean
    ]
  ] = js.undefined
  var customSearchRender: js.UndefOr[
    js.Function4[
      /* searchText */ String, 
      /* handleSearch */ js.Any, 
      /* hideSearch */ js.Any, 
      /* options */ js.Any, 
      (Component[js.Object, js.Object]) | Element
    ]
  ] = js.undefined
  var customSort: js.UndefOr[
    js.Function3[/* data */ js.Array[_], /* colIndex */ Double, /* order */ String, js.Array[_]]
  ] = js.undefined
  var customToolbar: js.UndefOr[js.Function0[Node]] = js.undefined
  var customToolbarSelect: js.UndefOr[
    js.Function3[
      /* selectedRows */ AnonLookup, 
      /* displayData */ js.Array[AnonDataDataIndex], 
      /* setSelectedRows */ js.Function1[/* rows */ js.Array[Double], Unit], 
      Node
    ]
  ] = js.undefined
  var disableToolbarSelect: js.UndefOr[Boolean] = js.undefined
  var download: js.UndefOr[Boolean] = js.undefined
  var downloadOptions: js.UndefOr[AnonFilename] = js.undefined
  var elevation: js.UndefOr[Double] = js.undefined
  var expandableRows: js.UndefOr[Boolean] = js.undefined
  var expandableRowsOnClick: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var filterType: js.UndefOr[FilterType] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  var fixedHeaderOptions: js.UndefOr[AnonXAxis] = js.undefined
  var isRowExpandable: js.UndefOr[
    js.Function2[
      /* dataIndex */ Double, 
      /* expandedRows */ js.UndefOr[MUIDataTableIsRowCheck], 
      Boolean
    ]
  ] = js.undefined
  var isRowSelectable: js.UndefOr[
    js.Function2[
      /* dataIndex */ Double, 
      /* selectedRows */ js.UndefOr[MUIDataTableIsRowCheck], 
      Boolean
    ]
  ] = js.undefined
  var onCellClick: js.UndefOr[js.Function2[/* colData */ js.Any, /* cellMeta */ AnonColIndex, Unit]] = js.undefined
  var onChangePage: js.UndefOr[js.Function1[/* currentPage */ Double, Unit]] = js.undefined
  var onChangeRowsPerPage: js.UndefOr[js.Function1[/* numberOfRows */ Double, Unit]] = js.undefined
  var onColumnSortChange: js.UndefOr[js.Function2[/* changedColumn */ String, /* direction */ String, Unit]] = js.undefined
  var onColumnViewChange: js.UndefOr[js.Function2[/* changedColumn */ String, /* action */ String, Unit]] = js.undefined
  /**
    * A callback function that triggers when the user downloads the CSV file.
    * In the callback, you can control what is written to the CSV file.
    * Return false to cancel download of file.
    */
  var onDownload: js.UndefOr[
    js.Function4[
      /* buildHead */ js.Function1[/* columns */ js.Any, String], 
      /* buildBody */ js.Function1[/* data */ js.Any, String], 
      /* columns */ js.Any, 
      /* data */ js.Any, 
      String | Boolean
    ]
  ] = js.undefined
  var onFilterChange: js.UndefOr[
    js.Function3[
      /* changedColumn */ String, 
      /* filterList */ js.Array[_], 
      /* type */ FilterType | chip | reset, 
      Unit
    ]
  ] = js.undefined
  var onFilterDialogClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFilterDialogOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onRowClick: js.UndefOr[js.Function2[/* rowData */ js.Array[String], /* rowMeta */ AnonRowIndex, Unit]] = js.undefined
  var onRowsDelete: js.UndefOr[js.Function1[/* rowsDeleted */ js.Array[_], Unit]] = js.undefined
  var onRowsExpand: js.UndefOr[
    js.Function2[/* currentRowsExpanded */ js.Array[_], /* allRowsExpanded */ js.Array[_], Unit]
  ] = js.undefined
  var onRowsSelect: js.UndefOr[
    js.Function2[/* currentRowsSelected */ js.Array[_], /* rowsSelected */ js.Array[_], Unit]
  ] = js.undefined
  var onSearchChange: js.UndefOr[js.Function1[/* searchText */ String, Unit]] = js.undefined
  var onSearchClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSearchOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTableChange: js.UndefOr[js.Function2[/* action */ String, /* tableState */ MUIDataTableState, Unit]] = js.undefined
  var onTableInit: js.UndefOr[js.Function2[/* action */ String, /* tableState */ MUIDataTableState, Unit]] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var pagination: js.UndefOr[Boolean] = js.undefined
  var print: js.UndefOr[Boolean] = js.undefined
  var renderExpandableRow: js.UndefOr[js.Function2[/* rowData */ js.Array[String], /* rowMeta */ AnonRowIndex, Node]] = js.undefined
  var resizableColumns: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[Responsive] = js.undefined
  var rowHover: js.UndefOr[Boolean] = js.undefined
  var rowsExpanded: js.UndefOr[js.Array[_]] = js.undefined
  var rowsPerPage: js.UndefOr[Double] = js.undefined
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.undefined
  var rowsSelected: js.UndefOr[js.Array[_]] = js.undefined
  var search: js.UndefOr[Boolean] = js.undefined
  var searchOpen: js.UndefOr[Boolean] = js.undefined
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  var searchText: js.UndefOr[String] = js.undefined
  var selectableRows: js.UndefOr[SelectableRows] = js.undefined
  var selectableRowsHeader: js.UndefOr[Boolean] = js.undefined
  var selectableRowsOnClick: js.UndefOr[Boolean] = js.undefined
  var serverSide: js.UndefOr[Boolean] = js.undefined
  var serverSideFilterList: js.UndefOr[js.Array[_]] = js.undefined
  var setRowProps: js.UndefOr[js.Function2[/* row */ js.Array[_], /* rowIndex */ Double, js.Object]] = js.undefined
  var setTableProps: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
  var sortFilterList: js.UndefOr[Boolean] = js.undefined
  var textLabels: js.UndefOr[MUIDataTableTextLabels] = js.undefined
  var viewColumns: js.UndefOr[Boolean] = js.undefined
}

object MUIDataTableOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    customFilterDialogFooter: /* filterList */ js.Array[js.Any] => CallbackTo[Node] = null,
    customFooter: (/* rowCount */ Double, /* page */ Double, /* rowsPerPage */ Double, /* changeRowsPerPage */ js.Function0[js.Any], /* changePage */ Double) => CallbackTo[Node] = null,
    customRowRender: (/* data */ js.Array[js.Any], /* dataIndex */ Double, /* rowIndex */ Double) => CallbackTo[Node] = null,
    customSearch: (/* searchQuery */ String, /* currentRow */ js.Array[js.Any], /* columns */ js.Array[js.Any]) => CallbackTo[Boolean] = null,
    customSearchRender: (/* searchText */ String, /* handleSearch */ js.Any, /* hideSearch */ js.Any, /* options */ js.Any) => CallbackTo[(Component[js.Object, js.Object]) | Element] = null,
    customSort: (/* data */ js.Array[js.Any], /* colIndex */ Double, /* order */ String) => CallbackTo[js.Array[js.Any]] = null,
    customToolbar: js.UndefOr[CallbackTo[Node]] = js.undefined,
    customToolbarSelect: (/* selectedRows */ AnonLookup, /* displayData */ js.Array[AnonDataDataIndex], /* setSelectedRows */ js.Function1[/* rows */ js.Array[Double], Unit]) => CallbackTo[Node] = null,
    disableToolbarSelect: js.UndefOr[Boolean] = js.undefined,
    download: js.UndefOr[Boolean] = js.undefined,
    downloadOptions: AnonFilename = null,
    elevation: Int | Double = null,
    expandableRows: js.UndefOr[Boolean] = js.undefined,
    expandableRowsOnClick: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterType: FilterType = null,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    fixedHeaderOptions: AnonXAxis = null,
    isRowExpandable: (/* dataIndex */ Double, /* expandedRows */ js.UndefOr[MUIDataTableIsRowCheck]) => CallbackTo[Boolean] = null,
    isRowSelectable: (/* dataIndex */ Double, /* selectedRows */ js.UndefOr[MUIDataTableIsRowCheck]) => CallbackTo[Boolean] = null,
    onCellClick: (/* colData */ js.Any, /* cellMeta */ AnonColIndex) => Callback = null,
    onChangePage: /* currentPage */ Double => Callback = null,
    onChangeRowsPerPage: /* numberOfRows */ Double => Callback = null,
    onColumnSortChange: (/* changedColumn */ String, /* direction */ String) => Callback = null,
    onColumnViewChange: (/* changedColumn */ String, /* action */ String) => Callback = null,
    onDownload: (/* buildHead */ js.Function1[/* columns */ js.Any, String], /* buildBody */ js.Function1[/* data */ js.Any, String], /* columns */ js.Any, /* data */ js.Any) => CallbackTo[String | Boolean] = null,
    onFilterChange: (/* changedColumn */ String, /* filterList */ js.Array[js.Any], /* type */ FilterType | chip | reset) => Callback = null,
    onFilterDialogClose: js.UndefOr[Callback] = js.undefined,
    onFilterDialogOpen: js.UndefOr[Callback] = js.undefined,
    onRowClick: (/* rowData */ js.Array[String], /* rowMeta */ AnonRowIndex) => Callback = null,
    onRowsDelete: /* rowsDeleted */ js.Array[js.Any] => Callback = null,
    onRowsExpand: (/* currentRowsExpanded */ js.Array[js.Any], /* allRowsExpanded */ js.Array[js.Any]) => Callback = null,
    onRowsSelect: (/* currentRowsSelected */ js.Array[js.Any], /* rowsSelected */ js.Array[js.Any]) => Callback = null,
    onSearchChange: /* searchText */ String => Callback = null,
    onSearchClose: js.UndefOr[Callback] = js.undefined,
    onSearchOpen: js.UndefOr[Callback] = js.undefined,
    onTableChange: (/* action */ String, /* tableState */ MUIDataTableState) => Callback = null,
    onTableInit: (/* action */ String, /* tableState */ MUIDataTableState) => Callback = null,
    page: Int | Double = null,
    pagination: js.UndefOr[Boolean] = js.undefined,
    print: js.UndefOr[Boolean] = js.undefined,
    renderExpandableRow: (/* rowData */ js.Array[String], /* rowMeta */ AnonRowIndex) => CallbackTo[Node] = null,
    resizableColumns: js.UndefOr[Boolean] = js.undefined,
    responsive: Responsive = null,
    rowHover: js.UndefOr[Boolean] = js.undefined,
    rowsExpanded: js.Array[_] = null,
    rowsPerPage: Int | Double = null,
    rowsPerPageOptions: js.Array[Double] = null,
    rowsSelected: js.Array[_] = null,
    search: js.UndefOr[Boolean] = js.undefined,
    searchOpen: js.UndefOr[Boolean] = js.undefined,
    searchPlaceholder: String = null,
    searchText: String = null,
    selectableRows: SelectableRows = null,
    selectableRowsHeader: js.UndefOr[Boolean] = js.undefined,
    selectableRowsOnClick: js.UndefOr[Boolean] = js.undefined,
    serverSide: js.UndefOr[Boolean] = js.undefined,
    serverSideFilterList: js.Array[_] = null,
    setRowProps: (/* row */ js.Array[js.Any], /* rowIndex */ Double) => CallbackTo[js.Object] = null,
    setTableProps: js.UndefOr[CallbackTo[js.Object]] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined,
    sortFilterList: js.UndefOr[Boolean] = js.undefined,
    textLabels: MUIDataTableTextLabels = null,
    viewColumns: js.UndefOr[Boolean] = js.undefined
  ): MUIDataTableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (customFilterDialogFooter != null) __obj.updateDynamic("customFilterDialogFooter")(js.Any.fromFunction1((t0: /* filterList */ js.Array[js.Any]) => customFilterDialogFooter(t0).runNow()))
    if (customFooter != null) __obj.updateDynamic("customFooter")(js.Any.fromFunction5((t0: /* rowCount */ scala.Double, t1: /* page */ scala.Double, t2: /* rowsPerPage */ scala.Double, t3: /* changeRowsPerPage */ js.Function0[js.Any], t4: /* changePage */ scala.Double) => customFooter(t0, t1, t2, t3, t4).runNow()))
    if (customRowRender != null) __obj.updateDynamic("customRowRender")(js.Any.fromFunction3((t0: /* data */ js.Array[js.Any], t1: /* dataIndex */ scala.Double, t2: /* rowIndex */ scala.Double) => customRowRender(t0, t1, t2).runNow()))
    if (customSearch != null) __obj.updateDynamic("customSearch")(js.Any.fromFunction3((t0: /* searchQuery */ java.lang.String, t1: /* currentRow */ js.Array[js.Any], t2: /* columns */ js.Array[js.Any]) => customSearch(t0, t1, t2).runNow()))
    if (customSearchRender != null) __obj.updateDynamic("customSearchRender")(js.Any.fromFunction4((t0: /* searchText */ java.lang.String, t1: /* handleSearch */ js.Any, t2: /* hideSearch */ js.Any, t3: /* options */ js.Any) => customSearchRender(t0, t1, t2, t3).runNow()))
    if (customSort != null) __obj.updateDynamic("customSort")(js.Any.fromFunction3((t0: /* data */ js.Array[js.Any], t1: /* colIndex */ scala.Double, t2: /* order */ java.lang.String) => customSort(t0, t1, t2).runNow()))
    customToolbar.foreach(p => __obj.updateDynamic("customToolbar")(p.toJsFn))
    if (customToolbarSelect != null) __obj.updateDynamic("customToolbarSelect")(js.Any.fromFunction3((t0: /* selectedRows */ typingsJapgolly.muiDatatables.AnonLookup, t1: /* displayData */ js.Array[typingsJapgolly.muiDatatables.AnonDataDataIndex], t2: /* setSelectedRows */ js.Function1[/* rows */ js.Array[scala.Double], scala.Unit]) => customToolbarSelect(t0, t1, t2).runNow()))
    if (!js.isUndefined(disableToolbarSelect)) __obj.updateDynamic("disableToolbarSelect")(disableToolbarSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (downloadOptions != null) __obj.updateDynamic("downloadOptions")(downloadOptions.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (!js.isUndefined(expandableRows)) __obj.updateDynamic("expandableRows")(expandableRows.asInstanceOf[js.Any])
    if (!js.isUndefined(expandableRowsOnClick)) __obj.updateDynamic("expandableRowsOnClick")(expandableRowsOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (fixedHeaderOptions != null) __obj.updateDynamic("fixedHeaderOptions")(fixedHeaderOptions.asInstanceOf[js.Any])
    if (isRowExpandable != null) __obj.updateDynamic("isRowExpandable")(js.Any.fromFunction2((t0: /* dataIndex */ scala.Double, t1: /* expandedRows */ js.UndefOr[typingsJapgolly.muiDatatables.mod.MUIDataTableIsRowCheck]) => isRowExpandable(t0, t1).runNow()))
    if (isRowSelectable != null) __obj.updateDynamic("isRowSelectable")(js.Any.fromFunction2((t0: /* dataIndex */ scala.Double, t1: /* selectedRows */ js.UndefOr[typingsJapgolly.muiDatatables.mod.MUIDataTableIsRowCheck]) => isRowSelectable(t0, t1).runNow()))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2((t0: /* colData */ js.Any, t1: /* cellMeta */ typingsJapgolly.muiDatatables.AnonColIndex) => onCellClick(t0, t1).runNow()))
    if (onChangePage != null) __obj.updateDynamic("onChangePage")(js.Any.fromFunction1((t0: /* currentPage */ scala.Double) => onChangePage(t0).runNow()))
    if (onChangeRowsPerPage != null) __obj.updateDynamic("onChangeRowsPerPage")(js.Any.fromFunction1((t0: /* numberOfRows */ scala.Double) => onChangeRowsPerPage(t0).runNow()))
    if (onColumnSortChange != null) __obj.updateDynamic("onColumnSortChange")(js.Any.fromFunction2((t0: /* changedColumn */ java.lang.String, t1: /* direction */ java.lang.String) => onColumnSortChange(t0, t1).runNow()))
    if (onColumnViewChange != null) __obj.updateDynamic("onColumnViewChange")(js.Any.fromFunction2((t0: /* changedColumn */ java.lang.String, t1: /* action */ java.lang.String) => onColumnViewChange(t0, t1).runNow()))
    if (onDownload != null) __obj.updateDynamic("onDownload")(js.Any.fromFunction4((t0: /* buildHead */ js.Function1[/* columns */ js.Any, java.lang.String], t1: /* buildBody */ js.Function1[/* data */ js.Any, java.lang.String], t2: /* columns */ js.Any, t3: /* data */ js.Any) => onDownload(t0, t1, t2, t3).runNow()))
    if (onFilterChange != null) __obj.updateDynamic("onFilterChange")(js.Any.fromFunction3((t0: /* changedColumn */ java.lang.String, t1: /* filterList */ js.Array[js.Any], t2: /* type */ typingsJapgolly.muiDatatables.mod.FilterType | typingsJapgolly.muiDatatables.muiDatatablesStrings.chip | typingsJapgolly.muiDatatables.muiDatatablesStrings.reset) => onFilterChange(t0, t1, t2).runNow()))
    onFilterDialogClose.foreach(p => __obj.updateDynamic("onFilterDialogClose")(p.toJsFn))
    onFilterDialogOpen.foreach(p => __obj.updateDynamic("onFilterDialogOpen")(p.toJsFn))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2((t0: /* rowData */ js.Array[java.lang.String], t1: /* rowMeta */ typingsJapgolly.muiDatatables.AnonRowIndex) => onRowClick(t0, t1).runNow()))
    if (onRowsDelete != null) __obj.updateDynamic("onRowsDelete")(js.Any.fromFunction1((t0: /* rowsDeleted */ js.Array[js.Any]) => onRowsDelete(t0).runNow()))
    if (onRowsExpand != null) __obj.updateDynamic("onRowsExpand")(js.Any.fromFunction2((t0: /* currentRowsExpanded */ js.Array[js.Any], t1: /* allRowsExpanded */ js.Array[js.Any]) => onRowsExpand(t0, t1).runNow()))
    if (onRowsSelect != null) __obj.updateDynamic("onRowsSelect")(js.Any.fromFunction2((t0: /* currentRowsSelected */ js.Array[js.Any], t1: /* rowsSelected */ js.Array[js.Any]) => onRowsSelect(t0, t1).runNow()))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction1((t0: /* searchText */ java.lang.String) => onSearchChange(t0).runNow()))
    onSearchClose.foreach(p => __obj.updateDynamic("onSearchClose")(p.toJsFn))
    onSearchOpen.foreach(p => __obj.updateDynamic("onSearchOpen")(p.toJsFn))
    if (onTableChange != null) __obj.updateDynamic("onTableChange")(js.Any.fromFunction2((t0: /* action */ java.lang.String, t1: /* tableState */ typingsJapgolly.muiDatatables.mod.MUIDataTableState) => onTableChange(t0, t1).runNow()))
    if (onTableInit != null) __obj.updateDynamic("onTableInit")(js.Any.fromFunction2((t0: /* action */ java.lang.String, t1: /* tableState */ typingsJapgolly.muiDatatables.mod.MUIDataTableState) => onTableInit(t0, t1).runNow()))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print.asInstanceOf[js.Any])
    if (renderExpandableRow != null) __obj.updateDynamic("renderExpandableRow")(js.Any.fromFunction2((t0: /* rowData */ js.Array[java.lang.String], t1: /* rowMeta */ typingsJapgolly.muiDatatables.AnonRowIndex) => renderExpandableRow(t0, t1).runNow()))
    if (!js.isUndefined(resizableColumns)) __obj.updateDynamic("resizableColumns")(resizableColumns.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHover)) __obj.updateDynamic("rowHover")(rowHover.asInstanceOf[js.Any])
    if (rowsExpanded != null) __obj.updateDynamic("rowsExpanded")(rowsExpanded.asInstanceOf[js.Any])
    if (rowsPerPage != null) __obj.updateDynamic("rowsPerPage")(rowsPerPage.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions.asInstanceOf[js.Any])
    if (rowsSelected != null) __obj.updateDynamic("rowsSelected")(rowsSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(searchOpen)) __obj.updateDynamic("searchOpen")(searchOpen.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    if (selectableRows != null) __obj.updateDynamic("selectableRows")(selectableRows.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableRowsHeader)) __obj.updateDynamic("selectableRowsHeader")(selectableRowsHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableRowsOnClick)) __obj.updateDynamic("selectableRowsOnClick")(selectableRowsOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(serverSide)) __obj.updateDynamic("serverSide")(serverSide.asInstanceOf[js.Any])
    if (serverSideFilterList != null) __obj.updateDynamic("serverSideFilterList")(serverSideFilterList.asInstanceOf[js.Any])
    if (setRowProps != null) __obj.updateDynamic("setRowProps")(js.Any.fromFunction2((t0: /* row */ js.Array[js.Any], t1: /* rowIndex */ scala.Double) => setRowProps(t0, t1).runNow()))
    setTableProps.foreach(p => __obj.updateDynamic("setTableProps")(p.toJsFn))
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(sortFilterList)) __obj.updateDynamic("sortFilterList")(sortFilterList.asInstanceOf[js.Any])
    if (textLabels != null) __obj.updateDynamic("textLabels")(textLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(viewColumns)) __obj.updateDynamic("viewColumns")(viewColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableOptions]
  }
}

