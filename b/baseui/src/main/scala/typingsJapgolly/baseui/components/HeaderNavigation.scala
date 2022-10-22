package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.baseui.headerNavigationTypesMod.HeaderNavigationOverrides
import typingsJapgolly.baseui.headerNavigationTypesMod.HeaderNavigationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderNavigation {
  
  inline def apply(overrides: HeaderNavigationOverrides): Default[typingsJapgolly.baseui.headerNavigationMod.HeaderNavigation] = {
    val __props = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
    new Default[typingsJapgolly.baseui.headerNavigationMod.HeaderNavigation](js.Array(this.component, __props.asInstanceOf[HeaderNavigationProps]))
  }
  
  @JSImport("baseui/header-navigation", "HeaderNavigation")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: HeaderNavigationProps): Default[typingsJapgolly.baseui.headerNavigationMod.HeaderNavigation] = new Default[typingsJapgolly.baseui.headerNavigationMod.HeaderNavigation](js.Array(this.component, p.asInstanceOf[js.Any]))
}
