package typingsJapgolly.rcMenu

import typingsJapgolly.rcMenu.esDividerMod.DividerProps
import typingsJapgolly.rcMenu.esInterfaceMod.MenuRef
import typingsJapgolly.rcMenu.esMenuItemGroupMod.MenuItemGroupProps
import typingsJapgolly.rcMenu.esMenuItemMod.MenuItemProps
import typingsJapgolly.rcMenu.esMenuMod.MenuProps
import typingsJapgolly.rcMenu.esSubMenuMod.SubMenuProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-menu", JSImport.Default)
  @js.native
  val default: MenuType = js.native
  
  inline def Divider(hasClassNameStyle: DividerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")(hasClassNameStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Item(props: MenuItemProps): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(props.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  
  inline def ItemGroup(hasChildrenProps: MenuItemGroupProps): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ItemGroup")(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  
  inline def MenuItem(props: MenuItemProps): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItem")(props.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  
  inline def MenuItemGroup(hasChildrenProps: MenuItemGroupProps): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItemGroup")(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  
  inline def SubMenu(props: SubMenuProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SubMenu")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useFullPath(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullPath")().asInstanceOf[js.Array[String]]
  inline def useFullPath(eventKey: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullPath")(eventKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @js.native
  trait MenuType
    extends StObject
       with ForwardRefExoticComponent[MenuProps & RefAttributes[MenuRef]] {
    
    var Divider: js.Function1[/* hasClassNameStyle */ DividerProps, Element] = js.native
    
    var Item: js.Function1[/* props */ MenuItemProps, japgolly.scalajs.react.facade.React.Element] = js.native
    
    var ItemGroup: js.Function1[
        /* hasChildrenProps */ MenuItemGroupProps, 
        japgolly.scalajs.react.facade.React.Element
      ] = js.native
    
    var SubMenu: js.Function1[/* props */ SubMenuProps, Element] = js.native
  }
}
