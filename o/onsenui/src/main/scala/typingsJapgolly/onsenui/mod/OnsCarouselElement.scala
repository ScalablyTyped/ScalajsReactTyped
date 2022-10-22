package typingsJapgolly.onsenui.mod

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Carousel component
  */
@js.native
trait OnsCarouselElement
  extends StObject
     with HTMLElement {
  
  var activeIndex: Double = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  var animationOptions: js.Object = js.native
  
  /**
    * @description When this property is set the carousel will automatically refresh when the number of child nodes change.
    **/
  var autoRefresh: Boolean = js.native
  
  /**
    * @description true if auto scroll is enabled.
    **/
  var autoScroll: Boolean = js.native
  
  /**
    * @description The current auto scroll ratio.
    **/
  var autoScrollRatio: Double = js.native
  
  /**
    * @description Whether the carousel is centered or not.
    **/
  var centered: Boolean = js.native
  
  /**
    * @description Whether the carousel is disabled or not.
    **/
  var disabled: Boolean = js.native
  
  /**
    * @description Show first ons-carousel item
    * @Resolves to the carousel element
    */
  def first(): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  
  /**
    * @description If this property is set the carousel will cover the whole screen.
    **/
  var fullscreen: Boolean = js.native
  
  /**
    * @description Returns the index of the currently visible `<ons-carousel-item>`.
    * @return The current carousel item index.
    */
  def getActiveIndex(): Unit = js.native
  
  /**
    * @description The number of carousel items.
    **/
  var itemCount: Double = js.native
  
  /**
    * @description Show last ons-carousel item
    * @return Resolves to the carousel element
    */
  def last(): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  
  /**
    * @description Show next ons-carousel item
    * @return Resolves to the carousel element
    */
  def next(): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  def next(options: CarouselOptions): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  
  /**
    * @param {Number} index Decimal index of the current swipe.
    * @param {Object} animationOptions Object containing duration and timing.
    * @description Hook called whenever the user slides the carousel.
    **/
  var onSwipe: js.UndefOr[js.Function] = js.native
  
  /**
    * @description Whether the carousel is overscrollable or not.
    **/
  var overscrollable: Boolean = js.native
  
  /**
    * @description Show previous ons-carousel item
    * @return Resolves to the carousel element
    */
  def prev(): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  def prev(options: CarouselOptions): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  
  /**
    * @description Update the layout of the carousel. Used when adding ons-carousel-items dynamically or to automatically adjust the size.
    */
  def refresh(): Unit = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /**
    * @description Specify the index of the `<ons-carousel-item>` to show.
    * @return Resolves to the carousel element.
    */
  def setActiveIndex(index: Double): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  def setActiveIndex(index: Double, options: CarouselOptions): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  
  /**
    * @description true if the carousel is swipeable.
    **/
  var swipeable: Boolean = js.native
}
