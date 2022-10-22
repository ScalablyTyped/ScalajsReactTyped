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
import typingsJapgolly.reactMdForm.typesTextFieldUseTextFieldMod.ErrorChangeHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-md/form.@react-md/form/types/text-field/useTextField.TextFieldHookOptions & {  disableMessage :false} */
trait TextFieldHookOptionsdisabCounter extends StObject {
  
  /**
    * Boolean if the `FormMessage` should also display a counter for the
    * remaining letters allowed based on the `maxLength`.
    *
    * This will still be considered false if the `maxLength` value is not
    * provided.
    */
  var counter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default value to use for the `TextField` or `TextArea` one initial
    * render. If you want to manually change the value to something else after
    * the initial render, either change the `key` for the component containing
    * this hook, or use the `setState` function returned from this hook.
    */
  var defaultValue: js.UndefOr[String | js.Function0[String]] = js.undefined
  
  /**
    * Boolean if the `maxLength` prop should not be passed to the `TextField`
    * component since it will prevent any additional characters from being
    * entered in the text field which might feel like weird behavior to some
    * users. This should really only be used when the `counter` option is also
    * enabled and rendering along with a `FormMessage` component.
    */
  var disableMaxLength: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean if the `TextField` or `TextArea` will **not** be rendered along
    * with a `FormMessage` component. This will prevent the `aria-describedby`
    * prop from being returned when set to `true`.
    */
  var disableMessage: js.UndefOr[Boolean] & `false`
  
  /**
    * An optional error icon used in the {@link getErrorIcon} option.
    */
  var errorIcon: js.UndefOr[Node] = js.undefined
  
  /**
    * A function used to get the error icon to display at the right of the
    * `TextField` or `TextArea`. The default behavior will only show an icon when
    * the `error` state is `true` and an `errorIcon` option has been provided.
    */
  var getErrorIcon: js.UndefOr[GetErrorIcon] = js.undefined
  
  /**
    * A function to get and display an error message based on the `TextField` or
    * `TextArea` validity. See {@link defaultGetErrorMessage} for the default
    * implementation details.
    */
  var getErrorMessage: js.UndefOr[GetErrorMessage] = js.undefined
  
  /**
    * An optional help text to display in the `FormMessage` component when there
    * is not an error.
    */
  var helpText: js.UndefOr[Node] = js.undefined
  
  var id: String
  
  /**
    * A function used to determine if the `TextField` or `TextArea` is an in
    * errored state. See {@link defaultIsErrored} for the default implementation
    * details.
    */
  var isErrored: js.UndefOr[IsErrored] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
  
  var onChange: js.UndefOr[FormEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
  
  /**
    * An optional function that will be called whenever the `error` state is
    * changed. This can be used for more complex forms to `disable` the Submit
    * button or anything else if any field has an error.
    */
  var onErrorChange: js.UndefOr[ErrorChangeHandler] = js.undefined
  
  var pattern: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[FormTheme] = js.undefined
  
  /**
    * Describes the validation behavior that should be done when the value within
    * the `TextField` changes. This can either be:
    *
    * - a boolean
    * - the string `"recommended"`
    * - a single key of the ValidityState that should trigger the validation
    * - a list of keys of the ValidityState that should trigger the validation
    */
  var validateOnChange: js.UndefOr[ChangeValidationBehavior] = js.undefined
}
object TextFieldHookOptionsdisabCounter {
  
  inline def apply(disableMessage: js.UndefOr[Boolean] & `false`, id: String): TextFieldHookOptionsdisabCounter = {
    val __obj = js.Dynamic.literal(disableMessage = disableMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldHookOptionsdisabCounter]
  }
  
  extension [Self <: TextFieldHookOptionsdisabCounter](x: Self) {
    
    inline def setCounter(value: Boolean): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setDefaultValue(value: String | js.Function0[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueCallbackTo(value: CallbackTo[String]): Self = StObject.set(x, "defaultValue", value.toJsFn)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisableMaxLength(value: Boolean): Self = StObject.set(x, "disableMaxLength", value.asInstanceOf[js.Any])
    
    inline def setDisableMaxLengthUndefined: Self = StObject.set(x, "disableMaxLength", js.undefined)
    
    inline def setDisableMessage(value: js.UndefOr[Boolean] & `false`): Self = StObject.set(x, "disableMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorIcon(value: VdomNode): Self = StObject.set(x, "errorIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setErrorIconNull: Self = StObject.set(x, "errorIcon", null)
    
    inline def setErrorIconUndefined: Self = StObject.set(x, "errorIcon", js.undefined)
    
    inline def setErrorIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "errorIcon", js.Array(value*))
    
    inline def setErrorIconVdomElement(value: VdomElement): Self = StObject.set(x, "errorIcon", value.rawElement.asInstanceOf[js.Any])
    
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
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
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
    
    inline def setTheme(value: FormTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setValidateOnChange(value: ChangeValidationBehavior): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
    
    inline def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
    
    inline def setValidateOnChangeVarargs(
      value: (badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing)*
    ): Self = StObject.set(x, "validateOnChange", js.Array(value*))
  }
}
