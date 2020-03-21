package typingsJapgolly.handsontable.mod.Handsontable.Hooks

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.HTMLTableCellElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.handsontable.AnonSkipRender
import typingsJapgolly.handsontable.AnonValue
import typingsJapgolly.handsontable.AnonValueAny
import typingsJapgolly.handsontable.AnonValueCellValue
import typingsJapgolly.handsontable.handsontableNumbers.`-1`
import typingsJapgolly.handsontable.handsontableNumbers.`0`
import typingsJapgolly.handsontable.handsontableStrings.area
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
import typingsJapgolly.handsontable.handsontableStrings.left
import typingsJapgolly.handsontable.handsontableStrings.right
import typingsJapgolly.handsontable.handsontableStrings.set
import typingsJapgolly.handsontable.handsontableStrings.up
import typingsJapgolly.handsontable.handsontableStrings.vertical
import typingsJapgolly.handsontable.mod.Handsontable.CellChange
import typingsJapgolly.handsontable.mod.Handsontable.CellProperties
import typingsJapgolly.handsontable.mod.Handsontable.CellValue
import typingsJapgolly.handsontable.mod.Handsontable.ChangeSource
import typingsJapgolly.handsontable.mod.Handsontable.GridSettings
import typingsJapgolly.handsontable.mod.Handsontable.RowObject
import typingsJapgolly.handsontable.mod.Handsontable.SelectionController
import typingsJapgolly.handsontable.mod.Handsontable.ViewportColumnsCalculator
import typingsJapgolly.handsontable.mod.Handsontable.columnSorting.Config
import typingsJapgolly.handsontable.mod.Handsontable.contextMenu.MenuItemConfig
import typingsJapgolly.handsontable.mod.Handsontable.contextMenu.PredefinedMenuItemKey
import typingsJapgolly.handsontable.mod.Handsontable.mergeCells.Settings
import typingsJapgolly.handsontable.mod.Handsontable.plugins.ContextMenu
import typingsJapgolly.handsontable.mod.Handsontable.plugins.DropdownMenu
import typingsJapgolly.handsontable.mod.Handsontable.plugins.FiltersPlugin.ColumnConditions
import typingsJapgolly.handsontable.mod.Handsontable.plugins.RangeType
import typingsJapgolly.handsontable.mod.Handsontable.plugins.UndoRedoAction
import typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords
import typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange
import typingsJapgolly.std.HTMLTableHeaderCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  var afterAddChild: js.UndefOr[
    js.Function3[
      /* parent */ RowObject, 
      /* element */ RowObject | Unit, 
      /* index */ Double | Unit, 
      Unit
    ]
  ] = js.undefined
  var afterBeginEditing: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
  var afterCellMetaReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterChange: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
  ] = js.undefined
  var afterChangesObserved: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterColumnMove: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]] = js.undefined
  var afterColumnResize: js.UndefOr[
    js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
  ] = js.undefined
  var afterColumnSort: js.UndefOr[
    js.Function2[
      /* currentSortConfig */ js.Array[Config], 
      /* destinationSortConfigs */ js.Array[Config], 
      Unit
    ]
  ] = js.undefined
  var afterContextMenuDefaultOptions: js.UndefOr[
    js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
  ] = js.undefined
  var afterContextMenuHide: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]] = js.undefined
  var afterContextMenuShow: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]] = js.undefined
  var afterCopy: js.UndefOr[
    js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
  ] = js.undefined
  var afterCopyLimit: js.UndefOr[
    js.Function4[
      /* selectedRows */ Double, 
      /* selectedColumnds */ Double, 
      /* copyRowsLimit */ Double, 
      /* copyColumnsLimit */ Double, 
      Unit
    ]
  ] = js.undefined
  var afterCreateCol: js.UndefOr[
    js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.undefined
  var afterCreateRow: js.UndefOr[
    js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.undefined
  var afterCut: js.UndefOr[
    js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
  ] = js.undefined
  var afterDeselect: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterDetachChild: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]] = js.undefined
  var afterDocumentKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  var afterDrawSelection: js.UndefOr[
    js.Function4[
      /* currentRow */ Double, 
      /* currentColumn */ Double, 
      /* cornersOfSelection */ js.Array[Double], 
      /* layerLevel */ Double | Unit, 
      String | Unit
    ]
  ] = js.undefined
  var afterDropdownMenuDefaultOptions: js.UndefOr[
    js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
  ] = js.undefined
  var afterDropdownMenuHide: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.undefined
  var afterDropdownMenuShow: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.undefined
  var afterFilter: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]] = js.undefined
  var afterGetCellMeta: js.UndefOr[
    js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
  ] = js.undefined
  var afterGetColHeader: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] = js.undefined
  var afterGetColumnHeaderRenderers: js.UndefOr[
    js.Function1[
      /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
      Unit
    ]
  ] = js.undefined
  var afterGetRowHeader: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] = js.undefined
  var afterGetRowHeaderRenderers: js.UndefOr[
    js.Function1[
      /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
      Unit
    ]
  ] = js.undefined
  var afterHideColumns: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var afterHideRows: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var afterInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterLanguageChange: js.UndefOr[js.Function1[/* languageCode */ String, Unit]] = js.undefined
  var afterListen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterLoadData: js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]] = js.undefined
  var afterMergeCells: js.UndefOr[
    js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
  ] = js.undefined
  var afterModifyTransformEnd: js.UndefOr[
    js.Function3[
      /* coords */ CellCoords, 
      /* rowTransformDir */ `-1` | `0`, 
      /* colTransformDir */ `-1` | `0`, 
      Unit
    ]
  ] = js.undefined
  var afterModifyTransformStart: js.UndefOr[
    js.Function3[
      /* coords */ CellCoords, 
      /* rowTransformDir */ `-1` | `0`, 
      /* colTransformDir */ `-1` | `0`, 
      Unit
    ]
  ] = js.undefined
  var afterMomentumScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterOnCellContextMenu: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var afterOnCellCornerDblClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var afterOnCellCornerMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var afterOnCellMouseDown: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var afterOnCellMouseOut: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var afterOnCellMouseOver: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var afterOnCellMouseUp: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var afterPaste: js.UndefOr[
    js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
  ] = js.undefined
  var afterPluginsInitialized: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterRedo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.undefined
  var afterRefreshDimensions: js.UndefOr[
    js.Function3[
      /* previousDimensions */ js.Object, 
      /* currentDimensions */ js.Object, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var afterRemoveCellMeta: js.UndefOr[
    js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
  ] = js.undefined
  var afterRemoveCol: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* amount */ Double, 
      /* physicalColumns */ js.Array[Double], 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.undefined
  var afterRemoveRow: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* amount */ Double, 
      /* physicalColumns */ js.Array[Double], 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.undefined
  var afterRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.undefined
  var afterRenderer: js.UndefOr[
    js.Function6[
      /* TD */ HTMLTableCellElement, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* value */ String, 
      /* cellProperties */ CellProperties, 
      Unit
    ]
  ] = js.undefined
  var afterRowMove: js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]] = js.undefined
  var afterRowResize: js.UndefOr[
    js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
  ] = js.undefined
  var afterScrollHorizontally: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterScrollVertically: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterSelection: js.UndefOr[
    js.Function6[
      /* row */ Double, 
      /* column */ Double, 
      /* row2 */ Double, 
      /* column2 */ Double, 
      /* preventScrolling */ AnonValue, 
      /* selectionLayerLevel */ Double, 
      Unit
    ]
  ] = js.undefined
  var afterSelectionByProp: js.UndefOr[
    js.Function6[
      /* row */ Double, 
      /* prop */ String, 
      /* row2 */ Double, 
      /* prop2 */ String, 
      /* preventScrolling */ AnonValue, 
      /* selectionLayerLevel */ Double, 
      Unit
    ]
  ] = js.undefined
  var afterSelectionEnd: js.UndefOr[
    js.Function5[
      /* row */ Double, 
      /* column */ Double, 
      /* row2 */ Double, 
      /* column2 */ Double, 
      /* selectionLayerLevel */ Double, 
      Unit
    ]
  ] = js.undefined
  var afterSelectionEndByProp: js.UndefOr[
    js.Function5[
      /* row */ Double, 
      /* prop */ String, 
      /* row2 */ Double, 
      /* prop2 */ String, 
      /* selectionLayerLevel */ Double, 
      Unit
    ]
  ] = js.undefined
  var afterSetCellMeta: js.UndefOr[
    js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Unit]
  ] = js.undefined
  var afterSetDataAtCell: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.undefined
  var afterSetDataAtRowProp: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.undefined
  var afterTrimRow: js.UndefOr[
    js.Function4[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var afterUndo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.undefined
  var afterUnhideColumns: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var afterUnhideRows: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var afterUnlisten: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterUnmergeCells: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]] = js.undefined
  var afterUntrimRow: js.UndefOr[
    js.Function4[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var afterUpdateSettings: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]] = js.undefined
  var afterValidate: js.UndefOr[
    js.Function5[
      /* isValid */ Boolean, 
      /* value */ CellValue, 
      /* row */ Double, 
      /* prop */ String | Double, 
      /* source */ ChangeSource, 
      Unit | Boolean
    ]
  ] = js.undefined
  var afterViewportColumnCalculatorOverride: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]] = js.undefined
  var afterViewportRowCalculatorOverride: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]] = js.undefined
  var beforeAddChild: js.UndefOr[
    js.Function3[
      /* parent */ RowObject, 
      /* element */ RowObject | Unit, 
      /* index */ Double | Unit, 
      Unit
    ]
  ] = js.undefined
  var beforeAutofill: js.UndefOr[
    js.Function3[
      /* start */ CellCoords, 
      /* end */ CellCoords, 
      /* data */ js.Array[js.Array[CellValue]], 
      Unit
    ]
  ] = js.undefined
  var beforeAutofillInsidePopulate: js.UndefOr[
    js.Function4[
      /* index */ CellCoords, 
      /* direction */ up | down | left | right, 
      /* input */ js.Array[js.Array[CellValue]], 
      /* deltas */ js.Array[_], 
      Unit
    ]
  ] = js.undefined
  var beforeCellAlignment: js.UndefOr[
    js.Function4[
      /* stateBefore */ NumberDictionary[js.Array[String]], 
      /* range */ js.Array[CellRange], 
      /* type */ horizontal | vertical, 
      /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
      Unit
    ]
  ] = js.undefined
  var beforeChange: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
  ] = js.undefined
  var beforeChangeRender: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
  ] = js.undefined
  var beforeColumnMove: js.UndefOr[
    js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
  ] = js.undefined
  var beforeColumnResize: js.UndefOr[
    js.Function3[
      /* currentColumn */ Double, 
      /* newSize */ Double, 
      /* isDoubleClick */ Boolean, 
      Unit | Double
    ]
  ] = js.undefined
  var beforeColumnSort: js.UndefOr[
    js.Function2[
      /* currentSortConfig */ js.Array[Config], 
      /* destinationSortConfigs */ js.Array[Config], 
      Unit | Boolean
    ]
  ] = js.undefined
  var beforeContextMenuSetItems: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]] = js.undefined
  var beforeContextMenuShow: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]] = js.undefined
  var beforeCopy: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[CellValue]], 
      /* coords */ js.Array[RangeType], 
      Unit | Boolean
    ]
  ] = js.undefined
  var beforeCreateCol: js.UndefOr[
    js.Function3[
      /* index */ Double, 
      /* amount */ Double, 
      /* source */ js.UndefOr[ChangeSource], 
      Unit | Boolean
    ]
  ] = js.undefined
  var beforeCreateRow: js.UndefOr[
    js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.undefined
  var beforeCut: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[CellValue]], 
      /* coords */ js.Array[RangeType], 
      Unit | Boolean
    ]
  ] = js.undefined
  var beforeDetachChild: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]] = js.undefined
  var beforeDrawBorders: js.UndefOr[
    js.Function2[
      /* corners */ js.Array[Double], 
      /* borderClassName */ js.UndefOr[current | area | highlight], 
      Unit
    ]
  ] = js.undefined
  var beforeDropdownMenuSetItems: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]] = js.undefined
  var beforeDropdownMenuShow: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.undefined
  var beforeFilter: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]] = js.undefined
  var beforeGetCellMeta: js.UndefOr[
    js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
  ] = js.undefined
  var beforeHideColumns: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var beforeHideRows: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var beforeInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeInitWalkontable: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]] = js.undefined
  var beforeKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  var beforeLanguageChange: js.UndefOr[js.Function1[/* languageCode */ String, Unit]] = js.undefined
  var beforeMergeCells: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]] = js.undefined
  var beforeOnCellContextMenu: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var beforeOnCellMouseDown: js.UndefOr[
    js.Function4[
      /* event */ MouseEvent, 
      /* coords */ CellCoords, 
      /* TD */ HTMLTableCellElement, 
      /* controller */ SelectionController, 
      Unit
    ]
  ] = js.undefined
  var beforeOnCellMouseOut: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var beforeOnCellMouseOver: js.UndefOr[
    js.Function4[
      /* event */ MouseEvent, 
      /* coords */ CellCoords, 
      /* TD */ HTMLTableCellElement, 
      /* controller */ SelectionController, 
      Unit
    ]
  ] = js.undefined
  var beforeOnCellMouseUp: js.UndefOr[
    js.Function4[
      /* event */ MouseEvent, 
      /* coords */ CellCoords, 
      /* TD */ HTMLTableCellElement, 
      /* controller */ SelectionController, 
      Unit
    ]
  ] = js.undefined
  var beforePaste: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[CellValue]], 
      /* coords */ js.Array[RangeType], 
      Unit | Boolean
    ]
  ] = js.undefined
  var beforeRedo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.undefined
  var beforeRefreshDimensions: js.UndefOr[
    js.Function3[
      /* previousDimensions */ js.Object, 
      /* currentDimensions */ js.Object, 
      /* actionPossible */ Boolean, 
      Boolean | Unit
    ]
  ] = js.undefined
  var beforeRemoveCellClassNames: js.UndefOr[js.Function0[js.Array[String] | Unit]] = js.undefined
  var beforeRemoveCellMeta: js.UndefOr[
    js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
  ] = js.undefined
  var beforeRemoveCol: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* amount */ Double, 
      /* physicalColumns */ js.Array[Double], 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.undefined
  var beforeRemoveRow: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* amount */ Double, 
      /* physicalColumns */ js.Array[Double], 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.undefined
  var beforeRender: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ AnonSkipRender, Unit]] = js.undefined
  var beforeRenderer: js.UndefOr[
    js.Function6[
      /* TD */ HTMLTableCellElement, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* value */ CellValue, 
      /* cellProperties */ CellProperties, 
      Unit
    ]
  ] = js.undefined
  var beforeRowMove: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]] = js.undefined
  var beforeRowResize: js.UndefOr[
    js.Function3[
      /* currentRow */ Double, 
      /* newSize */ Double, 
      /* isDoubleClick */ Boolean, 
      Double | Unit
    ]
  ] = js.undefined
  var beforeSetRangeEnd: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]] = js.undefined
  var beforeSetRangeStart: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]] = js.undefined
  var beforeSetRangeStartOnly: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]] = js.undefined
  var beforeStretchingColumnWidth: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]] = js.undefined
  var beforeTouchScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeTrimRow: js.UndefOr[
    js.Function3[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var beforeUndo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.undefined
  var beforeUnhideColumns: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var beforeUnhideRows: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var beforeUnmergeCells: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]] = js.undefined
  var beforeUntrimRow: js.UndefOr[
    js.Function3[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var beforeValidate: js.UndefOr[
    js.Function4[
      /* value */ CellValue, 
      /* row */ Double, 
      /* prop */ String | Double, 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.undefined
  var beforeValueRender: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]] = js.undefined
  var construct: js.UndefOr[js.Function0[Unit]] = js.undefined
  var hiddenColumn: js.UndefOr[js.Function1[/* column */ Double, Unit]] = js.undefined
  var hiddenRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  var modifyAutofillRange: js.UndefOr[
    js.Function2[
      /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
      /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
      Unit
    ]
  ] = js.undefined
  var modifyCol: js.UndefOr[js.Function1[/* col */ Double, Unit]] = js.undefined
  var modifyColHeader: js.UndefOr[js.Function1[/* column */ Double, Unit]] = js.undefined
  var modifyColWidth: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]] = js.undefined
  var modifyColumnHeaderHeight: js.UndefOr[js.Function0[Unit]] = js.undefined
  var modifyCopyableRange: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]] = js.undefined
  var modifyData: js.UndefOr[
    js.Function4[
      /* row */ Double, 
      /* column */ Double, 
      /* valueHolder */ AnonValueCellValue, 
      /* ioMode */ get | set, 
      Unit
    ]
  ] = js.undefined
  var modifyGetCellCoords: js.UndefOr[
    js.Function3[
      /* row */ Double, 
      /* column */ Double, 
      /* topmost */ Boolean, 
      Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ]
  ] = js.undefined
  var modifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var modifyRowData: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var modifyRowHeader: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var modifyRowHeaderWidth: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]] = js.undefined
  var modifyRowHeight: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]] = js.undefined
  var modifyRowSourceData: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var modifyTransformEnd: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]] = js.undefined
  var modifyTransformStart: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]] = js.undefined
  var persistentStateLoad: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ AnonValueAny, Unit]] = js.undefined
  var persistentStateReset: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  var persistentStateSave: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]] = js.undefined
  var skipLengthCache: js.UndefOr[js.Function1[/* delay */ Double, Unit]] = js.undefined
  var unmodifyCol: js.UndefOr[js.Function1[/* col */ Double, Unit]] = js.undefined
  var unmodifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
}

