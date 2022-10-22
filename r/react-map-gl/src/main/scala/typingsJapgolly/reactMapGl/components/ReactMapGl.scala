package typingsJapgolly.reactMapGl.components

import typingsJapgolly.reactMapGl.mod.InteractiveMapProps
import typingsJapgolly.reactMapGl.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMapGl {
  
  inline def apply(height: Double | String, width: Double | String): SharedBuilder_InteractiveMapProps193159941[default] = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new SharedBuilder_InteractiveMapProps193159941[default](js.Array(this.component, __props.asInstanceOf[InteractiveMapProps]))
  }
  
  @JSImport("react-map-gl", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: InteractiveMapProps): SharedBuilder_InteractiveMapProps193159941[default] = new SharedBuilder_InteractiveMapProps193159941[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
