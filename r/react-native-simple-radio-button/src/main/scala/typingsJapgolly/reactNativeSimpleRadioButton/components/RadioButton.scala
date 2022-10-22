package typingsJapgolly.reactNativeSimpleRadioButton.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSimpleRadioButton.mod.RadioButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButton {
  
  @JSImport("react-native-simple-radio-button", "RadioButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSimpleRadioButton.mod.RadioButton] {
    
    inline def buttonColor(value: String): this.type = set("buttonColor", value.asInstanceOf[js.Any])
    
    inline def idSeparator(value: String): this.type = set("idSeparator", value.asInstanceOf[js.Any])
    
    inline def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    
    inline def labelColor(value: String): this.type = set("labelColor", value.asInstanceOf[js.Any])
    
    inline def labelHorizontal(value: Boolean): this.type = set("labelHorizontal", value.asInstanceOf[js.Any])
    
    inline def selectedButtonColor(value: String): this.type = set("selectedButtonColor", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def wrapStyle(value: StyleProp[ViewStyle]): this.type = set("wrapStyle", value.asInstanceOf[js.Any])
    
    inline def wrapStyleNull: this.type = set("wrapStyle", null)
  }
  
  implicit def make(companion: RadioButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
