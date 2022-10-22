package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.baseui.menuNestedMenusMod.NestedMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NestedMenus {
  
  @JSImport("baseui/menu", "NestedMenus")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: NestedMenus.type): Default[typingsJapgolly.baseui.menuMod.NestedMenus] = new Default[typingsJapgolly.baseui.menuMod.NestedMenus](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NestedMenuProps): Default[typingsJapgolly.baseui.menuMod.NestedMenus] = new Default[typingsJapgolly.baseui.menuMod.NestedMenus](js.Array(this.component, p.asInstanceOf[js.Any]))
}
