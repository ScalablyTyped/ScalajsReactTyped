package typingsJapgolly.nivoCore.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoCore.mod.CartesianMarkerProps
import typingsJapgolly.nivoCore.mod.CartesianMarkersProps
import typingsJapgolly.nivoCore.mod.DatumValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CartesianMarkers {
  
  inline def apply(
    height: Double,
    markers: js.Array[CartesianMarkerProps[DatumValue | DatumValue]],
    width: Double,
    xScale: DatumValue => Double,
    yScale: DatumValue => Double
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xScale = js.Any.fromFunction1(xScale), yScale = js.Any.fromFunction1(yScale))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* props */ CartesianMarkersProps[DatumValue, DatumValue]]))
  }
  
  @JSImport("@nivo/core", "CartesianMarkers")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* props */ CartesianMarkersProps[DatumValue, DatumValue]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
