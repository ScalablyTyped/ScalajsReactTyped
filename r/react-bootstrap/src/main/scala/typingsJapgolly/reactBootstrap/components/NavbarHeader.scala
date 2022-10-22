package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libNavbarHeaderMod.NavbarHeaderProps
import typingsJapgolly.reactBootstrap.libNavbarHeaderMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavbarHeader {
  
  @JSImport("react-bootstrap/lib/NavbarHeader", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: NavbarHeader.type): SharedBuilder_NavbarHeaderProps1084076977[^] = new SharedBuilder_NavbarHeaderProps1084076977[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NavbarHeaderProps): SharedBuilder_NavbarHeaderProps1084076977[^] = new SharedBuilder_NavbarHeaderProps1084076977[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
