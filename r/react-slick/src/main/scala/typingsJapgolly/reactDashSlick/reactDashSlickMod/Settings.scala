package typingsJapgolly.reactDashSlick.reactDashSlickMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var accessibility: js.UndefOr[Boolean] = js.undefined
  var adaptiveHeight: js.UndefOr[Boolean] = js.undefined
  var afterChange: js.UndefOr[js.Function1[/* currentSlide */ Double, Unit]] = js.undefined
  var appendDots: js.UndefOr[js.Function1[/* dots */ Node, Element]] = js.undefined
  var arrows: js.UndefOr[Boolean] = js.undefined
  var asNavFor: js.UndefOr[Slider] = js.undefined
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var autoplaySpeed: js.UndefOr[Double] = js.undefined
  var beforeChange: js.UndefOr[js.Function2[/* currentSlide */ Double, /* nextSlide */ Double, Unit]] = js.undefined
  var centerMode: js.UndefOr[Boolean] = js.undefined
  var centerPadding: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var cssEase: js.UndefOr[String] = js.undefined
  var customPaging: js.UndefOr[js.Function1[/* index */ Double, Element]] = js.undefined
  var dots: js.UndefOr[Boolean] = js.undefined
  var dotsClass: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var edgeFriction: js.UndefOr[Double] = js.undefined
  var fade: js.UndefOr[Boolean] = js.undefined
  var focusOnSelect: js.UndefOr[Boolean] = js.undefined
  var infinite: js.UndefOr[Boolean] = js.undefined
  var initialSlide: js.UndefOr[Double] = js.undefined
  var lazyLoad: js.UndefOr[LazyLoadTypes] = js.undefined
  var nextArrow: js.UndefOr[Element] = js.undefined
  var onEdge: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.undefined
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLazyLoad: js.UndefOr[js.Function1[/* slidesToLoad */ js.Array[Double], Unit]] = js.undefined
  var onReInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipe: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.undefined
  var pauseOnDotsHover: js.UndefOr[Boolean] = js.undefined
  var pauseOnFocus: js.UndefOr[Boolean] = js.undefined
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  var prevArrow: js.UndefOr[Element] = js.undefined
  var responsive: js.UndefOr[js.Array[ResponsiveObject]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var slide: js.UndefOr[String] = js.undefined
  var slidesPerRow: js.UndefOr[Double] = js.undefined
  var slidesToScroll: js.UndefOr[Double] = js.undefined
  var slidesToShow: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var swipe: js.UndefOr[Boolean] = js.undefined
  var swipeEvent: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.undefined
  var swipeToSlide: js.UndefOr[Boolean] = js.undefined
  var touchMove: js.UndefOr[Boolean] = js.undefined
  var touchThreshold: js.UndefOr[Double] = js.undefined
  var useCSS: js.UndefOr[Boolean] = js.undefined
  var useTransform: js.UndefOr[Boolean] = js.undefined
  var variableWidth: js.UndefOr[Boolean] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
  var verticalSwiping: js.UndefOr[Boolean] = js.undefined
  var waitForAnimate: js.UndefOr[Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    accessibility: js.UndefOr[Boolean] = js.undefined,
    adaptiveHeight: js.UndefOr[Boolean] = js.undefined,
    afterChange: /* currentSlide */ Double => Callback = null,
    appendDots: /* dots */ Node => CallbackTo[Element] = null,
    arrows: js.UndefOr[Boolean] = js.undefined,
    asNavFor: Slider = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplaySpeed: Int | Double = null,
    beforeChange: (/* currentSlide */ Double, /* nextSlide */ Double) => Callback = null,
    centerMode: js.UndefOr[Boolean] = js.undefined,
    centerPadding: String = null,
    className: String = null,
    cssEase: String = null,
    customPaging: /* index */ Double => CallbackTo[Element] = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    dotsClass: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    edgeFriction: Int | Double = null,
    fade: js.UndefOr[Boolean] = js.undefined,
    focusOnSelect: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlide: Int | Double = null,
    lazyLoad: LazyLoadTypes = null,
    nextArrow: VdomElement = null,
    onEdge: /* swipeDirection */ SwipeDirection => Callback = null,
    onInit: js.UndefOr[Callback] = js.undefined,
    onLazyLoad: /* slidesToLoad */ js.Array[Double] => Callback = null,
    onReInit: js.UndefOr[Callback] = js.undefined,
    onSwipe: /* swipeDirection */ SwipeDirection => Callback = null,
    pauseOnDotsHover: js.UndefOr[Boolean] = js.undefined,
    pauseOnFocus: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    prevArrow: VdomElement = null,
    responsive: js.Array[ResponsiveObject] = null,
    rows: Int | Double = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    slide: String = null,
    slidesPerRow: Int | Double = null,
    slidesToScroll: Int | Double = null,
    slidesToShow: Int | Double = null,
    speed: Int | Double = null,
    swipe: js.UndefOr[Boolean] = js.undefined,
    swipeEvent: /* swipeDirection */ SwipeDirection => Callback = null,
    swipeToSlide: js.UndefOr[Boolean] = js.undefined,
    touchMove: js.UndefOr[Boolean] = js.undefined,
    touchThreshold: Int | Double = null,
    useCSS: js.UndefOr[Boolean] = js.undefined,
    useTransform: js.UndefOr[Boolean] = js.undefined,
    variableWidth: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    verticalSwiping: js.UndefOr[Boolean] = js.undefined,
    waitForAnimate: js.UndefOr[Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessibility)) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(adaptiveHeight)) __obj.updateDynamic("adaptiveHeight")(adaptiveHeight.asInstanceOf[js.Any])
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1((t0: /* currentSlide */ scala.Double) => afterChange(t0).runNow()))
    if (appendDots != null) __obj.updateDynamic("appendDots")(js.Any.fromFunction1((t0: /* dots */ japgolly.scalajs.react.raw.React.Node) => appendDots(t0).runNow()))
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (asNavFor != null) __obj.updateDynamic("asNavFor")(asNavFor.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplaySpeed != null) __obj.updateDynamic("autoplaySpeed")(autoplaySpeed.asInstanceOf[js.Any])
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction2((t0: /* currentSlide */ scala.Double, t1: /* nextSlide */ scala.Double) => beforeChange(t0, t1).runNow()))
    if (!js.isUndefined(centerMode)) __obj.updateDynamic("centerMode")(centerMode.asInstanceOf[js.Any])
    if (centerPadding != null) __obj.updateDynamic("centerPadding")(centerPadding.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cssEase != null) __obj.updateDynamic("cssEase")(cssEase.asInstanceOf[js.Any])
    if (customPaging != null) __obj.updateDynamic("customPaging")(js.Any.fromFunction1((t0: /* index */ scala.Double) => customPaging(t0).runNow()))
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (dotsClass != null) __obj.updateDynamic("dotsClass")(dotsClass.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (edgeFriction != null) __obj.updateDynamic("edgeFriction")(edgeFriction.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnSelect)) __obj.updateDynamic("focusOnSelect")(focusOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (initialSlide != null) __obj.updateDynamic("initialSlide")(initialSlide.asInstanceOf[js.Any])
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(lazyLoad.asInstanceOf[js.Any])
    if (nextArrow != null) __obj.updateDynamic("nextArrow")(nextArrow.rawElement.asInstanceOf[js.Any])
    if (onEdge != null) __obj.updateDynamic("onEdge")(js.Any.fromFunction1((t0: /* swipeDirection */ typingsJapgolly.reactDashSlick.reactDashSlickMod.SwipeDirection) => onEdge(t0).runNow()))
    onInit.foreach(p => __obj.updateDynamic("onInit")(p.toJsFn))
    if (onLazyLoad != null) __obj.updateDynamic("onLazyLoad")(js.Any.fromFunction1((t0: /* slidesToLoad */ js.Array[scala.Double]) => onLazyLoad(t0).runNow()))
    onReInit.foreach(p => __obj.updateDynamic("onReInit")(p.toJsFn))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction1((t0: /* swipeDirection */ typingsJapgolly.reactDashSlick.reactDashSlickMod.SwipeDirection) => onSwipe(t0).runNow()))
    if (!js.isUndefined(pauseOnDotsHover)) __obj.updateDynamic("pauseOnDotsHover")(pauseOnDotsHover.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnFocus)) __obj.updateDynamic("pauseOnFocus")(pauseOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (prevArrow != null) __obj.updateDynamic("prevArrow")(prevArrow.rawElement.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    if (slidesPerRow != null) __obj.updateDynamic("slidesPerRow")(slidesPerRow.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe.asInstanceOf[js.Any])
    if (swipeEvent != null) __obj.updateDynamic("swipeEvent")(js.Any.fromFunction1((t0: /* swipeDirection */ typingsJapgolly.reactDashSlick.reactDashSlickMod.SwipeDirection) => swipeEvent(t0).runNow()))
    if (!js.isUndefined(swipeToSlide)) __obj.updateDynamic("swipeToSlide")(swipeToSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(touchMove)) __obj.updateDynamic("touchMove")(touchMove.asInstanceOf[js.Any])
    if (touchThreshold != null) __obj.updateDynamic("touchThreshold")(touchThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSS)) __obj.updateDynamic("useCSS")(useCSS.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransform)) __obj.updateDynamic("useTransform")(useTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(variableWidth)) __obj.updateDynamic("variableWidth")(variableWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalSwiping)) __obj.updateDynamic("verticalSwiping")(verticalSwiping.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForAnimate)) __obj.updateDynamic("waitForAnimate")(waitForAnimate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

