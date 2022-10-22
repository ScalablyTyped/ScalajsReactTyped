package typingsJapgolly.reactLeafletSidebarv2.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactLeafletSidebarv2.mod.Icon
import typingsJapgolly.reactLeafletSidebarv2.mod.Position
import typingsJapgolly.reactLeafletSidebarv2.mod.SidebarProps
import typingsJapgolly.reactLeafletSidebarv2.mod.TabType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sidebar {
  
  inline def apply(children: TabType, collapsed: Boolean, id: String, position: Position, selected: String): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SidebarProps]))
  }
  
  @JSImport("react-leaflet-sidebarv2", "Sidebar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactLeafletSidebarv2.mod.Sidebar] {
    
    inline def closeIcon(value: Icon): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    inline def closeIconVdomElement(value: VdomElement): this.type = set("closeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def onOpen(value: /* id */ String => Callback): this.type = set("onOpen", js.Any.fromFunction1((t0: /* id */ String) => value(t0).runNow()))
  }
  
  def withProps(p: SidebarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
