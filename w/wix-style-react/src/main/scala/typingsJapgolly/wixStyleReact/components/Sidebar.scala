package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSidebarMod.SidebarClassNames
import typingsJapgolly.wixStyleReact.distTypesSidebarMod.SidebarProps
import typingsJapgolly.wixStyleReact.distTypesSidebarMod.SidebarSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sidebar {
  
  @JSImport("wix-style-react", "Sidebar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Sidebar] {
    
    inline def classNames(value: SidebarClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def isHidden(value: Boolean): this.type = set("isHidden", value.asInstanceOf[js.Any])
    
    inline def selectedKey(value: String): this.type = set("selectedKey", value.asInstanceOf[js.Any])
    
    inline def skin(value: SidebarSkin): this.type = set("skin", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Sidebar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SidebarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
