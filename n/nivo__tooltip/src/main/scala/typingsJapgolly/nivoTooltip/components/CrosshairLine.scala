package typingsJapgolly.nivoTooltip.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoTooltip.distTypesCrosshairLineMod.CrosshairLineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CrosshairLine {
  
  inline def apply(x0: Double, x1: Double, y0: Double, y1: Double): Default[js.Object] = {
    val __props = js.Dynamic.literal(x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* hasX0X1Y0Y1 */ CrosshairLineProps]))
  }
  
  @JSImport("@nivo/tooltip/dist/types/CrosshairLine", "CrosshairLine")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasX0X1Y0Y1 */ CrosshairLineProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
