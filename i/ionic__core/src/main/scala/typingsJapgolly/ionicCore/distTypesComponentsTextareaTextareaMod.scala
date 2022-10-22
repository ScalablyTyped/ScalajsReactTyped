package typingsJapgolly.ionicCore

import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.ionicCore.distTypesComponentsTextareaTextareaInterfaceMod.TextareaChangeEventDetail
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.ionicCoreStrings.decimal
import typingsJapgolly.ionicCore.ionicCoreStrings.done
import typingsJapgolly.ionicCore.ionicCoreStrings.email
import typingsJapgolly.ionicCore.ionicCoreStrings.enter
import typingsJapgolly.ionicCore.ionicCoreStrings.go
import typingsJapgolly.ionicCore.ionicCoreStrings.hard
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
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import typingsJapgolly.std.InputEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTextareaTextareaMod {
  
  @JSImport("@ionic/core/dist/types/components/textarea/textarea", "Textarea")
  @js.native
  open class Textarea ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `true`, the textarea container will grow and shrink based
      * on the contents of the textarea.
      */
    var autoGrow: Boolean = js.native
    
    /**
      * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
      * Available options: `"off"`, `"none"`, `"on"`, `"sentences"`, `"words"`, `"characters"`.
      */
    var autocapitalize: String = js.native
    
    /**
      * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
      */
    var autofocus: Boolean = js.native
    
    /**
      * Check if we need to clear the text input if clearOnEdit is enabled
      */
    /* private */ var checkClearOnEdit: Any = js.native
    
    /**
      * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
      */
    var clearOnEdit: Boolean = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    /**
      * The visible width of the text control, in average character widths. If it is specified, it must be a positive integer.
      */
    var cols: js.UndefOr[Double] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MTextarea(): Unit = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MTextarea(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MTextarea(): Unit = js.native
    
    /**
      * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
      */
    var debounce: Double = js.native
    
    /* protected */ def debounceChanged(): Unit = js.native
    
    /* private */ var didBlurAfterEdit: Any = js.native
    
    /**
      * If `true`, the user cannot interact with the textarea.
      */
    var disabled: Boolean = js.native
    
    /* protected */ def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MTextarea(): Unit = js.native
    
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
    
    /* private */ var focusChange: Any = js.native
    
    /**
      * Returns the native `<textarea>` element used under the hood.
      */
    def getInputElement(): js.Promise[HTMLTextAreaElement] = js.native
    
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
      * Emitted when the input value has changed.
      */
    var ionChange: EventEmitter[TextareaChangeEventDetail] = js.native
    
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
    
    /**
      * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
      */
    var maxlength: js.UndefOr[Double] = js.native
    
    /**
      * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
      */
    var minlength: js.UndefOr[Double] = js.native
    
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    
    /* private */ var nativeInput: Any = js.native
    
    /* private */ var onBlur: Any = js.native
    
    /* private */ var onFocus: Any = js.native
    
    /* private */ var onInput: Any = js.native
    
    /* private */ var onKeyDown: Any = js.native
    
    /**
      * Instructional text that shows before the input has a value.
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * If `true`, the user cannot modify the value.
      */
    var readonly: Boolean = js.native
    
    @JSName("render")
    def render_MTextarea(): Any = js.native
    
    /**
      * If `true`, the user must fill in a value before submitting a form.
      */
    var required: Boolean = js.native
    
    /**
      * The number of visible text lines for the control.
      */
    var rows: js.UndefOr[Double] = js.native
    
    /* private */ var runAutoGrow: Any = js.native
    
    /**
      * Sets blur on the native `textarea` in `ion-textarea`. Use this method instead of the global
      * `textarea.blur()`.
      * @internal
      */
    def setBlur(): js.Promise[Unit] = js.native
    
    /**
      * Sets focus on the native `textarea` in `ion-textarea`. Use this method instead of the global
      * `textarea.focus()`.
      */
    def setFocus(): js.Promise[Unit] = js.native
    
    /**
      * If `true`, the element will have its spelling and grammar checked.
      */
    var spellcheck: Boolean = js.native
    
    /* private */ var textareaWrapper: Any = js.native
    
    /**
      * The value of the textarea.
      */
    var value: js.UndefOr[String | Null] = js.native
    
    /**
      * Update the native input element when the value changes
      */
    /* protected */ def valueChanged(): Unit = js.native
    
    /**
      * Indicates how the control wraps text.
      */
    var wrap: js.UndefOr[hard | soft | off] = js.native
  }
}
