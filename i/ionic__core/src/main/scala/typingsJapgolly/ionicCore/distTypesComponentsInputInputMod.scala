package typingsJapgolly.ionicCore

import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.ionicCore.distTypesComponentsInputInputInterfaceMod.InputChangeEventDetail
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.ionicCoreStrings.decimal
import typingsJapgolly.ionicCore.ionicCoreStrings.done
import typingsJapgolly.ionicCore.ionicCoreStrings.email
import typingsJapgolly.ionicCore.ionicCoreStrings.enter
import typingsJapgolly.ionicCore.ionicCoreStrings.go
import typingsJapgolly.ionicCore.ionicCoreStrings.next
import typingsJapgolly.ionicCore.ionicCoreStrings.none
import typingsJapgolly.ionicCore.ionicCoreStrings.numeric
import typingsJapgolly.ionicCore.ionicCoreStrings.off
import typingsJapgolly.ionicCore.ionicCoreStrings.on
import typingsJapgolly.ionicCore.ionicCoreStrings.previous
import typingsJapgolly.ionicCore.ionicCoreStrings.search
import typingsJapgolly.ionicCore.ionicCoreStrings.send
import typingsJapgolly.ionicCore.ionicCoreStrings.tel
import typingsJapgolly.ionicCore.ionicCoreStrings.text
import typingsJapgolly.ionicCore.ionicCoreStrings.url
import typingsJapgolly.ionicCore.mod.AutocompleteTypes
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import typingsJapgolly.ionicCore.mod.TextFieldTypes
import typingsJapgolly.std.InputEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsInputInputMod {
  
  @JSImport("@ionic/core/dist/types/components/input/input", "Input")
  @js.native
  open class Input ()
    extends StObject
       with ComponentInterface {
    
    /**
      * This attribute is ignored.
      * @deprecated
      */
    var accept: js.UndefOr[String] = js.native
    
    /**
      * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
      * Available options: `"off"`, `"none"`, `"on"`, `"sentences"`, `"words"`, `"characters"`.
      */
    var autocapitalize: String = js.native
    
    /**
      * Indicates whether the value of the control can be automatically completed by the browser.
      */
    var autocomplete: AutocompleteTypes = js.native
    
    /**
      * Whether auto correction should be enabled when the user is entering/editing the text value.
      */
    var autocorrect: on | off = js.native
    
    /**
      * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
      */
    var autofocus: Boolean = js.native
    
    /**
      * If `true`, a clear icon will appear in the input when there is a value. Clicking it clears the input.
      */
    var clearInput: Boolean = js.native
    
    /**
      * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
      */
    var clearOnEdit: js.UndefOr[Boolean] = js.native
    
    /* private */ var clearTextInput: Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MInput(): Unit = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MInput(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MInput(): Unit = js.native
    
    /**
      * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
      */
    var debounce: Double = js.native
    
    /* protected */ def debounceChanged(): Unit = js.native
    
    /* private */ var didBlurAfterEdit: Any = js.native
    
    /**
      * If `true`, the user cannot interact with the input.
      */
    var disabled: Boolean = js.native
    
    /* protected */ def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MInput(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var emitStyle: Any = js.native
    
    /**
      * A hint to the browser for which enter key to display.
      * Possible values: `"enter"`, `"done"`, `"go"`, `"next"`,
      * `"previous"`, `"search"`, and `"send"`.
      */
    var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.native
    
    /**
      * This is required for a WebKit bug which requires us to
      * blur and focus an input to properly focus the input in
      * an item with delegatesFocus. It will no longer be needed
      * with iOS 14.
      *
      * @internal
      */
    var fireFocusEvents: Boolean = js.native
    
    /* private */ var focusChanged: Any = js.native
    
    /**
      * Returns the native `<input>` element used under the hood.
      */
    def getInputElement(): js.Promise[HTMLInputElement] = js.native
    
    /* private */ var getValue: Any = js.native
    
    var hasFocus: Boolean = js.native
    
    /* private */ var hasValue: Any = js.native
    
    /* private */ var inheritedAttributes: Any = js.native
    
    /* private */ var inputId: Any = js.native
    
    /**
      * A hint to the browser for which keyboard to display.
      * Possible values: `"none"`, `"text"`, `"tel"`, `"url"`,
      * `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
      */
    var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    /**
      * Emitted when the input loses focus.
      */
    var ionBlur: EventEmitter[FocusEvent] = js.native
    
    /**
      * Emitted when the value has changed.
      */
    var ionChange: EventEmitter[InputChangeEventDetail] = js.native
    
    /**
      * Emitted when the input has focus.
      */
    var ionFocus: EventEmitter[FocusEvent] = js.native
    
    /**
      * Emitted when a keyboard input occurred.
      */
    var ionInput: EventEmitter[InputEvent] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    /* private */ var isComposing: Any = js.native
    
    /**
      * The maximum value, which must not be less than its minimum (min attribute) value.
      */
    var max: js.UndefOr[String | Double] = js.native
    
    /**
      * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
      */
    var maxlength: js.UndefOr[Double] = js.native
    
    /**
      * The minimum value, which must not be greater than its maximum (max attribute) value.
      */
    var min: js.UndefOr[String | Double] = js.native
    
    /**
      * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
      */
    var minlength: js.UndefOr[Double] = js.native
    
    /**
      * If `true`, the user can enter more than one value. This attribute applies when the type attribute is set to `"email"`, otherwise it is ignored.
      */
    var multiple: js.UndefOr[Boolean] = js.native
    
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    
    /* private */ var nativeInput: Any = js.native
    
    /* private */ var onBlur: Any = js.native
    
    /* private */ var onCompositionEnd: Any = js.native
    
    /* private */ var onCompositionStart: Any = js.native
    
    /* private */ var onFocus: Any = js.native
    
    /* private */ var onInput: Any = js.native
    
    /* private */ var onKeydown: Any = js.native
    
    /**
      * A regular expression that the value is checked against. The pattern must match the entire value, not just some subset. Use the title attribute to describe the pattern to help the user. This attribute applies when the value of the type attribute is `"text"`, `"search"`, `"tel"`, `"url"`, `"email"`, `"date"`, or `"password"`, otherwise it is ignored. When the type attribute is `"date"`, `pattern` will only be used in browsers that do not support the `"date"` input type natively. See https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/date for more information.
      */
    var pattern: js.UndefOr[String] = js.native
    
    /**
      * Instructional text that shows before the input has a value.
      * This property applies only when the `type` property is set to `"email"`,
      * `"number"`, `"password"`, `"search"`, `"tel"`, `"text"`, or `"url"`, otherwise it is ignored.
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * Update the item classes when the placeholder changes
      */
    /* protected */ def placeholderChanged(): Unit = js.native
    
    /**
      * If `true`, the user cannot modify the value.
      */
    var readonly: Boolean = js.native
    
    @JSName("render")
    def render_MInput(): Any = js.native
    
    /**
      * If `true`, the user must fill in a value before submitting a form.
      */
    var required: Boolean = js.native
    
    /**
      * Sets blur on the native `input` in `ion-input`. Use this method instead of the global
      * `input.blur()`.
      * @internal
      */
    def setBlur(): js.Promise[Unit] = js.native
    
    /**
      * Sets focus on the native `input` in `ion-input`. Use this method instead of the global
      * `input.focus()`.
      */
    def setFocus(): js.Promise[Unit] = js.native
    
    /* private */ var shouldClearOnEdit: Any = js.native
    
    /**
      * The initial size of the control. This value is in pixels unless the value of the type attribute is `"text"` or `"password"`, in which case it is an integer number of characters. This attribute applies only when the `type` attribute is set to `"text"`, `"search"`, `"tel"`, `"url"`, `"email"`, or `"password"`, otherwise it is ignored.
      */
    var size: js.UndefOr[Double] = js.native
    
    /**
      * If `true`, the element will have its spelling and grammar checked.
      */
    var spellcheck: Boolean = js.native
    
    /**
      * Works with the min and max attributes to limit the increments at which a value can be set.
      * Possible values are: `"any"` or a positive floating point number.
      */
    var step: js.UndefOr[String] = js.native
    
    /**
      * The type of control to display. The default type is text.
      */
    var `type`: TextFieldTypes = js.native
    
    /**
      * The value of the input.
      */
    var value: js.UndefOr[String | Double | Null] = js.native
    
    /**
      * Update the native input element when the value changes
      */
    /* protected */ def valueChanged(): Unit = js.native
  }
}
