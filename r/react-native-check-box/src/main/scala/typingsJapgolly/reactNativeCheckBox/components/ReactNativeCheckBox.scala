package typingsJapgolly.reactNativeCheckBox.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCheckBox.mod.CheckBoxProps
import typingsJapgolly.reactNativeCheckBox.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeCheckBox {
  
  inline def apply(isChecked: Boolean, onClick: Callback): Builder = {
    val __props = js.Dynamic.literal(isChecked = isChecked.asInstanceOf[js.Any], onClick = onClick.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[CheckBoxProps]))
  }
  
  @JSImport("react-native-check-box", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def checkBoxColor(value: String): this.type = set("checkBoxColor", value.asInstanceOf[js.Any])
    
    inline def checkedCheckBoxColor(value: String): this.type = set("checkedCheckBoxColor", value.asInstanceOf[js.Any])
    
    inline def checkedImage(value: VdomElement): this.type = set("checkedImage", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def leftText(value: String): this.type = set("leftText", value.asInstanceOf[js.Any])
    
    inline def leftTextStyle(value: StyleProp[TextStyle]): this.type = set("leftTextStyle", value.asInstanceOf[js.Any])
    
    inline def leftTextStyleNull: this.type = set("leftTextStyle", null)
    
    inline def leftTextView(value: VdomNode): this.type = set("leftTextView", value.rawNode.asInstanceOf[js.Any])
    
    inline def leftTextViewNull: this.type = set("leftTextView", null)
    
    inline def leftTextViewVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("leftTextView", js.Array(value*))
    
    inline def leftTextViewVdomElement(value: VdomElement): this.type = set("leftTextView", value.rawElement.asInstanceOf[js.Any])
    
    inline def rightText(value: String): this.type = set("rightText", value.asInstanceOf[js.Any])
    
    inline def rightTextStyle(value: StyleProp[TextStyle]): this.type = set("rightTextStyle", value.asInstanceOf[js.Any])
    
    inline def rightTextStyleNull: this.type = set("rightTextStyle", null)
    
    inline def rightTextView(value: VdomNode): this.type = set("rightTextView", value.rawNode.asInstanceOf[js.Any])
    
    inline def rightTextViewNull: this.type = set("rightTextView", null)
    
    inline def rightTextViewVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("rightTextView", js.Array(value*))
    
    inline def rightTextViewVdomElement(value: VdomElement): this.type = set("rightTextView", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def unCheckedImage(value: VdomElement): this.type = set("unCheckedImage", value.rawElement.asInstanceOf[js.Any])
    
    inline def uncheckedCheckBoxColor(value: String): this.type = set("uncheckedCheckBoxColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CheckBoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
