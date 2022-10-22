package typingsJapgolly.baseui.components

import typingsJapgolly.baseui.sideNavigationNavMod.default
import typingsJapgolly.baseui.sideNavigationTypesMod.NavigationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Nav {
  
  inline def apply(activeItemId: String, items: js.Array[typingsJapgolly.baseui.sideNavigationTypesMod.Item]): SharedBuilder_NavigationProps_1052119768[default] = {
    val __props = js.Dynamic.literal(activeItemId = activeItemId.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    new SharedBuilder_NavigationProps_1052119768[default](js.Array(this.component, __props.asInstanceOf[NavigationProps]))
  }
  
  @JSImport("baseui/side-navigation/nav", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NavigationProps): SharedBuilder_NavigationProps_1052119768[default] = new SharedBuilder_NavigationProps_1052119768[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
