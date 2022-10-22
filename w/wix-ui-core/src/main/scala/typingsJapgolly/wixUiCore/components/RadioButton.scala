package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsRadioButtonRadioButtonMod.RadioButtonChangeEvent
import typingsJapgolly.wixUiCore.distEsSrcComponentsRadioButtonRadioButtonMod.RadioButtonClickEvent
import typingsJapgolly.wixUiCore.distEsSrcComponentsRadioButtonRadioButtonMod.RadioButtonHoverEvent
import typingsJapgolly.wixUiCore.distEsSrcComponentsRadioButtonRadioButtonMod.RadioButtonKeyDownEvent
import typingsJapgolly.wixUiCore.distEsSrcComponentsRadioButtonRadioButtonMod.RadioButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButton {
  
  @JSImport("wix-ui-core/dist/es/src", "RadioButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.RadioButton] {
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def checkedIcon(value: VdomNode): this.type = set("checkedIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def checkedIconNull: this.type = set("checkedIcon", null)
    
    inline def checkedIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("checkedIcon", js.Array(value*))
    
    inline def checkedIconVdomElement(value: VdomElement): this.type = set("checkedIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
    
    inline def onChange(value: /* event */ RadioButtonChangeEvent | RadioButtonClickEvent => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* event */ RadioButtonChangeEvent | RadioButtonClickEvent) => value(t0).runNow()))
    
    inline def onFocus(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
    
    inline def onFocusByKeyboard(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): this.type = set("onFocusByKeyboard", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
    
    inline def onHover(value: /* event */ RadioButtonHoverEvent => Callback): this.type = set("onHover", js.Any.fromFunction1((t0: /* event */ RadioButtonHoverEvent) => value(t0).runNow()))
    
    inline def onIconBlur(value: /* event */ ReactMouseEventFrom[HTMLElement] => Callback): this.type = set("onIconBlur", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onKeyDown(value: /* event */ RadioButtonKeyDownEvent => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: /* event */ RadioButtonKeyDownEvent) => value(t0).runNow()))
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def uncheckedIcon(value: VdomNode): this.type = set("uncheckedIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def uncheckedIconNull: this.type = set("uncheckedIcon", null)
    
    inline def uncheckedIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("uncheckedIcon", js.Array(value*))
    
    inline def uncheckedIconVdomElement(value: VdomElement): this.type = set("uncheckedIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RadioButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
