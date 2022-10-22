package typingsJapgolly.rcDrawer.components

import typingsJapgolly.rcDrawer.esDrawerMod.DrawerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drawer {
  
  @JSImport("rc-drawer/es/Drawer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Drawer.type): SharedBuilder_DrawerProps_658033675 = new SharedBuilder_DrawerProps_658033675(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DrawerProps): SharedBuilder_DrawerProps_658033675 = new SharedBuilder_DrawerProps_658033675(js.Array(this.component, p.asInstanceOf[js.Any]))
}
