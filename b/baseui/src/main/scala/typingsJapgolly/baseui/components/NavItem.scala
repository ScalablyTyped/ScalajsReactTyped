package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.baseui.anon.EventItem
import typingsJapgolly.baseui.anon.OnSelect
import typingsJapgolly.baseui.anon.TypeofNavItem
import typingsJapgolly.baseui.sideNavigationMod.NavItem.`type`
import typingsJapgolly.baseui.sideNavigationNavItemMod.SharedProps
import typingsJapgolly.baseui.sideNavigationTypesMod.NavItemOverrides
import typingsJapgolly.baseui.sideNavigationTypesMod.NavItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavItem {
  
  inline def apply(defaultProps: OnSelect): Default[js.Object] = {
    val __props = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[TypeofNavItem]))
  }
  
  object Type {
    
    inline def apply(
      $active: Boolean,
      $disabled: Boolean,
      $level: Double,
      $selectable: Boolean,
      item: typingsJapgolly.baseui.sideNavigationTypesMod.Item,
      overrides: NavItemOverrides
    ): Builder = {
      val __props = js.Dynamic.literal($active = $active.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $level = $level.asInstanceOf[js.Any], $selectable = $selectable.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[NavItemProps & SharedProps]))
    }
    
    @JSImport("baseui/side-navigation", "NavItem.type")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[`type`] {
      
      inline def itemMemoizationComparator(value: (NavItemProps, NavItemProps) => Boolean): this.type = set("itemMemoizationComparator", js.Any.fromFunction2(value))
      
      inline def onSelect(value: /* a */ EventItem => Any): this.type = set("onSelect", js.Any.fromFunction1(value))
    }
    
    def withProps(p: NavItemProps & SharedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("baseui/side-navigation", "NavItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TypeofNavItem): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
