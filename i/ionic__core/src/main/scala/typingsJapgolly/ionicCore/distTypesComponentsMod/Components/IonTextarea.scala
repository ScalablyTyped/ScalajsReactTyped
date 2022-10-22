package typingsJapgolly.ionicCore.distTypesComponentsMod.Components

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLTextAreaElement
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonTextarea extends StObject {
  
  /**
    * If `true`, the textarea container will grow and shrink based on the contents of the textarea.
    */
  var autoGrow: Boolean
  
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user. Available options: `"off"`, `"none"`, `"on"`, `"sentences"`, `"words"`, `"characters"`.
    */
  var autocapitalize: String
  
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  var autofocus: Boolean
  
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  var clearOnEdit: Boolean
  
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
  var debounce: Double
  
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  var disabled: Boolean
  
  /**
    * A hint to the browser for which enter key to display. Possible values: `"enter"`, `"done"`, `"go"`, `"next"`, `"previous"`, `"search"`, and `"send"`.
    */
  var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
  
  /**
    * This is required for a WebKit bug which requires us to blur and focus an input to properly focus the input in an item with delegatesFocus. It will no longer be needed with iOS 14.
    */
  var fireFocusEvents: Boolean
  
  /**
    * Returns the native `<textarea>` element used under the hood.
    */
  def getInputElement(): js.Promise[HTMLTextAreaElement]
  
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
  var name: String
  
  /**
    * Instructional text that shows before the input has a value.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the user cannot modify the value.
    */
  var readonly: Boolean
  
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  var required: Boolean
  
  /**
    * The number of visible text lines for the control.
    */
  var rows: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets blur on the native `textarea` in `ion-textarea`. Use this method instead of the global `textarea.blur()`.
    */
  def setBlur(): js.Promise[Unit]
  
  /**
    * Sets focus on the native `textarea` in `ion-textarea`. Use this method instead of the global `textarea.focus()`.
    */
  def setFocus(): js.Promise[Unit]
  
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  var spellcheck: Boolean
  
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
  
  inline def apply(
    autoGrow: Boolean,
    autocapitalize: String,
    autofocus: Boolean,
    clearOnEdit: Boolean,
    debounce: Double,
    disabled: Boolean,
    fireFocusEvents: Boolean,
    getInputElement: CallbackTo[js.Promise[HTMLTextAreaElement]],
    name: String,
    readonly: Boolean,
    required: Boolean,
    setBlur: CallbackTo[js.Promise[Unit]],
    setFocus: CallbackTo[js.Promise[Unit]],
    spellcheck: Boolean
  ): IonTextarea = {
    val __obj = js.Dynamic.literal(autoGrow = autoGrow.asInstanceOf[js.Any], autocapitalize = autocapitalize.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], clearOnEdit = clearOnEdit.asInstanceOf[js.Any], debounce = debounce.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], fireFocusEvents = fireFocusEvents.asInstanceOf[js.Any], getInputElement = getInputElement.toJsFn, name = name.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], setBlur = setBlur.toJsFn, setFocus = setFocus.toJsFn, spellcheck = spellcheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTextarea]
  }
  
  extension [Self <: IonTextarea](x: Self) {
    
    inline def setAutoGrow(value: Boolean): Self = StObject.set(x, "autoGrow", value.asInstanceOf[js.Any])
    
    inline def setAutocapitalize(value: String): Self = StObject.set(x, "autocapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setClearOnEdit(value: Boolean): Self = StObject.set(x, "clearOnEdit", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setEnterkeyhint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterkeyhint", value.asInstanceOf[js.Any])
    
    inline def setEnterkeyhintUndefined: Self = StObject.set(x, "enterkeyhint", js.undefined)
    
    inline def setFireFocusEvents(value: Boolean): Self = StObject.set(x, "fireFocusEvents", value.asInstanceOf[js.Any])
    
    inline def setGetInputElement(value: CallbackTo[js.Promise[HTMLTextAreaElement]]): Self = StObject.set(x, "getInputElement", value.toJsFn)
    
    inline def setInputmode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
    
    inline def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
    
    inline def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    inline def setMinlength(value: Double): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
    
    inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSetBlur(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "setBlur", value.toJsFn)
    
    inline def setSetFocus(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "setFocus", value.toJsFn)
    
    inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWrap(value: hard | soft | off): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
