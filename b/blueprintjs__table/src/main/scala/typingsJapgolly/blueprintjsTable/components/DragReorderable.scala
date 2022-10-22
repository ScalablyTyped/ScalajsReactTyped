package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDragTypesMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.libEsmInteractionsReorderableMod.IDragReorderable
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DragReorderable {
  
  inline def apply(
    locateClick: MouseEvent => Region,
    locateDrag: (MouseEvent, ICoordinateData) => js.UndefOr[Double],
    onFocusedCell: FocusedCellCoordinates => Callback,
    onReordered: (Double, Double, Double) => Callback,
    onReordering: (Double, Double, Double) => Callback,
    onSelection: js.Array[Region] => Callback,
    toRegion: (Double, js.UndefOr[Double]) => Region
  ): Builder = {
    val __props = js.Dynamic.literal(locateClick = js.Any.fromFunction1(locateClick), locateDrag = js.Any.fromFunction2(locateDrag), onFocusedCell = js.Any.fromFunction1((t0: FocusedCellCoordinates) => onFocusedCell(t0).runNow()), onReordered = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (onReordered(t0, t1, t2)).runNow()), onReordering = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (onReordering(t0, t1, t2)).runNow()), onSelection = js.Any.fromFunction1((t0: js.Array[Region]) => onSelection(t0).runNow()), toRegion = js.Any.fromFunction2(toRegion))
    new Builder(js.Array(this.component, __props.asInstanceOf[IDragReorderable]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.blueprintjsTable.libEsmInteractionsReorderableMod.DragReorderable
        ] {
    
    inline def disabled(value: Boolean | (js.Function1[/* event */ MouseEvent, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledFunction1(value: /* event */ MouseEvent => Boolean): this.type = set("disabled", js.Any.fromFunction1(value))
    
    inline def selectedRegions(value: js.Array[Region]): this.type = set("selectedRegions", value.asInstanceOf[js.Any])
    
    inline def selectedRegionsVarargs(value: Region*): this.type = set("selectedRegions", js.Array(value*))
  }
  
  def withProps(p: IDragReorderable): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
