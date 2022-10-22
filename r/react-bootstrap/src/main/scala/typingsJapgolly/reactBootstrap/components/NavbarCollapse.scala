package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libNavbarCollapseMod.NavbarCollapseProps
import typingsJapgolly.reactBootstrap.libNavbarCollapseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavbarCollapse {
  
  @JSImport("react-bootstrap/lib/NavbarCollapse", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: NavbarCollapse.type): SharedBuilder_NavbarCollapseProps_517485509[^] = new SharedBuilder_NavbarCollapseProps_517485509[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NavbarCollapseProps): SharedBuilder_NavbarCollapseProps_517485509[^] = new SharedBuilder_NavbarCollapseProps_517485509[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
