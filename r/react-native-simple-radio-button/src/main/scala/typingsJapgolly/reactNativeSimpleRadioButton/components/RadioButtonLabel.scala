package typingsJapgolly.reactNativeSimpleRadioButton.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSimpleRadioButton.mod.RadioButtonLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButtonLabel {
  
  inline def apply(index: Double, obj: js.Object): Builder = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioButtonLabelProps]))
  }
  
  @JSImport("react-native-simple-radio-button", "RadioButtonLabel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSimpleRadioButton.mod.RadioButtonLabel] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    inline def labelHorizontal(value: Boolean): this.type = set("labelHorizontal", value.asInstanceOf[js.Any])
    
    inline def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    inline def labelStyleNull: this.type = set("labelStyle", null)
    
    inline def labelWrapStyle(value: StyleProp[ViewStyle]): this.type = set("labelWrapStyle", value.asInstanceOf[js.Any])
    
    inline def labelWrapStyleNull: this.type = set("labelWrapStyle", null)
    
    inline def onPress(value: /* val */ js.UndefOr[Any] => Any): this.type = set("onPress", js.Any.fromFunction1(value))
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioButtonLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
