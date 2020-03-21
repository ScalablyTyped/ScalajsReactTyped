package typingsJapgolly.reactDataGrid.AdazzleReactDataGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactDataGrid.AnonEnableShiftSelect
import typingsJapgolly.reactDataGrid.AnonIdx
import typingsJapgolly.reactDataGrid.reactDataGridStrings.ASC
import typingsJapgolly.reactDataGrid.reactDataGridStrings.DESC
import typingsJapgolly.reactDataGrid.reactDataGridStrings.NONE
import typingsJapgolly.reactDataGrid.reactDataGridStrings.changeRow
import typingsJapgolly.reactDataGrid.reactDataGridStrings.loopOverRow
import typingsJapgolly.reactDataGrid.reactDataGridStrings.multi
import typingsJapgolly.reactDataGrid.reactDataGridStrings.none_
import typingsJapgolly.reactDataGrid.reactDataGridStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps[T] extends js.Object {
  /**
    * Controls what happens when the user navigates beyond the first or last cells.
    * 'loopOverRow' will navigate to the beginning/end of the current row.
    * 'changeRow' will navigate to the beginning of the next row or the end of the last.
    * 'none' will do nothing.
    * @default none
    */
  var cellNavigationMode: js.UndefOr[none_ | loopOverRow | changeRow] = js.undefined
  /**
    * The columns to render.
    */
  var columns: js.UndefOr[js.Array[Column[T]]] = js.undefined
  /**
    * A context menu to disiplay when the user right-clicks a cell.
    * Consider using "react-contextmenu", included in "react-data-grid/addons".
    */
  var contextMenu: js.UndefOr[Element] = js.undefined
  /**
    * A component to display when there are no rows to render.
    */
  var emptyRowsView: js.UndefOr[ComponentClassP[js.Object] | StatelessComponent[_]] = js.undefined
  /**
    * Enables cells to be selected when clicked.
    * @default false
    */
  var enableCellSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables cells to be dragged and dropped
    * @default false
    */
  var enableDragAndDrop: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to true or 'multi', enables multiple row select.
    * When set to 'single', enables single row select.
    * When set to false or not set, disables row select.
    * @default false
    */
  var enableRowSelect: js.UndefOr[Boolean | single | multi] = js.undefined
  var getCellActions: js.UndefOr[
    js.Function2[/* column */ Column[T], /* row */ T, js.Array[ActionButton | ActionMenu]]
  ] = js.undefined
  var getSubRowDetails: js.UndefOr[js.Function1[/* row */ T, SubRowDetails[_]]] = js.undefined
  /**
    * Responsible for returning an Array of values that can be used for filtering
    * a column that is column.filterable and using a column.filterRenderer that
    * displays a list of options.
    * @param columnKey the column key that we are looking to pull values from
    */
  var getValidFilterValues: js.UndefOr[js.Function1[/* columnKey */ String, js.Array[_]]] = js.undefined
  /**
    * The height of the header filter row in pixels.
    * @default 45
    */
  var headerFiltersHeight: js.UndefOr[Double] = js.undefined
  /**
    * The height of the header row in pixels.
    * @default rowHeight
    */
  var headerRowHeight: js.UndefOr[Double] = js.undefined
  /**
    * The minimum width of each column in pixels.
    * @default 80
    */
  var minColumnWidth: js.UndefOr[Double] = js.undefined
  /**
    * The minimum height of the entire grid in pixels.
    * @default 350
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  /**
    * The minimum width of the entire grid in pixels.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * Called when the user filters a column by some value.
    * Should restrict the rows in rowGetter to only things that match the filter.
    * @param filter The filter being added
    */
  var onAddFilter: js.UndefOr[js.Function1[/* filter */ Filter, Unit]] = js.undefined
  /**
    * Invoked when the user copies a value from one cell and pastes it into another (in the same column).
    * Should update the value of the cell in row e.toRow.
    * @param e Information about the event
    */
  var onCellCopyPaste: js.UndefOr[js.Function1[/* e */ CellCopyPasteEvent, Unit]] = js.undefined
  /**
    * Called when a cell is deselected.
    * @param coordinates The row and column indices of the deselected cell.
    */
  var onCellDeSelected: js.UndefOr[js.Function1[/* coordinates */ AnonIdx, Unit]] = js.undefined
  /**
    * Invoked when the user clicks on one cell to expand it.
    * @param e Information about the event
    */
  var onCellExpand: js.UndefOr[js.Function1[/* e */ CellExpandEvent[T], Unit]] = js.undefined
  /**
    * Called when a cell is selected.
    * @param coordinates The row and column indices of the selected cell.
    */
  var onCellSelected: js.UndefOr[js.Function1[/* coordinates */ AnonIdx, Unit]] = js.undefined
  /**
    * Invoked when the user pulls down the drag handle of an editable cell.
    * Should update the values of the selected cells.
    * @param e Information about the event
    */
  var onCellsDragged: js.UndefOr[js.Function1[/* e */ CellDragEvent, Unit]] = js.undefined
  /**
    * Called when the user clears all filters.
    * Should restore the rows in rowGetter to their original state.
    */
  var onClearFilters: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Invoked when a column has been resized.
    * @param index The index of the column
    * @param width The new width of the column
    */
  var onColumnResize: js.UndefOr[js.Function2[/* index */ Double, /* width */ Double, Unit]] = js.undefined
  /**
    * Invoked when the user double clicks on the drag handle of an editable cell.
    * Should update the values of the cells beneath the selected cell.
    * @param e Information about the event
    */
  var onDragHandleDoubleClick: js.UndefOr[js.Function1[/* e */ DragHandleDoubleClickEvent[T], Unit]] = js.undefined
  /**
    * Invoked after the user updates the grid rows in any way.
    * @param e Information about the event
    */
  var onGridRowsUpdated: js.UndefOr[js.Function1[/* e */ GridRowsUpdatedEvent[T], Unit]] = js.undefined
  /**
    * Called when the user sorts the grid by some column.
    * Should update the order of the rows returned by rowGetter.
    * @param sortColumn The name of the column being sorted by
    * @param sortDirection The direction to sort ('ASC'/'DESC'/'NONE')
    */
  var onGridSort: js.UndefOr[
    js.Function2[/* sortColumn */ String, /* sortDirection */ ASC | DESC | NONE, Unit]
  ] = js.undefined
  /**
    * An event function called when a row is clicked.
    * Clicking the header row will trigger a call with -1 for the rowIdx.
    * @param rowIdx zero index number of row clicked
    * @param row object behind the row
    */
  var onRowClick: js.UndefOr[js.Function2[/* rowIdx */ Double, /* row */ T, Unit]] = js.undefined
  /**
    * An event function called when a row is expanded with the toggle
    * @param props OnRowExpandToggle object
    */
  var onRowExpandToggle: js.UndefOr[js.Function1[/* props */ OnRowExpandToggle, Unit]] = js.undefined
  /**
    * Called when a row is selected.
    * @param rows The (complete) current selection of rows.
    */
  var onRowSelect: js.UndefOr[js.Function1[/* rows */ js.Array[T], Unit]] = js.undefined
  /**
    * Invoked when the user changes the value of a single cell.
    * Should update that cell's value.
    * @param e Information about the event
    */
  var onRowUpdated: js.UndefOr[js.Function1[/* e */ RowUpdateEvent[T], Unit]] = js.undefined
  /**
    * Called when the grid is scrolled
    */
  var onScroll: js.UndefOr[js.Function1[/* scrollState */ ScrollState, Unit]] = js.undefined
  /**
    * A custom formatter for select row column
    * @default AdazzleReactDataGridPlugins.Editors.CheckboxEditor
    */
  var rowActionsCell: js.UndefOr[ComponentClassP[js.Object] | StatelessComponent[_]] = js.undefined
  /**
    * Gets the data to render in each row. Required.
    * Can be an array or a function that takes an index and returns an object.
    */
  var rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ Double, T])
  /**
    * A react component to customize how the grouping header row is rendered
    */
  var rowGroupRenderer: js.UndefOr[ComponentType[js.Object]] = js.undefined
  /**
    * The height of each individual row in pixels.
    * @default 35
    */
  var rowHeight: js.UndefOr[Double] = js.undefined
  /**
    * A property that's unique to every row.
    * This property is required to enable row selection.
    * @default 'id'
    */
  var rowKey: js.UndefOr[String] = js.undefined
  /**
    * A react component to customize how rows are rendered.
    * If you want to define your own, consider extending ReactDataGrid.Row.
    */
  var rowRenderer: js.UndefOr[Element | ComponentClassP[js.Object] | StatelessComponent[_]] = js.undefined
  /**
    * How long to wait before rendering a new row while scrolling in milliseconds.
    * @default 0
    */
  var rowScrollTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Options object for selecting rows
    */
  var rowSelection: js.UndefOr[AnonEnableShiftSelect[T]] = js.undefined
  /**
    * The total number of rows to render. Required.
    */
  var rowsCount: Double
  /**
    * A custom formatter for the select all checkbox cell
    * @default react-data-grid/src/formatters/SelectAll.js
    */
  var selectAllRenderer: js.UndefOr[ComponentClassP[js.Object] | StatelessComponent[_]] = js.undefined
  /**
    * key of the initial sorted column
    */
  var sortColumn: js.UndefOr[String] = js.undefined
  /**
    * Initial sorting direction
    */
  var sortDirection: js.UndefOr[ASC | DESC | NONE] = js.undefined
  /**
    * A toolbar to display above the grid.
    * Consider using the toolbar included in "react-data-grid/addons".
    */
  var toolbar: js.UndefOr[Element] = js.undefined
}

