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
import typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import typingsJapgolly.blueprintjsTable.gridMod.Grid
import typingsJapgolly.blueprintjsTable.locatorMod.ILocator
import typingsJapgolly.blueprintjsTable.menuContextMod.IMenuContext
import typingsJapgolly.blueprintjsTable.rectMod.Rect
import typingsJapgolly.blueprintjsTable.renderModeMod.RenderMode.BATCH
import typingsJapgolly.blueprintjsTable.renderModeMod.RenderMode.NONE
import typingsJapgolly.blueprintjsTable.tableBodyMod.ITableBodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBody {
  def apply(
    columnIndexEnd: Double,
    columnIndexStart: Double,
    grid: Grid,
    loading: Boolean,
    locator: ILocator,
    rowIndexEnd: Double,
    rowIndexStart: Double,
    viewportRect: Rect,
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => CallbackTo[Element],
    onFocusedCell: IFocusedCellCoordinates => Callback,
    onSelection: js.Array[IRegion] => Callback,
    bodyContextMenuRenderer: /* context */ IMenuContext => CallbackTo[Element] = null,
    className: String = null,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    numFrozenColumns: Int | Double = null,
    numFrozenRows: Int | Double = null,
    onCompleteRender: js.UndefOr[Callback] = js.undefined,
    onSelectionEnd: /* regions */ js.Array[IRegion] => Callback = null,
    renderMode: BATCH | NONE = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => CallbackTo[IRegion] = null,
    selectedRegions: js.Array[IRegion] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ITableBodyProps, 
    typingsJapgolly.blueprintjsTable.tableBodyMod.TableBody, 
    Unit, 
    ITableBodyProps
  ] = {
    val __obj = js.Dynamic.literal(columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any], rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
  
      __obj.updateDynamic("cellRenderer")(js.Any.fromFunction2((t0: /* rowIndex */ scala.Double, t1: /* columnIndex */ scala.Double) => cellRenderer(t0, t1).runNow()))
    __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates) => onFocusedCell(t0).runNow()))
    __obj.updateDynamic("onSelection")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelection(t0).runNow()))
    if (bodyContextMenuRenderer != null) __obj.updateDynamic("bodyContextMenuRenderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.blueprintjsTable.menuContextMod.IMenuContext) => bodyContextMenuRenderer(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (numFrozenColumns != null) __obj.updateDynamic("numFrozenColumns")(numFrozenColumns.asInstanceOf[js.Any])
    if (numFrozenRows != null) __obj.updateDynamic("numFrozenRows")(numFrozenRows.asInstanceOf[js.Any])
    onCompleteRender.foreach(p => __obj.updateDynamic("onCompleteRender")(p.toJsFn))
    if (onSelectionEnd != null) __obj.updateDynamic("onSelectionEnd")(js.Any.fromFunction1((t0: /* regions */ js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelectionEnd(t0).runNow()))
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3((t0: /* region */ typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion, t1: /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.KeyboardEvent, t2: /* coords */ js.UndefOr[typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData]) => selectedRegionTransform(t0, t1, t2).runNow()))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.tableBodyMod.ITableBodyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.tableBodyMod.TableBody](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.tableBodyMod.ITableBodyProps])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
  @js.native
  object componentImport extends js.Object
  
}

