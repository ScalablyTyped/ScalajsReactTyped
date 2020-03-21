package typingsJapgolly.ejWebAll.ej.Spreadsheet

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered for every action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
  /** Triggered for every action complete.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
  /** Gets or sets an active sheet index in the Spreadsheet. By defining this value, you can specify which sheet should be active in workbook.
    * @Default {1}
    */
  var activeSheetIndex: js.UndefOr[Double] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable auto rendering of cell type in the Spreadsheet.
    * @Default {false}
    */
  var allowAutoCellType: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable auto fill feature in the Spreadsheet.
    * @Default {true}
    */
  var allowAutoFill: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable auto sum feature in the Spreadsheet.
    * @Default {true}
    */
  var allowAutoSum: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable cell format feature in the Spreadsheet. By enabling this, you can customize styles and number formats.
    * @Default {true}
    */
  var allowCellFormatting: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable cell type feature in the Spreadsheet.
    * @Default {false}
    */
  var allowCellType: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable chart feature in the Spreadsheet. By enabling this feature, you can create and customize charts in Spreadsheet.
    * @Default {true}
    */
  var allowCharts: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable clear feature in the Spreadsheet.
    * @Default {true}
    */
  var allowClear: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable clipboard feature in the Spreadsheet. By enabling this feature, you can perform cut/copy and paste operations in
    * Spreadsheet.
    * @Default {true}
    */
  var allowClipboard: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable comment feature in the Spreadsheet. By enabling this, you can add/delete/modify comments in Spreadsheet.
    * @Default {true}
    */
  var allowComments: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable Conditional Format feature in the Spreadsheet. By enabling this, you can apply formatting to the selected range of
    * cells based on the provided conditions (Greater than, Less than, Equal, Between, Contains, etc.).
    * @Default {true}
    */
  var allowConditionalFormats: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable data validation feature in the Spreadsheet.
    * @Default {true}
    */
  var allowDataValidation: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable the delete action in the Spreadsheet. By enabling this feature, you can delete existing rows, columns, cells and
    * sheet.
    * @Default {true}
    */
  var allowDelete: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable drag and drop feature in the Spreadsheet.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable the edit action in the Spreadsheet.
    * @Default {true}
    */
  var allowEditing: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable filtering feature in the Spreadsheet. Filtering can be used to limit the data displayed using required criteria.
    * @Default {true}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable table feature in the Spreadsheet. By enabling this, you can render table in selected range.
    * @Default {true}
    */
  var allowFormatAsTable: js.UndefOr[Boolean] = js.undefined
  /** Get or sets a value that indicates whether to enable or disable format painter feature in the Spreadsheet. By enabling this feature, you can copy the format from the selected
    * range and apply it to another range.
    * @Default {true}
    */
  var allowFormatPainter: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable formula bar in the Spreadsheet.
    * @Default {true}
    */
  var allowFormulaBar: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable freeze pane support in Spreadsheet. By enabling this feature, you can use freeze top row, freeze first column and
    * freeze panes options.
    * @Default {true}
    */
  var allowFreezing: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable hyperlink feature in the Spreadsheet. By enabling this feature, you can add hyperlink which is used to easily
    * navigate to the cell reference from one sheet to another or a web page.
    * @Default {true}
    */
  var allowHyperlink: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable import feature in the Spreadsheet. By enabling this feature, you can open existing Spreadsheet documents.
    * @Default {true}
    */
  var allowImport: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable the insert action in the Spreadsheet. By enabling this feature, you can insert new rows, columns, cells and sheet.
    * @Default {true}
    */
  var allowInsert: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable keyboard navigation feature in the Spreadsheet.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable lock cell feature in the Spreadsheet.
    * @Default {true}
    */
  var allowLockCell: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable merge feature in the Spreadsheet.
    * @Default {true}
    */
  var allowMerging: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable overflow feature in the Spreadsheet.
    * @Default {true}
    */
  var allowOverflow: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable resizing feature in the Spreadsheet. By enabling this feature, you can change the column width and row height by
    * dragging its header boundaries.
    * @Default {true}
    */
  var allowResizing: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable find and replace feature in the Spreadsheet. By enabling this, you can easily find and replace a specific value in
    * the sheet or workbook. By using goto behavior, you can select and highlight all cells that contains specific data or data types.
    * @Default {true}
    */
  var allowSearching: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable selection in the Spreadsheet. By enabling this feature, selected items will be highlighted.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the sorting feature in the Spreadsheet.
    * @Default {true}
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the sparkline feature in the Spreadsheet.
    * @Default {false}
    */
  var allowSparkline: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable undo and redo feature in the Spreadsheet.
    * @Default {true}
    */
  var allowUndoRedo: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable wrap text feature in the Spreadsheet. By enabling this, cell content can wrap to the next line, if the cell
    * content exceeds the boundary of the cell.
    * @Default {true}
    */
  var allowWrap: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates to define the width of the activation panel in Spreadsheet.
    * @Default {300}
    */
  var apWidth: js.UndefOr[Double] = js.undefined
  /** Triggered when the auto fill operation begins.
    */
  var autoFillBegin: js.UndefOr[js.Function1[/* e */ AutoFillBeginEventArgs, Unit]] = js.undefined
  /** Triggered when the auto fill operation completes.
    */
  var autoFillComplete: js.UndefOr[js.Function1[/* e */ AutoFillCompleteEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates to customize the auto fill behavior in the Spreadsheet.
    */
  var autoFillSettings: js.UndefOr[AutoFillSettings] = js.undefined
  /** Triggered before the batch save.
    */
  var beforeBatchSave: js.UndefOr[js.Function1[/* e */ BeforeBatchSaveEventArgs, Unit]] = js.undefined
  /** Triggered before the cells to be formatted.
    */
  var beforeCellFormat: js.UndefOr[js.Function1[/* e */ BeforeCellFormatEventArgs, Unit]] = js.undefined
  /** Triggered before the cell selection.
    */
  var beforeCellSelect: js.UndefOr[js.Function1[/* e */ BeforeCellSelectEventArgs, Unit]] = js.undefined
  /** Triggered before the selected cells are dropped.
    */
  var beforeDrop: js.UndefOr[js.Function1[/* e */ BeforeDropEventArgs, Unit]] = js.undefined
  /** Triggered while start to edit the comment.
    */
  var beforeEditComment: js.UndefOr[js.Function1[/* e */ BeforeEditCommentEventArgs, Unit]] = js.undefined
  /** Triggered before the contextmenu is open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
  /** Triggered before the activation panel is open.
    */
  var beforePanelOpen: js.UndefOr[js.Function1[/* e */ BeforePanelOpenEventArgs, Unit]] = js.undefined
  /** Triggered when click on sheet cell.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.undefined
  /** Triggered when the cell is edited.
    */
  var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, Unit]] = js.undefined
  /** Triggered while cell is formatting.
    */
  var cellFormatting: js.UndefOr[js.Function1[/* e */ CellFormattingEventArgs, Unit]] = js.undefined
  /** Triggered when mouse hover on cell in sheets.
    */
  var cellHover: js.UndefOr[js.Function1[/* e */ CellHoverEventArgs, Unit]] = js.undefined
  /** Triggered when save the edited cell.
    */
  var cellSave: js.UndefOr[js.Function1[/* e */ CellSaveEventArgs, Unit]] = js.undefined
  /** Triggered when the cell is selected.
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates to customize the chart behavior in the Spreadsheet.
    */
  var chartSettings: js.UndefOr[ChartSettings] = js.undefined
  /** Gets or sets a value that defines the number of columns displayed in the sheet.
    * @Default {21}
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  /** Gets or sets a value that indicates to define the common width for each column in the Spreadsheet.
    * @Default {64}
    */
  var columnWidth: js.UndefOr[Double] = js.undefined
  /** Triggered when click the contextmenu items.
    */
  var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, Unit]] = js.undefined
  /** Gets or sets a value to add root CSS class for customizing Spreadsheet skins.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates custom formulas in Spreadsheet.
    * @Default {[]}
    */
  var customFormulas: js.UndefOr[js.Array[_]] = js.undefined
  /** Triggered when the selected cells are being dragged.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.undefined
  /** Triggered when you start to drag the picture or chart.
    */
  var dragShape: js.UndefOr[js.Function1[/* e */ DragShapeEventArgs, Unit]] = js.undefined
  /** Triggered when the selected cells are initiated to drag.
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.undefined
  /** Triggered when the selected cells are dropped.
    */
  var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, Unit]] = js.undefined
  /** Triggered before the range editing starts.
    */
  var editRangeBegin: js.UndefOr[js.Function1[/* e */ EditRangeBeginEventArgs, Unit]] = js.undefined
  /** Triggered after range editing completes.
    */
  var editRangeComplete: js.UndefOr[js.Function1[/* e */ EditRangeCompleteEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable context menu in the Spreadsheet.
    * @Default {true}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable pivot table in the Spreadsheet.
    * @Default {false}
    */
  var enablePivotTable: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable touch support in the Spreadsheet.
    * @Default {true}
    */
  var enableTouch: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets an object that indicates to customize the exporting behavior in Spreadsheet.
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.undefined
  /** Gets or sets an object that indicates to customize the format behavior in the Spreadsheet.
    */
  var formatSettings: js.UndefOr[FormatSettings] = js.undefined
  /** Gets or sets an object that indicates to customize the import behavior in the Spreadsheet.
    */
  var importSettings: js.UndefOr[ImportSettings] = js.undefined
  /** Gets a value that indicates whether importing or not while loading the sheets in Spreadsheet.
    * @Default {false}
    */
  var isImport: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable readonly support in the Spreadsheet.
    * @Default {false}
    */
  var isReadOnly: js.UndefOr[Boolean] = js.undefined
  /** Triggered when the key is pressed down.
    */
  var keyDown: js.UndefOr[js.Function1[/* e */ KeyDownEventArgs, Unit]] = js.undefined
  /** Triggered when the key is released.
    */
  var keyUp: js.UndefOr[js.Function1[/* e */ KeyUpEventArgs, Unit]] = js.undefined
  /** Triggered before the sheet is loaded.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Triggered after the sheet is loaded.
    */
  var loadComplete: js.UndefOr[js.Function1[/* e */ LoadCompleteEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data (i.e.) in a language and culture specific
    * to a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Triggered every click of the menu item.
    */
  var menuClick: js.UndefOr[js.Function1[/* e */ MenuClickEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates name manager in Spreadsheet.
    */
  var nameManager: js.UndefOr[js.Array[NameManager]] = js.undefined
  /** Triggered when a file is imported.
    */
  var onImport: js.UndefOr[js.Function1[/* e */ OnImportEventArgs, Unit]] = js.undefined
  /** Triggered when import sheet is failed to open.
    */
  var openFailure: js.UndefOr[js.Function1[/* e */ OpenFailureEventArgs, Unit]] = js.undefined
  /** Triggered when pager item is clicked in the Spreadsheet.
    */
  var pagerClick: js.UndefOr[js.Function1[/* e */ PagerClickEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates to customize the picture behavior in the Spreadsheet.
    */
  var pictureSettings: js.UndefOr[PictureSettings] = js.undefined
  /** Gets or sets an object that indicates to customize the print option in Spreadsheet.
    */
  var printSettings: js.UndefOr[PrintSettings] = js.undefined
  /** Triggered after end of resizing the chart, picture, row and column.
    */
  var resizeEnd: js.UndefOr[js.Function1[/* e */ ResizeEndEventArgs, Unit]] = js.undefined
  /** Triggered when you start resizing the chart, picture, row and column.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.undefined
  /** Triggered when click on the ribbon.
    */
  var ribbonClick: js.UndefOr[js.Function1[/* e */ RibbonClickEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates to customize the ribbon settings in Spreadsheet.
    */
  var ribbonSettings: js.UndefOr[RibbonSettings] = js.undefined
  /** Gets or sets a value that indicates whether to define the number of rows to be displayed in the sheet.
    * @Default {20}
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  /** Gets or sets a value that indicates to define the common height for each row in the sheet.
    * @Default {20}
    */
  var rowHeight: js.UndefOr[Double] = js.undefined
  /** Gets or sets an object that indicates to customize the scroll options in the Spreadsheet.
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.undefined
  /** Gets or sets an object that indicates to customize the selection options in the Spreadsheet.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.undefined
  /** Gets or sets a value that indicates to define the number of sheets to be created at the initial load.
    * @Default {1}
    */
  var sheetCount: js.UndefOr[Double] = js.undefined
  /** Gets or sets an object that indicates to customize the sheet behavior in Spreadsheet.
    */
  var sheets: js.UndefOr[js.Array[Sheet]] = js.undefined
  /** Gets or sets a value that indicates whether to show or hide pager in the Spreadsheet.
    * @Default {true}
    */
  var showPager: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to show or hide ribbon in the Spreadsheet.
    * @Default {true}
    */
  var showRibbon: js.UndefOr[Boolean] = js.undefined
  /** Triggered when click the ribbon tab.
    */
  var tabClick: js.UndefOr[js.Function1[/* e */ TabClickEventArgs, Unit]] = js.undefined
  /** Triggered when select the ribbon tab.
    */
  var tabSelect: js.UndefOr[js.Function1[/* e */ TabSelectEventArgs, Unit]] = js.undefined
  /** This is used to set the number of undo-redo steps in the Spreadsheet.
    * @Default {20}
    */
  var undoRedoStep: js.UndefOr[Double] = js.undefined
  /** Define the username for the Spreadsheet which is displayed in comment.
    * @Default {User Name}
    */
  var userName: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: /* e */ ActionBeginEventArgs => Callback = null,
    actionComplete: /* e */ ActionCompleteEventArgs => Callback = null,
    activeSheetIndex: Int | Double = null,
    allowAutoCellType: js.UndefOr[Boolean] = js.undefined,
    allowAutoFill: js.UndefOr[Boolean] = js.undefined,
    allowAutoSum: js.UndefOr[Boolean] = js.undefined,
    allowCellFormatting: js.UndefOr[Boolean] = js.undefined,
    allowCellType: js.UndefOr[Boolean] = js.undefined,
    allowCharts: js.UndefOr[Boolean] = js.undefined,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    allowClipboard: js.UndefOr[Boolean] = js.undefined,
    allowComments: js.UndefOr[Boolean] = js.undefined,
    allowConditionalFormats: js.UndefOr[Boolean] = js.undefined,
    allowDataValidation: js.UndefOr[Boolean] = js.undefined,
    allowDelete: js.UndefOr[Boolean] = js.undefined,
    allowDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    allowEditing: js.UndefOr[Boolean] = js.undefined,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    allowFormatAsTable: js.UndefOr[Boolean] = js.undefined,
    allowFormatPainter: js.UndefOr[Boolean] = js.undefined,
    allowFormulaBar: js.UndefOr[Boolean] = js.undefined,
    allowFreezing: js.UndefOr[Boolean] = js.undefined,
    allowHyperlink: js.UndefOr[Boolean] = js.undefined,
    allowImport: js.UndefOr[Boolean] = js.undefined,
    allowInsert: js.UndefOr[Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    allowLockCell: js.UndefOr[Boolean] = js.undefined,
    allowMerging: js.UndefOr[Boolean] = js.undefined,
    allowOverflow: js.UndefOr[Boolean] = js.undefined,
    allowResizing: js.UndefOr[Boolean] = js.undefined,
    allowSearching: js.UndefOr[Boolean] = js.undefined,
    allowSelection: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    allowSparkline: js.UndefOr[Boolean] = js.undefined,
    allowUndoRedo: js.UndefOr[Boolean] = js.undefined,
    allowWrap: js.UndefOr[Boolean] = js.undefined,
    apWidth: Int | Double = null,
    autoFillBegin: /* e */ AutoFillBeginEventArgs => Callback = null,
    autoFillComplete: /* e */ AutoFillCompleteEventArgs => Callback = null,
    autoFillSettings: AutoFillSettings = null,
    beforeBatchSave: /* e */ BeforeBatchSaveEventArgs => Callback = null,
    beforeCellFormat: /* e */ BeforeCellFormatEventArgs => Callback = null,
    beforeCellSelect: /* e */ BeforeCellSelectEventArgs => Callback = null,
    beforeDrop: /* e */ BeforeDropEventArgs => Callback = null,
    beforeEditComment: /* e */ BeforeEditCommentEventArgs => Callback = null,
    beforeOpen: /* e */ BeforeOpenEventArgs => Callback = null,
    beforePanelOpen: /* e */ BeforePanelOpenEventArgs => Callback = null,
    cellClick: /* e */ CellClickEventArgs => Callback = null,
    cellEdit: /* e */ CellEditEventArgs => Callback = null,
    cellFormatting: /* e */ CellFormattingEventArgs => Callback = null,
    cellHover: /* e */ CellHoverEventArgs => Callback = null,
    cellSave: /* e */ CellSaveEventArgs => Callback = null,
    cellSelected: /* e */ CellSelectedEventArgs => Callback = null,
    chartSettings: ChartSettings = null,
    columnCount: Int | Double = null,
    columnWidth: Int | Double = null,
    contextMenuClick: /* e */ ContextMenuClickEventArgs => Callback = null,
    cssClass: String = null,
    customFormulas: js.Array[_] = null,
    drag: /* e */ DragEventArgs => Callback = null,
    dragShape: /* e */ DragShapeEventArgs => Callback = null,
    dragStart: /* e */ DragStartEventArgs => Callback = null,
    drop: /* e */ DropEventArgs => Callback = null,
    editRangeBegin: /* e */ EditRangeBeginEventArgs => Callback = null,
    editRangeComplete: /* e */ EditRangeCompleteEventArgs => Callback = null,
    enableContextMenu: js.UndefOr[Boolean] = js.undefined,
    enablePivotTable: js.UndefOr[Boolean] = js.undefined,
    enableTouch: js.UndefOr[Boolean] = js.undefined,
    exportSettings: ExportSettings = null,
    formatSettings: FormatSettings = null,
    importSettings: ImportSettings = null,
    isImport: js.UndefOr[Boolean] = js.undefined,
    isReadOnly: js.UndefOr[Boolean] = js.undefined,
    keyDown: /* e */ KeyDownEventArgs => Callback = null,
    keyUp: /* e */ KeyUpEventArgs => Callback = null,
    load: /* e */ LoadEventArgs => Callback = null,
    loadComplete: /* e */ LoadCompleteEventArgs => Callback = null,
    locale: String = null,
    menuClick: /* e */ MenuClickEventArgs => Callback = null,
    nameManager: js.Array[NameManager] = null,
    onImport: /* e */ OnImportEventArgs => Callback = null,
    openFailure: /* e */ OpenFailureEventArgs => Callback = null,
    pagerClick: /* e */ PagerClickEventArgs => Callback = null,
    pictureSettings: PictureSettings = null,
    printSettings: PrintSettings = null,
    resizeEnd: /* e */ ResizeEndEventArgs => Callback = null,
    resizeStart: /* e */ ResizeStartEventArgs => Callback = null,
    ribbonClick: /* e */ RibbonClickEventArgs => Callback = null,
    ribbonSettings: RibbonSettings = null,
    rowCount: Int | Double = null,
    rowHeight: Int | Double = null,
    scrollSettings: ScrollSettings = null,
    selectionSettings: SelectionSettings = null,
    sheetCount: Int | Double = null,
    sheets: js.Array[Sheet] = null,
    showPager: js.UndefOr[Boolean] = js.undefined,
    showRibbon: js.UndefOr[Boolean] = js.undefined,
    tabClick: /* e */ TabClickEventArgs => Callback = null,
    tabSelect: /* e */ TabSelectEventArgs => Callback = null,
    undoRedoStep: Int | Double = null,
    userName: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.ActionBeginEventArgs) => actionBegin(t0).runNow()))
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.ActionCompleteEventArgs) => actionComplete(t0).runNow()))
    if (activeSheetIndex != null) __obj.updateDynamic("activeSheetIndex")(activeSheetIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAutoCellType)) __obj.updateDynamic("allowAutoCellType")(allowAutoCellType.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAutoFill)) __obj.updateDynamic("allowAutoFill")(allowAutoFill.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAutoSum)) __obj.updateDynamic("allowAutoSum")(allowAutoSum.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCellFormatting)) __obj.updateDynamic("allowCellFormatting")(allowCellFormatting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCellType)) __obj.updateDynamic("allowCellType")(allowCellType.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCharts)) __obj.updateDynamic("allowCharts")(allowCharts.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClipboard)) __obj.updateDynamic("allowClipboard")(allowClipboard.asInstanceOf[js.Any])
    if (!js.isUndefined(allowComments)) __obj.updateDynamic("allowComments")(allowComments.asInstanceOf[js.Any])
    if (!js.isUndefined(allowConditionalFormats)) __obj.updateDynamic("allowConditionalFormats")(allowConditionalFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDataValidation)) __obj.updateDynamic("allowDataValidation")(allowDataValidation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDelete)) __obj.updateDynamic("allowDelete")(allowDelete.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFormatAsTable)) __obj.updateDynamic("allowFormatAsTable")(allowFormatAsTable.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFormatPainter)) __obj.updateDynamic("allowFormatPainter")(allowFormatPainter.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFormulaBar)) __obj.updateDynamic("allowFormulaBar")(allowFormulaBar.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFreezing)) __obj.updateDynamic("allowFreezing")(allowFreezing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHyperlink)) __obj.updateDynamic("allowHyperlink")(allowHyperlink.asInstanceOf[js.Any])
    if (!js.isUndefined(allowImport)) __obj.updateDynamic("allowImport")(allowImport.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsert)) __obj.updateDynamic("allowInsert")(allowInsert.asInstanceOf[js.Any])
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowLockCell)) __obj.updateDynamic("allowLockCell")(allowLockCell.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMerging)) __obj.updateDynamic("allowMerging")(allowMerging.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOverflow)) __obj.updateDynamic("allowOverflow")(allowOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSearching)) __obj.updateDynamic("allowSearching")(allowSearching.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSparkline)) __obj.updateDynamic("allowSparkline")(allowSparkline.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUndoRedo)) __obj.updateDynamic("allowUndoRedo")(allowUndoRedo.asInstanceOf[js.Any])
    if (!js.isUndefined(allowWrap)) __obj.updateDynamic("allowWrap")(allowWrap.asInstanceOf[js.Any])
    if (apWidth != null) __obj.updateDynamic("apWidth")(apWidth.asInstanceOf[js.Any])
    if (autoFillBegin != null) __obj.updateDynamic("autoFillBegin")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.AutoFillBeginEventArgs) => autoFillBegin(t0).runNow()))
    if (autoFillComplete != null) __obj.updateDynamic("autoFillComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.AutoFillCompleteEventArgs) => autoFillComplete(t0).runNow()))
    if (autoFillSettings != null) __obj.updateDynamic("autoFillSettings")(autoFillSettings.asInstanceOf[js.Any])
    if (beforeBatchSave != null) __obj.updateDynamic("beforeBatchSave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.BeforeBatchSaveEventArgs) => beforeBatchSave(t0).runNow()))
    if (beforeCellFormat != null) __obj.updateDynamic("beforeCellFormat")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.BeforeCellFormatEventArgs) => beforeCellFormat(t0).runNow()))
    if (beforeCellSelect != null) __obj.updateDynamic("beforeCellSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.BeforeCellSelectEventArgs) => beforeCellSelect(t0).runNow()))
    if (beforeDrop != null) __obj.updateDynamic("beforeDrop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.BeforeDropEventArgs) => beforeDrop(t0).runNow()))
    if (beforeEditComment != null) __obj.updateDynamic("beforeEditComment")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.BeforeEditCommentEventArgs) => beforeEditComment(t0).runNow()))
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.BeforeOpenEventArgs) => beforeOpen(t0).runNow()))
    if (beforePanelOpen != null) __obj.updateDynamic("beforePanelOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.BeforePanelOpenEventArgs) => beforePanelOpen(t0).runNow()))
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.CellClickEventArgs) => cellClick(t0).runNow()))
    if (cellEdit != null) __obj.updateDynamic("cellEdit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.CellEditEventArgs) => cellEdit(t0).runNow()))
    if (cellFormatting != null) __obj.updateDynamic("cellFormatting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.CellFormattingEventArgs) => cellFormatting(t0).runNow()))
    if (cellHover != null) __obj.updateDynamic("cellHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.CellHoverEventArgs) => cellHover(t0).runNow()))
    if (cellSave != null) __obj.updateDynamic("cellSave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.CellSaveEventArgs) => cellSave(t0).runNow()))
    if (cellSelected != null) __obj.updateDynamic("cellSelected")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.CellSelectedEventArgs) => cellSelected(t0).runNow()))
    if (chartSettings != null) __obj.updateDynamic("chartSettings")(chartSettings.asInstanceOf[js.Any])
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (contextMenuClick != null) __obj.updateDynamic("contextMenuClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.ContextMenuClickEventArgs) => contextMenuClick(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customFormulas != null) __obj.updateDynamic("customFormulas")(customFormulas.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.DragEventArgs) => drag(t0).runNow()))
    if (dragShape != null) __obj.updateDynamic("dragShape")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.DragShapeEventArgs) => dragShape(t0).runNow()))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.DragStartEventArgs) => dragStart(t0).runNow()))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.DropEventArgs) => drop(t0).runNow()))
    if (editRangeBegin != null) __obj.updateDynamic("editRangeBegin")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.EditRangeBeginEventArgs) => editRangeBegin(t0).runNow()))
    if (editRangeComplete != null) __obj.updateDynamic("editRangeComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.EditRangeCompleteEventArgs) => editRangeComplete(t0).runNow()))
    if (!js.isUndefined(enableContextMenu)) __obj.updateDynamic("enableContextMenu")(enableContextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePivotTable)) __obj.updateDynamic("enablePivotTable")(enablePivotTable.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTouch)) __obj.updateDynamic("enableTouch")(enableTouch.asInstanceOf[js.Any])
    if (exportSettings != null) __obj.updateDynamic("exportSettings")(exportSettings.asInstanceOf[js.Any])
    if (formatSettings != null) __obj.updateDynamic("formatSettings")(formatSettings.asInstanceOf[js.Any])
    if (importSettings != null) __obj.updateDynamic("importSettings")(importSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(isImport)) __obj.updateDynamic("isImport")(isImport.asInstanceOf[js.Any])
    if (!js.isUndefined(isReadOnly)) __obj.updateDynamic("isReadOnly")(isReadOnly.asInstanceOf[js.Any])
    if (keyDown != null) __obj.updateDynamic("keyDown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.KeyDownEventArgs) => keyDown(t0).runNow()))
    if (keyUp != null) __obj.updateDynamic("keyUp")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.KeyUpEventArgs) => keyUp(t0).runNow()))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.LoadEventArgs) => load(t0).runNow()))
    if (loadComplete != null) __obj.updateDynamic("loadComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.LoadCompleteEventArgs) => loadComplete(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (menuClick != null) __obj.updateDynamic("menuClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.MenuClickEventArgs) => menuClick(t0).runNow()))
    if (nameManager != null) __obj.updateDynamic("nameManager")(nameManager.asInstanceOf[js.Any])
    if (onImport != null) __obj.updateDynamic("onImport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.OnImportEventArgs) => onImport(t0).runNow()))
    if (openFailure != null) __obj.updateDynamic("openFailure")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.OpenFailureEventArgs) => openFailure(t0).runNow()))
    if (pagerClick != null) __obj.updateDynamic("pagerClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.PagerClickEventArgs) => pagerClick(t0).runNow()))
    if (pictureSettings != null) __obj.updateDynamic("pictureSettings")(pictureSettings.asInstanceOf[js.Any])
    if (printSettings != null) __obj.updateDynamic("printSettings")(printSettings.asInstanceOf[js.Any])
    if (resizeEnd != null) __obj.updateDynamic("resizeEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.ResizeEndEventArgs) => resizeEnd(t0).runNow()))
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.ResizeStartEventArgs) => resizeStart(t0).runNow()))
    if (ribbonClick != null) __obj.updateDynamic("ribbonClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.RibbonClickEventArgs) => ribbonClick(t0).runNow()))
    if (ribbonSettings != null) __obj.updateDynamic("ribbonSettings")(ribbonSettings.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (scrollSettings != null) __obj.updateDynamic("scrollSettings")(scrollSettings.asInstanceOf[js.Any])
    if (selectionSettings != null) __obj.updateDynamic("selectionSettings")(selectionSettings.asInstanceOf[js.Any])
    if (sheetCount != null) __obj.updateDynamic("sheetCount")(sheetCount.asInstanceOf[js.Any])
    if (sheets != null) __obj.updateDynamic("sheets")(sheets.asInstanceOf[js.Any])
    if (!js.isUndefined(showPager)) __obj.updateDynamic("showPager")(showPager.asInstanceOf[js.Any])
    if (!js.isUndefined(showRibbon)) __obj.updateDynamic("showRibbon")(showRibbon.asInstanceOf[js.Any])
    if (tabClick != null) __obj.updateDynamic("tabClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.TabClickEventArgs) => tabClick(t0).runNow()))
    if (tabSelect != null) __obj.updateDynamic("tabSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Spreadsheet.TabSelectEventArgs) => tabSelect(t0).runNow()))
    if (undoRedoStep != null) __obj.updateDynamic("undoRedoStep")(undoRedoStep.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

