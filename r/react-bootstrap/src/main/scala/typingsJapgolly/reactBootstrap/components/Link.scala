package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libNavbarMod.NavbarLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  inline def apply(href: String): SharedBuilder_NavbarLinkProps_1625628199[typingsJapgolly.reactBootstrap.libNavbarMod.Link] = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    new SharedBuilder_NavbarLinkProps_1625628199[typingsJapgolly.reactBootstrap.libNavbarMod.Link](js.Array(this.component, __props.asInstanceOf[NavbarLinkProps]))
  }
  
  @JSImport("react-bootstrap/lib/Navbar", "Link")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NavbarLinkProps): SharedBuilder_NavbarLinkProps_1625628199[typingsJapgolly.reactBootstrap.libNavbarMod.Link] = new SharedBuilder_NavbarLinkProps_1625628199[typingsJapgolly.reactBootstrap.libNavbarMod.Link](js.Array(this.component, p.asInstanceOf[js.Any]))
}
