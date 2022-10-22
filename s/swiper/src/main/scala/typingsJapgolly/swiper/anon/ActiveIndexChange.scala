package typingsJapgolly.swiper.anon

import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveIndexChange extends StObject {
  
  /**
    * !INTERNAL: Event will fired right before breakpoint change
    */
  var _beforeBreakpoint: CustomEvent
  
  /**
    * !INTERNAL: Event will fired after setting CSS classes on swiper container element
    */
  var _containerClasses: CustomEvent
  
  /**
    * !INTERNAL: Event will be fired on free mode touch end (release) and there will no be momentum
    */
  var _freeModeNoMomentumRelease: CustomEvent
  
  /**
    * !INTERNAL: Event will fired after setting CSS classes on swiper slide element
    */
  var _slideClass: CustomEvent
  
  /**
    * !INTERNAL: Event will fired after setting CSS classes on all swiper slides
    */
  var _slideClasses: CustomEvent
  
  /**
    * !INTERNAL: Event will fired as soon as swiper instance available (before init)
    */
  var _swiper: CustomEvent
  
  /**
    * Event will fired on active index change
    */
  var activeIndexChange: CustomEvent
  
  /**
    * Event will fired right after initialization
    */
  var afterInit: CustomEvent
  
  /**
    * Event will be fired when slide changed with autoplay
    */
  var autoplay: CustomEvent
  
  /**
    * Event will be fired on autoplay pause (on mouse/pointer enter), when `pauseOnMouseEnter` enabled
    */
  var autoplayPause: CustomEvent
  
  /**
    * Event will be fired on autoplay resume (on mouse/pointer leave), when `pauseOnMouseEnter` enabled
    */
  var autoplayResume: CustomEvent
  
  /**
    * Event will be fired in when autoplay started
    */
  var autoplayStart: CustomEvent
  
  /**
    * Event will be fired when autoplay stopped
    */
  var autoplayStop: CustomEvent
  
  /**
    * Event will be fired right before Swiper destroyed
    */
  var beforeDestroy: CustomEvent
  
  /**
    * Event will fired right before initialization
    */
  var beforeInit: CustomEvent
  
  /**
    * Event will be fired right before "loop fix"
    */
  var beforeLoopFix: CustomEvent
  
  /**
    * Event will fired before resize handler
    */
  var beforeResize: CustomEvent
  
  /**
    * Event will fired before slide change transition start
    */
  var beforeSlideChangeStart: CustomEvent
  
  /**
    * Event will fired before transition start
    */
  var beforeTransitionStart: CustomEvent
  
  /**
    * Event will be fired on breakpoint change
    */
  var breakpoint: CustomEvent
  
  // what is internal?
  /**
    * Event will fired on direction change
    */
  var changeDirection: CustomEvent
  
  /**
    * Event will be fired when user click/tap on Swiper. Receives `touchend` event as an arguments.
    */
  var click: CustomEvent
  
  /**
    * Event will be fired on swiper destroy
    */
  var destroy: CustomEvent
  
  /**
    * Event will be fired when user double click/tap on Swiper
    */
  var doubleClick: CustomEvent
  
  /**
    * Event will be fired when user double tap on Swiper's container. Receives `touchend` event as an arguments
    */
  var doubleTap: CustomEvent
  
  /**
    * Event will be fired when Swiper goes from beginning or end position
    */
  var fromEdge: CustomEvent
  
  /**
    * Event will be fired on window hash change
    */
  var hashChange: CustomEvent
  
  /**
    * Event will be fired when swiper updates the hash
    */
  var hashSet: CustomEvent
  
  /**
    * Event will be fired right after all inner images are loaded. updateOnImagesReady should be also enabled
    */
  var imagesReady: CustomEvent
  
  /**
    * Fired right after Swiper initialization.
    * @note Note that with `swiper.on('init')` syntax it will
    * work only in case you set `init: false` parameter.
    *
    * @example
    * ```js
    * const swiper = new Swiper('.swiper', {
    *   init: false,
    *   // other parameters
    * });
    * swiper.on('init', function() {
    *  // do something
    * });
    * // init Swiper
    * swiper.init();
    * ```
    *
    * @example
    * ```js
    * // Otherwise use it as the parameter:
    * const swiper = new Swiper('.swiper', {
    *   // other parameters
    *   on: {
    *     init: function () {
    *       // do something
    *     },
    *   }
    * });
    * ```
    */
  var init: CustomEvent
  
  /**
    * Event will be fired on key press
    */
  var keyPress: CustomEvent
  
  /**
    * Event will be fired in the beginning of lazy loading of image
    */
  var lazyImageLoad: CustomEvent
  
  /**
    * Event will be fired when lazy loading image will be loaded
    */
  var lazyImageReady: CustomEvent
  
  /**
    * Event will be fired when swiper is locked (when `watchOverflow` enabled)
    */
  var lock: CustomEvent
  
  /**
    * Event will be fired after "loop fix"
    */
  var loopFix: CustomEvent
  
  /**
    * Event will be fired on momentum bounce
    */
  var momentumBounce: CustomEvent
  
  /**
    * Event will be fired on navigation hide
    */
  var navigationHide: CustomEvent
  
  /**
    * Event will be fired on navigation next button click
    */
  var navigationNext: CustomEvent
  
  /**
    * Event will be fired on navigation prev button click
    */
  var navigationPrev: CustomEvent
  
  /**
    * Event will be fired on navigation show
    */
  var navigationShow: CustomEvent
  
  /**
    * Event will be fired if observer is enabled and it detects DOM mutations
    */
  var observerUpdate: CustomEvent
  
  /**
    * Event will be fired on orientation change (e.g. landscape -> portrait)
    */
  var orientationchange: CustomEvent
  
  /**
    * Event will be fired on pagination hide
    */
  var paginationHide: CustomEvent
  
  /**
    * Event will be fired after pagination rendered
    */
  var paginationRender: CustomEvent
  
  /**
    * Event will be fired on pagination show
    */
  var paginationShow: CustomEvent
  
  /**
    * Event will be fired when pagination updated
    */
  var paginationUpdate: CustomEvent
  
  /**
    * Event will be fired when Swiper progress is changed, as an arguments it receives progress that is always from 0 to 1
    */
  var progress: CustomEvent
  
  /**
    * Event will be fired when Swiper reach its beginning (initial position)
    */
  var reachBeginning: CustomEvent
  
  /**
    * Event will be fired when Swiper reach last slide
    */
  var reachEnd: CustomEvent
  
  /**
    * Event will fired on real index change
    */
  var realIndexChange: CustomEvent
  
  /**
    * Event will be fired on window resize right before swiper's onresize manipulation
    */
  var resize: CustomEvent
  
  /**
    * Event will be fired on mousewheel scroll
    */
  var scroll: CustomEvent
  
  /**
    * Event will be fired on draggable scrollbar drag end
    */
  var scrollbarDragEnd: CustomEvent
  
  /**
    * Event will be fired on draggable scrollbar drag move
    */
  var scrollbarDragMove: CustomEvent
  
  /**
    * Event will be fired on draggable scrollbar drag start
    */
  var scrollbarDragStart: CustomEvent
  
  /**
    * Event will be fired everytime when swiper starts animation. Receives current transition duration (in ms) as an arguments
    */
  var setTransition: CustomEvent
  
  /**
    * Event will be fired when swiper's wrapper change its position. Receives current translate value as an arguments
    */
  var setTranslate: CustomEvent
  
  /**
    * Event will be fired when currently active slide is changed
    */
  var slideChange: CustomEvent
  
  /**
    * Event will be fired after animation to other slide (next or previous).
    */
  var slideChangeTransitionEnd: CustomEvent
  
  /**
    * Event will be fired in the beginning of animation to other slide (next or previous).
    */
  var slideChangeTransitionStart: CustomEvent
  
  /**
    * Same as "slideChangeTransitionEnd" but for "forward" direction only
    */
  var slideNextTransitionEnd: CustomEvent
  
  /**
    * Same as "slideChangeTransitionStart" but for "forward" direction only
    */
  var slideNextTransitionStart: CustomEvent
  
  /**
    * Same as "slideChangeTransitionEnd" but for "backward" direction only
    */
  var slidePrevTransitionEnd: CustomEvent
  
  /**
    * Same as "slideChangeTransitionStart" but for "backward" direction only
    */
  var slidePrevTransitionStart: CustomEvent
  
  /**
    * Event will be fired in the end of animation of resetting slide to current one
    */
  var slideResetTransitionEnd: CustomEvent
  
  /**
    * Event will be fired in the beginning of animation of resetting slide to current one
    */
  var slideResetTransitionStart: CustomEvent
  
  /**
    * Event will be fired with first touch/drag move
    */
  var sliderFirstMove: CustomEvent
  
  /**
    * Event will be fired when user touch and move finger over Swiper and move it. Receives `touchmove` event as an arguments.
    */
  var sliderMove: CustomEvent
  
  /**
    * Event will be fired when slides grid has changed
    */
  var slidesGridLengthChange: CustomEvent
  
  /**
    * Event will be fired when number of slides has changed
    */
  var slidesLengthChange: CustomEvent
  
  /**
    * Event will be fired when snap grid has changed
    */
  var snapGridLengthChange: CustomEvent
  
  /**
    * Event will fired on snap index change
    */
  var snapIndexChange: CustomEvent
  
  var swiper: CustomEvent
  
  /**
    * Event will be fired when user click/tap on Swiper. Receives `touchend` event as an arguments.
    */
  var tap: CustomEvent
  
  /**
    * Event will be fired when Swiper goes to beginning or end position
    */
  var toEdge: CustomEvent
  
  /**
    * Event will be fired when user release Swiper. Receives `touchend` event as an arguments.
    */
  var touchEnd: CustomEvent
  
  /**
    * Event will be fired when user touch and move finger over Swiper. Receives `touchmove` event as an arguments.
    */
  var touchMove: CustomEvent
  
  /**
    * Event will be fired when user touch and move finger over Swiper in direction opposite to direction parameter. Receives `touchmove` event as an arguments.
    */
  var touchMoveOpposite: CustomEvent
  
  /**
    * Event will be fired when user touch Swiper. Receives `touchstart` event as an arguments.
    */
  var touchStart: CustomEvent
  
  /**
    * Event will be fired after transition.
    */
  var transitionEnd: CustomEvent
  
  /**
    * Event will be fired in the beginning of transition.
    */
  var transitionStart: CustomEvent
  
  /**
    * Event will be fired when swiper is unlocked (when `watchOverflow` enabled)
    */
  var unlock: CustomEvent
  
  /**
    * Event will be fired after swiper.update() call
    */
  var update: CustomEvent
  
  /**
    * Event will be fired on zoom change
    */
  var zoomChange: CustomEvent
}
object ActiveIndexChange {
  
