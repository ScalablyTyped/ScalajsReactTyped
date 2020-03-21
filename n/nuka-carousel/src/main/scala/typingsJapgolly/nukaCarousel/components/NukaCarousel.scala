package typingsJapgolly.nukaCarousel.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nukaCarousel.AnonContainerClassName
import typingsJapgolly.nukaCarousel.mod.CSSProperties
import typingsJapgolly.nukaCarousel.mod.CarouselCellAlignProp
import typingsJapgolly.nukaCarousel.mod.CarouselControlContainerProp
import typingsJapgolly.nukaCarousel.mod.CarouselHeightModeProp
import typingsJapgolly.nukaCarousel.mod.CarouselProps
import typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps
import typingsJapgolly.nukaCarousel.mod.CarouselSlideWidthProp
import typingsJapgolly.nukaCarousel.mod.CarouselSlidesToScrollProp
import typingsJapgolly.nukaCarousel.mod.CarouselTransitionModeProp
import typingsJapgolly.nukaCarousel.mod.default
import typingsJapgolly.nukaCarousel.nukaCarouselStrings.zoom
import typingsJapgolly.nukaCarousel.slideActioninCarouselSlid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NukaCarousel {
  def apply(
    afterSlide: /* prevSlide */ Double => Callback = null,
    animation: zoom = null,
    autoGenerateStyleTag: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: Int | Double = null,
    autoplayReverse: js.UndefOr[Boolean] = js.undefined,
    beforeSlide: (/* currentSlide */ Double, /* endSlide */ Double) => Callback = null,
    cellAlign: CarouselCellAlignProp = null,
    cellSpacing: Int | Double = null,
    className: String = null,
    defaultControlsConfig: AnonContainerClassName = null,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disableEdgeSwiping: js.UndefOr[Boolean] = js.undefined,
    dragging: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    edgeEasing: String = null,
    enableKeyboardControls: js.UndefOr[Boolean] = js.undefined,
    frameOverflow: String = null,
    framePadding: String = null,
    getControlContainerStyle: /* key */ CarouselControlContainerProp => CallbackTo[CSSProperties] = null,
    height: String = null,
    heightMode: CarouselHeightModeProp = null,
    initialSlideHeight: Int | Double = null,
    initialSlideWidth: Int | Double = null,
    keyCodeConfig: slideActioninCarouselSlid = null,
    onDragStart: js.UndefOr[Callback] = js.undefined,
    onResize: js.UndefOr[Callback] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    renderAnnounceSlideMessage: /* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps => CallbackTo[String] = null,
    renderBottomCenterControls: /* props */ CarouselSlideRenderControlProps => CallbackTo[Node] = null,
    renderBottomLeftControls: /* props */ CarouselSlideRenderControlProps => CallbackTo[Node] = null,
    renderBottomRightControls: /* props */ CarouselSlideRenderControlProps => CallbackTo[Node] = null,
    renderCenterCenterControls: /* props */ CarouselSlideRenderControlProps => CallbackTo[Node] = null,
    renderCenterLeftControls: /* props */ CarouselSlideRenderControlProps => CallbackTo[Node] = null,
    renderCenterRightControls: /* props */ CarouselSlideRenderControlProps => CallbackTo[Node] = null,
    renderTopCenterControls: /* props */ CarouselSlideRenderControlProps => CallbackTo[Node] = null,
    renderTopLeftControls: /* props */ CarouselSlideRenderControlProps => CallbackTo[Node] = null,
    renderTopRightControls: /* props */ CarouselSlideRenderControlProps => CallbackTo[Node] = null,
    slideIndex: Int | Double = null,
    slideWidth: CarouselSlideWidthProp = null,
    slidesToScroll: CarouselSlidesToScrollProp = null,
    slidesToShow: Int | Double = null,
    speed: Int | Double = null,
    style: CSSProperties = null,
    swiping: js.UndefOr[Boolean] = js.undefined,
    transitionMode: CarouselTransitionModeProp = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    width: String = null,
    withoutControls: js.UndefOr[Boolean] = js.undefined,
    wrapAround: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CarouselProps, default, Unit, CarouselProps] = {
    val __obj = js.Dynamic.literal()
  
      if (afterSlide != null) __obj.updateDynamic("afterSlide")(js.Any.fromFunction1((t0: /* prevSlide */ scala.Double) => afterSlide(t0).runNow()))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGenerateStyleTag)) __obj.updateDynamic("autoGenerateStyleTag")(autoGenerateStyleTag.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayReverse)) __obj.updateDynamic("autoplayReverse")(autoplayReverse.asInstanceOf[js.Any])
    if (beforeSlide != null) __obj.updateDynamic("beforeSlide")(js.Any.fromFunction2((t0: /* currentSlide */ scala.Double, t1: /* endSlide */ scala.Double) => beforeSlide(t0, t1).runNow()))
    if (cellAlign != null) __obj.updateDynamic("cellAlign")(cellAlign.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultControlsConfig != null) __obj.updateDynamic("defaultControlsConfig")(defaultControlsConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEdgeSwiping)) __obj.updateDynamic("disableEdgeSwiping")(disableEdgeSwiping.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (edgeEasing != null) __obj.updateDynamic("edgeEasing")(edgeEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKeyboardControls)) __obj.updateDynamic("enableKeyboardControls")(enableKeyboardControls.asInstanceOf[js.Any])
    if (frameOverflow != null) __obj.updateDynamic("frameOverflow")(frameOverflow.asInstanceOf[js.Any])
    if (framePadding != null) __obj.updateDynamic("framePadding")(framePadding.asInstanceOf[js.Any])
    if (getControlContainerStyle != null) __obj.updateDynamic("getControlContainerStyle")(js.Any.fromFunction1((t0: /* key */ typingsJapgolly.nukaCarousel.mod.CarouselControlContainerProp) => getControlContainerStyle(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightMode != null) __obj.updateDynamic("heightMode")(heightMode.asInstanceOf[js.Any])
    if (initialSlideHeight != null) __obj.updateDynamic("initialSlideHeight")(initialSlideHeight.asInstanceOf[js.Any])
    if (initialSlideWidth != null) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.asInstanceOf[js.Any])
    if (keyCodeConfig != null) __obj.updateDynamic("keyCodeConfig")(keyCodeConfig.asInstanceOf[js.Any])
    onDragStart.foreach(p => __obj.updateDynamic("onDragStart")(p.toJsFn))
    onResize.foreach(p => __obj.updateDynamic("onResize")(p.toJsFn))
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (renderAnnounceSlideMessage != null) __obj.updateDynamic("renderAnnounceSlideMessage")(js.Any.fromFunction1((t0: /* hasCurrentSlideSlideCount */ typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps) => renderAnnounceSlideMessage(t0).runNow()))
    if (renderBottomCenterControls != null) __obj.updateDynamic("renderBottomCenterControls")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps) => renderBottomCenterControls(t0).runNow()))
    if (renderBottomLeftControls != null) __obj.updateDynamic("renderBottomLeftControls")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps) => renderBottomLeftControls(t0).runNow()))
    if (renderBottomRightControls != null) __obj.updateDynamic("renderBottomRightControls")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps) => renderBottomRightControls(t0).runNow()))
    if (renderCenterCenterControls != null) __obj.updateDynamic("renderCenterCenterControls")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps) => renderCenterCenterControls(t0).runNow()))
    if (renderCenterLeftControls != null) __obj.updateDynamic("renderCenterLeftControls")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps) => renderCenterLeftControls(t0).runNow()))
    if (renderCenterRightControls != null) __obj.updateDynamic("renderCenterRightControls")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps) => renderCenterRightControls(t0).runNow()))
    if (renderTopCenterControls != null) __obj.updateDynamic("renderTopCenterControls")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps) => renderTopCenterControls(t0).runNow()))
    if (renderTopLeftControls != null) __obj.updateDynamic("renderTopLeftControls")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps) => renderTopLeftControls(t0).runNow()))
    if (renderTopRightControls != null) __obj.updateDynamic("renderTopRightControls")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps) => renderTopRightControls(t0).runNow()))
    if (slideIndex != null) __obj.updateDynamic("slideIndex")(slideIndex.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swiping)) __obj.updateDynamic("swiping")(swiping.asInstanceOf[js.Any])
    if (transitionMode != null) __obj.updateDynamic("transitionMode")(transitionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutControls)) __obj.updateDynamic("withoutControls")(withoutControls.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nukaCarousel.mod.CarouselProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nukaCarousel.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nukaCarousel.mod.CarouselProps])(children: _*)
  }
  @JSImport("nuka-carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

