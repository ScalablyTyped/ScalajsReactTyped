package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSearchbarElement
import typingsJapgolly.ionicCore.distTypesComponentsSearchbarSearchbarInterfaceMod.SearchbarChangeEventDetail
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.ionicCoreStrings.always
import typingsJapgolly.ionicCore.ionicCoreStrings.decimal
import typingsJapgolly.ionicCore.ionicCoreStrings.done
import typingsJapgolly.ionicCore.ionicCoreStrings.email
import typingsJapgolly.ionicCore.ionicCoreStrings.enter
import typingsJapgolly.ionicCore.ionicCoreStrings.focus
import typingsJapgolly.ionicCore.ionicCoreStrings.go
import typingsJapgolly.ionicCore.ionicCoreStrings.never
import typingsJapgolly.ionicCore.ionicCoreStrings.next
import typingsJapgolly.ionicCore.ionicCoreStrings.none
import typingsJapgolly.ionicCore.ionicCoreStrings.number
import typingsJapgolly.ionicCore.ionicCoreStrings.numeric
import typingsJapgolly.ionicCore.ionicCoreStrings.off
import typingsJapgolly.ionicCore.ionicCoreStrings.on
import typingsJapgolly.ionicCore.ionicCoreStrings.password
import typingsJapgolly.ionicCore.ionicCoreStrings.previous
import typingsJapgolly.ionicCore.ionicCoreStrings.search
import typingsJapgolly.ionicCore.ionicCoreStrings.send
import typingsJapgolly.ionicCore.ionicCoreStrings.tel
import typingsJapgolly.ionicCore.ionicCoreStrings.text
import typingsJapgolly.ionicCore.ionicCoreStrings.url
import typingsJapgolly.ionicCore.mod.AutocompleteTypes
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsSearchbarSearchbarMod {
  
  @JSImport("@ionic/core/dist/types/components/searchbar/searchbar", "Searchbar")
  @js.native
  open class Searchbar ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `true`, enable searchbar animation.
      */
    var animated: Boolean = js.native
    
    /**
      * Set the input's autocomplete property.
      */
    var autocomplete: AutocompleteTypes = js.native
    
    /**
      * Set the input's autocorrect property.
      */
    var autocorrect: on | off = js.native
    
    /**
      * Set the cancel button icon. Only applies to `md` mode.
      * Defaults to `arrow-back-sharp`.
      */
    var cancelButtonIcon: String = js.native
    
    /**
      * Set the the cancel button text. Only applies to `ios` mode.
      */
    var cancelButtonText: String = js.native
    
    /**
      * Set the clear icon. Defaults to `close-circle` for `ios` and `close-sharp` for `md`.
      */
    var clearIcon: js.UndefOr[String] = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MSearchbar(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MSearchbar(): Unit = js.native
    
    /**
      * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
      */
    var debounce: Double = js.native
    
    /* protected */ def debounceChanged(): Unit = js.native
    
    /**
      * If `true`, the user cannot interact with the input.
      */
    var disabled: Boolean = js.native
    
    var el: HTMLIonSearchbarElement = js.native
    
    /* private */ var emitStyle: Any = js.native
    
    /**
      * A hint to the browser for which enter key to display.
      * Possible values: `"enter"`, `"done"`, `"go"`, `"next"`,
      * `"previous"`, `"search"`, and `"send"`.
      */
    var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.native
    
    var focused: Boolean = js.native
    
    /**
      * Returns the native `<input>` element used under the hood.
      */
    def getInputElement(): js.Promise[HTMLInputElement] = js.native
    
    /* private */ var getValue: Any = js.native
    
    /* private */ var hasValue: Any = js.native
    
    /**
      * A hint to the browser for which keyboard to display.
      * Possible values: `"none"`, `"text"`, `"tel"`, `"url"`,
      * `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
      */
    var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    /**
      * Emitted when the input loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the cancel button is clicked.
      */
    var ionCancel: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the value has changed.
      */
    var ionChange: EventEmitter[SearchbarChangeEventDetail] = js.native
    
    /**
      * Emitted when the clear input button is clicked.
      */
    var ionClear: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the input has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when a keyboard input occurred.
      */
    var ionInput: EventEmitter[KeyboardEvent] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    /* private */ var isCancelVisible: Any = js.native
    
    /* private */ var nativeInput: Any = js.native
    
    var noAnimate: Boolean = js.native
    
    /**
      * Sets the Searchbar to not focused and checks if it should align left
      * based on whether there is a value in the searchbar or not.
      */
    /* private */ var onBlur: Any = js.native
    
    /**
      * Clears the input field and tells the input to blur since
      * the clearInput function doesn't want the input to blur
      * then calls the custom cancel function if the user passed one in.
      */
    /* private */ var onCancelSearchbar: Any = js.native
    
    /**
      * Clears the input field and triggers the control change.
      */
    /* private */ var onClearInput: Any = js.native
    
    /**
      * Sets the Searchbar to focused and active on input focus.
      */
    /* private */ var onFocus: Any = js.native
    
    /**
      * Update the Searchbar input value when the input changes
      */
    /* private */ var onInput: Any = js.native
    
    /**
      * Set the input's placeholder.
      * `placeholder` can accept either plaintext or HTML as a string.
      * To display characters normally reserved for HTML, they
      * must be escaped. For example `<Ionic>` would become
      * `&lt;Ionic&gt;`
      *
      * For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
      */
    var placeholder: String = js.native
    
    /**
      * Show the iOS Cancel button on focus, hide it offscreen otherwise
      */
    /* private */ var positionCancelButton: Any = js.native
    
    /**
      * Positions the input search icon, placeholder, and the cancel button
      * based on the input value and if it is focused. (ios only)
      */
    /* private */ var positionElements: Any = js.native
    
    /**
      * Positions the input placeholder
      */
    /* private */ var positionPlaceholder: Any = js.native
    
    @JSName("render")
    def render_MSearchbar(): Any = js.native
    
    /**
      * The icon to use as the search icon. Defaults to `search-outline` in
      * `ios` mode and `search-sharp` in `md` mode.
      */
    var searchIcon: js.UndefOr[String] = js.native
    
    /**
      * Sets focus on the specified `ion-searchbar`. Use this method instead of the global
      * `input.focus()`.
      */
    def setFocus(): js.Promise[Unit] = js.native
    
    /* private */ var shouldAlignLeft: Any = js.native
    
    /**
      * Determines whether or not the cancel button should be visible onscreen.
      * Cancel button should be shown if one of two conditions applies:
      * 1. `showCancelButton` is set to `always`.
      * 2. `showCancelButton` is set to `focus`, and the searchbar has been focused.
      */
    /* private */ var shouldShowCancelButton: Any = js.native
    
    /**
      * Determines whether or not the clear button should be visible onscreen.
      * Clear button should be shown if one of two conditions applies:
      * 1. `showClearButton` is set to `always`.
      * 2. `showClearButton` is set to `focus`, and the searchbar has been focused.
      */
    /* private */ var shouldShowClearButton: Any = js.native
    
    /**
      * Sets the behavior for the cancel button. Defaults to `"never"`.
      * Setting to `"focus"` shows the cancel button on focus.
      * Setting to `"never"` hides the cancel button.
      * Setting to `"always"` shows the cancel button regardless
      * of focus state.
      */
    var showCancelButton: never | focus | always = js.native
    
    /* protected */ def showCancelButtonChanged(): Unit = js.native
    
    /**
      * Sets the behavior for the clear button. Defaults to `"focus"`.
      * Setting to `"focus"` shows the clear button on focus if the
      * input is not empty.
      * Setting to `"never"` hides the clear button.
      * Setting to `"always"` shows the clear button regardless
      * of focus state, but only if the input is not empty.
      */
    var showClearButton: never | focus | always = js.native
    
    /**
      * If `true`, enable spellcheck on the input.
      */
    var spellcheck: Boolean = js.native
    
    /**
      * Set the type of the input.
      */
    var `type`: text | password | email | number | search | tel | url = js.native
    
    /**
      * the value of the searchbar.
      */
    var value: js.UndefOr[String | Null] = js.native
    
    /* protected */ def valueChanged(): Unit = js.native
  }
}
