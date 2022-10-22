package typingsJapgolly.rcMenu.components

import typingsJapgolly.rcMenu.esSubMenuMod.SubMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SubMenu {
  
  @JSImport("rc-menu", "SubMenu")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SubMenu.type): SharedBuilder_SubMenuProps1675715244 = new SharedBuilder_SubMenuProps1675715244(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* props */ SubMenuProps): SharedBuilder_SubMenuProps1675715244 = new SharedBuilder_SubMenuProps1675715244(js.Array(this.component, p.asInstanceOf[js.Any]))
}
