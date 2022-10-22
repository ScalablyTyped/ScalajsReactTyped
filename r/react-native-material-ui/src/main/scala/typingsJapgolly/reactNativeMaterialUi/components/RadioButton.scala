package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeMaterialUi.mod.RadioButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButton {
  
  inline def apply(label: String, onSelect: String => Callback, value: String | Double): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1((t0: String) => onSelect(t0).runNow()), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioButtonProps]))
  }
  
  @JSImport("react-native-material-ui", "RadioButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.RadioButton] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
