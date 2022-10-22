package typingsJapgolly.nivoRadar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.d3Shape.mod.Arc_
import typingsJapgolly.nivoRadar.anon.EndAngle
import typingsJapgolly.nivoRadar.distTypesRadarSliceMod.RadarSliceProps
import typingsJapgolly.nivoRadar.distTypesTypesMod.RadarSliceTooltipComponent
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadarSlice {
  
  inline def apply[D /* <: Record[String, Any] */](
    arcGenerator: Arc_[Unit, EndAngle],
    colorByKey: Record[String, String],
    datum: D,
    endAngle: Double,
    formatValue: (Double, String) => String,
    index: String | Double,
    keys: js.Array[String],
    radius: Double,
    startAngle: Double,
    tooltip: RadarSliceTooltipComponent
  ): Builder[D] = {
    val __props = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], colorByKey = colorByKey.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], formatValue = js.Any.fromFunction2(formatValue), index = index.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    new Builder[D](js.Array(this.component, __props.asInstanceOf[RadarSliceProps[D]]))
  }
  
  @JSImport("@nivo/radar/dist/types/RadarSlice", "RadarSlice")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[D /* <: Record[String, Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[D /* <: Record[String, Any] */](p: RadarSliceProps[D]): Builder[D] = new Builder[D](js.Array(this.component, p.asInstanceOf[js.Any]))
}
