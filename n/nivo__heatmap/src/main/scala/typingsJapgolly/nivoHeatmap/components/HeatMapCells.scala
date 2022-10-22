package typingsJapgolly.nivoHeatmap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoHeatmap.distTypesHeatMapCellsMod.HeatMapCellsProps
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.CellComponent
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.CellShape
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.ComputedCell
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.TooltipComponent
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeatMapCells {
  
  inline def apply[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    borderRadius: NonNullable[js.UndefOr[Double]],
    borderWidth: NonNullable[js.UndefOr[Double]],
    cellComponent: NonNullable[js.UndefOr[CellShape | CellComponent[Datum]]],
    cells: js.Array[ComputedCell[Datum]],
    enableLabels: NonNullable[js.UndefOr[Boolean]],
    isInteractive: NonNullable[js.UndefOr[Boolean]],
    setActiveCell: js.UndefOr[ComputedCell[Datum]] => Callback,
    tooltip: NonNullable[js.UndefOr[TooltipComponent[Datum]]]
  ): Builder[Datum, ExtraProps] = {
    val __props = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], cellComponent = cellComponent.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], enableLabels = enableLabels.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], setActiveCell = js.Any.fromFunction1((t0: js.UndefOr[ComputedCell[Datum]]) => setActiveCell(t0).runNow()), tooltip = tooltip.asInstanceOf[js.Any])
    new Builder[Datum, ExtraProps](js.Array(this.component, __props.asInstanceOf[HeatMapCellsProps[Datum, ExtraProps]]))
  }
  
  @JSImport("@nivo/heatmap/dist/types/HeatMapCells", "HeatMapCells")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onClick(value: (/* cell */ ComputedCell[Datum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* cell */ ComputedCell[Datum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(value: (/* cell */ ComputedCell[Datum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* cell */ ComputedCell[Datum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(value: (/* cell */ ComputedCell[Datum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* cell */ ComputedCell[Datum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(value: (/* cell */ ComputedCell[Datum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* cell */ ComputedCell[Datum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
  }
  
  def withProps[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](p: HeatMapCellsProps[Datum, ExtraProps]): Builder[Datum, ExtraProps] = new Builder[Datum, ExtraProps](js.Array(this.component, p.asInstanceOf[js.Any]))
}
