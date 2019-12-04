package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libCarouselMod.CarouselEffect
import typingsJapgolly.antd.libCarouselMod.CarouselProps
import typingsJapgolly.antd.libCarouselMod.DotPosition
import typingsJapgolly.antd.libCarouselMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import typingsJapgolly.reactDashSlick.reactDashSlickMod.LazyLoadTypes
import typingsJapgolly.reactDashSlick.reactDashSlickMod.ResponsiveObject
import typingsJapgolly.reactDashSlick.reactDashSlickMod.SwipeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Carousel {
  def apply(
    accessibility: js.UndefOr[Boolean] = js.undefined,
    adaptiveHeight: js.UndefOr[Boolean] = js.undefined,
    afterChange: /* currentSlide */ Double => Callback = null,
    appendDots: /* dots */ Node => CallbackTo[Element] = null,
    arrows: js.UndefOr[Boolean] = js.undefined,
    asNavFor: typingsJapgolly.reactDashSlick.reactDashSlickMod.Slider = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplaySpeed: Int | Double = null,
    beforeChange: (/* currentSlide */ Double, /* nextSlide */ Double) => Callback = null,
    centerMode: js.UndefOr[Boolean] = js.undefined,
    centerPadding: String = null,
    className: String = null,
    cssEase: String = null,
    customPaging: /* index */ Double => CallbackTo[Element] = null,
    dotPosition: DotPosition = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    dotsClass: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    edgeFriction: Int | Double = null,
    effect: CarouselEffect = null,
    fade: js.UndefOr[Boolean] = js.undefined,
    focusOnSelect: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlide: Int | Double = null,
    lazyLoad: LazyLoadTypes = null,
    nextArrow: Element = null,
    onEdge: /* swipeDirection */ SwipeDirection => Callback = null,
    onInit: js.UndefOr[Callback] = js.undefined,
    onLazyLoad: /* slidesToLoad */ js.Array[Double] => Callback = null,
    onReInit: js.UndefOr[Callback] = js.undefined,
    onSwipe: /* swipeDirection */ SwipeDirection => Callback = null,
    pauseOnDotsHover: js.UndefOr[Boolean] = js.undefined,
    pauseOnFocus: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    prevArrow: Element = null,
    responsive: js.Array[ResponsiveObject] = null,
    rows: Int | Double = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    slickGoTo: Int | Double = null,
    slide: String = null,
    slidesPerRow: Int | Double = null,
    slidesToScroll: Int | Double = null,
    slidesToShow: Int | Double = null,
    speed: Int | Double = null,
    style: CSSProperties = null,
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
    waitForAnimate: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CarouselProps, default, Unit, CarouselProps] = {
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
    if (dotPosition != null) __obj.updateDynamic("dotPosition")(dotPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (dotsClass != null) __obj.updateDynamic("dotsClass")(dotsClass.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (edgeFriction != null) __obj.updateDynamic("edgeFriction")(edgeFriction.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnSelect)) __obj.updateDynamic("focusOnSelect")(focusOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (initialSlide != null) __obj.updateDynamic("initialSlide")(initialSlide.asInstanceOf[js.Any])
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(lazyLoad.asInstanceOf[js.Any])
    if (nextArrow != null) __obj.updateDynamic("nextArrow")(nextArrow.asInstanceOf[js.Any])
    if (onEdge != null) __obj.updateDynamic("onEdge")(js.Any.fromFunction1((t0: /* swipeDirection */ typingsJapgolly.reactDashSlick.reactDashSlickMod.SwipeDirection) => onEdge(t0).runNow()))
    onInit.foreach(p => __obj.updateDynamic("onInit")(p.toJsFn))
    if (onLazyLoad != null) __obj.updateDynamic("onLazyLoad")(js.Any.fromFunction1((t0: /* slidesToLoad */ js.Array[scala.Double]) => onLazyLoad(t0).runNow()))
    onReInit.foreach(p => __obj.updateDynamic("onReInit")(p.toJsFn))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction1((t0: /* swipeDirection */ typingsJapgolly.reactDashSlick.reactDashSlickMod.SwipeDirection) => onSwipe(t0).runNow()))
    if (!js.isUndefined(pauseOnDotsHover)) __obj.updateDynamic("pauseOnDotsHover")(pauseOnDotsHover.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnFocus)) __obj.updateDynamic("pauseOnFocus")(pauseOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (prevArrow != null) __obj.updateDynamic("prevArrow")(prevArrow.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (slickGoTo != null) __obj.updateDynamic("slickGoTo")(slickGoTo.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    if (slidesPerRow != null) __obj.updateDynamic("slidesPerRow")(slidesPerRow.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libCarouselMod.CarouselProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libCarouselMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libCarouselMod.CarouselProps])(children: _*)
  }
  @JSImport("antd/lib/carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

