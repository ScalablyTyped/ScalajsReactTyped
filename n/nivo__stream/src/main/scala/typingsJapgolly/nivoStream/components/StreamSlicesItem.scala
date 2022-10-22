package typingsJapgolly.nivoStream.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoStream.distTypesStreamSlicesItemMod.StreamSlicesItemProps
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamDatum
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamSliceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StreamSlicesItem {
  
  inline def apply[RawDatum /* <: StreamDatum */](
    height: Double,
    slice: StreamSliceData,
    tooltip: typingsJapgolly.nivoStream.distTypesTypesMod.StackTooltip
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[StreamSlicesItemProps[RawDatum]]))
  }
  
  @JSImport("@nivo/stream/dist/types/StreamSlicesItem", "StreamSlicesItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum /* <: StreamDatum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[RawDatum /* <: StreamDatum */](p: StreamSlicesItemProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