  inline def apply(
    _beforeBreakpoint: CustomEvent,
    _containerClasses: CustomEvent,
    _freeModeNoMomentumRelease: CustomEvent,
    _slideClass: CustomEvent,
    _slideClasses: CustomEvent,
    _swiper: CustomEvent,
    activeIndexChange: CustomEvent,
    afterInit: CustomEvent,
    autoplay: CustomEvent,
    autoplayPause: CustomEvent,
    autoplayResume: CustomEvent,
    autoplayStart: CustomEvent,
    autoplayStop: CustomEvent,
    beforeDestroy: CustomEvent,
    beforeInit: CustomEvent,
    beforeLoopFix: CustomEvent,
    beforeResize: CustomEvent,
    beforeSlideChangeStart: CustomEvent,
    beforeTransitionStart: CustomEvent,
    breakpoint: CustomEvent,
    changeDirection: CustomEvent,
    click: CustomEvent,
    destroy: CustomEvent,
    doubleClick: CustomEvent,
    doubleTap: CustomEvent,
    fromEdge: CustomEvent,
    hashChange: CustomEvent,
    hashSet: CustomEvent,
    imagesReady: CustomEvent,
    init: CustomEvent,
    keyPress: CustomEvent,
    lazyImageLoad: CustomEvent,
    lazyImageReady: CustomEvent,
    lock: CustomEvent,
    loopFix: CustomEvent,
    momentumBounce: CustomEvent,
    navigationHide: CustomEvent,
    navigationNext: CustomEvent,
    navigationPrev: CustomEvent,
    navigationShow: CustomEvent,
    observerUpdate: CustomEvent,
    orientationchange: CustomEvent,
    paginationHide: CustomEvent,
    paginationRender: CustomEvent,
    paginationShow: CustomEvent,
    paginationUpdate: CustomEvent,
    progress: CustomEvent,
    reachBeginning: CustomEvent,
    reachEnd: CustomEvent,
    realIndexChange: CustomEvent,
    resize: CustomEvent,
    scroll: CustomEvent,
    scrollbarDragEnd: CustomEvent,
    scrollbarDragMove: CustomEvent,
    scrollbarDragStart: CustomEvent,
    setTransition: CustomEvent,
    setTranslate: CustomEvent,
    slideChange: CustomEvent,
    slideChangeTransitionEnd: CustomEvent,
    slideChangeTransitionStart: CustomEvent,
    slideNextTransitionEnd: CustomEvent,
    slideNextTransitionStart: CustomEvent,
    slidePrevTransitionEnd: CustomEvent,
    slidePrevTransitionStart: CustomEvent,
    slideResetTransitionEnd: CustomEvent,
    slideResetTransitionStart: CustomEvent,
    sliderFirstMove: CustomEvent,
    sliderMove: CustomEvent,
    slidesGridLengthChange: CustomEvent,
    slidesLengthChange: CustomEvent,
    snapGridLengthChange: CustomEvent,
    snapIndexChange: CustomEvent,
    swiper: CustomEvent,
    tap: CustomEvent,
    toEdge: CustomEvent,
    touchEnd: CustomEvent,
    touchMove: CustomEvent,
    touchMoveOpposite: CustomEvent,
    touchStart: CustomEvent,
    transitionEnd: CustomEvent,
    transitionStart: CustomEvent,
    unlock: CustomEvent,
    update: CustomEvent,
    zoomChange: CustomEvent
  ): ActiveIndexChange = {
    val __obj = js.Dynamic.literal(_beforeBreakpoint = _beforeBreakpoint.asInstanceOf[js.Any], _containerClasses = _containerClasses.asInstanceOf[js.Any], _freeModeNoMomentumRelease = _freeModeNoMomentumRelease.asInstanceOf[js.Any], _slideClass = _slideClass.asInstanceOf[js.Any], _slideClasses = _slideClasses.asInstanceOf[js.Any], _swiper = _swiper.asInstanceOf[js.Any], activeIndexChange = activeIndexChange.asInstanceOf[js.Any], afterInit = afterInit.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], autoplayPause = autoplayPause.asInstanceOf[js.Any], autoplayResume = autoplayResume.asInstanceOf[js.Any], autoplayStart = autoplayStart.asInstanceOf[js.Any], autoplayStop = autoplayStop.asInstanceOf[js.Any], beforeDestroy = beforeDestroy.asInstanceOf[js.Any], beforeInit = beforeInit.asInstanceOf[js.Any], beforeLoopFix = beforeLoopFix.asInstanceOf[js.Any], beforeResize = beforeResize.asInstanceOf[js.Any], beforeSlideChangeStart = beforeSlideChangeStart.asInstanceOf[js.Any], beforeTransitionStart = beforeTransitionStart.asInstanceOf[js.Any], breakpoint = breakpoint.asInstanceOf[js.Any], changeDirection = changeDirection.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], destroy = destroy.asInstanceOf[js.Any], doubleClick = doubleClick.asInstanceOf[js.Any], doubleTap = doubleTap.asInstanceOf[js.Any], fromEdge = fromEdge.asInstanceOf[js.Any], hashChange = hashChange.asInstanceOf[js.Any], hashSet = hashSet.asInstanceOf[js.Any], imagesReady = imagesReady.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], keyPress = keyPress.asInstanceOf[js.Any], lazyImageLoad = lazyImageLoad.asInstanceOf[js.Any], lazyImageReady = lazyImageReady.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], loopFix = loopFix.asInstanceOf[js.Any], momentumBounce = momentumBounce.asInstanceOf[js.Any], navigationHide = navigationHide.asInstanceOf[js.Any], navigationNext = navigationNext.asInstanceOf[js.Any], navigationPrev = navigationPrev.asInstanceOf[js.Any], navigationShow = navigationShow.asInstanceOf[js.Any], observerUpdate = observerUpdate.asInstanceOf[js.Any], orientationchange = orientationchange.asInstanceOf[js.Any], paginationHide = paginationHide.asInstanceOf[js.Any], paginationRender = paginationRender.asInstanceOf[js.Any], paginationShow = paginationShow.asInstanceOf[js.Any], paginationUpdate = paginationUpdate.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], reachBeginning = reachBeginning.asInstanceOf[js.Any], reachEnd = reachEnd.asInstanceOf[js.Any], realIndexChange = realIndexChange.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollbarDragEnd = scrollbarDragEnd.asInstanceOf[js.Any], scrollbarDragMove = scrollbarDragMove.asInstanceOf[js.Any], scrollbarDragStart = scrollbarDragStart.asInstanceOf[js.Any], setTransition = setTransition.asInstanceOf[js.Any], setTranslate = setTranslate.asInstanceOf[js.Any], slideChange = slideChange.asInstanceOf[js.Any], slideChangeTransitionEnd = slideChangeTransitionEnd.asInstanceOf[js.Any], slideChangeTransitionStart = slideChangeTransitionStart.asInstanceOf[js.Any], slideNextTransitionEnd = slideNextTransitionEnd.asInstanceOf[js.Any], slideNextTransitionStart = slideNextTransitionStart.asInstanceOf[js.Any], slidePrevTransitionEnd = slidePrevTransitionEnd.asInstanceOf[js.Any], slidePrevTransitionStart = slidePrevTransitionStart.asInstanceOf[js.Any], slideResetTransitionEnd = slideResetTransitionEnd.asInstanceOf[js.Any], slideResetTransitionStart = slideResetTransitionStart.asInstanceOf[js.Any], sliderFirstMove = sliderFirstMove.asInstanceOf[js.Any], sliderMove = sliderMove.asInstanceOf[js.Any], slidesGridLengthChange = slidesGridLengthChange.asInstanceOf[js.Any], slidesLengthChange = slidesLengthChange.asInstanceOf[js.Any], snapGridLengthChange = snapGridLengthChange.asInstanceOf[js.Any], snapIndexChange = snapIndexChange.asInstanceOf[js.Any], swiper = swiper.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any], toEdge = toEdge.asInstanceOf[js.Any], touchEnd = touchEnd.asInstanceOf[js.Any], touchMove = touchMove.asInstanceOf[js.Any], touchMoveOpposite = touchMoveOpposite.asInstanceOf[js.Any], touchStart = touchStart.asInstanceOf[js.Any], transitionEnd = transitionEnd.asInstanceOf[js.Any], transitionStart = transitionStart.asInstanceOf[js.Any], unlock = unlock.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], zoomChange = zoomChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIndexChange]
  }
  
  extension [Self <: ActiveIndexChange](x: Self) {
    
    inline def setActiveIndexChange(value: CustomEvent): Self = StObject.set(x, "activeIndexChange", value.asInstanceOf[js.Any])
    
    inline def setAfterInit(value: CustomEvent): Self = StObject.set(x, "afterInit", value.asInstanceOf[js.Any])
    
    inline def setAutoplay(value: CustomEvent): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayPause(value: CustomEvent): Self = StObject.set(x, "autoplayPause", value.asInstanceOf[js.Any])
    
    inline def setAutoplayResume(value: CustomEvent): Self = StObject.set(x, "autoplayResume", value.asInstanceOf[js.Any])
    
    inline def setAutoplayStart(value: CustomEvent): Self = StObject.set(x, "autoplayStart", value.asInstanceOf[js.Any])
    
    inline def setAutoplayStop(value: CustomEvent): Self = StObject.set(x, "autoplayStop", value.asInstanceOf[js.Any])
    
    inline def setBeforeDestroy(value: CustomEvent): Self = StObject.set(x, "beforeDestroy", value.asInstanceOf[js.Any])
    
    inline def setBeforeInit(value: CustomEvent): Self = StObject.set(x, "beforeInit", value.asInstanceOf[js.Any])
    
    inline def setBeforeLoopFix(value: CustomEvent): Self = StObject.set(x, "beforeLoopFix", value.asInstanceOf[js.Any])
    
    inline def setBeforeResize(value: CustomEvent): Self = StObject.set(x, "beforeResize", value.asInstanceOf[js.Any])
    
    inline def setBeforeSlideChangeStart(value: CustomEvent): Self = StObject.set(x, "beforeSlideChangeStart", value.asInstanceOf[js.Any])
    
    inline def setBeforeTransitionStart(value: CustomEvent): Self = StObject.set(x, "beforeTransitionStart", value.asInstanceOf[js.Any])
    
    inline def setBreakpoint(value: CustomEvent): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    inline def setChangeDirection(value: CustomEvent): Self = StObject.set(x, "changeDirection", value.asInstanceOf[js.Any])
    
    inline def setClick(value: CustomEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: CustomEvent): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDoubleClick(value: CustomEvent): Self = StObject.set(x, "doubleClick", value.asInstanceOf[js.Any])
    
    inline def setDoubleTap(value: CustomEvent): Self = StObject.set(x, "doubleTap", value.asInstanceOf[js.Any])
    
    inline def setFromEdge(value: CustomEvent): Self = StObject.set(x, "fromEdge", value.asInstanceOf[js.Any])
    
    inline def setHashChange(value: CustomEvent): Self = StObject.set(x, "hashChange", value.asInstanceOf[js.Any])
    
    inline def setHashSet(value: CustomEvent): Self = StObject.set(x, "hashSet", value.asInstanceOf[js.Any])
    
    inline def setImagesReady(value: CustomEvent): Self = StObject.set(x, "imagesReady", value.asInstanceOf[js.Any])
    
    inline def setInit(value: CustomEvent): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setKeyPress(value: CustomEvent): Self = StObject.set(x, "keyPress", value.asInstanceOf[js.Any])
    
    inline def setLazyImageLoad(value: CustomEvent): Self = StObject.set(x, "lazyImageLoad", value.asInstanceOf[js.Any])
    
    inline def setLazyImageReady(value: CustomEvent): Self = StObject.set(x, "lazyImageReady", value.asInstanceOf[js.Any])
    
    inline def setLock(value: CustomEvent): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    inline def setLoopFix(value: CustomEvent): Self = StObject.set(x, "loopFix", value.asInstanceOf[js.Any])
    
    inline def setMomentumBounce(value: CustomEvent): Self = StObject.set(x, "momentumBounce", value.asInstanceOf[js.Any])
    
    inline def setNavigationHide(value: CustomEvent): Self = StObject.set(x, "navigationHide", value.asInstanceOf[js.Any])
    
    inline def setNavigationNext(value: CustomEvent): Self = StObject.set(x, "navigationNext", value.asInstanceOf[js.Any])
    
    inline def setNavigationPrev(value: CustomEvent): Self = StObject.set(x, "navigationPrev", value.asInstanceOf[js.Any])
    
    inline def setNavigationShow(value: CustomEvent): Self = StObject.set(x, "navigationShow", value.asInstanceOf[js.Any])
    
    inline def setObserverUpdate(value: CustomEvent): Self = StObject.set(x, "observerUpdate", value.asInstanceOf[js.Any])
    
    inline def setOrientationchange(value: CustomEvent): Self = StObject.set(x, "orientationchange", value.asInstanceOf[js.Any])
    
    inline def setPaginationHide(value: CustomEvent): Self = StObject.set(x, "paginationHide", value.asInstanceOf[js.Any])
    
    inline def setPaginationRender(value: CustomEvent): Self = StObject.set(x, "paginationRender", value.asInstanceOf[js.Any])
    
    inline def setPaginationShow(value: CustomEvent): Self = StObject.set(x, "paginationShow", value.asInstanceOf[js.Any])
    
    inline def setPaginationUpdate(value: CustomEvent): Self = StObject.set(x, "paginationUpdate", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: CustomEvent): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setReachBeginning(value: CustomEvent): Self = StObject.set(x, "reachBeginning", value.asInstanceOf[js.Any])
    
    inline def setReachEnd(value: CustomEvent): Self = StObject.set(x, "reachEnd", value.asInstanceOf[js.Any])
    
    inline def setRealIndexChange(value: CustomEvent): Self = StObject.set(x, "realIndexChange", value.asInstanceOf[js.Any])
    
    inline def setResize(value: CustomEvent): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: CustomEvent): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollbarDragEnd(value: CustomEvent): Self = StObject.set(x, "scrollbarDragEnd", value.asInstanceOf[js.Any])
    
    inline def setScrollbarDragMove(value: CustomEvent): Self = StObject.set(x, "scrollbarDragMove", value.asInstanceOf[js.Any])
    
    inline def setScrollbarDragStart(value: CustomEvent): Self = StObject.set(x, "scrollbarDragStart", value.asInstanceOf[js.Any])
    
    inline def setSetTransition(value: CustomEvent): Self = StObject.set(x, "setTransition", value.asInstanceOf[js.Any])
    
    inline def setSetTranslate(value: CustomEvent): Self = StObject.set(x, "setTranslate", value.asInstanceOf[js.Any])
    
    inline def setSlideChange(value: CustomEvent): Self = StObject.set(x, "slideChange", value.asInstanceOf[js.Any])
    
    inline def setSlideChangeTransitionEnd(value: CustomEvent): Self = StObject.set(x, "slideChangeTransitionEnd", value.asInstanceOf[js.Any])
    
    inline def setSlideChangeTransitionStart(value: CustomEvent): Self = StObject.set(x, "slideChangeTransitionStart", value.asInstanceOf[js.Any])
    
    inline def setSlideNextTransitionEnd(value: CustomEvent): Self = StObject.set(x, "slideNextTransitionEnd", value.asInstanceOf[js.Any])
    
    inline def setSlideNextTransitionStart(value: CustomEvent): Self = StObject.set(x, "slideNextTransitionStart", value.asInstanceOf[js.Any])
    
    inline def setSlidePrevTransitionEnd(value: CustomEvent): Self = StObject.set(x, "slidePrevTransitionEnd", value.asInstanceOf[js.Any])
    
    inline def setSlidePrevTransitionStart(value: CustomEvent): Self = StObject.set(x, "slidePrevTransitionStart", value.asInstanceOf[js.Any])
    
    inline def setSlideResetTransitionEnd(value: CustomEvent): Self = StObject.set(x, "slideResetTransitionEnd", value.asInstanceOf[js.Any])
    
    inline def setSlideResetTransitionStart(value: CustomEvent): Self = StObject.set(x, "slideResetTransitionStart", value.asInstanceOf[js.Any])
    
    inline def setSliderFirstMove(value: CustomEvent): Self = StObject.set(x, "sliderFirstMove", value.asInstanceOf[js.Any])
    
    inline def setSliderMove(value: CustomEvent): Self = StObject.set(x, "sliderMove", value.asInstanceOf[js.Any])
    
    inline def setSlidesGridLengthChange(value: CustomEvent): Self = StObject.set(x, "slidesGridLengthChange", value.asInstanceOf[js.Any])
    
    inline def setSlidesLengthChange(value: CustomEvent): Self = StObject.set(x, "slidesLengthChange", value.asInstanceOf[js.Any])
    
    inline def setSnapGridLengthChange(value: CustomEvent): Self = StObject.set(x, "snapGridLengthChange", value.asInstanceOf[js.Any])
    
    inline def setSnapIndexChange(value: CustomEvent): Self = StObject.set(x, "snapIndexChange", value.asInstanceOf[js.Any])
    
    inline def setSwiper(value: CustomEvent): Self = StObject.set(x, "swiper", value.asInstanceOf[js.Any])
    
    inline def setTap(value: CustomEvent): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
    
    inline def setToEdge(value: CustomEvent): Self = StObject.set(x, "toEdge", value.asInstanceOf[js.Any])
    
    inline def setTouchEnd(value: CustomEvent): Self = StObject.set(x, "touchEnd", value.asInstanceOf[js.Any])
    
    inline def setTouchMove(value: CustomEvent): Self = StObject.set(x, "touchMove", value.asInstanceOf[js.Any])
    
    inline def setTouchMoveOpposite(value: CustomEvent): Self = StObject.set(x, "touchMoveOpposite", value.asInstanceOf[js.Any])
    
    inline def setTouchStart(value: CustomEvent): Self = StObject.set(x, "touchStart", value.asInstanceOf[js.Any])
    
    inline def setTransitionEnd(value: CustomEvent): Self = StObject.set(x, "transitionEnd", value.asInstanceOf[js.Any])
    
    inline def setTransitionStart(value: CustomEvent): Self = StObject.set(x, "transitionStart", value.asInstanceOf[js.Any])
    
    inline def setUnlock(value: CustomEvent): Self = StObject.set(x, "unlock", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: CustomEvent): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setZoomChange(value: CustomEvent): Self = StObject.set(x, "zoomChange", value.asInstanceOf[js.Any])
    
    inline def set_beforeBreakpoint(value: CustomEvent): Self = StObject.set(x, "_beforeBreakpoint", value.asInstanceOf[js.Any])
    
    inline def set_containerClasses(value: CustomEvent): Self = StObject.set(x, "_containerClasses", value.asInstanceOf[js.Any])
    
    inline def set_freeModeNoMomentumRelease(value: CustomEvent): Self = StObject.set(x, "_freeModeNoMomentumRelease", value.asInstanceOf[js.Any])
    
    inline def set_slideClass(value: CustomEvent): Self = StObject.set(x, "_slideClass", value.asInstanceOf[js.Any])
    
    inline def set_slideClasses(value: CustomEvent): Self = StObject.set(x, "_slideClasses", value.asInstanceOf[js.Any])
    
    inline def set_swiper(value: CustomEvent): Self = StObject.set(x, "_swiper", value.asInstanceOf[js.Any])
  }
}
