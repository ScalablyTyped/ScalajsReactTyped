package typingsJapgolly.ionicCore.distTypesComponentsMod.global

import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.Element
import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLSlotElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("HTMLIonRefresherElement")
@js.native
open class HTMLIonRefresherElementCls ()
  extends StObject
     with HTMLIonRefresherElement {
  
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
    * Changes the refresher's state from `refreshing` to `cancelling`.
    */
  /* CompleteClass */
  override def cancel(): js.Promise[Unit] = js.native
  
  /**
    * Time it takes to close the refresher. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  /* CompleteClass */
  var closeDuration: String = js.native
  
  /**
    * Call `complete()` when your async operation has completed. For example, the `refreshing` state is while the app is performing an asynchronous operation, such as receiving more data from an AJAX request. Once the data has been received, you then call this method to signify that the refreshing has completed and to close the refresher. This method also changes the refresher's state from `refreshing` to `completing`.
    */
  /* CompleteClass */
  override def complete(): js.Promise[Unit] = js.native
  
  /* standard dom */
  /* CompleteClass */
  var contentEditable: String = js.native
  
  /**
    * If `true`, the refresher will be hidden.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* standard dom */
  /* CompleteClass */
  var enterKeyHint: String = js.native
  
  /**
    * A number representing how far down the user has pulled. The number `0` represents the user hasn't pulled down at all. The number `1`, and anything greater than `1`, represents that the user has pulled far enough down that when they let go then the refresh will happen. If they let go and the number is less than `1`, then the refresh will not happen, and the content will return to it's original position.
    */
  /* CompleteClass */
  override def getProgress(): js.Promise[Double] = js.native
  
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
  
  /** Returns the first preceding sibling that is an element, and null otherwise. */
  /* standard dom */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  
  /**
    * How much to multiply the pull speed by. To slow the pull animation down, pass a number less than `1`. To speed up the pull, pass a number greater than `1`. The default value is `1` which is equal to the speed of the cursor. If a negative value is passed in, the factor will be `1` instead.  For example: If the value passed is `1.2` and the content is dragged by `10` pixels, instead of `10` pixels the content will be pulled by `12` pixels (an increase of 20 percent). If the value passed is `0.8`, the dragged amount will be `8` pixels, less than the amount the cursor has moved.  Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  /* CompleteClass */
  var pullFactor: Double = js.native
  
  /**
    * The maximum distance of the pull until the refresher will automatically go into the `refreshing` state. Defaults to the result of `pullMin + 60`. Does not apply when  the refresher content uses a spinner, enabling the native refresher.
    */
  /* CompleteClass */
  var pullMax: Double = js.native
  
  /**
    * The minimum distance the user must pull down until the refresher will go into the `refreshing` state. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  /* CompleteClass */
  var pullMin: Double = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /**
    * Time it takes the refresher to snap back to the `refreshing` state. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  /* CompleteClass */
  var snapbackDuration: String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}
