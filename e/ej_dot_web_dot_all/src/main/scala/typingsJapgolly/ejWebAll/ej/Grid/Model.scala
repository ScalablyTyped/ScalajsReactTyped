package typingsJapgolly.ejWebAll.ej.Grid

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered for every grid action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
  /** Triggered for every grid action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
  /** Triggered for every grid action server failure event.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to customizing cell based on our needs.
    * @Default {false}
    */
  var allowCellMerging: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic filtering behavior on grid. Filtering can be used to limit the records displayed using required criteria and this can
    * be further customized through â€œfilterSettingsâ€ property
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic grouping behavior. Grouping can be done by drag on drop desired columns to gridâ€™s GroupDropArea. This can be
    * further customized through â€œgroupSettingsâ€ property.
    * @Default {false}
    */
  var allowGrouping: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable keyboard support for performing grid actions. selectionType â€“ Gets or sets a value that indicates whether to enable single
    * row or multiple rows selection behavior in grid. Multiple selection can be done through by holding CTRL and clicking the grid rows
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable multi columns sorting behavior in grid. Sort multiple columns by holding CTRL and click on the corresponding column header.
    * @Default {false}
    */
  var allowMultiSorting: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the multiple exporting behavior on grid data.
    * @Default {false}
    */
  var allowMultipleExporting: js.UndefOr[Boolean] = js.undefined
  /** This specifies the grid to show the paginated data. Also enables pager control at the bottom of grid for dynamic navigation through data source. Paging can be further customized
    * through â€œpageSettingsâ€ property.
    * @Default {false}
    */
  var allowPaging: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the columns reordering behavior in the grid. Reordering can be done through by drag and drop the particular column from one
    * index to another index within the grid.
    * @Default {false}
    */
  var allowReordering: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the column is non resizable. Column width is set automatically based on the content or header text which is large.
    * @Default {false}
    */
  var allowResizeToFit: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic resizable of columns. Resize the width of the columns by simply click and move the particular column header line
    * @Default {false}
    */
  var allowResizing: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the rows reordering in Grid and drag &amp; drop rows between multiple Grid.
    * @Default {false}
    */
  var allowRowDragAndDrop: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the scrollbar in the grid and view the records by scroll through the grid manually
    * @Default {false}
    */
  var allowScrolling: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic searching behavior in grid. Currently search box can be enabled through â€œtoolbarSettingsâ€
    * @Default {false}
    */
  var allowSearching: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether user can select rows on grid. On enabling feature, selected row will be highlighted.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the dynamic sorting behavior on grid data. Sorting can be done through clicking on particular column header.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the Content will wrap to the next line if the content exceeds the boundary of the Column Cells.
    * @Default {false}
    */
  var allowTextWrap: js.UndefOr[Boolean] = js.undefined
  /** Triggered when record batch add.
    */
  var batchAdd: js.UndefOr[js.Function1[/* e */ BatchAddEventArgs, Unit]] = js.undefined
  /** Triggered when record batch delete.
    */
  var batchDelete: js.UndefOr[js.Function1[/* e */ BatchDeleteEventArgs, Unit]] = js.undefined
  /** Triggered before the batch add.
    */
  var beforeBatchAdd: js.UndefOr[js.Function1[/* e */ BeforeBatchAddEventArgs, Unit]] = js.undefined
  /** Triggered before the batch delete.
    */
  var beforeBatchDelete: js.UndefOr[js.Function1[/* e */ BeforeBatchDeleteEventArgs, Unit]] = js.undefined
  /** Triggered before the batch save.
    */
  var beforeBatchSave: js.UndefOr[js.Function1[/* e */ BeforeBatchSaveEventArgs, Unit]] = js.undefined
  /** Triggered before the print.
    */
  var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, Unit]] = js.undefined
  /** Triggered before row drop in the grid
    */
  var beforeRowDrop: js.UndefOr[js.Function1[/* e */ BeforeRowDropEventArgs, Unit]] = js.undefined
  /** Triggered before the record is going to be edited.
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.undefined
  /** Triggered after the cell is deselected.
    */
  var cellDeselected: js.UndefOr[js.Function1[/* e */ CellDeselectedEventArgs, Unit]] = js.undefined
  /** Triggered before the cell is going to be deselected.
    */
  var cellDeselecting: js.UndefOr[js.Function1[/* e */ CellDeselectingEventArgs, Unit]] = js.undefined
  /** Triggered when record cell edit.
    */
  var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, Unit]] = js.undefined
  /** Triggered when record cell save.
    */
  var cellSave: js.UndefOr[js.Function1[/* e */ CellSaveEventArgs, Unit]] = js.undefined
  /** Triggered after the cell is selected.
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.undefined
  /** Triggered before the cell is going to be selected.
    */
  var cellSelecting: js.UndefOr[js.Function1[/* e */ CellSelectingEventArgs, Unit]] = js.undefined
  /** This specifies the grid to add the grid control inside the grid row of the parent with expand/collapse options
    * @Default {null}
    */
  var childGrid: js.UndefOr[js.Any] = js.undefined
  /** Triggered after the column is deselected.
    */
  var columnDeselected: js.UndefOr[js.Function1[/* e */ ColumnDeselectedEventArgs, Unit]] = js.undefined
  /** Triggered before the column is going to be deselected.
    */
  var columnDeselecting: js.UndefOr[js.Function1[/* e */ ColumnDeselectingEventArgs, Unit]] = js.undefined
  /** Triggered when the column is being dragged.
    */
  var columnDrag: js.UndefOr[js.Function1[/* e */ ColumnDragEventArgs, Unit]] = js.undefined
  /** Triggered when column dragging begins.
    */
  var columnDragStart: js.UndefOr[js.Function1[/* e */ ColumnDragStartEventArgs, Unit]] = js.undefined
  /** Triggered when the column is dropped.
    */
  var columnDrop: js.UndefOr[js.Function1[/* e */ ColumnDropEventArgs, Unit]] = js.undefined
  /** Used to enable or disable static width settings for column. If the columnLayout is set as fixed, then column width will be static.
    * @Default {ej.Grid.ColumnLayout.Auto}
    */
  var columnLayout: js.UndefOr[ColumnLayout | String] = js.undefined
  /** Triggered after the column is selected.
    */
  var columnSelected: js.UndefOr[js.Function1[/* e */ ColumnSelectedEventArgs, Unit]] = js.undefined
  /** Triggered before the column is going to be selected.
    */
  var columnSelecting: js.UndefOr[js.Function1[/* e */ ColumnSelectingEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates to render the grid with specified columns
    * @Default {[]}
    */
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  /** Gets or sets a value that indicates to define common width for all the columns in the grid.
    */
  var commonWidth: js.UndefOr[Double] = js.undefined
  /** Triggered when context menu item is clicked
    */
  var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to customize the context menu behavior of the grid.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  /** Triggered before the context menu is opened.
    */
  var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, Unit]] = js.undefined
  /** Triggered when the grid is rendered completely.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates to render the grid with custom theme.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Triggered when the grid is bound with data during initial rendering.
    */
  var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, Unit]] = js.undefined
  /** Gets or sets the data to render the grid with records
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Triggered when grid going to destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Triggered when detail template row is clicked to collapse.
    */
  var detailsCollapse: js.UndefOr[js.Function1[/* e */ DetailsCollapseEventArgs, Unit]] = js.undefined
  /** Triggered detail template row is initialized.
    */
  var detailsDataBound: js.UndefOr[js.Function1[/* e */ DetailsDataBoundEventArgs, Unit]] = js.undefined
  /** Triggered when detail template row is clicked to expand.
    */
  var detailsExpand: js.UndefOr[js.Function1[/* e */ DetailsExpandEventArgs, Unit]] = js.undefined
  /** Default Value:
    * @Default {null}
    */
  var detailsTemplate: js.UndefOr[String] = js.undefined
  /** Gets or sets an object that indicates whether to customize the editing behavior of the grid.
    */
  var editSettings: js.UndefOr[EditSettings] = js.undefined
  /** Gets or sets a value that indicates whether to enable the alternative rows differentiation in the grid records based on corresponding theme.
    * @Default {true}
    */
  var enableAltRow: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the save action in the grid through row selection
    * @Default {true}
    */
  var enableAutoSaveOnSelectionChange: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable mouse over effect on the corresponding column header cell of the grid
    * @Default {false}
    */
  var enableHeaderHover: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to persist the grid model state in page using applicable medium i.e., HTML5 localStorage or cookies
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Align content in the grid control from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the grid rows has to be rendered as detail view in mobile mode
    * @Default {false}
    */
  var enableResponsiveRow: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable mouse over effect on corresponding grid row.
    * @Default {true}
    */
  var enableRowHover: js.UndefOr[Boolean] = js.undefined
  /** It sets a value that indicates whether to enable toolbar items, when allowEditing, allowAdding and allowDeleting property set as false in the grid.
    * @Default {false}
    */
  var enableToolbarItems: js.UndefOr[Boolean] = js.undefined
  /** To Disable the mouse swipe property as false.
    * @Default {true}
    */
  var enableTouch: js.UndefOr[Boolean] = js.undefined
  /** Triggered after the record is added.
    */
  var endAdd: js.UndefOr[js.Function1[/* e */ EndAddEventArgs, Unit]] = js.undefined
  /** Triggered after the record is deleted.
    */
  var endDelete: js.UndefOr[js.Function1[/* e */ EndDeleteEventArgs, Unit]] = js.undefined
  /** Triggered after the record is edited.
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.undefined
  /** Act as mapper for the excel exporting URL.
    * @Default {ExportToExcel}
    */
  var exportToExcelAction: js.UndefOr[String] = js.undefined
  /** Act as mapper for the PDF exporting URL.
    * @Default {ExportToPdf}
    */
  var exportToPdfAction: js.UndefOr[String] = js.undefined
  /** Act as mapper for the Word exporting URL.
    * @Default {ExportToWord}
    */
  var exportToWordAction: js.UndefOr[String] = js.undefined
  /** Gets or sets an object that indicates whether to customize the filtering behavior of the grid
    */
  var filterSettings: js.UndefOr[FilterSettings] = js.undefined
  /** Gets or sets a value that indicates to enable the visibility of the grid lines.
    * @Default {ej.Grid.GridLines.Both}
    */
  var gridLines: js.UndefOr[GridLines | String] = js.undefined
  /** Gets or sets an object that indicates whether to customize the grouping behavior of the grid.
    */
  var groupSettings: js.UndefOr[GroupSettings] = js.undefined
  /** Gets or sets a value that indicates whether the grid design has be to made responsive.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** This specifies to change the key in keyboard interaction to grid control
    * @Default {null}
    */
  var keySettings: js.UndefOr[js.Any] = js.undefined
  /** Triggered initial load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
    * a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Triggered every time a request is made to access particular cell information, element and data.
    */
  var mergeCellInfo: js.UndefOr[js.Function1[/* e */ MergeCellInfoEventArgs, Unit]] = js.undefined
  /** Triggered every time a request is made to access particular header cell information, element and data.
    */
  var mergeHeaderCellInfo: js.UndefOr[js.Function1[/* e */ MergeHeaderCellInfoEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to set the minimum width of the responsive grid while isResponsive property is true and enableResponsiveRow property is set as false.
    * @Default {0}
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /** Gets or sets an object that indicates whether to modify the pager default configuration.
    */
  var pageSettings: js.UndefOr[PageSettings] = js.undefined
  /** Query the dataSource from the table for Grid.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Triggered every time a request is made to access particular cell information, element and data.
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.undefined
  /** Triggered when record is clicked.
    */
  var recordClick: js.UndefOr[js.Function1[/* e */ RecordClickEventArgs, Unit]] = js.undefined
  /** Triggered when record is double clicked.
    */
  var recordDoubleClick: js.UndefOr[js.Function1[/* e */ RecordDoubleClickEventArgs, Unit]] = js.undefined
  /** Triggered when column resize end.
    */
  var resizeEnd: js.UndefOr[js.Function1[/* e */ ResizeEndEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to modify the resizing behavior.
    */
  var resizeSettings: js.UndefOr[ResizeSettings] = js.undefined
  /** Triggered when column resize start.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.undefined
  /** Triggered after column resized.
    */
  var resized: js.UndefOr[js.Function1[/* e */ ResizedEventArgs, Unit]] = js.undefined
  /** Triggered when right clicked on grid element.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
  /** Triggered every time a request is made to access row information, element and data.
    */
  var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, Unit]] = js.undefined
  /** Triggered after the row is deselected.
    */
  var rowDeselected: js.UndefOr[js.Function1[/* e */ RowDeselectedEventArgs, Unit]] = js.undefined
  /** Triggered before the row is going to be deselected.
    */
  var rowDeselecting: js.UndefOr[js.Function1[/* e */ RowDeselectingEventArgs, Unit]] = js.undefined
  /** Triggered when the row is being dragged.
    */
  var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, Unit]] = js.undefined
  /** Triggered when row dragging begins.
    */
  var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, Unit]] = js.undefined
  /** Triggered when the row is dropped.
    */
  var rowDrop: js.UndefOr[js.Function1[/* e */ RowDropEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to customize the drag and drop behavior of the grid rows
    */
  var rowDropSettings: js.UndefOr[RowDropSettings] = js.undefined
  /** Triggered while hover the grid row.
    */
  var rowHover: js.UndefOr[js.Function1[/* e */ RowHoverEventArgs, Unit]] = js.undefined
  /** Triggered after the row is selected.
    */
  var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, Unit]] = js.undefined
  /** Triggered before the row is going to be selected.
    */
  var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates to render the grid with template rows. The template row must be a table row. That table row must have the JavaScript render binding format
    * ({{:columnName}}) then the grid data source binds the data to the corresponding table row of the template.
    * @Default {null}
    */
  var rowTemplate: js.UndefOr[String] = js.undefined
  /** Gets or sets an object that indicates whether to customize the scrolling behavior of the grid.
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.undefined
  /** Gets or sets an object that indicates whether to customize the searching behavior of the grid
    */
  var searchSettings: js.UndefOr[SearchSettings] = js.undefined
  /** Gets a value that display the array of selected records in the Grid.
    * @Default {null}
    */
  var selectedRecords: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a value that indicates to select the row while initializing the grid
    * @Default {-1}
    */
  var selectedRowIndex: js.UndefOr[Double] = js.undefined
  /** Gets or sets a value that indicates the selected rows in grid
    * @Default {[]}
    */
  var selectedRowIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** This property is used to configure the selection behavior of the grid.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.undefined
  /** The row selection behavior of grid. Accepting types are &quot;single&quot; and &quot;multiple&quot;.
    * @Default {ej.Grid.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.undefined
  /** Default Value:
    * @Default {false}
    */
  var showColumnChooser: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates stacked header should be shown on grid layout when the property â€œstackedHeaderRowsâ€ is set.
    * @Default {false}
    */
  var showStackedHeader: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates summary rows should be shown on grid layout when the property â€œsummaryRowsâ€ is set
    * @Default {false}
    */
  var showSummary: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to customize the sorting behavior of the grid.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.undefined
  /** Gets or sets an object that indicates to managing the collection of stacked header rows for the grid.
    * @Default {[]}
    */
  var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.undefined
  /** Gets or sets an object that indicates to managing the collection of summary rows for the grid.
    * @Default {[]}
    */
  var summaryRows: js.UndefOr[js.Array[SummaryRow]] = js.undefined
  /** Triggered when refresh the template column elements in the Grid.
    */
  var templateRefresh: js.UndefOr[js.Function1[/* e */ TemplateRefreshEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to auto wrap the grid header or content or both
    */
  var textWrapSettings: js.UndefOr[TextWrapSettings] = js.undefined
  /** Triggered when toolbar item is clicked in grid.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to enable the toolbar in the grid and add toolbar items
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: /* e */ ActionBeginEventArgs => Callback = null,
    actionComplete: /* e */ ActionCompleteEventArgs => Callback = null,
    actionFailure: /* e */ ActionFailureEventArgs => Callback = null,
    allowCellMerging: js.UndefOr[Boolean] = js.undefined,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    allowGrouping: js.UndefOr[Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    allowMultiSorting: js.UndefOr[Boolean] = js.undefined,
    allowMultipleExporting: js.UndefOr[Boolean] = js.undefined,
    allowPaging: js.UndefOr[Boolean] = js.undefined,
    allowReordering: js.UndefOr[Boolean] = js.undefined,
    allowResizeToFit: js.UndefOr[Boolean] = js.undefined,
    allowResizing: js.UndefOr[Boolean] = js.undefined,
    allowRowDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    allowScrolling: js.UndefOr[Boolean] = js.undefined,
    allowSearching: js.UndefOr[Boolean] = js.undefined,
    allowSelection: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    allowTextWrap: js.UndefOr[Boolean] = js.undefined,
    batchAdd: /* e */ BatchAddEventArgs => Callback = null,
    batchDelete: /* e */ BatchDeleteEventArgs => Callback = null,
    beforeBatchAdd: /* e */ BeforeBatchAddEventArgs => Callback = null,
    beforeBatchDelete: /* e */ BeforeBatchDeleteEventArgs => Callback = null,
    beforeBatchSave: /* e */ BeforeBatchSaveEventArgs => Callback = null,
    beforePrint: /* e */ BeforePrintEventArgs => Callback = null,
    beforeRowDrop: /* e */ BeforeRowDropEventArgs => Callback = null,
    beginEdit: /* e */ BeginEditEventArgs => Callback = null,
    cellDeselected: /* e */ CellDeselectedEventArgs => Callback = null,
    cellDeselecting: /* e */ CellDeselectingEventArgs => Callback = null,
    cellEdit: /* e */ CellEditEventArgs => Callback = null,
    cellSave: /* e */ CellSaveEventArgs => Callback = null,
    cellSelected: /* e */ CellSelectedEventArgs => Callback = null,
    cellSelecting: /* e */ CellSelectingEventArgs => Callback = null,
    childGrid: js.Any = null,
    columnDeselected: /* e */ ColumnDeselectedEventArgs => Callback = null,
    columnDeselecting: /* e */ ColumnDeselectingEventArgs => Callback = null,
    columnDrag: /* e */ ColumnDragEventArgs => Callback = null,
    columnDragStart: /* e */ ColumnDragStartEventArgs => Callback = null,
    columnDrop: /* e */ ColumnDropEventArgs => Callback = null,
    columnLayout: ColumnLayout | String = null,
    columnSelected: /* e */ ColumnSelectedEventArgs => Callback = null,
    columnSelecting: /* e */ ColumnSelectingEventArgs => Callback = null,
    columns: js.Array[Column] = null,
    commonWidth: Int | Double = null,
    contextClick: /* e */ ContextClickEventArgs => Callback = null,
    contextMenuSettings: ContextMenuSettings = null,
    contextOpen: /* e */ ContextOpenEventArgs => Callback = null,
    create: /* e */ CreateEventArgs => Callback = null,
    cssClass: String = null,
    dataBound: /* e */ DataBoundEventArgs => Callback = null,
    dataSource: js.Any = null,
    destroy: /* e */ DestroyEventArgs => Callback = null,
    detailsCollapse: /* e */ DetailsCollapseEventArgs => Callback = null,
    detailsDataBound: /* e */ DetailsDataBoundEventArgs => Callback = null,
    detailsExpand: /* e */ DetailsExpandEventArgs => Callback = null,
    detailsTemplate: String = null,
    editSettings: EditSettings = null,
    enableAltRow: js.UndefOr[Boolean] = js.undefined,
    enableAutoSaveOnSelectionChange: js.UndefOr[Boolean] = js.undefined,
    enableHeaderHover: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableResponsiveRow: js.UndefOr[Boolean] = js.undefined,
    enableRowHover: js.UndefOr[Boolean] = js.undefined,
    enableToolbarItems: js.UndefOr[Boolean] = js.undefined,
    enableTouch: js.UndefOr[Boolean] = js.undefined,
    endAdd: /* e */ EndAddEventArgs => Callback = null,
    endDelete: /* e */ EndDeleteEventArgs => Callback = null,
    endEdit: /* e */ EndEditEventArgs => Callback = null,
    exportToExcelAction: String = null,
    exportToPdfAction: String = null,
    exportToWordAction: String = null,
    filterSettings: FilterSettings = null,
    gridLines: GridLines | String = null,
    groupSettings: GroupSettings = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    keySettings: js.Any = null,
    load: /* e */ LoadEventArgs => Callback = null,
    locale: String = null,
    mergeCellInfo: /* e */ MergeCellInfoEventArgs => Callback = null,
    mergeHeaderCellInfo: /* e */ MergeHeaderCellInfoEventArgs => Callback = null,
    minWidth: Int | Double = null,
    pageSettings: PageSettings = null,
    query: js.Any = null,
    queryCellInfo: /* e */ QueryCellInfoEventArgs => Callback = null,
    recordClick: /* e */ RecordClickEventArgs => Callback = null,
    recordDoubleClick: /* e */ RecordDoubleClickEventArgs => Callback = null,
    resizeEnd: /* e */ ResizeEndEventArgs => Callback = null,
    resizeSettings: ResizeSettings = null,
    resizeStart: /* e */ ResizeStartEventArgs => Callback = null,
    resized: /* e */ ResizedEventArgs => Callback = null,
    rightClick: /* e */ RightClickEventArgs => Callback = null,
    rowDataBound: /* e */ RowDataBoundEventArgs => Callback = null,
    rowDeselected: /* e */ RowDeselectedEventArgs => Callback = null,
    rowDeselecting: /* e */ RowDeselectingEventArgs => Callback = null,
    rowDrag: /* e */ RowDragEventArgs => Callback = null,
    rowDragStart: /* e */ RowDragStartEventArgs => Callback = null,
    rowDrop: /* e */ RowDropEventArgs => Callback = null,
    rowDropSettings: RowDropSettings = null,
    rowHover: /* e */ RowHoverEventArgs => Callback = null,
    rowSelected: /* e */ RowSelectedEventArgs => Callback = null,
    rowSelecting: /* e */ RowSelectingEventArgs => Callback = null,
    rowTemplate: String = null,
    scrollSettings: ScrollSettings = null,
    searchSettings: SearchSettings = null,
    selectedRecords: js.Array[_] = null,
    selectedRowIndex: Int | Double = null,
    selectedRowIndices: js.Array[_] = null,
    selectionSettings: SelectionSettings = null,
    selectionType: SelectionType | String = null,
    showColumnChooser: js.UndefOr[Boolean] = js.undefined,
    showStackedHeader: js.UndefOr[Boolean] = js.undefined,
    showSummary: js.UndefOr[Boolean] = js.undefined,
    sortSettings: SortSettings = null,
    stackedHeaderRows: js.Array[StackedHeaderRow] = null,
    summaryRows: js.Array[SummaryRow] = null,
    templateRefresh: /* e */ TemplateRefreshEventArgs => Callback = null,
    textWrapSettings: TextWrapSettings = null,
    toolbarClick: /* e */ ToolbarClickEventArgs => Callback = null,
    toolbarSettings: ToolbarSettings = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ActionBeginEventArgs) => actionBegin(t0).runNow()))
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ActionCompleteEventArgs) => actionComplete(t0).runNow()))
    if (actionFailure != null) __obj.updateDynamic("actionFailure")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ActionFailureEventArgs) => actionFailure(t0).runNow()))
    if (!js.isUndefined(allowCellMerging)) __obj.updateDynamic("allowCellMerging")(allowCellMerging.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowGrouping)) __obj.updateDynamic("allowGrouping")(allowGrouping.asInstanceOf[js.Any])
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiSorting)) __obj.updateDynamic("allowMultiSorting")(allowMultiSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultipleExporting)) __obj.updateDynamic("allowMultipleExporting")(allowMultipleExporting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPaging)) __obj.updateDynamic("allowPaging")(allowPaging.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReordering)) __obj.updateDynamic("allowReordering")(allowReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResizeToFit)) __obj.updateDynamic("allowResizeToFit")(allowResizeToFit.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRowDragAndDrop)) __obj.updateDynamic("allowRowDragAndDrop")(allowRowDragAndDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowScrolling)) __obj.updateDynamic("allowScrolling")(allowScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSearching)) __obj.updateDynamic("allowSearching")(allowSearching.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTextWrap)) __obj.updateDynamic("allowTextWrap")(allowTextWrap.asInstanceOf[js.Any])
    if (batchAdd != null) __obj.updateDynamic("batchAdd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.BatchAddEventArgs) => batchAdd(t0).runNow()))
    if (batchDelete != null) __obj.updateDynamic("batchDelete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.BatchDeleteEventArgs) => batchDelete(t0).runNow()))
    if (beforeBatchAdd != null) __obj.updateDynamic("beforeBatchAdd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.BeforeBatchAddEventArgs) => beforeBatchAdd(t0).runNow()))
    if (beforeBatchDelete != null) __obj.updateDynamic("beforeBatchDelete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.BeforeBatchDeleteEventArgs) => beforeBatchDelete(t0).runNow()))
    if (beforeBatchSave != null) __obj.updateDynamic("beforeBatchSave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.BeforeBatchSaveEventArgs) => beforeBatchSave(t0).runNow()))
    if (beforePrint != null) __obj.updateDynamic("beforePrint")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.BeforePrintEventArgs) => beforePrint(t0).runNow()))
    if (beforeRowDrop != null) __obj.updateDynamic("beforeRowDrop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.BeforeRowDropEventArgs) => beforeRowDrop(t0).runNow()))
    if (beginEdit != null) __obj.updateDynamic("beginEdit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.BeginEditEventArgs) => beginEdit(t0).runNow()))
    if (cellDeselected != null) __obj.updateDynamic("cellDeselected")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.CellDeselectedEventArgs) => cellDeselected(t0).runNow()))
    if (cellDeselecting != null) __obj.updateDynamic("cellDeselecting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.CellDeselectingEventArgs) => cellDeselecting(t0).runNow()))
    if (cellEdit != null) __obj.updateDynamic("cellEdit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.CellEditEventArgs) => cellEdit(t0).runNow()))
    if (cellSave != null) __obj.updateDynamic("cellSave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.CellSaveEventArgs) => cellSave(t0).runNow()))
    if (cellSelected != null) __obj.updateDynamic("cellSelected")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.CellSelectedEventArgs) => cellSelected(t0).runNow()))
    if (cellSelecting != null) __obj.updateDynamic("cellSelecting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.CellSelectingEventArgs) => cellSelecting(t0).runNow()))
    if (childGrid != null) __obj.updateDynamic("childGrid")(childGrid.asInstanceOf[js.Any])
    if (columnDeselected != null) __obj.updateDynamic("columnDeselected")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ColumnDeselectedEventArgs) => columnDeselected(t0).runNow()))
    if (columnDeselecting != null) __obj.updateDynamic("columnDeselecting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ColumnDeselectingEventArgs) => columnDeselecting(t0).runNow()))
    if (columnDrag != null) __obj.updateDynamic("columnDrag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ColumnDragEventArgs) => columnDrag(t0).runNow()))
    if (columnDragStart != null) __obj.updateDynamic("columnDragStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ColumnDragStartEventArgs) => columnDragStart(t0).runNow()))
    if (columnDrop != null) __obj.updateDynamic("columnDrop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ColumnDropEventArgs) => columnDrop(t0).runNow()))
    if (columnLayout != null) __obj.updateDynamic("columnLayout")(columnLayout.asInstanceOf[js.Any])
    if (columnSelected != null) __obj.updateDynamic("columnSelected")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ColumnSelectedEventArgs) => columnSelected(t0).runNow()))
    if (columnSelecting != null) __obj.updateDynamic("columnSelecting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ColumnSelectingEventArgs) => columnSelecting(t0).runNow()))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (commonWidth != null) __obj.updateDynamic("commonWidth")(commonWidth.asInstanceOf[js.Any])
    if (contextClick != null) __obj.updateDynamic("contextClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ContextClickEventArgs) => contextClick(t0).runNow()))
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings.asInstanceOf[js.Any])
    if (contextOpen != null) __obj.updateDynamic("contextOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ContextOpenEventArgs) => contextOpen(t0).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.CreateEventArgs) => create(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.DataBoundEventArgs) => dataBound(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.DestroyEventArgs) => destroy(t0).runNow()))
    if (detailsCollapse != null) __obj.updateDynamic("detailsCollapse")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.DetailsCollapseEventArgs) => detailsCollapse(t0).runNow()))
    if (detailsDataBound != null) __obj.updateDynamic("detailsDataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.DetailsDataBoundEventArgs) => detailsDataBound(t0).runNow()))
    if (detailsExpand != null) __obj.updateDynamic("detailsExpand")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.DetailsExpandEventArgs) => detailsExpand(t0).runNow()))
    if (detailsTemplate != null) __obj.updateDynamic("detailsTemplate")(detailsTemplate.asInstanceOf[js.Any])
    if (editSettings != null) __obj.updateDynamic("editSettings")(editSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAltRow)) __obj.updateDynamic("enableAltRow")(enableAltRow.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoSaveOnSelectionChange)) __obj.updateDynamic("enableAutoSaveOnSelectionChange")(enableAutoSaveOnSelectionChange.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHeaderHover)) __obj.updateDynamic("enableHeaderHover")(enableHeaderHover.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableResponsiveRow)) __obj.updateDynamic("enableResponsiveRow")(enableResponsiveRow.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowHover)) __obj.updateDynamic("enableRowHover")(enableRowHover.asInstanceOf[js.Any])
    if (!js.isUndefined(enableToolbarItems)) __obj.updateDynamic("enableToolbarItems")(enableToolbarItems.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTouch)) __obj.updateDynamic("enableTouch")(enableTouch.asInstanceOf[js.Any])
    if (endAdd != null) __obj.updateDynamic("endAdd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.EndAddEventArgs) => endAdd(t0).runNow()))
    if (endDelete != null) __obj.updateDynamic("endDelete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.EndDeleteEventArgs) => endDelete(t0).runNow()))
    if (endEdit != null) __obj.updateDynamic("endEdit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.EndEditEventArgs) => endEdit(t0).runNow()))
    if (exportToExcelAction != null) __obj.updateDynamic("exportToExcelAction")(exportToExcelAction.asInstanceOf[js.Any])
    if (exportToPdfAction != null) __obj.updateDynamic("exportToPdfAction")(exportToPdfAction.asInstanceOf[js.Any])
    if (exportToWordAction != null) __obj.updateDynamic("exportToWordAction")(exportToWordAction.asInstanceOf[js.Any])
    if (filterSettings != null) __obj.updateDynamic("filterSettings")(filterSettings.asInstanceOf[js.Any])
    if (gridLines != null) __obj.updateDynamic("gridLines")(gridLines.asInstanceOf[js.Any])
    if (groupSettings != null) __obj.updateDynamic("groupSettings")(groupSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (keySettings != null) __obj.updateDynamic("keySettings")(keySettings.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.LoadEventArgs) => load(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mergeCellInfo != null) __obj.updateDynamic("mergeCellInfo")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.MergeCellInfoEventArgs) => mergeCellInfo(t0).runNow()))
    if (mergeHeaderCellInfo != null) __obj.updateDynamic("mergeHeaderCellInfo")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.MergeHeaderCellInfoEventArgs) => mergeHeaderCellInfo(t0).runNow()))
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (pageSettings != null) __obj.updateDynamic("pageSettings")(pageSettings.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queryCellInfo != null) __obj.updateDynamic("queryCellInfo")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.QueryCellInfoEventArgs) => queryCellInfo(t0).runNow()))
    if (recordClick != null) __obj.updateDynamic("recordClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.RecordClickEventArgs) => recordClick(t0).runNow()))
    if (recordDoubleClick != null) __obj.updateDynamic("recordDoubleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.RecordDoubleClickEventArgs) => recordDoubleClick(t0).runNow()))
    if (resizeEnd != null) __obj.updateDynamic("resizeEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ResizeEndEventArgs) => resizeEnd(t0).runNow()))
    if (resizeSettings != null) __obj.updateDynamic("resizeSettings")(resizeSettings.asInstanceOf[js.Any])
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ResizeStartEventArgs) => resizeStart(t0).runNow()))
    if (resized != null) __obj.updateDynamic("resized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ResizedEventArgs) => resized(t0).runNow()))
    if (rightClick != null) __obj.updateDynamic("rightClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.RightClickEventArgs) => rightClick(t0).runNow()))
    if (rowDataBound != null) __obj.updateDynamic("rowDataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.RowDataBoundEventArgs) => rowDataBound(t0).runNow()))
    if (rowDeselected != null) __obj.updateDynamic("rowDeselected")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.RowDeselectedEventArgs) => rowDeselected(t0).runNow()))
    if (rowDeselecting != null) __obj.updateDynamic("rowDeselecting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.RowDeselectingEventArgs) => rowDeselecting(t0).runNow()))
    if (rowDrag != null) __obj.updateDynamic("rowDrag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.RowDragEventArgs) => rowDrag(t0).runNow()))
    if (rowDragStart != null) __obj.updateDynamic("rowDragStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.RowDragStartEventArgs) => rowDragStart(t0).runNow()))
    if (rowDrop != null) __obj.updateDynamic("rowDrop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.RowDropEventArgs) => rowDrop(t0).runNow()))
    if (rowDropSettings != null) __obj.updateDynamic("rowDropSettings")(rowDropSettings.asInstanceOf[js.Any])
    if (rowHover != null) __obj.updateDynamic("rowHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.RowHoverEventArgs) => rowHover(t0).runNow()))
    if (rowSelected != null) __obj.updateDynamic("rowSelected")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.RowSelectedEventArgs) => rowSelected(t0).runNow()))
    if (rowSelecting != null) __obj.updateDynamic("rowSelecting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.RowSelectingEventArgs) => rowSelecting(t0).runNow()))
    if (rowTemplate != null) __obj.updateDynamic("rowTemplate")(rowTemplate.asInstanceOf[js.Any])
    if (scrollSettings != null) __obj.updateDynamic("scrollSettings")(scrollSettings.asInstanceOf[js.Any])
    if (searchSettings != null) __obj.updateDynamic("searchSettings")(searchSettings.asInstanceOf[js.Any])
    if (selectedRecords != null) __obj.updateDynamic("selectedRecords")(selectedRecords.asInstanceOf[js.Any])
    if (selectedRowIndex != null) __obj.updateDynamic("selectedRowIndex")(selectedRowIndex.asInstanceOf[js.Any])
    if (selectedRowIndices != null) __obj.updateDynamic("selectedRowIndices")(selectedRowIndices.asInstanceOf[js.Any])
    if (selectionSettings != null) __obj.updateDynamic("selectionSettings")(selectionSettings.asInstanceOf[js.Any])
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnChooser)) __obj.updateDynamic("showColumnChooser")(showColumnChooser.asInstanceOf[js.Any])
    if (!js.isUndefined(showStackedHeader)) __obj.updateDynamic("showStackedHeader")(showStackedHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(showSummary)) __obj.updateDynamic("showSummary")(showSummary.asInstanceOf[js.Any])
    if (sortSettings != null) __obj.updateDynamic("sortSettings")(sortSettings.asInstanceOf[js.Any])
    if (stackedHeaderRows != null) __obj.updateDynamic("stackedHeaderRows")(stackedHeaderRows.asInstanceOf[js.Any])
    if (summaryRows != null) __obj.updateDynamic("summaryRows")(summaryRows.asInstanceOf[js.Any])
    if (templateRefresh != null) __obj.updateDynamic("templateRefresh")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.TemplateRefreshEventArgs) => templateRefresh(t0).runNow()))
    if (textWrapSettings != null) __obj.updateDynamic("textWrapSettings")(textWrapSettings.asInstanceOf[js.Any])
    if (toolbarClick != null) __obj.updateDynamic("toolbarClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Grid.ToolbarClickEventArgs) => toolbarClick(t0).runNow()))
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

