package typingsJapgolly.reactMdForm

import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdForm.anon.NumberFieldHookOptionsdef
import typingsJapgolly.reactMdForm.anon.NumberFieldHookOptionsdefCounter
import typingsJapgolly.reactMdForm.anon.NumberFieldHookOptionsdefDefaultValue
import typingsJapgolly.reactMdForm.anon.NumberFieldHookOptionsdis
import typingsJapgolly.reactMdForm.anon.NumberFieldHookOptionsdisCounter
import typingsJapgolly.reactMdForm.anon.NumberFieldHookOptionsdisDefaultValue
import typingsJapgolly.reactMdForm.anon.PasswordPropsmessageProps
import typingsJapgolly.reactMdForm.anon.TextAreaPropsmessageProps
import typingsJapgolly.reactMdForm.anon.TextFieldHookOptionsdisab
import typingsJapgolly.reactMdForm.anon.TextFieldHookOptionsdisabCounter
import typingsJapgolly.reactMdForm.anon.TextFieldHookOptionsdisabDefaultValue
import typingsJapgolly.reactMdForm.anon.TextFieldPropsmessageProp
import typingsJapgolly.reactMdForm.reactMdFormStrings.badInput
import typingsJapgolly.reactMdForm.reactMdFormStrings.customError
import typingsJapgolly.reactMdForm.reactMdFormStrings.patternMismatch
import typingsJapgolly.reactMdForm.reactMdFormStrings.rangeOverflow
import typingsJapgolly.reactMdForm.reactMdFormStrings.rangeUnderflow
import typingsJapgolly.reactMdForm.reactMdFormStrings.stepMismatch
import typingsJapgolly.reactMdForm.reactMdFormStrings.tooLong
import typingsJapgolly.reactMdForm.reactMdFormStrings.tooShort
import typingsJapgolly.reactMdForm.reactMdFormStrings.typeMismatch
import typingsJapgolly.reactMdForm.reactMdFormStrings.valid
import typingsJapgolly.reactMdForm.reactMdFormStrings.valueMissing
import typingsJapgolly.reactMdForm.typesTextFieldGetErrorIconMod.GetErrorIcon
import typingsJapgolly.reactMdForm.typesTextFieldGetErrorMessageMod.GetErrorMessage
import typingsJapgolly.reactMdForm.typesTextFieldIsErroredMod.IsErrored
import typingsJapgolly.reactMdForm.typesTextFieldPasswordMod.PasswordProps
import typingsJapgolly.reactMdForm.typesTextFieldTextAreaMod.TextAreaProps
import typingsJapgolly.reactMdForm.typesTextFieldTextFieldAddonMod.TextFieldAddonProps
import typingsJapgolly.reactMdForm.typesTextFieldTextFieldContainerMod.TextFieldContainerProps
import typingsJapgolly.reactMdForm.typesTextFieldTextFieldMod.TextFieldProps
import typingsJapgolly.reactMdForm.typesTextFieldUseNumberFieldMod.NumberFieldHookControls
import typingsJapgolly.reactMdForm.typesTextFieldUseNumberFieldMod.ProvidedNumberFieldMessageProps
import typingsJapgolly.reactMdForm.typesTextFieldUseNumberFieldMod.ProvidedNumberFieldProps
import typingsJapgolly.reactMdForm.typesTextFieldUseTextFieldMod.ProvidedTextFieldMessageProps
import typingsJapgolly.reactMdForm.typesTextFieldUseTextFieldMod.ProvidedTextFieldProps
import typingsJapgolly.reactMdForm.typesTextFieldUseTextFieldMod.TextFieldHookControls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTextFieldMod {
  
  @JSImport("@react-md/form/types/text-field", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/form/types/text-field", "Password")
  @js.native
  val Password: ForwardRefExoticComponent[PasswordProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "PasswordWithMessage")
  @js.native
  val PasswordWithMessage: ForwardRefExoticComponent[PasswordPropsmessageProps] = js.native
  
  @JSImport("@react-md/form/types/text-field", "RECOMMENDED_NUMBER_STATE_KEYS")
  @js.native
  val RECOMMENDED_NUMBER_STATE_KEYS: js.Array[
    badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing
  ] = js.native
  
  @JSImport("@react-md/form/types/text-field", "RECOMMENDED_STATE_KEYS")
  @js.native
  val RECOMMENDED_STATE_KEYS: js.Array[
    badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing
  ] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextArea")
  @js.native
  val TextArea: ForwardRefExoticComponent[TextAreaProps & RefAttributes[HTMLTextAreaElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextAreaWithMessage")
  @js.native
  val TextAreaWithMessage: ForwardRefExoticComponent[TextAreaPropsmessageProps] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextField")
  @js.native
  val TextField: ForwardRefExoticComponent[TextFieldProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextFieldAddon")
  @js.native
  val TextFieldAddon: ForwardRefExoticComponent[TextFieldAddonProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextFieldContainer")
  @js.native
  val TextFieldContainer: ForwardRefExoticComponent[TextFieldContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextFieldWithMessage")
  @js.native
  val TextFieldWithMessage: ForwardRefExoticComponent[TextFieldPropsmessageProp] = js.native
  
  @JSImport("@react-md/form/types/text-field", "defaultGetErrorIcon")
  @js.native
  val defaultGetErrorIcon: GetErrorIcon = js.native
  
  @JSImport("@react-md/form/types/text-field", "defaultGetErrorMessage")
  @js.native
  val defaultGetErrorMessage: GetErrorMessage = js.native
  
  @JSImport("@react-md/form/types/text-field", "defaultIsErrored")
  @js.native
  val defaultIsErrored: IsErrored = js.native
  
  inline def useNumberField(options: NumberFieldHookOptionsdef): js.Tuple3[Double, ProvidedNumberFieldProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, ProvidedNumberFieldProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdefCounter): js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdefDefaultValue): js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdis): js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdisCounter): js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdisDefaultValue): js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  
  inline def useTextField(options: TextFieldHookOptionsdisab): js.Tuple3[String, ProvidedTextFieldProps, TextFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, ProvidedTextFieldProps, TextFieldHookControls]]
  inline def useTextField(options: TextFieldHookOptionsdisabCounter): js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls]]
  inline def useTextField(options: TextFieldHookOptionsdisabDefaultValue): js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls]]
}
