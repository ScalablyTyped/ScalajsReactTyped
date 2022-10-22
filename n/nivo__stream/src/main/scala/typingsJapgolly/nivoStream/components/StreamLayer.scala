package typingsJapgolly.nivoStream.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfigCustomFunction
import typingsJapgolly.nivoStream.distTypesStreamLayerMod.StreamLayerProps
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamDatum
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamLayerData
import typingsJapgolly.nivoStream.distTypesTypesMod.Tooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StreamLayer {
  
  inline def apply[RawDatum /* <: StreamDatum */](
    borderWidth: Double,
    fillOpacity: Double,
    getBorderColor: InheritedColorConfigCustomFunction[StreamLayerData],
    isInteractive: Boolean,
    layer: StreamLayerData,
    tooltip: Tooltip
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], getBorderColor = getBorderColor.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[StreamLayerProps[RawDatum]]))
  }
  
  @JSImport("@nivo/stream/dist/types/StreamLayer", "StreamLayer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum /* <: StreamDatum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[RawDatum /* <: StreamDatum */](p: StreamLayerProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
