package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.distTypesSidebarMod.SidebarPersistentFooterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarPersistentFooter {
  
  @JSImport("wix-style-react", "SidebarPersistentFooter")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SidebarPersistentFooter.type): Default[typingsJapgolly.wixStyleReact.mod.SidebarPersistentFooter] = new Default[typingsJapgolly.wixStyleReact.mod.SidebarPersistentFooter](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SidebarPersistentFooterProps): Default[typingsJapgolly.wixStyleReact.mod.SidebarPersistentFooter] = new Default[typingsJapgolly.wixStyleReact.mod.SidebarPersistentFooter](js.Array(this.component, p.asInstanceOf[js.Any]))
}
