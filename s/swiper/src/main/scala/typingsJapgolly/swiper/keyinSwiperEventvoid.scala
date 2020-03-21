package typingsJapgolly.swiper

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in swiper.swiper.SwiperEvent ]:? (): void} */
trait keyinSwiperEventvoid extends js.Object {
  var autoplay: js.UndefOr[js.Function0[Unit]] = js.undefined
  var autoplayStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var autoplayStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  var doubleTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fromEdge: js.UndefOr[js.Function0[Unit]] = js.undefined
  var imagesReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  var lazyImageLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var lazyImageReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  var paginationRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  var paginationUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  var progress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var reachBeginning: js.UndefOr[js.Function0[Unit]] = js.undefined
  var reachEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var resize: js.UndefOr[js.Function0[Unit]] = js.undefined
  var setTransition: js.UndefOr[js.Function0[Unit]] = js.undefined
  var setTranslate: js.UndefOr[js.Function0[Unit]] = js.undefined
  var slideChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var slideChangeTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var slideChangeTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var slideNextTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var slideNextTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var slidePrevTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var slidePrevTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var sliderMove: js.UndefOr[js.Function0[Unit]] = js.undefined
  var tap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var touchEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var touchMove: js.UndefOr[js.Function0[Unit]] = js.undefined
  var touchMoveOpposite: js.UndefOr[js.Function0[Unit]] = js.undefined
  var touchStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var transitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var transitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object keyinSwiperEventvoid {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Callback] = js.undefined,
    autoplayStart: js.UndefOr[Callback] = js.undefined,
    autoplayStop: js.UndefOr[Callback] = js.undefined,
    beforeDestroy: js.UndefOr[Callback] = js.undefined,
    click: js.UndefOr[Callback] = js.undefined,
    doubleTap: js.UndefOr[Callback] = js.undefined,
    fromEdge: js.UndefOr[Callback] = js.undefined,
    imagesReady: js.UndefOr[Callback] = js.undefined,
    init: js.UndefOr[Callback] = js.undefined,
    lazyImageLoad: js.UndefOr[Callback] = js.undefined,
    lazyImageReady: js.UndefOr[Callback] = js.undefined,
    paginationRender: js.UndefOr[Callback] = js.undefined,
    paginationUpdate: js.UndefOr[Callback] = js.undefined,
    progress: js.UndefOr[Callback] = js.undefined,
    reachBeginning: js.UndefOr[Callback] = js.undefined,
    reachEnd: js.UndefOr[Callback] = js.undefined,
    resize: js.UndefOr[Callback] = js.undefined,
    setTransition: js.UndefOr[Callback] = js.undefined,
    setTranslate: js.UndefOr[Callback] = js.undefined,
    slideChange: js.UndefOr[Callback] = js.undefined,
    slideChangeTransitionEnd: js.UndefOr[Callback] = js.undefined,
    slideChangeTransitionStart: js.UndefOr[Callback] = js.undefined,
    slideNextTransitionEnd: js.UndefOr[Callback] = js.undefined,
    slideNextTransitionStart: js.UndefOr[Callback] = js.undefined,
    slidePrevTransitionEnd: js.UndefOr[Callback] = js.undefined,
    slidePrevTransitionStart: js.UndefOr[Callback] = js.undefined,
    sliderMove: js.UndefOr[Callback] = js.undefined,
    tap: js.UndefOr[Callback] = js.undefined,
    touchEnd: js.UndefOr[Callback] = js.undefined,
    touchMove: js.UndefOr[Callback] = js.undefined,
    touchMoveOpposite: js.UndefOr[Callback] = js.undefined,
    touchStart: js.UndefOr[Callback] = js.undefined,
    transitionEnd: js.UndefOr[Callback] = js.undefined,
    transitionStart: js.UndefOr[Callback] = js.undefined
  ): keyinSwiperEventvoid = {
    val __obj = js.Dynamic.literal()
    autoplay.foreach(p => __obj.updateDynamic("autoplay")(p.toJsFn))
    autoplayStart.foreach(p => __obj.updateDynamic("autoplayStart")(p.toJsFn))
    autoplayStop.foreach(p => __obj.updateDynamic("autoplayStop")(p.toJsFn))
    beforeDestroy.foreach(p => __obj.updateDynamic("beforeDestroy")(p.toJsFn))
    click.foreach(p => __obj.updateDynamic("click")(p.toJsFn))
    doubleTap.foreach(p => __obj.updateDynamic("doubleTap")(p.toJsFn))
    fromEdge.foreach(p => __obj.updateDynamic("fromEdge")(p.toJsFn))
    imagesReady.foreach(p => __obj.updateDynamic("imagesReady")(p.toJsFn))
    init.foreach(p => __obj.updateDynamic("init")(p.toJsFn))
    lazyImageLoad.foreach(p => __obj.updateDynamic("lazyImageLoad")(p.toJsFn))
    lazyImageReady.foreach(p => __obj.updateDynamic("lazyImageReady")(p.toJsFn))
    paginationRender.foreach(p => __obj.updateDynamic("paginationRender")(p.toJsFn))
    paginationUpdate.foreach(p => __obj.updateDynamic("paginationUpdate")(p.toJsFn))
    progress.foreach(p => __obj.updateDynamic("progress")(p.toJsFn))
    reachBeginning.foreach(p => __obj.updateDynamic("reachBeginning")(p.toJsFn))
    reachEnd.foreach(p => __obj.updateDynamic("reachEnd")(p.toJsFn))
    resize.foreach(p => __obj.updateDynamic("resize")(p.toJsFn))
    setTransition.foreach(p => __obj.updateDynamic("setTransition")(p.toJsFn))
    setTranslate.foreach(p => __obj.updateDynamic("setTranslate")(p.toJsFn))
    slideChange.foreach(p => __obj.updateDynamic("slideChange")(p.toJsFn))
    slideChangeTransitionEnd.foreach(p => __obj.updateDynamic("slideChangeTransitionEnd")(p.toJsFn))
    slideChangeTransitionStart.foreach(p => __obj.updateDynamic("slideChangeTransitionStart")(p.toJsFn))
    slideNextTransitionEnd.foreach(p => __obj.updateDynamic("slideNextTransitionEnd")(p.toJsFn))
    slideNextTransitionStart.foreach(p => __obj.updateDynamic("slideNextTransitionStart")(p.toJsFn))
    slidePrevTransitionEnd.foreach(p => __obj.updateDynamic("slidePrevTransitionEnd")(p.toJsFn))
    slidePrevTransitionStart.foreach(p => __obj.updateDynamic("slidePrevTransitionStart")(p.toJsFn))
    sliderMove.foreach(p => __obj.updateDynamic("sliderMove")(p.toJsFn))
    tap.foreach(p => __obj.updateDynamic("tap")(p.toJsFn))
    touchEnd.foreach(p => __obj.updateDynamic("touchEnd")(p.toJsFn))
    touchMove.foreach(p => __obj.updateDynamic("touchMove")(p.toJsFn))
    touchMoveOpposite.foreach(p => __obj.updateDynamic("touchMoveOpposite")(p.toJsFn))
    touchStart.foreach(p => __obj.updateDynamic("touchStart")(p.toJsFn))
    transitionEnd.foreach(p => __obj.updateDynamic("transitionEnd")(p.toJsFn))
    transitionStart.foreach(p => __obj.updateDynamic("transitionStart")(p.toJsFn))
    __obj.asInstanceOf[keyinSwiperEventvoid]
  }
}

