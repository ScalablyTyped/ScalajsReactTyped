package typingsJapgolly.baseui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Event
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.baseui.anon.IsFocusVisible
import typingsJapgolly.baseui.anon.TypeofNavItem
import typingsJapgolly.baseui.baseuiStrings.a
import typingsJapgolly.baseui.baseuiStrings.item
import typingsJapgolly.baseui.baseuiStrings.itemMemoizationComparator
import typingsJapgolly.baseui.baseuiStrings.onSelect
import typingsJapgolly.baseui.baseuiStrings.overrides
import typingsJapgolly.baseui.sideNavigationTypesMod.NavItemProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.std.Omit
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideNavigationNavItemMod {
  
  object default extends Shortcut {
    
    @JSImport("baseui/side-navigation/nav-item", JSImport.Default)
    @js.native
    val ^ : MemoExoticComponent[TypeofNavItem & Instantiable0[NavItem]] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("baseui/side-navigation/nav-item", "default.type")
    @js.native
    open class `type` () extends NavItem
    
    type _To = MemoExoticComponent[TypeofNavItem & Instantiable0[NavItem]]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: MemoExoticComponent[TypeofNavItem & Instantiable0[NavItem]] = ^
  }
  
  @js.native
  trait NavItem
    extends Component[NavItemProps & SharedProps, js.Object, Any] {
    
    def handleClick(event: Event): Unit = js.native
    
    def handleKeyDown(event: KeyboardEvent): Unit = js.native
  }
  
  type SharedProps = Omit[
    (ComponentProps[StyletronComponent[a, IsFocusVisible]]) & (ComponentProps[TypeofNavItem & Instantiable0[NavItem]]), 
    onSelect | item | overrides | itemMemoizationComparator
  ]
}
