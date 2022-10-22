package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.EventItem
import typingsJapgolly.baseui.sideNavigationTypesMod.NavItemProps
import typingsJapgolly.baseui.sideNavigationTypesMod.NavigationOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_NavigationProps_1052119768[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def activePredicate(
    value: (/* item */ typingsJapgolly.baseui.sideNavigationTypesMod.Item, /* activeItemId */ String) => Boolean
  ): this.type = set("activePredicate", js.Any.fromFunction2(value))
  
  inline def activePredicateNull: this.type = set("activePredicate", null)
  
  inline def itemMemoizationComparator(value: (/* b */ NavItemProps, /* a */ NavItemProps) => Boolean): this.type = set("itemMemoizationComparator", js.Any.fromFunction2(value))
  
  inline def mapItem(
    value: /* item */ typingsJapgolly.baseui.sideNavigationTypesMod.Item => typingsJapgolly.baseui.sideNavigationTypesMod.Item
  ): this.type = set("mapItem", js.Any.fromFunction1(value))
  
  inline def mapItemNull: this.type = set("mapItem", null)
  
  inline def onChange(value: /* a */ EventItem => Any): this.type = set("onChange", js.Any.fromFunction1(value))
  
  inline def overrides(value: NavigationOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
}
