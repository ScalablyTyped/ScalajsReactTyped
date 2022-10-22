package typingsJapgolly.reactMaterialUiFormValidator.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Menus.DropDownMenuProps
import typingsJapgolly.materialUi.MaterialUI.SelectFieldProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectValidator {
  
  inline def apply(name: String, value: Any): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ValidatorComponentProps & SelectFieldProps]))
  }
  
  @JSImport("react-material-ui-form-validator", "SelectValidator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMaterialUiFormValidator.mod.SelectValidator] {
    
    inline def autoWidth(value: Boolean): this.type = set("autoWidth", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dropDownMenuProps(value: DropDownMenuProps): this.type = set("dropDownMenuProps", value.asInstanceOf[js.Any])
    
    inline def errorMessages(value: js.Array[Any] | String): this.type = set("errorMessages", value.asInstanceOf[js.Any])
    
    inline def errorMessagesVarargs(value: Any*): this.type = set("errorMessages", js.Array(value*))
    
    inline def errorStyle(value: CSSProperties): this.type = set("errorStyle", value.asInstanceOf[js.Any])
    
    inline def errorText(value: VdomNode): this.type = set("errorText", value.rawNode.asInstanceOf[js.Any])
    
    inline def errorTextNull: this.type = set("errorText", null)
    
    inline def errorTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("errorText", js.Array(value*))
    
    inline def errorTextVdomElement(value: VdomElement): this.type = set("errorText", value.rawElement.asInstanceOf[js.Any])
    
    inline def floatingLabelFixed(value: Boolean): this.type = set("floatingLabelFixed", value.asInstanceOf[js.Any])
    
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
    
    inline def iconStyle(value: CSSProperties): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def labelStyle(value: CSSProperties): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    inline def listStyle(value: CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def menuItemStyle(value: CSSProperties): this.type = set("menuItemStyle", value.asInstanceOf[js.Any])
    
    inline def menuStyle(value: Any): this.type = set("menuStyle", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onChange(
      value: (/* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], /* index */ Double, /* menuItemValue */ Any) => Callback
    ): this.type = set("onChange", js.Any.fromFunction3((t0: /* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], t1: /* index */ Double, t2: /* menuItemValue */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def openImmediately(value: Boolean): this.type = set("openImmediately", value.asInstanceOf[js.Any])
    
    inline def selectFieldRoot(value: CSSProperties): this.type = set("selectFieldRoot", value.asInstanceOf[js.Any])
    
    inline def selectedMenuItemStyle(value: CSSProperties): this.type = set("selectedMenuItemStyle", value.asInstanceOf[js.Any])
    
    inline def selectionRenderer(value: /* value */ Any => Node): this.type = set("selectionRenderer", js.Any.fromFunction1(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def underlineDisabledStyle(value: CSSProperties): this.type = set("underlineDisabledStyle", value.asInstanceOf[js.Any])
    
    inline def underlineFocusStyle(value: CSSProperties): this.type = set("underlineFocusStyle", value.asInstanceOf[js.Any])
    
    inline def underlineStyle(value: CSSProperties): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
    
    inline def validatorListener(value: /* isValid */ Boolean => Callback): this.type = set("validatorListener", js.Any.fromFunction1((t0: /* isValid */ Boolean) => value(t0).runNow()))
    
    inline def validators(value: js.Array[Any]): this.type = set("validators", value.asInstanceOf[js.Any])
    
    inline def validatorsVarargs(value: Any*): this.type = set("validators", js.Array(value*))
    
    inline def withRequiredValidator(value: Boolean): this.type = set("withRequiredValidator", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ValidatorComponentProps & SelectFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
