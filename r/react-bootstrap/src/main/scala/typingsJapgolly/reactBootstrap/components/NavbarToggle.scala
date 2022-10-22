package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libNavbarToggleMod.NavbarToggleProps
import typingsJapgolly.reactBootstrap.libNavbarToggleMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavbarToggle {
  
  @JSImport("react-bootstrap/lib/NavbarToggle", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: NavbarToggle.type): SharedBuilder_NavbarToggleProps1090705564[^] = new SharedBuilder_NavbarToggleProps1090705564[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NavbarToggleProps): SharedBuilder_NavbarToggleProps1090705564[^] = new SharedBuilder_NavbarToggleProps1090705564[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
