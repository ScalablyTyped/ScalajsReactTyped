package typingsJapgolly.onsenui.mod

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnsSplitterSideElement
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
    * @description Specify the animation's duration, timing and delay with an object literal. E.g. `{duration: 0.2, delay: 1, timing: 'ease-in'}`.
    **/
  var animationOptions: js.Object = js.native
  
  /**
    * @description Close menu in collapse mode.
    * @param {Object} [option]
    * @return Resolves to the splitter side element or false if not in collapse mode
    */
  def close(): js.Promise[org.scalajs.dom.HTMLElement | Boolean] = js.native
  def close(options: SplitterSideOptions): js.Promise[org.scalajs.dom.HTMLElement | Boolean] = js.native
  
  /**
    * @description Returns whether the popover is visible or not.
    * @return {Boolean} This value is `true` when the menu is open.
    */
  var isOpen: Boolean = js.native
  
  /**
    * @description Show the page specified in pageUrl in the right section
    * @param {*} page Page URL. Can be either an HTML document or an <template>.
    * @param {Object} [option]
    * @return Resolves to the new page element
    */
  def load(page: Any): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  def load(page: Any, options: SplitterSideOptions): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  
  /**
    * @description Current mode. Possible values are "split", "collapse", "closed", "open" or "changing".
    */
  var mode: String = js.native
  
  /**
    * @param {Number} index Decimal ratio of the current swipe.
    * @param {Object} animationOptions Object containing duration and timing.
    * @description Hook called whenever the user slides the splitter.
    **/
  var onSwipe: js.UndefOr[js.Function] = js.native
  
  /**
    * @description Open menu in collapse mode.
    * @return Resolves to the splitter side element or false if not in collapse mode
    */
  def open(): js.Promise[org.scalajs.dom.HTMLElement | Boolean] = js.native
  def open(options: SplitterSideOptions): js.Promise[org.scalajs.dom.HTMLElement | Boolean] = js.native
  
  /**
    * @description Page element loaded in the splitter side.
    */
  var page: String = js.native
  
  var pageLoader: Any = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /**
    * @description true if the splitter side element is swipeable.
    **/
  var swipeable: Boolean = js.native
  
  /**
    * @description Opens if it's closed. Closes if it's open.
    * @param {Object} [options]
    * @return Resolves to the splitter side element or false if not in collapse mode
    */
  def toggle(): js.Promise[org.scalajs.dom.HTMLElement | Boolean] = js.native
  def toggle(options: SplitterSideOptions): js.Promise[org.scalajs.dom.HTMLElement | Boolean] = js.native
}
