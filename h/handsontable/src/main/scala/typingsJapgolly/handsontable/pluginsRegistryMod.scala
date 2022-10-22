package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.anon.TypeofBasePlugin
import typingsJapgolly.handsontable.handsontableStrings.autoColumnSize
import typingsJapgolly.handsontable.handsontableStrings.autoRowSize
import typingsJapgolly.handsontable.handsontableStrings.autofill
import typingsJapgolly.handsontable.handsontableStrings.basePlugin
import typingsJapgolly.handsontable.handsontableStrings.bindRowsWithHeaders
import typingsJapgolly.handsontable.handsontableStrings.collapsibleColumns
import typingsJapgolly.handsontable.handsontableStrings.columnSorting
import typingsJapgolly.handsontable.handsontableStrings.columnSummary
import typingsJapgolly.handsontable.handsontableStrings.comments
import typingsJapgolly.handsontable.handsontableStrings.contextMenu
import typingsJapgolly.handsontable.handsontableStrings.copyPaste
import typingsJapgolly.handsontable.handsontableStrings.customBorders
import typingsJapgolly.handsontable.handsontableStrings.dragToScroll
import typingsJapgolly.handsontable.handsontableStrings.dropdownMenu
import typingsJapgolly.handsontable.handsontableStrings.exportFile
import typingsJapgolly.handsontable.handsontableStrings.filters
import typingsJapgolly.handsontable.handsontableStrings.formulas
import typingsJapgolly.handsontable.handsontableStrings.hiddenColumns
import typingsJapgolly.handsontable.handsontableStrings.hiddenRows
import typingsJapgolly.handsontable.handsontableStrings.manualColumnFreeze
import typingsJapgolly.handsontable.handsontableStrings.manualColumnMove
import typingsJapgolly.handsontable.handsontableStrings.manualColumnResize
import typingsJapgolly.handsontable.handsontableStrings.manualRowMove
import typingsJapgolly.handsontable.handsontableStrings.manualRowResize
import typingsJapgolly.handsontable.handsontableStrings.mergeCells
import typingsJapgolly.handsontable.handsontableStrings.multiColumnSorting
import typingsJapgolly.handsontable.handsontableStrings.multipleSelectionHandles
import typingsJapgolly.handsontable.handsontableStrings.nestedHeaders
import typingsJapgolly.handsontable.handsontableStrings.nestedRows
import typingsJapgolly.handsontable.handsontableStrings.persistentState
import typingsJapgolly.handsontable.handsontableStrings.search
import typingsJapgolly.handsontable.handsontableStrings.touchScroll
import typingsJapgolly.handsontable.handsontableStrings.trimRows
import typingsJapgolly.handsontable.handsontableStrings.undoRedo
import typingsJapgolly.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize
import typingsJapgolly.handsontable.pluginsAutoRowSizeMod.AutoRowSize
import typingsJapgolly.handsontable.pluginsAutofillMod.Autofill
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import typingsJapgolly.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders
import typingsJapgolly.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns
import typingsJapgolly.handsontable.pluginsColumnSortingMod.ColumnSorting
import typingsJapgolly.handsontable.pluginsColumnSummaryMod.ColumnSummary
import typingsJapgolly.handsontable.pluginsCommentsMod.Comments
import typingsJapgolly.handsontable.pluginsContextMenuMod.ContextMenu
import typingsJapgolly.handsontable.pluginsCopyPasteMod.CopyPaste
import typingsJapgolly.handsontable.pluginsCustomBordersMod.CustomBorders
import typingsJapgolly.handsontable.pluginsDragToScrollMod.DragToScroll
import typingsJapgolly.handsontable.pluginsDropdownMenuMod.DropdownMenu
import typingsJapgolly.handsontable.pluginsExportFileMod.ExportFile
import typingsJapgolly.handsontable.pluginsFiltersMod.Filters
import typingsJapgolly.handsontable.pluginsFormulasMod.Formulas
import typingsJapgolly.handsontable.pluginsHiddenColumnsMod.HiddenColumns
import typingsJapgolly.handsontable.pluginsHiddenRowsMod.HiddenRows
import typingsJapgolly.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze
import typingsJapgolly.handsontable.pluginsManualColumnMoveMod.ManualColumnMove
import typingsJapgolly.handsontable.pluginsManualColumnResizeMod.ManualColumnResize
import typingsJapgolly.handsontable.pluginsManualRowMoveMod.ManualRowMove
import typingsJapgolly.handsontable.pluginsManualRowResizeMod.ManualRowResize
import typingsJapgolly.handsontable.pluginsMergeCellsMod.MergeCells
import typingsJapgolly.handsontable.pluginsMultiColumnSortingMod.MultiColumnSorting
import typingsJapgolly.handsontable.pluginsMultipleSelectionHandlesMod.MultipleSelectionHandles
import typingsJapgolly.handsontable.pluginsNestedHeadersMod.NestedHeaders
import typingsJapgolly.handsontable.pluginsNestedRowsMod.NestedRows
import typingsJapgolly.handsontable.pluginsPersistentStateMod.PersistentState
import typingsJapgolly.handsontable.pluginsSearchMod.Search
import typingsJapgolly.handsontable.pluginsTouchScrollMod.TouchScroll
import typingsJapgolly.handsontable.pluginsTrimRowsMod.TrimRows
import typingsJapgolly.handsontable.pluginsUndoRedoMod.UndoRedo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsRegistryMod {
  
  @JSImport("handsontable/plugins/registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPlugin(pluginName: String): BasePlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[BasePlugin]
  
  inline def getPlugin_autoColumnSize(pluginName: autoColumnSize): AutoColumnSize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[AutoColumnSize]
  
  inline def getPlugin_autoRowSize(pluginName: autoRowSize): AutoRowSize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[AutoRowSize]
  
  inline def getPlugin_autofill(pluginName: autofill): Autofill = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[Autofill]
  
  inline def getPlugin_basePlugin(pluginName: basePlugin): BasePlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[BasePlugin]
  
  inline def getPlugin_bindRowsWithHeaders(pluginName: bindRowsWithHeaders): BindRowsWithHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[BindRowsWithHeaders]
  
  inline def getPlugin_collapsibleColumns(pluginName: collapsibleColumns): CollapsibleColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[CollapsibleColumns]
  
  inline def getPlugin_columnSorting(pluginName: columnSorting): ColumnSorting = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[ColumnSorting]
  
  inline def getPlugin_columnSummary(pluginName: columnSummary): ColumnSummary = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[ColumnSummary]
  
  inline def getPlugin_comments(pluginName: comments): Comments = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[Comments]
  
  inline def getPlugin_contextMenu(pluginName: contextMenu): ContextMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[ContextMenu]
  
  inline def getPlugin_copyPaste(pluginName: copyPaste): CopyPaste = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[CopyPaste]
  
  inline def getPlugin_customBorders(pluginName: customBorders): CustomBorders = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[CustomBorders]
  
  inline def getPlugin_dragToScroll(pluginName: dragToScroll): DragToScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[DragToScroll]
  
  inline def getPlugin_dropdownMenu(pluginName: dropdownMenu): DropdownMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[DropdownMenu]
  
  inline def getPlugin_exportFile(pluginName: exportFile): ExportFile = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[ExportFile]
  
  inline def getPlugin_filters(pluginName: filters): Filters = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[Filters]
  
  inline def getPlugin_formulas(pluginName: formulas): Formulas = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[Formulas]
  
  inline def getPlugin_hiddenColumns(pluginName: hiddenColumns): HiddenColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[HiddenColumns]
  
  inline def getPlugin_hiddenRows(pluginName: hiddenRows): HiddenRows = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[HiddenRows]
  
  inline def getPlugin_manualColumnFreeze(pluginName: manualColumnFreeze): ManualColumnFreeze = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[ManualColumnFreeze]
  
  inline def getPlugin_manualColumnMove(pluginName: manualColumnMove): ManualColumnMove = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[ManualColumnMove]
  
  inline def getPlugin_manualColumnResize(pluginName: manualColumnResize): ManualColumnResize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[ManualColumnResize]
  
  inline def getPlugin_manualRowMove(pluginName: manualRowMove): ManualRowMove = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[ManualRowMove]
  
  inline def getPlugin_manualRowResize(pluginName: manualRowResize): ManualRowResize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[ManualRowResize]
  
  inline def getPlugin_mergeCells(pluginName: mergeCells): MergeCells = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[MergeCells]
  
  inline def getPlugin_multiColumnSorting(pluginName: multiColumnSorting): MultiColumnSorting = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[MultiColumnSorting]
  
  inline def getPlugin_multipleSelectionHandles(pluginName: multipleSelectionHandles): MultipleSelectionHandles = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[MultipleSelectionHandles]
  
  inline def getPlugin_nestedHeaders(pluginName: nestedHeaders): NestedHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[NestedHeaders]
  
  inline def getPlugin_nestedRows(pluginName: nestedRows): NestedRows = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[NestedRows]
  
  inline def getPlugin_persistentState(pluginName: persistentState): PersistentState = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[PersistentState]
  
  inline def getPlugin_search(pluginName: search): Search = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[Search]
  
  inline def getPlugin_touchScroll(pluginName: touchScroll): TouchScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[TouchScroll]
  
  inline def getPlugin_trimRows(pluginName: trimRows): TrimRows = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[TrimRows]
  
  inline def getPlugin_undoRedo(pluginName: undoRedo): UndoRedo = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[UndoRedo]
  
  inline def getPluginsNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPluginsNames")().asInstanceOf[js.Array[String]]
  
  inline def hasPlugin(pluginName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerPlugin(pluginClass: TypeofBasePlugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(pluginClass.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerPlugin(pluginName: String, pluginClass: TypeofBasePlugin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(pluginName.asInstanceOf[js.Any], pluginClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
