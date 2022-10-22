package typingsJapgolly.reactMaterialUiFormValidator.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.TextFieldProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextValidator {
  
  inline def apply(name: String, value: Any): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ValidatorComponentProps & TextFieldProps]))
  }
  
  @JSImport("react-material-ui-form-validator", "TextValidator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMaterialUiFormValidator.mod.TextValidator] {
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def errorMessages(value: js.Array[Any] | String): this.type = set("errorMessages", value.asInstanceOf[js.Any])
    
    inline def errorMessagesVarargs(value: Any*): this.type = set("errorMessages", js.Array(value*))
    
    inline def errorStyle(value: CSSProperties): this.type = set("errorStyle", value.asInstanceOf[js.Any])
    
    inline def errorText(value: VdomNode): this.type = set("errorText", value.rawNode.asInstanceOf[js.Any])
    
    inline def errorTextNull: this.type = set("errorText", null)
    
    inline def errorTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("errorText", js.Array(value*))
    
    inline def errorTextVdomElement(value: VdomElement): this.type = set("errorText", value.rawElement.asInstanceOf[js.Any])
    
    inline def floatingLabelFixed(value: Boolean): this.type = set("floatingLabelFixed", value.asInstanceOf[js.Any])
    
    inline def floatingLabelFocusStyle(value: CSSProperties): this.type = set("floatingLabelFocusStyle", value.asInstanceOf[js.Any])
    
    inline def floatingLabelShrinkStyle(value: CSSProperties): this.type = set("floatingLabelShrinkStyle", value.asInstanceOf[js.Any])
    
    inline def floatingLabelStyle(value: CSSProperties): this.type = set("floatingLabelStyle", value.asInstanceOf[js.Any])
    
    inline def floatingLabelText(value: VdomNode): this.type = set("floatingLabelText", value.rawNode.asInstanceOf[js.Any])
    
    inline def floatingLabelTextNull: this.type = set("floatingLabelText", null)
    
    inline def floatingLabelTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("floatingLabelText", js.Array(value*))
    
    inline def floatingLabelTextVdomElement(value: VdomElement): this.type = set("floatingLabelText", value.rawElement.asInstanceOf[js.Any])
    
    inline def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    
    inline def hintStyle(value: CSSProperties): this.type = set("hintStyle", value.asInstanceOf[js.Any])
    
    inline def hintText(value: VdomNode): this.type = set("hintText", value.rawNode.asInstanceOf[js.Any])
    
    inline def hintTextNull: this.type = set("hintText", null)
    
    inline def hintTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("hintText", js.Array(value*))
    
    inline def hintTextVdomElement(value: VdomElement): this.type = set("hintText", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inputStyle(value: CSSProperties): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def maxlength(value: String): this.type = set("maxlength", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def minlength(value: String): this.type = set("minlength", value.asInstanceOf[js.Any])
    
    inline def multiLine(value: Boolean): this.type = set("multiLine", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onChange(
      value: (/* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], /* newValue */ String) => Callback
    ): this.type = set("onChange", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], t1: /* newValue */ String) => (value(t0, t1)).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def rowsMax(value: Double): this.type = set("rowsMax", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def textareaStyle(value: CSSProperties): this.type = set("textareaStyle", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def underlineDisabledStyle(value: CSSProperties): this.type = set("underlineDisabledStyle", value.asInstanceOf[js.Any])
    
    inline def underlineFocusStyle(value: CSSProperties): this.type = set("underlineFocusStyle", value.asInstanceOf[js.Any])
    
    inline def underlineShow(value: Boolean): this.type = set("underlineShow", value.asInstanceOf[js.Any])
    
    inline def underlineStyle(value: CSSProperties): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
    
    inline def validatorListener(value: /* isValid */ Boolean => Callback): this.type = set("validatorListener", js.Any.fromFunction1((t0: /* isValid */ Boolean) => value(t0).runNow()))
    
    inline def validators(value: js.Array[Any]): this.type = set("validators", value.asInstanceOf[js.Any])
    
    inline def validatorsVarargs(value: Any*): this.type = set("validators", js.Array(value*))
    
    inline def withRequiredValidator(value: Boolean): this.type = set("withRequiredValidator", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ValidatorComponentProps & TextFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
