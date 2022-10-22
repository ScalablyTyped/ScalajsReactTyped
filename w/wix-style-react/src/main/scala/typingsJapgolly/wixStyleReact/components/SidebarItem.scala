package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSidebarMod.SidebarItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarItem {
  
  @JSImport("wix-style-react", "SidebarItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.SidebarItem] {
    
    inline def disable(value: Boolean): this.type = set("disable", value.asInstanceOf[js.Any])
    
    inline def innerMenu(value: js.Array[Node]): this.type = set("innerMenu", value.asInstanceOf[js.Any])
    
    inline def innerMenuVarargs(value: Node*): this.type = set("innerMenu", js.Array(value*))
    
    inline def itemKey(value: String): this.type = set("itemKey", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* itemKey */ String, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* itemKey */ String, t1: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
  }
  
  implicit def make(companion: SidebarItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SidebarItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
