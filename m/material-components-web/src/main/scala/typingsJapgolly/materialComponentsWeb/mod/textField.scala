package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialTextfield.adapterMod.FoundationMapType
import typingsJapgolly.materialTextfield.adapterMod.MDCTextFieldAdapter
import typingsJapgolly.materialTextfield.helperTextAdapterMod.MDCTextFieldHelperTextAdapter
import typingsJapgolly.materialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "textField")
@js.native
object textField extends js.Object {
  @js.native
  class MDCTextField ()
    extends typingsJapgolly.materialTextfield.mod.MDCTextField
  
  @js.native
  class MDCTextFieldFoundation protected ()
    extends typingsJapgolly.materialTextfield.mod.MDCTextFieldFoundation {
    def this(adapter: MDCTextFieldAdapter) = this()
    def this(adapter: MDCTextFieldAdapter, foundationMap: FoundationMapType) = this()
  }
  
  @js.native
  class MDCTextFieldHelperText ()
    extends typingsJapgolly.materialTextfield.mod.MDCTextFieldHelperText
  
  @js.native
  class MDCTextFieldHelperTextFoundation ()
    extends typingsJapgolly.materialTextfield.mod.MDCTextFieldHelperTextFoundation
  
  @js.native
  class MDCTextFieldIcon ()
    extends typingsJapgolly.materialTextfield.mod.MDCTextFieldIcon
  
  @js.native
  class MDCTextFieldIconFoundation ()
    extends typingsJapgolly.materialTextfield.mod.MDCTextFieldIconFoundation
  
  /* static members */
  @js.native
  object MDCTextField extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialTextfield.mod.MDCTextField = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialTextfield.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTextFieldAdapter = js.native
    val numbers: typingsJapgolly.materialTextfield.constantsMod.numbers = js.native
    val strings: typingsJapgolly.materialTextfield.constantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldHelperText extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialTextfield.helperTextMod.MDCTextFieldHelperText = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldHelperTextFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialTextfield.helperTextConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTextFieldHelperTextAdapter = js.native
    val strings: typingsJapgolly.materialTextfield.helperTextConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldIcon extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialTextfield.iconMod.MDCTextFieldIcon = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldIconFoundation extends js.Object {
    val defaultAdapter: MDCTextFieldIconAdapter = js.native
    val strings: typingsJapgolly.materialTextfield.iconConstantsMod.strings = js.native
  }
  
}

