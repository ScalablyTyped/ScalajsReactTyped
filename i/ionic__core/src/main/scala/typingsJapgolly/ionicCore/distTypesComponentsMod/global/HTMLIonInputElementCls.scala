package typingsJapgolly.ionicCore.distTypesComponentsMod.global

import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.Element
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.ionicCore.ionicCoreStrings.off
import typingsJapgolly.ionicCore.ionicCoreStrings.on
import typingsJapgolly.ionicCore.mod.AutocompleteTypes
import typingsJapgolly.ionicCore.mod.TextFieldTypes
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLSlotElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("HTMLIonInputElement")
@js.native
open class HTMLIonInputElementCls ()
  extends StObject
     with HTMLIonInputElement {
  
  /* standard dom */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
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
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user. Available options: `"off"`, `"none"`, `"on"`, `"sentences"`, `"words"`, `"characters"`.
    */
  /* CompleteClass */
  var autocapitalize: String = js.native
  
  /**
    * Indicates whether the value of the control can be automatically completed by the browser.
    */
  /* CompleteClass */
  var autocomplete: AutocompleteTypes = js.native
  
  /**
    * Whether auto correction should be enabled when the user is entering/editing the text value.
    */
  /* CompleteClass */
  var autocorrect: on | off = js.native
  
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  /* CompleteClass */
  var autofocus: Boolean = js.native
  
  /**
    * If `true`, a clear icon will appear in the input when there is a value. Clicking it clears the input.
    */
  /* CompleteClass */
  var clearInput: Boolean = js.native
  
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
    * This is required for a WebKit bug which requires us to blur and focus an input to properly focus the input in an item with delegatesFocus. It will no longer be needed with iOS 14.
    */
  /* CompleteClass */
  var fireFocusEvents: Boolean = js.native
  
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
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /** Returns the first following sibling that is an element, and null otherwise. */
  /* standard dom */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  
  /** Returns the first preceding sibling that is an element, and null otherwise. */
  /* standard dom */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  
  /**
    * If `true`, the user cannot modify the value.
    */
  /* CompleteClass */
  var readonly: Boolean = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  /* CompleteClass */
  var required: Boolean = js.native
  
  /**
    * Sets blur on the native `input` in `ion-input`. Use this method instead of the global `input.blur()`.
    */
  /* CompleteClass */
  override def setBlur(): js.Promise[Unit] = js.native
  
  /**
    * Sets focus on the native `input` in `ion-input`. Use this method instead of the global `input.focus()`.
    */
  /* CompleteClass */
  override def setFocus(): js.Promise[Unit] = js.native
  
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  /* CompleteClass */
  var spellcheck: Boolean = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  
  /**
    * The type of control to display. The default type is text.
    */
  /* CompleteClass */
  var `type`: TextFieldTypes = js.native
}
