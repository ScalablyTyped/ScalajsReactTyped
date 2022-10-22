package typingsJapgolly.reactMdMenu.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdMenu.typesMenuBarProviderMod.MenuBarProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuBarProvider {
  
  @JSImport("@react-md/menu", "MenuBarProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def defaultActiveId(value: String): this.type = set("defaultActiveId", value.asInstanceOf[js.Any])
    
    inline def hoverTimeout(value: Double): this.type = set("hoverTimeout", value.asInstanceOf[js.Any])
    
    inline def root(value: Boolean): this.type = set("root", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MenuBarProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuBarProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
