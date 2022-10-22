package typingsJapgolly.nivoRadar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoRadar.distTypesRadarGridMod.RadarGridProps
import typingsJapgolly.nivoRadar.distTypesTypesMod.GridLabelComponent
import typingsJapgolly.nivoRadar.nivoRadarStrings.circular
import typingsJapgolly.nivoRadar.nivoRadarStrings.linear
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadarGrid {
  
  inline def apply[D /* <: Record[String, Any] */](
    angleStep: Double,
    indices: js.Array[String],
    label: GridLabelComponent,
    labelOffset: Double,
    levels: Double,
    radius: Double,
    rotation: Double,
    shape: circular | linear
  ): Builder[D] = {
    val __props = js.Dynamic.literal(angleStep = angleStep.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelOffset = labelOffset.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    new Builder[D](js.Array(this.component, __props.asInstanceOf[RadarGridProps[D]]))
  }
  
  @JSImport("@nivo/radar/dist/types/RadarGrid", "RadarGrid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[D /* <: Record[String, Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[D /* <: Record[String, Any] */](p: RadarGridProps[D]): Builder[D] = new Builder[D](js.Array(this.component, p.asInstanceOf[js.Any]))
}
