package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.blueprintjsTableStrings.column
import typingsJapgolly.blueprintjsTable.blueprintjsTableStrings.row
import typingsJapgolly.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.libEsmCommonMod.Grid
import typingsJapgolly.blueprintjsTable.libEsmHeadersColumnHeaderMod.IColumnHeaderProps
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDragTypesMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.libEsmLocatorMod.ILocator
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColumnHeader {
  
  inline def apply(
    cellRenderer: /* columnIndex */ Double => Element | Null,
    columnIndexEnd: Double,
    columnIndexStart: Double,
    defaultColumnWidth: Double,
    grid: Grid,
    locator: ILocator,
    maxColumnWidth: Double,
    minColumnWidth: Double,
    onColumnWidthChanged: (/* index */ Double, /* size */ Double) => Callback,
    onFocusedCell: FocusedCellCoordinates => Callback,
    onLayoutLock: js.UndefOr[Boolean] => Callback,
    onReordered: (Double, Double, Double) => Callback,
    onReordering: (Double, Double, Double) => Callback,
    onResizeGuide: js.UndefOr[js.Array[Double]] => Callback,
    onSelection: js.Array[Region] => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(cellRenderer = js.Any.fromFunction1(cellRenderer), columnIndexEnd = columnIndexEnd.asInstanceOf[js.Any], columnIndexStart = columnIndexStart.asInstanceOf[js.Any], defaultColumnWidth = defaultColumnWidth.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], locator = locator.asInstanceOf[js.Any], maxColumnWidth = maxColumnWidth.asInstanceOf[js.Any], minColumnWidth = minColumnWidth.asInstanceOf[js.Any], onColumnWidthChanged = js.Any.fromFunction2((t0: /* index */ Double, t1: /* size */ Double) => (onColumnWidthChanged(t0, t1)).runNow()), onFocusedCell = js.Any.fromFunction1((t0: FocusedCellCoordinates) => onFocusedCell(t0).runNow()), onLayoutLock = js.Any.fromFunction1((t0: js.UndefOr[Boolean]) => onLayoutLock(t0).runNow()), onReordered = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (onReordered(t0, t1, t2)).runNow()), onReordering = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (onReordering(t0, t1, t2)).runNow()), onResizeGuide = js.Any.fromFunction1((t0: js.UndefOr[js.Array[Double]]) => onResizeGuide(t0).runNow()), onSelection = js.Any.fromFunction1((t0: js.Array[Region]) => onSelection(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[IColumnHeaderProps]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/headers/columnHeader", "ColumnHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.libEsmHeadersColumnHeaderMod.ColumnHeader] {
    
    inline def enableMultipleSelection(value: Boolean): this.type = set("enableMultipleSelection", value.asInstanceOf[js.Any])
    
    inline def focusedCell(value: FocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
    
    inline def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def measurableElementRef(value: Ref[HTMLDivElement]): this.type = set("measurableElementRef", value.asInstanceOf[js.Any])
    
    inline def measurableElementRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("measurableElementRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def measurableElementRefNull: this.type = set("measurableElementRef", null)
    
    inline def onMount(value: /* whichHeader */ column | row => Callback): this.type = set("onMount", js.Any.fromFunction1((t0: /* whichHeader */ column | row) => value(t0).runNow()))
    
    inline def onSelectionEnd(value: /* regions */ js.Array[Region] => Callback): this.type = set("onSelectionEnd", js.Any.fromFunction1((t0: /* regions */ js.Array[Region]) => value(t0).runNow()))
    
    inline def selectedRegionTransform(
      value: (/* region */ Region, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => Region
    ): this.type = set("selectedRegionTransform", js.Any.fromFunction3(value))
    
    inline def selectedRegions(value: js.Array[Region]): this.type = set("selectedRegions", value.asInstanceOf[js.Any])
    
    inline def selectedRegionsVarargs(value: Region*): this.type = set("selectedRegions", js.Array(value*))
  }
  
  def withProps(p: IColumnHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
