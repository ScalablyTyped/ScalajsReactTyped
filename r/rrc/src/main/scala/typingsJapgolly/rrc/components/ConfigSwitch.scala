package typingsJapgolly.rrc.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rrc.anon.Pathname
import typingsJapgolly.rrc.mod.RouteConfiguration
import typingsJapgolly.rrc.mod.SwitchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigSwitch {
  
  inline def apply(
    location: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptorObject */ Any) & Pathname,
    routes: js.Array[RouteConfiguration]
  ): Default[typingsJapgolly.rrc.mod.ConfigSwitch] = {
    val __props = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    new Default[typingsJapgolly.rrc.mod.ConfigSwitch](js.Array(this.component, __props.asInstanceOf[SwitchProps]))
  }
  
  @JSImport("rrc", "ConfigSwitch")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SwitchProps): Default[typingsJapgolly.rrc.mod.ConfigSwitch] = new Default[typingsJapgolly.rrc.mod.ConfigSwitch](js.Array(this.component, p.asInstanceOf[js.Any]))
}
