package typingsJapgolly.materialUiDatatables.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialUiDatatables.materialUiDatatablesStrings.filter
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableProps extends js.Object {
  /**
    * The column structure.
    * ```let columns: Column[] = [{
    *      key: 'bookName',
    *      label: 'Book Name & Author',
    *      render: (__value: any, book: any) => book.name + ' by ' book.author
    *  },```
    */
  var columns: js.Array[Column]
  var count: Double
  /** The array of objects used as data for the table */
  var data: js.Array[_]
  /** If clicking away de-selects all */
  var deselectOnClickaway: Boolean
  /** Adds a select all button */
  var enableSelectAll: Boolean
  /** Filter hint text */
  var filterHintText: String
   // BUG https://github.com/Microsoft/TypeScript/issues/11465
  /** The current filter value */
  var filterValue: String
  /** If the footer should be fixed */
  var fixedFooter: Boolean
  /** If the header should be fixed */
  var fixedHeader: Boolean
  /** React Style object applied to footer toolbar */
  var footerToolbarStyle: CSSProperties
  /** 'default' or 'filter', filter mode shows a search box to reduce visible rows */
  var headerToolbarMode: typingsJapgolly.materialUiDatatables.materialUiDatatablesStrings.default | filter | String
  /** The hight of the table */
  var height: js.Any
  /** If multiple table rows are select-able */
  var multiSelectable: Boolean
  var page: Double
  var rowSize: Double
  var rowSizeLabel: String
  var rowSizeList: js.Array[Double]
  /** If the table rows are select-able */
  var selectable: Boolean
  /** Show check-boxes for selected rows */
  var showCheckboxes: Boolean
  /** Shows a footer toolbar */
  var showFooterToolbar: Boolean
  /** Shows a header toolbar */
  var showHeaderToolbar: Boolean
  /** Show the icon to turn on the filtering feature */
  var showHeaderToolbarFilterIcon: Boolean
  /** Display a hover in the row under the mouse */
  var showRowHover: Boolean
  var showRowSizeControls: Boolean
  /** To display striped rows in the table */
  var stripedRows: Boolean
  /** React style object for the tbody tag */
  var tableBodyStyle: CSSProperties
  /** React style object for the th/td tag */
  var tableHeaderColumnStyle: CSSProperties
  /** React style object for the th tag */
  var tableHeaderStyle: CSSProperties
  /** React style object for the tr/td tag */
  var tableRowColumnStyle: CSSProperties
  /** React style object for the tr tag */
  var tableRowStyle: CSSProperties
  /** React style object for the table tag */
  var tableStyle: CSSProperties
  var tableWrapperStyle: CSSProperties
  /** Table title */
  var title: String
  /** React Style object for the title */
  var titleStyle: CSSProperties
  var toolbarIconRight: js.Any
  /** Callback when the cell is clicked. This callback is only active when selectable is false. */
  def onCellClick(rowIndex: Double, columnIndex: Double, row: js.Any, columnValue: js.Any, event: js.Any): Unit
  /** Similar to onCellClick, activated when the cell is double clicked. Fires even if rows are selectable. */
  def onCellDoubleClick(rowIndex: Double, columnIndex: Double, row: js.Any, columnValue: js.Any, event: js.Any): Unit
  /** Notification if the filter value changes */
  def onFilterValueChange(value: String): Unit
  def onNextPageClick(event: js.Any): Unit
  def onPreviousPageClick(event: js.Any): Unit
  def onRowSelection(selectedRows: js.Any): Unit
  def onRowSizeChange(index: Double, value: js.Any): Unit
  def onSortOrderChange(key: String, order: String): Unit
  /** Override the pagination display, ie. "1 - 5 of 11" Return any React node or string */
  def summaryLabelTemplate(start: Double, end: Double, count: Double): js.Any
}

