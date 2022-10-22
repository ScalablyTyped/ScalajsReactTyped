package typingsJapgolly.reactNativeSimpleRadioButton.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSimpleRadioButton.anon.Label
import typingsJapgolly.reactNativeSimpleRadioButton.mod.ReactNativeRadioFormProps
import typingsJapgolly.reactNativeSimpleRadioButton.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSimpleRadioButton {
  
  @JSImport("react-native-simple-radio-button", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    inline def animation(value: Boolean): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def buttonColor(value: String): this.type = set("buttonColor", value.asInstanceOf[js.Any])
    
    inline def formHorizontal(value: Boolean): this.type = set("formHorizontal", value.asInstanceOf[js.Any])
    
    inline def initial(value: Double): this.type = set("initial", value.asInstanceOf[js.Any])
    
    inline def labelColor(value: String): this.type = set("labelColor", value.asInstanceOf[js.Any])
    
    inline def labelHorizontal(value: Boolean): this.type = set("labelHorizontal", value.asInstanceOf[js.Any])
    
    inline def onPress(value: /* val */ js.UndefOr[Any] => Any): this.type = set("onPress", js.Any.fromFunction1(value))
    
    inline def radio_props(value: js.Array[Label]): this.type = set("radio_props", value.asInstanceOf[js.Any])
    
    inline def radio_propsVarargs(value: Label*): this.type = set("radio_props", js.Array(value*))
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeSimpleRadioButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactNativeRadioFormProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
