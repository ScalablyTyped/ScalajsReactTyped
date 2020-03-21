package typingsJapgolly.handsontable.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTableCellElement
import org.scalajs.dom.raw.HTMLTableElement
import typingsJapgolly.handsontable.handsontableStrings.autoColumnSize
import typingsJapgolly.handsontable.handsontableStrings.autoRowSize
import typingsJapgolly.handsontable.handsontableStrings.autofill
import typingsJapgolly.handsontable.handsontableStrings.basePlugin
import typingsJapgolly.handsontable.handsontableStrings.bindRowsWithHeaders
import typingsJapgolly.handsontable.handsontableStrings.collapsibleColumns
import typingsJapgolly.handsontable.handsontableStrings.columnSorting
import typingsJapgolly.handsontable.handsontableStrings.columnSummary
import typingsJapgolly.handsontable.handsontableStrings.comment
import typingsJapgolly.handsontable.handsontableStrings.comments
import typingsJapgolly.handsontable.handsontableStrings.contextMenu
import typingsJapgolly.handsontable.handsontableStrings.copyPaste
import typingsJapgolly.handsontable.handsontableStrings.data
import typingsJapgolly.handsontable.handsontableStrings.down
import typingsJapgolly.handsontable.handsontableStrings.dragToScroll
import typingsJapgolly.handsontable.handsontableStrings.dropdownMenu
import typingsJapgolly.handsontable.handsontableStrings.exportFile
import typingsJapgolly.handsontable.handsontableStrings.filters
import typingsJapgolly.handsontable.handsontableStrings.formulas
import typingsJapgolly.handsontable.handsontableStrings.ganttChart
import typingsJapgolly.handsontable.handsontableStrings.headerTooltips
import typingsJapgolly.handsontable.handsontableStrings.hidden
import typingsJapgolly.handsontable.handsontableStrings.hiddenColumns
import typingsJapgolly.handsontable.handsontableStrings.hiddenRows
import typingsJapgolly.handsontable.handsontableStrings.insert_col
import typingsJapgolly.handsontable.handsontableStrings.insert_row
import typingsJapgolly.handsontable.handsontableStrings.isSearchResult
import typingsJapgolly.handsontable.handsontableStrings.left
import typingsJapgolly.handsontable.handsontableStrings.manualColumnFreeze
import typingsJapgolly.handsontable.handsontableStrings.manualColumnMove
import typingsJapgolly.handsontable.handsontableStrings.manualColumnResize
import typingsJapgolly.handsontable.handsontableStrings.manualRowMove
import typingsJapgolly.handsontable.handsontableStrings.manualRowResize
import typingsJapgolly.handsontable.handsontableStrings.mergeCells
import typingsJapgolly.handsontable.handsontableStrings.mixed
import typingsJapgolly.handsontable.handsontableStrings.multiColumnSorting
import typingsJapgolly.handsontable.handsontableStrings.multipleSelectionHandles
import typingsJapgolly.handsontable.handsontableStrings.nestedHeaders
import typingsJapgolly.handsontable.handsontableStrings.nestedRows
import typingsJapgolly.handsontable.handsontableStrings.observeChanges
import typingsJapgolly.handsontable.handsontableStrings.overwrite
import typingsJapgolly.handsontable.handsontableStrings.persistentState
import typingsJapgolly.handsontable.handsontableStrings.remove_col
import typingsJapgolly.handsontable.handsontableStrings.remove_row
import typingsJapgolly.handsontable.handsontableStrings.right
import typingsJapgolly.handsontable.handsontableStrings.search
import typingsJapgolly.handsontable.handsontableStrings.shift_down
import typingsJapgolly.handsontable.handsontableStrings.shift_right
import typingsJapgolly.handsontable.handsontableStrings.skipRowOnPaste
import typingsJapgolly.handsontable.handsontableStrings.touchScroll
import typingsJapgolly.handsontable.handsontableStrings.trimRows
import typingsJapgolly.handsontable.handsontableStrings.up
import typingsJapgolly.handsontable.handsontableStrings.valid
import typingsJapgolly.handsontable.mod.Handsontable.CellMeta
import typingsJapgolly.handsontable.mod.Handsontable.CellProperties
import typingsJapgolly.handsontable.mod.Handsontable.CellType
import typingsJapgolly.handsontable.mod.Handsontable.CellValue
import typingsJapgolly.handsontable.mod.Handsontable.ColumnDataGetterSetterFunction
import typingsJapgolly.handsontable.mod.Handsontable.GridSettings
import typingsJapgolly.handsontable.mod.Handsontable.RowObject
import typingsJapgolly.handsontable.mod.Handsontable._editors.Base
import typingsJapgolly.handsontable.mod.Handsontable.comments.CommentObject
import typingsJapgolly.handsontable.mod.Handsontable.plugins.AutoColumnSize
import typingsJapgolly.handsontable.mod.Handsontable.plugins.AutoRowSize
import typingsJapgolly.handsontable.mod.Handsontable.plugins.Autofill
import typingsJapgolly.handsontable.mod.Handsontable.plugins.BindRowsWithHeaders
import typingsJapgolly.handsontable.mod.Handsontable.plugins.CollapsibleColumns
import typingsJapgolly.handsontable.mod.Handsontable.plugins.ColumnSorting
import typingsJapgolly.handsontable.mod.Handsontable.plugins.ColumnSummary
import typingsJapgolly.handsontable.mod.Handsontable.plugins.Comments
import typingsJapgolly.handsontable.mod.Handsontable.plugins.ContextMenu
import typingsJapgolly.handsontable.mod.Handsontable.plugins.CopyPaste
import typingsJapgolly.handsontable.mod.Handsontable.plugins.DragToScroll
import typingsJapgolly.handsontable.mod.Handsontable.plugins.DropdownMenu
import typingsJapgolly.handsontable.mod.Handsontable.plugins.ExportFile
import typingsJapgolly.handsontable.mod.Handsontable.plugins.Filters
import typingsJapgolly.handsontable.mod.Handsontable.plugins.Formulas
import typingsJapgolly.handsontable.mod.Handsontable.plugins.GanttChart
import typingsJapgolly.handsontable.mod.Handsontable.plugins.HeaderTooltips
import typingsJapgolly.handsontable.mod.Handsontable.plugins.HiddenColumns
import typingsJapgolly.handsontable.mod.Handsontable.plugins.HiddenRows
import typingsJapgolly.handsontable.mod.Handsontable.plugins.ManualColumnFreeze
import typingsJapgolly.handsontable.mod.Handsontable.plugins.ManualColumnMove
import typingsJapgolly.handsontable.mod.Handsontable.plugins.ManualColumnResize
import typingsJapgolly.handsontable.mod.Handsontable.plugins.ManualRowMove
import typingsJapgolly.handsontable.mod.Handsontable.plugins.ManualRowResize
import typingsJapgolly.handsontable.mod.Handsontable.plugins.MergeCells
import typingsJapgolly.handsontable.mod.Handsontable.plugins.MultiColumnSorting
import typingsJapgolly.handsontable.mod.Handsontable.plugins.MultipleSelectionHandles
import typingsJapgolly.handsontable.mod.Handsontable.plugins.NestedHeaders
import typingsJapgolly.handsontable.mod.Handsontable.plugins.NestedRows
import typingsJapgolly.handsontable.mod.Handsontable.plugins.ObserveChanges
import typingsJapgolly.handsontable.mod.Handsontable.plugins.PersistenState
import typingsJapgolly.handsontable.mod.Handsontable.plugins.Search
import typingsJapgolly.handsontable.mod.Handsontable.plugins.TouchScroll
import typingsJapgolly.handsontable.mod.Handsontable.plugins.TrimRows
import typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords
import typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type Omit<T, K extends keyof T> = Pick<T, Exclude<keyof T, K>>; // TS >= 2.8
@JSImport("handsontable", "_Handsontable")
@js.native
object _Handsontable extends js.Object {
  @js.native
  trait Core extends js.Object {
    var container: HTMLElement = js.native
    var forceFullRender: Boolean = js.native
    var isDestroyed: Boolean = js.native
    var renderCall: Boolean = js.native
    var rootDocument: Document_ = js.native
    var rootElement: HTMLElement = js.native
    var rootWindow: Window_ = js.native
    var table: HTMLTableElement = js.native
    def addHook[K /* <: String */](
      key: K,
      callback: /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ): Unit = js.native
    def addHook[K /* <: String */](
      key: K,
      callback: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
        ]
    ): Unit = js.native
    def addHookOnce[K /* <: String */](
      key: K,
      callback: /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ): Unit = js.native
    def addHookOnce[K /* <: String */](
      key: K,
      callback: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
        ]
    ): Unit = js.native
    @JSName("alter")
    def alter_insertcol(action: insert_col): Unit = js.native
    @JSName("alter")
    def alter_insertcol(action: insert_col, index: js.Array[js.Tuple2[Double, Double]]): Unit = js.native
    @JSName("alter")
    def alter_insertcol(action: insert_col, index: js.Array[js.Tuple2[Double, Double]], amount: Double): Unit = js.native
    @JSName("alter")
    def alter_insertcol(action: insert_col, index: js.Array[js.Tuple2[Double, Double]], amount: Double, source: String): Unit = js.native
    @JSName("alter")
    def alter_insertcol(
      action: insert_col,
      index: js.Array[js.Tuple2[Double, Double]],
      amount: Double,
      source: String,
      keepEmptyRows: Boolean
    ): Unit = js.native
    @JSName("alter")
    def alter_insertcol(action: insert_col, index: Double): Unit = js.native
    @JSName("alter")
    def alter_insertcol(action: insert_col, index: Double, amount: Double): Unit = js.native
    @JSName("alter")
    def alter_insertcol(action: insert_col, index: Double, amount: Double, source: String): Unit = js.native
    @JSName("alter")
    def alter_insertcol(action: insert_col, index: Double, amount: Double, source: String, keepEmptyRows: Boolean): Unit = js.native
    @JSName("alter")
    def alter_insertrow(action: insert_row): Unit = js.native
    @JSName("alter")
    def alter_insertrow(action: insert_row, index: js.Array[js.Tuple2[Double, Double]]): Unit = js.native
    @JSName("alter")
    def alter_insertrow(action: insert_row, index: js.Array[js.Tuple2[Double, Double]], amount: Double): Unit = js.native
    @JSName("alter")
    def alter_insertrow(action: insert_row, index: js.Array[js.Tuple2[Double, Double]], amount: Double, source: String): Unit = js.native
    @JSName("alter")
    def alter_insertrow(
      action: insert_row,
      index: js.Array[js.Tuple2[Double, Double]],
      amount: Double,
      source: String,
      keepEmptyRows: Boolean
    ): Unit = js.native
    @JSName("alter")
    def alter_insertrow(action: insert_row, index: Double): Unit = js.native
    @JSName("alter")
    def alter_insertrow(action: insert_row, index: Double, amount: Double): Unit = js.native
    @JSName("alter")
    def alter_insertrow(action: insert_row, index: Double, amount: Double, source: String): Unit = js.native
    @JSName("alter")
    def alter_insertrow(action: insert_row, index: Double, amount: Double, source: String, keepEmptyRows: Boolean): Unit = js.native
    @JSName("alter")
    def alter_removecol(action: remove_col): Unit = js.native
    @JSName("alter")
    def alter_removecol(action: remove_col, index: js.Array[js.Tuple2[Double, Double]]): Unit = js.native
    @JSName("alter")
    def alter_removecol(action: remove_col, index: js.Array[js.Tuple2[Double, Double]], amount: Double): Unit = js.native
    @JSName("alter")
    def alter_removecol(action: remove_col, index: js.Array[js.Tuple2[Double, Double]], amount: Double, source: String): Unit = js.native
    @JSName("alter")
    def alter_removecol(
      action: remove_col,
      index: js.Array[js.Tuple2[Double, Double]],
      amount: Double,
      source: String,
      keepEmptyRows: Boolean
    ): Unit = js.native
    @JSName("alter")
    def alter_removecol(action: remove_col, index: Double): Unit = js.native
    @JSName("alter")
    def alter_removecol(action: remove_col, index: Double, amount: Double): Unit = js.native
    @JSName("alter")
    def alter_removecol(action: remove_col, index: Double, amount: Double, source: String): Unit = js.native
    @JSName("alter")
    def alter_removecol(action: remove_col, index: Double, amount: Double, source: String, keepEmptyRows: Boolean): Unit = js.native
    @JSName("alter")
    def alter_removerow(action: remove_row): Unit = js.native
    @JSName("alter")
    def alter_removerow(action: remove_row, index: js.Array[js.Tuple2[Double, Double]]): Unit = js.native
    @JSName("alter")
    def alter_removerow(action: remove_row, index: js.Array[js.Tuple2[Double, Double]], amount: Double): Unit = js.native
    @JSName("alter")
    def alter_removerow(action: remove_row, index: js.Array[js.Tuple2[Double, Double]], amount: Double, source: String): Unit = js.native
    @JSName("alter")
    def alter_removerow(
      action: remove_row,
      index: js.Array[js.Tuple2[Double, Double]],
      amount: Double,
      source: String,
      keepEmptyRows: Boolean
    ): Unit = js.native
    @JSName("alter")
    def alter_removerow(action: remove_row, index: Double): Unit = js.native
    @JSName("alter")
    def alter_removerow(action: remove_row, index: Double, amount: Double): Unit = js.native
    @JSName("alter")
    def alter_removerow(action: remove_row, index: Double, amount: Double, source: String): Unit = js.native
    @JSName("alter")
    def alter_removerow(action: remove_row, index: Double, amount: Double, source: String, keepEmptyRows: Boolean): Unit = js.native
    def clear(): Unit = js.native
    def colOffset(): Double = js.native
    def colToProp(col: Double): String | Double = js.native
    def countCols(): Double = js.native
    def countEmptyCols(): Double = js.native
    def countEmptyCols(ending: Boolean): Double = js.native
    def countEmptyRows(): Double = js.native
    def countEmptyRows(ending: Boolean): Double = js.native
    def countRenderedCols(): Double = js.native
    def countRenderedRows(): Double = js.native
    def countRows(): Double = js.native
    def countSourceCols(): Double = js.native
    def countSourceRows(): Double = js.native
    def countVisibleCols(): Double = js.native
    def countVisibleRows(): Double = js.native
    def deselectCell(): Unit = js.native
    def destroy(): Unit = js.native
    def destroyEditor(): Unit = js.native
    def destroyEditor(revertOriginal: Boolean): Unit = js.native
    def destroyEditor(revertOriginal: Boolean, prepareEditorIfNeeded: Boolean): Unit = js.native
    def emptySelectedCells(): Unit = js.native
    def getActiveEditor[T /* <: Base */](): js.UndefOr[T] = js.native
    def getCell(row: Double, col: Double): HTMLTableCellElement | Null = js.native
    def getCell(row: Double, col: Double, topmost: Boolean): HTMLTableCellElement | Null = js.native
    def getCellEditor[T /* <: Base */](cellMeta: CellMeta): T = js.native
    def getCellEditor[T /* <: Base */](row: Double, col: Double): T = js.native
    def getCellMeta(row: Double, col: Double): CellProperties = js.native
    def getCellMetaAtRow(row: Double): js.Array[CellProperties] = js.native
    def getCellRenderer(cellMeta: CellMeta): typingsJapgolly.handsontable.mod.Handsontable.renderers.Base = js.native
    def getCellRenderer(row: Double, col: Double): typingsJapgolly.handsontable.mod.Handsontable.renderers.Base = js.native
    def getCellValidator(cellMeta: CellMeta): js.UndefOr[typingsJapgolly.handsontable.mod.Handsontable.validators.Base | js.RegExp] = js.native
    def getCellValidator(row: Double, col: Double): js.UndefOr[typingsJapgolly.handsontable.mod.Handsontable.validators.Base | js.RegExp] = js.native
    def getCellsMeta(): js.Array[CellProperties] = js.native
    def getColHeader(): js.Array[Double | String] = js.native
    def getColHeader(col: Double): Double | String = js.native
    def getColWidth(col: Double): Double = js.native
    def getCoords(): CellCoords = js.native
    def getCoords(elem: Element): CellCoords = js.native
    def getCopyableData(row: Double, column: Double): String = js.native
    def getCopyableText(startRow: Double, startCol: Double, endRow: Double, endCol: Double): String = js.native
    def getData(): js.Array[CellValue] = js.native
    def getData(row: Double): js.Array[CellValue] = js.native
    def getData(row: Double, column: Double): js.Array[CellValue] = js.native
    def getData(row: Double, column: Double, row2: Double): js.Array[CellValue] = js.native
    def getData(row: Double, column: Double, row2: Double, column2: Double): js.Array[CellValue] = js.native
    def getDataAtCell(row: Double, column: Double): CellValue = js.native
    def getDataAtCol(column: Double): js.Array[CellValue] = js.native
    def getDataAtProp(prop: String): js.Array[CellValue] = js.native
    def getDataAtProp(prop: Double): js.Array[CellValue] = js.native
    def getDataAtRow(row: Double): js.Array[CellValue] = js.native
    def getDataAtRowProp(row: Double, prop: String): CellValue = js.native
    def getDataType(rowFrom: Double, columnFrom: Double, rowTo: Double, columnTo: Double): CellType | mixed = js.native
    def getInstance(): Handsontable = js.native
    @JSName("getPlugin")
    def getPlugin_autoColumnSize(pluginName: autoColumnSize): AutoColumnSize = js.native
    @JSName("getPlugin")
    def getPlugin_autoRowSize(pluginName: autoRowSize): AutoRowSize = js.native
    @JSName("getPlugin")
    def getPlugin_autofill(pluginName: autofill): Autofill = js.native
    @JSName("getPlugin")
    def getPlugin_basePlugin(pluginName: basePlugin): typingsJapgolly.handsontable.mod.Handsontable.plugins.Base = js.native
    @JSName("getPlugin")
    def getPlugin_bindRowsWithHeaders(pluginName: bindRowsWithHeaders): BindRowsWithHeaders = js.native
    @JSName("getPlugin")
    def getPlugin_collapsibleColumns(pluginName: collapsibleColumns): CollapsibleColumns = js.native
    @JSName("getPlugin")
    def getPlugin_columnSorting(pluginName: columnSorting): ColumnSorting = js.native
    @JSName("getPlugin")
    def getPlugin_columnSummary(pluginName: columnSummary): ColumnSummary = js.native
    @JSName("getPlugin")
    def getPlugin_comments(pluginName: comments): Comments = js.native
    @JSName("getPlugin")
    def getPlugin_contextMenu(pluginName: contextMenu): ContextMenu = js.native
    @JSName("getPlugin")
    def getPlugin_copyPaste(pluginName: copyPaste): CopyPaste = js.native
    @JSName("getPlugin")
    def getPlugin_dragToScroll(pluginName: dragToScroll): DragToScroll = js.native
    @JSName("getPlugin")
    def getPlugin_dropdownMenu(pluginName: dropdownMenu): DropdownMenu = js.native
    @JSName("getPlugin")
    def getPlugin_exportFile(pluginName: exportFile): ExportFile = js.native
    @JSName("getPlugin")
    def getPlugin_filters(pluginName: filters): Filters = js.native
    @JSName("getPlugin")
    def getPlugin_formulas(pluginName: formulas): Formulas = js.native
    @JSName("getPlugin")
    def getPlugin_ganttChart(pluginName: ganttChart): GanttChart = js.native
    @JSName("getPlugin")
    def getPlugin_headerTooltips(pluginName: headerTooltips): HeaderTooltips = js.native
    @JSName("getPlugin")
    def getPlugin_hiddenColumns(pluginName: hiddenColumns): HiddenColumns = js.native
    @JSName("getPlugin")
    def getPlugin_hiddenRows(pluginName: hiddenRows): HiddenRows = js.native
    @JSName("getPlugin")
    def getPlugin_manualColumnFreeze(pluginName: manualColumnFreeze): ManualColumnFreeze = js.native
    @JSName("getPlugin")
    def getPlugin_manualColumnMove(pluginName: manualColumnMove): ManualColumnMove = js.native
    @JSName("getPlugin")
    def getPlugin_manualColumnResize(pluginName: manualColumnResize): ManualColumnResize = js.native
    @JSName("getPlugin")
    def getPlugin_manualRowMove(pluginName: manualRowMove): ManualRowMove = js.native
    @JSName("getPlugin")
    def getPlugin_manualRowResize(pluginName: manualRowResize): ManualRowResize = js.native
    @JSName("getPlugin")
    def getPlugin_mergeCells(pluginName: mergeCells): MergeCells = js.native
    @JSName("getPlugin")
    def getPlugin_multiColumnSorting(pluginName: multiColumnSorting): MultiColumnSorting = js.native
    @JSName("getPlugin")
    def getPlugin_multipleSelectionHandles(pluginName: multipleSelectionHandles): MultipleSelectionHandles = js.native
    @JSName("getPlugin")
    def getPlugin_nestedHeaders(pluginName: nestedHeaders): NestedHeaders = js.native
    @JSName("getPlugin")
    def getPlugin_nestedRows(pluginName: nestedRows): NestedRows = js.native
    @JSName("getPlugin")
    def getPlugin_observeChanges(pluginName: observeChanges): ObserveChanges = js.native
    @JSName("getPlugin")
    def getPlugin_persistentState(pluginName: persistentState): PersistenState = js.native
    @JSName("getPlugin")
    def getPlugin_search(pluginName: search): Search = js.native
    @JSName("getPlugin")
    def getPlugin_touchScroll(pluginName: touchScroll): TouchScroll = js.native
    @JSName("getPlugin")
    def getPlugin_trimRows(pluginName: trimRows): TrimRows = js.native
    def getRowHeader(): js.Array[String | Double] = js.native
    def getRowHeader(row: Double): String | Double = js.native
    def getRowHeight(row: Double): Double = js.native
    def getSchema(): RowObject = js.native
    def getSelected(): js.UndefOr[js.Array[js.Tuple4[Double, Double, Double, Double]]] = js.native
    def getSelectedLast(): js.UndefOr[js.Array[Double]] = js.native
    def getSelectedRange(): js.UndefOr[js.Array[CellRange]] = js.native
    def getSelectedRangeLast(): js.UndefOr[CellRange] = js.native
    def getSettings(): GridSettings = js.native
    def getSourceData(): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Double, column: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Double, column: Double, row2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Double, column: Double, row2: Double, column2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceDataArray(): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Double, column: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Double, column: Double, row2: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Double, column: Double, row2: Double, ccolumn2: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataAtCell(row: Double, column: Double): CellValue = js.native
    def getSourceDataAtCol(column: Double): js.Array[CellValue] = js.native
    def getSourceDataAtRow(row: Double): js.Array[CellValue] | RowObject = js.native
    def getTranslatedPhrase(dictionaryKey: String, extraArguments: js.Any): String | Null = js.native
    def getValue(): CellValue = js.native
    def hasColHeaders(): Boolean = js.native
    def hasHook(key: String): Boolean = js.native
    def hasRowHeaders(): Boolean = js.native
    def init(): js.Function0[Unit] = js.native
    def isColumnModificationAllowed(): Boolean = js.native
    def isEmptyCol(col: Double): Boolean = js.native
    def isEmptyRow(row: Double): Boolean = js.native
    def isListening(): Boolean = js.native
    def listen(): Unit = js.native
    def loadData(data: js.Array[js.Array[CellValue] | RowObject]): Unit = js.native
    def populateFromArray(
      row: Double,
      col: Double,
      input: js.Array[js.Array[CellValue]],
      endRow: js.UndefOr[Double],
      endCol: js.UndefOr[Double],
      source: js.UndefOr[String],
      method: js.UndefOr[overwrite | shift_down | shift_right],
      direction: js.UndefOr[down | left | right | up],
      deltas: js.UndefOr[js.Array[_]]
    ): Unit = js.native
    def propToCol(prop: String): Double = js.native
    def propToCol(prop: Double): Double = js.native
    def refreshDimensions(): Unit = js.native
    def removeCellMeta(row: Double, col: Double, key: String): Unit = js.native
    @JSName("removeCellMeta")
    def removeCellMeta_comment(row: Double, col: Double, key: comment): Unit = js.native
    @JSName("removeCellMeta")
    def removeCellMeta_hidden(row: Double, col: Double, key: hidden): Unit = js.native
    @JSName("removeCellMeta")
    def removeCellMeta_isSearchResult(row: Double, col: Double, key: isSearchResult): Unit = js.native
    @JSName("removeCellMeta")
    def removeCellMeta_skipRowOnPaste(row: Double, col: Double, key: skipRowOnPaste): Unit = js.native
    @JSName("removeCellMeta")
    def removeCellMeta_valid(row: Double, col: Double, key: valid): Unit = js.native
    def removeHook[K /* <: String */](
      key: K,
      callback: /* import warning: importer.ImportType#apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ): Unit = js.native
    def render(): Unit = js.native
    def rowOffset(): Double = js.native
    def runHooks(
      key: String,
      p1: js.UndefOr[js.Any],
      p2: js.UndefOr[js.Any],
      p3: js.UndefOr[js.Any],
      p4: js.UndefOr[js.Any],
      p5: js.UndefOr[js.Any],
      p6: js.UndefOr[js.Any]
    ): js.Any = js.native
    // Requires TS 3.0:
    // runHooks<K extends keyof Handsontable.Events>(key: K, ...params: Parameters<Handsontable.Events[K]>): ReturnType<Handsontable.Events[K]>;
    def scrollViewportTo(): Boolean = js.native
    def scrollViewportTo(row: Double): Boolean = js.native
    def scrollViewportTo(row: Double, column: Double): Boolean = js.native
    def scrollViewportTo(row: Double, column: Double, snapToBottom: Boolean): Boolean = js.native
    def scrollViewportTo(row: Double, column: Double, snapToBottom: Boolean, snapToRight: Boolean): Boolean = js.native
    def selectAll(): Unit = js.native
    def selectCell(row: Double, col: Double): Boolean = js.native
    def selectCell(row: Double, col: Double, endRow: Double): Boolean = js.native
    def selectCell(row: Double, col: Double, endRow: Double, endCol: Double): Boolean = js.native
    def selectCell(row: Double, col: Double, endRow: Double, endCol: Double, scrollToCell: Boolean): Boolean = js.native
    def selectCell(
      row: Double,
      col: Double,
      endRow: Double,
      endCol: Double,
      scrollToCell: Boolean,
      changeListener: Boolean
    ): Boolean = js.native
    def selectCellByProp(row: Double, prop: String): Boolean = js.native
    def selectCellByProp(row: Double, prop: String, endRow: Double): Boolean = js.native
    def selectCellByProp(row: Double, prop: String, endRow: Double, endProp: String): Boolean = js.native
    def selectCellByProp(row: Double, prop: String, endRow: Double, endProp: String, scrollToCell: Boolean): Boolean = js.native
    def selectCells(coords: js.Array[CellRange | (js.Tuple4[Double, Double | String, Double, Double | String])]): Boolean = js.native
    def selectCells(
      coords: js.Array[CellRange | (js.Tuple4[Double, Double | String, Double, Double | String])],
      scrollToCell: Boolean
    ): Boolean = js.native
    def selectCells(
      coords: js.Array[CellRange | (js.Tuple4[Double, Double | String, Double, Double | String])],
      scrollToCell: Boolean,
      changeListener: Boolean
    ): Boolean = js.native
    def selectColumns(startColumn: String): Boolean = js.native
    def selectColumns(startColumn: String, endColumn: String): Boolean = js.native
    def selectColumns(startColumn: String, endColumn: Double): Boolean = js.native
    def selectColumns(startColumn: Double): Boolean = js.native
    def selectColumns(startColumn: Double, endColumn: String): Boolean = js.native
    def selectColumns(startColumn: Double, endColumn: Double): Boolean = js.native
    def selectRows(startRow: Double): Boolean = js.native
    def selectRows(startRow: Double, endRow: Double): Boolean = js.native
    def setCellMeta(row: Double, col: Double, key: String, `val`: js.Any): Unit = js.native
    def setCellMetaObject[T /* <: CellMeta */](row: Double, col: Double, prop: T): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_comment(row: Double, col: Double, key: comment, `val`: CommentObject): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_data(row: Double, col: Double, key: data, `val`: String): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_data(row: Double, col: Double, key: data, `val`: Double): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_data(row: Double, col: Double, key: data, `val`: ColumnDataGetterSetterFunction): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_hidden(row: Double, col: Double, key: hidden, `val`: Boolean): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_isSearchResult(row: Double, col: Double, key: isSearchResult, `val`: Boolean): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_skipRowOnPaste(row: Double, col: Double, key: skipRowOnPaste, `val`: Boolean): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_valid(row: Double, col: Double, key: valid, `val`: Boolean): Unit = js.native
    def setDataAtCell(changes: js.Array[js.Tuple3[Double, String | Double, CellValue]]): Unit = js.native
    def setDataAtCell(changes: js.Array[js.Tuple3[Double, String | Double, CellValue]], source: String): Unit = js.native
    def setDataAtCell(row: Double, col: String, value: CellValue): Unit = js.native
    def setDataAtCell(row: Double, col: String, value: CellValue, source: String): Unit = js.native
    def setDataAtCell(row: Double, col: Double, value: CellValue): Unit = js.native
    def setDataAtCell(row: Double, col: Double, value: CellValue, source: String): Unit = js.native
    def setDataAtRowProp(changes: js.Array[js.Tuple3[Double, String | Double, CellValue]]): Unit = js.native
    def setDataAtRowProp(changes: js.Array[js.Tuple3[Double, String | Double, CellValue]], source: String): Unit = js.native
    def setDataAtRowProp(row: Double, prop: String, value: CellValue): Unit = js.native
    def setDataAtRowProp(row: Double, prop: String, value: CellValue, source: String): Unit = js.native
    def spliceCol(col: Double, index: Double, amount: Double, elements: CellValue*): Unit = js.native
    def spliceRow(row: Double, index: Double, amount: Double, elements: CellValue*): Unit = js.native
    def toHTML(): String = js.native
    def toPhysicalColumn(column: Double): Double = js.native
    def toPhysicalRow(row: Double): Double = js.native
    def toTableElement(): HTMLTableElement = js.native
    def toVisualColumn(column: Double): Double = js.native
    def toVisualRow(row: Double): Double = js.native
    def unlisten(): Unit = js.native
    def updateSettings(settings: GridSettings): Unit = js.native
    def updateSettings(settings: GridSettings, init: Boolean): Unit = js.native
    def validateCell(
      value: js.Any,
      cellProperties: CellProperties,
      callback: js.Function1[/* valid */ Boolean, Unit],
      source: String
    ): Unit = js.native
    def validateCells(): Unit = js.native
    def validateCells(callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
    def validateColumns(columns: js.Array[Double]): Unit = js.native
    def validateColumns(columns: js.Array[Double], callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
    def validateRows(rows: js.Array[Double]): Unit = js.native
    def validateRows(rows: js.Array[Double], callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  }
  
}

