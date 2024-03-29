package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeMaterialUi.anon.Label
import typingsJapgolly.reactNativeMaterialUi.mod.CheckBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkbox {
  
  inline def apply(label: String, onCheck: Boolean => Callback, value: String | Double): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onCheck = js.Any.fromFunction1((t0: Boolean) => onCheck(t0).runNow()), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CheckBoxProps]))
  }
  
  @JSImport("react-native-material-ui", "Checkbox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Checkbox] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def checkedIcon(value: String): this.type = set("checkedIcon", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def style(value: Label): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def uncheckedIcon(value: String): this.type = set("uncheckedIcon", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CheckBoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
