package typingsJapgolly.nivoHeatmap.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.ComputedCell
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeatMapTooltip {
  
  inline def apply[Datum /* <: HeatMapDatum */](cell: ComputedCell[Datum]): Builder[Datum] = {
    val __props = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    new Builder[Datum](js.Array(this.component, __props.asInstanceOf[TooltipProps[Datum]]))
  }
  
  @JSImport("@nivo/heatmap/dist/types/HeatMapTooltip", "HeatMapTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum /* <: HeatMapDatum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[Datum /* <: HeatMapDatum */](p: TooltipProps[Datum]): Builder[Datum] = new Builder[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
