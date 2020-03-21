package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.gridMod.Grid
import typingsJapgolly.blueprintjsTable.rectMod.Rect
import typingsJapgolly.blueprintjsTable.renderModeMod.RenderMode.BATCH
import typingsJapgolly.blueprintjsTable.renderModeMod.RenderMode.NONE
import typingsJapgolly.blueprintjsTable.tableBodyCellsMod.ITableBodyCellsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBodyCells {
  def apply(
    columnIndexEnd: Double,
    columnIndexStart: Double,
    grid: Grid,
    loading: Boolean,
    rowIndexEnd: Double,
    rowIndexStart: Double,
    viewportRect: Rect,
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => CallbackTo[Element],
    className: String = null,
    focusedCell: IFocusedCellCoordinates = null,
    onCompleteRender: js.UndefOr[Callback] = js.undefined,
    renderMode: BATCH | NONE = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ITableBodyCellsProps, 
    typingsJapgolly.blueprintjsTable.tableBodyCellsMod.TableBodyCells, 
    Unit, 
    ITableBodyCellsProps
  ] = {
    val __obj = js.Dynamic.literal(columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
  
      __obj.updateDynamic("cellRenderer")(js.Any.fromFunction2((t0: /* rowIndex */ scala.Double, t1: /* columnIndex */ scala.Double) => cellRenderer(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    onCompleteRender.foreach(p => __obj.updateDynamic("onCompleteRender")(p.toJsFn))
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.tableBodyCellsMod.ITableBodyCellsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.tableBodyCellsMod.TableBodyCells](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.tableBodyCellsMod.ITableBodyCellsProps])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/tableBodyCells", "TableBodyCells")
  @js.native
  object componentImport extends js.Object
  
}

