package typingsJapgolly.nivoRadar.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoRadar.distTypesTypesMod.GridLabelProps
import typingsJapgolly.nivoRadar.nivoRadarStrings.end
import typingsJapgolly.nivoRadar.nivoRadarStrings.middle
import typingsJapgolly.nivoRadar.nivoRadarStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadarGridLabel {
  
  inline def apply(
    anchor: start | middle | end,
    angle: Double,
    animated: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedProps<{  transform :string}> */ Any,
    id: String,
    x: Double,
    y: Double
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[GridLabelProps]))
  }
  
  @JSImport("@nivo/radar/dist/types/RadarGridLabel", "RadarGridLabel")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: GridLabelProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
