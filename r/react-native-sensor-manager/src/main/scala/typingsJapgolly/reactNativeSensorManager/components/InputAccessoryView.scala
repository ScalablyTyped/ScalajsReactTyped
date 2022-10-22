package typingsJapgolly.reactNativeSensorManager.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.InputAccessoryViewProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputAccessoryView {
  
  @JSImport("react-native-sensor-manager", "InputAccessoryView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSensorManager.mod.InputAccessoryView] {
    
    inline def backgroundColor(value: ColorValue): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: InputAccessoryView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InputAccessoryViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
