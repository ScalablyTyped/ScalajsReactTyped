package typingsJapgolly.reactNativeSimpleRadioButton.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSimpleRadioButton.mod.RadioButtonInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButtonInput {
  
  inline def apply(index: Double, obj: js.Object): Builder = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioButtonInputProps]))
  }
  
  @JSImport("react-native-simple-radio-button", "RadioButtonInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSimpleRadioButton.mod.RadioButtonInput] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    inline def buttonInnerColor(value: String): this.type = set("buttonInnerColor", value.asInstanceOf[js.Any])
    
    inline def buttonOuterColor(value: String): this.type = set("buttonOuterColor", value.asInstanceOf[js.Any])
    
    inline def buttonOuterSize(value: Double): this.type = set("buttonOuterSize", value.asInstanceOf[js.Any])
    
    inline def buttonSize(value: Double): this.type = set("buttonSize", value.asInstanceOf[js.Any])
    
    inline def buttonStyle(value: StyleProp[ViewStyle]): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    
    inline def buttonStyleNull: this.type = set("buttonStyle", null)
    
    inline def buttonWrapStyle(value: StyleProp[ViewStyle]): this.type = set("buttonWrapStyle", value.asInstanceOf[js.Any])
    
    inline def buttonWrapStyleNull: this.type = set("buttonWrapStyle", null)
    
    inline def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    
    inline def onPress(value: /* val */ js.UndefOr[Any] => Any): this.type = set("onPress", js.Any.fromFunction1(value))
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioButtonInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
