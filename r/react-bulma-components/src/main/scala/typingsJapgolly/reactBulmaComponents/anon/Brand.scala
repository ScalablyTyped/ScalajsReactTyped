package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.a
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.span
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import typingsJapgolly.reactBulmaComponents.srcComponentsNavbarMod.NavbarBurgerProps
import typingsJapgolly.reactBulmaComponents.srcComponentsNavbarMod.NavbarContainerProps
import typingsJapgolly.reactBulmaComponents.srcComponentsNavbarMod.NavbarDropdownProps
import typingsJapgolly.reactBulmaComponents.srcComponentsNavbarMod.NavbarItemProps
import typingsJapgolly.reactBulmaComponents.srcComponentsNavbarMod.NavbarLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brand extends StObject {
  
  var Brand: BulmaComponent[js.Object, div]
  
  var Burger: BulmaComponent[NavbarBurgerProps, div]
  
  var Container: BulmaComponent[NavbarContainerProps, div]
  
  var Divider: BulmaComponent[js.Object, div]
  
  var Dropdown: BulmaComponent[NavbarDropdownProps, span]
  
  var Item: BulmaComponent[NavbarItemProps, a]
  
  var Link: BulmaComponent[NavbarLinkProps, span]
  
  var Menu: BulmaComponent[js.Object, div]
}
object Brand {
  
  inline def apply(
    Brand: /* props */ js.Object & (ElementProps[js.Object, div]) => Element,
    Burger: /* props */ NavbarBurgerProps & (ElementProps[NavbarBurgerProps, div]) => Element,
    Container: /* props */ NavbarContainerProps & (ElementProps[NavbarContainerProps, div]) => Element,
    Divider: /* props */ js.Object & (ElementProps[js.Object, div]) => Element,
    Dropdown: /* props */ NavbarDropdownProps & (ElementProps[NavbarDropdownProps, span]) => Element,
    Item: /* props */ NavbarItemProps & (ElementProps[NavbarItemProps, a]) => Element,
    Link: /* props */ NavbarLinkProps & (ElementProps[NavbarLinkProps, span]) => Element,
    Menu: /* props */ js.Object & (ElementProps[js.Object, div]) => Element
  ): Brand = {
    val __obj = js.Dynamic.literal(Brand = js.Any.fromFunction1(Brand), Burger = js.Any.fromFunction1(Burger), Container = js.Any.fromFunction1(Container), Divider = js.Any.fromFunction1(Divider), Dropdown = js.Any.fromFunction1(Dropdown), Item = js.Any.fromFunction1(Item), Link = js.Any.fromFunction1(Link), Menu = js.Any.fromFunction1(Menu))
    __obj.asInstanceOf[Brand]
  }
  
  extension [Self <: Brand](x: Self) {
    
    inline def setBrand(value: /* props */ js.Object & (ElementProps[js.Object, div]) => Element): Self = StObject.set(x, "Brand", js.Any.fromFunction1(value))
    
    inline def setBurger(value: /* props */ NavbarBurgerProps & (ElementProps[NavbarBurgerProps, div]) => Element): Self = StObject.set(x, "Burger", js.Any.fromFunction1(value))
    
    inline def setContainer(value: /* props */ NavbarContainerProps & (ElementProps[NavbarContainerProps, div]) => Element): Self = StObject.set(x, "Container", js.Any.fromFunction1(value))
    
    inline def setDivider(value: /* props */ js.Object & (ElementProps[js.Object, div]) => Element): Self = StObject.set(x, "Divider", js.Any.fromFunction1(value))
    
    inline def setDropdown(value: /* props */ NavbarDropdownProps & (ElementProps[NavbarDropdownProps, span]) => Element): Self = StObject.set(x, "Dropdown", js.Any.fromFunction1(value))
    
    inline def setItem(value: /* props */ NavbarItemProps & (ElementProps[NavbarItemProps, a]) => Element): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setLink(value: /* props */ NavbarLinkProps & (ElementProps[NavbarLinkProps, span]) => Element): Self = StObject.set(x, "Link", js.Any.fromFunction1(value))
    
    inline def setMenu(value: /* props */ js.Object & (ElementProps[js.Object, div]) => Element): Self = StObject.set(x, "Menu", js.Any.fromFunction1(value))
  }
}
