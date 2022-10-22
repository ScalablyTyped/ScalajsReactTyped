package typingsJapgolly.swiper.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.swiper.typesSwiperClassMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ event in keyof swiper.swiper/types/swiper-events.SwiperEvents ]:? swiper.swiper/types/swiper-events.SwiperEvents[event]} */
trait eventinkeyofSwiperEventsS extends StObject {
  
  var _beforeBreakpoint: js.UndefOr[js.Function2[/* swiper */ default, /* breakpointParams */ this.type, Unit]] = js.undefined
  
  var _containerClasses: js.UndefOr[js.Function2[/* swiper */ default, /* classNames */ String, Unit]] = js.undefined
  
  var _freeModeNoMomentumRelease: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var _slideClass: js.UndefOr[
    js.Function3[/* swiper */ default, /* slideEl */ HTMLElement, /* classNames */ String, Unit]
  ] = js.undefined
  
  var _slideClasses: js.UndefOr[js.Function2[/* swiper */ default, /* slides */ js.Array[ClassNames], Unit]] = js.undefined
  
  var _swiper: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var activeIndexChange: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var afterInit: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var autoplay: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var autoplayPause: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var autoplayResume: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var autoplayStart: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var autoplayStop: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var beforeDestroy: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var beforeInit: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var beforeLoopFix: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var beforeResize: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var beforeSlideChangeStart: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var beforeTransitionStart: js.UndefOr[js.Function3[/* swiper */ default, /* speed */ Double, /* internal */ Any, Unit]] = js.undefined
  
  var breakpoint: js.UndefOr[js.Function2[/* swiper */ default, /* breakpointParams */ this.type, Unit]] = js.undefined
  
  var changeDirection: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var click: js.UndefOr[
    js.Function2[/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent, Unit]
  ] = js.undefined
  
  var destroy: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var doubleClick: js.UndefOr[
    js.Function2[/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent, Unit]
  ] = js.undefined
  
  var doubleTap: js.UndefOr[
    js.Function2[/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent, Unit]
  ] = js.undefined
  
  var fromEdge: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var hashChange: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var hashSet: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var imagesReady: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* swiper */ default, Any]] = js.undefined
  
  var keyPress: js.UndefOr[js.Function2[/* swiper */ default, /* keyCode */ String, Unit]] = js.undefined
  
  var lazyImageLoad: js.UndefOr[
    js.Function3[/* swiper */ default, /* slideEl */ HTMLElement, /* imageEl */ HTMLElement, Unit]
  ] = js.undefined
  
  var lazyImageReady: js.UndefOr[
    js.Function3[/* swiper */ default, /* slideEl */ HTMLElement, /* imageEl */ HTMLElement, Unit]
  ] = js.undefined
  
  var lock: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var loopFix: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var momentumBounce: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var navigationHide: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var navigationNext: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var navigationPrev: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var navigationShow: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var observerUpdate: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var orientationchange: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var paginationHide: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var paginationRender: js.UndefOr[js.Function2[/* swiper */ default, /* paginationEl */ HTMLElement, Unit]] = js.undefined
  
  var paginationShow: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var paginationUpdate: js.UndefOr[js.Function2[/* swiper */ default, /* paginationEl */ HTMLElement, Unit]] = js.undefined
  
  var progress: js.UndefOr[js.Function2[/* swiper */ default, /* progress */ Double, Unit]] = js.undefined
  
  var reachBeginning: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var reachEnd: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var realIndexChange: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var resize: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var scroll: js.UndefOr[js.Function2[/* swiper */ default, /* event */ WheelEvent, Unit]] = js.undefined
  
  var scrollbarDragEnd: js.UndefOr[
    js.Function2[/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent, Unit]
  ] = js.undefined
  
  var scrollbarDragMove: js.UndefOr[
    js.Function2[/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent, Unit]
  ] = js.undefined
  
  var scrollbarDragStart: js.UndefOr[
    js.Function2[/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent, Unit]
  ] = js.undefined
  
  var setTransition: js.UndefOr[js.Function2[/* swiper */ default, /* transition */ Double, Unit]] = js.undefined
  
  var setTranslate: js.UndefOr[js.Function2[/* swiper */ default, /* translate */ Double, Unit]] = js.undefined
  
  var slideChange: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var slideChangeTransitionEnd: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var slideChangeTransitionStart: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var slideNextTransitionEnd: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var slideNextTransitionStart: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var slidePrevTransitionEnd: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var slidePrevTransitionStart: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var slideResetTransitionEnd: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var slideResetTransitionStart: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var sliderFirstMove: js.UndefOr[js.Function2[/* swiper */ default, /* event */ TouchEvent, Unit]] = js.undefined
  
  var sliderMove: js.UndefOr[
    js.Function2[/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent, Unit]
  ] = js.undefined
  
  var slidesGridLengthChange: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var slidesLengthChange: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var snapGridLengthChange: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var snapIndexChange: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var tap: js.UndefOr[
    js.Function2[/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent, Unit]
  ] = js.undefined
  
  var toEdge: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var touchEnd: js.UndefOr[
    js.Function2[/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent, Unit]
  ] = js.undefined
  
  var touchMove: js.UndefOr[
    js.Function2[/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent, Unit]
  ] = js.undefined
  
  var touchMoveOpposite: js.UndefOr[
    js.Function2[/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent, Unit]
  ] = js.undefined
  
  var touchStart: js.UndefOr[
    js.Function2[/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent, Unit]
  ] = js.undefined
  
  var transitionEnd: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var transitionStart: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var unlock: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var update: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.undefined
  
  var zoomChange: js.UndefOr[
    js.Function4[
      /* swiper */ default, 
      /* scale */ Double, 
      /* imageEl */ HTMLElement, 
      /* slideEl */ HTMLElement, 
      Unit
    ]
  ] = js.undefined
}
object eventinkeyofSwiperEventsS {
  
