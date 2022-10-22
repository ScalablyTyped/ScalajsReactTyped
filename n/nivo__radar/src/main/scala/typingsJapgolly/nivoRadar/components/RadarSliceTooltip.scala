package typingsJapgolly.nivoRadar.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoRadar.distTypesTypesMod.RadarSliceTooltipDatum
import typingsJapgolly.nivoRadar.distTypesTypesMod.RadarSliceTooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadarSliceTooltip {
  
  inline def apply(data: js.Array[RadarSliceTooltipDatum], index: String | Double): Default[js.Object] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[RadarSliceTooltipProps]))
  }
  
  @JSImport("@nivo/radar/dist/types/RadarSliceTooltip", "RadarSliceTooltip")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RadarSliceTooltipProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
