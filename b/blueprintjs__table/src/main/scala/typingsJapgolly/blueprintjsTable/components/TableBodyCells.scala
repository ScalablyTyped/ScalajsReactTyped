package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.libEsmCommonGridMod.Grid
import typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect
import typingsJapgolly.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode.BATCH
import typingsJapgolly.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode.NONE
import typingsJapgolly.blueprintjsTable.libEsmTableBodyCellsMod.ITableBodyCellsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBodyCells {
  
  inline def apply(
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => js.UndefOr[Element],
    columnIndexEnd: Double,
    columnIndexStart: Double,
    grid: Grid,
    loading: Boolean,
    rowIndexEnd: Double,
    rowIndexStart: Double,
    viewportRect: Rect
  ): Builder = {
    val __props = js.Dynamic.literal(cellRenderer = js.Any.fromFunction2(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], rowIndexEnd = rowIndexEnd.asInstanceOf[js.Any], rowIndexStart = rowIndexStart.asInstanceOf[js.Any], viewportRect = viewportRect.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITableBodyCellsProps]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/tableBodyCells", "TableBodyCells")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.libEsmTableBodyCellsMod.TableBodyCells] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def focusedCell(value: FocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
    
    inline def onCompleteRender(value: Callback): this.type = set("onCompleteRender", value.toJsFn)
    
    inline def renderMode(value: BATCH | NONE): this.type = set("renderMode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITableBodyCellsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
