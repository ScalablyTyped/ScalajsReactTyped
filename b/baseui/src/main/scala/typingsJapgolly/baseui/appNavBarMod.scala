package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.Active
import typingsJapgolly.baseui.anon.Disabled
import typingsJapgolly.baseui.anon.IsFocusVisible
import typingsJapgolly.baseui.appNavBarTypesMod.AppNavBarOverrides
import typingsJapgolly.baseui.appNavBarTypesMod.AppNavBarProps
import typingsJapgolly.baseui.appNavBarTypesMod.NavItem
import typingsJapgolly.baseui.appNavBarTypesMod.UserMenuProps
import typingsJapgolly.baseui.appNavBarUtilsMod.GetUniqueIdentifier
import typingsJapgolly.baseui.baseuiStrings.button
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.li_
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appNavBarMod {
  
  @JSImport("baseui/app-nav-bar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AppNavBar(props: AppNavBarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AppNavBar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object POSITION {
    
    @JSImport("baseui/app-nav-bar", "POSITION.horizontal")
    @js.native
    val horizontal: typingsJapgolly.baseui.baseuiStrings.horizontal = js.native
    
    @JSImport("baseui/app-nav-bar", "POSITION.vertical")
    @js.native
    val vertical: typingsJapgolly.baseui.baseuiStrings.vertical = js.native
  }
  
  @JSImport("baseui/app-nav-bar", "StyledAppName")
  @js.native
  val StyledAppName: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledDesktopMenu")
  @js.native
  val StyledDesktopMenu: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledDesktopMenuContainer")
  @js.native
  val StyledDesktopMenuContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledMainMenuItem")
  @js.native
  val StyledMainMenuItem: StyletronComponent[div, Active] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledPrimaryMenuContainer")
  @js.native
  val StyledPrimaryMenuContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledSecondaryMenuContainer")
  @js.native
  val StyledSecondaryMenuContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledSideMenuButton")
  @js.native
  val StyledSideMenuButton: StyletronComponent[button, IsFocusVisible] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledSpacing")
  @js.native
  val StyledSpacing: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledSubnavContainer")
  @js.native
  val StyledSubnavContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledUserMenuButton")
  @js.native
  val StyledUserMenuButton: StyletronComponent[button, IsFocusVisible] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledUserMenuProfileListItem")
  @js.native
  val StyledUserMenuProfileListItem: StyletronComponent[li_, Disabled] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledUserProfileInfoContainer")
  @js.native
  val StyledUserProfileInfoContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledUserProfilePictureContainer")
  @js.native
  val StyledUserProfilePictureContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/app-nav-bar", "StyledUserProfileTileContainer")
  @js.native
  val StyledUserProfileTileContainer: StyletronComponent[div, js.Object] = js.native
  
  inline def setItemActive(items: js.Array[NavItem], item: NavItem): js.Array[NavItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("setItemActive")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[NavItem]]
  inline def setItemActive(items: js.Array[NavItem], item: NavItem, getUniqueIdentifier: GetUniqueIdentifier): js.Array[NavItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("setItemActive")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any], getUniqueIdentifier.asInstanceOf[js.Any])).asInstanceOf[js.Array[NavItem]]
  
  type AppNavBarOverridesT = AppNavBarOverrides
  
  type AppNavBarPropsT = AppNavBarProps
  
  type NavItemT = NavItem
  
  type UserMenuPropsT = UserMenuProps
}
