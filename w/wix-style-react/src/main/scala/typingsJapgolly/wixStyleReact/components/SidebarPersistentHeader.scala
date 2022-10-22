package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.distTypesSidebarMod.SidebarPersistentHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarPersistentHeader {
  
  @JSImport("wix-style-react", "SidebarPersistentHeader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SidebarPersistentHeader.type): Default[typingsJapgolly.wixStyleReact.mod.SidebarPersistentHeader] = new Default[typingsJapgolly.wixStyleReact.mod.SidebarPersistentHeader](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SidebarPersistentHeaderProps): Default[typingsJapgolly.wixStyleReact.mod.SidebarPersistentHeader] = new Default[typingsJapgolly.wixStyleReact.mod.SidebarPersistentHeader](js.Array(this.component, p.asInstanceOf[js.Any]))
}
