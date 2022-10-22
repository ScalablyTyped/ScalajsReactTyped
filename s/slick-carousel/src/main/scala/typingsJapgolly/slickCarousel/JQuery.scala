package typingsJapgolly.slickCarousel

import org.scalajs.dom.Element
import typingsJapgolly.slickCarousel.slickCarouselStrings.getSlick
import typingsJapgolly.slickCarousel.slickCarouselStrings.slickAdd
import typingsJapgolly.slickCarousel.slickCarouselStrings.slickCurrentSlide
import typingsJapgolly.slickCarousel.slickCarouselStrings.slickFilter
import typingsJapgolly.slickCarousel.slickCarouselStrings.slickGetOption
import typingsJapgolly.slickCarousel.slickCarouselStrings.slickGoTo
import typingsJapgolly.slickCarousel.slickCarouselStrings.slickNext
import typingsJapgolly.slickCarousel.slickCarouselStrings.slickPause
import typingsJapgolly.slickCarousel.slickCarouselStrings.slickPlay
import typingsJapgolly.slickCarousel.slickCarouselStrings.slickPrev
import typingsJapgolly.slickCarousel.slickCarouselStrings.slickRemove
import typingsJapgolly.slickCarousel.slickCarouselStrings.slickSetOption
import typingsJapgolly.slickCarousel.slickCarouselStrings.slickUnfilter
import typingsJapgolly.slickCarousel.slickCarouselStrings.unslick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Create slick component
    */
  def slick(): JQuery = js.native
  /**
    * Trigger non-specialized signature method
    * @param methodName
    * @param arg
    */
  def slick(methodName: String, arg: Any*): Any = js.native
  def slick(options: JQuerySlickOptions): JQuery = js.native
  /**
    * Get Slick Object
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_getSlick(methodName: getSlick): JQuerySlick = js.native
  /**
    * Add a slide. If an index is provided, will add at that index, or before if addBefore is set. If no index is provided,
    * add to the end or to the beginning if addBefore is set. Accepts HTML String || Object
    * @param methodName The name of the method
    * @param html
    * @param index/div>
    * @param addBefore
    */
  @JSName("slick")
  def slick_slickAdd(methodName: slickAdd, html: String): JQuery = js.native
  @JSName("slick")
  def slick_slickAdd(methodName: slickAdd, html: String, index: Double): JQuery = js.native
  @JSName("slick")
  def slick_slickAdd(methodName: slickAdd, html: String, index: Double, addBefore: Double): JQuery = js.native
  @JSName("slick")
  def slick_slickAdd(methodName: slickAdd, html: String, index: Unit, addBefore: Double): JQuery = js.native
  @JSName("slick")
  def slick_slickAdd(methodName: slickAdd, html: js.Object): JQuery = js.native
  @JSName("slick")
  def slick_slickAdd(methodName: slickAdd, html: js.Object, index: Double): JQuery = js.native
  @JSName("slick")
  def slick_slickAdd(methodName: slickAdd, html: js.Object, index: Double, addBefore: Double): JQuery = js.native
  @JSName("slick")
  def slick_slickAdd(methodName: slickAdd, html: js.Object, index: Unit, addBefore: Double): JQuery = js.native
  /**
    * Returns the current slide index
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_slickCurrentSlide(methodName: slickCurrentSlide): Double = js.native
  /**
    * Filters slides using jQuery .filter()
    * @param methodName The name of the method
    * @param func
    */
  @JSName("slick")
  def slick_slickFilter(methodName: slickFilter, func: js.Function2[/* index */ Double, /* element */ Element, Any]): JQuery = js.native
  /**
    * Filters slides using jQuery .filter()
    * @param methodName The name of the method
    * @param selector
    */
  @JSName("slick")
  def slick_slickFilter(methodName: slickFilter, selector: String): JQuery = js.native
  /**
    * Sets an individual value live. Set refresh to true if it's a UI update.
    * @param methodName The name of the method
    * @param option The option name
    */
  @JSName("slick")
  def slick_slickGetOption(methodName: slickGetOption, option: Any): JQuerySlickOptions = js.native
  /**
    * Navigates to a slide by index
    * @param methodName The name of the method
    * @param slide
    * @param dontAnimate
    */
  @JSName("slick")
  def slick_slickGoTo(methodName: slickGoTo, slide: Double): JQuery = js.native
  @JSName("slick")
  def slick_slickGoTo(methodName: slickGoTo, slide: Double, dontAnimate: Boolean): JQuery = js.native
  /**
    * Navigates to the next slide
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_slickNext(methodName: slickNext): JQuery = js.native
  /**
    * Pauses autoplay
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_slickPause(methodName: slickPause): JQuery = js.native
  /**
    * Starts autoplay
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_slickPlay(methodName: slickPlay): JQuery = js.native
  /**
    * Navigates to the previous slide
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_slickPrev(methodName: slickPrev): JQuery = js.native
  /**
    * Remove slide by index. If removeBefore is set true, remove slide preceding index, or the first slide if no index is specified.
    * If removeBefore is set to false, remove the slide following index, or the last slide if no index is set.
    * @param methodName The name of the method
    * @param index
    * @param removeBefore
    */
  @JSName("slick")
  def slick_slickRemove(methodName: slickRemove, index: Double): JQuery = js.native
  @JSName("slick")
  def slick_slickRemove(methodName: slickRemove, index: Double, removeBefore: Double): JQuery = js.native
  /**
    * Sets an individual value live. Set refresh to true if it's a UI update.
    * @param methodName The name of the method
    * @param option The option name
    * @param value depends on option
    * @param refresh
    */
  @JSName("slick")
  def slick_slickSetOption(methodName: slickSetOption, option: String, value: JQuerySlickOptions): JQuery = js.native
  @JSName("slick")
  def slick_slickSetOption(methodName: slickSetOption, option: String, value: JQuerySlickOptions, refresh: Boolean): JQuery = js.native
  /**
    * Removes applied filtering
    * @param methodName The name of the method
    * @param index
    */
  @JSName("slick")
  def slick_slickUnfilter(methodName: slickUnfilter, index: Double): JQuery = js.native
  /**
    * Deconstructs slick
    * @param methodName The name of the method
    */
  @JSName("slick")
  def slick_unslick(methodName: unslick): JQuery = js.native
}
