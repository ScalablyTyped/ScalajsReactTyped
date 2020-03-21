package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.blueprintjsTable.columnHeaderMod.IColumnHeaderProps
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.commonMod.Grid
import typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import typingsJapgolly.blueprintjsTable.locatorMod.ILocator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColumnHeader {
  def apply(
    columnIndexEnd: Double,
    columnIndexStart: Double,
    grid: Grid,
    locator: ILocator,
    cellRenderer: /* columnIndex */ Double => CallbackTo[Element],
    onColumnWidthChanged: (/* index */ Double, /* size */ Double) => Callback,
    onFocusedCell: IFocusedCellCoordinates => Callback,
    onLayoutLock: js.UndefOr[Boolean] => Callback,
    onReordered: (Double, Double, Double) => Callback,
    onReordering: (Double, Double, Double) => Callback,
    onResizeGuide: js.Array[Double] => Callback,
    onSelection: js.Array[IRegion] => Callback,
    defaultColumnWidth: Int | Double = null,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    maxColumnWidth: Int | Double = null,
    measurableElementRef: /* ref */ HTMLElement | Null => Callback = null,
    minColumnWidth: Int | Double = null,
    onSelectionEnd: /* regions */ js.Array[IRegion] => Callback = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => CallbackTo[IRegion] = null,
    selectedRegions: js.Array[IRegion] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IColumnHeaderProps, 
    typingsJapgolly.blueprintjsTable.columnHeaderMod.ColumnHeader, 
    Unit, 
    IColumnHeaderProps
  ] = {
    val __obj = js.Dynamic.literal(columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any])
  
      __obj.updateDynamic("cellRenderer")(js.Any.fromFunction1((t0: /* columnIndex */ scala.Double) => cellRenderer(t0).runNow()))
    __obj.updateDynamic("onColumnWidthChanged")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* size */ scala.Double) => onColumnWidthChanged(t0, t1).runNow()))
    __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates) => onFocusedCell(t0).runNow()))
    __obj.updateDynamic("onLayoutLock")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => onLayoutLock(t0).runNow()))
    __obj.updateDynamic("onReordered")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => onReordered(t0, t1, t2).runNow()))
    __obj.updateDynamic("onReordering")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => onReordering(t0, t1, t2).runNow()))
    __obj.updateDynamic("onResizeGuide")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => onResizeGuide(t0).runNow()))
    __obj.updateDynamic("onSelection")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelection(t0).runNow()))
    if (defaultColumnWidth != null) __obj.updateDynamic("defaultColumnWidth")(defaultColumnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (maxColumnWidth != null) __obj.updateDynamic("maxColumnWidth")(maxColumnWidth.asInstanceOf[js.Any])
    if (measurableElementRef != null) __obj.updateDynamic("measurableElementRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => measurableElementRef(t0).runNow()))
    if (minColumnWidth != null) __obj.updateDynamic("minColumnWidth")(minColumnWidth.asInstanceOf[js.Any])
    if (onSelectionEnd != null) __obj.updateDynamic("onSelectionEnd")(js.Any.fromFunction1((t0: /* regions */ js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelectionEnd(t0).runNow()))
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3((t0: /* region */ typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion, t1: /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.KeyboardEvent, t2: /* coords */ js.UndefOr[typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData]) => selectedRegionTransform(t0, t1, t2).runNow()))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.columnHeaderMod.IColumnHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.columnHeaderMod.ColumnHeader](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.columnHeaderMod.IColumnHeaderProps])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/headers/columnHeader", "ColumnHeader")
  @js.native
  object componentImport extends js.Object
  
}

