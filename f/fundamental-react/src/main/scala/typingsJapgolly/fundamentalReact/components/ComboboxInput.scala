package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.anon.State
import typingsJapgolly.fundamentalReact.libComboboxInputComboboxInputMod.ComboboxInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ComboboxInput {
  
  inline def apply(menu: VdomElement): Builder = {
    val __props = js.Dynamic.literal(menu = menu.rawElement.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ComboboxInputProps]))
  }
  
  @JSImport("fundamental-react", "ComboboxInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def buttonProps(value: js.Object): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def inputProps(value: js.Object): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def list(value: VdomNode): this.type = set("list", value.rawNode.asInstanceOf[js.Any])
    
    inline def listNull: this.type = set("list", null)
    
    inline def listVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("list", js.Array(value*))
    
    inline def listVdomElement(value: VdomElement): this.type = set("list", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClick(value: /* event */ ReactMouseEventFrom[HTMLDivElement] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def popoverProps(value: js.Object): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    inline def validationState(value: State): this.type = set("validationState", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ComboboxInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
