package typingsJapgolly.materialTextfield

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialFloatingLabel.mod.MDCFloatingLabel
import typingsJapgolly.materialLineRipple.mod.MDCLineRipple
import typingsJapgolly.materialNotchedOutline.mod.MDCNotchedOutline
import typingsJapgolly.materialRipple.mod.MDCRipple
import typingsJapgolly.materialRipple.mod.MDCRippleFoundation
import typingsJapgolly.materialTextfield.adapterMod.FoundationMapType
import typingsJapgolly.materialTextfield.adapterMod.MDCTextFieldAdapter
import typingsJapgolly.materialTextfield.foundationMod.default
import typingsJapgolly.materialTextfield.helperTextAdapterMod.MDCTextFieldHelperTextAdapter
import typingsJapgolly.materialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCTextField ()
    extends typingsJapgolly.materialBase.componentMod.default[MDCTextFieldAdapter, default] {
    var disabled: Boolean = js.native
    var helperTextContent: String = js.native
    var max: String = js.native
    var maxLength: Double = js.native
    var min: String = js.native
    var minLength: Double = js.native
    var pattern: String = js.native
    var required: Boolean = js.native
    var step: String = js.native
    /**
      * Ideally we would use a 'writeonly' modifier here since this is a setter,
      * but such a thing does not exist.
      * https://github.com/Microsoft/TypeScript/issues/4839
      * https://github.com/Microsoft/TypeScript/issues/21759
      */
    var useNativeValidation: Boolean = js.native
    var valid: Boolean = js.native
    var value: String = js.native
    /**
      * Initiliazes the Text Field's internal state based on the environment's
      * state.
      */
    def initialSyncWithDom(): Unit = js.native
    def initialize(
      rippleFactory: js.UndefOr[js.Function2[/* el */ Element, /* foundation */ MDCRippleFoundation, MDCRipple]],
      lineRippleFactory: js.UndefOr[js.Function1[/* el */ Element, MDCLineRipple]],
      helperTextFactory: js.UndefOr[
          js.Function1[
            /* el */ Element, 
            typingsJapgolly.materialTextfield.helperTextMod.MDCTextFieldHelperText
          ]
        ],
      iconFactory: js.UndefOr[
          js.Function1[/* el */ Element, typingsJapgolly.materialTextfield.iconMod.MDCTextFieldIcon]
        ],
      labelFactory: js.UndefOr[js.Function1[/* el */ Element, MDCFloatingLabel]],
      outlineFactory: js.UndefOr[js.Function1[/* el */ Element, MDCNotchedOutline]]
    ): Unit = js.native
    /**
      * Recomputes the outline SVG path for the outline element.
      */
    def layout(): Unit = js.native
  }
  
  @js.native
  class MDCTextFieldFoundation protected () extends default {
    def this(adapter: MDCTextFieldAdapter) = this()
    def this(adapter: MDCTextFieldAdapter, foundationMap: FoundationMapType) = this()
  }
  
  @js.native
  class MDCTextFieldHelperText ()
    extends typingsJapgolly.materialTextfield.helperTextMod.MDCTextFieldHelperText
  
  @js.native
  class MDCTextFieldHelperTextFoundation ()
    extends typingsJapgolly.materialTextfield.helperTextMod.MDCTextFieldHelperTextFoundation
  
  @js.native
  class MDCTextFieldIcon ()
    extends typingsJapgolly.materialTextfield.iconMod.MDCTextFieldIcon
  
  @js.native
  class MDCTextFieldIconFoundation ()
    extends typingsJapgolly.materialTextfield.iconMod.MDCTextFieldIconFoundation
  
  /* static members */
  @js.native
  object MDCTextField extends js.Object {
    def attachTo(root: Element): MDCTextField = js.native
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