object DataTableProps {
  @scala.inline
  def apply(
    columns: js.Array[Column],
    count: Double,
    data: js.Array[_],
    deselectOnClickaway: Boolean,
    enableSelectAll: Boolean,
    filterHintText: String,
    filterValue: String,
    fixedFooter: Boolean,
    fixedHeader: Boolean,
    footerToolbarStyle: CSSProperties,
    headerToolbarMode: typingsJapgolly.materialUiDatatables.materialUiDatatablesStrings.default | filter | String,
    height: js.Any,
    multiSelectable: Boolean,
    onCellClick: (Double, Double, js.Any, js.Any, js.Any) => Callback,
    onCellDoubleClick: (Double, Double, js.Any, js.Any, js.Any) => Callback,
    onFilterValueChange: String => Callback,
    onNextPageClick: js.Any => Callback,
    onPreviousPageClick: js.Any => Callback,
    onRowSelection: js.Any => Callback,
    onRowSizeChange: (Double, js.Any) => Callback,
    onSortOrderChange: (String, String) => Callback,
    page: Double,
    rowSize: Double,
    rowSizeLabel: String,
    rowSizeList: js.Array[Double],
    selectable: Boolean,
    showCheckboxes: Boolean,
    showFooterToolbar: Boolean,
    showHeaderToolbar: Boolean,
    showHeaderToolbarFilterIcon: Boolean,
    showRowHover: Boolean,
    showRowSizeControls: Boolean,
    stripedRows: Boolean,
    summaryLabelTemplate: (Double, Double, Double) => CallbackTo[js.Any],
    tableBodyStyle: CSSProperties,
    tableHeaderColumnStyle: CSSProperties,
    tableHeaderStyle: CSSProperties,
    tableRowColumnStyle: CSSProperties,
    tableRowStyle: CSSProperties,
    tableStyle: CSSProperties,
    tableWrapperStyle: CSSProperties,
    title: String,
    titleStyle: CSSProperties,
    toolbarIconRight: js.Any
  ): DataTableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deselectOnClickaway = deselectOnClickaway.asInstanceOf[js.Any], enableSelectAll = enableSelectAll.asInstanceOf[js.Any], filterHintText = filterHintText.asInstanceOf[js.Any], filterValue = filterValue.asInstanceOf[js.Any], fixedFooter = fixedFooter.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any], footerToolbarStyle = footerToolbarStyle.asInstanceOf[js.Any], headerToolbarMode = headerToolbarMode.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], multiSelectable = multiSelectable.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowSize = rowSize.asInstanceOf[js.Any], rowSizeLabel = rowSizeLabel.asInstanceOf[js.Any], rowSizeList = rowSizeList.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], showCheckboxes = showCheckboxes.asInstanceOf[js.Any], showFooterToolbar = showFooterToolbar.asInstanceOf[js.Any], showHeaderToolbar = showHeaderToolbar.asInstanceOf[js.Any], showHeaderToolbarFilterIcon = showHeaderToolbarFilterIcon.asInstanceOf[js.Any], showRowHover = showRowHover.asInstanceOf[js.Any], showRowSizeControls = showRowSizeControls.asInstanceOf[js.Any], stripedRows = stripedRows.asInstanceOf[js.Any], tableBodyStyle = tableBodyStyle.asInstanceOf[js.Any], tableHeaderColumnStyle = tableHeaderColumnStyle.asInstanceOf[js.Any], tableHeaderStyle = tableHeaderStyle.asInstanceOf[js.Any], tableRowColumnStyle = tableRowColumnStyle.asInstanceOf[js.Any], tableRowStyle = tableRowStyle.asInstanceOf[js.Any], tableStyle = tableStyle.asInstanceOf[js.Any], tableWrapperStyle = tableWrapperStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any], toolbarIconRight = toolbarIconRight.asInstanceOf[js.Any])
    __obj.updateDynamic("onCellClick")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: js.Any, t3: js.Any, t4: js.Any) => onCellClick(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("onCellDoubleClick")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: js.Any, t3: js.Any, t4: js.Any) => onCellDoubleClick(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("onFilterValueChange")(js.Any.fromFunction1((t0: java.lang.String) => onFilterValueChange(t0).runNow()))
    __obj.updateDynamic("onNextPageClick")(js.Any.fromFunction1((t0: js.Any) => onNextPageClick(t0).runNow()))
    __obj.updateDynamic("onPreviousPageClick")(js.Any.fromFunction1((t0: js.Any) => onPreviousPageClick(t0).runNow()))
    __obj.updateDynamic("onRowSelection")(js.Any.fromFunction1((t0: js.Any) => onRowSelection(t0).runNow()))
    __obj.updateDynamic("onRowSizeChange")(js.Any.fromFunction2((t0: scala.Double, t1: js.Any) => onRowSizeChange(t0, t1).runNow()))
    __obj.updateDynamic("onSortOrderChange")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => onSortOrderChange(t0, t1).runNow()))
    __obj.updateDynamic("summaryLabelTemplate")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => summaryLabelTemplate(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DataTableProps]
  }
}

