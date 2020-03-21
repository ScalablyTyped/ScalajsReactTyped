package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IStyledRegionGroup
import typingsJapgolly.blueprintjsTable.esmRegionsMod.RegionCardinality
import typingsJapgolly.blueprintjsTable.esmRegionsMod.TableLoadingOption
import typingsJapgolly.blueprintjsTable.gridMod.IColumnIndices
import typingsJapgolly.blueprintjsTable.gridMod.IRowIndices
import typingsJapgolly.blueprintjsTable.menuContextMod.IMenuContext
import typingsJapgolly.blueprintjsTable.renderModeMod.RenderMode
import typingsJapgolly.blueprintjsTable.tableMod.ITableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  def apply(
    bodyContextMenuRenderer: /* context */ IMenuContext => CallbackTo[Element] = null,
    className: String = null,
    columnWidths: js.Array[js.UndefOr[Double | Null]] = null,
    defaultColumnWidth: Int | Double = null,
    defaultRowHeight: Int | Double = null,
    enableColumnInteractionBar: js.UndefOr[Boolean] = js.undefined,
    enableColumnReordering: js.UndefOr[Boolean] = js.undefined,
    enableColumnResizing: js.UndefOr[Boolean] = js.undefined,
    enableFocusedCell: js.UndefOr[Boolean] = js.undefined,
    enableGhostCells: js.UndefOr[Boolean] = js.undefined,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    enableRowHeader: js.UndefOr[Boolean] = js.undefined,
    enableRowReordering: js.UndefOr[Boolean] = js.undefined,
    enableRowResizing: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    forceRerenderOnSelectionChange: js.UndefOr[Boolean] = js.undefined,
    getCellClipboardData: (/* row */ Double, /* col */ Double) => CallbackTo[js.Any] = null,
    loadingOptions: js.Array[TableLoadingOption] = null,
    maxColumnWidth: Int | Double = null,
    maxRowHeight: Int | Double = null,
    minColumnWidth: Int | Double = null,
    minRowHeight: Int | Double = null,
    numFrozenColumns: Int | Double = null,
    numFrozenRows: Int | Double = null,
    numRows: Int | Double = null,
    onColumnWidthChanged: (/* index */ Double, /* size */ Double) => Callback = null,
    onColumnsReordered: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Callback = null,
    onCompleteRender: js.UndefOr[Callback] = js.undefined,
    onCopy: /* success */ Boolean => Callback = null,
    onFocusedCell: /* focusedCell */ IFocusedCellCoordinates => Callback = null,
    onRowHeightChanged: (/* index */ Double, /* size */ Double) => Callback = null,
    onRowsReordered: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Callback = null,
    onSelection: /* selectedRegions */ js.Array[IRegion] => Callback = null,
    onVisibleCellsChange: (/* rowIndices */ IRowIndices, /* columnIndices */ IColumnIndices) => Callback = null,
    renderMode: RenderMode = null,
    rowHeaderCellRenderer: /* rowIndex */ Double => CallbackTo[Element] = null,
    rowHeights: js.Array[js.UndefOr[Double | Null]] = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => CallbackTo[IRegion] = null,
    selectedRegions: js.Array[IRegion] = null,
    selectionModes: js.Array[RegionCardinality] = null,
    styledRegionGroups: js.Array[IStyledRegionGroup] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Element | js.Array[Element] = null
  ): UnmountedWithRoot[ITableProps, typingsJapgolly.blueprintjsTable.mod.Table, Unit, ITableProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (bodyContextMenuRenderer != null) __obj.updateDynamic("bodyContextMenuRenderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.blueprintjsTable.menuContextMod.IMenuContext) => bodyContextMenuRenderer(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnWidths != null) __obj.updateDynamic("columnWidths")(columnWidths.asInstanceOf[js.Any])
    if (defaultColumnWidth != null) __obj.updateDynamic("defaultColumnWidth")(defaultColumnWidth.asInstanceOf[js.Any])
    if (defaultRowHeight != null) __obj.updateDynamic("defaultRowHeight")(defaultRowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnInteractionBar)) __obj.updateDynamic("enableColumnInteractionBar")(enableColumnInteractionBar.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnReordering)) __obj.updateDynamic("enableColumnReordering")(enableColumnReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnResizing)) __obj.updateDynamic("enableColumnResizing")(enableColumnResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFocusedCell)) __obj.updateDynamic("enableFocusedCell")(enableFocusedCell.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGhostCells)) __obj.updateDynamic("enableGhostCells")(enableGhostCells.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowHeader)) __obj.updateDynamic("enableRowHeader")(enableRowHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowReordering)) __obj.updateDynamic("enableRowReordering")(enableRowReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowResizing)) __obj.updateDynamic("enableRowResizing")(enableRowResizing.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRerenderOnSelectionChange)) __obj.updateDynamic("forceRerenderOnSelectionChange")(forceRerenderOnSelectionChange.asInstanceOf[js.Any])
    if (getCellClipboardData != null) __obj.updateDynamic("getCellClipboardData")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* col */ scala.Double) => getCellClipboardData(t0, t1).runNow()))
    if (loadingOptions != null) __obj.updateDynamic("loadingOptions")(loadingOptions.asInstanceOf[js.Any])
    if (maxColumnWidth != null) __obj.updateDynamic("maxColumnWidth")(maxColumnWidth.asInstanceOf[js.Any])
    if (maxRowHeight != null) __obj.updateDynamic("maxRowHeight")(maxRowHeight.asInstanceOf[js.Any])
    if (minColumnWidth != null) __obj.updateDynamic("minColumnWidth")(minColumnWidth.asInstanceOf[js.Any])
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight.asInstanceOf[js.Any])
    if (numFrozenColumns != null) __obj.updateDynamic("numFrozenColumns")(numFrozenColumns.asInstanceOf[js.Any])
    if (numFrozenRows != null) __obj.updateDynamic("numFrozenRows")(numFrozenRows.asInstanceOf[js.Any])
    if (numRows != null) __obj.updateDynamic("numRows")(numRows.asInstanceOf[js.Any])
    if (onColumnWidthChanged != null) __obj.updateDynamic("onColumnWidthChanged")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* size */ scala.Double) => onColumnWidthChanged(t0, t1).runNow()))
    if (onColumnsReordered != null) __obj.updateDynamic("onColumnsReordered")(js.Any.fromFunction3((t0: /* oldIndex */ scala.Double, t1: /* newIndex */ scala.Double, t2: /* length */ scala.Double) => onColumnsReordered(t0, t1, t2).runNow()))
    onCompleteRender.foreach(p => __obj.updateDynamic("onCompleteRender")(p.toJsFn))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: /* success */ scala.Boolean) => onCopy(t0).runNow()))
    if (onFocusedCell != null) __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1((t0: /* focusedCell */ typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates) => onFocusedCell(t0).runNow()))
    if (onRowHeightChanged != null) __obj.updateDynamic("onRowHeightChanged")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* size */ scala.Double) => onRowHeightChanged(t0, t1).runNow()))
    if (onRowsReordered != null) __obj.updateDynamic("onRowsReordered")(js.Any.fromFunction3((t0: /* oldIndex */ scala.Double, t1: /* newIndex */ scala.Double, t2: /* length */ scala.Double) => onRowsReordered(t0, t1, t2).runNow()))
    if (onSelection != null) __obj.updateDynamic("onSelection")(js.Any.fromFunction1((t0: /* selectedRegions */ js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelection(t0).runNow()))
    if (onVisibleCellsChange != null) __obj.updateDynamic("onVisibleCellsChange")(js.Any.fromFunction2((t0: /* rowIndices */ typingsJapgolly.blueprintjsTable.gridMod.IRowIndices, t1: /* columnIndices */ typingsJapgolly.blueprintjsTable.gridMod.IColumnIndices) => onVisibleCellsChange(t0, t1).runNow()))
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (rowHeaderCellRenderer != null) __obj.updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction1((t0: /* rowIndex */ scala.Double) => rowHeaderCellRenderer(t0).runNow()))
    if (rowHeights != null) __obj.updateDynamic("rowHeights")(rowHeights.asInstanceOf[js.Any])
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3((t0: /* region */ typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion, t1: /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.KeyboardEvent, t2: /* coords */ js.UndefOr[typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData]) => selectedRegionTransform(t0, t1, t2).runNow()))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    if (selectionModes != null) __obj.updateDynamic("selectionModes")(selectionModes.asInstanceOf[js.Any])
    if (styledRegionGroups != null) __obj.updateDynamic("styledRegionGroups")(styledRegionGroups.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.tableMod.ITableProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.blueprintjsTable.mod.Table](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.tableMod.ITableProps])
  }
  @JSImport("@blueprintjs/table", "Table")
  @js.native
  object componentImport extends js.Object
  
}

