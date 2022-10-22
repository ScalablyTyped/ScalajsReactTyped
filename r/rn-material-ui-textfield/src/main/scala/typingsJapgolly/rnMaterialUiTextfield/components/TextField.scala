package typingsJapgolly.rnMaterialUiTextfield.components

import typingsJapgolly.rnMaterialUiTextfield.mod.TextFieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextField {
  
  @JSImport("rn-material-ui-textfield", "TextField")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TextField.type): SharedBuilder_TextFieldProps1999016579[typingsJapgolly.rnMaterialUiTextfield.mod.TextField] = new SharedBuilder_TextFieldProps1999016579[typingsJapgolly.rnMaterialUiTextfield.mod.TextField](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextFieldProps): SharedBuilder_TextFieldProps1999016579[typingsJapgolly.rnMaterialUiTextfield.mod.TextField] = new SharedBuilder_TextFieldProps1999016579[typingsJapgolly.rnMaterialUiTextfield.mod.TextField](js.Array(this.component, p.asInstanceOf[js.Any]))
}
