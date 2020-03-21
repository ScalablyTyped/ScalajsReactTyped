package typingsJapgolly.reactstrap.carouselMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactstrap.mod.CSSModule
import typingsJapgolly.reactstrap.reactstrapBooleans.`false`
import typingsJapgolly.reactstrap.reactstrapStrings.carousel
import typingsJapgolly.reactstrap.reactstrapStrings.hover
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var activeIndex: js.UndefOr[Double] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var enableTouch: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double | String | Boolean] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var mouseEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  var mouseExit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pause: js.UndefOr[hover | `false`] = js.undefined
  var ride: js.UndefOr[carousel] = js.undefined
  var slide: js.UndefOr[Boolean] = js.undefined
  def next(): Unit
  def previous(): Unit
}

object CarouselProps {
  @scala.inline
  def apply(
    next: Callback,
    previous: Callback,
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    activeIndex: Int | Double = null,
    cssModule: CSSModule = null,
    enableTouch: js.UndefOr[Boolean] = js.undefined,
    interval: Double | String | Boolean = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mouseEnter: js.UndefOr[Callback] = js.undefined,
    mouseExit: js.UndefOr[Callback] = js.undefined,
    pause: hover | `false` = null,
    ride: carousel = null,
    slide: js.UndefOr[Boolean] = js.undefined
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("previous")(previous.toJsFn)
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTouch)) __obj.updateDynamic("enableTouch")(enableTouch.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    mouseEnter.foreach(p => __obj.updateDynamic("mouseEnter")(p.toJsFn))
    mouseExit.foreach(p => __obj.updateDynamic("mouseExit")(p.toJsFn))
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (ride != null) __obj.updateDynamic("ride")(ride.asInstanceOf[js.Any])
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselProps]
  }
}