object GridProps {
  @scala.inline
  def apply[T](
    rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ Double, T]),
    rowsCount: Double,
    cellNavigationMode: none_ | loopOverRow | changeRow = null,
    columns: js.Array[Column[T]] = null,
    contextMenu: VdomElement = null,
    emptyRowsView: ComponentClassP[js.Object] | StatelessComponent[_] = null,
    enableCellSelect: js.UndefOr[Boolean] = js.undefined,
    enableDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    enableRowSelect: Boolean | single | multi = null,
    getCellActions: (/* column */ Column[T], /* row */ T) => CallbackTo[js.Array[ActionButton | ActionMenu]] = null,
    getSubRowDetails: /* row */ T => CallbackTo[SubRowDetails[js.Any]] = null,
    getValidFilterValues: /* columnKey */ String => CallbackTo[js.Array[js.Any]] = null,
    headerFiltersHeight: Int | Double = null,
    headerRowHeight: Int | Double = null,
    minColumnWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    onAddFilter: /* filter */ Filter => Callback = null,
    onCellCopyPaste: /* e */ CellCopyPasteEvent => Callback = null,
    onCellDeSelected: /* coordinates */ AnonIdx => Callback = null,
    onCellExpand: /* e */ CellExpandEvent[T] => Callback = null,
    onCellSelected: /* coordinates */ AnonIdx => Callback = null,
    onCellsDragged: /* e */ CellDragEvent => Callback = null,
    onClearFilters: js.UndefOr[Callback] = js.undefined,
    onColumnResize: (/* index */ Double, /* width */ Double) => Callback = null,
    onDragHandleDoubleClick: /* e */ DragHandleDoubleClickEvent[T] => Callback = null,
    onGridRowsUpdated: /* e */ GridRowsUpdatedEvent[T] => Callback = null,
    onGridSort: (/* sortColumn */ String, /* sortDirection */ ASC | DESC | NONE) => Callback = null,
    onRowClick: (/* rowIdx */ Double, /* row */ T) => Callback = null,
    onRowExpandToggle: /* props */ OnRowExpandToggle => Callback = null,
    onRowSelect: /* rows */ js.Array[T] => Callback = null,
    onRowUpdated: /* e */ RowUpdateEvent[T] => Callback = null,
    onScroll: /* scrollState */ ScrollState => Callback = null,
    rowActionsCell: ComponentClassP[js.Object] | StatelessComponent[_] = null,
    rowGroupRenderer: ComponentType[js.Object] = null,
    rowHeight: Int | Double = null,
    rowKey: String = null,
    rowRenderer: Element | ComponentClassP[js.Object] | StatelessComponent[_] = null,
    rowScrollTimeout: Int | Double = null,
    rowSelection: AnonEnableShiftSelect[T] = null,
    selectAllRenderer: ComponentClassP[js.Object] | StatelessComponent[_] = null,
    sortColumn: String = null,
    sortDirection: ASC | DESC | NONE = null,
    toolbar: VdomElement = null
  ): GridProps[T] = {
    val __obj = js.Dynamic.literal(rowGetter = rowGetter.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any])
    if (cellNavigationMode != null) __obj.updateDynamic("cellNavigationMode")(cellNavigationMode.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.rawElement.asInstanceOf[js.Any])
    if (emptyRowsView != null) __obj.updateDynamic("emptyRowsView")(emptyRowsView.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellSelect)) __obj.updateDynamic("enableCellSelect")(enableCellSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDragAndDrop)) __obj.updateDynamic("enableDragAndDrop")(enableDragAndDrop.asInstanceOf[js.Any])
    if (enableRowSelect != null) __obj.updateDynamic("enableRowSelect")(enableRowSelect.asInstanceOf[js.Any])
    if (getCellActions != null) __obj.updateDynamic("getCellActions")(js.Any.fromFunction2((t0: /* column */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.Column[T], t1: /* row */ T) => getCellActions(t0, t1).runNow()))
    if (getSubRowDetails != null) __obj.updateDynamic("getSubRowDetails")(js.Any.fromFunction1((t0: /* row */ T) => getSubRowDetails(t0).runNow()))
    if (getValidFilterValues != null) __obj.updateDynamic("getValidFilterValues")(js.Any.fromFunction1((t0: /* columnKey */ java.lang.String) => getValidFilterValues(t0).runNow()))
    if (headerFiltersHeight != null) __obj.updateDynamic("headerFiltersHeight")(headerFiltersHeight.asInstanceOf[js.Any])
    if (headerRowHeight != null) __obj.updateDynamic("headerRowHeight")(headerRowHeight.asInstanceOf[js.Any])
    if (minColumnWidth != null) __obj.updateDynamic("minColumnWidth")(minColumnWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onAddFilter != null) __obj.updateDynamic("onAddFilter")(js.Any.fromFunction1((t0: /* filter */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.Filter) => onAddFilter(t0).runNow()))
    if (onCellCopyPaste != null) __obj.updateDynamic("onCellCopyPaste")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.CellCopyPasteEvent) => onCellCopyPaste(t0).runNow()))
    if (onCellDeSelected != null) __obj.updateDynamic("onCellDeSelected")(js.Any.fromFunction1((t0: /* coordinates */ typingsJapgolly.reactDataGrid.AnonIdx) => onCellDeSelected(t0).runNow()))
    if (onCellExpand != null) __obj.updateDynamic("onCellExpand")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.CellExpandEvent[T]) => onCellExpand(t0).runNow()))
    if (onCellSelected != null) __obj.updateDynamic("onCellSelected")(js.Any.fromFunction1((t0: /* coordinates */ typingsJapgolly.reactDataGrid.AnonIdx) => onCellSelected(t0).runNow()))
    if (onCellsDragged != null) __obj.updateDynamic("onCellsDragged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.CellDragEvent) => onCellsDragged(t0).runNow()))
    onClearFilters.foreach(p => __obj.updateDynamic("onClearFilters")(p.toJsFn))
    if (onColumnResize != null) __obj.updateDynamic("onColumnResize")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* width */ scala.Double) => onColumnResize(t0, t1).runNow()))
    if (onDragHandleDoubleClick != null) __obj.updateDynamic("onDragHandleDoubleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.DragHandleDoubleClickEvent[T]) => onDragHandleDoubleClick(t0).runNow()))
    if (onGridRowsUpdated != null) __obj.updateDynamic("onGridRowsUpdated")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.GridRowsUpdatedEvent[T]) => onGridRowsUpdated(t0).runNow()))
    if (onGridSort != null) __obj.updateDynamic("onGridSort")(js.Any.fromFunction2((t0: /* sortColumn */ java.lang.String, t1: /* sortDirection */ typingsJapgolly.reactDataGrid.reactDataGridStrings.ASC | typingsJapgolly.reactDataGrid.reactDataGridStrings.DESC | typingsJapgolly.reactDataGrid.reactDataGridStrings.NONE) => onGridSort(t0, t1).runNow()))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2((t0: /* rowIdx */ scala.Double, t1: /* row */ T) => onRowClick(t0, t1).runNow()))
    if (onRowExpandToggle != null) __obj.updateDynamic("onRowExpandToggle")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.OnRowExpandToggle) => onRowExpandToggle(t0).runNow()))
    if (onRowSelect != null) __obj.updateDynamic("onRowSelect")(js.Any.fromFunction1((t0: /* rows */ js.Array[T]) => onRowSelect(t0).runNow()))
    if (onRowUpdated != null) __obj.updateDynamic("onRowUpdated")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.RowUpdateEvent[T]) => onRowUpdated(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* scrollState */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ScrollState) => onScroll(t0).runNow()))
    if (rowActionsCell != null) __obj.updateDynamic("rowActionsCell")(rowActionsCell.asInstanceOf[js.Any])
    if (rowGroupRenderer != null) __obj.updateDynamic("rowGroupRenderer")(rowGroupRenderer.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(rowRenderer.asInstanceOf[js.Any])
    if (rowScrollTimeout != null) __obj.updateDynamic("rowScrollTimeout")(rowScrollTimeout.asInstanceOf[js.Any])
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection.asInstanceOf[js.Any])
    if (selectAllRenderer != null) __obj.updateDynamic("selectAllRenderer")(selectAllRenderer.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps[T]]
  }
}

