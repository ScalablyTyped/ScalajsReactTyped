package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrap.anon.Source
import typingsJapgolly.reactBootstrap.libNavDropdownMod.NavDropdownProps
import typingsJapgolly.reactBootstrap.mod.SelectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavDropdown {
  
  inline def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NavDropdownProps]))
  }
  
  @JSImport("react-bootstrap", "NavDropdown")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrap.mod.NavDropdown] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def bsClass(value: String): this.type = set("bsClass", value.asInstanceOf[js.Any])
    
    inline def componentClass(value: ElementType): this.type = set("componentClass", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dropup(value: Boolean): this.type = set("dropup", value.asInstanceOf[js.Any])
    
    inline def eventKey(value: Any): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    inline def noCaret(value: Boolean): this.type = set("noCaret", value.asInstanceOf[js.Any])
    
    inline def onClose(value: js.Function): this.type = set("onClose", value.asInstanceOf[js.Any])
    
    inline def onSelect(value: SelectCallback): this.type = set("onSelect", value.asInstanceOf[js.Any])
    
    inline def onToggle(
      value: (/* isOpen */ Boolean, /* event */ ReactEventFrom[Element], /* metadata */ Source) => Callback
    ): this.type = set("onToggle", js.Any.fromFunction3((t0: /* isOpen */ Boolean, t1: /* event */ ReactEventFrom[Element], t2: /* metadata */ Source) => (value(t0, t1, t2)).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def pullRight(value: Boolean): this.type = set("pullRight", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: NavDropdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
