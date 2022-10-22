package typingsJapgolly.ionicCore.distTypesComponentsMod.global

import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.Element
import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.ionicCore.ionicCoreStrings.bottom
import typingsJapgolly.ionicCore.ionicCoreStrings.top
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLSlotElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("HTMLIonInfiniteScrollElement")
@js.native
open class HTMLIonInfiniteScrollElementCls ()
  extends StObject
     with HTMLIonInfiniteScrollElement {
  
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
    * Call `complete()` within the `ionInfinite` output event handler when your async operation has completed. For example, the `loading` state is while the app is performing an asynchronous operation, such as receiving more data from an AJAX request to add more items to a data list. Once the data has been received and UI updated, you then call this method to signify that the loading has completed. This method will change the infinite scroll's state from `loading` to `enabled`.
    */
  /* CompleteClass */
  override def complete(): js.Promise[Unit] = js.native
  
  /* standard dom */
  /* CompleteClass */
  var contentEditable: String = js.native
  
  /**
    * If `true`, the infinite scroll will be hidden and scroll event listeners will be removed.  Set this to true to disable the infinite scroll from actively trying to receive new data while scrolling. This is useful when it is known that there is no more data that can be added, and the infinite scroll is no longer needed.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* standard dom */
  /* CompleteClass */
  var enterKeyHint: String = js.native
  
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
    * The position of the infinite scroll element. The value can be either `top` or `bottom`.
    */
  /* CompleteClass */
  var position: top | bottom = js.native
  
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
  
  /* standard dom */
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  
  /**
    * The threshold distance from the bottom of the content to call the `infinite` output event when scrolled. The threshold value can be either a percent, or in pixels. For example, use the value of `10%` for the `infinite` output event to get called when the user has scrolled 10% from the bottom of the page. Use the value `100px` when the scroll is within 100 pixels from the bottom of the page.
    */
  /* CompleteClass */
  var threshold: String = js.native
}
