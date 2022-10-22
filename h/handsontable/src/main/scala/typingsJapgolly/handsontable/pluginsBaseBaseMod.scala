package typingsJapgolly.handsontable

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.HTMLTableCellElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCalculatorViewportColumnsMod`.ViewportColumnsCalculator
import typingsJapgolly.handsontable.anon.SkipRender
import typingsJapgolly.handsontable.anon.Value
import typingsJapgolly.handsontable.anon.ValueAny
import typingsJapgolly.handsontable.anon.ValueCellValue
import typingsJapgolly.handsontable.commonMod.CellChange
import typingsJapgolly.handsontable.commonMod.CellValue
import typingsJapgolly.handsontable.commonMod.ChangeSource
import typingsJapgolly.handsontable.commonMod.RangeType
import typingsJapgolly.handsontable.commonMod.RowObject
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.handsontableInts.`-1`
import typingsJapgolly.handsontable.handsontableInts.`0`
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
import typingsJapgolly.handsontable.handsontableStrings.construct
import typingsJapgolly.handsontable.handsontableStrings.current
import typingsJapgolly.handsontable.handsontableStrings.down
import typingsJapgolly.handsontable.handsontableStrings.get
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
import typingsJapgolly.handsontable.handsontableStrings.left
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
import typingsJapgolly.handsontable.handsontableStrings.persistentStateLoad
import typingsJapgolly.handsontable.handsontableStrings.persistentStateReset
import typingsJapgolly.handsontable.handsontableStrings.persistentStateSave
import typingsJapgolly.handsontable.handsontableStrings.right
import typingsJapgolly.handsontable.handsontableStrings.set
import typingsJapgolly.handsontable.handsontableStrings.up
import typingsJapgolly.handsontable.handsontableStrings.vertical
import typingsJapgolly.handsontable.pluginHooksMod.HookHighlightColumnHeaderMeta
import typingsJapgolly.handsontable.pluginHooksMod.HookHighlightRowHeaderMeta
import typingsJapgolly.handsontable.pluginsColumnSortingColumnSortingMod.Config
import typingsJapgolly.handsontable.pluginsContextMenuContextMenuMod.MenuItemConfig
import typingsJapgolly.handsontable.pluginsContextMenuContextMenuMod.PredefinedMenuItemKey
import typingsJapgolly.handsontable.pluginsContextMenuMod.ContextMenu
import typingsJapgolly.handsontable.pluginsDropdownMenuMod.DropdownMenu
import typingsJapgolly.handsontable.pluginsFiltersFiltersMod.ColumnConditions
import typingsJapgolly.handsontable.pluginsMergeCellsMergeCellsMod.Settings
import typingsJapgolly.handsontable.pluginsUndoRedoUndoRedoMod.Action
import typingsJapgolly.handsontable.selectionMod.SelectionController
import typingsJapgolly.handsontable.settingsMod.CellProperties
import typingsJapgolly.handsontable.settingsMod.GridSettings
import typingsJapgolly.std.HTMLTableHeaderCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsBaseBaseMod {
  
  @JSImport("handsontable/plugins/base/base", "BasePlugin")
  @js.native
  open class BasePlugin protected () extends StObject {
    def this(hotInstance: default) = this()
    
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
    
    def callOnPluginsReady(callback: js.Function0[Unit]): Unit = js.native
    
    def clearHooks(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def disablePlugin(): Unit = js.native
    
    def enablePlugin(): Unit = js.native
    
    var enabled: Boolean = js.native
    
    val hot: default = js.native
    
    def init(): Unit = js.native
    
    var initialized: Boolean = js.native
    
    var isPluginsReady: Boolean = js.native
    
    var pluginName: String = js.native
    
    var pluginsInitializedCallbacks: js.Array[String] = js.native
    
    def removeHooks(
      name: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179, starting with typingsJapgolly.handsontable.handsontableStrings.afterAddChild, typingsJapgolly.handsontable.handsontableStrings.afterAutofill, typingsJapgolly.handsontable.handsontableStrings.afterBeginEditing */ Any
    ): Unit = js.native
    
    def updatePlugin(): Unit = js.native
  }
}
