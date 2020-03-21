package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.commonMod.Grid
import typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import typingsJapgolly.blueprintjsTable.locatorMod.ILocator
import typingsJapgolly.blueprintjsTable.rowHeaderMod.IRowHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RowHeader {
  def apply(
    grid: Grid,
    locator: ILocator,
    rowIndexEnd: Double,
    rowIndexStart: Double,
    onFocusedCell: IFocusedCellCoordinates => Callback,
    onLayoutLock: js.UndefOr[Boolean] => Callback,
    onReordered: (Double, Double, Double) => Callback,
    onReordering: (Double, Double, Double) => Callback,
    onResizeGuide: js.Array[Double] => Callback,
    onRowHeightChanged: (/* index */ Double, /* size */ Double) => Callback,
    onSelection: js.Array[IRegion] => Callback,
    defaultRowHeight: Int | Double = null,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    maxRowHeight: Int | Double = null,
    minRowHeight: Int | Double = null,
    onSelectionEnd: /* regions */ js.Array[IRegion] => Callback = null,
    rowHeaderCellRenderer: /* rowIndex */ Double => CallbackTo[Element] = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => CallbackTo[IRegion] = null,
    selectedRegions: js.Array[IRegion] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IRowHeaderProps, 
    typingsJapgolly.blueprintjsTable.rowHeaderMod.RowHeader, 
    Unit, 
    IRowHeaderProps
  ] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any], rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates) => onFocusedCell(t0).runNow()))
    __obj.updateDynamic("onLayoutLock")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => onLayoutLock(t0).runNow()))
    __obj.updateDynamic("onReordered")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => onReordered(t0, t1, t2).runNow()))
    __obj.updateDynamic("onReordering")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => onReordering(t0, t1, t2).runNow()))
    __obj.updateDynamic("onResizeGuide")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => onResizeGuide(t0).runNow()))
    __obj.updateDynamic("onRowHeightChanged")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* size */ scala.Double) => onRowHeightChanged(t0, t1).runNow()))
    __obj.updateDynamic("onSelection")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelection(t0).runNow()))
    if (defaultRowHeight != null) __obj.updateDynamic("defaultRowHeight")(defaultRowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (maxRowHeight != null) __obj.updateDynamic("maxRowHeight")(maxRowHeight.asInstanceOf[js.Any])
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight.asInstanceOf[js.Any])
    if (onSelectionEnd != null) __obj.updateDynamic("onSelectionEnd")(js.Any.fromFunction1((t0: /* regions */ js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelectionEnd(t0).runNow()))
    if (rowHeaderCellRenderer != null) __obj.updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction1((t0: /* rowIndex */ scala.Double) => rowHeaderCellRenderer(t0).runNow()))
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3((t0: /* region */ typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion, t1: /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.KeyboardEvent, t2: /* coords */ js.UndefOr[typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData]) => selectedRegionTransform(t0, t1, t2).runNow()))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.rowHeaderMod.IRowHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.rowHeaderMod.RowHeader](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.rowHeaderMod.IRowHeaderProps])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/headers/rowHeader", "RowHeader")
  @js.native
  object componentImport extends js.Object
  
}

