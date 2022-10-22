package typingsJapgolly.reactNativeMaterialTextfield.components

import typingsJapgolly.reactNativeMaterialTextfield.mod.TextFieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OutlinedTextField {
  
  @JSImport("react-native-material-textfield", "OutlinedTextField")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: OutlinedTextField.type): SharedBuilder_TextFieldProps_682982416[typingsJapgolly.reactNativeMaterialTextfield.mod.OutlinedTextField] = new SharedBuilder_TextFieldProps_682982416[typingsJapgolly.reactNativeMaterialTextfield.mod.OutlinedTextField](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextFieldProps): SharedBuilder_TextFieldProps_682982416[typingsJapgolly.reactNativeMaterialTextfield.mod.OutlinedTextField] = new SharedBuilder_TextFieldProps_682982416[typingsJapgolly.reactNativeMaterialTextfield.mod.OutlinedTextField](js.Array(this.component, p.asInstanceOf[js.Any]))
}
