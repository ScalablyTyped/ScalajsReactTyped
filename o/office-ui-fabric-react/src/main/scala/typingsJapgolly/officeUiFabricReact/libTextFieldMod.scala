package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings._underscore
import typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/TextField", JSImport.Namespace)
@js.native
object libTextFieldMod extends js.Object {
  @js.native
  class MaskedTextField protected ()
    extends typingsJapgolly.officeUiFabricReact.textFieldMod.MaskedTextField {
    def this(props: ITextFieldProps) = this()
  }
  
  @js.native
  class TextFieldBase protected ()
    extends typingsJapgolly.officeUiFabricReact.textFieldMod.TextFieldBase {
    def this(props: ITextFieldProps) = this()
  }
  
  val DEFAULT_MASK_CHAR: _underscore = js.native
  val TextField: FunctionComponent[ITextFieldProps] = js.native
  /* static members */
  @js.native
  object MaskedTextField extends js.Object {
    var defaultProps: ITextFieldProps = js.native
  }
  
  /* static members */
  @js.native
  object TextFieldBase extends js.Object {
    var defaultProps: ITextFieldProps = js.native
  }
  
}