  inline def apply(): eventinkeyofSwiperEventsS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[eventinkeyofSwiperEventsS]
  }
  
  extension [Self <: eventinkeyofSwiperEventsS](x: Self) {
    
    inline def setActiveIndexChange(value: /* swiper */ default => Callback): Self = StObject.set(x, "activeIndexChange", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setActiveIndexChangeUndefined: Self = StObject.set(x, "activeIndexChange", js.undefined)
    
    inline def setAfterInit(value: /* swiper */ default => Callback): Self = StObject.set(x, "afterInit", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
    
    inline def setAutoplay(value: /* swiper */ default => Callback): Self = StObject.set(x, "autoplay", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setAutoplayPause(value: /* swiper */ default => Callback): Self = StObject.set(x, "autoplayPause", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setAutoplayPauseUndefined: Self = StObject.set(x, "autoplayPause", js.undefined)
    
    inline def setAutoplayResume(value: /* swiper */ default => Callback): Self = StObject.set(x, "autoplayResume", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setAutoplayResumeUndefined: Self = StObject.set(x, "autoplayResume", js.undefined)
    
    inline def setAutoplayStart(value: /* swiper */ default => Callback): Self = StObject.set(x, "autoplayStart", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setAutoplayStartUndefined: Self = StObject.set(x, "autoplayStart", js.undefined)
    
    inline def setAutoplayStop(value: /* swiper */ default => Callback): Self = StObject.set(x, "autoplayStop", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setAutoplayStopUndefined: Self = StObject.set(x, "autoplayStop", js.undefined)
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setBeforeDestroy(value: /* swiper */ default => Callback): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    inline def setBeforeInit(value: /* swiper */ default => Callback): Self = StObject.set(x, "beforeInit", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
    
    inline def setBeforeLoopFix(value: /* swiper */ default => Callback): Self = StObject.set(x, "beforeLoopFix", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setBeforeLoopFixUndefined: Self = StObject.set(x, "beforeLoopFix", js.undefined)
    
    inline def setBeforeResize(value: /* swiper */ default => Callback): Self = StObject.set(x, "beforeResize", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setBeforeResizeUndefined: Self = StObject.set(x, "beforeResize", js.undefined)
    
    inline def setBeforeSlideChangeStart(value: /* swiper */ default => Callback): Self = StObject.set(x, "beforeSlideChangeStart", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setBeforeSlideChangeStartUndefined: Self = StObject.set(x, "beforeSlideChangeStart", js.undefined)
    
    inline def setBeforeTransitionStart(value: (/* swiper */ default, /* speed */ Double, /* internal */ Any) => Callback): Self = StObject.set(x, "beforeTransitionStart", js.Any.fromFunction3((t0: /* swiper */ default, t1: /* speed */ Double, t2: /* internal */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setBeforeTransitionStartUndefined: Self = StObject.set(x, "beforeTransitionStart", js.undefined)
    
    inline def setBreakpoint(value: (/* swiper */ default, eventinkeyofSwiperEventsS) => Callback): Self = StObject.set(x, "breakpoint", js.Any.fromFunction2((t0: /* swiper */ default, t1: eventinkeyofSwiperEventsS) => (value(t0, t1)).runNow()))
    
    inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
    
    inline def setChangeDirection(value: /* swiper */ default => Callback): Self = StObject.set(x, "changeDirection", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setChangeDirectionUndefined: Self = StObject.set(x, "changeDirection", js.undefined)
    
    inline def setClick(value: (/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback): Self = StObject.set(x, "click", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setDestroy(value: /* swiper */ default => Callback): Self = StObject.set(x, "destroy", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setDoubleClick(value: (/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback): Self = StObject.set(x, "doubleClick", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
    
    inline def setDoubleTap(value: (/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback): Self = StObject.set(x, "doubleTap", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def setDoubleTapUndefined: Self = StObject.set(x, "doubleTap", js.undefined)
    
    inline def setFromEdge(value: /* swiper */ default => Callback): Self = StObject.set(x, "fromEdge", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setFromEdgeUndefined: Self = StObject.set(x, "fromEdge", js.undefined)
    
    inline def setHashChange(value: /* swiper */ default => Callback): Self = StObject.set(x, "hashChange", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setHashChangeUndefined: Self = StObject.set(x, "hashChange", js.undefined)
    
    inline def setHashSet(value: /* swiper */ default => Callback): Self = StObject.set(x, "hashSet", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setHashSetUndefined: Self = StObject.set(x, "hashSet", js.undefined)
    
    inline def setImagesReady(value: /* swiper */ default => Callback): Self = StObject.set(x, "imagesReady", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setImagesReadyUndefined: Self = StObject.set(x, "imagesReady", js.undefined)
    
    inline def setInit(value: /* swiper */ default => Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setKeyPress(value: (/* swiper */ default, /* keyCode */ String) => Callback): Self = StObject.set(x, "keyPress", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* keyCode */ String) => (value(t0, t1)).runNow()))
    
    inline def setKeyPressUndefined: Self = StObject.set(x, "keyPress", js.undefined)
    
    inline def setLazyImageLoad(value: (/* swiper */ default, /* slideEl */ HTMLElement, /* imageEl */ HTMLElement) => Callback): Self = StObject.set(x, "lazyImageLoad", js.Any.fromFunction3((t0: /* swiper */ default, t1: /* slideEl */ HTMLElement, t2: /* imageEl */ HTMLElement) => (value(t0, t1, t2)).runNow()))
    
    inline def setLazyImageLoadUndefined: Self = StObject.set(x, "lazyImageLoad", js.undefined)
    
    inline def setLazyImageReady(value: (/* swiper */ default, /* slideEl */ HTMLElement, /* imageEl */ HTMLElement) => Callback): Self = StObject.set(x, "lazyImageReady", js.Any.fromFunction3((t0: /* swiper */ default, t1: /* slideEl */ HTMLElement, t2: /* imageEl */ HTMLElement) => (value(t0, t1, t2)).runNow()))
    
    inline def setLazyImageReadyUndefined: Self = StObject.set(x, "lazyImageReady", js.undefined)
    
    inline def setLock(value: /* swiper */ default => Callback): Self = StObject.set(x, "lock", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
    
    inline def setLoopFix(value: /* swiper */ default => Callback): Self = StObject.set(x, "loopFix", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setLoopFixUndefined: Self = StObject.set(x, "loopFix", js.undefined)
    
    inline def setMomentumBounce(value: /* swiper */ default => Callback): Self = StObject.set(x, "momentumBounce", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setMomentumBounceUndefined: Self = StObject.set(x, "momentumBounce", js.undefined)
    
    inline def setNavigationHide(value: /* swiper */ default => Callback): Self = StObject.set(x, "navigationHide", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setNavigationHideUndefined: Self = StObject.set(x, "navigationHide", js.undefined)
    
    inline def setNavigationNext(value: /* swiper */ default => Callback): Self = StObject.set(x, "navigationNext", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setNavigationNextUndefined: Self = StObject.set(x, "navigationNext", js.undefined)
    
    inline def setNavigationPrev(value: /* swiper */ default => Callback): Self = StObject.set(x, "navigationPrev", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setNavigationPrevUndefined: Self = StObject.set(x, "navigationPrev", js.undefined)
    
    inline def setNavigationShow(value: /* swiper */ default => Callback): Self = StObject.set(x, "navigationShow", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setNavigationShowUndefined: Self = StObject.set(x, "navigationShow", js.undefined)
    
    inline def setObserverUpdate(value: /* swiper */ default => Callback): Self = StObject.set(x, "observerUpdate", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setObserverUpdateUndefined: Self = StObject.set(x, "observerUpdate", js.undefined)
    
    inline def setOrientationchange(value: /* swiper */ default => Callback): Self = StObject.set(x, "orientationchange", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setOrientationchangeUndefined: Self = StObject.set(x, "orientationchange", js.undefined)
    
    inline def setPaginationHide(value: /* swiper */ default => Callback): Self = StObject.set(x, "paginationHide", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setPaginationHideUndefined: Self = StObject.set(x, "paginationHide", js.undefined)
    
    inline def setPaginationRender(value: (/* swiper */ default, /* paginationEl */ HTMLElement) => Callback): Self = StObject.set(x, "paginationRender", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* paginationEl */ HTMLElement) => (value(t0, t1)).runNow()))
    
    inline def setPaginationRenderUndefined: Self = StObject.set(x, "paginationRender", js.undefined)
    
    inline def setPaginationShow(value: /* swiper */ default => Callback): Self = StObject.set(x, "paginationShow", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setPaginationShowUndefined: Self = StObject.set(x, "paginationShow", js.undefined)
    
    inline def setPaginationUpdate(value: (/* swiper */ default, /* paginationEl */ HTMLElement) => Callback): Self = StObject.set(x, "paginationUpdate", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* paginationEl */ HTMLElement) => (value(t0, t1)).runNow()))
    
    inline def setPaginationUpdateUndefined: Self = StObject.set(x, "paginationUpdate", js.undefined)
    
    inline def setProgress(value: (/* swiper */ default, /* progress */ Double) => Callback): Self = StObject.set(x, "progress", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* progress */ Double) => (value(t0, t1)).runNow()))
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setReachBeginning(value: /* swiper */ default => Callback): Self = StObject.set(x, "reachBeginning", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setReachBeginningUndefined: Self = StObject.set(x, "reachBeginning", js.undefined)
    
    inline def setReachEnd(value: /* swiper */ default => Callback): Self = StObject.set(x, "reachEnd", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setReachEndUndefined: Self = StObject.set(x, "reachEnd", js.undefined)
    
    inline def setRealIndexChange(value: /* swiper */ default => Callback): Self = StObject.set(x, "realIndexChange", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setRealIndexChangeUndefined: Self = StObject.set(x, "realIndexChange", js.undefined)
    
    inline def setResize(value: /* swiper */ default => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setScroll(value: (/* swiper */ default, /* event */ WheelEvent) => Callback): Self = StObject.set(x, "scroll", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ WheelEvent) => (value(t0, t1)).runNow()))
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setScrollbarDragEnd(value: (/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback): Self = StObject.set(x, "scrollbarDragEnd", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def setScrollbarDragEndUndefined: Self = StObject.set(x, "scrollbarDragEnd", js.undefined)
    
    inline def setScrollbarDragMove(value: (/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback): Self = StObject.set(x, "scrollbarDragMove", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def setScrollbarDragMoveUndefined: Self = StObject.set(x, "scrollbarDragMove", js.undefined)
    
    inline def setScrollbarDragStart(value: (/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback): Self = StObject.set(x, "scrollbarDragStart", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def setScrollbarDragStartUndefined: Self = StObject.set(x, "scrollbarDragStart", js.undefined)
    
    inline def setSetTransition(value: (/* swiper */ default, /* transition */ Double) => Callback): Self = StObject.set(x, "setTransition", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* transition */ Double) => (value(t0, t1)).runNow()))
    
    inline def setSetTransitionUndefined: Self = StObject.set(x, "setTransition", js.undefined)
    
    inline def setSetTranslate(value: (/* swiper */ default, /* translate */ Double) => Callback): Self = StObject.set(x, "setTranslate", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* translate */ Double) => (value(t0, t1)).runNow()))
    
    inline def setSetTranslateUndefined: Self = StObject.set(x, "setTranslate", js.undefined)
    
    inline def setSlideChange(value: /* swiper */ default => Callback): Self = StObject.set(x, "slideChange", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setSlideChangeTransitionEnd(value: /* swiper */ default => Callback): Self = StObject.set(x, "slideChangeTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setSlideChangeTransitionEndUndefined: Self = StObject.set(x, "slideChangeTransitionEnd", js.undefined)
    
    inline def setSlideChangeTransitionStart(value: /* swiper */ default => Callback): Self = StObject.set(x, "slideChangeTransitionStart", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setSlideChangeTransitionStartUndefined: Self = StObject.set(x, "slideChangeTransitionStart", js.undefined)
    
    inline def setSlideChangeUndefined: Self = StObject.set(x, "slideChange", js.undefined)
    
    inline def setSlideNextTransitionEnd(value: /* swiper */ default => Callback): Self = StObject.set(x, "slideNextTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setSlideNextTransitionEndUndefined: Self = StObject.set(x, "slideNextTransitionEnd", js.undefined)
    
    inline def setSlideNextTransitionStart(value: /* swiper */ default => Callback): Self = StObject.set(x, "slideNextTransitionStart", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setSlideNextTransitionStartUndefined: Self = StObject.set(x, "slideNextTransitionStart", js.undefined)
    
    inline def setSlidePrevTransitionEnd(value: /* swiper */ default => Callback): Self = StObject.set(x, "slidePrevTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setSlidePrevTransitionEndUndefined: Self = StObject.set(x, "slidePrevTransitionEnd", js.undefined)
    
    inline def setSlidePrevTransitionStart(value: /* swiper */ default => Callback): Self = StObject.set(x, "slidePrevTransitionStart", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setSlidePrevTransitionStartUndefined: Self = StObject.set(x, "slidePrevTransitionStart", js.undefined)
    
    inline def setSlideResetTransitionEnd(value: /* swiper */ default => Callback): Self = StObject.set(x, "slideResetTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setSlideResetTransitionEndUndefined: Self = StObject.set(x, "slideResetTransitionEnd", js.undefined)
    
    inline def setSlideResetTransitionStart(value: /* swiper */ default => Callback): Self = StObject.set(x, "slideResetTransitionStart", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setSlideResetTransitionStartUndefined: Self = StObject.set(x, "slideResetTransitionStart", js.undefined)
    
    inline def setSliderFirstMove(value: (/* swiper */ default, /* event */ TouchEvent) => Callback): Self = StObject.set(x, "sliderFirstMove", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ TouchEvent) => (value(t0, t1)).runNow()))
    
    inline def setSliderFirstMoveUndefined: Self = StObject.set(x, "sliderFirstMove", js.undefined)
    
    inline def setSliderMove(value: (/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback): Self = StObject.set(x, "sliderMove", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def setSliderMoveUndefined: Self = StObject.set(x, "sliderMove", js.undefined)
    
    inline def setSlidesGridLengthChange(value: /* swiper */ default => Callback): Self = StObject.set(x, "slidesGridLengthChange", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setSlidesGridLengthChangeUndefined: Self = StObject.set(x, "slidesGridLengthChange", js.undefined)
    
    inline def setSlidesLengthChange(value: /* swiper */ default => Callback): Self = StObject.set(x, "slidesLengthChange", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setSlidesLengthChangeUndefined: Self = StObject.set(x, "slidesLengthChange", js.undefined)
    
    inline def setSnapGridLengthChange(value: /* swiper */ default => Callback): Self = StObject.set(x, "snapGridLengthChange", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setSnapGridLengthChangeUndefined: Self = StObject.set(x, "snapGridLengthChange", js.undefined)
    
    inline def setSnapIndexChange(value: /* swiper */ default => Callback): Self = StObject.set(x, "snapIndexChange", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setSnapIndexChangeUndefined: Self = StObject.set(x, "snapIndexChange", js.undefined)
    
    inline def setTap(value: (/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback): Self = StObject.set(x, "tap", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
    
    inline def setToEdge(value: /* swiper */ default => Callback): Self = StObject.set(x, "toEdge", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setToEdgeUndefined: Self = StObject.set(x, "toEdge", js.undefined)
    
    inline def setTouchEnd(value: (/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback): Self = StObject.set(x, "touchEnd", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def setTouchEndUndefined: Self = StObject.set(x, "touchEnd", js.undefined)
    
    inline def setTouchMove(value: (/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback): Self = StObject.set(x, "touchMove", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def setTouchMoveOpposite(value: (/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback): Self = StObject.set(x, "touchMoveOpposite", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def setTouchMoveOppositeUndefined: Self = StObject.set(x, "touchMoveOpposite", js.undefined)
    
    inline def setTouchMoveUndefined: Self = StObject.set(x, "touchMove", js.undefined)
    
    inline def setTouchStart(value: (/* swiper */ default, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback): Self = StObject.set(x, "touchStart", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def setTouchStartUndefined: Self = StObject.set(x, "touchStart", js.undefined)
    
    inline def setTransitionEnd(value: /* swiper */ default => Callback): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setTransitionEndUndefined: Self = StObject.set(x, "transitionEnd", js.undefined)
    
    inline def setTransitionStart(value: /* swiper */ default => Callback): Self = StObject.set(x, "transitionStart", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setTransitionStartUndefined: Self = StObject.set(x, "transitionStart", js.undefined)
    
    inline def setUnlock(value: /* swiper */ default => Callback): Self = StObject.set(x, "unlock", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setUnlockUndefined: Self = StObject.set(x, "unlock", js.undefined)
    
    inline def setUpdate(value: /* swiper */ default => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setZoomChange(
      value: (/* swiper */ default, /* scale */ Double, /* imageEl */ HTMLElement, /* slideEl */ HTMLElement) => Callback
    ): Self = StObject.set(x, "zoomChange", js.Any.fromFunction4((t0: /* swiper */ default, t1: /* scale */ Double, t2: /* imageEl */ HTMLElement, t3: /* slideEl */ HTMLElement) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setZoomChangeUndefined: Self = StObject.set(x, "zoomChange", js.undefined)
    
    inline def set_beforeBreakpoint(value: (/* swiper */ default, eventinkeyofSwiperEventsS) => Callback): Self = StObject.set(x, "_beforeBreakpoint", js.Any.fromFunction2((t0: /* swiper */ default, t1: eventinkeyofSwiperEventsS) => (value(t0, t1)).runNow()))
    
    inline def set_beforeBreakpointUndefined: Self = StObject.set(x, "_beforeBreakpoint", js.undefined)
    
    inline def set_containerClasses(value: (/* swiper */ default, /* classNames */ String) => Callback): Self = StObject.set(x, "_containerClasses", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* classNames */ String) => (value(t0, t1)).runNow()))
    
    inline def set_containerClassesUndefined: Self = StObject.set(x, "_containerClasses", js.undefined)
    
    inline def set_freeModeNoMomentumRelease(value: /* swiper */ default => Callback): Self = StObject.set(x, "_freeModeNoMomentumRelease", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def set_freeModeNoMomentumReleaseUndefined: Self = StObject.set(x, "_freeModeNoMomentumRelease", js.undefined)
    
    inline def set_slideClass(value: (/* swiper */ default, /* slideEl */ HTMLElement, /* classNames */ String) => Callback): Self = StObject.set(x, "_slideClass", js.Any.fromFunction3((t0: /* swiper */ default, t1: /* slideEl */ HTMLElement, t2: /* classNames */ String) => (value(t0, t1, t2)).runNow()))
    
    inline def set_slideClassUndefined: Self = StObject.set(x, "_slideClass", js.undefined)
    
    inline def set_slideClasses(value: (/* swiper */ default, /* slides */ js.Array[ClassNames]) => Callback): Self = StObject.set(x, "_slideClasses", js.Any.fromFunction2((t0: /* swiper */ default, t1: /* slides */ js.Array[ClassNames]) => (value(t0, t1)).runNow()))
    
    inline def set_slideClassesUndefined: Self = StObject.set(x, "_slideClasses", js.undefined)
    
    inline def set_swiper(value: /* swiper */ default => Callback): Self = StObject.set(x, "_swiper", js.Any.fromFunction1((t0: /* swiper */ default) => value(t0).runNow()))
    
    inline def set_swiperUndefined: Self = StObject.set(x, "_swiper", js.undefined)
  }
}
