package typingsJapgolly.reactFoundation.components

import typingsJapgolly.reactFoundation.componentsMenuMod.MenuItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuItem {
  
  @JSImport("react-foundation", "MenuItem")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MenuItem.type): SharedBuilder_MenuItemProps1613900525 = new SharedBuilder_MenuItemProps1613900525(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuItemProps): SharedBuilder_MenuItemProps1613900525 = new SharedBuilder_MenuItemProps1613900525(js.Array(this.component, p.asInstanceOf[js.Any]))
}
