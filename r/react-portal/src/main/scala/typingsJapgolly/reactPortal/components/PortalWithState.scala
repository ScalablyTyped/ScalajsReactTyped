package typingsJapgolly.reactPortal.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactPortal.mod.PortalFunctionParams
import typingsJapgolly.reactPortal.mod.PortalWithStateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortalWithState {
  
  inline def apply(children: PortalFunctionParams => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[PortalWithStateProps]))
  }
  
  @JSImport("react-portal", "PortalWithState")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactPortal.mod.PortalWithState] {
    
    inline def closeOnEsc(value: Boolean): this.type = set("closeOnEsc", value.asInstanceOf[js.Any])
    
    inline def closeOnOutsideClick(value: Boolean): this.type = set("closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    inline def node(value: Element): this.type = set("node", value.asInstanceOf[js.Any])
    
    inline def nodeNull: this.type = set("node", null)
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def onOpen(value: Callback): this.type = set("onOpen", value.toJsFn)
    
    inline def openByClickOn(value: VdomElement): this.type = set("openByClickOn", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: PortalWithStateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
