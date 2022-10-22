package typingsJapgolly.swiper

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.OnInit
import typingsJapgolly.angularCore.mod.QueryList
import typingsJapgolly.angularCore.mod.SimpleChanges
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.rxjs.mod.Subject
import typingsJapgolly.swiper.angularAngularSrcSwiperSlideDotdirectiveMod.SwiperSlideDirective
import typingsJapgolly.swiper.anon.A11y
import typingsJapgolly.swiper.anon.SactiveIndexChange
import typingsJapgolly.swiper.anon.eventinkeyofSwiperEventsS
import typingsJapgolly.swiper.mod.default
import typingsJapgolly.swiper.swiperBooleans.`false`
import typingsJapgolly.swiper.swiperStrings._empty
import typingsJapgolly.swiper.swiperStrings.`[slotEqualssigncontainer-end]`
import typingsJapgolly.swiper.swiperStrings.`[slotEqualssigncontainer-start]`
import typingsJapgolly.swiper.swiperStrings.`[slotEqualssignwrapper-end]`
import typingsJapgolly.swiper.swiperStrings.`[slotEqualssignwrapper-start]`
import typingsJapgolly.swiper.swiperStrings.`swiperComma [swiper]`
import typingsJapgolly.swiper.swiperStrings.auto
import typingsJapgolly.swiper.swiperStrings.cards
import typingsJapgolly.swiper.swiperStrings.container
import typingsJapgolly.swiper.swiperStrings.coverflow
import typingsJapgolly.swiper.swiperStrings.creative
import typingsJapgolly.swiper.swiperStrings.cube
import typingsJapgolly.swiper.swiperStrings.fade
import typingsJapgolly.swiper.swiperStrings.flip
import typingsJapgolly.swiper.swiperStrings.horizontal
import typingsJapgolly.swiper.swiperStrings.slide
import typingsJapgolly.swiper.swiperStrings.slidesEl
import typingsJapgolly.swiper.swiperStrings.vertical
import typingsJapgolly.swiper.swiperStrings.wrapper
import typingsJapgolly.swiper.typesModulesA11yMod.A11yOptions
import typingsJapgolly.swiper.typesModulesAutoplayMod.AutoplayOptions
import typingsJapgolly.swiper.typesModulesControllerMod.ControllerOptions
import typingsJapgolly.swiper.typesModulesEffectCardsMod.CardsEffectOptions
import typingsJapgolly.swiper.typesModulesEffectCoverflowMod.CoverflowEffectOptions
import typingsJapgolly.swiper.typesModulesEffectCreativeMod.CreativeEffectOptions
import typingsJapgolly.swiper.typesModulesEffectCubeMod.CubeEffectOptions
import typingsJapgolly.swiper.typesModulesEffectFadeMod.FadeEffectOptions
import typingsJapgolly.swiper.typesModulesEffectFlipMod.FlipEffectOptions
import typingsJapgolly.swiper.typesModulesFreeModeMod.FreeModeOptions
import typingsJapgolly.swiper.typesModulesGridMod.GridOptions
import typingsJapgolly.swiper.typesModulesHashNavigationMod.HashNavigationOptions
import typingsJapgolly.swiper.typesModulesHistoryMod.HistoryOptions
import typingsJapgolly.swiper.typesModulesKeyboardMod.KeyboardOptions
import typingsJapgolly.swiper.typesModulesLazyMod.LazyOptions
import typingsJapgolly.swiper.typesModulesMousewheelMod.MousewheelOptions
import typingsJapgolly.swiper.typesModulesNavigationMod.NavigationOptions
import typingsJapgolly.swiper.typesModulesPaginationMod.PaginationOptions
import typingsJapgolly.swiper.typesModulesParallaxMod.ParallaxOptions
import typingsJapgolly.swiper.typesModulesScrollbarMod.ScrollbarOptions
import typingsJapgolly.swiper.typesModulesThumbsMod.ThumbsOptions
import typingsJapgolly.swiper.typesModulesVirtualMod.VirtualOptions
import typingsJapgolly.swiper.typesModulesZoomMod.ZoomOptions
import typingsJapgolly.swiper.typesSharedMod.CSSSelector
import typingsJapgolly.swiper.typesSwiperOptionsMod.SwiperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularAngularSrcSwiperDotcomponentMod {
  
  @JSImport("swiper/angular/angular/src/swiper.component", "SwiperComponent")
  @js.native
  open class SwiperComponent protected ()
    extends StObject
       with OnInit {
    def this(
      _ngZone: NgZone,
      elementRef: ElementRef[Any],
      _changeDetectorRef: ChangeDetectorRef,
      _platformId: js.Object
    ) = this()
    
    val _activeSlides: Subject[js.Array[SwiperSlideDirective]] = js.native
    
    /* private */ var _changeDetectorRef: Any = js.native
    
    /* private */ var _navigation: Any = js.native
    
    var _nextElRef: ElementRef[Any] = js.native
    
    /* private */ var _ngZone: Any = js.native
    
    /* private */ var _pagination: Any = js.native
    
    var _paginationElRef: ElementRef[Any] = js.native
    
    /* private */ var _platformId: Any = js.native
    
    var _prevElRef: ElementRef[Any] = js.native
    
    /* private */ var _scrollbar: Any = js.native
    
    var _scrollbarElRef: ElementRef[Any] = js.native
    
    /* private */ var _setElement: Any = js.native
    
    /* private */ var _virtual: Any = js.native
    
    var a11y: js.UndefOr[A11yOptions] = js.native
    
    def activeSlides: Observable_[js.Array[SwiperSlideDirective]] = js.native
    
    var allowSlideNext: js.UndefOr[Boolean] = js.native
    
    var allowSlidePrev: js.UndefOr[Boolean] = js.native
    
    var allowTouchMove: js.UndefOr[Boolean] = js.native
    
    var appendSlides: Observable_[js.Array[SwiperSlideDirective]] = js.native
    
    var autoHeight: js.UndefOr[Boolean] = js.native
    
    var autoplay: js.UndefOr[AutoplayOptions | Boolean] = js.native
    
    var breakpoints: js.UndefOr[StringDictionary[SwiperOptions] & NumberDictionary[SwiperOptions]] = js.native
    
    def calcLoopedSlides(): Double | Boolean = js.native
    
    var cardsEffect: js.UndefOr[CardsEffectOptions] = js.native
    
    var centerInsufficientSlides: js.UndefOr[Boolean] = js.native
    
    var centeredSlides: js.UndefOr[Boolean] = js.native
    
    var centeredSlidesBounds: js.UndefOr[Boolean] = js.native
    
    /* private */ var childrenSlidesInit: Any = js.native
    
    var `class`: String = js.native
    
    def config_=(`val`: SwiperOptions): Unit = js.native
    
    var containerClasses: String = js.native
    
    var containerModifierClass: js.UndefOr[String] = js.native
    
    var controller: js.UndefOr[ControllerOptions] = js.native
    
    var coverflowEffect: js.UndefOr[CoverflowEffectOptions] = js.native
    
    var creativeEffect: js.UndefOr[CreativeEffectOptions] = js.native
    
    var cssMode: js.UndefOr[Boolean] = js.native
    
    var cubeEffect: js.UndefOr[CubeEffectOptions] = js.native
    
    var currentVirtualData: Any = js.native
    
    var direction: js.UndefOr[horizontal | vertical] = js.native
    
    var edgeSwipeDetection: Boolean | String = js.native
    
    var edgeSwipeThreshold: Double = js.native
    
    var effect: js.UndefOr[slide | fade | cube | coverflow | flip | creative | cards] = js.native
    
    /* private */ var elementRef: Any = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var fadeEffect: js.UndefOr[FadeEffectOptions] = js.native
    
    var flipEffect: js.UndefOr[FlipEffectOptions] = js.native
    
    var focusableElements: js.UndefOr[String] = js.native
    
    var followFinger: js.UndefOr[Boolean] = js.native
    
    var freeMode: js.UndefOr[FreeModeOptions | Boolean] = js.native
    
    var grabCursor: js.UndefOr[Boolean] = js.native
    
    var grid: js.UndefOr[GridOptions] = js.native
    
    var hashNavigation: js.UndefOr[HashNavigationOptions | Boolean] = js.native
    
    var height: js.UndefOr[Double | Null] = js.native
    
    var history: js.UndefOr[HistoryOptions | Boolean] = js.native
    
    var id: String = js.native
    
    def initSwiper(): Unit = js.native
    
    var initialSlide: js.UndefOr[Double] = js.native
    
    def isSwiperActive: Boolean = js.native
    
    var keyboard: js.UndefOr[KeyboardOptions | Boolean] = js.native
    
    var `lazy`: js.UndefOr[LazyOptions | Boolean] = js.native
    
    var longSwipes: js.UndefOr[Boolean] = js.native
    
    var longSwipesMs: js.UndefOr[Double] = js.native
    
    var longSwipesRatio: js.UndefOr[Double] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var loopAdditionalSlides: js.UndefOr[Double] = js.native
    
    var loopFillGroupWithBlank: js.UndefOr[Boolean] = js.native
    
    var loopPreventsSlide: js.UndefOr[Boolean] = js.native
    
    var loopedSlides: js.UndefOr[Double | Null] = js.native
    
    var loopedSlidesLimit: js.UndefOr[Boolean] = js.native
    
    var maxBackfaceHiddenSlides: js.UndefOr[Double] = js.native
    
    var mousewheel: js.UndefOr[MousewheelOptions | Boolean] = js.native
    
    def navigation: Boolean | _empty | NavigationOptions = js.native
    def navigation_=(`val`: Boolean | _empty | NavigationOptions): Unit = js.native
    
    var nested: js.UndefOr[Boolean] = js.native
    
    def nextElRef_=(el: ElementRef[Any]): Unit = js.native
    
    def ngAfterViewInit(): Unit = js.native
    
    def ngOnChanges(changedParams: SimpleChanges): Unit = js.native
    
    def ngOnDestroy(): Unit = js.native
    
    /**
      * A callback method that is invoked immediately after the
      * default change detector has checked the directive's
      * data-bound properties for the first time,
      * and before any of the view or content children have been checked.
      * It is invoked only once when the directive is instantiated.
      */
    /* CompleteClass */
    override def ngOnInit(): Unit = js.native
    
    var noSwiping: js.UndefOr[Boolean] = js.native
    
    var noSwipingClass: js.UndefOr[String] = js.native
    
    var noSwipingSelector: js.UndefOr[String] = js.native
    
    var normalizeSlideIndex: js.UndefOr[Boolean] = js.native
    
    var observeParents: js.UndefOr[Boolean] = js.native
    
    var observeSlideChildren: js.UndefOr[Boolean] = js.native
    
    var on: js.UndefOr[eventinkeyofSwiperEventsS] = js.native
    
    def pagination: Boolean | _empty | PaginationOptions = js.native
    
    def paginationElRef_=(el: ElementRef[Any]): Unit = js.native
    
    def pagination_=(`val`: Boolean | _empty | PaginationOptions): Unit = js.native
    
    var parallax: js.UndefOr[ParallaxOptions | Boolean] = js.native
    
    var passiveListeners: js.UndefOr[Boolean] = js.native
    
    var preloadImages: js.UndefOr[Boolean] = js.native
    
    var prependSlides: Observable_[js.Array[SwiperSlideDirective]] = js.native
    
    def prevElRef_=(el: ElementRef[Any]): Unit = js.native
    
    var preventClicks: js.UndefOr[Boolean] = js.native
    
    var preventClicksPropagation: js.UndefOr[Boolean] = js.native
    
    var preventInteractionOnTransition: js.UndefOr[Boolean] = js.native
    
    var resistance: js.UndefOr[Boolean] = js.native
    
    var resistanceRatio: js.UndefOr[Double] = js.native
    
    var resizeObserver: js.UndefOr[Boolean] = js.native
    
    var rewind: js.UndefOr[Boolean] = js.native
    
    var roundLengths: js.UndefOr[Boolean] = js.native
    
    var runCallbacksOnInit: js.UndefOr[Boolean] = js.native
    
    var s__beforeBreakpoint: EventEmitter[js.Tuple2[/* swiper */ default, /* breakpointParams */ SwiperOptions]] = js.native
    
    var s__containerClasses: EventEmitter[js.Tuple2[/* swiper */ default, /* classNames */ String]] = js.native
    
    var s__slideClass: EventEmitter[
        js.Tuple3[/* swiper */ default, /* slideEl */ HTMLElement, /* classNames */ String]
      ] = js.native
    
    var s__swiper: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_activeIndexChange: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_afterInit: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_autoplay: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_autoplayPause: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_autoplayResume: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_autoplayStart: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_autoplayStop: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_beforeDestroy: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_beforeInit: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_beforeLoopFix: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_beforeResize: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_beforeSlideChangeStart: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_beforeTransitionStart: EventEmitter[js.Tuple3[/* swiper */ default, /* speed */ Double, /* internal */ Any]] = js.native
    
    var s_breakpoint: EventEmitter[js.Tuple2[/* swiper */ default, /* breakpointParams */ SwiperOptions]] = js.native
    
    var s_changeDirection: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_click: EventEmitter[
        js.Tuple2[/* swiper */ default, /* event */ PointerEvent | MouseEvent | TouchEvent]
      ] = js.native
    
    var s_destroy: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_doubleClick: EventEmitter[
        js.Tuple2[/* swiper */ default, /* event */ PointerEvent | MouseEvent | TouchEvent]
      ] = js.native
    
    var s_doubleTap: EventEmitter[
        js.Tuple2[/* swiper */ default, /* event */ PointerEvent | MouseEvent | TouchEvent]
      ] = js.native
    
    var s_fromEdge: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_hashChange: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_hashSet: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_imagesReady: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_init: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_keyPress: EventEmitter[js.Tuple2[/* swiper */ default, /* keyCode */ String]] = js.native
    
    var s_lazyImageLoad: EventEmitter[
        js.Tuple3[/* swiper */ default, /* slideEl */ HTMLElement, /* imageEl */ HTMLElement]
      ] = js.native
    
    var s_lazyImageReady: EventEmitter[
        js.Tuple3[/* swiper */ default, /* slideEl */ HTMLElement, /* imageEl */ HTMLElement]
      ] = js.native
    
    var s_lock: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_loopFix: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_momentumBounce: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_navigationHide: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_navigationNext: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_navigationPrev: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_navigationShow: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_observerUpdate: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_orientationchange: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_paginationHide: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_paginationRender: EventEmitter[js.Tuple2[/* swiper */ default, /* paginationEl */ HTMLElement]] = js.native
    
    var s_paginationShow: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_paginationUpdate: EventEmitter[js.Tuple2[/* swiper */ default, /* paginationEl */ HTMLElement]] = js.native
    
    var s_progress: EventEmitter[js.Tuple2[/* swiper */ default, /* progress */ Double]] = js.native
    
    var s_reachBeginning: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_reachEnd: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_realIndexChange: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_resize: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_scroll: EventEmitter[js.Tuple2[/* swiper */ default, /* event */ WheelEvent]] = js.native
    
    var s_scrollbarDragEnd: EventEmitter[
        js.Tuple2[/* swiper */ default, /* event */ PointerEvent | MouseEvent | TouchEvent]
      ] = js.native
    
    var s_scrollbarDragMove: EventEmitter[
        js.Tuple2[/* swiper */ default, /* event */ PointerEvent | MouseEvent | TouchEvent]
      ] = js.native
    
    var s_scrollbarDragStart: EventEmitter[
        js.Tuple2[/* swiper */ default, /* event */ PointerEvent | MouseEvent | TouchEvent]
      ] = js.native
    
    var s_setTransition: EventEmitter[js.Tuple2[/* swiper */ default, /* transition */ Double]] = js.native
    
    var s_setTranslate: EventEmitter[js.Tuple2[/* swiper */ default, /* translate */ Double]] = js.native
    
    var s_slideChange: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_slideChangeTransitionEnd: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_slideChangeTransitionStart: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_slideNextTransitionEnd: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_slideNextTransitionStart: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_slidePrevTransitionEnd: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_slidePrevTransitionStart: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_slideResetTransitionEnd: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_slideResetTransitionStart: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_sliderFirstMove: EventEmitter[js.Tuple2[/* swiper */ default, /* event */ TouchEvent]] = js.native
    
    var s_sliderMove: EventEmitter[
        js.Tuple2[/* swiper */ default, /* event */ PointerEvent | MouseEvent | TouchEvent]
      ] = js.native
    
    var s_slidesGridLengthChange: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_slidesLengthChange: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_snapGridLengthChange: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_snapIndexChange: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_swiper: EventEmitter[Any] = js.native
    
    var s_tap: EventEmitter[
        js.Tuple2[/* swiper */ default, /* event */ PointerEvent | MouseEvent | TouchEvent]
      ] = js.native
    
    var s_toEdge: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_touchEnd: EventEmitter[
        js.Tuple2[/* swiper */ default, /* event */ PointerEvent | MouseEvent | TouchEvent]
      ] = js.native
    
    var s_touchMove: EventEmitter[
        js.Tuple2[/* swiper */ default, /* event */ PointerEvent | MouseEvent | TouchEvent]
      ] = js.native
    
    var s_touchMoveOpposite: EventEmitter[
        js.Tuple2[/* swiper */ default, /* event */ PointerEvent | MouseEvent | TouchEvent]
      ] = js.native
    
    var s_touchStart: EventEmitter[
        js.Tuple2[/* swiper */ default, /* event */ PointerEvent | MouseEvent | TouchEvent]
      ] = js.native
    
    var s_transitionEnd: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_transitionStart: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_unlock: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_update: EventEmitter[js.Array[/* swiper */ default]] = js.native
    
    var s_zoomChange: EventEmitter[
        js.Tuple4[
          /* swiper */ default, 
          /* scale */ Double, 
          /* imageEl */ HTMLElement, 
          /* slideEl */ HTMLElement
        ]
      ] = js.native
    
    def scrollbar: Boolean | _empty | ScrollbarOptions = js.native
    
    def scrollbarElRef_=(el: ElementRef[Any]): Unit = js.native
    
    def scrollbar_=(`val`: Boolean | _empty | ScrollbarOptions): Unit = js.native
    
    var setWrapperSize: js.UndefOr[Boolean] = js.native
    
    var shortSwipes: js.UndefOr[Boolean] = js.native
    
    var showNavigation: Boolean = js.native
    
    var showPagination: Boolean = js.native
    
    var showScrollbar: Boolean = js.native
    
    var simulateTouch: js.UndefOr[Boolean] = js.native
    
    var slideActiveClass: js.UndefOr[String] = js.native
    
    var slideBlankClass: js.UndefOr[String] = js.native
    
    var slideClass: js.UndefOr[String] = js.native
    
    var slideDuplicateActiveClass: js.UndefOr[String] = js.native
    
    var slideDuplicateClass: js.UndefOr[String] = js.native
    
    var slideDuplicateNextClass: js.UndefOr[String] = js.native
    
    var slideDuplicatePrevClass: js.UndefOr[String] = js.native
    
    var slideNextClass: js.UndefOr[String] = js.native
    
    var slidePrevClass: js.UndefOr[String] = js.native
    
    var slideToClickedSlide: js.UndefOr[Boolean] = js.native
    
    var slideVisibleClass: js.UndefOr[String] = js.native
    
    /* private */ var slides: Any = js.native
    
    /* private */ var slidesChanges: Any = js.native
    
    var slidesEl: QueryList[SwiperSlideDirective] = js.native
    
    var slidesOffsetAfter: js.UndefOr[Double] = js.native
    
    var slidesOffsetBefore: js.UndefOr[Double] = js.native
    
    var slidesPerGroup: js.UndefOr[Double] = js.native
    
    var slidesPerGroupSkip: js.UndefOr[Double] = js.native
    
    var slidesPerView: js.UndefOr[Double | auto] = js.native
    
    var spaceBetween: js.UndefOr[Double] = js.native
    
    var speed: js.UndefOr[Double] = js.native
    
    var style: Any = js.native
    
    var swipeHandler: js.UndefOr[CSSSelector | HTMLElement | Null] = js.native
    
    var swiperRef: default = js.native
    
    var threshold: js.UndefOr[Double] = js.native
    
    var thumbs: js.UndefOr[ThumbsOptions] = js.native
    
    var touchAngle: js.UndefOr[Double] = js.native
    
    var touchEventsTarget: js.UndefOr[container | wrapper] = js.native
    
    var touchMoveStopPropagation: js.UndefOr[Boolean] = js.native
    
    var touchRatio: js.UndefOr[Double] = js.native
    
    var touchReleaseOnEdges: js.UndefOr[Boolean] = js.native
    
    var touchStartForcePreventDefault: js.UndefOr[Boolean] = js.native
    
    var touchStartPreventDefault: js.UndefOr[Boolean] = js.native
    
    var uniqueNavElements: js.UndefOr[Boolean] = js.native
    
    def updateInitSwiper(changedParams: Any): Unit = js.native
    
    var updateOnImagesReady: js.UndefOr[Boolean] = js.native
    
    var updateOnWindowResize: js.UndefOr[Boolean] = js.native
    
    def updateParameter(key: String, value: Any): Unit = js.native
    
    def updateSwiper(changedParams: Any): Unit = js.native
    def updateSwiper(changedParams: SimpleChanges): Unit = js.native
    
    /* private */ var updateVirtualSlides: Any = js.native
    
    var url: js.UndefOr[String | Null] = js.native
    
    var userAgent: js.UndefOr[String | Null] = js.native
    
    def virtual: Boolean | _empty | VirtualOptions = js.native
    
    var virtualTranslate: js.UndefOr[Boolean] = js.native
    
    def virtual_=(`val`: Boolean | _empty | VirtualOptions): Unit = js.native
    
    var watchOverflow: js.UndefOr[Boolean] = js.native
    
    var watchSlidesProgress: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double | Null] = js.native
    
    var wrapperClass: js.UndefOr[String] = js.native
    
    var zoom: js.UndefOr[ZoomOptions | Boolean] = js.native
    
    def zoomContainerClass: String = js.native
  }
  /* static members */
  object SwiperComponent {
    
    @JSImport("swiper/angular/angular/src/swiper.component", "SwiperComponent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("swiper/angular/angular/src/swiper.component", "SwiperComponent.\u0275cmp")
    @js.native
    def ɵcmp: ɵɵComponentDeclaration[
        SwiperComponent, 
        `swiperComma [swiper]`, 
        scala.Nothing, 
        A11y, 
        SactiveIndexChange, 
        js.Array[slidesEl], 
        js.Tuple4[
          `[slotEqualssigncontainer-start]`, 
          `[slotEqualssignwrapper-start]`, 
          `[slotEqualssignwrapper-end]`, 
          `[slotEqualssigncontainer-end]`
        ], 
        `false`
      ] = js.native
    inline def ɵcmp_=(
      x: ɵɵComponentDeclaration[
          SwiperComponent, 
          `swiperComma [swiper]`, 
          scala.Nothing, 
          A11y, 
          SactiveIndexChange, 
          js.Array[slidesEl], 
          js.Tuple4[
            `[slotEqualssigncontainer-start]`, 
            `[slotEqualssignwrapper-start]`, 
            `[slotEqualssignwrapper-end]`, 
            `[slotEqualssigncontainer-end]`
          ], 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
    
    @JSImport("swiper/angular/angular/src/swiper.component", "SwiperComponent.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[SwiperComponent, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[SwiperComponent, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}
