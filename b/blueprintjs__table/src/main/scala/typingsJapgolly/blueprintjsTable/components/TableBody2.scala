package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.libEsmCommonGridMod.Grid
import typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect
import typingsJapgolly.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode.BATCH
import typingsJapgolly.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode.NONE
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDragTypesMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.libEsmInteractionsMenusMenuContextMod.IMenuContext
import typingsJapgolly.blueprintjsTable.libEsmLocatorMod.ILocator
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import typingsJapgolly.blueprintjsTable.libEsmTableBodyMod.ITableBodyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBody2 {
  
  inline def apply(
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => js.UndefOr[Element],
    columnIndexEnd: Double,
    columnIndexStart: Double,
    grid: Grid,
    loading: Boolean,
    locator: ILocator,
    onFocusedCell: FocusedCellCoordinates => Callback,
    onSelection: js.Array[Region] => Callback,
    rowIndexEnd: Double,
    rowIndexStart: Double,
    viewportRect: Rect
  ): Builder = {
    val __props = js.Dynamic.literal(cellRenderer = js.Any.fromFunction2(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any], onFocusedCell = js.Any.fromFunction1((t0: FocusedCellCoordinates) => onFocusedCell(t0).runNow()), onSelection = js.Any.fromFunction1((t0: js.Array[Region]) => onSelection(t0).runNow()), rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITableBodyProps]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/tableBody2", "TableBody2")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.libEsmTableBody2Mod.TableBody2] {
    
    inline def bodyContextMenuRenderer(value: /* context */ IMenuContext => typingsJapgolly.react.mod.global.JSX.Element): this.type = set("bodyContextMenuRenderer", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def enableMultipleSelection(value: Boolean): this.type = set("enableMultipleSelection", value.asInstanceOf[js.Any])
    
    inline def focusedCell(value: FocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
    
    inline def numFrozenColumns(value: Double): this.type = set("numFrozenColumns", value.asInstanceOf[js.Any])
    
    inline def numFrozenRows(value: Double): this.type = set("numFrozenRows", value.asInstanceOf[js.Any])
    
    inline def onCompleteRender(value: Callback): this.type = set("onCompleteRender", value.toJsFn)
    
    inline def onSelectionEnd(value: /* regions */ js.Array[Region] => Callback): this.type = set("onSelectionEnd", js.Any.fromFunction1((t0: /* regions */ js.Array[Region]) => value(t0).runNow()))
    
    inline def renderMode(value: BATCH | NONE): this.type = set("renderMode", value.asInstanceOf[js.Any])
    
    inline def selectedRegionTransform(
      value: (/* region */ Region, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => Region
    ): this.type = set("selectedRegionTransform", js.Any.fromFunction3(value))
    
    inline def selectedRegions(value: js.Array[Region]): this.type = set("selectedRegions", value.asInstanceOf[js.Any])
    
    inline def selectedRegionsVarargs(value: Region*): this.type = set("selectedRegions", js.Array(value*))
  }
  
  def withProps(p: ITableBodyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
