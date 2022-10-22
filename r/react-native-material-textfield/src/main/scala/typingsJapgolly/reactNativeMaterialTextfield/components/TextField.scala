package typingsJapgolly.reactNativeMaterialTextfield.components

import typingsJapgolly.reactNativeMaterialTextfield.mod.TextFieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextField {
  
  @JSImport("react-native-material-textfield", "TextField")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TextField.type): SharedBuilder_TextFieldProps_682982416[typingsJapgolly.reactNativeMaterialTextfield.mod.TextField] = new SharedBuilder_TextFieldProps_682982416[typingsJapgolly.reactNativeMaterialTextfield.mod.TextField](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextFieldProps): SharedBuilder_TextFieldProps_682982416[typingsJapgolly.reactNativeMaterialTextfield.mod.TextField] = new SharedBuilder_TextFieldProps_682982416[typingsJapgolly.reactNativeMaterialTextfield.mod.TextField](js.Array(this.component, p.asInstanceOf[js.Any]))
}
