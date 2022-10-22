package typingsJapgolly.reactMapGl.components

import typingsJapgolly.reactMapGl.mod.InteractiveMapProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InteractiveMap {
  
  inline def apply(height: Double | String, width: Double | String): SharedBuilder_InteractiveMapProps193159941[typingsJapgolly.reactMapGl.mod.InteractiveMap] = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new SharedBuilder_InteractiveMapProps193159941[typingsJapgolly.reactMapGl.mod.InteractiveMap](js.Array(this.component, __props.asInstanceOf[InteractiveMapProps]))
  }
  
  @JSImport("react-map-gl", "InteractiveMap")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: InteractiveMapProps): SharedBuilder_InteractiveMapProps193159941[typingsJapgolly.reactMapGl.mod.InteractiveMap] = new SharedBuilder_InteractiveMapProps193159941[typingsJapgolly.reactMapGl.mod.InteractiveMap](js.Array(this.component, p.asInstanceOf[js.Any]))
}
