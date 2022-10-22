package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.anon.TypeofBasePlugin
import typingsJapgolly.handsontable.coreMod.default
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
import typingsJapgolly.handsontable.pluginsContextMenuContextMenuMod.PredefinedMenuItemKey
import typingsJapgolly.handsontable.pluginsContextMenuContextMenuMod.SeparatorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMod {
  
  @JSImport("handsontable/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/plugins", "AutoColumnSize")
  @js.native
  open class AutoColumnSize protected ()
    extends typingsJapgolly.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "AutoRowSize")
  @js.native
  open class AutoRowSize protected ()
    extends typingsJapgolly.handsontable.pluginsAutoRowSizeMod.AutoRowSize {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Autofill")
  @js.native
  open class Autofill protected ()
    extends typingsJapgolly.handsontable.pluginsAutofillMod.Autofill {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "BasePlugin")
  @js.native
  open class BasePlugin protected ()
    extends typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "BindRowsWithHeaders")
  @js.native
  open class BindRowsWithHeaders protected ()
    extends typingsJapgolly.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "CollapsibleColumns")
  @js.native
  open class CollapsibleColumns protected ()
    extends typingsJapgolly.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ColumnSorting")
  @js.native
  open class ColumnSorting protected ()
    extends typingsJapgolly.handsontable.pluginsColumnSortingMod.ColumnSorting {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ColumnSummary")
  @js.native
  open class ColumnSummary protected ()
    extends typingsJapgolly.handsontable.pluginsColumnSummaryMod.ColumnSummary {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Comments")
  @js.native
  open class Comments protected ()
    extends typingsJapgolly.handsontable.pluginsCommentsMod.Comments {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ContextMenu")
  @js.native
  open class ContextMenu protected ()
    extends typingsJapgolly.handsontable.pluginsContextMenuMod.ContextMenu {
    def this(hotInstance: default) = this()
  }
  /* static members */
  object ContextMenu {
    
    @JSImport("handsontable/plugins", "ContextMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("handsontable/plugins", "ContextMenu.DEFAULT_ITEMS")
    @js.native
    def DEFAULT_ITEMS: js.Array[PredefinedMenuItemKey] = js.native
    inline def DEFAULT_ITEMS_=(x: js.Array[PredefinedMenuItemKey]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ITEMS")(x.asInstanceOf[js.Any])
    
    @JSImport("handsontable/plugins", "ContextMenu.SEPARATOR")
    @js.native
    def SEPARATOR: SeparatorObject = js.native
    inline def SEPARATOR_=(x: SeparatorObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("handsontable/plugins", "CopyPaste")
  @js.native
  open class CopyPaste protected ()
    extends typingsJapgolly.handsontable.pluginsCopyPasteMod.CopyPaste {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "CustomBorders")
  @js.native
  open class CustomBorders protected ()
    extends typingsJapgolly.handsontable.pluginsCustomBordersMod.CustomBorders {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "DragToScroll")
  @js.native
  open class DragToScroll protected ()
    extends typingsJapgolly.handsontable.pluginsDragToScrollMod.DragToScroll {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "DropdownMenu")
  @js.native
  open class DropdownMenu protected ()
    extends typingsJapgolly.handsontable.pluginsDropdownMenuMod.DropdownMenu {
    def this(hotInstance: default) = this()
  }
  /* static members */
  object DropdownMenu {
    
    @JSImport("handsontable/plugins", "DropdownMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("handsontable/plugins", "DropdownMenu.SEPARATOR")
    @js.native
    def SEPARATOR: typingsJapgolly.handsontable.pluginsDropdownMenuDropdownMenuMod.SeparatorObject = js.native
    inline def SEPARATOR_=(x: typingsJapgolly.handsontable.pluginsDropdownMenuDropdownMenuMod.SeparatorObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("handsontable/plugins", "ExportFile")
  @js.native
  open class ExportFile protected ()
    extends typingsJapgolly.handsontable.pluginsExportFileMod.ExportFile {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Filters")
  @js.native
  open class Filters protected ()
    extends typingsJapgolly.handsontable.pluginsFiltersMod.Filters {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Formulas")
  @js.native
  open class Formulas protected ()
    extends typingsJapgolly.handsontable.pluginsFormulasMod.Formulas {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "HiddenColumns")
  @js.native
  open class HiddenColumns protected ()
    extends typingsJapgolly.handsontable.pluginsHiddenColumnsMod.HiddenColumns {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "HiddenRows")
  @js.native
  open class HiddenRows protected ()
    extends typingsJapgolly.handsontable.pluginsHiddenRowsMod.HiddenRows {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualColumnFreeze")
  @js.native
  open class ManualColumnFreeze protected ()
    extends typingsJapgolly.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualColumnMove")
  @js.native
  open class ManualColumnMove protected ()
    extends typingsJapgolly.handsontable.pluginsManualColumnMoveMod.ManualColumnMove {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualColumnResize")
  @js.native
  open class ManualColumnResize protected ()
    extends typingsJapgolly.handsontable.pluginsManualColumnResizeMod.ManualColumnResize {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualRowMove")
  @js.native
  open class ManualRowMove protected ()
    extends typingsJapgolly.handsontable.pluginsManualRowMoveMod.ManualRowMove {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "ManualRowResize")
  @js.native
  open class ManualRowResize protected ()
    extends typingsJapgolly.handsontable.pluginsManualRowResizeMod.ManualRowResize {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "MergeCells")
  @js.native
  open class MergeCells protected ()
    extends typingsJapgolly.handsontable.pluginsMergeCellsMod.MergeCells {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "MultiColumnSorting")
  @js.native
  open class MultiColumnSorting protected ()
    extends typingsJapgolly.handsontable.pluginsMultiColumnSortingMod.MultiColumnSorting {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "MultipleSelectionHandles")
  @js.native
  open class MultipleSelectionHandles protected ()
    extends typingsJapgolly.handsontable.pluginsMultipleSelectionHandlesMod.MultipleSelectionHandles {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "NestedHeaders")
  @js.native
  open class NestedHeaders protected ()
    extends typingsJapgolly.handsontable.pluginsNestedHeadersMod.NestedHeaders {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "NestedRows")
  @js.native
  open class NestedRows protected ()
    extends typingsJapgolly.handsontable.pluginsNestedRowsMod.NestedRows {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "PersistentState")
  @js.native
  open class PersistentState protected ()
    extends typingsJapgolly.handsontable.pluginsPersistentStateMod.PersistentState {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "Search")
  @js.native
  open class Search protected ()
    extends typingsJapgolly.handsontable.pluginsSearchMod.Search {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "TouchScroll")
  @js.native
  open class TouchScroll protected ()
    extends typingsJapgolly.handsontable.pluginsTouchScrollMod.TouchScroll {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "TrimRows")
  @js.native
  open class TrimRows protected ()
    extends typingsJapgolly.handsontable.pluginsTrimRowsMod.TrimRows {
    def this(hotInstance: default) = this()
  }
  
  @JSImport("handsontable/plugins", "UndoRedo")
  @js.native
  open class UndoRedo protected ()
    extends typingsJapgolly.handsontable.pluginsUndoRedoMod.UndoRedo {
    def this(hotInstance: default) = this()
  }
  
  inline def getPlugin(pluginName: String): typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin]
  
  inline def getPlugin_autoColumnSize(pluginName: autoColumnSize): typingsJapgolly.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize]
  
  inline def getPlugin_autoRowSize(pluginName: autoRowSize): typingsJapgolly.handsontable.pluginsAutoRowSizeMod.AutoRowSize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsAutoRowSizeMod.AutoRowSize]
  
  inline def getPlugin_autofill(pluginName: autofill): typingsJapgolly.handsontable.pluginsAutofillMod.Autofill = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsAutofillMod.Autofill]
  
  inline def getPlugin_basePlugin(pluginName: basePlugin): typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin]
  
  inline def getPlugin_bindRowsWithHeaders(pluginName: bindRowsWithHeaders): typingsJapgolly.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders]
  
  inline def getPlugin_collapsibleColumns(pluginName: collapsibleColumns): typingsJapgolly.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns]
  
  inline def getPlugin_columnSorting(pluginName: columnSorting): typingsJapgolly.handsontable.pluginsColumnSortingMod.ColumnSorting = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsColumnSortingMod.ColumnSorting]
  
  inline def getPlugin_columnSummary(pluginName: columnSummary): typingsJapgolly.handsontable.pluginsColumnSummaryMod.ColumnSummary = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsColumnSummaryMod.ColumnSummary]
  
  inline def getPlugin_comments(pluginName: comments): typingsJapgolly.handsontable.pluginsCommentsMod.Comments = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsCommentsMod.Comments]
  
  inline def getPlugin_contextMenu(pluginName: contextMenu): typingsJapgolly.handsontable.pluginsContextMenuMod.ContextMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsContextMenuMod.ContextMenu]
  
  inline def getPlugin_copyPaste(pluginName: copyPaste): typingsJapgolly.handsontable.pluginsCopyPasteMod.CopyPaste = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsCopyPasteMod.CopyPaste]
  
  inline def getPlugin_customBorders(pluginName: customBorders): typingsJapgolly.handsontable.pluginsCustomBordersMod.CustomBorders = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsCustomBordersMod.CustomBorders]
  
  inline def getPlugin_dragToScroll(pluginName: dragToScroll): typingsJapgolly.handsontable.pluginsDragToScrollMod.DragToScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsDragToScrollMod.DragToScroll]
  
  inline def getPlugin_dropdownMenu(pluginName: dropdownMenu): typingsJapgolly.handsontable.pluginsDropdownMenuMod.DropdownMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsDropdownMenuMod.DropdownMenu]
  
  inline def getPlugin_exportFile(pluginName: exportFile): typingsJapgolly.handsontable.pluginsExportFileMod.ExportFile = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsExportFileMod.ExportFile]
  
  inline def getPlugin_filters(pluginName: filters): typingsJapgolly.handsontable.pluginsFiltersMod.Filters = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsFiltersMod.Filters]
  
  inline def getPlugin_formulas(pluginName: formulas): typingsJapgolly.handsontable.pluginsFormulasMod.Formulas = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsFormulasMod.Formulas]
  
  inline def getPlugin_hiddenColumns(pluginName: hiddenColumns): typingsJapgolly.handsontable.pluginsHiddenColumnsMod.HiddenColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsHiddenColumnsMod.HiddenColumns]
  
  inline def getPlugin_hiddenRows(pluginName: hiddenRows): typingsJapgolly.handsontable.pluginsHiddenRowsMod.HiddenRows = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsHiddenRowsMod.HiddenRows]
  
  inline def getPlugin_manualColumnFreeze(pluginName: manualColumnFreeze): typingsJapgolly.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze]
  
  inline def getPlugin_manualColumnMove(pluginName: manualColumnMove): typingsJapgolly.handsontable.pluginsManualColumnMoveMod.ManualColumnMove = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsManualColumnMoveMod.ManualColumnMove]
  
  inline def getPlugin_manualColumnResize(pluginName: manualColumnResize): typingsJapgolly.handsontable.pluginsManualColumnResizeMod.ManualColumnResize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsManualColumnResizeMod.ManualColumnResize]
  
  inline def getPlugin_manualRowMove(pluginName: manualRowMove): typingsJapgolly.handsontable.pluginsManualRowMoveMod.ManualRowMove = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsManualRowMoveMod.ManualRowMove]
  
  inline def getPlugin_manualRowResize(pluginName: manualRowResize): typingsJapgolly.handsontable.pluginsManualRowResizeMod.ManualRowResize = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsManualRowResizeMod.ManualRowResize]
  
  inline def getPlugin_mergeCells(pluginName: mergeCells): typingsJapgolly.handsontable.pluginsMergeCellsMod.MergeCells = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsMergeCellsMod.MergeCells]
  
  inline def getPlugin_multiColumnSorting(pluginName: multiColumnSorting): typingsJapgolly.handsontable.pluginsMultiColumnSortingMod.MultiColumnSorting = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsMultiColumnSortingMod.MultiColumnSorting]
  
  inline def getPlugin_multipleSelectionHandles(pluginName: multipleSelectionHandles): typingsJapgolly.handsontable.pluginsMultipleSelectionHandlesMod.MultipleSelectionHandles = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsMultipleSelectionHandlesMod.MultipleSelectionHandles]
  
  inline def getPlugin_nestedHeaders(pluginName: nestedHeaders): typingsJapgolly.handsontable.pluginsNestedHeadersMod.NestedHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsNestedHeadersMod.NestedHeaders]
  
  inline def getPlugin_nestedRows(pluginName: nestedRows): typingsJapgolly.handsontable.pluginsNestedRowsMod.NestedRows = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsNestedRowsMod.NestedRows]
  
  inline def getPlugin_persistentState(pluginName: persistentState): typingsJapgolly.handsontable.pluginsPersistentStateMod.PersistentState = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsPersistentStateMod.PersistentState]
  
  inline def getPlugin_search(pluginName: search): typingsJapgolly.handsontable.pluginsSearchMod.Search = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsSearchMod.Search]
  
  inline def getPlugin_touchScroll(pluginName: touchScroll): typingsJapgolly.handsontable.pluginsTouchScrollMod.TouchScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsTouchScrollMod.TouchScroll]
  
  inline def getPlugin_trimRows(pluginName: trimRows): typingsJapgolly.handsontable.pluginsTrimRowsMod.TrimRows = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsTrimRowsMod.TrimRows]
  
  inline def getPlugin_undoRedo(pluginName: undoRedo): typingsJapgolly.handsontable.pluginsUndoRedoMod.UndoRedo = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.handsontable.pluginsUndoRedoMod.UndoRedo]
  
  inline def getPluginsNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPluginsNames")().asInstanceOf[js.Array[String]]
  
  inline def registerAllPlugins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllPlugins")().asInstanceOf[Unit]
  
  inline def registerPlugin(pluginClass: TypeofBasePlugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(pluginClass.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerPlugin(pluginName: String, pluginClass: TypeofBasePlugin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(pluginName.asInstanceOf[js.Any], pluginClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Plugins extends StObject {
    
    var autoColumnSize: typingsJapgolly.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize
    
    var autoRowSize: typingsJapgolly.handsontable.pluginsAutoRowSizeMod.AutoRowSize
    
    var autofill: typingsJapgolly.handsontable.pluginsAutofillMod.Autofill
    
    var basePlugin: typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
    
    var bindRowsWithHeaders: typingsJapgolly.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders
    
    var collapsibleColumns: typingsJapgolly.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns
    
    var columnSorting: typingsJapgolly.handsontable.pluginsColumnSortingMod.ColumnSorting
    
    var columnSummary: typingsJapgolly.handsontable.pluginsColumnSummaryMod.ColumnSummary
    
    var comments: typingsJapgolly.handsontable.pluginsCommentsMod.Comments
    
    var contextMenu: typingsJapgolly.handsontable.pluginsContextMenuMod.ContextMenu
    
    var copyPaste: typingsJapgolly.handsontable.pluginsCopyPasteMod.CopyPaste
    
    var customBorders: typingsJapgolly.handsontable.pluginsCustomBordersMod.CustomBorders
    
    var dragToScroll: typingsJapgolly.handsontable.pluginsDragToScrollMod.DragToScroll
    
    var dropdownMenu: typingsJapgolly.handsontable.pluginsDropdownMenuMod.DropdownMenu
    
    var exportFile: typingsJapgolly.handsontable.pluginsExportFileMod.ExportFile
    
    var filters: typingsJapgolly.handsontable.pluginsFiltersMod.Filters
    
    var formulas: typingsJapgolly.handsontable.pluginsFormulasMod.Formulas
    
    var hiddenColumns: typingsJapgolly.handsontable.pluginsHiddenColumnsMod.HiddenColumns
    
    var hiddenRows: typingsJapgolly.handsontable.pluginsHiddenRowsMod.HiddenRows
    
    var manualColumnFreeze: typingsJapgolly.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze
    
    var manualColumnMove: typingsJapgolly.handsontable.pluginsManualColumnMoveMod.ManualColumnMove
    
    var manualColumnResize: typingsJapgolly.handsontable.pluginsManualColumnResizeMod.ManualColumnResize
    
    var manualRowMove: typingsJapgolly.handsontable.pluginsManualRowMoveMod.ManualRowMove
    
    var manualRowResize: typingsJapgolly.handsontable.pluginsManualRowResizeMod.ManualRowResize
    
    var mergeCells: typingsJapgolly.handsontable.pluginsMergeCellsMod.MergeCells
    
    var multiColumnSorting: typingsJapgolly.handsontable.pluginsMultiColumnSortingMod.MultiColumnSorting
    
    var multipleSelectionHandles: typingsJapgolly.handsontable.pluginsMultipleSelectionHandlesMod.MultipleSelectionHandles
    
    var nestedHeaders: typingsJapgolly.handsontable.pluginsNestedHeadersMod.NestedHeaders
    
    var nestedRows: typingsJapgolly.handsontable.pluginsNestedRowsMod.NestedRows
    
    var persistentState: typingsJapgolly.handsontable.pluginsPersistentStateMod.PersistentState
    
    var search: typingsJapgolly.handsontable.pluginsSearchMod.Search
    
    var touchScroll: typingsJapgolly.handsontable.pluginsTouchScrollMod.TouchScroll
    
    var trimRows: typingsJapgolly.handsontable.pluginsTrimRowsMod.TrimRows
    
    var undoRedo: typingsJapgolly.handsontable.pluginsUndoRedoMod.UndoRedo
  }
  object Plugins {
    
    inline def apply(
      autoColumnSize: typingsJapgolly.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize,
      autoRowSize: typingsJapgolly.handsontable.pluginsAutoRowSizeMod.AutoRowSize,
      autofill: typingsJapgolly.handsontable.pluginsAutofillMod.Autofill,
      basePlugin: typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin,
      bindRowsWithHeaders: typingsJapgolly.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders,
      collapsibleColumns: typingsJapgolly.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns,
      columnSorting: typingsJapgolly.handsontable.pluginsColumnSortingMod.ColumnSorting,
      columnSummary: typingsJapgolly.handsontable.pluginsColumnSummaryMod.ColumnSummary,
      comments: typingsJapgolly.handsontable.pluginsCommentsMod.Comments,
      contextMenu: typingsJapgolly.handsontable.pluginsContextMenuMod.ContextMenu,
      copyPaste: typingsJapgolly.handsontable.pluginsCopyPasteMod.CopyPaste,
      customBorders: typingsJapgolly.handsontable.pluginsCustomBordersMod.CustomBorders,
      dragToScroll: typingsJapgolly.handsontable.pluginsDragToScrollMod.DragToScroll,
      dropdownMenu: typingsJapgolly.handsontable.pluginsDropdownMenuMod.DropdownMenu,
      exportFile: typingsJapgolly.handsontable.pluginsExportFileMod.ExportFile,
      filters: typingsJapgolly.handsontable.pluginsFiltersMod.Filters,
      formulas: typingsJapgolly.handsontable.pluginsFormulasMod.Formulas,
      hiddenColumns: typingsJapgolly.handsontable.pluginsHiddenColumnsMod.HiddenColumns,
      hiddenRows: typingsJapgolly.handsontable.pluginsHiddenRowsMod.HiddenRows,
      manualColumnFreeze: typingsJapgolly.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze,
      manualColumnMove: typingsJapgolly.handsontable.pluginsManualColumnMoveMod.ManualColumnMove,
      manualColumnResize: typingsJapgolly.handsontable.pluginsManualColumnResizeMod.ManualColumnResize,
      manualRowMove: typingsJapgolly.handsontable.pluginsManualRowMoveMod.ManualRowMove,
      manualRowResize: typingsJapgolly.handsontable.pluginsManualRowResizeMod.ManualRowResize,
      mergeCells: typingsJapgolly.handsontable.pluginsMergeCellsMod.MergeCells,
      multiColumnSorting: typingsJapgolly.handsontable.pluginsMultiColumnSortingMod.MultiColumnSorting,
      multipleSelectionHandles: typingsJapgolly.handsontable.pluginsMultipleSelectionHandlesMod.MultipleSelectionHandles,
      nestedHeaders: typingsJapgolly.handsontable.pluginsNestedHeadersMod.NestedHeaders,
      nestedRows: typingsJapgolly.handsontable.pluginsNestedRowsMod.NestedRows,
      persistentState: typingsJapgolly.handsontable.pluginsPersistentStateMod.PersistentState,
      search: typingsJapgolly.handsontable.pluginsSearchMod.Search,
      touchScroll: typingsJapgolly.handsontable.pluginsTouchScrollMod.TouchScroll,
      trimRows: typingsJapgolly.handsontable.pluginsTrimRowsMod.TrimRows,
      undoRedo: typingsJapgolly.handsontable.pluginsUndoRedoMod.UndoRedo
    ): Plugins = {
      val __obj = js.Dynamic.literal(autoColumnSize = autoColumnSize.asInstanceOf[js.Any], autoRowSize = autoRowSize.asInstanceOf[js.Any], autofill = autofill.asInstanceOf[js.Any], basePlugin = basePlugin.asInstanceOf[js.Any], bindRowsWithHeaders = bindRowsWithHeaders.asInstanceOf[js.Any], collapsibleColumns = collapsibleColumns.asInstanceOf[js.Any], columnSorting = columnSorting.asInstanceOf[js.Any], columnSummary = columnSummary.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], copyPaste = copyPaste.asInstanceOf[js.Any], customBorders = customBorders.asInstanceOf[js.Any], dragToScroll = dragToScroll.asInstanceOf[js.Any], dropdownMenu = dropdownMenu.asInstanceOf[js.Any], exportFile = exportFile.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], formulas = formulas.asInstanceOf[js.Any], hiddenColumns = hiddenColumns.asInstanceOf[js.Any], hiddenRows = hiddenRows.asInstanceOf[js.Any], manualColumnFreeze = manualColumnFreeze.asInstanceOf[js.Any], manualColumnMove = manualColumnMove.asInstanceOf[js.Any], manualColumnResize = manualColumnResize.asInstanceOf[js.Any], manualRowMove = manualRowMove.asInstanceOf[js.Any], manualRowResize = manualRowResize.asInstanceOf[js.Any], mergeCells = mergeCells.asInstanceOf[js.Any], multiColumnSorting = multiColumnSorting.asInstanceOf[js.Any], multipleSelectionHandles = multipleSelectionHandles.asInstanceOf[js.Any], nestedHeaders = nestedHeaders.asInstanceOf[js.Any], nestedRows = nestedRows.asInstanceOf[js.Any], persistentState = persistentState.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], touchScroll = touchScroll.asInstanceOf[js.Any], trimRows = trimRows.asInstanceOf[js.Any], undoRedo = undoRedo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    extension [Self <: Plugins](x: Self) {
      
      inline def setAutoColumnSize(value: typingsJapgolly.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize): Self = StObject.set(x, "autoColumnSize", value.asInstanceOf[js.Any])
      
      inline def setAutoRowSize(value: typingsJapgolly.handsontable.pluginsAutoRowSizeMod.AutoRowSize): Self = StObject.set(x, "autoRowSize", value.asInstanceOf[js.Any])
      
      inline def setAutofill(value: typingsJapgolly.handsontable.pluginsAutofillMod.Autofill): Self = StObject.set(x, "autofill", value.asInstanceOf[js.Any])
      
      inline def setBasePlugin(value: typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin): Self = StObject.set(x, "basePlugin", value.asInstanceOf[js.Any])
      
      inline def setBindRowsWithHeaders(value: typingsJapgolly.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders): Self = StObject.set(x, "bindRowsWithHeaders", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleColumns(value: typingsJapgolly.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns): Self = StObject.set(x, "collapsibleColumns", value.asInstanceOf[js.Any])
      
      inline def setColumnSorting(value: typingsJapgolly.handsontable.pluginsColumnSortingMod.ColumnSorting): Self = StObject.set(x, "columnSorting", value.asInstanceOf[js.Any])
      
      inline def setColumnSummary(value: typingsJapgolly.handsontable.pluginsColumnSummaryMod.ColumnSummary): Self = StObject.set(x, "columnSummary", value.asInstanceOf[js.Any])
      
      inline def setComments(value: typingsJapgolly.handsontable.pluginsCommentsMod.Comments): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setContextMenu(value: typingsJapgolly.handsontable.pluginsContextMenuMod.ContextMenu): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setCopyPaste(value: typingsJapgolly.handsontable.pluginsCopyPasteMod.CopyPaste): Self = StObject.set(x, "copyPaste", value.asInstanceOf[js.Any])
      
      inline def setCustomBorders(value: typingsJapgolly.handsontable.pluginsCustomBordersMod.CustomBorders): Self = StObject.set(x, "customBorders", value.asInstanceOf[js.Any])
      
      inline def setDragToScroll(value: typingsJapgolly.handsontable.pluginsDragToScrollMod.DragToScroll): Self = StObject.set(x, "dragToScroll", value.asInstanceOf[js.Any])
      
      inline def setDropdownMenu(value: typingsJapgolly.handsontable.pluginsDropdownMenuMod.DropdownMenu): Self = StObject.set(x, "dropdownMenu", value.asInstanceOf[js.Any])
      
      inline def setExportFile(value: typingsJapgolly.handsontable.pluginsExportFileMod.ExportFile): Self = StObject.set(x, "exportFile", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: typingsJapgolly.handsontable.pluginsFiltersMod.Filters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFormulas(value: typingsJapgolly.handsontable.pluginsFormulasMod.Formulas): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
      
      inline def setHiddenColumns(value: typingsJapgolly.handsontable.pluginsHiddenColumnsMod.HiddenColumns): Self = StObject.set(x, "hiddenColumns", value.asInstanceOf[js.Any])
      
      inline def setHiddenRows(value: typingsJapgolly.handsontable.pluginsHiddenRowsMod.HiddenRows): Self = StObject.set(x, "hiddenRows", value.asInstanceOf[js.Any])
      
      inline def setManualColumnFreeze(value: typingsJapgolly.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze): Self = StObject.set(x, "manualColumnFreeze", value.asInstanceOf[js.Any])
      
      inline def setManualColumnMove(value: typingsJapgolly.handsontable.pluginsManualColumnMoveMod.ManualColumnMove): Self = StObject.set(x, "manualColumnMove", value.asInstanceOf[js.Any])
      
      inline def setManualColumnResize(value: typingsJapgolly.handsontable.pluginsManualColumnResizeMod.ManualColumnResize): Self = StObject.set(x, "manualColumnResize", value.asInstanceOf[js.Any])
      
      inline def setManualRowMove(value: typingsJapgolly.handsontable.pluginsManualRowMoveMod.ManualRowMove): Self = StObject.set(x, "manualRowMove", value.asInstanceOf[js.Any])
      
      inline def setManualRowResize(value: typingsJapgolly.handsontable.pluginsManualRowResizeMod.ManualRowResize): Self = StObject.set(x, "manualRowResize", value.asInstanceOf[js.Any])
      
      inline def setMergeCells(value: typingsJapgolly.handsontable.pluginsMergeCellsMod.MergeCells): Self = StObject.set(x, "mergeCells", value.asInstanceOf[js.Any])
      
      inline def setMultiColumnSorting(value: typingsJapgolly.handsontable.pluginsMultiColumnSortingMod.MultiColumnSorting): Self = StObject.set(x, "multiColumnSorting", value.asInstanceOf[js.Any])
      
      inline def setMultipleSelectionHandles(value: typingsJapgolly.handsontable.pluginsMultipleSelectionHandlesMod.MultipleSelectionHandles): Self = StObject.set(x, "multipleSelectionHandles", value.asInstanceOf[js.Any])
      
      inline def setNestedHeaders(value: typingsJapgolly.handsontable.pluginsNestedHeadersMod.NestedHeaders): Self = StObject.set(x, "nestedHeaders", value.asInstanceOf[js.Any])
      
      inline def setNestedRows(value: typingsJapgolly.handsontable.pluginsNestedRowsMod.NestedRows): Self = StObject.set(x, "nestedRows", value.asInstanceOf[js.Any])
      
      inline def setPersistentState(value: typingsJapgolly.handsontable.pluginsPersistentStateMod.PersistentState): Self = StObject.set(x, "persistentState", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: typingsJapgolly.handsontable.pluginsSearchMod.Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setTouchScroll(value: typingsJapgolly.handsontable.pluginsTouchScrollMod.TouchScroll): Self = StObject.set(x, "touchScroll", value.asInstanceOf[js.Any])
      
      inline def setTrimRows(value: typingsJapgolly.handsontable.pluginsTrimRowsMod.TrimRows): Self = StObject.set(x, "trimRows", value.asInstanceOf[js.Any])
      
      inline def setUndoRedo(value: typingsJapgolly.handsontable.pluginsUndoRedoMod.UndoRedo): Self = StObject.set(x, "undoRedo", value.asInstanceOf[js.Any])
    }
  }
}
