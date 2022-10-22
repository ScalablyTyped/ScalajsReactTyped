package typingsJapgolly.antd.components

import typingsJapgolly.antd.libMenuMenuItemMod.MenuItemProps
import typingsJapgolly.antd.libMenuMenuItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuItem {
  
  @JSImport("antd/lib/menu/MenuItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MenuItem.type): SharedBuilder_MenuItemProps111955261[default] = new SharedBuilder_MenuItemProps111955261[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuItemProps): SharedBuilder_MenuItemProps111955261[default] = new SharedBuilder_MenuItemProps111955261[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
