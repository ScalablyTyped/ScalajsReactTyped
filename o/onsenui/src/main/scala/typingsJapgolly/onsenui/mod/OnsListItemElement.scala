package typingsJapgolly.onsenui.mod

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnsListItemElement
  extends StObject
     with HTMLElement {
  
  /* standard dom */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /**
    * @description The animation used when showing and hiding the expandable content. Can be either `"default"` or `"none"`.
    **/
  var animation: String = js.native
  
  /**
    * @description Clear backgroundColor changed on tap or click. This method is helpful when `keep-tap-background-color` is `true`.
    */
  def clearTapBackgroundColor(): Unit = js.native
  
  /**
    * @description Whether the list item is expandable or not.
    **/
  var expandable: Boolean = js.native
  
  /**
    * @description For expandable list items, specifies whether the expandable content is expanded or not.
    **/
  var expanded: Boolean = js.native
  
  /**
    * @description Hide the expandable content if element is expandable
    */
  def hideExpansion(): Unit = js.native
  
  /**
    * @description Prevent from clearing the background color on `"touchmove"`, `"touchcancel"`, `"touchend"`, `"touchleave"`, `"mouseup"`, and `"mouseout"`. For this to work, the attribute "tappable" needs to be set.
    */
  var keepTapBackgroundColor: Boolean = js.native
  
  /**
    * @description Prevent vertical scrolling when the user drags horizontally.
    **/
  var lockOnDrag: Boolean = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /**
    * @description Show the expandable content if element is expandable
    */
  def showExpansion(): Unit = js.native
  
  /**
    * @description Changes the background color when tapped. For this to work, the attribute "tappable" needs to be set. The default color is "#d9d9d9". It will display as a ripple effect on Android.
    **/
  var tapBackgroundColor: String = js.native
  
  /**
    * @description Makes the element react to taps.
    **/
  var tappable: Boolean = js.native
}
