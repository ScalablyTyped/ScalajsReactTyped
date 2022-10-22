package typingsJapgolly.ionicCore.distTypesComponentsMod.global

import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.Element
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.ionicCore.ionicCoreStrings.always
import typingsJapgolly.ionicCore.ionicCoreStrings.email
import typingsJapgolly.ionicCore.ionicCoreStrings.focus
import typingsJapgolly.ionicCore.ionicCoreStrings.never
import typingsJapgolly.ionicCore.ionicCoreStrings.number
import typingsJapgolly.ionicCore.ionicCoreStrings.off
import typingsJapgolly.ionicCore.ionicCoreStrings.on
import typingsJapgolly.ionicCore.ionicCoreStrings.password
import typingsJapgolly.ionicCore.ionicCoreStrings.search
import typingsJapgolly.ionicCore.ionicCoreStrings.tel
import typingsJapgolly.ionicCore.ionicCoreStrings.text
import typingsJapgolly.ionicCore.ionicCoreStrings.url
import typingsJapgolly.ionicCore.mod.AutocompleteTypes
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLSlotElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("HTMLIonSearchbarElement")
@js.native
open class HTMLIonSearchbarElementCls ()
  extends StObject
     with HTMLIonSearchbarElement {
  
  /* standard dom */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /**
    * If `true`, enable searchbar animation.
    */
  /* CompleteClass */
  var animated: Boolean = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaAtomic: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaAutoComplete: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaBusy: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaChecked: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaColCount: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaColIndex: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaColSpan: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaCurrent: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaDisabled: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaExpanded: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaHasPopup: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaHidden: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaKeyShortcuts: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaLabel: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaLevel: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaLive: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaModal: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaMultiLine: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaMultiSelectable: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaOrientation: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaPlaceholder: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaPosInSet: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaPressed: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaReadOnly: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaRequired: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaRoleDescription: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaRowCount: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaRowIndex: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaRowSpan: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaSelected: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaSetSize: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaSort: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaValueMax: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaValueMin: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaValueNow: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaValueText: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  
  /**
    * Set the input's autocomplete property.
    */
  /* CompleteClass */
  var autocomplete: AutocompleteTypes = js.native
  
  /**
    * Set the input's autocorrect property.
    */
  /* CompleteClass */
  var autocorrect: on | off = js.native
  
  /**
    * Set the cancel button icon. Only applies to `md` mode. Defaults to `arrow-back-sharp`.
    */
  /* CompleteClass */
  var cancelButtonIcon: String = js.native
  
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  /* CompleteClass */
  var cancelButtonText: String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var contentEditable: String = js.native
  
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  /* CompleteClass */
  var debounce: Double = js.native
  
  /**
    * If `true`, the user cannot interact with the input.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* standard dom */
  /* CompleteClass */
  var enterKeyHint: String = js.native
  
  /**
    * Returns the native `<input>` element used under the hood.
    */
  /* CompleteClass */
  override def getInputElement(): js.Promise[HTMLInputElement] = js.native
  
  /* standard dom */
  /* CompleteClass */
  var innerHTML: String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var inputMode: String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
  
  /** Returns the first following sibling that is an element, and null otherwise. */
  /* standard dom */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  /* CompleteClass */
  var placeholder: String = js.native
  
  /** Returns the first preceding sibling that is an element, and null otherwise. */
  /* standard dom */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /**
    * Sets focus on the specified `ion-searchbar`. Use this method instead of the global `input.focus()`.
    */
  /* CompleteClass */
  override def setFocus(): js.Promise[Unit] = js.native
  
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  /* CompleteClass */
  var showCancelButton: never | focus | always = js.native
  
  /**
    * Sets the behavior for the clear button. Defaults to `"focus"`. Setting to `"focus"` shows the clear button on focus if the input is not empty. Setting to `"never"` hides the clear button. Setting to `"always"` shows the clear button regardless of focus state, but only if the input is not empty.
    */
  /* CompleteClass */
  var showClearButton: never | focus | always = js.native
  
  /**
    * If `true`, enable spellcheck on the input.
    */
  /* CompleteClass */
  var spellcheck: Boolean = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  
  /**
    * Set the type of the input.
    */
  /* CompleteClass */
  var `type`: text | password | email | number | search | tel | url = js.native
}
