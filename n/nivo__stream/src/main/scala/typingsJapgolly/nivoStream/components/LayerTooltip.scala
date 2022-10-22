package typingsJapgolly.nivoStream.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamLayerData
import typingsJapgolly.nivoStream.distTypesTypesMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LayerTooltip {
  
  inline def apply(layer: StreamLayerData): Default[js.Object] = {
    val __props = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[TooltipProps]))
  }
  
  @JSImport("@nivo/stream/dist/types/LayerTooltip", "LayerTooltip")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TooltipProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
