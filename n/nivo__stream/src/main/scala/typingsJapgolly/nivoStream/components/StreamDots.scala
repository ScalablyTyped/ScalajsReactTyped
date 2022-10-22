package typingsJapgolly.nivoStream.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoStream.distTypesStreamDotsMod.StreamDotsProps
import typingsJapgolly.nivoStream.distTypesTypesMod.DotComponent
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamDatum
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamLayerDatum
import typingsJapgolly.nivoStream.nivoStreamStrings.center
import typingsJapgolly.nivoStream.nivoStreamStrings.end
import typingsJapgolly.nivoStream.nivoStreamStrings.start
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StreamDots {
  
  inline def apply[RawDatum /* <: StreamDatum */](
    color: String,
    data: js.Array[StreamLayerDatum],
    dotComponent: Exclude[js.UndefOr[DotComponent], Unit],
    getBorderColor: StreamLayerDatum => String,
    getBorderWidth: StreamLayerDatum => Double,
    getColor: StreamLayerDatum => String,
    getSize: StreamLayerDatum => Double,
    id: String | Double,
    position: start | center | end
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dotComponent = dotComponent.asInstanceOf[js.Any], getBorderColor = js.Any.fromFunction1(getBorderColor), getBorderWidth = js.Any.fromFunction1(getBorderWidth), getColor = js.Any.fromFunction1(getColor), getSize = js.Any.fromFunction1(getSize), id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[StreamDotsProps[RawDatum]]))
  }
  
  @JSImport("@nivo/stream/dist/types/StreamDots", "StreamDots")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum /* <: StreamDatum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[RawDatum /* <: StreamDatum */](p: StreamDotsProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
