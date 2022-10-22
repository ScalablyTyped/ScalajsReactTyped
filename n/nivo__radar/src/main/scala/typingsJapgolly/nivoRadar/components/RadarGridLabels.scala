package typingsJapgolly.nivoRadar.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoRadar.distTypesRadarGridLabelsMod.RadarGridLabelsProps
import typingsJapgolly.nivoRadar.distTypesTypesMod.GridLabelComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadarGridLabels {
  
  inline def apply(
    angles: js.Array[Double],
    indices: js.Array[String],
    label: GridLabelComponent,
    labelOffset: Double,
    radius: Double
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(angles = angles.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelOffset = labelOffset.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[RadarGridLabelsProps]))
  }
  
  @JSImport("@nivo/radar/dist/types/RadarGridLabels", "RadarGridLabels")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RadarGridLabelsProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
