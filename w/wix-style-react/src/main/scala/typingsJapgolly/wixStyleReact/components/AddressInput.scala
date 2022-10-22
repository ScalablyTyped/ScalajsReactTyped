package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesAddressInputMod.AddressInputProps
import typingsJapgolly.wixStyleReact.distTypesCommonMod.PopoverCommonProps
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutOption
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottomLine
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.error
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.round
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AddressInput {
  
  @JSImport("wix-style-react", "AddressInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.AddressInput] {
    
    inline def border(value: standard | round | bottomLine | none_): this.type = set("border", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clearButton(value: Boolean): this.type = set("clearButton", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def initialValue(value: String): this.type = set("initialValue", value.asInstanceOf[js.Any])
    
    inline def noResultsText(value: VdomNode): this.type = set("noResultsText", value.rawNode.asInstanceOf[js.Any])
    
    inline def noResultsTextNull: this.type = set("noResultsText", null)
    
    inline def noResultsTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("noResultsText", js.Array(value*))
    
    inline def noResultsTextVdomElement(value: VdomElement): this.type = set("noResultsText", value.rawElement.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClear(value: Callback): this.type = set("onClear", value.toJsFn)
    
    inline def onFocus(value: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLInputElement]] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLInputElement]]) => value(t0).runNow()))
    
    inline def onManuallyInput(value: (/* inputValue */ String, /* suggestedOption */ DropdownLayoutValueOption) => Callback): this.type = set("onManuallyInput", js.Any.fromFunction2((t0: /* inputValue */ String, t1: /* suggestedOption */ DropdownLayoutValueOption) => (value(t0, t1)).runNow()))
    
    inline def onSelect(value: /* option */ DropdownLayoutValueOption => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* option */ DropdownLayoutValueOption) => value(t0).runNow()))
    
    inline def options(value: js.Array[DropdownLayoutOption]): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsVarargs(value: DropdownLayoutOption*): this.type = set("options", js.Array(value*))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def popoverProps(value: PopoverCommonProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium | large): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def status(value: loading | error | warning): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def statusMessage(value: VdomNode): this.type = set("statusMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def statusMessageNull: this.type = set("statusMessage", null)
    
    inline def statusMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("statusMessage", js.Array(value*))
    
    inline def statusMessageVdomElement(value: VdomElement): this.type = set("statusMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AddressInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AddressInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
