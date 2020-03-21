package typingsJapgolly.handsontable.mod.Handsontable

import typingsJapgolly.handsontable.mod.Handsontable.plugins.AutoColumnSize
import typingsJapgolly.handsontable.mod.Handsontable.plugins.AutoRowSize
import typingsJapgolly.handsontable.mod.Handsontable.plugins.Autofill
import typingsJapgolly.handsontable.mod.Handsontable.plugins.Base
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Plugin collection, map for getPlugin method
trait PluginsCollection extends js.Object {
  var autoColumnSize: AutoColumnSize
  var autoRowSize: AutoRowSize
  var autofill: Autofill
  var basePlugin: Base
  var bindRowsWithHeaders: BindRowsWithHeaders
  var collapsibleColumns: CollapsibleColumns
  var columnSorting: ColumnSorting
  var columnSummary: ColumnSummary
  var comments: Comments
  var contextMenu: ContextMenu
  var copyPaste: CopyPaste
  var dragToScroll: DragToScroll
  var dropdownMenu: DropdownMenu
  var exportFile: ExportFile
  var filters: Filters
  var formulas: Formulas
  var ganttChart: GanttChart
  var headerTooltips: HeaderTooltips
  var hiddenColumns: HiddenColumns
  var hiddenRows: HiddenRows
  var manualColumnFreeze: ManualColumnFreeze
  var manualColumnMove: ManualColumnMove
  var manualColumnResize: ManualColumnResize
  var manualRowMove: ManualRowMove
  var manualRowResize: ManualRowResize
  var mergeCells: MergeCells
  var multiColumnSorting: MultiColumnSorting
  var multipleSelectionHandles: MultipleSelectionHandles
  var nestedHeaders: NestedHeaders
  var nestedRows: NestedRows
  var observeChanges: ObserveChanges
  var persistentState: PersistenState
  var search: Search
  var touchScroll: TouchScroll
  var trimRows: TrimRows
}

object PluginsCollection {
  @scala.inline
  def apply(
    autoColumnSize: AutoColumnSize,
    autoRowSize: AutoRowSize,
    autofill: Autofill,
    basePlugin: Base,
    bindRowsWithHeaders: BindRowsWithHeaders,
    collapsibleColumns: CollapsibleColumns,
    columnSorting: ColumnSorting,
    columnSummary: ColumnSummary,
    comments: Comments,
    contextMenu: ContextMenu,
    copyPaste: CopyPaste,
    dragToScroll: DragToScroll,
    dropdownMenu: DropdownMenu,
    exportFile: ExportFile,
    filters: Filters,
    formulas: Formulas,
    ganttChart: GanttChart,
    headerTooltips: HeaderTooltips,
    hiddenColumns: HiddenColumns,
    hiddenRows: HiddenRows,
    manualColumnFreeze: ManualColumnFreeze,
    manualColumnMove: ManualColumnMove,
    manualColumnResize: ManualColumnResize,
    manualRowMove: ManualRowMove,
    manualRowResize: ManualRowResize,
    mergeCells: MergeCells,
    multiColumnSorting: MultiColumnSorting,
    multipleSelectionHandles: MultipleSelectionHandles,
    nestedHeaders: NestedHeaders,
    nestedRows: NestedRows,
    observeChanges: ObserveChanges,
    persistentState: PersistenState,
    search: Search,
    touchScroll: TouchScroll,
    trimRows: TrimRows
  ): PluginsCollection = {
    val __obj = js.Dynamic.literal(autoColumnSize = autoColumnSize.asInstanceOf[js.Any], autoRowSize = autoRowSize.asInstanceOf[js.Any], autofill = autofill.asInstanceOf[js.Any], basePlugin = basePlugin.asInstanceOf[js.Any], bindRowsWithHeaders = bindRowsWithHeaders.asInstanceOf[js.Any], collapsibleColumns = collapsibleColumns.asInstanceOf[js.Any], columnSorting = columnSorting.asInstanceOf[js.Any], columnSummary = columnSummary.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], copyPaste = copyPaste.asInstanceOf[js.Any], dragToScroll = dragToScroll.asInstanceOf[js.Any], dropdownMenu = dropdownMenu.asInstanceOf[js.Any], exportFile = exportFile.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], formulas = formulas.asInstanceOf[js.Any], ganttChart = ganttChart.asInstanceOf[js.Any], headerTooltips = headerTooltips.asInstanceOf[js.Any], hiddenColumns = hiddenColumns.asInstanceOf[js.Any], hiddenRows = hiddenRows.asInstanceOf[js.Any], manualColumnFreeze = manualColumnFreeze.asInstanceOf[js.Any], manualColumnMove = manualColumnMove.asInstanceOf[js.Any], manualColumnResize = manualColumnResize.asInstanceOf[js.Any], manualRowMove = manualRowMove.asInstanceOf[js.Any], manualRowResize = manualRowResize.asInstanceOf[js.Any], mergeCells = mergeCells.asInstanceOf[js.Any], multiColumnSorting = multiColumnSorting.asInstanceOf[js.Any], multipleSelectionHandles = multipleSelectionHandles.asInstanceOf[js.Any], nestedHeaders = nestedHeaders.asInstanceOf[js.Any], nestedRows = nestedRows.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], persistentState = persistentState.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], touchScroll = touchScroll.asInstanceOf[js.Any], trimRows = trimRows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginsCollection]
  }
}

