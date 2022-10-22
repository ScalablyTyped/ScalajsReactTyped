package typingsJapgolly.nivoTooltip.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoTooltip.distTypesCrosshairMod.CrosshairProps
import typingsJapgolly.nivoTooltip.distTypesTypesMod.CrosshairType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Crosshair {
  
  inline def apply(height: Double, `type`: CrosshairType, width: Double, x: Double, y: Double): Default[js.Object] = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* hasWidthHeightTypeXY */ CrosshairProps]))
  }
  
  @JSImport("@nivo/tooltip", "Crosshair")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasWidthHeightTypeXY */ CrosshairProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