object Events {
  @scala.inline
  def apply(
    afterAddChild: (/* parent */ RowObject, /* element */ RowObject | Unit, /* index */ Double | Unit) => Callback = null,
    afterBeginEditing: (/* row */ Double, /* column */ Double) => Callback = null,
    afterCellMetaReset: js.UndefOr[Callback] = js.undefined,
    afterChange: (/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource) => Callback = null,
    afterChangesObserved: js.UndefOr[Callback] = js.undefined,
    afterColumnMove: (/* columns */ js.Array[Double], /* target */ Double) => Callback = null,
    afterColumnResize: (/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Callback = null,
    afterColumnSort: (/* currentSortConfig */ js.Array[Config], /* destinationSortConfigs */ js.Array[Config]) => Callback = null,
    afterContextMenuDefaultOptions: /* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig] => Callback = null,
    afterContextMenuHide: /* context */ ContextMenu => Callback = null,
    afterContextMenuShow: /* context */ ContextMenu => Callback = null,
    afterCopy: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Callback = null,
    afterCopyLimit: (/* selectedRows */ Double, /* selectedColumnds */ Double, /* copyRowsLimit */ Double, /* copyColumnsLimit */ Double) => Callback = null,
    afterCreateCol: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Callback = null,
    afterCreateRow: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Callback = null,
    afterCut: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Callback = null,
    afterDeselect: js.UndefOr[Callback] = js.undefined,
    afterDestroy: js.UndefOr[Callback] = js.undefined,
    afterDetachChild: (/* parent */ RowObject, /* element */ RowObject) => Callback = null,
    afterDocumentKeyDown: /* event */ KeyboardEvent => Callback = null,
    afterDrawSelection: (/* currentRow */ Double, /* currentColumn */ Double, /* cornersOfSelection */ js.Array[Double], /* layerLevel */ Double | Unit) => CallbackTo[String | Unit] = null,
    afterDropdownMenuDefaultOptions: /* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig] => Callback = null,
    afterDropdownMenuHide: /* instance */ DropdownMenu => Callback = null,
    afterDropdownMenuShow: /* instance */ DropdownMenu => Callback = null,
    afterFilter: /* conditionsStack */ js.Array[ColumnConditions] => Callback = null,
    afterGetCellMeta: (/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties) => Callback = null,
    afterGetColHeader: (/* col */ Double, /* TH */ HTMLTableHeaderCellElement) => Callback = null,
    afterGetColumnHeaderRenderers: /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] => Callback = null,
    afterGetRowHeader: (/* row */ Double, /* TH */ HTMLTableHeaderCellElement) => Callback = null,
    afterGetRowHeaderRenderers: /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] => Callback = null,
    afterHideColumns: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Callback = null,
    afterHideRows: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Callback = null,
    afterInit: js.UndefOr[Callback] = js.undefined,
    afterLanguageChange: /* languageCode */ String => Callback = null,
    afterListen: js.UndefOr[Callback] = js.undefined,
    afterLoadData: /* initialLoad */ Boolean => Callback = null,
    afterMergeCells: (/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean) => Callback = null,
    afterModifyTransformEnd: (/* coords */ CellCoords, /* rowTransformDir */ `-1` | `0`, /* colTransformDir */ `-1` | `0`) => Callback = null,
    afterModifyTransformStart: (/* coords */ CellCoords, /* rowTransformDir */ `-1` | `0`, /* colTransformDir */ `-1` | `0`) => Callback = null,
    afterMomentumScroll: js.UndefOr[Callback] = js.undefined,
    afterOnCellContextMenu: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Callback = null,
    afterOnCellCornerDblClick: /* event */ MouseEvent => Callback = null,
    afterOnCellCornerMouseDown: /* event */ MouseEvent => Callback = null,
    afterOnCellMouseDown: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Callback = null,
    afterOnCellMouseOut: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Callback = null,
    afterOnCellMouseOver: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Callback = null,
    afterOnCellMouseUp: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Callback = null,
    afterPaste: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Callback = null,
    afterPluginsInitialized: js.UndefOr[Callback] = js.undefined,
    afterRedo: /* action */ UndoRedoAction => Callback = null,
    afterRefreshDimensions: (/* previousDimensions */ js.Object, /* currentDimensions */ js.Object, /* stateChanged */ Boolean) => Callback = null,
    afterRemoveCellMeta: (/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any) => Callback = null,
    afterRemoveCol: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Callback = null,
    afterRemoveRow: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Callback = null,
    afterRender: /* isForced */ Boolean => Callback = null,
    afterRenderer: (/* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ String, /* cellProperties */ CellProperties) => Callback = null,
    afterRowMove: (/* startRow */ Double, /* endRow */ Double) => Callback = null,
    afterRowResize: (/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Callback = null,
    afterScrollHorizontally: js.UndefOr[Callback] = js.undefined,
    afterScrollVertically: js.UndefOr[Callback] = js.undefined,
    afterSelection: (/* row */ Double, /* column */ Double, /* row2 */ Double, /* column2 */ Double, /* preventScrolling */ AnonValue, /* selectionLayerLevel */ Double) => Callback = null,
    afterSelectionByProp: (/* row */ Double, /* prop */ String, /* row2 */ Double, /* prop2 */ String, /* preventScrolling */ AnonValue, /* selectionLayerLevel */ Double) => Callback = null,
    afterSelectionEnd: (/* row */ Double, /* column */ Double, /* row2 */ Double, /* column2 */ Double, /* selectionLayerLevel */ Double) => Callback = null,
    afterSelectionEndByProp: (/* row */ Double, /* prop */ String, /* row2 */ Double, /* prop2 */ String, /* selectionLayerLevel */ Double) => Callback = null,
    afterSetCellMeta: (/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any) => Callback = null,
    afterSetDataAtCell: (/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource]) => Callback = null,
    afterSetDataAtRowProp: (/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource]) => Callback = null,
    afterTrimRow: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Callback = null,
    afterUndo: /* action */ UndoRedoAction => Callback = null,
    afterUnhideColumns: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Callback = null,
    afterUnhideRows: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Callback = null,
    afterUnlisten: js.UndefOr[Callback] = js.undefined,
    afterUnmergeCells: (/* cellRange */ CellRange, /* auto */ Boolean) => Callback = null,
    afterUntrimRow: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Callback = null,
    afterUpdateSettings: /* newSettings */ GridSettings => Callback = null,
    afterValidate: (/* isValid */ Boolean, /* value */ CellValue, /* row */ Double, /* prop */ String | Double, /* source */ ChangeSource) => CallbackTo[Unit | Boolean] = null,
    afterViewportColumnCalculatorOverride: /* calc */ ViewportColumnsCalculator => Callback = null,
    afterViewportRowCalculatorOverride: /* calc */ ViewportColumnsCalculator => Callback = null,
    beforeAddChild: (/* parent */ RowObject, /* element */ RowObject | Unit, /* index */ Double | Unit) => Callback = null,
    beforeAutofill: (/* start */ CellCoords, /* end */ CellCoords, /* data */ js.Array[js.Array[CellValue]]) => Callback = null,
    beforeAutofillInsidePopulate: (/* index */ CellCoords, /* direction */ up | down | left | right, /* input */ js.Array[js.Array[CellValue]], /* deltas */ js.Array[js.Any]) => Callback = null,
    beforeCellAlignment: (/* stateBefore */ NumberDictionary[js.Array[String]], /* range */ js.Array[CellRange], /* type */ horizontal | vertical, /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom) => Callback = null,
    beforeChange: (/* changes */ js.Array[CellChange], /* source */ ChangeSource) => CallbackTo[Unit | Boolean] = null,
    beforeChangeRender: (/* changes */ js.Array[CellChange], /* source */ ChangeSource) => Callback = null,
    beforeColumnMove: (/* columns */ js.Array[Double], /* target */ Double) => CallbackTo[Unit | Boolean] = null,
    beforeColumnResize: (/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => CallbackTo[Unit | Double] = null,
    beforeColumnSort: (/* currentSortConfig */ js.Array[Config], /* destinationSortConfigs */ js.Array[Config]) => CallbackTo[Unit | Boolean] = null,
    beforeContextMenuSetItems: /* menuItems */ js.Array[MenuItemConfig] => Callback = null,
    beforeContextMenuShow: /* context */ ContextMenu => Callback = null,
    beforeCopy: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => CallbackTo[Unit | Boolean] = null,
    beforeCreateCol: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => CallbackTo[Unit | Boolean] = null,
    beforeCreateRow: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Callback = null,
    beforeCut: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => CallbackTo[Unit | Boolean] = null,
    beforeDetachChild: (/* parent */ RowObject, /* element */ RowObject) => Callback = null,
    beforeDrawBorders: (/* corners */ js.Array[Double], /* borderClassName */ js.UndefOr[current | area | highlight]) => Callback = null,
    beforeDropdownMenuSetItems: /* menuItems */ js.Array[MenuItemConfig] => Callback = null,
    beforeDropdownMenuShow: /* instance */ DropdownMenu => Callback = null,
    beforeFilter: /* conditionsStack */ js.Array[ColumnConditions] => CallbackTo[Unit | Boolean] = null,
    beforeGetCellMeta: (/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties) => Callback = null,
    beforeHideColumns: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Callback = null,
    beforeHideRows: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Callback = null,
    beforeInit: js.UndefOr[Callback] = js.undefined,
    beforeInitWalkontable: /* walkontableConfig */ js.Object => Callback = null,
    beforeKeyDown: /* event */ KeyboardEvent => Callback = null,
    beforeLanguageChange: /* languageCode */ String => Callback = null,
    beforeMergeCells: (/* cellRange */ CellRange, /* auto */ Boolean) => Callback = null,
    beforeOnCellContextMenu: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Callback = null,
    beforeOnCellMouseDown: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Callback = null,
    beforeOnCellMouseOut: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Callback = null,
    beforeOnCellMouseOver: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Callback = null,
    beforeOnCellMouseUp: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Callback = null,
    beforePaste: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => CallbackTo[Unit | Boolean] = null,
    beforeRedo: /* action */ UndoRedoAction => Callback = null,
    beforeRefreshDimensions: (/* previousDimensions */ js.Object, /* currentDimensions */ js.Object, /* actionPossible */ Boolean) => CallbackTo[Boolean | Unit] = null,
    beforeRemoveCellClassNames: js.UndefOr[CallbackTo[js.Array[String] | Unit]] = js.undefined,
    beforeRemoveCellMeta: (/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any) => Callback = null,
    beforeRemoveCol: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Callback = null,
    beforeRemoveRow: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Callback = null,
    beforeRender: (/* isForced */ Boolean, /* skipRender */ AnonSkipRender) => Callback = null,
    beforeRenderer: (/* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ CellValue, /* cellProperties */ CellProperties) => Callback = null,
    beforeRowMove: (/* columns */ js.Array[Double], /* target */ Double) => Callback = null,
    beforeRowResize: (/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => CallbackTo[Double | Unit] = null,
    beforeSetRangeEnd: /* coords */ CellCoords => Callback = null,
    beforeSetRangeStart: /* coords */ CellCoords => Callback = null,
    beforeSetRangeStartOnly: /* coords */ CellCoords => Callback = null,
    beforeStretchingColumnWidth: (/* stretchedWidth */ Double, /* column */ Double) => CallbackTo[Unit | Double] = null,
    beforeTouchScroll: js.UndefOr[Callback] = js.undefined,
    beforeTrimRow: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean) => Callback = null,
    beforeUndo: /* action */ UndoRedoAction => Callback = null,
    beforeUnhideColumns: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Callback = null,
    beforeUnhideRows: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Callback = null,
    beforeUnmergeCells: (/* cellRange */ CellRange, /* auto */ Boolean) => Callback = null,
    beforeUntrimRow: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean) => Callback = null,
    beforeValidate: (/* value */ CellValue, /* row */ Double, /* prop */ String | Double, /* source */ js.UndefOr[ChangeSource]) => Callback = null,
    beforeValueRender: (/* value */ CellValue, /* cellProperties */ CellProperties) => Callback = null,
    construct: js.UndefOr[Callback] = js.undefined,
    hiddenColumn: /* column */ Double => Callback = null,
    hiddenRow: /* row */ Double => Callback = null,
    init: js.UndefOr[Callback] = js.undefined,
    modifyAutofillRange: (/* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]]) => Callback = null,
    modifyCol: /* col */ Double => Callback = null,
    modifyColHeader: /* column */ Double => Callback = null,
    modifyColWidth: (/* width */ Double, /* col */ Double) => Callback = null,
    modifyColumnHeaderHeight: js.UndefOr[Callback] = js.undefined,
    modifyCopyableRange: /* copyableRanges */ js.Array[RangeType] => Callback = null,
    modifyData: (/* row */ Double, /* column */ Double, /* valueHolder */ AnonValueCellValue, /* ioMode */ get | set) => Callback = null,
    modifyGetCellCoords: (/* row */ Double, /* column */ Double, /* topmost */ Boolean) => CallbackTo[Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])] = null,
    modifyRow: /* row */ Double => Callback = null,
    modifyRowData: /* row */ Double => Callback = null,
    modifyRowHeader: /* row */ Double => Callback = null,
    modifyRowHeaderWidth: /* rowHeaderWidth */ Double => Callback = null,
    modifyRowHeight: (/* height */ Double, /* row */ Double) => Callback = null,
    modifyRowSourceData: /* row */ Double => Callback = null,
    modifyTransformEnd: /* delta */ CellCoords => Callback = null,
    modifyTransformStart: /* delta */ CellCoords => Callback = null,
    persistentStateLoad: (/* key */ String, /* valuePlaceholder */ AnonValueAny) => Callback = null,
    persistentStateReset: /* key */ String => Callback = null,
    persistentStateSave: (/* key */ String, /* value */ js.Any) => Callback = null,
    skipLengthCache: /* delay */ Double => Callback = null,
    unmodifyCol: /* col */ Double => Callback = null,
    unmodifyRow: /* row */ Double => Callback = null
  ): Events = {
    val __obj = js.Dynamic.literal()
    if (afterAddChild != null) __obj.updateDynamic("afterAddChild")(js.Any.fromFunction3((t0: /* parent */ typingsJapgolly.handsontable.mod.Handsontable.RowObject, t1: /* element */ typingsJapgolly.handsontable.mod.Handsontable.RowObject | scala.Unit, t2: /* index */ scala.Double | scala.Unit) => afterAddChild(t0, t1, t2).runNow()))
    if (afterBeginEditing != null) __obj.updateDynamic("afterBeginEditing")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* column */ scala.Double) => afterBeginEditing(t0, t1).runNow()))
    afterCellMetaReset.foreach(p => __obj.updateDynamic("afterCellMetaReset")(p.toJsFn))
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction2((t0: /* changes */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.CellChange] | scala.Null, t1: /* source */ typingsJapgolly.handsontable.mod.Handsontable.ChangeSource) => afterChange(t0, t1).runNow()))
    afterChangesObserved.foreach(p => __obj.updateDynamic("afterChangesObserved")(p.toJsFn))
    if (afterColumnMove != null) __obj.updateDynamic("afterColumnMove")(js.Any.fromFunction2((t0: /* columns */ js.Array[scala.Double], t1: /* target */ scala.Double) => afterColumnMove(t0, t1).runNow()))
    if (afterColumnResize != null) __obj.updateDynamic("afterColumnResize")(js.Any.fromFunction3((t0: /* currentColumn */ scala.Double, t1: /* newSize */ scala.Double, t2: /* isDoubleClick */ scala.Boolean) => afterColumnResize(t0, t1, t2).runNow()))
    if (afterColumnSort != null) __obj.updateDynamic("afterColumnSort")(js.Any.fromFunction2((t0: /* currentSortConfig */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.columnSorting.Config], t1: /* destinationSortConfigs */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.columnSorting.Config]) => afterColumnSort(t0, t1).runNow()))
    if (afterContextMenuDefaultOptions != null) __obj.updateDynamic("afterContextMenuDefaultOptions")(js.Any.fromFunction1((t0: /* predefinedItems */ js.Array[
  typingsJapgolly.handsontable.mod.Handsontable.contextMenu.PredefinedMenuItemKey | typingsJapgolly.handsontable.mod.Handsontable.contextMenu.MenuItemConfig]) => afterContextMenuDefaultOptions(t0).runNow()))
    if (afterContextMenuHide != null) __obj.updateDynamic("afterContextMenuHide")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.handsontable.mod.Handsontable.plugins.ContextMenu) => afterContextMenuHide(t0).runNow()))
    if (afterContextMenuShow != null) __obj.updateDynamic("afterContextMenuShow")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.handsontable.mod.Handsontable.plugins.ContextMenu) => afterContextMenuShow(t0).runNow()))
    if (afterCopy != null) __obj.updateDynamic("afterCopy")(js.Any.fromFunction2((t0: /* data */ js.Array[js.Array[typingsJapgolly.handsontable.mod.Handsontable.CellValue]], t1: /* coords */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.plugins.RangeType]) => afterCopy(t0, t1).runNow()))
    if (afterCopyLimit != null) __obj.updateDynamic("afterCopyLimit")(js.Any.fromFunction4((t0: /* selectedRows */ scala.Double, t1: /* selectedColumnds */ scala.Double, t2: /* copyRowsLimit */ scala.Double, t3: /* copyColumnsLimit */ scala.Double) => afterCopyLimit(t0, t1, t2, t3).runNow()))
    if (afterCreateCol != null) __obj.updateDynamic("afterCreateCol")(js.Any.fromFunction3((t0: /* index */ scala.Double, t1: /* amount */ scala.Double, t2: /* source */ js.UndefOr[typingsJapgolly.handsontable.mod.Handsontable.ChangeSource]) => afterCreateCol(t0, t1, t2).runNow()))
    if (afterCreateRow != null) __obj.updateDynamic("afterCreateRow")(js.Any.fromFunction3((t0: /* index */ scala.Double, t1: /* amount */ scala.Double, t2: /* source */ js.UndefOr[typingsJapgolly.handsontable.mod.Handsontable.ChangeSource]) => afterCreateRow(t0, t1, t2).runNow()))
    if (afterCut != null) __obj.updateDynamic("afterCut")(js.Any.fromFunction2((t0: /* data */ js.Array[js.Array[typingsJapgolly.handsontable.mod.Handsontable.CellValue]], t1: /* coords */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.plugins.RangeType]) => afterCut(t0, t1).runNow()))
    afterDeselect.foreach(p => __obj.updateDynamic("afterDeselect")(p.toJsFn))
    afterDestroy.foreach(p => __obj.updateDynamic("afterDestroy")(p.toJsFn))
    if (afterDetachChild != null) __obj.updateDynamic("afterDetachChild")(js.Any.fromFunction2((t0: /* parent */ typingsJapgolly.handsontable.mod.Handsontable.RowObject, t1: /* element */ typingsJapgolly.handsontable.mod.Handsontable.RowObject) => afterDetachChild(t0, t1).runNow()))
    if (afterDocumentKeyDown != null) __obj.updateDynamic("afterDocumentKeyDown")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => afterDocumentKeyDown(t0).runNow()))
    if (afterDrawSelection != null) __obj.updateDynamic("afterDrawSelection")(js.Any.fromFunction4((t0: /* currentRow */ scala.Double, t1: /* currentColumn */ scala.Double, t2: /* cornersOfSelection */ js.Array[scala.Double], t3: /* layerLevel */ scala.Double | scala.Unit) => afterDrawSelection(t0, t1, t2, t3).runNow()))
    if (afterDropdownMenuDefaultOptions != null) __obj.updateDynamic("afterDropdownMenuDefaultOptions")(js.Any.fromFunction1((t0: /* predefinedItems */ js.Array[
  typingsJapgolly.handsontable.mod.Handsontable.contextMenu.PredefinedMenuItemKey | typingsJapgolly.handsontable.mod.Handsontable.contextMenu.MenuItemConfig]) => afterDropdownMenuDefaultOptions(t0).runNow()))
    if (afterDropdownMenuHide != null) __obj.updateDynamic("afterDropdownMenuHide")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.handsontable.mod.Handsontable.plugins.DropdownMenu) => afterDropdownMenuHide(t0).runNow()))
    if (afterDropdownMenuShow != null) __obj.updateDynamic("afterDropdownMenuShow")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.handsontable.mod.Handsontable.plugins.DropdownMenu) => afterDropdownMenuShow(t0).runNow()))
    if (afterFilter != null) __obj.updateDynamic("afterFilter")(js.Any.fromFunction1((t0: /* conditionsStack */ js.Array[
  typingsJapgolly.handsontable.mod.Handsontable.plugins.FiltersPlugin.ColumnConditions]) => afterFilter(t0).runNow()))
    if (afterGetCellMeta != null) __obj.updateDynamic("afterGetCellMeta")(js.Any.fromFunction3((t0: /* row */ scala.Double, t1: /* col */ scala.Double, t2: /* cellProperties */ typingsJapgolly.handsontable.mod.Handsontable.CellProperties) => afterGetCellMeta(t0, t1, t2).runNow()))
    if (afterGetColHeader != null) __obj.updateDynamic("afterGetColHeader")(js.Any.fromFunction2((t0: /* col */ scala.Double, t1: /* TH */ typingsJapgolly.std.HTMLTableHeaderCellElement) => afterGetColHeader(t0, t1).runNow()))
    if (afterGetColumnHeaderRenderers != null) __obj.updateDynamic("afterGetColumnHeaderRenderers")(js.Any.fromFunction1((t0: /* renderers */ js.Array[
  js.Function2[
    /* col */ scala.Double, 
    /* TH */ typingsJapgolly.std.HTMLTableHeaderCellElement, 
    scala.Unit
  ]]) => afterGetColumnHeaderRenderers(t0).runNow()))
    if (afterGetRowHeader != null) __obj.updateDynamic("afterGetRowHeader")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* TH */ typingsJapgolly.std.HTMLTableHeaderCellElement) => afterGetRowHeader(t0, t1).runNow()))
    if (afterGetRowHeaderRenderers != null) __obj.updateDynamic("afterGetRowHeaderRenderers")(js.Any.fromFunction1((t0: /* renderers */ js.Array[
  js.Function2[
    /* row */ scala.Double, 
    /* TH */ typingsJapgolly.std.HTMLTableHeaderCellElement, 
    scala.Unit
  ]]) => afterGetRowHeaderRenderers(t0).runNow()))
    if (afterHideColumns != null) __obj.updateDynamic("afterHideColumns")(js.Any.fromFunction4((t0: /* currentHideConfig */ js.Array[scala.Double], t1: /* destinationHideConfig */ js.Array[scala.Double], t2: /* actionPossible */ scala.Boolean, t3: /* stateChanged */ scala.Boolean) => afterHideColumns(t0, t1, t2, t3).runNow()))
    if (afterHideRows != null) __obj.updateDynamic("afterHideRows")(js.Any.fromFunction4((t0: /* currentHideConfig */ js.Array[scala.Double], t1: /* destinationHideConfig */ js.Array[scala.Double], t2: /* actionPossible */ scala.Boolean, t3: /* stateChanged */ scala.Boolean) => afterHideRows(t0, t1, t2, t3).runNow()))
    afterInit.foreach(p => __obj.updateDynamic("afterInit")(p.toJsFn))
    if (afterLanguageChange != null) __obj.updateDynamic("afterLanguageChange")(js.Any.fromFunction1((t0: /* languageCode */ java.lang.String) => afterLanguageChange(t0).runNow()))
    afterListen.foreach(p => __obj.updateDynamic("afterListen")(p.toJsFn))
    if (afterLoadData != null) __obj.updateDynamic("afterLoadData")(js.Any.fromFunction1((t0: /* initialLoad */ scala.Boolean) => afterLoadData(t0).runNow()))
    if (afterMergeCells != null) __obj.updateDynamic("afterMergeCells")(js.Any.fromFunction3((t0: /* cellRange */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange, t1: /* mergeParent */ typingsJapgolly.handsontable.mod.Handsontable.mergeCells.Settings, t2: /* auto */ scala.Boolean) => afterMergeCells(t0, t1, t2).runNow()))
    if (afterModifyTransformEnd != null) __obj.updateDynamic("afterModifyTransformEnd")(js.Any.fromFunction3((t0: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t1: /* rowTransformDir */ typingsJapgolly.handsontable.handsontableNumbers.`-1` | typingsJapgolly.handsontable.handsontableNumbers.`0`, t2: /* colTransformDir */ typingsJapgolly.handsontable.handsontableNumbers.`-1` | typingsJapgolly.handsontable.handsontableNumbers.`0`) => afterModifyTransformEnd(t0, t1, t2).runNow()))
    if (afterModifyTransformStart != null) __obj.updateDynamic("afterModifyTransformStart")(js.Any.fromFunction3((t0: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t1: /* rowTransformDir */ typingsJapgolly.handsontable.handsontableNumbers.`-1` | typingsJapgolly.handsontable.handsontableNumbers.`0`, t2: /* colTransformDir */ typingsJapgolly.handsontable.handsontableNumbers.`-1` | typingsJapgolly.handsontable.handsontableNumbers.`0`) => afterModifyTransformStart(t0, t1, t2).runNow()))
    afterMomentumScroll.foreach(p => __obj.updateDynamic("afterMomentumScroll")(p.toJsFn))
    if (afterOnCellContextMenu != null) __obj.updateDynamic("afterOnCellContextMenu")(js.Any.fromFunction3((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t2: /* TD */ org.scalajs.dom.raw.HTMLTableCellElement) => afterOnCellContextMenu(t0, t1, t2).runNow()))
    if (afterOnCellCornerDblClick != null) __obj.updateDynamic("afterOnCellCornerDblClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => afterOnCellCornerDblClick(t0).runNow()))
    if (afterOnCellCornerMouseDown != null) __obj.updateDynamic("afterOnCellCornerMouseDown")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => afterOnCellCornerMouseDown(t0).runNow()))
    if (afterOnCellMouseDown != null) __obj.updateDynamic("afterOnCellMouseDown")(js.Any.fromFunction3((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t2: /* TD */ org.scalajs.dom.raw.HTMLTableCellElement) => afterOnCellMouseDown(t0, t1, t2).runNow()))
    if (afterOnCellMouseOut != null) __obj.updateDynamic("afterOnCellMouseOut")(js.Any.fromFunction3((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t2: /* TD */ org.scalajs.dom.raw.HTMLTableCellElement) => afterOnCellMouseOut(t0, t1, t2).runNow()))
    if (afterOnCellMouseOver != null) __obj.updateDynamic("afterOnCellMouseOver")(js.Any.fromFunction3((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t2: /* TD */ org.scalajs.dom.raw.HTMLTableCellElement) => afterOnCellMouseOver(t0, t1, t2).runNow()))
    if (afterOnCellMouseUp != null) __obj.updateDynamic("afterOnCellMouseUp")(js.Any.fromFunction3((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t2: /* TD */ org.scalajs.dom.raw.HTMLTableCellElement) => afterOnCellMouseUp(t0, t1, t2).runNow()))
    if (afterPaste != null) __obj.updateDynamic("afterPaste")(js.Any.fromFunction2((t0: /* data */ js.Array[js.Array[typingsJapgolly.handsontable.mod.Handsontable.CellValue]], t1: /* coords */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.plugins.RangeType]) => afterPaste(t0, t1).runNow()))
    afterPluginsInitialized.foreach(p => __obj.updateDynamic("afterPluginsInitialized")(p.toJsFn))
    if (afterRedo != null) __obj.updateDynamic("afterRedo")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.handsontable.mod.Handsontable.plugins.UndoRedoAction) => afterRedo(t0).runNow()))
    if (afterRefreshDimensions != null) __obj.updateDynamic("afterRefreshDimensions")(js.Any.fromFunction3((t0: /* previousDimensions */ js.Object, t1: /* currentDimensions */ js.Object, t2: /* stateChanged */ scala.Boolean) => afterRefreshDimensions(t0, t1, t2).runNow()))
    if (afterRemoveCellMeta != null) __obj.updateDynamic("afterRemoveCellMeta")(js.Any.fromFunction4((t0: /* row */ scala.Double, t1: /* column */ scala.Double, t2: /* key */ java.lang.String, t3: /* value */ js.Any) => afterRemoveCellMeta(t0, t1, t2, t3).runNow()))
    if (afterRemoveCol != null) __obj.updateDynamic("afterRemoveCol")(js.Any.fromFunction4((t0: /* index */ scala.Double, t1: /* amount */ scala.Double, t2: /* physicalColumns */ js.Array[scala.Double], t3: /* source */ js.UndefOr[typingsJapgolly.handsontable.mod.Handsontable.ChangeSource]) => afterRemoveCol(t0, t1, t2, t3).runNow()))
    if (afterRemoveRow != null) __obj.updateDynamic("afterRemoveRow")(js.Any.fromFunction4((t0: /* index */ scala.Double, t1: /* amount */ scala.Double, t2: /* physicalColumns */ js.Array[scala.Double], t3: /* source */ js.UndefOr[typingsJapgolly.handsontable.mod.Handsontable.ChangeSource]) => afterRemoveRow(t0, t1, t2, t3).runNow()))
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction1((t0: /* isForced */ scala.Boolean) => afterRender(t0).runNow()))
    if (afterRenderer != null) __obj.updateDynamic("afterRenderer")(js.Any.fromFunction6((t0: /* TD */ org.scalajs.dom.raw.HTMLTableCellElement, t1: /* row */ scala.Double, t2: /* col */ scala.Double, t3: /* prop */ java.lang.String | scala.Double, t4: /* value */ java.lang.String, t5: /* cellProperties */ typingsJapgolly.handsontable.mod.Handsontable.CellProperties) => afterRenderer(t0, t1, t2, t3, t4, t5).runNow()))
    if (afterRowMove != null) __obj.updateDynamic("afterRowMove")(js.Any.fromFunction2((t0: /* startRow */ scala.Double, t1: /* endRow */ scala.Double) => afterRowMove(t0, t1).runNow()))
    if (afterRowResize != null) __obj.updateDynamic("afterRowResize")(js.Any.fromFunction3((t0: /* currentRow */ scala.Double, t1: /* newSize */ scala.Double, t2: /* isDoubleClick */ scala.Boolean) => afterRowResize(t0, t1, t2).runNow()))
    afterScrollHorizontally.foreach(p => __obj.updateDynamic("afterScrollHorizontally")(p.toJsFn))
    afterScrollVertically.foreach(p => __obj.updateDynamic("afterScrollVertically")(p.toJsFn))
    if (afterSelection != null) __obj.updateDynamic("afterSelection")(js.Any.fromFunction6((t0: /* row */ scala.Double, t1: /* column */ scala.Double, t2: /* row2 */ scala.Double, t3: /* column2 */ scala.Double, t4: /* preventScrolling */ typingsJapgolly.handsontable.AnonValue, t5: /* selectionLayerLevel */ scala.Double) => afterSelection(t0, t1, t2, t3, t4, t5).runNow()))
    if (afterSelectionByProp != null) __obj.updateDynamic("afterSelectionByProp")(js.Any.fromFunction6((t0: /* row */ scala.Double, t1: /* prop */ java.lang.String, t2: /* row2 */ scala.Double, t3: /* prop2 */ java.lang.String, t4: /* preventScrolling */ typingsJapgolly.handsontable.AnonValue, t5: /* selectionLayerLevel */ scala.Double) => afterSelectionByProp(t0, t1, t2, t3, t4, t5).runNow()))
    if (afterSelectionEnd != null) __obj.updateDynamic("afterSelectionEnd")(js.Any.fromFunction5((t0: /* row */ scala.Double, t1: /* column */ scala.Double, t2: /* row2 */ scala.Double, t3: /* column2 */ scala.Double, t4: /* selectionLayerLevel */ scala.Double) => afterSelectionEnd(t0, t1, t2, t3, t4).runNow()))
    if (afterSelectionEndByProp != null) __obj.updateDynamic("afterSelectionEndByProp")(js.Any.fromFunction5((t0: /* row */ scala.Double, t1: /* prop */ java.lang.String, t2: /* row2 */ scala.Double, t3: /* prop2 */ java.lang.String, t4: /* selectionLayerLevel */ scala.Double) => afterSelectionEndByProp(t0, t1, t2, t3, t4).runNow()))
    if (afterSetCellMeta != null) __obj.updateDynamic("afterSetCellMeta")(js.Any.fromFunction4((t0: /* row */ scala.Double, t1: /* col */ scala.Double, t2: /* key */ java.lang.String, t3: /* value */ js.Any) => afterSetCellMeta(t0, t1, t2, t3).runNow()))
    if (afterSetDataAtCell != null) __obj.updateDynamic("afterSetDataAtCell")(js.Any.fromFunction2((t0: /* changes */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.CellChange], t1: /* source */ js.UndefOr[typingsJapgolly.handsontable.mod.Handsontable.ChangeSource]) => afterSetDataAtCell(t0, t1).runNow()))
    if (afterSetDataAtRowProp != null) __obj.updateDynamic("afterSetDataAtRowProp")(js.Any.fromFunction2((t0: /* changes */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.CellChange], t1: /* source */ js.UndefOr[typingsJapgolly.handsontable.mod.Handsontable.ChangeSource]) => afterSetDataAtRowProp(t0, t1).runNow()))
    if (afterTrimRow != null) __obj.updateDynamic("afterTrimRow")(js.Any.fromFunction4((t0: /* currentTrimConfig */ js.Array[scala.Double], t1: /* destinationTrimConfig */ js.Array[scala.Double], t2: /* actionPossible */ scala.Boolean, t3: /* stateChanged */ scala.Boolean) => afterTrimRow(t0, t1, t2, t3).runNow()))
    if (afterUndo != null) __obj.updateDynamic("afterUndo")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.handsontable.mod.Handsontable.plugins.UndoRedoAction) => afterUndo(t0).runNow()))
    if (afterUnhideColumns != null) __obj.updateDynamic("afterUnhideColumns")(js.Any.fromFunction4((t0: /* currentHideConfig */ js.Array[scala.Double], t1: /* destinationHideConfig */ js.Array[scala.Double], t2: /* actionPossible */ scala.Boolean, t3: /* stateChanged */ scala.Boolean) => afterUnhideColumns(t0, t1, t2, t3).runNow()))
    if (afterUnhideRows != null) __obj.updateDynamic("afterUnhideRows")(js.Any.fromFunction4((t0: /* currentHideConfig */ js.Array[scala.Double], t1: /* destinationHideConfig */ js.Array[scala.Double], t2: /* actionPossible */ scala.Boolean, t3: /* stateChanged */ scala.Boolean) => afterUnhideRows(t0, t1, t2, t3).runNow()))
    afterUnlisten.foreach(p => __obj.updateDynamic("afterUnlisten")(p.toJsFn))
    if (afterUnmergeCells != null) __obj.updateDynamic("afterUnmergeCells")(js.Any.fromFunction2((t0: /* cellRange */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange, t1: /* auto */ scala.Boolean) => afterUnmergeCells(t0, t1).runNow()))
    if (afterUntrimRow != null) __obj.updateDynamic("afterUntrimRow")(js.Any.fromFunction4((t0: /* currentTrimConfig */ js.Array[scala.Double], t1: /* destinationTrimConfig */ js.Array[scala.Double], t2: /* actionPossible */ scala.Boolean, t3: /* stateChanged */ scala.Boolean) => afterUntrimRow(t0, t1, t2, t3).runNow()))
    if (afterUpdateSettings != null) __obj.updateDynamic("afterUpdateSettings")(js.Any.fromFunction1((t0: /* newSettings */ typingsJapgolly.handsontable.mod.Handsontable.GridSettings) => afterUpdateSettings(t0).runNow()))
    if (afterValidate != null) __obj.updateDynamic("afterValidate")(js.Any.fromFunction5((t0: /* isValid */ scala.Boolean, t1: /* value */ typingsJapgolly.handsontable.mod.Handsontable.CellValue, t2: /* row */ scala.Double, t3: /* prop */ java.lang.String | scala.Double, t4: /* source */ typingsJapgolly.handsontable.mod.Handsontable.ChangeSource) => afterValidate(t0, t1, t2, t3, t4).runNow()))
    if (afterViewportColumnCalculatorOverride != null) __obj.updateDynamic("afterViewportColumnCalculatorOverride")(js.Any.fromFunction1((t0: /* calc */ typingsJapgolly.handsontable.mod.Handsontable.ViewportColumnsCalculator) => afterViewportColumnCalculatorOverride(t0).runNow()))
    if (afterViewportRowCalculatorOverride != null) __obj.updateDynamic("afterViewportRowCalculatorOverride")(js.Any.fromFunction1((t0: /* calc */ typingsJapgolly.handsontable.mod.Handsontable.ViewportColumnsCalculator) => afterViewportRowCalculatorOverride(t0).runNow()))
    if (beforeAddChild != null) __obj.updateDynamic("beforeAddChild")(js.Any.fromFunction3((t0: /* parent */ typingsJapgolly.handsontable.mod.Handsontable.RowObject, t1: /* element */ typingsJapgolly.handsontable.mod.Handsontable.RowObject | scala.Unit, t2: /* index */ scala.Double | scala.Unit) => beforeAddChild(t0, t1, t2).runNow()))
    if (beforeAutofill != null) __obj.updateDynamic("beforeAutofill")(js.Any.fromFunction3((t0: /* start */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t1: /* end */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t2: /* data */ js.Array[js.Array[typingsJapgolly.handsontable.mod.Handsontable.CellValue]]) => beforeAutofill(t0, t1, t2).runNow()))
    if (beforeAutofillInsidePopulate != null) __obj.updateDynamic("beforeAutofillInsidePopulate")(js.Any.fromFunction4((t0: /* index */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t1: /* direction */ typingsJapgolly.handsontable.handsontableStrings.up | typingsJapgolly.handsontable.handsontableStrings.down | typingsJapgolly.handsontable.handsontableStrings.left | typingsJapgolly.handsontable.handsontableStrings.right, t2: /* input */ js.Array[js.Array[typingsJapgolly.handsontable.mod.Handsontable.CellValue]], t3: /* deltas */ js.Array[js.Any]) => beforeAutofillInsidePopulate(t0, t1, t2, t3).runNow()))
    if (beforeCellAlignment != null) __obj.updateDynamic("beforeCellAlignment")(js.Any.fromFunction4((t0: /* stateBefore */ org.scalablytyped.runtime.NumberDictionary[js.Array[java.lang.String]], t1: /* range */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange], t2: /* type */ typingsJapgolly.handsontable.handsontableStrings.horizontal | typingsJapgolly.handsontable.handsontableStrings.vertical, t3: /* alignmentClass */ typingsJapgolly.handsontable.handsontableStrings.htLeft | typingsJapgolly.handsontable.handsontableStrings.htCenter | typingsJapgolly.handsontable.handsontableStrings.htRight | typingsJapgolly.handsontable.handsontableStrings.htJustify | typingsJapgolly.handsontable.handsontableStrings.htTop | typingsJapgolly.handsontable.handsontableStrings.htMiddle | typingsJapgolly.handsontable.handsontableStrings.htBottom) => beforeCellAlignment(t0, t1, t2, t3).runNow()))
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction2((t0: /* changes */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.CellChange], t1: /* source */ typingsJapgolly.handsontable.mod.Handsontable.ChangeSource) => beforeChange(t0, t1).runNow()))
    if (beforeChangeRender != null) __obj.updateDynamic("beforeChangeRender")(js.Any.fromFunction2((t0: /* changes */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.CellChange], t1: /* source */ typingsJapgolly.handsontable.mod.Handsontable.ChangeSource) => beforeChangeRender(t0, t1).runNow()))
    if (beforeColumnMove != null) __obj.updateDynamic("beforeColumnMove")(js.Any.fromFunction2((t0: /* columns */ js.Array[scala.Double], t1: /* target */ scala.Double) => beforeColumnMove(t0, t1).runNow()))
    if (beforeColumnResize != null) __obj.updateDynamic("beforeColumnResize")(js.Any.fromFunction3((t0: /* currentColumn */ scala.Double, t1: /* newSize */ scala.Double, t2: /* isDoubleClick */ scala.Boolean) => beforeColumnResize(t0, t1, t2).runNow()))
    if (beforeColumnSort != null) __obj.updateDynamic("beforeColumnSort")(js.Any.fromFunction2((t0: /* currentSortConfig */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.columnSorting.Config], t1: /* destinationSortConfigs */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.columnSorting.Config]) => beforeColumnSort(t0, t1).runNow()))
    if (beforeContextMenuSetItems != null) __obj.updateDynamic("beforeContextMenuSetItems")(js.Any.fromFunction1((t0: /* menuItems */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.contextMenu.MenuItemConfig]) => beforeContextMenuSetItems(t0).runNow()))
    if (beforeContextMenuShow != null) __obj.updateDynamic("beforeContextMenuShow")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.handsontable.mod.Handsontable.plugins.ContextMenu) => beforeContextMenuShow(t0).runNow()))
    if (beforeCopy != null) __obj.updateDynamic("beforeCopy")(js.Any.fromFunction2((t0: /* data */ js.Array[js.Array[typingsJapgolly.handsontable.mod.Handsontable.CellValue]], t1: /* coords */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.plugins.RangeType]) => beforeCopy(t0, t1).runNow()))
    if (beforeCreateCol != null) __obj.updateDynamic("beforeCreateCol")(js.Any.fromFunction3((t0: /* index */ scala.Double, t1: /* amount */ scala.Double, t2: /* source */ js.UndefOr[typingsJapgolly.handsontable.mod.Handsontable.ChangeSource]) => beforeCreateCol(t0, t1, t2).runNow()))
    if (beforeCreateRow != null) __obj.updateDynamic("beforeCreateRow")(js.Any.fromFunction3((t0: /* index */ scala.Double, t1: /* amount */ scala.Double, t2: /* source */ js.UndefOr[typingsJapgolly.handsontable.mod.Handsontable.ChangeSource]) => beforeCreateRow(t0, t1, t2).runNow()))
    if (beforeCut != null) __obj.updateDynamic("beforeCut")(js.Any.fromFunction2((t0: /* data */ js.Array[js.Array[typingsJapgolly.handsontable.mod.Handsontable.CellValue]], t1: /* coords */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.plugins.RangeType]) => beforeCut(t0, t1).runNow()))
    if (beforeDetachChild != null) __obj.updateDynamic("beforeDetachChild")(js.Any.fromFunction2((t0: /* parent */ typingsJapgolly.handsontable.mod.Handsontable.RowObject, t1: /* element */ typingsJapgolly.handsontable.mod.Handsontable.RowObject) => beforeDetachChild(t0, t1).runNow()))
    if (beforeDrawBorders != null) __obj.updateDynamic("beforeDrawBorders")(js.Any.fromFunction2((t0: /* corners */ js.Array[scala.Double], t1: /* borderClassName */ js.UndefOr[
  typingsJapgolly.handsontable.handsontableStrings.current | typingsJapgolly.handsontable.handsontableStrings.area | typingsJapgolly.handsontable.handsontableStrings.highlight]) => beforeDrawBorders(t0, t1).runNow()))
    if (beforeDropdownMenuSetItems != null) __obj.updateDynamic("beforeDropdownMenuSetItems")(js.Any.fromFunction1((t0: /* menuItems */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.contextMenu.MenuItemConfig]) => beforeDropdownMenuSetItems(t0).runNow()))
    if (beforeDropdownMenuShow != null) __obj.updateDynamic("beforeDropdownMenuShow")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.handsontable.mod.Handsontable.plugins.DropdownMenu) => beforeDropdownMenuShow(t0).runNow()))
    if (beforeFilter != null) __obj.updateDynamic("beforeFilter")(js.Any.fromFunction1((t0: /* conditionsStack */ js.Array[
  typingsJapgolly.handsontable.mod.Handsontable.plugins.FiltersPlugin.ColumnConditions]) => beforeFilter(t0).runNow()))
    if (beforeGetCellMeta != null) __obj.updateDynamic("beforeGetCellMeta")(js.Any.fromFunction3((t0: /* row */ scala.Double, t1: /* col */ scala.Double, t2: /* cellProperties */ typingsJapgolly.handsontable.mod.Handsontable.CellProperties) => beforeGetCellMeta(t0, t1, t2).runNow()))
    if (beforeHideColumns != null) __obj.updateDynamic("beforeHideColumns")(js.Any.fromFunction3((t0: /* currentHideConfig */ js.Array[scala.Double], t1: /* destinationHideConfig */ js.Array[scala.Double], t2: /* actionPossible */ scala.Boolean) => beforeHideColumns(t0, t1, t2).runNow()))
    if (beforeHideRows != null) __obj.updateDynamic("beforeHideRows")(js.Any.fromFunction3((t0: /* currentHideConfig */ js.Array[scala.Double], t1: /* destinationHideConfig */ js.Array[scala.Double], t2: /* actionPossible */ scala.Boolean) => beforeHideRows(t0, t1, t2).runNow()))
    beforeInit.foreach(p => __obj.updateDynamic("beforeInit")(p.toJsFn))
    if (beforeInitWalkontable != null) __obj.updateDynamic("beforeInitWalkontable")(js.Any.fromFunction1((t0: /* walkontableConfig */ js.Object) => beforeInitWalkontable(t0).runNow()))
    if (beforeKeyDown != null) __obj.updateDynamic("beforeKeyDown")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => beforeKeyDown(t0).runNow()))
    if (beforeLanguageChange != null) __obj.updateDynamic("beforeLanguageChange")(js.Any.fromFunction1((t0: /* languageCode */ java.lang.String) => beforeLanguageChange(t0).runNow()))
    if (beforeMergeCells != null) __obj.updateDynamic("beforeMergeCells")(js.Any.fromFunction2((t0: /* cellRange */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange, t1: /* auto */ scala.Boolean) => beforeMergeCells(t0, t1).runNow()))
    if (beforeOnCellContextMenu != null) __obj.updateDynamic("beforeOnCellContextMenu")(js.Any.fromFunction3((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t2: /* TD */ org.scalajs.dom.raw.HTMLTableCellElement) => beforeOnCellContextMenu(t0, t1, t2).runNow()))
    if (beforeOnCellMouseDown != null) __obj.updateDynamic("beforeOnCellMouseDown")(js.Any.fromFunction4((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t2: /* TD */ org.scalajs.dom.raw.HTMLTableCellElement, t3: /* controller */ typingsJapgolly.handsontable.mod.Handsontable.SelectionController) => beforeOnCellMouseDown(t0, t1, t2, t3).runNow()))
    if (beforeOnCellMouseOut != null) __obj.updateDynamic("beforeOnCellMouseOut")(js.Any.fromFunction3((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t2: /* TD */ org.scalajs.dom.raw.HTMLTableCellElement) => beforeOnCellMouseOut(t0, t1, t2).runNow()))
    if (beforeOnCellMouseOver != null) __obj.updateDynamic("beforeOnCellMouseOver")(js.Any.fromFunction4((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t2: /* TD */ org.scalajs.dom.raw.HTMLTableCellElement, t3: /* controller */ typingsJapgolly.handsontable.mod.Handsontable.SelectionController) => beforeOnCellMouseOver(t0, t1, t2, t3).runNow()))
    if (beforeOnCellMouseUp != null) __obj.updateDynamic("beforeOnCellMouseUp")(js.Any.fromFunction4((t0: /* event */ org.scalajs.dom.raw.MouseEvent, t1: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t2: /* TD */ org.scalajs.dom.raw.HTMLTableCellElement, t3: /* controller */ typingsJapgolly.handsontable.mod.Handsontable.SelectionController) => beforeOnCellMouseUp(t0, t1, t2, t3).runNow()))
    if (beforePaste != null) __obj.updateDynamic("beforePaste")(js.Any.fromFunction2((t0: /* data */ js.Array[js.Array[typingsJapgolly.handsontable.mod.Handsontable.CellValue]], t1: /* coords */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.plugins.RangeType]) => beforePaste(t0, t1).runNow()))
    if (beforeRedo != null) __obj.updateDynamic("beforeRedo")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.handsontable.mod.Handsontable.plugins.UndoRedoAction) => beforeRedo(t0).runNow()))
    if (beforeRefreshDimensions != null) __obj.updateDynamic("beforeRefreshDimensions")(js.Any.fromFunction3((t0: /* previousDimensions */ js.Object, t1: /* currentDimensions */ js.Object, t2: /* actionPossible */ scala.Boolean) => beforeRefreshDimensions(t0, t1, t2).runNow()))
    beforeRemoveCellClassNames.foreach(p => __obj.updateDynamic("beforeRemoveCellClassNames")(p.toJsFn))
    if (beforeRemoveCellMeta != null) __obj.updateDynamic("beforeRemoveCellMeta")(js.Any.fromFunction4((t0: /* row */ scala.Double, t1: /* column */ scala.Double, t2: /* key */ java.lang.String, t3: /* value */ js.Any) => beforeRemoveCellMeta(t0, t1, t2, t3).runNow()))
    if (beforeRemoveCol != null) __obj.updateDynamic("beforeRemoveCol")(js.Any.fromFunction4((t0: /* index */ scala.Double, t1: /* amount */ scala.Double, t2: /* physicalColumns */ js.Array[scala.Double], t3: /* source */ js.UndefOr[typingsJapgolly.handsontable.mod.Handsontable.ChangeSource]) => beforeRemoveCol(t0, t1, t2, t3).runNow()))
    if (beforeRemoveRow != null) __obj.updateDynamic("beforeRemoveRow")(js.Any.fromFunction4((t0: /* index */ scala.Double, t1: /* amount */ scala.Double, t2: /* physicalColumns */ js.Array[scala.Double], t3: /* source */ js.UndefOr[typingsJapgolly.handsontable.mod.Handsontable.ChangeSource]) => beforeRemoveRow(t0, t1, t2, t3).runNow()))
    if (beforeRender != null) __obj.updateDynamic("beforeRender")(js.Any.fromFunction2((t0: /* isForced */ scala.Boolean, t1: /* skipRender */ typingsJapgolly.handsontable.AnonSkipRender) => beforeRender(t0, t1).runNow()))
    if (beforeRenderer != null) __obj.updateDynamic("beforeRenderer")(js.Any.fromFunction6((t0: /* TD */ org.scalajs.dom.raw.HTMLTableCellElement, t1: /* row */ scala.Double, t2: /* col */ scala.Double, t3: /* prop */ java.lang.String | scala.Double, t4: /* value */ typingsJapgolly.handsontable.mod.Handsontable.CellValue, t5: /* cellProperties */ typingsJapgolly.handsontable.mod.Handsontable.CellProperties) => beforeRenderer(t0, t1, t2, t3, t4, t5).runNow()))
    if (beforeRowMove != null) __obj.updateDynamic("beforeRowMove")(js.Any.fromFunction2((t0: /* columns */ js.Array[scala.Double], t1: /* target */ scala.Double) => beforeRowMove(t0, t1).runNow()))
    if (beforeRowResize != null) __obj.updateDynamic("beforeRowResize")(js.Any.fromFunction3((t0: /* currentRow */ scala.Double, t1: /* newSize */ scala.Double, t2: /* isDoubleClick */ scala.Boolean) => beforeRowResize(t0, t1, t2).runNow()))
    if (beforeSetRangeEnd != null) __obj.updateDynamic("beforeSetRangeEnd")(js.Any.fromFunction1((t0: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords) => beforeSetRangeEnd(t0).runNow()))
    if (beforeSetRangeStart != null) __obj.updateDynamic("beforeSetRangeStart")(js.Any.fromFunction1((t0: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords) => beforeSetRangeStart(t0).runNow()))
    if (beforeSetRangeStartOnly != null) __obj.updateDynamic("beforeSetRangeStartOnly")(js.Any.fromFunction1((t0: /* coords */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords) => beforeSetRangeStartOnly(t0).runNow()))
    if (beforeStretchingColumnWidth != null) __obj.updateDynamic("beforeStretchingColumnWidth")(js.Any.fromFunction2((t0: /* stretchedWidth */ scala.Double, t1: /* column */ scala.Double) => beforeStretchingColumnWidth(t0, t1).runNow()))
    beforeTouchScroll.foreach(p => __obj.updateDynamic("beforeTouchScroll")(p.toJsFn))
    if (beforeTrimRow != null) __obj.updateDynamic("beforeTrimRow")(js.Any.fromFunction3((t0: /* currentTrimConfig */ js.Array[scala.Double], t1: /* destinationTrimConfig */ js.Array[scala.Double], t2: /* actionPossible */ scala.Boolean) => beforeTrimRow(t0, t1, t2).runNow()))
    if (beforeUndo != null) __obj.updateDynamic("beforeUndo")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.handsontable.mod.Handsontable.plugins.UndoRedoAction) => beforeUndo(t0).runNow()))
    if (beforeUnhideColumns != null) __obj.updateDynamic("beforeUnhideColumns")(js.Any.fromFunction3((t0: /* currentHideConfig */ js.Array[scala.Double], t1: /* destinationHideConfig */ js.Array[scala.Double], t2: /* actionPossible */ scala.Boolean) => beforeUnhideColumns(t0, t1, t2).runNow()))
    if (beforeUnhideRows != null) __obj.updateDynamic("beforeUnhideRows")(js.Any.fromFunction3((t0: /* currentHideConfig */ js.Array[scala.Double], t1: /* destinationHideConfig */ js.Array[scala.Double], t2: /* actionPossible */ scala.Boolean) => beforeUnhideRows(t0, t1, t2).runNow()))
    if (beforeUnmergeCells != null) __obj.updateDynamic("beforeUnmergeCells")(js.Any.fromFunction2((t0: /* cellRange */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange, t1: /* auto */ scala.Boolean) => beforeUnmergeCells(t0, t1).runNow()))
    if (beforeUntrimRow != null) __obj.updateDynamic("beforeUntrimRow")(js.Any.fromFunction3((t0: /* currentTrimConfig */ js.Array[scala.Double], t1: /* destinationTrimConfig */ js.Array[scala.Double], t2: /* actionPossible */ scala.Boolean) => beforeUntrimRow(t0, t1, t2).runNow()))
    if (beforeValidate != null) __obj.updateDynamic("beforeValidate")(js.Any.fromFunction4((t0: /* value */ typingsJapgolly.handsontable.mod.Handsontable.CellValue, t1: /* row */ scala.Double, t2: /* prop */ java.lang.String | scala.Double, t3: /* source */ js.UndefOr[typingsJapgolly.handsontable.mod.Handsontable.ChangeSource]) => beforeValidate(t0, t1, t2, t3).runNow()))
    if (beforeValueRender != null) __obj.updateDynamic("beforeValueRender")(js.Any.fromFunction2((t0: /* value */ typingsJapgolly.handsontable.mod.Handsontable.CellValue, t1: /* cellProperties */ typingsJapgolly.handsontable.mod.Handsontable.CellProperties) => beforeValueRender(t0, t1).runNow()))
    construct.foreach(p => __obj.updateDynamic("construct")(p.toJsFn))
    if (hiddenColumn != null) __obj.updateDynamic("hiddenColumn")(js.Any.fromFunction1((t0: /* column */ scala.Double) => hiddenColumn(t0).runNow()))
    if (hiddenRow != null) __obj.updateDynamic("hiddenRow")(js.Any.fromFunction1((t0: /* row */ scala.Double) => hiddenRow(t0).runNow()))
    init.foreach(p => __obj.updateDynamic("init")(p.toJsFn))
    if (modifyAutofillRange != null) __obj.updateDynamic("modifyAutofillRange")(js.Any.fromFunction2((t0: /* startArea */ js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]], t1: /* entireArea */ js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]]) => modifyAutofillRange(t0, t1).runNow()))
    if (modifyCol != null) __obj.updateDynamic("modifyCol")(js.Any.fromFunction1((t0: /* col */ scala.Double) => modifyCol(t0).runNow()))
    if (modifyColHeader != null) __obj.updateDynamic("modifyColHeader")(js.Any.fromFunction1((t0: /* column */ scala.Double) => modifyColHeader(t0).runNow()))
    if (modifyColWidth != null) __obj.updateDynamic("modifyColWidth")(js.Any.fromFunction2((t0: /* width */ scala.Double, t1: /* col */ scala.Double) => modifyColWidth(t0, t1).runNow()))
    modifyColumnHeaderHeight.foreach(p => __obj.updateDynamic("modifyColumnHeaderHeight")(p.toJsFn))
    if (modifyCopyableRange != null) __obj.updateDynamic("modifyCopyableRange")(js.Any.fromFunction1((t0: /* copyableRanges */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.plugins.RangeType]) => modifyCopyableRange(t0).runNow()))
    if (modifyData != null) __obj.updateDynamic("modifyData")(js.Any.fromFunction4((t0: /* row */ scala.Double, t1: /* column */ scala.Double, t2: /* valueHolder */ typingsJapgolly.handsontable.AnonValueCellValue, t3: /* ioMode */ typingsJapgolly.handsontable.handsontableStrings.get | typingsJapgolly.handsontable.handsontableStrings.set) => modifyData(t0, t1, t2, t3).runNow()))
    if (modifyGetCellCoords != null) __obj.updateDynamic("modifyGetCellCoords")(js.Any.fromFunction3((t0: /* row */ scala.Double, t1: /* column */ scala.Double, t2: /* topmost */ scala.Boolean) => modifyGetCellCoords(t0, t1, t2).runNow()))
    if (modifyRow != null) __obj.updateDynamic("modifyRow")(js.Any.fromFunction1((t0: /* row */ scala.Double) => modifyRow(t0).runNow()))
    if (modifyRowData != null) __obj.updateDynamic("modifyRowData")(js.Any.fromFunction1((t0: /* row */ scala.Double) => modifyRowData(t0).runNow()))
    if (modifyRowHeader != null) __obj.updateDynamic("modifyRowHeader")(js.Any.fromFunction1((t0: /* row */ scala.Double) => modifyRowHeader(t0).runNow()))
    if (modifyRowHeaderWidth != null) __obj.updateDynamic("modifyRowHeaderWidth")(js.Any.fromFunction1((t0: /* rowHeaderWidth */ scala.Double) => modifyRowHeaderWidth(t0).runNow()))
    if (modifyRowHeight != null) __obj.updateDynamic("modifyRowHeight")(js.Any.fromFunction2((t0: /* height */ scala.Double, t1: /* row */ scala.Double) => modifyRowHeight(t0, t1).runNow()))
    if (modifyRowSourceData != null) __obj.updateDynamic("modifyRowSourceData")(js.Any.fromFunction1((t0: /* row */ scala.Double) => modifyRowSourceData(t0).runNow()))
    if (modifyTransformEnd != null) __obj.updateDynamic("modifyTransformEnd")(js.Any.fromFunction1((t0: /* delta */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords) => modifyTransformEnd(t0).runNow()))
    if (modifyTransformStart != null) __obj.updateDynamic("modifyTransformStart")(js.Any.fromFunction1((t0: /* delta */ typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords) => modifyTransformStart(t0).runNow()))
    if (persistentStateLoad != null) __obj.updateDynamic("persistentStateLoad")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* valuePlaceholder */ typingsJapgolly.handsontable.AnonValueAny) => persistentStateLoad(t0, t1).runNow()))
    if (persistentStateReset != null) __obj.updateDynamic("persistentStateReset")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => persistentStateReset(t0).runNow()))
    if (persistentStateSave != null) __obj.updateDynamic("persistentStateSave")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* value */ js.Any) => persistentStateSave(t0, t1).runNow()))
    if (skipLengthCache != null) __obj.updateDynamic("skipLengthCache")(js.Any.fromFunction1((t0: /* delay */ scala.Double) => skipLengthCache(t0).runNow()))
    if (unmodifyCol != null) __obj.updateDynamic("unmodifyCol")(js.Any.fromFunction1((t0: /* col */ scala.Double) => unmodifyCol(t0).runNow()))
    if (unmodifyRow != null) __obj.updateDynamic("unmodifyRow")(js.Any.fromFunction1((t0: /* row */ scala.Double) => unmodifyRow(t0).runNow()))
    __obj.asInstanceOf[Events]
  }
}

