package typingsJapgolly.reactLeafletSidebarv2.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactLeafletSidebarv2.mod.Anchor
import typingsJapgolly.reactLeafletSidebarv2.mod.Icon
import typingsJapgolly.reactLeafletSidebarv2.mod.Position
import typingsJapgolly.reactLeafletSidebarv2.mod.TabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  inline def apply(header: String, icon: Icon, id: String): Builder = {
    val __props = js.Dynamic.literal(header = header.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabProps]))
  }
  
  @JSImport("react-leaflet-sidebarv2", "Tab")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactLeafletSidebarv2.mod.Tab] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def anchor(value: Anchor): this.type = set("anchor", value.asInstanceOf[js.Any])
    
    inline def closeIcon(value: Icon): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    inline def closeIconVdomElement(value: VdomElement): this.type = set("closeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
