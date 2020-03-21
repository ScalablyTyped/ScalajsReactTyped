package typingsJapgolly.slickCarousel

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.slickCarousel.slickCarouselBooleans.`false`
import typingsJapgolly.slickCarousel.slickCarouselStrings.MozTransform
import typingsJapgolly.slickCarousel.slickCarouselStrings.MozTransition
import typingsJapgolly.slickCarousel.slickCarouselStrings.OTransform
import typingsJapgolly.slickCarousel.slickCarouselStrings.OTransition
import typingsJapgolly.slickCarousel.slickCarouselStrings.`-moz-transform`
import typingsJapgolly.slickCarousel.slickCarouselStrings.`-ms-transform`
import typingsJapgolly.slickCarousel.slickCarouselStrings.`-o-transform`
import typingsJapgolly.slickCarousel.slickCarouselStrings.`-webkit-transform`
import typingsJapgolly.slickCarousel.slickCarouselStrings.left
import typingsJapgolly.slickCarousel.slickCarouselStrings.min
import typingsJapgolly.slickCarousel.slickCarouselStrings.mozHidden
import typingsJapgolly.slickCarousel.slickCarouselStrings.mozvisibilitychange
import typingsJapgolly.slickCarousel.slickCarouselStrings.msTransform
import typingsJapgolly.slickCarousel.slickCarouselStrings.msTransition
import typingsJapgolly.slickCarousel.slickCarouselStrings.slider
import typingsJapgolly.slickCarousel.slickCarouselStrings.top
import typingsJapgolly.slickCarousel.slickCarouselStrings.transform
import typingsJapgolly.slickCarousel.slickCarouselStrings.transition
import typingsJapgolly.slickCarousel.slickCarouselStrings.visibilitychange
import typingsJapgolly.slickCarousel.slickCarouselStrings.webkitHidden
import typingsJapgolly.slickCarousel.slickCarouselStrings.webkitTransform
import typingsJapgolly.slickCarousel.slickCarouselStrings.webkitTransition
import typingsJapgolly.slickCarousel.slickCarouselStrings.webkitvisibilitychange
import typingsJapgolly.slickCarousel.slickCarouselStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuerySlick extends JQuerySlickInitials {
  /**
    * Default: $(element)
    */
  @JSName("$slider")
  var $slider: JQuery = js.native
  /**
    * Default: null
    */
  @JSName("$slidesCache")
  var $slidesCache: JQuery | Null = js.native
  /**
    * Default: null
    */
  var activeBreakpoint: Double | Null = js.native
  /**
    * Default: null
    */
  var animProp: Null = js.native
  /**
    * Default: null
    */
  var animType: OTransform | MozTransform | webkitTransform | msTransform | transform | `false` | Null = js.native
  /**
    * Default: {}
    */
  var breakpointSettings: NumberDictionary[JQuerySlickOptions] = js.native
  /**
    * Default: []
    */
  var breakpoints: js.Array[Double] = js.native
  /**
    * Default: false
    */
  var cssTransitions: Boolean = js.native
  var defaults: JQuerySlickOptions = js.native
  /**
    * Default: false
    */
  var focussed: Boolean = js.native
  /**
    * Default: 'hidden'
    */
  var hidden: mozHidden | webkitHidden | typingsJapgolly.slickCarousel.slickCarouselStrings.hidden = js.native
  var initials: JQuerySlickInitials = js.native
  /**
    * Default: false
    */
  var interrupted: Boolean = js.native
  var options: JQuerySlickOptions = js.native
  var originalSettings: JQuerySlickOptions = js.native
  /**
    * Default: true
    */
  var paused: Boolean = js.native
  /**
    * Default: null
    */
  var positionProp: top | left | Null = js.native
  /**
    * Default: null
    */
  var respondTo: window | slider | min | Null = js.native
  /**
    * Default: 1
    */
  var rowCount: Double = js.native
  /**
    * Default: true
    */
  var shouldClick: Boolean = js.native
  /**
    * Default: null
    */
  var transformType: `-o-transform` | `-moz-transform` | `-webkit-transform` | `-ms-transform` | transition | Null = js.native
  /**
    * Default: null
    */
  var transitionType: OTransition | MozTransition | webkitTransition | msTransition | transition | Null = js.native
  /**
    * Default: 'visibilitychange'
    */
  var visibilityChange: visibilitychange | mozvisibilitychange | webkitvisibilitychange = js.native
  /**
    * Default: null
    */
  var windowTimer: Double | Null = js.native
  /**
    * Default: 0
    */
  var windowWidth: Double = js.native
}

