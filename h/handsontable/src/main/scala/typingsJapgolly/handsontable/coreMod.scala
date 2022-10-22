package typingsJapgolly.handsontable

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.HTMLTableElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Window
import typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCalculatorViewportColumnsMod`.ViewportColumnsCalculator
import typingsJapgolly.handsontable.anon.SkipRender
import typingsJapgolly.handsontable.anon.Value
import typingsJapgolly.handsontable.anon.ValueAny
import typingsJapgolly.handsontable.anon.ValueCellValue
import typingsJapgolly.handsontable.cellTypesMod.CellType
import typingsJapgolly.handsontable.commonMod.CellChange
import typingsJapgolly.handsontable.commonMod.CellValue
import typingsJapgolly.handsontable.commonMod.ChangeSource
import typingsJapgolly.handsontable.commonMod.ColumnDataGetterSetterFunction
import typingsJapgolly.handsontable.commonMod.RangeType
import typingsJapgolly.handsontable.commonMod.RowObject
import typingsJapgolly.handsontable.editorsBaseEditorMod.BaseEditor
import typingsJapgolly.handsontable.handsontableInts.`-1`
import typingsJapgolly.handsontable.handsontableInts.`0`
import typingsJapgolly.handsontable.handsontableInts.`1`
import typingsJapgolly.handsontable.handsontableStrings.afterAddChild
import typingsJapgolly.handsontable.handsontableStrings.afterAutofill
import typingsJapgolly.handsontable.handsontableStrings.afterBeginEditing
import typingsJapgolly.handsontable.handsontableStrings.afterCellMetaReset
import typingsJapgolly.handsontable.handsontableStrings.afterChange
import typingsJapgolly.handsontable.handsontableStrings.afterChangesObserved
import typingsJapgolly.handsontable.handsontableStrings.afterColumnCollapse
import typingsJapgolly.handsontable.handsontableStrings.afterColumnExpand
import typingsJapgolly.handsontable.handsontableStrings.afterColumnMove
import typingsJapgolly.handsontable.handsontableStrings.afterColumnResize
import typingsJapgolly.handsontable.handsontableStrings.afterColumnSort
import typingsJapgolly.handsontable.handsontableStrings.afterContextMenuDefaultOptions
import typingsJapgolly.handsontable.handsontableStrings.afterContextMenuHide
import typingsJapgolly.handsontable.handsontableStrings.afterContextMenuShow
import typingsJapgolly.handsontable.handsontableStrings.afterCopy
import typingsJapgolly.handsontable.handsontableStrings.afterCopyLimit
import typingsJapgolly.handsontable.handsontableStrings.afterCreateCol
import typingsJapgolly.handsontable.handsontableStrings.afterCreateRow
import typingsJapgolly.handsontable.handsontableStrings.afterCut
import typingsJapgolly.handsontable.handsontableStrings.afterDeselect
import typingsJapgolly.handsontable.handsontableStrings.afterDestroy
import typingsJapgolly.handsontable.handsontableStrings.afterDetachChild
import typingsJapgolly.handsontable.handsontableStrings.afterDocumentKeyDown
import typingsJapgolly.handsontable.handsontableStrings.afterDrawSelection
import typingsJapgolly.handsontable.handsontableStrings.afterDropdownMenuDefaultOptions
import typingsJapgolly.handsontable.handsontableStrings.afterDropdownMenuHide
import typingsJapgolly.handsontable.handsontableStrings.afterDropdownMenuShow
import typingsJapgolly.handsontable.handsontableStrings.afterFilter
import typingsJapgolly.handsontable.handsontableStrings.afterFormulasValuesUpdate
import typingsJapgolly.handsontable.handsontableStrings.afterGetCellMeta
import typingsJapgolly.handsontable.handsontableStrings.afterGetColHeader
import typingsJapgolly.handsontable.handsontableStrings.afterGetColumnHeaderRenderers
import typingsJapgolly.handsontable.handsontableStrings.afterGetRowHeader
import typingsJapgolly.handsontable.handsontableStrings.afterGetRowHeaderRenderers
import typingsJapgolly.handsontable.handsontableStrings.afterHideColumns
import typingsJapgolly.handsontable.handsontableStrings.afterHideRows
import typingsJapgolly.handsontable.handsontableStrings.afterInit
import typingsJapgolly.handsontable.handsontableStrings.afterLanguageChange
import typingsJapgolly.handsontable.handsontableStrings.afterListen
import typingsJapgolly.handsontable.handsontableStrings.afterLoadData
import typingsJapgolly.handsontable.handsontableStrings.afterMergeCells
import typingsJapgolly.handsontable.handsontableStrings.afterModifyTransformEnd
import typingsJapgolly.handsontable.handsontableStrings.afterModifyTransformStart
import typingsJapgolly.handsontable.handsontableStrings.afterMomentumScroll
import typingsJapgolly.handsontable.handsontableStrings.afterNamedExpressionAdded
import typingsJapgolly.handsontable.handsontableStrings.afterNamedExpressionRemoved
import typingsJapgolly.handsontable.handsontableStrings.afterOnCellContextMenu
import typingsJapgolly.handsontable.handsontableStrings.afterOnCellCornerDblClick
import typingsJapgolly.handsontable.handsontableStrings.afterOnCellCornerMouseDown
import typingsJapgolly.handsontable.handsontableStrings.afterOnCellMouseDown
import typingsJapgolly.handsontable.handsontableStrings.afterOnCellMouseOut
import typingsJapgolly.handsontable.handsontableStrings.afterOnCellMouseOver
import typingsJapgolly.handsontable.handsontableStrings.afterOnCellMouseUp
import typingsJapgolly.handsontable.handsontableStrings.afterPaste
import typingsJapgolly.handsontable.handsontableStrings.afterPluginsInitialized
import typingsJapgolly.handsontable.handsontableStrings.afterRedo
import typingsJapgolly.handsontable.handsontableStrings.afterRedoStackChange
import typingsJapgolly.handsontable.handsontableStrings.afterRefreshDimensions
import typingsJapgolly.handsontable.handsontableStrings.afterRemoveCellMeta
import typingsJapgolly.handsontable.handsontableStrings.afterRemoveCol
import typingsJapgolly.handsontable.handsontableStrings.afterRemoveRow
import typingsJapgolly.handsontable.handsontableStrings.afterRender
import typingsJapgolly.handsontable.handsontableStrings.afterRenderer
import typingsJapgolly.handsontable.handsontableStrings.afterRowMove
import typingsJapgolly.handsontable.handsontableStrings.afterRowResize
import typingsJapgolly.handsontable.handsontableStrings.afterScrollHorizontally
import typingsJapgolly.handsontable.handsontableStrings.afterScrollVertically
import typingsJapgolly.handsontable.handsontableStrings.afterSelection
import typingsJapgolly.handsontable.handsontableStrings.afterSelectionByProp
import typingsJapgolly.handsontable.handsontableStrings.afterSelectionEnd
import typingsJapgolly.handsontable.handsontableStrings.afterSelectionEndByProp
import typingsJapgolly.handsontable.handsontableStrings.afterSetCellMeta
import typingsJapgolly.handsontable.handsontableStrings.afterSetDataAtCell
import typingsJapgolly.handsontable.handsontableStrings.afterSetDataAtRowProp
import typingsJapgolly.handsontable.handsontableStrings.afterSetSourceDataAtCell
import typingsJapgolly.handsontable.handsontableStrings.afterSheetAdded
import typingsJapgolly.handsontable.handsontableStrings.afterSheetRemoved
import typingsJapgolly.handsontable.handsontableStrings.afterSheetRenamed
import typingsJapgolly.handsontable.handsontableStrings.afterTrimRow
import typingsJapgolly.handsontable.handsontableStrings.afterUndo
import typingsJapgolly.handsontable.handsontableStrings.afterUndoStackChange
import typingsJapgolly.handsontable.handsontableStrings.afterUnhideColumns
import typingsJapgolly.handsontable.handsontableStrings.afterUnhideRows
import typingsJapgolly.handsontable.handsontableStrings.afterUnlisten
import typingsJapgolly.handsontable.handsontableStrings.afterUnmergeCells
import typingsJapgolly.handsontable.handsontableStrings.afterUntrimRow
import typingsJapgolly.handsontable.handsontableStrings.afterUpdateData
import typingsJapgolly.handsontable.handsontableStrings.afterUpdateSettings
import typingsJapgolly.handsontable.handsontableStrings.afterValidate
import typingsJapgolly.handsontable.handsontableStrings.afterViewRender
import typingsJapgolly.handsontable.handsontableStrings.afterViewportColumnCalculatorOverride
import typingsJapgolly.handsontable.handsontableStrings.afterViewportRowCalculatorOverride
import typingsJapgolly.handsontable.handsontableStrings.area
import typingsJapgolly.handsontable.handsontableStrings.autoColumnSize
import typingsJapgolly.handsontable.handsontableStrings.autoRowSize
import typingsJapgolly.handsontable.handsontableStrings.autofill
import typingsJapgolly.handsontable.handsontableStrings.basePlugin
import typingsJapgolly.handsontable.handsontableStrings.beforeAddChild
import typingsJapgolly.handsontable.handsontableStrings.beforeAutofill
import typingsJapgolly.handsontable.handsontableStrings.beforeAutofillInsidePopulate
import typingsJapgolly.handsontable.handsontableStrings.beforeCellAlignment
import typingsJapgolly.handsontable.handsontableStrings.beforeChange
import typingsJapgolly.handsontable.handsontableStrings.beforeChangeRender
import typingsJapgolly.handsontable.handsontableStrings.beforeColumnCollapse
import typingsJapgolly.handsontable.handsontableStrings.beforeColumnExpand
import typingsJapgolly.handsontable.handsontableStrings.beforeColumnMove
import typingsJapgolly.handsontable.handsontableStrings.beforeColumnResize
import typingsJapgolly.handsontable.handsontableStrings.beforeColumnSort
import typingsJapgolly.handsontable.handsontableStrings.beforeContextMenuSetItems
import typingsJapgolly.handsontable.handsontableStrings.beforeContextMenuShow
import typingsJapgolly.handsontable.handsontableStrings.beforeCopy
import typingsJapgolly.handsontable.handsontableStrings.beforeCreateCol
import typingsJapgolly.handsontable.handsontableStrings.beforeCreateRow
import typingsJapgolly.handsontable.handsontableStrings.beforeCut
import typingsJapgolly.handsontable.handsontableStrings.beforeDetachChild
import typingsJapgolly.handsontable.handsontableStrings.beforeDrawBorders
import typingsJapgolly.handsontable.handsontableStrings.beforeDropdownMenuSetItems
import typingsJapgolly.handsontable.handsontableStrings.beforeDropdownMenuShow
import typingsJapgolly.handsontable.handsontableStrings.beforeFilter
import typingsJapgolly.handsontable.handsontableStrings.beforeGetCellMeta
import typingsJapgolly.handsontable.handsontableStrings.beforeHideColumns
import typingsJapgolly.handsontable.handsontableStrings.beforeHideRows
import typingsJapgolly.handsontable.handsontableStrings.beforeHighlightingColumnHeader
import typingsJapgolly.handsontable.handsontableStrings.beforeHighlightingRowHeader
import typingsJapgolly.handsontable.handsontableStrings.beforeInit
import typingsJapgolly.handsontable.handsontableStrings.beforeInitWalkontable
import typingsJapgolly.handsontable.handsontableStrings.beforeKeyDown
import typingsJapgolly.handsontable.handsontableStrings.beforeLanguageChange
import typingsJapgolly.handsontable.handsontableStrings.beforeLoadData
import typingsJapgolly.handsontable.handsontableStrings.beforeMergeCells
import typingsJapgolly.handsontable.handsontableStrings.beforeOnCellContextMenu
import typingsJapgolly.handsontable.handsontableStrings.beforeOnCellMouseDown
import typingsJapgolly.handsontable.handsontableStrings.beforeOnCellMouseOut
import typingsJapgolly.handsontable.handsontableStrings.beforeOnCellMouseOver
import typingsJapgolly.handsontable.handsontableStrings.beforeOnCellMouseUp
import typingsJapgolly.handsontable.handsontableStrings.beforePaste
import typingsJapgolly.handsontable.handsontableStrings.beforeRedo
import typingsJapgolly.handsontable.handsontableStrings.beforeRedoStackChange
import typingsJapgolly.handsontable.handsontableStrings.beforeRefreshDimensions
import typingsJapgolly.handsontable.handsontableStrings.beforeRemoveCellClassNames
import typingsJapgolly.handsontable.handsontableStrings.beforeRemoveCellMeta
import typingsJapgolly.handsontable.handsontableStrings.beforeRemoveCol
import typingsJapgolly.handsontable.handsontableStrings.beforeRemoveRow
import typingsJapgolly.handsontable.handsontableStrings.beforeRender
import typingsJapgolly.handsontable.handsontableStrings.beforeRenderer
import typingsJapgolly.handsontable.handsontableStrings.beforeRowMove
import typingsJapgolly.handsontable.handsontableStrings.beforeRowResize
import typingsJapgolly.handsontable.handsontableStrings.beforeSetCellMeta
import typingsJapgolly.handsontable.handsontableStrings.beforeSetRangeEnd
import typingsJapgolly.handsontable.handsontableStrings.beforeSetRangeStart
import typingsJapgolly.handsontable.handsontableStrings.beforeSetRangeStartOnly
import typingsJapgolly.handsontable.handsontableStrings.beforeStretchingColumnWidth
import typingsJapgolly.handsontable.handsontableStrings.beforeTouchScroll
import typingsJapgolly.handsontable.handsontableStrings.beforeTrimRow
import typingsJapgolly.handsontable.handsontableStrings.beforeUndo
import typingsJapgolly.handsontable.handsontableStrings.beforeUndoStackChange
import typingsJapgolly.handsontable.handsontableStrings.beforeUnhideColumns
import typingsJapgolly.handsontable.handsontableStrings.beforeUnhideRows
import typingsJapgolly.handsontable.handsontableStrings.beforeUnmergeCells
import typingsJapgolly.handsontable.handsontableStrings.beforeUntrimRow
import typingsJapgolly.handsontable.handsontableStrings.beforeUpdateData
import typingsJapgolly.handsontable.handsontableStrings.beforeValidate
import typingsJapgolly.handsontable.handsontableStrings.beforeValueRender
import typingsJapgolly.handsontable.handsontableStrings.beforeViewRender
import typingsJapgolly.handsontable.handsontableStrings.bindRowsWithHeaders
import typingsJapgolly.handsontable.handsontableStrings.collapsibleColumns
import typingsJapgolly.handsontable.handsontableStrings.columnSorting
import typingsJapgolly.handsontable.handsontableStrings.columnSummary
import typingsJapgolly.handsontable.handsontableStrings.comment
import typingsJapgolly.handsontable.handsontableStrings.comments
import typingsJapgolly.handsontable.handsontableStrings.construct
import typingsJapgolly.handsontable.handsontableStrings.contextMenu
import typingsJapgolly.handsontable.handsontableStrings.copyPaste
import typingsJapgolly.handsontable.handsontableStrings.current
import typingsJapgolly.handsontable.handsontableStrings.customBorders
import typingsJapgolly.handsontable.handsontableStrings.data
import typingsJapgolly.handsontable.handsontableStrings.down
import typingsJapgolly.handsontable.handsontableStrings.dragToScroll
import typingsJapgolly.handsontable.handsontableStrings.dropdownMenu
import typingsJapgolly.handsontable.handsontableStrings.exportFile
import typingsJapgolly.handsontable.handsontableStrings.filters
import typingsJapgolly.handsontable.handsontableStrings.formulas
import typingsJapgolly.handsontable.handsontableStrings.get
import typingsJapgolly.handsontable.handsontableStrings.hidden
import typingsJapgolly.handsontable.handsontableStrings.hiddenColumns
import typingsJapgolly.handsontable.handsontableStrings.hiddenRows
import typingsJapgolly.handsontable.handsontableStrings.highlight
import typingsJapgolly.handsontable.handsontableStrings.horizontal
import typingsJapgolly.handsontable.handsontableStrings.htBottom
import typingsJapgolly.handsontable.handsontableStrings.htCenter
import typingsJapgolly.handsontable.handsontableStrings.htJustify
import typingsJapgolly.handsontable.handsontableStrings.htLeft
import typingsJapgolly.handsontable.handsontableStrings.htMiddle
import typingsJapgolly.handsontable.handsontableStrings.htRight
import typingsJapgolly.handsontable.handsontableStrings.htTop
import typingsJapgolly.handsontable.handsontableStrings.init
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
import typingsJapgolly.handsontable.handsontableStrings.modifyAutoColumnSizeSeed
import typingsJapgolly.handsontable.handsontableStrings.modifyAutofillRange
import typingsJapgolly.handsontable.handsontableStrings.modifyColHeader
import typingsJapgolly.handsontable.handsontableStrings.modifyColWidth
import typingsJapgolly.handsontable.handsontableStrings.modifyColumnHeaderHeight
import typingsJapgolly.handsontable.handsontableStrings.modifyCopyableRange
import typingsJapgolly.handsontable.handsontableStrings.modifyData
import typingsJapgolly.handsontable.handsontableStrings.modifyGetCellCoords
import typingsJapgolly.handsontable.handsontableStrings.modifyRowData
import typingsJapgolly.handsontable.handsontableStrings.modifyRowHeader
import typingsJapgolly.handsontable.handsontableStrings.modifyRowHeaderWidth
import typingsJapgolly.handsontable.handsontableStrings.modifyRowHeight
import typingsJapgolly.handsontable.handsontableStrings.modifySourceData
import typingsJapgolly.handsontable.handsontableStrings.modifyTransformEnd
import typingsJapgolly.handsontable.handsontableStrings.modifyTransformStart
import typingsJapgolly.handsontable.handsontableStrings.multiColumnSorting
import typingsJapgolly.handsontable.handsontableStrings.multipleSelectionHandles
import typingsJapgolly.handsontable.handsontableStrings.nestedHeaders
import typingsJapgolly.handsontable.handsontableStrings.nestedRows
import typingsJapgolly.handsontable.handsontableStrings.overwrite
import typingsJapgolly.handsontable.handsontableStrings.persistentState
import typingsJapgolly.handsontable.handsontableStrings.persistentStateLoad
import typingsJapgolly.handsontable.handsontableStrings.persistentStateReset
import typingsJapgolly.handsontable.handsontableStrings.persistentStateSave
import typingsJapgolly.handsontable.handsontableStrings.remove_col
import typingsJapgolly.handsontable.handsontableStrings.remove_row
import typingsJapgolly.handsontable.handsontableStrings.right
import typingsJapgolly.handsontable.handsontableStrings.search
import typingsJapgolly.handsontable.handsontableStrings.set
import typingsJapgolly.handsontable.handsontableStrings.shift_down
import typingsJapgolly.handsontable.handsontableStrings.shift_right
import typingsJapgolly.handsontable.handsontableStrings.skipRowOnPaste
import typingsJapgolly.handsontable.handsontableStrings.touchScroll
import typingsJapgolly.handsontable.handsontableStrings.trimRows
import typingsJapgolly.handsontable.handsontableStrings.undoRedo
import typingsJapgolly.handsontable.handsontableStrings.up
import typingsJapgolly.handsontable.handsontableStrings.valid
import typingsJapgolly.handsontable.handsontableStrings.vertical
import typingsJapgolly.handsontable.pluginHooksMod.HookHighlightColumnHeaderMeta
import typingsJapgolly.handsontable.pluginHooksMod.HookHighlightRowHeaderMeta
import typingsJapgolly.handsontable.pluginsAutoColumnSizeMod.AutoColumnSize
import typingsJapgolly.handsontable.pluginsAutoRowSizeMod.AutoRowSize
import typingsJapgolly.handsontable.pluginsAutofillMod.Autofill
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import typingsJapgolly.handsontable.pluginsBindRowsWithHeadersMod.BindRowsWithHeaders
import typingsJapgolly.handsontable.pluginsCollapsibleColumnsMod.CollapsibleColumns
import typingsJapgolly.handsontable.pluginsColumnSortingColumnSortingMod.Config
import typingsJapgolly.handsontable.pluginsColumnSortingMod.ColumnSorting
import typingsJapgolly.handsontable.pluginsColumnSummaryMod.ColumnSummary
import typingsJapgolly.handsontable.pluginsCommentsCommentsMod.CommentObject
import typingsJapgolly.handsontable.pluginsCommentsMod.Comments
import typingsJapgolly.handsontable.pluginsContextMenuContextMenuMod.MenuItemConfig
import typingsJapgolly.handsontable.pluginsContextMenuContextMenuMod.PredefinedMenuItemKey
import typingsJapgolly.handsontable.pluginsContextMenuMod.ContextMenu
import typingsJapgolly.handsontable.pluginsCopyPasteMod.CopyPaste
import typingsJapgolly.handsontable.pluginsCustomBordersMod.CustomBorders
import typingsJapgolly.handsontable.pluginsDragToScrollMod.DragToScroll
import typingsJapgolly.handsontable.pluginsDropdownMenuMod.DropdownMenu
import typingsJapgolly.handsontable.pluginsExportFileMod.ExportFile
import typingsJapgolly.handsontable.pluginsFiltersFiltersMod.ColumnConditions
import typingsJapgolly.handsontable.pluginsFiltersMod.Filters
import typingsJapgolly.handsontable.pluginsFormulasMod.Formulas
import typingsJapgolly.handsontable.pluginsHiddenColumnsMod.HiddenColumns
import typingsJapgolly.handsontable.pluginsHiddenRowsMod.HiddenRows
import typingsJapgolly.handsontable.pluginsManualColumnFreezeMod.ManualColumnFreeze
import typingsJapgolly.handsontable.pluginsManualColumnMoveMod.ManualColumnMove
import typingsJapgolly.handsontable.pluginsManualColumnResizeMod.ManualColumnResize
import typingsJapgolly.handsontable.pluginsManualRowMoveMod.ManualRowMove
import typingsJapgolly.handsontable.pluginsManualRowResizeMod.ManualRowResize
import typingsJapgolly.handsontable.pluginsMergeCellsMergeCellsMod.Settings
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
import typingsJapgolly.handsontable.pluginsUndoRedoUndoRedoMod.Action
import typingsJapgolly.handsontable.renderersBaseMod.BaseRenderer
import typingsJapgolly.handsontable.selectionMod.SelectionController
import typingsJapgolly.handsontable.settingsMod.CellMeta
import typingsJapgolly.handsontable.settingsMod.CellProperties
import typingsJapgolly.handsontable.settingsMod.GridSettings
import typingsJapgolly.handsontable.shortcutsManagerMod.ShortcutManager
import typingsJapgolly.handsontable.translationsMod.IndexMapper
import typingsJapgolly.handsontable.validatorsBaseMod.BaseValidator_
import typingsJapgolly.std.HTMLTableHeaderCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("handsontable/core", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Core {
    def this(element: Element, options: GridSettings) = this()
  }
  
  @js.native
  trait Core extends StObject {
    
    def addHook(
      key: afterAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* fillData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* targetRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* direction */ up | down | left | right, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: afterAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* fillData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* targetRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* direction */ up | down | left | right, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: afterModifyTransformEnd,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: afterModifyTransformEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: afterModifyTransformStart,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: afterModifyTransformStart,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeAutofillInsidePopulate,
      callback: js.UndefOr[
          js.Function4[
            /* index */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* direction */ up | down | left | right, 
            /* input */ js.Array[js.Array[CellValue]], 
            /* deltas */ js.Array[Any], 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeAutofillInsidePopulate,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* direction */ up | down | left | right, 
              /* input */ js.Array[js.Array[CellValue]], 
              /* deltas */ js.Array[Any], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* selectionData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* targetRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* direction */ up | down | left | right, 
            js.Array[js.Array[CellValue]] | Boolean | Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* selectionData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* targetRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* direction */ up | down | left | right, 
              js.Array[js.Array[CellValue]] | Boolean | Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeCellAlignment,
      callback: js.UndefOr[
          js.Function4[
            /* stateBefore */ NumberDictionary[js.Array[String]], 
            /* range */ js.Array[typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default], 
            /* type */ horizontal | vertical, 
            /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeCellAlignment,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* stateBefore */ NumberDictionary[js.Array[String]], 
              /* range */ js.Array[typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default], 
              /* type */ horizontal | vertical, 
              /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeDrawBorders,
      callback: js.UndefOr[
          js.Function2[
            /* corners */ js.Array[Double], 
            /* borderClassName */ js.UndefOr[current | area | highlight], 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeDrawBorders,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* corners */ js.Array[Double], 
              /* borderClassName */ js.UndefOr[current | area | highlight], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: modifyData,
      callback: js.UndefOr[
          js.Function4[
            /* row */ Double, 
            /* column */ Double, 
            /* valueHolder */ ValueCellValue, 
            /* ioMode */ get | set, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: modifyData,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* row */ Double, 
              /* column */ Double, 
              /* valueHolder */ ValueCellValue, 
              /* ioMode */ get | set, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: modifySourceData,
      callback: js.UndefOr[
          js.Function4[
            /* row */ Double, 
            /* column */ Double, 
            /* valueHolder */ ValueCellValue, 
            /* ioMode */ get | set, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: modifySourceData,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* row */ Double, 
              /* column */ Double, 
              /* valueHolder */ ValueCellValue, 
              /* ioMode */ get | set, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    
    def addHookOnce(
      key: afterAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* fillData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* targetRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* direction */ up | down | left | right, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: afterAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* fillData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* targetRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* direction */ up | down | left | right, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: afterModifyTransformEnd,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: afterModifyTransformEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: afterModifyTransformStart,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: afterModifyTransformStart,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: beforeAutofillInsidePopulate,
      callback: js.UndefOr[
          js.Function4[
            /* index */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* direction */ up | down | left | right, 
            /* input */ js.Array[js.Array[CellValue]], 
            /* deltas */ js.Array[Any], 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: beforeAutofillInsidePopulate,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* direction */ up | down | left | right, 
              /* input */ js.Array[js.Array[CellValue]], 
              /* deltas */ js.Array[Any], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: beforeAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* selectionData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* targetRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* direction */ up | down | left | right, 
            js.Array[js.Array[CellValue]] | Boolean | Unit
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: beforeAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* selectionData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* targetRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* direction */ up | down | left | right, 
              js.Array[js.Array[CellValue]] | Boolean | Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: beforeCellAlignment,
      callback: js.UndefOr[
          js.Function4[
            /* stateBefore */ NumberDictionary[js.Array[String]], 
            /* range */ js.Array[typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default], 
            /* type */ horizontal | vertical, 
            /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: beforeCellAlignment,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* stateBefore */ NumberDictionary[js.Array[String]], 
              /* range */ js.Array[typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default], 
              /* type */ horizontal | vertical, 
              /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: beforeDrawBorders,
      callback: js.UndefOr[
          js.Function2[
            /* corners */ js.Array[Double], 
            /* borderClassName */ js.UndefOr[current | area | highlight], 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: beforeDrawBorders,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* corners */ js.Array[Double], 
              /* borderClassName */ js.UndefOr[current | area | highlight], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: modifyData,
      callback: js.UndefOr[
          js.Function4[
            /* row */ Double, 
            /* column */ Double, 
            /* valueHolder */ ValueCellValue, 
            /* ioMode */ get | set, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: modifyData,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* row */ Double, 
              /* column */ Double, 
              /* valueHolder */ ValueCellValue, 
              /* ioMode */ get | set, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: modifySourceData,
      callback: js.UndefOr[
          js.Function4[
            /* row */ Double, 
            /* column */ Double, 
            /* valueHolder */ ValueCellValue, 
            /* ioMode */ get | set, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHookOnce(
      key: modifySourceData,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* row */ Double, 
              /* column */ Double, 
              /* valueHolder */ ValueCellValue, 
              /* ioMode */ get | set, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterAddChild(
      key: afterAddChild,
      callback: js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ js.UndefOr[RowObject], 
            /* index */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterAddChild(
      key: afterAddChild,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* parent */ RowObject, 
              /* element */ js.UndefOr[RowObject], 
              /* index */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterCellMetaReset(key: afterCellMetaReset, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterCellMetaReset(key: afterCellMetaReset, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterChange(
      key: afterChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterChange(
      key: afterChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterChangesObserved(key: afterChangesObserved, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterChangesObserved(key: afterChangesObserved, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterColumnCollapse(
      key: afterColumnCollapse,
      callback: js.UndefOr[
          js.Function4[
            /* currentCollapsedColumns */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* collapsePossible */ Boolean, 
            /* successfullyCollapsed */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterColumnCollapse(
      key: afterColumnCollapse,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentCollapsedColumns */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* collapsePossible */ Boolean, 
              /* successfullyCollapsed */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterColumnExpand(
      key: afterColumnExpand,
      callback: js.UndefOr[
          js.Function4[
            /* currentCollapsedColumns */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* expandPossible */ Boolean, 
            /* successfullyExpanded */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterColumnExpand(
      key: afterColumnExpand,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentCollapsedColumns */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* expandPossible */ Boolean, 
              /* successfullyExpanded */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterColumnMove(
      key: afterColumnMove,
      callback: js.UndefOr[
          js.Function5[
            /* movedColumns */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            /* orderChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterColumnMove(
      key: afterColumnMove,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* movedColumns */ js.Array[Double], 
              /* finalIndex */ Double, 
              /* dropIndex */ js.UndefOr[Double], 
              /* movePossible */ Boolean, 
              /* orderChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterColumnResize(
      key: afterColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterColumnResize(
      key: afterColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterColumnSort(
      key: afterColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterColumnSort(
      key: afterColumnSort,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterContextMenuHide(key: afterContextMenuHide, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterContextMenuHide(
      key: afterContextMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterContextMenuShow(key: afterContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterContextMenuShow(
      key: afterContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterCopy(
      key: afterCopy,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterCopy(
      key: afterCopy,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterCopyLimit(
      key: afterCopyLimit,
      callback: js.UndefOr[
          js.Function4[
            /* selectedRows */ Double, 
            /* selectedColumns */ Double, 
            /* copyRowsLimit */ Double, 
            /* copyColumnsLimit */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterCopyLimit(
      key: afterCopyLimit,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* selectedRows */ Double, 
              /* selectedColumns */ Double, 
              /* copyRowsLimit */ Double, 
              /* copyColumnsLimit */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterCreateCol(
      key: afterCreateCol,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterCreateCol(
      key: afterCreateCol,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterCreateRow(
      key: afterCreateRow,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterCreateRow(
      key: afterCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterCut(
      key: afterCut,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterCut(
      key: afterCut,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDeselect(key: afterDeselect, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDeselect(key: afterDeselect, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDestroy(key: afterDestroy, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDestroy(key: afterDestroy, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDetachChild(
      key: afterDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDetachChild(
      key: afterDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDocumentKeyDown(key: afterDocumentKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDocumentKeyDown(
      key: afterDocumentKeyDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDrawSelection(
      key: afterDrawSelection,
      callback: js.UndefOr[
          js.Function4[
            /* currentRow */ Double, 
            /* currentColumn */ Double, 
            /* cornersOfSelection */ js.Array[Double], 
            /* layerLevel */ js.UndefOr[Double], 
            String | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDrawSelection(
      key: afterDrawSelection,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentRow */ Double, 
              /* currentColumn */ Double, 
              /* cornersOfSelection */ js.Array[Double], 
              /* layerLevel */ js.UndefOr[Double], 
              String | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDropdownMenuHide(key: afterDropdownMenuHide, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDropdownMenuHide(
      key: afterDropdownMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDropdownMenuShow(key: afterDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterDropdownMenuShow(
      key: afterDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterFilter(
      key: afterFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterFilter(
      key: afterFilter,
      callback: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.Array[js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.Array[
          js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.Array[
          js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterHideColumns(
      key: afterHideColumns,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterHideColumns(
      key: afterHideColumns,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterHideRows(
      key: afterHideRows,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterHideRows(
      key: afterHideRows,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterInit(key: afterInit, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterInit(key: afterInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterLanguageChange(key: afterLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterLanguageChange(
      key: afterLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterListen(key: afterListen, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterListen(key: afterListen, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterLoadData(
      key: afterLoadData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterLoadData(
      key: afterLoadData,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterMergeCells(
      key: afterMergeCells,
      callback: js.UndefOr[
          js.Function3[
            /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* mergeParent */ Settings, 
            /* auto */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterMergeCells(
      key: afterMergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* mergeParent */ Settings, 
              /* auto */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterMomentumScroll(key: afterMomentumScroll, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterMomentumScroll(key: afterMomentumScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellCornerDblClick(key: afterOnCellCornerDblClick, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellCornerDblClick(
      key: afterOnCellCornerDblClick,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellCornerMouseDown(key: afterOnCellCornerMouseDown, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellCornerMouseDown(
      key: afterOnCellCornerMouseDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterPaste(
      key: afterPaste,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterPaste(
      key: afterPaste,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRedo(key: afterRedo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRedo(key: afterRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRedoStackChange(
      key: afterRedoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* undoneActionsBefore */ js.Array[Action], 
            /* undoneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRedoStackChange(
      key: afterRedoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* undoneActionsBefore */ js.Array[Action], 
              /* undoneActionsAfter */ js.Array[Action], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRefreshDimensions(
      key: afterRefreshDimensions,
      callback: js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRefreshDimensions(
      key: afterRefreshDimensions,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* previousDimensions */ js.Object, 
              /* currentDimensions */ js.Object, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRemoveCol(
      key: afterRemoveCol,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRemoveCol(
      key: afterRemoveCol,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalColumns */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRemoveRow(
      key: afterRemoveRow,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalRows */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRemoveRow(
      key: afterRemoveRow,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalRows */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRender(key: afterRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRender(key: afterRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRenderer(
      key: afterRenderer,
      callback: js.UndefOr[
          js.Function6[
            /* TD */ HTMLTableCellElement, 
            /* row */ Double, 
            /* column */ Double, 
            /* prop */ String | Double, 
            /* value */ String, 
            /* cellProperties */ CellProperties, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRenderer(
      key: afterRenderer,
      callback: js.Array[
          js.UndefOr[
            js.Function6[
              /* TD */ HTMLTableCellElement, 
              /* row */ Double, 
              /* column */ Double, 
              /* prop */ String | Double, 
              /* value */ String, 
              /* cellProperties */ CellProperties, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRowMove(
      key: afterRowMove,
      callback: js.UndefOr[
          js.Function5[
            /* movedRows */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            /* orderChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRowMove(
      key: afterRowMove,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* movedRows */ js.Array[Double], 
              /* finalIndex */ Double, 
              /* dropIndex */ js.UndefOr[Double], 
              /* movePossible */ Boolean, 
              /* orderChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRowResize(
      key: afterRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterRowResize(
      key: afterRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterScrollVertically(key: afterScrollVertically, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterScrollVertically(key: afterScrollVertically, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSelection(
      key: afterSelection,
      callback: js.UndefOr[
          js.Function6[
            /* row */ Double, 
            /* column */ Double, 
            /* row2 */ Double, 
            /* column2 */ Double, 
            /* preventScrolling */ Value, 
            /* selectionLayerLevel */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSelection(
      key: afterSelection,
      callback: js.Array[
          js.UndefOr[
            js.Function6[
              /* row */ Double, 
              /* column */ Double, 
              /* row2 */ Double, 
              /* column2 */ Double, 
              /* preventScrolling */ Value, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSelectionByProp(
      key: afterSelectionByProp,
      callback: js.UndefOr[
          js.Function6[
            /* row */ Double, 
            /* prop */ String, 
            /* row2 */ Double, 
            /* prop2 */ String, 
            /* preventScrolling */ Value, 
            /* selectionLayerLevel */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSelectionByProp(
      key: afterSelectionByProp,
      callback: js.Array[
          js.UndefOr[
            js.Function6[
              /* row */ Double, 
              /* prop */ String, 
              /* row2 */ Double, 
              /* prop2 */ String, 
              /* preventScrolling */ Value, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSelectionEnd(
      key: afterSelectionEnd,
      callback: js.UndefOr[
          js.Function5[
            /* row */ Double, 
            /* column */ Double, 
            /* row2 */ Double, 
            /* column2 */ Double, 
            /* selectionLayerLevel */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSelectionEnd(
      key: afterSelectionEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* row */ Double, 
              /* column */ Double, 
              /* row2 */ Double, 
              /* column2 */ Double, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSelectionEndByProp(
      key: afterSelectionEndByProp,
      callback: js.UndefOr[
          js.Function5[
            /* row */ Double, 
            /* prop */ String, 
            /* row2 */ Double, 
            /* prop2 */ String, 
            /* selectionLayerLevel */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSelectionEndByProp(
      key: afterSelectionEndByProp,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* row */ Double, 
              /* prop */ String, 
              /* row2 */ Double, 
              /* prop2 */ String, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSheetAdded(key: afterSheetAdded, callback: js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSheetAdded(
      key: afterSheetAdded,
      callback: js.Array[js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.UndefOr[
          js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.Array[
          js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterTrimRow(
      key: afterTrimRow,
      callback: js.UndefOr[
          js.Function4[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterTrimRow(
      key: afterTrimRow,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUndo(key: afterUndo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUndo(key: afterUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUndoStackChange(
      key: afterUndoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* doneActionsBefore */ js.Array[Action], 
            /* doneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUndoStackChange(
      key: afterUndoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* doneActionsBefore */ js.Array[Action], 
              /* doneActionsAfter */ js.Array[Action], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUnhideColumns(
      key: afterUnhideColumns,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUnhideColumns(
      key: afterUnhideColumns,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUnhideRows(
      key: afterUnhideRows,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUnhideRows(
      key: afterUnhideRows,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUnlisten(key: afterUnlisten, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUnlisten(key: afterUnlisten, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.UndefOr[
          js.Function2[
            /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* auto */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* auto */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUntrimRow(
      key: afterUntrimRow,
      callback: js.UndefOr[
          js.Function4[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUntrimRow(
      key: afterUntrimRow,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUpdateData(
      key: afterUpdateData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUpdateData(
      key: afterUpdateData,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUpdateSettings(key: afterUpdateSettings, callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterUpdateSettings(
      key: afterUpdateSettings,
      callback: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterValidate(
      key: afterValidate,
      callback: js.UndefOr[
          js.Function5[
            /* isValid */ Boolean, 
            /* value */ CellValue, 
            /* row */ Double, 
            /* prop */ String | Double, 
            /* source */ ChangeSource, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterValidate(
      key: afterValidate,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* isValid */ Boolean, 
              /* value */ CellValue, 
              /* row */ Double, 
              /* prop */ String | Double, 
              /* source */ ChangeSource, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterViewRender(key: afterViewRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterViewRender(key: afterViewRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeAddChild(
      key: beforeAddChild,
      callback: js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ js.UndefOr[RowObject], 
            /* index */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeAddChild(
      key: beforeAddChild,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* parent */ RowObject, 
              /* element */ js.UndefOr[RowObject], 
              /* index */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeChange(
      key: beforeChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeChange(
      key: beforeChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeColumnCollapse(
      key: beforeColumnCollapse,
      callback: js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* collapsePossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeColumnCollapse(
      key: beforeColumnCollapse,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentCollapsedColumn */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* collapsePossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeColumnExpand(
      key: beforeColumnExpand,
      callback: js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* expandPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeColumnExpand(
      key: beforeColumnExpand,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentCollapsedColumn */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* expandPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeColumnMove(
      key: beforeColumnMove,
      callback: js.UndefOr[
          js.Function4[
            /* movedColumns */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeColumnMove(
      key: beforeColumnMove,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* movedColumns */ js.Array[Double], 
              /* finalIndex */ Double, 
              /* dropIndex */ js.UndefOr[Double], 
              /* movePossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeColumnSort(
      key: beforeColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeColumnSort(
      key: beforeColumnSort,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeContextMenuShow(key: beforeContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeContextMenuShow(
      key: beforeContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeCopy(
      key: beforeCopy,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeCopy(
      key: beforeCopy,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeCreateCol(
      key: beforeCreateCol,
      callback: js.UndefOr[
          js.Function3[
            /* index */ Double, 
            /* amount */ Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeCreateCol(
      key: beforeCreateCol,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* index */ Double, 
              /* amount */ Double, 
              /* source */ js.UndefOr[ChangeSource], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeCut(
      key: beforeCut,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeCut(
      key: beforeCut,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeDropdownMenuShow(key: beforeDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeDropdownMenuShow(
      key: beforeDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeFilter(
      key: beforeFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeFilter(
      key: beforeFilter,
      callback: js.Array[
          js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeHideColumns(
      key: beforeHideColumns,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeHideColumns(
      key: beforeHideColumns,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeHideRows(
      key: beforeHideRows,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeHideRows(
      key: beforeHideRows,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeHighlightingColumnHeader(
      key: beforeHighlightingColumnHeader,
      callback: js.UndefOr[
          js.Function3[
            /* column */ Double, 
            /* headerLevel */ Double, 
            /* highlightMeta */ HookHighlightColumnHeaderMeta, 
            Double | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeHighlightingColumnHeader(
      key: beforeHighlightingColumnHeader,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* column */ Double, 
              /* headerLevel */ Double, 
              /* highlightMeta */ HookHighlightColumnHeaderMeta, 
              Double | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeHighlightingRowHeader(
      key: beforeHighlightingRowHeader,
      callback: js.UndefOr[
          js.Function3[
            /* row */ Double, 
            /* headerLevel */ Double, 
            /* highlightMeta */ HookHighlightRowHeaderMeta, 
            Double | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeHighlightingRowHeader(
      key: beforeHighlightingRowHeader,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* row */ Double, 
              /* headerLevel */ Double, 
              /* highlightMeta */ HookHighlightRowHeaderMeta, 
              Double | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeInit(key: beforeInit, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeInit(key: beforeInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeKeyDown(key: beforeKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeKeyDown(key: beforeKeyDown, callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeLanguageChange(key: beforeLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeLanguageChange(
      key: beforeLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeLoadData(
      key: beforeLoadData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeLoadData(
      key: beforeLoadData,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.UndefOr[
          js.Function2[
            /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* auto */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* auto */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforePaste(
      key: beforePaste,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforePaste(
      key: beforePaste,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRedo(key: beforeRedo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRedo(key: beforeRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.Array[js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRefreshDimensions(
      key: beforeRefreshDimensions,
      callback: js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* actionPossible */ Boolean, 
            Boolean | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRefreshDimensions(
      key: beforeRefreshDimensions,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* previousDimensions */ js.Object, 
              /* currentDimensions */ js.Object, 
              /* actionPossible */ Boolean, 
              Boolean | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRemoveCellClassNames(key: beforeRemoveCellClassNames, callback: js.UndefOr[js.Function0[js.Array[String] | Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRemoveCellClassNames(
      key: beforeRemoveCellClassNames,
      callback: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRemoveCol(
      key: beforeRemoveCol,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRemoveCol(
      key: beforeRemoveCol,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalColumns */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRemoveRow(
      key: beforeRemoveRow,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRemoveRow(
      key: beforeRemoveRow,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalColumns */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRender(key: beforeRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRender(key: beforeRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRenderer(
      key: beforeRenderer,
      callback: js.UndefOr[
          js.Function6[
            /* TD */ HTMLTableCellElement, 
            /* row */ Double, 
            /* column */ Double, 
            /* prop */ String | Double, 
            /* value */ CellValue, 
            /* cellProperties */ CellProperties, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRenderer(
      key: beforeRenderer,
      callback: js.Array[
          js.UndefOr[
            js.Function6[
              /* TD */ HTMLTableCellElement, 
              /* row */ Double, 
              /* column */ Double, 
              /* prop */ String | Double, 
              /* value */ CellValue, 
              /* cellProperties */ CellProperties, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRowMove(
      key: beforeRowMove,
      callback: js.UndefOr[
          js.Function4[
            /* movedRows */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRowMove(
      key: beforeRowMove,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* movedRows */ js.Array[Double], 
              /* finalIndex */ Double, 
              /* dropIndex */ js.UndefOr[Double], 
              /* movePossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRowResize(
      key: beforeRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeRowResize(
      key: beforeRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.UndefOr[
          js.Function1[
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.UndefOr[
          js.Function1[
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.UndefOr[
          js.Function1[
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.Array[
          js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeTouchScroll(key: beforeTouchScroll, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeTouchScroll(key: beforeTouchScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeTrimRow(
      key: beforeTrimRow,
      callback: js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeTrimRow(
      key: beforeTrimRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUndo(key: beforeUndo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUndo(key: beforeUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.UndefOr[
          js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUnhideColumns(
      key: beforeUnhideColumns,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUnhideColumns(
      key: beforeUnhideColumns,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUnhideRows(
      key: beforeUnhideRows,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUnhideRows(
      key: beforeUnhideRows,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.UndefOr[
          js.Function2[
            /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* auto */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* auto */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUntrimRow(
      key: beforeUntrimRow,
      callback: js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUntrimRow(
      key: beforeUntrimRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUpdateData(
      key: beforeUpdateData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeUpdateData(
      key: beforeUpdateData,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeValidate(
      key: beforeValidate,
      callback: js.UndefOr[
          js.Function4[
            /* value */ CellValue, 
            /* row */ Double, 
            /* prop */ String | Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeValidate(
      key: beforeValidate,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* value */ CellValue, 
              /* row */ Double, 
              /* prop */ String | Double, 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeValueRender(
      key: beforeValueRender,
      callback: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeValueRender(
      key: beforeValueRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeViewRender(
      key: beforeViewRender,
      callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_beforeViewRender(
      key: beforeViewRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_construct(key: construct, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_construct(key: construct, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_init(key: init, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_init(key: init, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyAutoColumnSizeSeed(
      key: modifyAutoColumnSizeSeed,
      callback: js.UndefOr[
          js.Function3[
            /* seed */ String, 
            /* cellProperties */ CellProperties, 
            /* cellValue */ CellValue, 
            String | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyAutoColumnSizeSeed(
      key: modifyAutoColumnSizeSeed,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* seed */ String, 
              /* cellProperties */ CellProperties, 
              /* cellValue */ CellValue, 
              String | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyAutofillRange(
      key: modifyAutofillRange,
      callback: js.UndefOr[
          js.Function2[
            /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyAutofillRange(
      key: modifyAutofillRange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyColHeader(key: modifyColHeader, callback: js.UndefOr[js.Function1[/* column */ Double, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyColHeader(key: modifyColHeader, callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyColWidth(
      key: modifyColWidth,
      callback: js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyColWidth(
      key: modifyColWidth,
      callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyGetCellCoords(
      key: modifyGetCellCoords,
      callback: js.UndefOr[
          js.Function3[
            /* row */ Double, 
            /* column */ Double, 
            /* topmost */ Boolean, 
            Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyGetCellCoords(
      key: modifyGetCellCoords,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* row */ Double, 
              /* column */ Double, 
              /* topmost */ Boolean, 
              Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyRowData(key: modifyRowData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyRowData(key: modifyRowData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyRowHeader(key: modifyRowHeader, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyRowHeader(key: modifyRowHeader, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyRowHeaderWidth(key: modifyRowHeaderWidth, callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyRowHeaderWidth(
      key: modifyRowHeaderWidth,
      callback: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.UndefOr[
          js.Function1[
            /* delta */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* delta */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.UndefOr[
          js.Function1[
            /* delta */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* delta */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.Array[
          js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_persistentStateReset(key: persistentStateReset, callback: js.UndefOr[js.Function1[/* key */ String, Unit]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_persistentStateReset(key: persistentStateReset, callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_persistentStateSave(
      key: persistentStateSave,
      callback: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]
    ): Unit = js.native
    @JSName("addHookOnce")
    def addHookOnce_persistentStateSave(
      key: persistentStateSave,
      callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]]
    ): Unit = js.native
    
    @JSName("addHook")
    def addHook_afterAddChild(
      key: afterAddChild,
      callback: js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ js.UndefOr[RowObject], 
            /* index */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterAddChild(
      key: afterAddChild,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* parent */ RowObject, 
              /* element */ js.UndefOr[RowObject], 
              /* index */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCellMetaReset(key: afterCellMetaReset, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterCellMetaReset(key: afterCellMetaReset, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterChange(
      key: afterChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterChange(
      key: afterChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterChangesObserved(key: afterChangesObserved, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterChangesObserved(key: afterChangesObserved, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnCollapse(
      key: afterColumnCollapse,
      callback: js.UndefOr[
          js.Function4[
            /* currentCollapsedColumns */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* collapsePossible */ Boolean, 
            /* successfullyCollapsed */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnCollapse(
      key: afterColumnCollapse,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentCollapsedColumns */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* collapsePossible */ Boolean, 
              /* successfullyCollapsed */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnExpand(
      key: afterColumnExpand,
      callback: js.UndefOr[
          js.Function4[
            /* currentCollapsedColumns */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* expandPossible */ Boolean, 
            /* successfullyExpanded */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnExpand(
      key: afterColumnExpand,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentCollapsedColumns */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* expandPossible */ Boolean, 
              /* successfullyExpanded */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnMove(
      key: afterColumnMove,
      callback: js.UndefOr[
          js.Function5[
            /* movedColumns */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            /* orderChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnMove(
      key: afterColumnMove,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* movedColumns */ js.Array[Double], 
              /* finalIndex */ Double, 
              /* dropIndex */ js.UndefOr[Double], 
              /* movePossible */ Boolean, 
              /* orderChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnResize(
      key: afterColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnResize(
      key: afterColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnSort(
      key: afterColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnSort(
      key: afterColumnSort,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterContextMenuHide(key: afterContextMenuHide, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterContextMenuHide(
      key: afterContextMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterContextMenuShow(key: afterContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterContextMenuShow(
      key: afterContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCopy(
      key: afterCopy,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCopy(
      key: afterCopy,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCopyLimit(
      key: afterCopyLimit,
      callback: js.UndefOr[
          js.Function4[
            /* selectedRows */ Double, 
            /* selectedColumns */ Double, 
            /* copyRowsLimit */ Double, 
            /* copyColumnsLimit */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCopyLimit(
      key: afterCopyLimit,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* selectedRows */ Double, 
              /* selectedColumns */ Double, 
              /* copyRowsLimit */ Double, 
              /* copyColumnsLimit */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCreateCol(
      key: afterCreateCol,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCreateCol(
      key: afterCreateCol,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCreateRow(
      key: afterCreateRow,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCreateRow(
      key: afterCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCut(
      key: afterCut,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCut(
      key: afterCut,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDeselect(key: afterDeselect, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDeselect(key: afterDeselect, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDestroy(key: afterDestroy, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDestroy(key: afterDestroy, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDetachChild(
      key: afterDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDetachChild(
      key: afterDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDocumentKeyDown(key: afterDocumentKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDocumentKeyDown(
      key: afterDocumentKeyDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDrawSelection(
      key: afterDrawSelection,
      callback: js.UndefOr[
          js.Function4[
            /* currentRow */ Double, 
            /* currentColumn */ Double, 
            /* cornersOfSelection */ js.Array[Double], 
            /* layerLevel */ js.UndefOr[Double], 
            String | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDrawSelection(
      key: afterDrawSelection,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentRow */ Double, 
              /* currentColumn */ Double, 
              /* cornersOfSelection */ js.Array[Double], 
              /* layerLevel */ js.UndefOr[Double], 
              String | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDropdownMenuHide(key: afterDropdownMenuHide, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDropdownMenuHide(
      key: afterDropdownMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDropdownMenuShow(key: afterDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDropdownMenuShow(
      key: afterDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterFilter(
      key: afterFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterFilter(
      key: afterFilter,
      callback: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.Array[js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.Array[
          js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.Array[
          js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterHideColumns(
      key: afterHideColumns,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterHideColumns(
      key: afterHideColumns,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterHideRows(
      key: afterHideRows,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterHideRows(
      key: afterHideRows,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterInit(key: afterInit, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterInit(key: afterInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterLanguageChange(key: afterLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterLanguageChange(
      key: afterLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterListen(key: afterListen, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterListen(key: afterListen, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterLoadData(
      key: afterLoadData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterLoadData(
      key: afterLoadData,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterMergeCells(
      key: afterMergeCells,
      callback: js.UndefOr[
          js.Function3[
            /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* mergeParent */ Settings, 
            /* auto */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterMergeCells(
      key: afterMergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* mergeParent */ Settings, 
              /* auto */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterMomentumScroll(key: afterMomentumScroll, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterMomentumScroll(key: afterMomentumScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellCornerDblClick(key: afterOnCellCornerDblClick, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellCornerDblClick(
      key: afterOnCellCornerDblClick,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellCornerMouseDown(key: afterOnCellCornerMouseDown, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellCornerMouseDown(
      key: afterOnCellCornerMouseDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterPaste(
      key: afterPaste,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterPaste(
      key: afterPaste,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterRedo(key: afterRedo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterRedo(key: afterRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterRedoStackChange(
      key: afterRedoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* undoneActionsBefore */ js.Array[Action], 
            /* undoneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRedoStackChange(
      key: afterRedoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* undoneActionsBefore */ js.Array[Action], 
              /* undoneActionsAfter */ js.Array[Action], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRefreshDimensions(
      key: afterRefreshDimensions,
      callback: js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRefreshDimensions(
      key: afterRefreshDimensions,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* previousDimensions */ js.Object, 
              /* currentDimensions */ js.Object, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRemoveCol(
      key: afterRemoveCol,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRemoveCol(
      key: afterRemoveCol,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalColumns */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRemoveRow(
      key: afterRemoveRow,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalRows */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRemoveRow(
      key: afterRemoveRow,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalRows */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRender(key: afterRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterRender(key: afterRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterRenderer(
      key: afterRenderer,
      callback: js.UndefOr[
          js.Function6[
            /* TD */ HTMLTableCellElement, 
            /* row */ Double, 
            /* column */ Double, 
            /* prop */ String | Double, 
            /* value */ String, 
            /* cellProperties */ CellProperties, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRenderer(
      key: afterRenderer,
      callback: js.Array[
          js.UndefOr[
            js.Function6[
              /* TD */ HTMLTableCellElement, 
              /* row */ Double, 
              /* column */ Double, 
              /* prop */ String | Double, 
              /* value */ String, 
              /* cellProperties */ CellProperties, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRowMove(
      key: afterRowMove,
      callback: js.UndefOr[
          js.Function5[
            /* movedRows */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            /* orderChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRowMove(
      key: afterRowMove,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* movedRows */ js.Array[Double], 
              /* finalIndex */ Double, 
              /* dropIndex */ js.UndefOr[Double], 
              /* movePossible */ Boolean, 
              /* orderChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRowResize(
      key: afterRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRowResize(
      key: afterRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterScrollVertically(key: afterScrollVertically, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterScrollVertically(key: afterScrollVertically, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelection(
      key: afterSelection,
      callback: js.UndefOr[
          js.Function6[
            /* row */ Double, 
            /* column */ Double, 
            /* row2 */ Double, 
            /* column2 */ Double, 
            /* preventScrolling */ Value, 
            /* selectionLayerLevel */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelection(
      key: afterSelection,
      callback: js.Array[
          js.UndefOr[
            js.Function6[
              /* row */ Double, 
              /* column */ Double, 
              /* row2 */ Double, 
              /* column2 */ Double, 
              /* preventScrolling */ Value, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelectionByProp(
      key: afterSelectionByProp,
      callback: js.UndefOr[
          js.Function6[
            /* row */ Double, 
            /* prop */ String, 
            /* row2 */ Double, 
            /* prop2 */ String, 
            /* preventScrolling */ Value, 
            /* selectionLayerLevel */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelectionByProp(
      key: afterSelectionByProp,
      callback: js.Array[
          js.UndefOr[
            js.Function6[
              /* row */ Double, 
              /* prop */ String, 
              /* row2 */ Double, 
              /* prop2 */ String, 
              /* preventScrolling */ Value, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelectionEnd(
      key: afterSelectionEnd,
      callback: js.UndefOr[
          js.Function5[
            /* row */ Double, 
            /* column */ Double, 
            /* row2 */ Double, 
            /* column2 */ Double, 
            /* selectionLayerLevel */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelectionEnd(
      key: afterSelectionEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* row */ Double, 
              /* column */ Double, 
              /* row2 */ Double, 
              /* column2 */ Double, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelectionEndByProp(
      key: afterSelectionEndByProp,
      callback: js.UndefOr[
          js.Function5[
            /* row */ Double, 
            /* prop */ String, 
            /* row2 */ Double, 
            /* prop2 */ String, 
            /* selectionLayerLevel */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelectionEndByProp(
      key: afterSelectionEndByProp,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* row */ Double, 
              /* prop */ String, 
              /* row2 */ Double, 
              /* prop2 */ String, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSheetAdded(key: afterSheetAdded, callback: js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterSheetAdded(
      key: afterSheetAdded,
      callback: js.Array[js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.UndefOr[
          js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.Array[
          js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterTrimRow(
      key: afterTrimRow,
      callback: js.UndefOr[
          js.Function4[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterTrimRow(
      key: afterTrimRow,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUndo(key: afterUndo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterUndo(key: afterUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterUndoStackChange(
      key: afterUndoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* doneActionsBefore */ js.Array[Action], 
            /* doneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUndoStackChange(
      key: afterUndoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* doneActionsBefore */ js.Array[Action], 
              /* doneActionsAfter */ js.Array[Action], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnhideColumns(
      key: afterUnhideColumns,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnhideColumns(
      key: afterUnhideColumns,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnhideRows(
      key: afterUnhideRows,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnhideRows(
      key: afterUnhideRows,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnlisten(key: afterUnlisten, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnlisten(key: afterUnlisten, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.UndefOr[
          js.Function2[
            /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* auto */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* auto */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUntrimRow(
      key: afterUntrimRow,
      callback: js.UndefOr[
          js.Function4[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUntrimRow(
      key: afterUntrimRow,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUpdateData(
      key: afterUpdateData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUpdateData(
      key: afterUpdateData,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUpdateSettings(key: afterUpdateSettings, callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterUpdateSettings(
      key: afterUpdateSettings,
      callback: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterValidate(
      key: afterValidate,
      callback: js.UndefOr[
          js.Function5[
            /* isValid */ Boolean, 
            /* value */ CellValue, 
            /* row */ Double, 
            /* prop */ String | Double, 
            /* source */ ChangeSource, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterValidate(
      key: afterValidate,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* isValid */ Boolean, 
              /* value */ CellValue, 
              /* row */ Double, 
              /* prop */ String | Double, 
              /* source */ ChangeSource, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterViewRender(key: afterViewRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterViewRender(key: afterViewRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeAddChild(
      key: beforeAddChild,
      callback: js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ js.UndefOr[RowObject], 
            /* index */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeAddChild(
      key: beforeAddChild,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* parent */ RowObject, 
              /* element */ js.UndefOr[RowObject], 
              /* index */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeChange(
      key: beforeChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeChange(
      key: beforeChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnCollapse(
      key: beforeColumnCollapse,
      callback: js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* collapsePossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnCollapse(
      key: beforeColumnCollapse,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentCollapsedColumn */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* collapsePossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnExpand(
      key: beforeColumnExpand,
      callback: js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* expandPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnExpand(
      key: beforeColumnExpand,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentCollapsedColumn */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* expandPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnMove(
      key: beforeColumnMove,
      callback: js.UndefOr[
          js.Function4[
            /* movedColumns */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnMove(
      key: beforeColumnMove,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* movedColumns */ js.Array[Double], 
              /* finalIndex */ Double, 
              /* dropIndex */ js.UndefOr[Double], 
              /* movePossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnSort(
      key: beforeColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnSort(
      key: beforeColumnSort,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeContextMenuShow(key: beforeContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeContextMenuShow(
      key: beforeContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCopy(
      key: beforeCopy,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCopy(
      key: beforeCopy,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCreateCol(
      key: beforeCreateCol,
      callback: js.UndefOr[
          js.Function3[
            /* index */ Double, 
            /* amount */ Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCreateCol(
      key: beforeCreateCol,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* index */ Double, 
              /* amount */ Double, 
              /* source */ js.UndefOr[ChangeSource], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCut(
      key: beforeCut,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCut(
      key: beforeCut,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeDropdownMenuShow(key: beforeDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeDropdownMenuShow(
      key: beforeDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeFilter(
      key: beforeFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeFilter(
      key: beforeFilter,
      callback: js.Array[
          js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHideColumns(
      key: beforeHideColumns,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHideColumns(
      key: beforeHideColumns,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHideRows(
      key: beforeHideRows,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHideRows(
      key: beforeHideRows,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHighlightingColumnHeader(
      key: beforeHighlightingColumnHeader,
      callback: js.UndefOr[
          js.Function3[
            /* column */ Double, 
            /* headerLevel */ Double, 
            /* highlightMeta */ HookHighlightColumnHeaderMeta, 
            Double | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHighlightingColumnHeader(
      key: beforeHighlightingColumnHeader,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* column */ Double, 
              /* headerLevel */ Double, 
              /* highlightMeta */ HookHighlightColumnHeaderMeta, 
              Double | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHighlightingRowHeader(
      key: beforeHighlightingRowHeader,
      callback: js.UndefOr[
          js.Function3[
            /* row */ Double, 
            /* headerLevel */ Double, 
            /* highlightMeta */ HookHighlightRowHeaderMeta, 
            Double | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHighlightingRowHeader(
      key: beforeHighlightingRowHeader,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* row */ Double, 
              /* headerLevel */ Double, 
              /* highlightMeta */ HookHighlightRowHeaderMeta, 
              Double | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeInit(key: beforeInit, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeInit(key: beforeInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeKeyDown(key: beforeKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeKeyDown(key: beforeKeyDown, callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeLanguageChange(key: beforeLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeLanguageChange(
      key: beforeLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeLoadData(
      key: beforeLoadData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeLoadData(
      key: beforeLoadData,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.UndefOr[
          js.Function2[
            /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* auto */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* auto */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforePaste(
      key: beforePaste,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforePaste(
      key: beforePaste,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRedo(key: beforeRedo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRedo(key: beforeRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.Array[js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRefreshDimensions(
      key: beforeRefreshDimensions,
      callback: js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* actionPossible */ Boolean, 
            Boolean | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRefreshDimensions(
      key: beforeRefreshDimensions,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* previousDimensions */ js.Object, 
              /* currentDimensions */ js.Object, 
              /* actionPossible */ Boolean, 
              Boolean | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveCellClassNames(key: beforeRemoveCellClassNames, callback: js.UndefOr[js.Function0[js.Array[String] | Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveCellClassNames(
      key: beforeRemoveCellClassNames,
      callback: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveCol(
      key: beforeRemoveCol,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveCol(
      key: beforeRemoveCol,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalColumns */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveRow(
      key: beforeRemoveRow,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveRow(
      key: beforeRemoveRow,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalColumns */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRender(key: beforeRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRender(key: beforeRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRenderer(
      key: beforeRenderer,
      callback: js.UndefOr[
          js.Function6[
            /* TD */ HTMLTableCellElement, 
            /* row */ Double, 
            /* column */ Double, 
            /* prop */ String | Double, 
            /* value */ CellValue, 
            /* cellProperties */ CellProperties, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRenderer(
      key: beforeRenderer,
      callback: js.Array[
          js.UndefOr[
            js.Function6[
              /* TD */ HTMLTableCellElement, 
              /* row */ Double, 
              /* column */ Double, 
              /* prop */ String | Double, 
              /* value */ CellValue, 
              /* cellProperties */ CellProperties, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRowMove(
      key: beforeRowMove,
      callback: js.UndefOr[
          js.Function4[
            /* movedRows */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRowMove(
      key: beforeRowMove,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* movedRows */ js.Array[Double], 
              /* finalIndex */ Double, 
              /* dropIndex */ js.UndefOr[Double], 
              /* movePossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRowResize(
      key: beforeRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRowResize(
      key: beforeRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.UndefOr[
          js.Function1[
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.UndefOr[
          js.Function1[
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.UndefOr[
          js.Function1[
            /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.Array[
          js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeTouchScroll(key: beforeTouchScroll, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeTouchScroll(key: beforeTouchScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeTrimRow(
      key: beforeTrimRow,
      callback: js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeTrimRow(
      key: beforeTrimRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUndo(key: beforeUndo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUndo(key: beforeUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.UndefOr[
          js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUnhideColumns(
      key: beforeUnhideColumns,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUnhideColumns(
      key: beforeUnhideColumns,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUnhideRows(
      key: beforeUnhideRows,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUnhideRows(
      key: beforeUnhideRows,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.UndefOr[
          js.Function2[
            /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* auto */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* auto */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUntrimRow(
      key: beforeUntrimRow,
      callback: js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUntrimRow(
      key: beforeUntrimRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUpdateData(
      key: beforeUpdateData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUpdateData(
      key: beforeUpdateData,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeValidate(
      key: beforeValidate,
      callback: js.UndefOr[
          js.Function4[
            /* value */ CellValue, 
            /* row */ Double, 
            /* prop */ String | Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeValidate(
      key: beforeValidate,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* value */ CellValue, 
              /* row */ Double, 
              /* prop */ String | Double, 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeValueRender(
      key: beforeValueRender,
      callback: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeValueRender(
      key: beforeValueRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeViewRender(
      key: beforeViewRender,
      callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeViewRender(
      key: beforeViewRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_construct(key: construct, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_construct(key: construct, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_init(key: init, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_init(key: init, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyAutoColumnSizeSeed(
      key: modifyAutoColumnSizeSeed,
      callback: js.UndefOr[
          js.Function3[
            /* seed */ String, 
            /* cellProperties */ CellProperties, 
            /* cellValue */ CellValue, 
            String | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyAutoColumnSizeSeed(
      key: modifyAutoColumnSizeSeed,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* seed */ String, 
              /* cellProperties */ CellProperties, 
              /* cellValue */ CellValue, 
              String | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyAutofillRange(
      key: modifyAutofillRange,
      callback: js.UndefOr[
          js.Function2[
            /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyAutofillRange(
      key: modifyAutofillRange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyColHeader(key: modifyColHeader, callback: js.UndefOr[js.Function1[/* column */ Double, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyColHeader(key: modifyColHeader, callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyColWidth(
      key: modifyColWidth,
      callback: js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyColWidth(
      key: modifyColWidth,
      callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyGetCellCoords(
      key: modifyGetCellCoords,
      callback: js.UndefOr[
          js.Function3[
            /* row */ Double, 
            /* column */ Double, 
            /* topmost */ Boolean, 
            Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyGetCellCoords(
      key: modifyGetCellCoords,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* row */ Double, 
              /* column */ Double, 
              /* topmost */ Boolean, 
              Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowData(key: modifyRowData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowData(key: modifyRowData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowHeader(key: modifyRowHeader, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowHeader(key: modifyRowHeader, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowHeaderWidth(key: modifyRowHeaderWidth, callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowHeaderWidth(
      key: modifyRowHeaderWidth,
      callback: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.UndefOr[
          js.Function1[
            /* delta */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* delta */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.UndefOr[
          js.Function1[
            /* delta */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* delta */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.Array[
          js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_persistentStateReset(key: persistentStateReset, callback: js.UndefOr[js.Function1[/* key */ String, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_persistentStateReset(key: persistentStateReset, callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_persistentStateSave(
      key: persistentStateSave,
      callback: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_persistentStateSave(
      key: persistentStateSave,
      callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]]
    ): Unit = js.native
    
    def alter(action: insert_row | insert_col | remove_row | remove_col): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: js.Array[js.Tuple2[Double, Double]]
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: js.Array[js.Tuple2[Double, Double]],
      amount: Double
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: js.Array[js.Tuple2[Double, Double]],
      amount: Double,
      source: String
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: js.Array[js.Tuple2[Double, Double]],
      amount: Double,
      source: String,
      keepEmptyRows: Boolean
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: js.Array[js.Tuple2[Double, Double]],
      amount: Double,
      source: Unit,
      keepEmptyRows: Boolean
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: js.Array[js.Tuple2[Double, Double]],
      amount: Unit,
      source: String
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: js.Array[js.Tuple2[Double, Double]],
      amount: Unit,
      source: String,
      keepEmptyRows: Boolean
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: js.Array[js.Tuple2[Double, Double]],
      amount: Unit,
      source: Unit,
      keepEmptyRows: Boolean
    ): Unit = js.native
    def alter(action: insert_row | insert_col | remove_row | remove_col, index: Double): Unit = js.native
    def alter(action: insert_row | insert_col | remove_row | remove_col, index: Double, amount: Double): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: Double,
      amount: Double,
      source: String
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: Double,
      amount: Double,
      source: String,
      keepEmptyRows: Boolean
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: Double,
      amount: Double,
      source: Unit,
      keepEmptyRows: Boolean
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: Double,
      amount: Unit,
      source: String
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: Double,
      amount: Unit,
      source: String,
      keepEmptyRows: Boolean
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: Double,
      amount: Unit,
      source: Unit,
      keepEmptyRows: Boolean
    ): Unit = js.native
    def alter(action: insert_row | insert_col | remove_row | remove_col, index: Unit, amount: Double): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: Unit,
      amount: Double,
      source: String
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: Unit,
      amount: Double,
      source: String,
      keepEmptyRows: Boolean
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: Unit,
      amount: Double,
      source: Unit,
      keepEmptyRows: Boolean
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: Unit,
      amount: Unit,
      source: String
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: Unit,
      amount: Unit,
      source: String,
      keepEmptyRows: Boolean
    ): Unit = js.native
    def alter(
      action: insert_row | insert_col | remove_row | remove_col,
      index: Unit,
      amount: Unit,
      source: Unit,
      keepEmptyRows: Boolean
    ): Unit = js.native
    
    def batch[R](wrappedOperations: js.Function0[R]): R = js.native
    
    def batchExecution[R](wrappedOperations: js.Function0[R], forceFlushChanges: Boolean): R = js.native
    
    def batchRender[R](wrappedOperations: js.Function0[R]): R = js.native
    
    def clear(): Unit = js.native
    
    def clearUndo(): Unit = js.native
    
    def colToProp(col: Double): String | Double = js.native
    
    var columnIndexMapper: IndexMapper = js.native
    
    var container: HTMLElement = js.native
    
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
    def destroyEditor(revertOriginal: Unit, prepareEditorIfNeeded: Boolean): Unit = js.native
    
    def emptySelectedCells(): Unit = js.native
    
    var forceFullRender: Boolean = js.native
    
    def getActiveEditor(): js.UndefOr[BaseEditor] = js.native
    
    def getCell(row: Double, col: Double): HTMLTableCellElement | Null = js.native
    def getCell(row: Double, col: Double, topmost: Boolean): HTMLTableCellElement | Null = js.native
    
    def getCellEditor(cellMeta: CellMeta): BaseEditor = js.native
    def getCellEditor(row: Double, col: Double): BaseEditor = js.native
    
    def getCellMeta(row: Double, col: Double): CellProperties = js.native
    
    def getCellMetaAtRow(row: Double): js.Array[CellProperties] = js.native
    
    def getCellRenderer(cellMeta: CellMeta): BaseRenderer = js.native
    def getCellRenderer(row: Double, col: Double): BaseRenderer = js.native
    
    def getCellValidator(cellMeta: CellMeta): js.UndefOr[BaseValidator_ | js.RegExp] = js.native
    def getCellValidator(row: Double, col: Double): js.UndefOr[BaseValidator_ | js.RegExp] = js.native
    
    def getCellsMeta(): js.Array[CellProperties] = js.native
    
    def getColHeader(): js.Array[Double | String] = js.native
    def getColHeader(col: Double): Double | String = js.native
    
    def getColWidth(col: Double): Double = js.native
    
    def getCoords(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    def getCoords(elem: Element): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getCopyableData(row: Double, column: Double): String = js.native
    
    def getCopyableText(startRow: Double, startCol: Double, endRow: Double, endCol: Double): String = js.native
    
    def getData(): js.Array[CellValue] = js.native
    def getData(row: Double): js.Array[CellValue] = js.native
    def getData(row: Double, column: Double): js.Array[CellValue] = js.native
    def getData(row: Double, column: Double, row2: Double): js.Array[CellValue] = js.native
    def getData(row: Double, column: Double, row2: Double, column2: Double): js.Array[CellValue] = js.native
    def getData(row: Double, column: Double, row2: Unit, column2: Double): js.Array[CellValue] = js.native
    def getData(row: Double, column: Unit, row2: Double): js.Array[CellValue] = js.native
    def getData(row: Double, column: Unit, row2: Double, column2: Double): js.Array[CellValue] = js.native
    def getData(row: Double, column: Unit, row2: Unit, column2: Double): js.Array[CellValue] = js.native
    def getData(row: Unit, column: Double): js.Array[CellValue] = js.native
    def getData(row: Unit, column: Double, row2: Double): js.Array[CellValue] = js.native
    def getData(row: Unit, column: Double, row2: Double, column2: Double): js.Array[CellValue] = js.native
    def getData(row: Unit, column: Double, row2: Unit, column2: Double): js.Array[CellValue] = js.native
    def getData(row: Unit, column: Unit, row2: Double): js.Array[CellValue] = js.native
    def getData(row: Unit, column: Unit, row2: Double, column2: Double): js.Array[CellValue] = js.native
    def getData(row: Unit, column: Unit, row2: Unit, column2: Double): js.Array[CellValue] = js.native
    
    def getDataAtCell(row: Double, column: Double): CellValue = js.native
    
    def getDataAtCol(column: Double): js.Array[CellValue] = js.native
    
    def getDataAtProp(prop: String): js.Array[CellValue] = js.native
    def getDataAtProp(prop: Double): js.Array[CellValue] = js.native
    
    def getDataAtRow(row: Double): js.Array[CellValue] = js.native
    
    def getDataAtRowProp(row: Double, prop: String): CellValue = js.native
    
    def getDataType(rowFrom: Double, columnFrom: Double, rowTo: Double, columnTo: Double): CellType | mixed = js.native
    
    def getDirectionFactor(): `1` | `-1` = js.native
    
    def getInstance(): Core = js.native
    
    def getPlugin(pluginName: String): BasePlugin = js.native
    @JSName("getPlugin")
    def getPlugin_autoColumnSize(pluginName: autoColumnSize): AutoColumnSize = js.native
    @JSName("getPlugin")
    def getPlugin_autoRowSize(pluginName: autoRowSize): AutoRowSize = js.native
    @JSName("getPlugin")
    def getPlugin_autofill(pluginName: autofill): Autofill = js.native
    @JSName("getPlugin")
    def getPlugin_basePlugin(pluginName: basePlugin): BasePlugin = js.native
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
    def getPlugin_customBorders(pluginName: customBorders): CustomBorders = js.native
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
    def getPlugin_persistentState(pluginName: persistentState): PersistentState = js.native
    @JSName("getPlugin")
    def getPlugin_search(pluginName: search): Search = js.native
    @JSName("getPlugin")
    def getPlugin_touchScroll(pluginName: touchScroll): TouchScroll = js.native
    @JSName("getPlugin")
    def getPlugin_trimRows(pluginName: trimRows): TrimRows = js.native
    @JSName("getPlugin")
    def getPlugin_undoRedo(pluginName: undoRedo): UndoRedo = js.native
    
    def getRowHeader(): js.Array[String | Double] = js.native
    def getRowHeader(row: Double): String | Double = js.native
    
    def getRowHeight(row: Double): Double = js.native
    
    def getSchema(): RowObject = js.native
    
    def getSelected(): js.UndefOr[js.Array[js.Tuple4[Double, Double, Double, Double]]] = js.native
    
    def getSelectedLast(): js.UndefOr[js.Array[Double]] = js.native
    
    def getSelectedRange(): js.UndefOr[
        js.Array[typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default]
      ] = js.native
    
    def getSelectedRangeLast(): js.UndefOr[typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default] = js.native
    
    def getSettings(): GridSettings = js.native
    
    def getShortcutManager(): ShortcutManager = js.native
    
    def getSourceData(): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Double, column: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Double, column: Double, row2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Double, column: Double, row2: Double, column2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Double, column: Double, row2: Unit, column2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Double, column: Unit, row2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Double, column: Unit, row2: Double, column2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Double, column: Unit, row2: Unit, column2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Unit, column: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Unit, column: Double, row2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Unit, column: Double, row2: Double, column2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Unit, column: Double, row2: Unit, column2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Unit, column: Unit, row2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Unit, column: Unit, row2: Double, column2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    def getSourceData(row: Unit, column: Unit, row2: Unit, column2: Double): js.Array[js.Array[CellValue] | RowObject] = js.native
    
    def getSourceDataArray(): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Double, column: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Double, column: Double, row2: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Double, column: Double, row2: Double, column2: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Double, column: Double, row2: Unit, column2: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Double, column: Unit, row2: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Double, column: Unit, row2: Double, column2: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Double, column: Unit, row2: Unit, column2: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Unit, column: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Unit, column: Double, row2: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Unit, column: Double, row2: Double, column2: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Unit, column: Double, row2: Unit, column2: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Unit, column: Unit, row2: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Unit, column: Unit, row2: Double, column2: Double): js.Array[js.Array[CellValue]] = js.native
    def getSourceDataArray(row: Unit, column: Unit, row2: Unit, column2: Double): js.Array[js.Array[CellValue]] = js.native
    
    def getSourceDataAtCell(row: Double, column: Double): CellValue = js.native
    
    def getSourceDataAtCol(column: Double): js.Array[CellValue] = js.native
    
    def getSourceDataAtRow(row: Double): js.Array[CellValue] | RowObject = js.native
    
    def getTranslatedPhrase(dictionaryKey: String, extraArguments: Any): String | Null = js.native
    
    def getValue(): CellValue = js.native
    
    def hasColHeaders(): Boolean = js.native
    
    def hasHook(
      key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179, starting with typingsJapgolly.handsontable.handsontableStrings.afterAddChild, typingsJapgolly.handsontable.handsontableStrings.afterAutofill, typingsJapgolly.handsontable.handsontableStrings.afterBeginEditing */ Any
    ): Boolean = js.native
    
    def hasRowHeaders(): Boolean = js.native
    
    def init(): js.Function0[Unit] = js.native
    
    def isColumnModificationAllowed(): Boolean = js.native
    
    var isDestroyed: Boolean = js.native
    
    def isEmptyCol(col: Double): Boolean = js.native
    
    def isEmptyRow(row: Double): Boolean = js.native
    
    def isExecutionSuspended(): Boolean = js.native
    
    def isListening(): Boolean = js.native
    
    def isLtr(): Boolean = js.native
    
    def isRedoAvailable(): Boolean = js.native
    
    def isRenderSuspended(): Boolean = js.native
    
    def isRtl(): Boolean = js.native
    
    def isUndoAvailable(): Boolean = js.native
    
    def listen(): Unit = js.native
    
    def loadData(data: js.Array[js.Array[CellValue] | RowObject]): Unit = js.native
    def loadData(data: js.Array[js.Array[CellValue] | RowObject], source: String): Unit = js.native
    
    def populateFromArray(
      row: Double,
      col: Double,
      input: js.Array[js.Array[CellValue]],
      endRow: js.UndefOr[Double],
      endCol: js.UndefOr[Double],
      source: js.UndefOr[String],
      method: js.UndefOr[shift_down | shift_right | overwrite],
      direction: js.UndefOr[left | right | up | down],
      deltas: js.UndefOr[js.Array[Any]]
    ): Unit = js.native
    
    def propToCol(prop: String): Double = js.native
    def propToCol(prop: Double): Double = js.native
    
    def redo(): Unit = js.native
    
    def refreshDimensions(): Unit = js.native
    
    def removeCellMeta(row: Double, col: Double, key: valid | comment | isSearchResult | hidden | skipRowOnPaste): Unit = js.native
    def removeCellMeta(row: Double, col: Double, key: String): Unit = js.native
    
    def removeHook(
      key: afterAutofill,
      callback: js.Function4[
          /* fillData */ js.Array[js.Array[CellValue]], 
          /* sourceRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
          /* targetRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
          /* direction */ up | down | left | right, 
          Unit
        ]
    ): Unit = js.native
    def removeHook(
      key: afterModifyTransformEnd,
      callback: js.Function3[
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
    ): Unit = js.native
    def removeHook(
      key: afterModifyTransformStart,
      callback: js.Function3[
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
    ): Unit = js.native
    def removeHook(
      key: beforeAutofillInsidePopulate,
      callback: js.Function4[
          /* index */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          /* direction */ up | down | left | right, 
          /* input */ js.Array[js.Array[CellValue]], 
          /* deltas */ js.Array[Any], 
          Unit
        ]
    ): Unit = js.native
    def removeHook(
      key: beforeAutofill,
      callback: js.Function4[
          /* selectionData */ js.Array[js.Array[CellValue]], 
          /* sourceRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
          /* targetRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
          /* direction */ up | down | left | right, 
          js.Array[js.Array[CellValue]] | Boolean | Unit
        ]
    ): Unit = js.native
    def removeHook(
      key: beforeCellAlignment,
      callback: js.Function4[
          /* stateBefore */ NumberDictionary[js.Array[String]], 
          /* range */ js.Array[typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default], 
          /* type */ horizontal | vertical, 
          /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
          Unit
        ]
    ): Unit = js.native
    def removeHook(
      key: beforeDrawBorders,
      callback: js.Function2[
          /* corners */ js.Array[Double], 
          /* borderClassName */ js.UndefOr[current | area | highlight], 
          Unit
        ]
    ): Unit = js.native
    def removeHook(
      key: modifyData,
      callback: js.Function4[
          /* row */ Double, 
          /* column */ Double, 
          /* valueHolder */ ValueCellValue, 
          /* ioMode */ get | set, 
          Unit
        ]
    ): Unit = js.native
    def removeHook(
      key: modifySourceData,
      callback: js.Function4[
          /* row */ Double, 
          /* column */ Double, 
          /* valueHolder */ ValueCellValue, 
          /* ioMode */ get | set, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterAddChild(key: afterAddChild): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterAddChild(
      key: afterAddChild,
      callback: js.Function3[
          /* parent */ RowObject, 
          /* element */ js.UndefOr[RowObject], 
          /* index */ js.UndefOr[Double], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterAutofill(key: afterAutofill): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterBeginEditing(key: afterBeginEditing): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterBeginEditing(key: afterBeginEditing, callback: js.Function2[/* row */ Double, /* column */ Double, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterCellMetaReset(key: afterCellMetaReset): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterCellMetaReset(key: afterCellMetaReset, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterChange(key: afterChange): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterChange(
      key: afterChange,
      callback: js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterChangesObserved(key: afterChangesObserved): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterChangesObserved(key: afterChangesObserved, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterColumnCollapse(key: afterColumnCollapse): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterColumnCollapse(
      key: afterColumnCollapse,
      callback: js.Function4[
          /* currentCollapsedColumns */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* collapsePossible */ Boolean, 
          /* successfullyCollapsed */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterColumnExpand(key: afterColumnExpand): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterColumnExpand(
      key: afterColumnExpand,
      callback: js.Function4[
          /* currentCollapsedColumns */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* expandPossible */ Boolean, 
          /* successfullyExpanded */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterColumnMove(key: afterColumnMove): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterColumnMove(
      key: afterColumnMove,
      callback: js.Function5[
          /* movedColumns */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ js.UndefOr[Double], 
          /* movePossible */ Boolean, 
          /* orderChanged */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterColumnResize(key: afterColumnResize): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterColumnResize(
      key: afterColumnResize,
      callback: js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterColumnSort(key: afterColumnSort): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterColumnSort(
      key: afterColumnSort,
      callback: js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterContextMenuDefaultOptions(key: afterContextMenuDefaultOptions): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterContextMenuHide(key: afterContextMenuHide): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterContextMenuHide(key: afterContextMenuHide, callback: js.Function1[/* context */ ContextMenu, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterContextMenuShow(key: afterContextMenuShow): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterContextMenuShow(key: afterContextMenuShow, callback: js.Function1[/* context */ ContextMenu, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterCopy(key: afterCopy): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterCopy(
      key: afterCopy,
      callback: js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterCopyLimit(key: afterCopyLimit): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterCopyLimit(
      key: afterCopyLimit,
      callback: js.Function4[
          /* selectedRows */ Double, 
          /* selectedColumns */ Double, 
          /* copyRowsLimit */ Double, 
          /* copyColumnsLimit */ Double, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterCreateCol(key: afterCreateCol): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterCreateCol(
      key: afterCreateCol,
      callback: js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterCreateRow(key: afterCreateRow): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterCreateRow(
      key: afterCreateRow,
      callback: js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterCut(key: afterCut): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterCut(
      key: afterCut,
      callback: js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDeselect(key: afterDeselect): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDeselect(key: afterDeselect, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDestroy(key: afterDestroy): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDestroy(key: afterDestroy, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDetachChild(key: afterDetachChild): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDetachChild(
      key: afterDetachChild,
      callback: js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDocumentKeyDown(key: afterDocumentKeyDown): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDocumentKeyDown(key: afterDocumentKeyDown, callback: js.Function1[/* event */ KeyboardEvent, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDrawSelection(key: afterDrawSelection): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDrawSelection(
      key: afterDrawSelection,
      callback: js.Function4[
          /* currentRow */ Double, 
          /* currentColumn */ Double, 
          /* cornersOfSelection */ js.Array[Double], 
          /* layerLevel */ js.UndefOr[Double], 
          String | Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDropdownMenuDefaultOptions(key: afterDropdownMenuDefaultOptions): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDropdownMenuHide(key: afterDropdownMenuHide): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDropdownMenuHide(key: afterDropdownMenuHide, callback: js.Function1[/* instance */ DropdownMenu, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDropdownMenuShow(key: afterDropdownMenuShow): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterDropdownMenuShow(key: afterDropdownMenuShow, callback: js.Function1[/* instance */ DropdownMenu, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterFilter(key: afterFilter): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterFilter(key: afterFilter, callback: js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterFormulasValuesUpdate(key: afterFormulasValuesUpdate): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterFormulasValuesUpdate(key: afterFormulasValuesUpdate, callback: js.Function1[/* changes */ js.Array[js.Object], Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterGetCellMeta(key: afterGetCellMeta): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterGetColHeader(key: afterGetColHeader): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterGetColumnHeaderRenderers(key: afterGetColumnHeaderRenderers): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.Function1[
          /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterGetRowHeader(key: afterGetRowHeader): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterGetRowHeaderRenderers(key: afterGetRowHeaderRenderers): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.Function1[
          /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterHideColumns(key: afterHideColumns): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterHideColumns(
      key: afterHideColumns,
      callback: js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterHideRows(key: afterHideRows): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterHideRows(
      key: afterHideRows,
      callback: js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterInit(key: afterInit): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterInit(key: afterInit, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterLanguageChange(key: afterLanguageChange): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterLanguageChange(key: afterLanguageChange, callback: js.Function1[/* languageCode */ String, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterListen(key: afterListen): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterListen(key: afterListen, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterLoadData(key: afterLoadData): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterLoadData(
      key: afterLoadData,
      callback: js.Function3[
          /* sourceData */ js.Array[CellValue], 
          /* initialLoad */ Boolean, 
          /* source */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterMergeCells(key: afterMergeCells): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterMergeCells(
      key: afterMergeCells,
      callback: js.Function3[
          /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
          /* mergeParent */ Settings, 
          /* auto */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterModifyTransformEnd(key: afterModifyTransformEnd): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterModifyTransformStart(key: afterModifyTransformStart): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterMomentumScroll(key: afterMomentumScroll): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterMomentumScroll(key: afterMomentumScroll, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterNamedExpressionAdded(key: afterNamedExpressionAdded): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterNamedExpressionRemoved(key: afterNamedExpressionRemoved): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellContextMenu(key: afterOnCellContextMenu): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellCornerDblClick(key: afterOnCellCornerDblClick): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellCornerDblClick(key: afterOnCellCornerDblClick, callback: js.Function1[/* event */ MouseEvent, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellCornerMouseDown(key: afterOnCellCornerMouseDown): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellCornerMouseDown(key: afterOnCellCornerMouseDown, callback: js.Function1[/* event */ MouseEvent, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellMouseDown(key: afterOnCellMouseDown): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellMouseOut(key: afterOnCellMouseOut): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellMouseOver(key: afterOnCellMouseOver): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellMouseUp(key: afterOnCellMouseUp): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterPaste(key: afterPaste): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterPaste(
      key: afterPaste,
      callback: js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterPluginsInitialized(key: afterPluginsInitialized): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRedo(key: afterRedo): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRedo(key: afterRedo, callback: js.Function1[/* action */ Action, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRedoStackChange(key: afterRedoStackChange): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRedoStackChange(
      key: afterRedoStackChange,
      callback: js.Function2[
          /* undoneActionsBefore */ js.Array[Action], 
          /* undoneActionsAfter */ js.Array[Action], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRefreshDimensions(key: afterRefreshDimensions): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRefreshDimensions(
      key: afterRefreshDimensions,
      callback: js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* stateChanged */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRemoveCellMeta(key: afterRemoveCellMeta): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRemoveCol(key: afterRemoveCol): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRemoveCol(
      key: afterRemoveCol,
      callback: js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRemoveRow(key: afterRemoveRow): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRemoveRow(
      key: afterRemoveRow,
      callback: js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalRows */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRender(key: afterRender): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRender(key: afterRender, callback: js.Function1[/* isForced */ Boolean, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRenderer(key: afterRenderer): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRenderer(
      key: afterRenderer,
      callback: js.Function6[
          /* TD */ HTMLTableCellElement, 
          /* row */ Double, 
          /* column */ Double, 
          /* prop */ String | Double, 
          /* value */ String, 
          /* cellProperties */ CellProperties, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRowMove(key: afterRowMove): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRowMove(
      key: afterRowMove,
      callback: js.Function5[
          /* movedRows */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ js.UndefOr[Double], 
          /* movePossible */ Boolean, 
          /* orderChanged */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRowResize(key: afterRowResize): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterRowResize(
      key: afterRowResize,
      callback: js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterScrollHorizontally(key: afterScrollHorizontally): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterScrollVertically(key: afterScrollVertically): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterScrollVertically(key: afterScrollVertically, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSelection(key: afterSelection): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSelection(
      key: afterSelection,
      callback: js.Function6[
          /* row */ Double, 
          /* column */ Double, 
          /* row2 */ Double, 
          /* column2 */ Double, 
          /* preventScrolling */ Value, 
          /* selectionLayerLevel */ Double, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSelectionByProp(key: afterSelectionByProp): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSelectionByProp(
      key: afterSelectionByProp,
      callback: js.Function6[
          /* row */ Double, 
          /* prop */ String, 
          /* row2 */ Double, 
          /* prop2 */ String, 
          /* preventScrolling */ Value, 
          /* selectionLayerLevel */ Double, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSelectionEnd(key: afterSelectionEnd): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSelectionEnd(
      key: afterSelectionEnd,
      callback: js.Function5[
          /* row */ Double, 
          /* column */ Double, 
          /* row2 */ Double, 
          /* column2 */ Double, 
          /* selectionLayerLevel */ Double, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSelectionEndByProp(key: afterSelectionEndByProp): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSelectionEndByProp(
      key: afterSelectionEndByProp,
      callback: js.Function5[
          /* row */ Double, 
          /* prop */ String, 
          /* row2 */ Double, 
          /* prop2 */ String, 
          /* selectionLayerLevel */ Double, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSetCellMeta(key: afterSetCellMeta): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSetDataAtCell(key: afterSetDataAtCell): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSetDataAtRowProp(key: afterSetDataAtRowProp): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSetSourceDataAtCell(key: afterSetSourceDataAtCell): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSheetAdded(key: afterSheetAdded): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSheetAdded(key: afterSheetAdded, callback: js.Function1[/* addedSheetDisplayName */ String, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSheetRemoved(key: afterSheetRemoved): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSheetRenamed(key: afterSheetRenamed): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterTrimRow(key: afterTrimRow): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterTrimRow(
      key: afterTrimRow,
      callback: js.Function4[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUndo(key: afterUndo): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUndo(key: afterUndo, callback: js.Function1[/* action */ Action, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUndoStackChange(key: afterUndoStackChange): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUndoStackChange(
      key: afterUndoStackChange,
      callback: js.Function2[
          /* doneActionsBefore */ js.Array[Action], 
          /* doneActionsAfter */ js.Array[Action], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUnhideColumns(key: afterUnhideColumns): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUnhideColumns(
      key: afterUnhideColumns,
      callback: js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUnhideRows(key: afterUnhideRows): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUnhideRows(
      key: afterUnhideRows,
      callback: js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUnlisten(key: afterUnlisten): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUnlisten(key: afterUnlisten, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUnmergeCells(key: afterUnmergeCells): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.Function2[
          /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
          /* auto */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUntrimRow(key: afterUntrimRow): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUntrimRow(
      key: afterUntrimRow,
      callback: js.Function4[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUpdateData(key: afterUpdateData): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUpdateData(
      key: afterUpdateData,
      callback: js.Function3[
          /* sourceData */ js.Array[CellValue], 
          /* initialLoad */ Boolean, 
          /* source */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUpdateSettings(key: afterUpdateSettings): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterUpdateSettings(key: afterUpdateSettings, callback: js.Function1[/* newSettings */ GridSettings, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterValidate(key: afterValidate): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterValidate(
      key: afterValidate,
      callback: js.Function5[
          /* isValid */ Boolean, 
          /* value */ CellValue, 
          /* row */ Double, 
          /* prop */ String | Double, 
          /* source */ ChangeSource, 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterViewRender(key: afterViewRender): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterViewRender(key: afterViewRender, callback: js.Function1[/* isForced */ Boolean, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterViewportColumnCalculatorOverride(key: afterViewportColumnCalculatorOverride): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.Function1[/* calc */ ViewportColumnsCalculator, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterViewportRowCalculatorOverride(key: afterViewportRowCalculatorOverride): Unit = js.native
    @JSName("removeHook")
    def removeHook_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.Function1[/* calc */ ViewportColumnsCalculator, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeAddChild(key: beforeAddChild): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeAddChild(
      key: beforeAddChild,
      callback: js.Function3[
          /* parent */ RowObject, 
          /* element */ js.UndefOr[RowObject], 
          /* index */ js.UndefOr[Double], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeAutofill(key: beforeAutofill): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeAutofillInsidePopulate(key: beforeAutofillInsidePopulate): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeCellAlignment(key: beforeCellAlignment): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeChange(key: beforeChange): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeChange(
      key: beforeChange,
      callback: js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeChangeRender(key: beforeChangeRender): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeColumnCollapse(key: beforeColumnCollapse): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeColumnCollapse(
      key: beforeColumnCollapse,
      callback: js.Function3[
          /* currentCollapsedColumn */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* collapsePossible */ Boolean, 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeColumnExpand(key: beforeColumnExpand): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeColumnExpand(
      key: beforeColumnExpand,
      callback: js.Function3[
          /* currentCollapsedColumn */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* expandPossible */ Boolean, 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeColumnMove(key: beforeColumnMove): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeColumnMove(
      key: beforeColumnMove,
      callback: js.Function4[
          /* movedColumns */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ js.UndefOr[Double], 
          /* movePossible */ Boolean, 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeColumnResize(key: beforeColumnResize): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeColumnSort(key: beforeColumnSort): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeColumnSort(
      key: beforeColumnSort,
      callback: js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeContextMenuSetItems(key: beforeContextMenuSetItems): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeContextMenuShow(key: beforeContextMenuShow): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeContextMenuShow(key: beforeContextMenuShow, callback: js.Function1[/* context */ ContextMenu, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeCopy(key: beforeCopy): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeCopy(
      key: beforeCopy,
      callback: js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeCreateCol(key: beforeCreateCol): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeCreateCol(
      key: beforeCreateCol,
      callback: js.Function3[
          /* index */ Double, 
          /* amount */ Double, 
          /* source */ js.UndefOr[ChangeSource], 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeCreateRow(key: beforeCreateRow): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeCut(key: beforeCut): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeCut(
      key: beforeCut,
      callback: js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeDetachChild(key: beforeDetachChild): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeDrawBorders(key: beforeDrawBorders): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeDropdownMenuSetItems(key: beforeDropdownMenuSetItems): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeDropdownMenuShow(key: beforeDropdownMenuShow): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeDropdownMenuShow(key: beforeDropdownMenuShow, callback: js.Function1[/* instance */ DropdownMenu, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeFilter(key: beforeFilter): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeFilter(
      key: beforeFilter,
      callback: js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeGetCellMeta(key: beforeGetCellMeta): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeHideColumns(key: beforeHideColumns): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeHideColumns(
      key: beforeHideColumns,
      callback: js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeHideRows(key: beforeHideRows): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeHideRows(
      key: beforeHideRows,
      callback: js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeHighlightingColumnHeader(key: beforeHighlightingColumnHeader): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeHighlightingColumnHeader(
      key: beforeHighlightingColumnHeader,
      callback: js.Function3[
          /* column */ Double, 
          /* headerLevel */ Double, 
          /* highlightMeta */ HookHighlightColumnHeaderMeta, 
          Double | Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeHighlightingRowHeader(key: beforeHighlightingRowHeader): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeHighlightingRowHeader(
      key: beforeHighlightingRowHeader,
      callback: js.Function3[
          /* row */ Double, 
          /* headerLevel */ Double, 
          /* highlightMeta */ HookHighlightRowHeaderMeta, 
          Double | Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeInit(key: beforeInit): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeInit(key: beforeInit, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeInitWalkontable(key: beforeInitWalkontable): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeInitWalkontable(key: beforeInitWalkontable, callback: js.Function1[/* walkontableConfig */ js.Object, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeKeyDown(key: beforeKeyDown): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeKeyDown(key: beforeKeyDown, callback: js.Function1[/* event */ KeyboardEvent, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeLanguageChange(key: beforeLanguageChange): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeLanguageChange(key: beforeLanguageChange, callback: js.Function1[/* languageCode */ String, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeLoadData(key: beforeLoadData): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeLoadData(
      key: beforeLoadData,
      callback: js.Function3[
          /* sourceData */ js.Array[CellValue], 
          /* initialLoad */ Boolean, 
          /* source */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeMergeCells(key: beforeMergeCells): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.Function2[
          /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
          /* auto */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeOnCellContextMenu(key: beforeOnCellContextMenu): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeOnCellMouseDown(key: beforeOnCellMouseDown): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.Function4[
          /* event */ MouseEvent, 
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeOnCellMouseOut(key: beforeOnCellMouseOut): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeOnCellMouseOver(key: beforeOnCellMouseOver): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.Function4[
          /* event */ MouseEvent, 
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeOnCellMouseUp(key: beforeOnCellMouseUp): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforePaste(key: beforePaste): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforePaste(
      key: beforePaste,
      callback: js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRedo(key: beforeRedo): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRedo(key: beforeRedo, callback: js.Function1[/* action */ Action, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRedoStackChange(key: beforeRedoStackChange): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRedoStackChange(key: beforeRedoStackChange, callback: js.Function1[/* undoneActions */ js.Array[Action], Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRefreshDimensions(key: beforeRefreshDimensions): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRefreshDimensions(
      key: beforeRefreshDimensions,
      callback: js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* actionPossible */ Boolean, 
          Boolean | Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRemoveCellClassNames(key: beforeRemoveCellClassNames): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRemoveCellClassNames(key: beforeRemoveCellClassNames, callback: js.Function0[js.Array[String] | Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRemoveCellMeta(key: beforeRemoveCellMeta): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRemoveCol(key: beforeRemoveCol): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRemoveCol(
      key: beforeRemoveCol,
      callback: js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRemoveRow(key: beforeRemoveRow): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRemoveRow(
      key: beforeRemoveRow,
      callback: js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRender(key: beforeRender): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRender(key: beforeRender, callback: js.Function1[/* isForced */ Boolean, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRenderer(key: beforeRenderer): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRenderer(
      key: beforeRenderer,
      callback: js.Function6[
          /* TD */ HTMLTableCellElement, 
          /* row */ Double, 
          /* column */ Double, 
          /* prop */ String | Double, 
          /* value */ CellValue, 
          /* cellProperties */ CellProperties, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRowMove(key: beforeRowMove): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRowMove(
      key: beforeRowMove,
      callback: js.Function4[
          /* movedRows */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ js.UndefOr[Double], 
          /* movePossible */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRowResize(key: beforeRowResize): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeRowResize(
      key: beforeRowResize,
      callback: js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeSetCellMeta(key: beforeSetCellMeta): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeSetRangeEnd(key: beforeSetRangeEnd): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.Function1[
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeSetRangeStart(key: beforeSetRangeStart): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.Function1[
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeSetRangeStartOnly(key: beforeSetRangeStartOnly): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.Function1[
          /* coords */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeStretchingColumnWidth(key: beforeStretchingColumnWidth): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeTouchScroll(key: beforeTouchScroll): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeTouchScroll(key: beforeTouchScroll, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeTrimRow(key: beforeTrimRow): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeTrimRow(
      key: beforeTrimRow,
      callback: js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUndo(key: beforeUndo): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUndo(key: beforeUndo, callback: js.Function1[/* action */ Action, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUndoStackChange(key: beforeUndoStackChange): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUnhideColumns(key: beforeUnhideColumns): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUnhideColumns(
      key: beforeUnhideColumns,
      callback: js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUnhideRows(key: beforeUnhideRows): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUnhideRows(
      key: beforeUnhideRows,
      callback: js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUnmergeCells(key: beforeUnmergeCells): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.Function2[
          /* cellRange */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
          /* auto */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUntrimRow(key: beforeUntrimRow): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUntrimRow(
      key: beforeUntrimRow,
      callback: js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit | Boolean
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUpdateData(key: beforeUpdateData): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeUpdateData(
      key: beforeUpdateData,
      callback: js.Function3[
          /* sourceData */ js.Array[CellValue], 
          /* initialLoad */ Boolean, 
          /* source */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeValidate(key: beforeValidate): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeValidate(
      key: beforeValidate,
      callback: js.Function4[
          /* value */ CellValue, 
          /* row */ Double, 
          /* prop */ String | Double, 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeValueRender(key: beforeValueRender): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeValueRender(
      key: beforeValueRender,
      callback: js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeViewRender(key: beforeViewRender): Unit = js.native
    @JSName("removeHook")
    def removeHook_beforeViewRender(
      key: beforeViewRender,
      callback: js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_construct(key: construct): Unit = js.native
    @JSName("removeHook")
    def removeHook_construct(key: construct, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_init(key: init): Unit = js.native
    @JSName("removeHook")
    def removeHook_init(key: init, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyAutoColumnSizeSeed(key: modifyAutoColumnSizeSeed): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyAutoColumnSizeSeed(
      key: modifyAutoColumnSizeSeed,
      callback: js.Function3[
          /* seed */ String, 
          /* cellProperties */ CellProperties, 
          /* cellValue */ CellValue, 
          String | Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyAutofillRange(key: modifyAutofillRange): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyAutofillRange(
      key: modifyAutofillRange,
      callback: js.Function2[
          /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyColHeader(key: modifyColHeader): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyColHeader(key: modifyColHeader, callback: js.Function1[/* column */ Double, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyColWidth(key: modifyColWidth): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyColWidth(key: modifyColWidth, callback: js.Function2[/* width */ Double, /* column */ Double, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.Function0[Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyCopyableRange(key: modifyCopyableRange): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyCopyableRange(key: modifyCopyableRange, callback: js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyData(key: modifyData): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyGetCellCoords(key: modifyGetCellCoords): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyGetCellCoords(
      key: modifyGetCellCoords,
      callback: js.Function3[
          /* row */ Double, 
          /* column */ Double, 
          /* topmost */ Boolean, 
          Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyRowData(key: modifyRowData): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyRowData(key: modifyRowData, callback: js.Function1[/* row */ Double, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyRowHeader(key: modifyRowHeader): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyRowHeader(key: modifyRowHeader, callback: js.Function1[/* row */ Double, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyRowHeaderWidth(key: modifyRowHeaderWidth): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyRowHeaderWidth(key: modifyRowHeaderWidth, callback: js.Function1[/* rowHeaderWidth */ Double, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyRowHeight(key: modifyRowHeight): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyRowHeight(key: modifyRowHeight, callback: js.Function2[/* height */ Double, /* row */ Double, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifySourceData(key: modifySourceData): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyTransformEnd(key: modifyTransformEnd): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.Function1[
          /* delta */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyTransformStart(key: modifyTransformStart): Unit = js.native
    @JSName("removeHook")
    def removeHook_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.Function1[
          /* delta */ typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
          Unit
        ]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_persistentStateLoad(key: persistentStateLoad): Unit = js.native
    @JSName("removeHook")
    def removeHook_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]
    ): Unit = js.native
    @JSName("removeHook")
    def removeHook_persistentStateReset(key: persistentStateReset): Unit = js.native
    @JSName("removeHook")
    def removeHook_persistentStateReset(key: persistentStateReset, callback: js.Function1[/* key */ String, Unit]): Unit = js.native
    @JSName("removeHook")
    def removeHook_persistentStateSave(key: persistentStateSave): Unit = js.native
    @JSName("removeHook")
    def removeHook_persistentStateSave(key: persistentStateSave, callback: js.Function2[/* key */ String, /* value */ Any, Unit]): Unit = js.native
    
    def render(): Unit = js.native
    
    var renderCall: Boolean = js.native
    
    def resumeExecution(): Unit = js.native
    
    def resumeRender(): Unit = js.native
    
    var rootDocument: Document = js.native
    
    var rootElement: HTMLElement = js.native
    
    var rootWindow: Window = js.native
    
    var rowIndexMapper: IndexMapper = js.native
    
    def runHooks(
      key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179, starting with typingsJapgolly.handsontable.handsontableStrings.afterAddChild, typingsJapgolly.handsontable.handsontableStrings.afterAutofill, typingsJapgolly.handsontable.handsontableStrings.afterBeginEditing */ Any,
      p1: js.UndefOr[Any],
      p2: js.UndefOr[Any],
      p3: js.UndefOr[Any],
      p4: js.UndefOr[Any],
      p5: js.UndefOr[Any],
      p6: js.UndefOr[Any]
    ): Any = js.native
    
    def scrollViewportTo(): Boolean = js.native
    def scrollViewportTo(row: Double): Boolean = js.native
    def scrollViewportTo(row: Double, column: Double): Boolean = js.native
    def scrollViewportTo(row: Double, column: Double, snapToBottom: Boolean): Boolean = js.native
    def scrollViewportTo(row: Double, column: Double, snapToBottom: Boolean, snapToRight: Boolean): Boolean = js.native
    def scrollViewportTo(
      row: Double,
      column: Double,
      snapToBottom: Boolean,
      snapToRight: Boolean,
      considerHiddenIndexes: Boolean
    ): Boolean = js.native
    def scrollViewportTo(
      row: Double,
      column: Double,
      snapToBottom: Boolean,
      snapToRight: Unit,
      considerHiddenIndexes: Boolean
    ): Boolean = js.native
    def scrollViewportTo(row: Double, column: Double, snapToBottom: Unit, snapToRight: Boolean): Boolean = js.native
    def scrollViewportTo(
      row: Double,
      column: Double,
      snapToBottom: Unit,
      snapToRight: Boolean,
      considerHiddenIndexes: Boolean
    ): Boolean = js.native
    def scrollViewportTo(row: Double, column: Double, snapToBottom: Unit, snapToRight: Unit, considerHiddenIndexes: Boolean): Boolean = js.native
    def scrollViewportTo(row: Double, column: Unit, snapToBottom: Boolean): Boolean = js.native
    def scrollViewportTo(row: Double, column: Unit, snapToBottom: Boolean, snapToRight: Boolean): Boolean = js.native
    def scrollViewportTo(
      row: Double,
      column: Unit,
      snapToBottom: Boolean,
      snapToRight: Boolean,
      considerHiddenIndexes: Boolean
    ): Boolean = js.native
    def scrollViewportTo(
      row: Double,
      column: Unit,
      snapToBottom: Boolean,
      snapToRight: Unit,
      considerHiddenIndexes: Boolean
    ): Boolean = js.native
    def scrollViewportTo(row: Double, column: Unit, snapToBottom: Unit, snapToRight: Boolean): Boolean = js.native
    def scrollViewportTo(
      row: Double,
      column: Unit,
      snapToBottom: Unit,
      snapToRight: Boolean,
      considerHiddenIndexes: Boolean
    ): Boolean = js.native
    def scrollViewportTo(row: Double, column: Unit, snapToBottom: Unit, snapToRight: Unit, considerHiddenIndexes: Boolean): Boolean = js.native
    def scrollViewportTo(row: Unit, column: Double): Boolean = js.native
    def scrollViewportTo(row: Unit, column: Double, snapToBottom: Boolean): Boolean = js.native
    def scrollViewportTo(row: Unit, column: Double, snapToBottom: Boolean, snapToRight: Boolean): Boolean = js.native
    def scrollViewportTo(
      row: Unit,
      column: Double,
      snapToBottom: Boolean,
      snapToRight: Boolean,
      considerHiddenIndexes: Boolean
    ): Boolean = js.native
    def scrollViewportTo(
      row: Unit,
      column: Double,
      snapToBottom: Boolean,
      snapToRight: Unit,
      considerHiddenIndexes: Boolean
    ): Boolean = js.native
    def scrollViewportTo(row: Unit, column: Double, snapToBottom: Unit, snapToRight: Boolean): Boolean = js.native
    def scrollViewportTo(
      row: Unit,
      column: Double,
      snapToBottom: Unit,
      snapToRight: Boolean,
      considerHiddenIndexes: Boolean
    ): Boolean = js.native
    def scrollViewportTo(row: Unit, column: Double, snapToBottom: Unit, snapToRight: Unit, considerHiddenIndexes: Boolean): Boolean = js.native
    def scrollViewportTo(row: Unit, column: Unit, snapToBottom: Boolean): Boolean = js.native
    def scrollViewportTo(row: Unit, column: Unit, snapToBottom: Boolean, snapToRight: Boolean): Boolean = js.native
    def scrollViewportTo(
      row: Unit,
      column: Unit,
      snapToBottom: Boolean,
      snapToRight: Boolean,
      considerHiddenIndexes: Boolean
    ): Boolean = js.native
    def scrollViewportTo(row: Unit, column: Unit, snapToBottom: Boolean, snapToRight: Unit, considerHiddenIndexes: Boolean): Boolean = js.native
    def scrollViewportTo(row: Unit, column: Unit, snapToBottom: Unit, snapToRight: Boolean): Boolean = js.native
    def scrollViewportTo(row: Unit, column: Unit, snapToBottom: Unit, snapToRight: Boolean, considerHiddenIndexes: Boolean): Boolean = js.native
    def scrollViewportTo(row: Unit, column: Unit, snapToBottom: Unit, snapToRight: Unit, considerHiddenIndexes: Boolean): Boolean = js.native
    
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
    def selectCell(
      row: Double,
      col: Double,
      endRow: Double,
      endCol: Double,
      scrollToCell: Unit,
      changeListener: Boolean
    ): Boolean = js.native
    def selectCell(row: Double, col: Double, endRow: Double, endCol: Unit, scrollToCell: Boolean): Boolean = js.native
    def selectCell(
      row: Double,
      col: Double,
      endRow: Double,
      endCol: Unit,
      scrollToCell: Boolean,
      changeListener: Boolean
    ): Boolean = js.native
    def selectCell(
      row: Double,
      col: Double,
      endRow: Double,
      endCol: Unit,
      scrollToCell: Unit,
      changeListener: Boolean
    ): Boolean = js.native
    def selectCell(row: Double, col: Double, endRow: Unit, endCol: Double): Boolean = js.native
    def selectCell(row: Double, col: Double, endRow: Unit, endCol: Double, scrollToCell: Boolean): Boolean = js.native
    def selectCell(
      row: Double,
      col: Double,
      endRow: Unit,
      endCol: Double,
      scrollToCell: Boolean,
      changeListener: Boolean
    ): Boolean = js.native
    def selectCell(
      row: Double,
      col: Double,
      endRow: Unit,
      endCol: Double,
      scrollToCell: Unit,
      changeListener: Boolean
    ): Boolean = js.native
    def selectCell(row: Double, col: Double, endRow: Unit, endCol: Unit, scrollToCell: Boolean): Boolean = js.native
    def selectCell(
      row: Double,
      col: Double,
      endRow: Unit,
      endCol: Unit,
      scrollToCell: Boolean,
      changeListener: Boolean
    ): Boolean = js.native
    def selectCell(row: Double, col: Double, endRow: Unit, endCol: Unit, scrollToCell: Unit, changeListener: Boolean): Boolean = js.native
    
    def selectCellByProp(row: Double, prop: String): Boolean = js.native
    def selectCellByProp(row: Double, prop: String, endRow: Double): Boolean = js.native
    def selectCellByProp(row: Double, prop: String, endRow: Double, endProp: String): Boolean = js.native
    def selectCellByProp(row: Double, prop: String, endRow: Double, endProp: String, scrollToCell: Boolean): Boolean = js.native
    def selectCellByProp(row: Double, prop: String, endRow: Double, endProp: Unit, scrollToCell: Boolean): Boolean = js.native
    def selectCellByProp(row: Double, prop: String, endRow: Unit, endProp: String): Boolean = js.native
    def selectCellByProp(row: Double, prop: String, endRow: Unit, endProp: String, scrollToCell: Boolean): Boolean = js.native
    def selectCellByProp(row: Double, prop: String, endRow: Unit, endProp: Unit, scrollToCell: Boolean): Boolean = js.native
    
    def selectCells(
      coords: js.Array[
          (js.Tuple4[Double, Double | String, Double, Double | String]) | typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default
        ]
    ): Boolean = js.native
    def selectCells(
      coords: js.Array[
          (js.Tuple4[Double, Double | String, Double, Double | String]) | typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default
        ],
      scrollToCell: Boolean
    ): Boolean = js.native
    def selectCells(
      coords: js.Array[
          (js.Tuple4[Double, Double | String, Double, Double | String]) | typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default
        ],
      scrollToCell: Boolean,
      changeListener: Boolean
    ): Boolean = js.native
    def selectCells(
      coords: js.Array[
          (js.Tuple4[Double, Double | String, Double, Double | String]) | typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default
        ],
      scrollToCell: Unit,
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
    
    def setCellMeta(row: Double, col: Double, key: String, `val`: Any): Unit = js.native
    
    def setCellMetaObject(row: Double, col: Double, prop: CellMeta): Unit = js.native
    
    @JSName("setCellMeta")
    def setCellMeta_comment(row: Double, col: Double, key: comment): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_comment(row: Double, col: Double, key: comment, `val`: CommentObject): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_data(row: Double, col: Double, key: data): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_data(row: Double, col: Double, key: data, `val`: String): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_data(row: Double, col: Double, key: data, `val`: Double): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_data(row: Double, col: Double, key: data, `val`: ColumnDataGetterSetterFunction): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_hidden(row: Double, col: Double, key: hidden): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_hidden(row: Double, col: Double, key: hidden, `val`: Boolean): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_isSearchResult(row: Double, col: Double, key: isSearchResult): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_isSearchResult(row: Double, col: Double, key: isSearchResult, `val`: Boolean): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_skipRowOnPaste(row: Double, col: Double, key: skipRowOnPaste): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_skipRowOnPaste(row: Double, col: Double, key: skipRowOnPaste, `val`: Boolean): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_valid(row: Double, col: Double, key: valid): Unit = js.native
    @JSName("setCellMeta")
    def setCellMeta_valid(row: Double, col: Double, key: valid, `val`: Boolean): Unit = js.native
    
    def setDataAtCell(changes: js.Array[js.Tuple3[Double, Double, CellValue]]): Unit = js.native
    def setDataAtCell(changes: js.Array[js.Tuple3[Double, Double, CellValue]], source: String): Unit = js.native
    def setDataAtCell(row: Double, col: Double, value: CellValue): Unit = js.native
    def setDataAtCell(row: Double, col: Double, value: CellValue, source: String): Unit = js.native
    
    def setDataAtRowProp(changes: js.Array[js.Tuple3[Double, String | Double, CellValue]]): Unit = js.native
    def setDataAtRowProp(changes: js.Array[js.Tuple3[Double, String | Double, CellValue]], source: String): Unit = js.native
    def setDataAtRowProp(row: Double, prop: String, value: CellValue): Unit = js.native
    def setDataAtRowProp(row: Double, prop: String, value: CellValue, source: String): Unit = js.native
    
    def setSourceDataAtCell(changes: js.Array[js.Tuple3[Double, String | Double, CellValue]]): Unit = js.native
    def setSourceDataAtCell(changes: js.Array[js.Tuple3[Double, String | Double, CellValue]], source: String): Unit = js.native
    def setSourceDataAtCell(row: Double, column: String, value: CellValue): Unit = js.native
    def setSourceDataAtCell(row: Double, column: String, value: CellValue, source: String): Unit = js.native
    def setSourceDataAtCell(row: Double, column: Double, value: CellValue): Unit = js.native
    def setSourceDataAtCell(row: Double, column: Double, value: CellValue, source: String): Unit = js.native
    
    def spliceCol(col: Double, index: Double, amount: Double, elements: CellValue*): Unit = js.native
    
    def spliceRow(row: Double, index: Double, amount: Double, elements: CellValue*): Unit = js.native
    
    def suspendExecution(): Unit = js.native
    
    def suspendRender(): Unit = js.native
    
    var table: HTMLTableElement = js.native
    
    def toHTML(): String = js.native
    
    def toPhysicalColumn(column: Double): Double = js.native
    
    def toPhysicalRow(row: Double): Double = js.native
    
    def toTableElement(): HTMLTableElement = js.native
    
    def toVisualColumn(column: Double): Double = js.native
    
    def toVisualRow(row: Double): Double = js.native
    
    def undo(): Unit = js.native
    
    def unlisten(): Unit = js.native
    
    def updateData(data: js.Array[js.Array[CellValue] | RowObject]): Unit = js.native
    def updateData(data: js.Array[js.Array[CellValue] | RowObject], source: String): Unit = js.native
    
    def updateSettings(settings: GridSettings): Unit = js.native
    def updateSettings(settings: GridSettings, init: Boolean): Unit = js.native
    
    def validateCell(
      value: Any,
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
