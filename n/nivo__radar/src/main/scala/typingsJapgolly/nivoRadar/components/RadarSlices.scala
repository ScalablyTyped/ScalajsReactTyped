package typingsJapgolly.nivoRadar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoRadar.distTypesRadarSlicesMod.RadarSlicesProps
import typingsJapgolly.nivoRadar.distTypesTypesMod.RadarColorMapping
import typingsJapgolly.nivoRadar.distTypesTypesMod.RadarSliceTooltipComponent
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadarSlices {
  
  inline def apply[D /* <: Record[String, Any] */](
    angleStep: Double,
    colorByKey: RadarColorMapping,
    data: js.Array[D],
    formatValue: (Double, String) => String,
    getIndex: D => String | Double,
    keys: js.Array[String],
    radius: Double,
    rotation: Double,
    tooltip: RadarSliceTooltipComponent
  ): Builder[D] = {
    val __props = js.Dynamic.literal(angleStep = angleStep.asInstanceOf[js.Any], colorByKey = colorByKey.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formatValue = js.Any.fromFunction2(formatValue), getIndex = js.Any.fromFunction1(getIndex), keys = keys.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    new Builder[D](js.Array(this.component, __props.asInstanceOf[RadarSlicesProps[D]]))
  }
  
  @JSImport("@nivo/radar/dist/types/RadarSlices", "RadarSlices")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[D /* <: Record[String, Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[D /* <: Record[String, Any] */](p: RadarSlicesProps[D]): Builder[D] = new Builder[D](js.Array(this.component, p.asInstanceOf[js.Any]))
}
