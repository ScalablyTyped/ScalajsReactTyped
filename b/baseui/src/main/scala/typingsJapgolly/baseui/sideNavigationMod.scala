package typingsJapgolly.baseui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.anon.ActiveItemId
import typingsJapgolly.baseui.anon.IsFocusVisible
import typingsJapgolly.baseui.anon.SharedPropsitemanyundefin
import typingsJapgolly.baseui.anon.TypeofNavItem
import typingsJapgolly.baseui.baseuiStrings.a
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.li_
import typingsJapgolly.baseui.baseuiStrings.nav
import typingsJapgolly.baseui.baseuiStrings.ul
import typingsJapgolly.baseui.sideNavigationNavMod.default
import typingsJapgolly.baseui.sideNavigationTypesMod.SharedProps
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideNavigationMod {
  
  object NavItem extends Shortcut {
    
    @JSImport("baseui/side-navigation", "NavItem")
    @js.native
    val ^ : MemoExoticComponent[
        TypeofNavItem & Instantiable0[typingsJapgolly.baseui.sideNavigationNavItemMod.NavItem]
      ] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("baseui/side-navigation", "NavItem.type")
    @js.native
    open class `type` ()
      extends typingsJapgolly.baseui.sideNavigationNavItemMod.NavItem
    
    type _To = MemoExoticComponent[
        TypeofNavItem & Instantiable0[typingsJapgolly.baseui.sideNavigationNavItemMod.NavItem]
      ]
    
    /* This means you don't have to write `^`, but can instead just say `NavItem.foo` */
    override def _to: MemoExoticComponent[
        TypeofNavItem & Instantiable0[typingsJapgolly.baseui.sideNavigationNavItemMod.NavItem]
      ] = ^
  }
  
  @JSImport("baseui/side-navigation", "Navigation")
  @js.native
  open class Navigation () extends default
  /* static members */
  object Navigation {
    
    @JSImport("baseui/side-navigation", "Navigation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/side-navigation", "Navigation.defaultProps")
    @js.native
    def defaultProps: ActiveItemId = js.native
    inline def defaultProps_=(x: ActiveItemId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/side-navigation", "StyledNavItem")
  @js.native
  val StyledNavItem: StyletronComponent[div, SharedPropsitemanyundefin] = js.native
  
  @JSImport("baseui/side-navigation", "StyledNavItemContainer")
  @js.native
  val StyledNavItemContainer: StyletronComponent[li_, js.Object] = js.native
  
  @JSImport("baseui/side-navigation", "StyledNavItemElement")
  @js.native
  val StyledNavItemElement: StyletronComponent[div, SharedProps] = js.native
  
  @JSImport("baseui/side-navigation", "StyledNavLink")
  @js.native
  val StyledNavLink: StyletronComponent[a, IsFocusVisible] = js.native
  
  @JSImport("baseui/side-navigation", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[nav, SharedProps] = js.native
  
  @JSImport("baseui/side-navigation", "StyledSubNavContainer")
  @js.native
  val StyledSubNavContainer: StyletronComponent[ul, js.Object] = js.native
}
