package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import org.scalajs.dom.FocusEvent
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonTextareaCustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsTextareaTextareaInterfaceMod.TextareaChangeEventDetail
import typingsJapgolly.ionicCore.ionicCoreStrings.decimal
import typingsJapgolly.ionicCore.ionicCoreStrings.done
import typingsJapgolly.ionicCore.ionicCoreStrings.email
import typingsJapgolly.ionicCore.ionicCoreStrings.enter
import typingsJapgolly.ionicCore.ionicCoreStrings.go
import typingsJapgolly.ionicCore.ionicCoreStrings.hard
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.ionicCoreStrings.next
import typingsJapgolly.ionicCore.ionicCoreStrings.none
import typingsJapgolly.ionicCore.ionicCoreStrings.numeric
import typingsJapgolly.ionicCore.ionicCoreStrings.off
import typingsJapgolly.ionicCore.ionicCoreStrings.previous
import typingsJapgolly.ionicCore.ionicCoreStrings.search
import typingsJapgolly.ionicCore.ionicCoreStrings.send
import typingsJapgolly.ionicCore.ionicCoreStrings.soft
import typingsJapgolly.ionicCore.ionicCoreStrings.tel
import typingsJapgolly.ionicCore.ionicCoreStrings.text
import typingsJapgolly.ionicCore.ionicCoreStrings.url
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.std.InputEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonTextarea extends StObject {
  
  /**
    * If `true`, the textarea container will grow and shrink based on the contents of the textarea.
    */
  var autoGrow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user. Available options: `"off"`, `"none"`, `"on"`, `"sentences"`, `"words"`, `"characters"`.
    */
  var autocapitalize: js.UndefOr[String] = js.undefined
  
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  var autofocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  var clearOnEdit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * The visible width of the text control, in average character widths. If it is specified, it must be a positive integer.
    */
  var cols: js.UndefOr[Double] = js.undefined
  
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  var debounce: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A hint to the browser for which enter key to display. Possible values: `"enter"`, `"done"`, `"go"`, `"next"`, `"previous"`, `"search"`, and `"send"`.
    */
  var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
  
  /**
    * A hint to the browser for which keyboard to display. Possible values: `"none"`, `"text"`, `"tel"`, `"url"`, `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
    */
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
    */
  var maxlength: js.UndefOr[Double] = js.undefined
  
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
    */
  var minlength: js.UndefOr[Double] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Emitted when the input loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ IonTextareaCustomEvent[FocusEvent], Unit]] = js.undefined
  
  /**
    * Emitted when the input value has changed.
    */
  var onIonChange: js.UndefOr[
    js.Function1[/* event */ IonTextareaCustomEvent[TextareaChangeEventDetail], Unit]
  ] = js.undefined
  
  /**
    * Emitted when the input has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ IonTextareaCustomEvent[FocusEvent], Unit]] = js.undefined
  
  /**
    * Emitted when a keyboard input occurred.
    */
  var onIonInput: js.UndefOr[js.Function1[/* event */ IonTextareaCustomEvent[InputEvent], Unit]] = js.undefined
  
  /**
    * Instructional text that shows before the input has a value.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the user cannot modify the value.
    */
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of visible text lines for the control.
    */
  var rows: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the textarea.
    */
  var value: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates how the control wraps text.
    */
  var wrap: js.UndefOr[hard | soft | off] = js.undefined
}
object IonTextarea {
  
  inline def apply(): IonTextarea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonTextarea]
  }
  
  extension [Self <: IonTextarea](x: Self) {
    
    inline def setAutoGrow(value: Boolean): Self = StObject.set(x, "autoGrow", value.asInstanceOf[js.Any])
    
    inline def setAutoGrowUndefined: Self = StObject.set(x, "autoGrow", js.undefined)
    
    inline def setAutocapitalize(value: String): Self = StObject.set(x, "autocapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutocapitalizeUndefined: Self = StObject.set(x, "autocapitalize", js.undefined)
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    inline def setClearOnEdit(value: Boolean): Self = StObject.set(x, "clearOnEdit", value.asInstanceOf[js.Any])
    
    inline def setClearOnEditUndefined: Self = StObject.set(x, "clearOnEdit", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnterkeyhint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterkeyhint", value.asInstanceOf[js.Any])
    
    inline def setEnterkeyhintUndefined: Self = StObject.set(x, "enterkeyhint", js.undefined)
    
    inline def setInputmode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
    
    inline def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
    
    inline def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    inline def setMinlength(value: Double): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
    
    inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnIonBlur(value: /* event */ IonTextareaCustomEvent[FocusEvent] => Callback): Self = StObject.set(x, "onIonBlur", js.Any.fromFunction1((t0: /* event */ IonTextareaCustomEvent[FocusEvent]) => value(t0).runNow()))
    
    inline def setOnIonBlurUndefined: Self = StObject.set(x, "onIonBlur", js.undefined)
    
    inline def setOnIonChange(value: /* event */ IonTextareaCustomEvent[TextareaChangeEventDetail] => Callback): Self = StObject.set(x, "onIonChange", js.Any.fromFunction1((t0: /* event */ IonTextareaCustomEvent[TextareaChangeEventDetail]) => value(t0).runNow()))
    
    inline def setOnIonChangeUndefined: Self = StObject.set(x, "onIonChange", js.undefined)
    
    inline def setOnIonFocus(value: /* event */ IonTextareaCustomEvent[FocusEvent] => Callback): Self = StObject.set(x, "onIonFocus", js.Any.fromFunction1((t0: /* event */ IonTextareaCustomEvent[FocusEvent]) => value(t0).runNow()))
    
    inline def setOnIonFocusUndefined: Self = StObject.set(x, "onIonFocus", js.undefined)
    
    inline def setOnIonInput(value: /* event */ IonTextareaCustomEvent[InputEvent] => Callback): Self = StObject.set(x, "onIonInput", js.Any.fromFunction1((t0: /* event */ IonTextareaCustomEvent[InputEvent]) => value(t0).runNow()))
    
    inline def setOnIonInputUndefined: Self = StObject.set(x, "onIonInput", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWrap(value: hard | soft | off): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
