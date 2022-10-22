package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libNavbarBrandMod.NavbarBrandProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Brand {
  
  @JSImport("react-bootstrap/lib/Navbar", "Brand")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Brand.type): SharedBuilder_NavbarBrandProps1367224357[typingsJapgolly.reactBootstrap.libNavbarMod.Brand] = new SharedBuilder_NavbarBrandProps1367224357[typingsJapgolly.reactBootstrap.libNavbarMod.Brand](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NavbarBrandProps): SharedBuilder_NavbarBrandProps1367224357[typingsJapgolly.reactBootstrap.libNavbarMod.Brand] = new SharedBuilder_NavbarBrandProps1367224357[typingsJapgolly.reactBootstrap.libNavbarMod.Brand](js.Array(this.component, p.asInstanceOf[js.Any]))
}
