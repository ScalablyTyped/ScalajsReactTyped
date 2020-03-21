package typingsJapgolly.materialTextfield

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialTextfield.helperTextAdapterMod.MDCTextFieldHelperTextAdapter
import typingsJapgolly.materialTextfield.helperTextFoundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/helper-text", JSImport.Namespace)
@js.native
object helperTextMod extends js.Object {
  @js.native
  class MDCTextFieldHelperText ()
    extends typingsJapgolly.materialBase.componentMod.default[MDCTextFieldHelperTextAdapter, default] {
    val foundation: default = js.native
  }
  
  @js.native
  class MDCTextFieldHelperTextFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTextFieldHelperText extends js.Object {
    def attachTo(root: Element): MDCTextFieldHelperText = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldHelperTextFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialTextfield.helperTextConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTextFieldHelperTextAdapter = js.native
    val strings: typingsJapgolly.materialTextfield.helperTextConstantsMod.strings = js.native
  }
  
}

