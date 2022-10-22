package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libDropdownMenuMod.DropdownMenuProps
import typingsJapgolly.reactBootstrap.libDropdownMenuMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownMenu {
  
  @JSImport("react-bootstrap/lib/DropdownMenu", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DropdownMenu.type): SharedBuilder_DropdownMenuProps_2030893238[^] = new SharedBuilder_DropdownMenuProps_2030893238[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownMenuProps): SharedBuilder_DropdownMenuProps_2030893238[^] = new SharedBuilder_DropdownMenuProps_2030893238[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
