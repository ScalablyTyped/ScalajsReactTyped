package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesAutoCompleteWithLabelMod.AutoCompleteWithLabelProps
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutOption
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AutoCompleteWithLabel {
  
  inline def apply(label: String, options: js.Array[DropdownLayoutOption]): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AutoCompleteWithLabelProps]))
  }
  
  @JSImport("wix-style-react", "AutoCompleteWithLabel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.AutoCompleteWithLabel] {
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autocomplete(value: String): this.type = set("autocomplete", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def maxHeightPixels(value: String | Double): this.type = set("maxHeightPixels", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def native(value: Boolean): this.type = set("native", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onSelect(value: /* option */ DropdownLayoutValueOption => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* option */ DropdownLayoutValueOption) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def status(value: InputStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def statusMessage(value: VdomNode): this.type = set("statusMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def statusMessageNull: this.type = set("statusMessage", null)
    
    inline def statusMessageVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("statusMessage", js.Array(value*))
    
    inline def statusMessageVdomElement(value: VdomElement): this.type = set("statusMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def suffix(value: js.Array[Node]): this.type = set("suffix", value.asInstanceOf[js.Any])
    
    inline def suffixVarargs(value: Node*): this.type = set("suffix", js.Array(value*))
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutoCompleteWithLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
