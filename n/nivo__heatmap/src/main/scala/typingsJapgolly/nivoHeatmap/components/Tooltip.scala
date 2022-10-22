package typingsJapgolly.nivoHeatmap.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.ComputedCell
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.DefaultHeatMapDatum
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  inline def apply(cell: ComputedCell[DefaultHeatMapDatum]): Default[js.Object] = {
    val __props = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[TooltipProps[DefaultHeatMapDatum]]))
  }
  
  @JSImport("@nivo/heatmap", "commonDefaultProps.tooltip")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TooltipProps[DefaultHeatMapDatum]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
