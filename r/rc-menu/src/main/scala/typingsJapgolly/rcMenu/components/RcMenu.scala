package typingsJapgolly.rcMenu.components

import typingsJapgolly.rcMenu.esDividerMod.DividerProps
import typingsJapgolly.rcMenu.esInterfaceMod.MenuRef
import typingsJapgolly.rcMenu.esMenuItemGroupMod.MenuItemGroupProps
import typingsJapgolly.rcMenu.esMenuItemMod.MenuItemProps
import typingsJapgolly.rcMenu.esMenuMod.MenuProps
import typingsJapgolly.rcMenu.esSubMenuMod.SubMenuProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcMenu {
  
  object Divider {
    
    @JSImport("rc-menu", "default.Divider")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Divider.type): SharedBuilder_DividerProps1979835233 = new SharedBuilder_DividerProps1979835233(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DividerProps): SharedBuilder_DividerProps1979835233 = new SharedBuilder_DividerProps1979835233(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Item {
    
    @JSImport("rc-menu", "default.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Item.type): SharedBuilder_MenuItemProps_1045348140 = new SharedBuilder_MenuItemProps_1045348140(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: /* props */ MenuItemProps): SharedBuilder_MenuItemProps_1045348140 = new SharedBuilder_MenuItemProps_1045348140(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object ItemGroup {
    
    @JSImport("rc-menu", "default.ItemGroup")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: ItemGroup.type): SharedBuilder_MenuItemGroupProps_112920520 = new SharedBuilder_MenuItemGroupProps_112920520(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MenuItemGroupProps): SharedBuilder_MenuItemGroupProps_112920520 = new SharedBuilder_MenuItemGroupProps_112920520(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object SubMenu {
    
    @JSImport("rc-menu", "default.SubMenu")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: SubMenu.type): SharedBuilder_SubMenuProps1675715244 = new SharedBuilder_SubMenuProps1675715244(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: /* props */ SubMenuProps): SharedBuilder_SubMenuProps1675715244 = new SharedBuilder_SubMenuProps1675715244(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-menu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcMenu.type): SharedBuilder_MenuPropsRefAttributes1076915477[MenuRef] = new SharedBuilder_MenuPropsRefAttributes1076915477[MenuRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuProps & RefAttributes[MenuRef]): SharedBuilder_MenuPropsRefAttributes1076915477[MenuRef] = new SharedBuilder_MenuPropsRefAttributes1076915477[MenuRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
