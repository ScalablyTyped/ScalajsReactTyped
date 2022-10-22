package typingsJapgolly.rcMenu.components

import typingsJapgolly.rcMenu.esMenuItemGroupMod.MenuItemGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuItemGroup {
  
  @JSImport("rc-menu", "MenuItemGroup")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MenuItemGroup.type): SharedBuilder_MenuItemGroupProps_112920520 = new SharedBuilder_MenuItemGroupProps_112920520(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuItemGroupProps): SharedBuilder_MenuItemGroupProps_112920520 = new SharedBuilder_MenuItemGroupProps_112920520(js.Array(this.component, p.asInstanceOf[js.Any]))
}
