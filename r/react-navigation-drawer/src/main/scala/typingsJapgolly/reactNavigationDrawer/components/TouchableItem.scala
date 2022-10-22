package typingsJapgolly.reactNavigationDrawer.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcViewsTouchableItemMod.Props
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcViewsTouchableItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TouchableItem {
  
  inline def apply(borderless: Boolean, pressColor: String): Default[default] = {
    val __props = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any], pressColor = pressColor.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-navigation-drawer/lib/typescript/src/views/TouchableItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
