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
import typingsJapgolly.reactBootstrap.libDropdownButtonMod.DropdownButtonProps
import typingsJapgolly.reactBootstrap.mod.SelectCallback
import typingsJapgolly.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownButton {
  
  inline def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DropdownButtonProps]))
  }
  
  @JSImport("react-bootstrap", "DropdownButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrap.mod.DropdownButton] {
    
    inline def block(value: Boolean): this.type = set("block", value.asInstanceOf[js.Any])
    
    inline def bsClass(value: String): this.type = set("bsClass", value.asInstanceOf[js.Any])
    
    inline def bsSize(value: Sizes): this.type = set("bsSize", value.asInstanceOf[js.Any])
    
    inline def bsStyle(value: String): this.type = set("bsStyle", value.asInstanceOf[js.Any])
    
    inline def bsStyleNull: this.type = set("bsStyle", null)
    
    inline def componentClass(value: ElementType): this.type = set("componentClass", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dropup(value: Boolean): this.type = set("dropup", value.asInstanceOf[js.Any])
    
    inline def navItem(value: Boolean): this.type = set("navItem", value.asInstanceOf[js.Any])
    
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
  
  def withProps(p: DropdownButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
