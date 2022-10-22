package typingsJapgolly.reactMdForm.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.reactMdForm.reactMdFormBooleans.`false`
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
import typingsJapgolly.reactMdForm.typesFormThemeProviderMod.FormTheme
import typingsJapgolly.reactMdForm.typesTextFieldGetErrorIconMod.GetErrorIcon
import typingsJapgolly.reactMdForm.typesTextFieldGetErrorMessageMod.ChangeValidationBehavior
import typingsJapgolly.reactMdForm.typesTextFieldGetErrorMessageMod.ErrorMessageOptions
import typingsJapgolly.reactMdForm.typesTextFieldGetErrorMessageMod.GetErrorMessage
import typingsJapgolly.reactMdForm.typesTextFieldIsErroredMod.IsErrored
import typingsJapgolly.reactMdForm.typesTextFieldIsErroredMod.IsErroredOptions
import typingsJapgolly.reactMdForm.typesTextFieldUseNumberFieldMod.FixNumberOnBlur
import typingsJapgolly.reactMdForm.typesTextFieldUseTextFieldMod.ErrorChangeHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-md/form.@react-md/form/types/text-field/useNumberField.NumberFieldHookOptions & {  disableMessage :false} */
trait NumberFieldHookOptionsdisCounter extends StObject {
  
  var counter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default **number** value to use which can be a `number` or `undefined`.
    * When this value is set to a `number` (or a function that returns a
    * `number`), the returned value will never be `undefined`.
    */
  var defaultValue: js.UndefOr[Double | js.Function0[js.UndefOr[Double]]] = js.undefined
  
  var disableMaxLength: js.UndefOr[Boolean] = js.undefined
  
  var disableMessage: js.UndefOr[Boolean] & `false`
  
  var errorIcon: js.UndefOr[Node] = js.undefined
  
  /**
    * @see {@link FixNumberOnBlur}
    */
  var fixOnBlur: js.UndefOr[FixNumberOnBlur] = js.undefined
  
  var getErrorIcon: js.UndefOr[GetErrorIcon] = js.undefined
  
  var getErrorMessage: js.UndefOr[GetErrorMessage] = js.undefined
  
  var helpText: js.UndefOr[Node] = js.undefined
  
  var id: String
  
  var isErrored: js.UndefOr[IsErrored] = js.undefined
  
  /**
    * An optional max value for the number field.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * An optional min value for the number field.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
  
  var onChange: js.UndefOr[FormEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
  
  var onErrorChange: js.UndefOr[ErrorChangeHandler] = js.undefined
  
  var pattern: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional step amount to use.
    *
    * Note: The `min` and `max` values must be divisible by this value when any
    * are defined.
    */
  var step: js.UndefOr[Double] = js.undefined
  
  var theme: js.UndefOr[FormTheme] = js.undefined
  
  /**
    * Boolean if the `number` value should be updated as the user types instead
    * of only once the text field has been blurred.
    */
  var updateOnChange: js.UndefOr[Boolean] = js.undefined
  
  var validateOnChange: js.UndefOr[ChangeValidationBehavior] = js.undefined
}
object NumberFieldHookOptionsdisCounter {
  
  inline def apply(disableMessage: js.UndefOr[Boolean] & `false`, id: String): NumberFieldHookOptionsdisCounter = {
    val __obj = js.Dynamic.literal(disableMessage = disableMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFieldHookOptionsdisCounter]
  }
  
  extension [Self <: NumberFieldHookOptionsdisCounter](x: Self) {
    
    inline def setCounter(value: Boolean): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setDefaultValue(value: Double | js.Function0[js.UndefOr[Double]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueCallbackTo(value: CallbackTo[js.UndefOr[Double]]): Self = StObject.set(x, "defaultValue", value.toJsFn)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisableMaxLength(value: Boolean): Self = StObject.set(x, "disableMaxLength", value.asInstanceOf[js.Any])
    
    inline def setDisableMaxLengthUndefined: Self = StObject.set(x, "disableMaxLength", js.undefined)
    
    inline def setDisableMessage(value: js.UndefOr[Boolean] & `false`): Self = StObject.set(x, "disableMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorIcon(value: VdomNode): Self = StObject.set(x, "errorIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setErrorIconNull: Self = StObject.set(x, "errorIcon", null)
    
    inline def setErrorIconUndefined: Self = StObject.set(x, "errorIcon", js.undefined)
    
    inline def setErrorIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "errorIcon", js.Array(value*))
    
    inline def setErrorIconVdomElement(value: VdomElement): Self = StObject.set(x, "errorIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFixOnBlur(value: FixNumberOnBlur): Self = StObject.set(x, "fixOnBlur", value.asInstanceOf[js.Any])
    
    inline def setFixOnBlurUndefined: Self = StObject.set(x, "fixOnBlur", js.undefined)
    
    inline def setGetErrorIcon(value: (/* errorMessage */ String, /* error */ Boolean, /* errorIcon */ Node) => Node): Self = StObject.set(x, "getErrorIcon", js.Any.fromFunction3(value))
    
    inline def setGetErrorIconUndefined: Self = StObject.set(x, "getErrorIcon", js.undefined)
    
    inline def setGetErrorMessage(value: /* options */ ErrorMessageOptions => String): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction1(value))
    
    inline def setGetErrorMessageUndefined: Self = StObject.set(x, "getErrorMessage", js.undefined)
    
    inline def setHelpText(value: VdomNode): Self = StObject.set(x, "helpText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setHelpTextNull: Self = StObject.set(x, "helpText", null)
    
    inline def setHelpTextUndefined: Self = StObject.set(x, "helpText", js.undefined)
    
    inline def setHelpTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "helpText", js.Array(value*))
    
    inline def setHelpTextVdomElement(value: VdomElement): Self = StObject.set(x, "helpText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsErrored(value: /* options */ IsErroredOptions => Boolean): Self = StObject.set(x, "isErrored", js.Any.fromFunction1(value))
    
    inline def setIsErroredUndefined: Self = StObject.set(x, "isErrored", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOnBlur(
      value: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
    ): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(
      value: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnErrorChange(value: (/* id */ String, /* error */ Boolean) => Callback): Self = StObject.set(x, "onErrorChange", js.Any.fromFunction2((t0: /* id */ String, t1: /* error */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def setOnErrorChangeUndefined: Self = StObject.set(x, "onErrorChange", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTheme(value: FormTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUpdateOnChange(value: Boolean): Self = StObject.set(x, "updateOnChange", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnChangeUndefined: Self = StObject.set(x, "updateOnChange", js.undefined)
    
    inline def setValidateOnChange(value: ChangeValidationBehavior): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
    
    inline def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
    
    inline def setValidateOnChangeVarargs(
      value: (badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing)*
    ): Self = StObject.set(x, "validateOnChange", js.Array(value*))
  }
}
