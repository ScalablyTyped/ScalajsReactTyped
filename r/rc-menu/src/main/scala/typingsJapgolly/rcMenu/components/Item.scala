package typingsJapgolly.rcMenu.components

import typingsJapgolly.rcMenu.esMenuItemMod.MenuItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  @JSImport("rc-menu", "Item")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Item.type): SharedBuilder_MenuItemProps_1045348140 = new SharedBuilder_MenuItemProps_1045348140(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* props */ MenuItemProps): SharedBuilder_MenuItemProps_1045348140 = new SharedBuilder_MenuItemProps_1045348140(js.Array(this.component, p.asInstanceOf[js.Any]))
}
