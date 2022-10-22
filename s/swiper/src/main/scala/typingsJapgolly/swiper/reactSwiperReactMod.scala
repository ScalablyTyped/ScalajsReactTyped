package typingsJapgolly.swiper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.react.mod.VoidFunctionComponent
import typingsJapgolly.react.mod.WheelEventHandler
import typingsJapgolly.swiper.anon.ClassNames
import typingsJapgolly.swiper.anon.eventinkeyofSwiperEventsSActiveIndexChange
import typingsJapgolly.swiper.swiperStrings.`additions removals`
import typingsJapgolly.swiper.swiperStrings.`additions text`
import typingsJapgolly.swiper.swiperStrings.`inline`
import typingsJapgolly.swiper.swiperStrings.`removals additions`
import typingsJapgolly.swiper.swiperStrings.`removals text`
import typingsJapgolly.swiper.swiperStrings.`text additions`
import typingsJapgolly.swiper.swiperStrings.`text removals`
import typingsJapgolly.swiper.swiperStrings.additions
import typingsJapgolly.swiper.swiperStrings.all
import typingsJapgolly.swiper.swiperStrings.ascending
import typingsJapgolly.swiper.swiperStrings.assertive
import typingsJapgolly.swiper.swiperStrings.auto
import typingsJapgolly.swiper.swiperStrings.both
import typingsJapgolly.swiper.swiperStrings.cards
import typingsJapgolly.swiper.swiperStrings.container
import typingsJapgolly.swiper.swiperStrings.copy
import typingsJapgolly.swiper.swiperStrings.coverflow
import typingsJapgolly.swiper.swiperStrings.creative
import typingsJapgolly.swiper.swiperStrings.cube
import typingsJapgolly.swiper.swiperStrings.date
import typingsJapgolly.swiper.swiperStrings.decimal
import typingsJapgolly.swiper.swiperStrings.descending
import typingsJapgolly.swiper.swiperStrings.dialog
import typingsJapgolly.swiper.swiperStrings.email
import typingsJapgolly.swiper.swiperStrings.execute
import typingsJapgolly.swiper.swiperStrings.fade
import typingsJapgolly.swiper.swiperStrings.flip
import typingsJapgolly.swiper.swiperStrings.grammar
import typingsJapgolly.swiper.swiperStrings.grid
import typingsJapgolly.swiper.swiperStrings.horizontal
import typingsJapgolly.swiper.swiperStrings.inherit
import typingsJapgolly.swiper.swiperStrings.link
import typingsJapgolly.swiper.swiperStrings.list
import typingsJapgolly.swiper.swiperStrings.listbox
import typingsJapgolly.swiper.swiperStrings.location
import typingsJapgolly.swiper.swiperStrings.menu
import typingsJapgolly.swiper.swiperStrings.mixed
import typingsJapgolly.swiper.swiperStrings.move
import typingsJapgolly.swiper.swiperStrings.no
import typingsJapgolly.swiper.swiperStrings.none
import typingsJapgolly.swiper.swiperStrings.numeric
import typingsJapgolly.swiper.swiperStrings.off
import typingsJapgolly.swiper.swiperStrings.on
import typingsJapgolly.swiper.swiperStrings.other
import typingsJapgolly.swiper.swiperStrings.page
import typingsJapgolly.swiper.swiperStrings.polite
import typingsJapgolly.swiper.swiperStrings.popup
import typingsJapgolly.swiper.swiperStrings.removals
import typingsJapgolly.swiper.swiperStrings.search
import typingsJapgolly.swiper.swiperStrings.slide
import typingsJapgolly.swiper.swiperStrings.spelling
import typingsJapgolly.swiper.swiperStrings.step
import typingsJapgolly.swiper.swiperStrings.tel
import typingsJapgolly.swiper.swiperStrings.text
import typingsJapgolly.swiper.swiperStrings.time
import typingsJapgolly.swiper.swiperStrings.tree
import typingsJapgolly.swiper.swiperStrings.url
import typingsJapgolly.swiper.swiperStrings.vertical
import typingsJapgolly.swiper.swiperStrings.wrapper
import typingsJapgolly.swiper.swiperStrings.yes
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
import typingsJapgolly.swiper.typesSharedMod.SwiperModule
import typingsJapgolly.swiper.typesSwiperOptionsMod.SwiperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactSwiperReactMod {
  
  @JSImport("swiper/react/swiper-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swiper/react/swiper-react", "Swiper")
  @js.native
  val Swiper: FunctionComponent[SwiperProps] = js.native
  
  @JSImport("swiper/react/swiper-react", "SwiperSlide")
  @js.native
  val SwiperSlide: VoidFunctionComponent[SwiperSlideProps] = js.native
  
  inline def useSwiper(): typingsJapgolly.swiper.typesMod.Swiper = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiper")().asInstanceOf[typingsJapgolly.swiper.typesMod.Swiper]
  
  inline def useSwiperSlide(): SlideData = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiperSlide")().asInstanceOf[SlideData]
  
  trait SlideData extends StObject {
    
    var isActive: Boolean
    
    var isDuplicate: Boolean
    
    var isNext: Boolean
    
    var isPrev: Boolean
    
    var isVisible: Boolean
  }
  object SlideData {
    
    inline def apply(isActive: Boolean, isDuplicate: Boolean, isNext: Boolean, isPrev: Boolean, isVisible: Boolean): SlideData = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isDuplicate = isDuplicate.asInstanceOf[js.Any], isNext = isNext.asInstanceOf[js.Any], isPrev = isPrev.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideData]
    }
    
    extension [Self <: SlideData](x: Self) {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsDuplicate(value: Boolean): Self = StObject.set(x, "isDuplicate", value.asInstanceOf[js.Any])
      
      inline def setIsNext(value: Boolean): Self = StObject.set(x, "isNext", value.asInstanceOf[js.Any])
      
      inline def setIsPrev(value: Boolean): Self = StObject.set(x, "isPrev", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent swiper.swiper/types.SwiperOptions */
  /* Inlined parent std.Omit<react.react.HTMLAttributes<std.HTMLElement>, 'onProgress' | 'onClick' | 'onTouchEnd' | 'onTouchMove' | 'onTouchStart' | 'onTransitionEnd' | 'onKeyPress' | 'onDoubleClick' | 'onScroll'> */
  trait SwiperProps extends StObject {
    
    /**
      * !INTERNAL: Event will fired right before breakpoint change
      */
    var _beforeBreakpoint: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* breakpointParams */ SwiperOptions, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * !INTERNAL: Event will fired after setting CSS classes on swiper container element
      */
    var _containerClasses: js.UndefOr[
        js.Function2[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* classNames */ String, Unit]
      ] = js.undefined
    
    /**
      * !INTERNAL When enabled will emit "_containerClasses" and "_slideClass" events
      */
    var _emitClasses: js.UndefOr[Boolean] = js.undefined
    
    /**
      * !INTERNAL: Event will be fired on free mode touch end (release) and there will no be momentum
      */
    var _freeModeNoMomentumRelease: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * !INTERNAL: Event will fired after setting CSS classes on swiper slide element
      */
    var _slideClass: js.UndefOr[
        js.Function3[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* slideEl */ HTMLElement, 
          /* classNames */ String, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * !INTERNAL: Event will fired after setting CSS classes on all swiper slides
      */
    var _slideClasses: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* slides */ js.Array[ClassNames], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * !INTERNAL: Event will fired as soon as swiper instance available (before init)
      */
    var _swiper: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Object with a11y parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   a11y: {
      *     prevSlideMessage: 'Previous slide',
      *     nextSlideMessage: 'Next slide',
      *   },
      * });
      * ```
      */
    var a11y: js.UndefOr[A11yOptions] = js.undefined
    
    var about: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    /**
      * Set to `false` to disable swiping to next slide direction (to right or bottom)
      *
      * @default true
      */
    var allowSlideNext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `false` to disable swiping to previous slide direction (to left or top)
      *
      * @default true
      */
    var allowSlidePrev: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, then the only way to switch the slide is use of external API functions like slidePrev or slideNext
      *
      * @default true
      */
    var allowTouchMove: js.UndefOr[Boolean] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    /**
      * Set to `true` and slider wrapper will adapt its height to the height of the currently active slide
      *
      * @default false
      */
    var autoHeight: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    /**
      * Object with autoplay parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *  autoplay: {
      *    delay: 5000,
      *  },
      *});
      * ```
      */
    var autoplay: js.UndefOr[AutoplayOptions | Boolean] = js.undefined
    
    /**
      * Allows to set different parameter for different responsive breakpoints (screen sizes). Not all parameters can be changed in breakpoints, only those which are not required different layout and logic, like `slidesPerView`, `slidesPerGroup`, `spaceBetween`, `grid.rows`. Such parameters like `loop` and `effect` won't work
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   // Default parameters
      *   slidesPerView: 1,
      *   spaceBetween: 10,
      *   // Responsive breakpoints
      *   breakpoints: {
      *     // when window width is >= 320px
      *     320: {
      *       slidesPerView: 2,
      *       spaceBetween: 20
      *     },
      *     // when window width is >= 480px
      *     480: {
      *       slidesPerView: 3,
      *       spaceBetween: 30
      *     },
      *     // when window width is >= 640px
      *     640: {
      *       slidesPerView: 4,
      *       spaceBetween: 40
      *     }
      *   }
      * })
      * ```
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   slidesPerView: 1,
      *   spaceBetween: 10,
      *   // using "ratio" endpoints
      *   breakpoints: {
      *     '@0.75': {
      *       slidesPerView: 2,
      *       spaceBetween: 20,
      *     },
      *     '@1.00': {
      *       slidesPerView: 3,
      *       spaceBetween: 40,
      *     },
      *     '@1.50': {
      *       slidesPerView: 4,
      *       spaceBetween: 50,
      *     },
      *   }
      * });
      * ```
      */
    var breakpoints: js.UndefOr[StringDictionary[SwiperOptions] & NumberDictionary[SwiperOptions]] = js.undefined
    
    /**
      * Base for breakpoints (beta). Can be `window` or `container`. If set to `window` (by default) then breakpoint keys mean window width. If set to `container` then breakpoint keys treated as swiper container width
      *
      * @default 'window'
      *
      * @note Currently in beta and not supported by Swiper Angular, React, Svelte and Vue components
      */
    var breakpointsBase: js.UndefOr[String] = js.undefined
    
    /**
      * Object with Cards-effect parameters
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   effect: 'cards',
      *   cardsEffect: {
      *     // ...
      *   },
      * });
      * ```
      */
    var cardsEffect: js.UndefOr[CardsEffectOptions] = js.undefined
    
    /**
      * When enabled it center slides if the amount of slides less than `slidesPerView`. Not intended to be used `loop` mode and `grid.rows`
      *
      * @default false
      */
    var centerInsufficientSlides: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, then active slide will be centered, not always on the left side.
      *
      * @default false
      */
    var centeredSlides: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, then active slide will be centered without adding gaps at the beginning and end of slider.
      * Required `centeredSlides: true`. Not intended to be used with `loop` or `pagination`
      *
      * @default false
      */
    var centeredSlidesBounds: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    // Namespace
    /**
      * The beginning of the modifier CSS class that can be added to swiper container depending on different parameters
      *
      * @default 'swiper-'
      */
    var containerModifierClass: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    /**
      * Object with controller parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   controller: {
      *     inverse: true,
      *   },
      * });
      * ```
      */
    var controller: js.UndefOr[ControllerOptions] = js.undefined
    
    /**
      * Object with Coverflow-effect parameters.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   effect: 'coverflow',
      *   coverflowEffect: {
      *     rotate: 30,
      *     slideShadows: false,
      *   },
      * });
      * ```
      */
    var coverflowEffect: js.UndefOr[CoverflowEffectOptions] = js.undefined
    
    /**
      * When enabled Swiper will automatically wrap slides with swiper-wrapper element,
      * and will create required elements for navigation, pagination and scrollbar
      * they are enabled (with their respective params object or with boolean `true`))
      *
      * @default false
      */
    var createElements: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object with Creative-effect parameters
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   effect: 'creative',
      *   creativeEffect: {
      *     prev: {
      *       // will set `translateZ(-400px)` on previous slides
      *       translate: [0, 0, -400],
      *     },
      *     next: {
      *       // will set `translateX(100%)` on next slides
      *       translate: ['100%', 0, 0],
      *     },
      *   },
      * });
      * ```
      */
    var creativeEffect: js.UndefOr[CreativeEffectOptions] = js.undefined
    
    /**
      * When enabled it will use modern CSS Scroll Snap API.
      * It doesn't support all of Swiper's features, but potentially should bring a much better performance in simple configurations.
      *
      * This is what is not supported when it is enabled:
      *
      * - Cube and Cards effects
      * - `speed` parameter may not have no effect
      * - All transition start/end related events (use `slideChange` instead)
      * - `slidesPerGroup` has limited support
      * - `simulateTouch` doesn't have effect and "dragging" with mouse doesn't work
      * - `resistance` doesn't have any effect
      * - `allowSlidePrev/Next`
      * - `swipeHandler`
      * - `freeMode` and all relevant features
      *
      * @default false
      */
    var cssMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object with Cube-effect parameters
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   effect: 'cube',
      *   cubeEffect: {
      *     slideShadows: false,
      *   },
      * });
      * ```
      */
    var cubeEffect: js.UndefOr[CubeEffectOptions] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * Can be `'horizontal'` or `'vertical'` (for vertical slider).
      *
      * @default 'horizontal'
      */
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * Enable to release Swiper events for swipe-back work in app. If set to `'prevent'` then it will prevent system swipe-back navigation instead
      *
      * @default false
      */
    var edgeSwipeDetection: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Area (in px) from left edge of the screen to release touch events for swipe-back in app
      *
      * @default 20
      */
    var edgeSwipeThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Transition effect. Can be `'slide'`, `'fade'`, `'cube'`, `'coverflow'`, `'flip'` or `'creative'`
      *
      * @default 'slide'
      */
    var effect: js.UndefOr[slide | fade | cube | coverflow | flip | creative | cards] = js.undefined
    
    /**
      * Whether Swiper initially enabled. When Swiper is disabled, it will hide all navigation elements and won't respond to any events and interactions
      *
      * @default true
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object with Fade-effect parameters
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   effect: 'fade',
      *   fadeEffect: {
      *     crossFade: true
      *   },
      * });
      * ```
      */
    var fadeEffect: js.UndefOr[FadeEffectOptions] = js.undefined
    
    /**
      * Object with Flip-effect parameters
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   effect: 'flip',
      *   flipEffect: {
      *     slideShadows: false,
      *   },
      * });
      * ```
      */
    var flipEffect: js.UndefOr[FlipEffectOptions] = js.undefined
    
    /**
      * CSS selector for focusable elements. Swiping will be disabled on such elements if they are "focused"
      *
      * @default 'input, select, option, textarea, button, video, label'
      */
    var focusableElements: js.UndefOr[String] = js.undefined
    
    /**
      * If disabled, then slider will be animated only when you release it, it will not move while you hold your finger on it
      *
      * @default true
      */
    var followFinger: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables free mode functionality. Object with free mode parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   freeMode: true,
      * });
      *
      * const swiper = new Swiper('.swiper', {
      *   freeMode: {
      *     enabled: true,
      *     sticky: true,
      *   },
      * });
      * ```
      */
    var freeMode: js.UndefOr[FreeModeOptions | Boolean] = js.undefined
    
    /**
      * This option may a little improve desktop usability. If `true`, user will see the "grab" cursor when hover on Swiper
      *
      * @default false
      */
    var grabCursor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object with grid parameters to enable "multirow" slider.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   grid: {
      *     rows: 2,
      *   },
      * });
      * ```
      */
    var grid: js.UndefOr[GridOptions] = js.undefined
    
    /**
      * Enables hash url navigation to for slides.
      * Object with hash navigation parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   hashNavigation: {
      *     replaceState: true,
      *   },
      * });
      * ```
      */
    var hashNavigation: js.UndefOr[HashNavigationOptions | Boolean] = js.undefined
    
    /**
      * Swiper height (in px). Parameter allows to force Swiper height.
      * Useful only if you initialize Swiper when it is hidden and in SSR and Test environments for correct Swiper initialization
      *
      * @default null
      *
      * @note Setting this parameter will make Swiper not responsive
      */
    var height: js.UndefOr[Double | Null] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables history push state where every slide will have its own url. In this parameter you have to specify main slides url like `"slides"` and specify every slide url using `data-history` attribute.
      *
      * Object with history navigation parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   history: {
      *     replaceState: true,
      *   },
      * });
      * ```
      *
      * @example
      * ```html
      * <!-- will produce "slides/slide1" url in browser history -->
      * <div class="swiper-slide" data-history="slide1"></div>
      * ```
      */
    var history: js.UndefOr[HistoryOptions | Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Whether Swiper should be initialised automatically when you create an instance.
      * If disabled, then you need to init it manually by calling `swiper.init()`
      *
      * @default true
      */
    var init: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Index number of initial slide.
      *
      * @default 0
      */
    var initialSlide: js.UndefOr[Double] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    /**
      * Enables navigation through slides using keyboard. Object with keyboard parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   keyboard: {
      *     enabled: true,
      *     onlyInViewport: false,
      *   },
      * });
      * ```
      */
    var keyboard: js.UndefOr[KeyboardOptions | Boolean] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    /**
      * Enables images lazy loading. Object with lazy loading parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   lazy: {
      *     loadPrevNext: true,
      *   },
      * });
      * ```
      */
    var `lazy`: js.UndefOr[LazyOptions | Boolean] = js.undefined
    
    /**
      * Set to `false` if you want to disable long swipes
      *
      * @default true
      */
    var longSwipes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Minimal duration (in ms) to trigger swipe to next/previous slide during long swipes
      *
      * @default 300
      */
    var longSwipesMs: js.UndefOr[Double] = js.undefined
    
    /**
      * Ratio to trigger swipe to next/previous slide during long swipes
      *
      * @default 0.5
      */
    var longSwipesRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Set to `true` to enable continuous loop mode
      *
      * Because of nature of how the loop mode works, it will add duplicated slides. Such duplicated slides will have additional classes:
      * - `swiper-slide-duplicate` - represents duplicated slide
      * - `swiper-slide-duplicate-active` - represents slide duplicated to the currently active slide
      * - `swiper-slide-duplicate-next` - represents slide duplicated to the slide next to active
      * - `swiper-slide-duplicate-prev` - represents slide duplicated to the slide previous to active
      *
      * @default false
      *
      * @note If you use it along with `slidesPerView: 'auto'` then you need to specify `loopedSlides` parameter with amount of slides to loop (duplicate). Should not be used together with `rewind` mode
      */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Addition number of slides that will be cloned after creating of loop
      *
      * @default 0
      */
    var loopAdditionalSlides: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable and loop mode will fill groups with insufficient number of slides with blank slides. Good to be used with `slidesPerGroup` parameter
      *
      * @default false
      */
    var loopFillGroupWithBlank: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled it prevents Swiper slide prev/next transitions when transitions is already in progress (has effect when `loop` enabled)
      *
      * @default true
      */
    var loopPreventsSlide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you use `slidesPerView:'auto'` with loop mode you should tell to Swiper how many slides it should loop (duplicate) using this parameter
      *
      * @default null
      */
    var loopedSlides: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * When enabled then amount of duplicated slides will not exceed amount of original slides. Useful to disable and increase `loopedSlides` when you have a lot of slides per view and not sufficient amount of original slides
      *
      * @default true
      */
    var loopedSlidesLimit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If total number of slides less than specified here value, then Swiper will enable `backface-visibility: hidden` on slide elements to reduce visual "flicker" in Safari.
      *
      * @note It is not recommended to enable it on large amount of slides as it will reduce performance
      *
      * @default 10
      */
    var maxBackfaceHiddenSlides: js.UndefOr[Double] = js.undefined
    
    /**
      * Array with Swiper modules
      *
      * @example
      * ```js
      * import Swiper, { Navigation, Pagination } from 'swiper';
      *
      * const swiper = new Swiper('.swiper', {
      *    modules: [ Navigation, Pagination ],
      *  });
      * ```
      */
    var modules: js.UndefOr[js.Array[SwiperModule]] = js.undefined
    
    /**
      * Enables navigation through slides using mouse wheel. Object with mousewheel parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   mousewheel: {
      *     invert: true,
      *   },
      * });
      * ```
      */
    var mousewheel: js.UndefOr[MousewheelOptions | Boolean] = js.undefined
    
    /**
      * Object with navigation parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   navigation: {
      *     nextEl: '.swiper-button-next',
      *     prevEl: '.swiper-button-prev',
      *   },
      * });
      * ```
      */
    var navigation: js.UndefOr[NavigationOptions | Boolean] = js.undefined
    
    /**
      * Set to `true` on  Swiper for correct touch events interception. Use only on
      * swipers that use same direction as the parent one
      *
      * @default false
      */
    var nested: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable/disable swiping on elements matched to class specified in `noSwipingClass`
      *
      * @default true
      */
    var noSwiping: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify `noSwiping`'s element css class
      *
      * @default 'swiper-no-swiping'
      */
    var noSwipingClass: js.UndefOr[String] = js.undefined
    
    /**
      * Can be used instead of `noSwipingClass` to specify elements to disable swiping on.
      * For example `'input'` will disable swiping on all inputs
      *
      * @default
      */
    var noSwipingSelector: js.UndefOr[String] = js.undefined
    
    /**
      * Normalize slide index.
      *
      * @default true
      */
    var normalizeSlideIndex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` if you also need to watch Mutations for Swiper parent elements
      *
      * @default false
      */
    var observeParents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` if you also need to watch Mutations for Swiper slide children elements
      *
      * @default false
      */
    var observeSlideChildren: js.UndefOr[Boolean] = js.undefined
    
    // Observer
    /**
      * Set to `true` to enable Mutation Observer on Swiper and its elements. In this case Swiper will be updated (reinitialized) each time if you change its style (like hide/show) or modify its child elements (like adding/removing slides)
      *
      * @default false
      */
    var observer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Register event handlers
      */
    var on: js.UndefOr[eventinkeyofSwiperEventsSActiveIndexChange] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will fired on active index change
      */
    var onActiveIndexChange: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired right after initialization
      */
    var onAfterInit: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Add event listener that will be fired on all events
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *    onAny(eventName, ...args) {
      *      console.log('Event: ', eventName);
      *      console.log('Event data: ', args);
      *    }
      *  });
      * ```
      */
    var onAny: js.UndefOr[
        js.Function1[/* handler */ js.Function2[/* eventName */ String, /* repeated */ Any, Unit], Unit]
      ] = js.undefined
    
    /**
      * Event will be fired when slide changed with autoplay
      */
    var onAutoplay: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on autoplay pause (on mouse/pointer enter), when `pauseOnMouseEnter` enabled
      */
    var onAutoplayPause: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on autoplay resume (on mouse/pointer leave), when `pauseOnMouseEnter` enabled
      */
    var onAutoplayResume: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired in when autoplay started
      */
    var onAutoplayStart: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when autoplay stopped
      */
    var onAutoplayStop: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired right before Swiper destroyed
      */
    var onBeforeDestroy: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired right before initialization
      */
    var onBeforeInit: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired right before "loop fix"
      */
    var onBeforeLoopFix: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired before resize handler
      */
    var onBeforeResize: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired before slide change transition start
      */
    var onBeforeSlideChangeStart: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired before transition start
      */
    var onBeforeTransitionStart: js.UndefOr[
        js.Function3[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* speed */ Double, 
          /* internal */ Any, 
          Unit
        ]
      ] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired on breakpoint change
      */
    var onBreakpoint: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* breakpointParams */ SwiperOptions, 
          Unit
        ]
      ] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
    
    // what is internal?
    /**
      * Event will fired on direction change
      */
    var onChangeDirection: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when user click/tap on Swiper. Receives `touchend` event as an arguments.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired on swiper destroy
      */
    var onDestroy: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when user double click/tap on Swiper
      */
    var onDoubleClick: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when user double tap on Swiper's container. Receives `touchend` event as an arguments
      */
    var onDoubleTap: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired when Swiper goes from beginning or end position
      */
    var onFromEdge: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on window hash change
      */
    var onHashChange: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when swiper updates the hash
      */
    var onHashSet: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired right after all inner images are loaded. updateOnImagesReady should be also enabled
      */
    var onImagesReady: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
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
    var onInit: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Any]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired on key press
      */
    var onKeyPress: js.UndefOr[
        js.Function2[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* keyCode */ String, Unit]
      ] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired in the beginning of lazy loading of image
      */
    var onLazyImageLoad: js.UndefOr[
        js.Function3[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* slideEl */ HTMLElement, 
          /* imageEl */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when lazy loading image will be loaded
      */
    var onLazyImageReady: js.UndefOr[
        js.Function3[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* slideEl */ HTMLElement, 
          /* imageEl */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired when swiper is locked (when `watchOverflow` enabled)
      */
    var onLock: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired after "loop fix"
      */
    var onLoopFix: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on momentum bounce
      */
    var onMomentumBounce: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired on navigation hide
      */
    var onNavigationHide: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on navigation next button click
      */
    var onNavigationNext: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on navigation prev button click
      */
    var onNavigationPrev: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on navigation show
      */
    var onNavigationShow: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired if observer is enabled and it detects DOM mutations
      */
    var onObserverUpdate: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on orientation change (e.g. landscape -> portrait)
      */
    var onOrientationchange: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on pagination hide
      */
    var onPaginationHide: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired after pagination rendered
      */
    var onPaginationRender: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* paginationEl */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired on pagination show
      */
    var onPaginationShow: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when pagination updated
      */
    var onPaginationUpdate: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* paginationEl */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired when Swiper progress is changed, as an arguments it receives progress that is always from 0 to 1
      */
    var onProgress: js.UndefOr[
        js.Function2[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* progress */ Double, Unit]
      ] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired when Swiper reach its beginning (initial position)
      */
    var onReachBeginning: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when Swiper reach last slide
      */
    var onReachEnd: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired on real index change
      */
    var onRealIndexChange: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired on window resize right before swiper's onresize manipulation
      */
    var onResize: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on mousewheel scroll
      */
    var onScroll: js.UndefOr[
        js.Function2[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ WheelEvent, Unit]
      ] = js.undefined
    
    /**
      * Event will be fired on draggable scrollbar drag end
      */
    var onScrollbarDragEnd: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired on draggable scrollbar drag move
      */
    var onScrollbarDragMove: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired on draggable scrollbar drag start
      */
    var onScrollbarDragStart: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired everytime when swiper starts animation. Receives current transition duration (in ms) as an arguments
      */
    var onSetTransition: js.UndefOr[
        js.Function2[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* transition */ Double, Unit]
      ] = js.undefined
    
    /**
      * Event will be fired when swiper's wrapper change its position. Receives current translate value as an arguments
      */
    var onSetTranslate: js.UndefOr[
        js.Function2[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* translate */ Double, Unit]
      ] = js.undefined
    
    /**
      * Event will be fired when currently active slide is changed
      */
    var onSlideChange: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired after animation to other slide (next or previous).
      */
    var onSlideChangeTransitionEnd: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired in the beginning of animation to other slide (next or previous).
      */
    var onSlideChangeTransitionStart: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Same as "slideChangeTransitionEnd" but for "forward" direction only
      */
    var onSlideNextTransitionEnd: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Same as "slideChangeTransitionStart" but for "forward" direction only
      */
    var onSlideNextTransitionStart: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Same as "slideChangeTransitionEnd" but for "backward" direction only
      */
    var onSlidePrevTransitionEnd: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Same as "slideChangeTransitionStart" but for "backward" direction only
      */
    var onSlidePrevTransitionStart: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired in the end of animation of resetting slide to current one
      */
    var onSlideResetTransitionEnd: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired in the beginning of animation of resetting slide to current one
      */
    var onSlideResetTransitionStart: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired with first touch/drag move
      */
    var onSliderFirstMove: js.UndefOr[
        js.Function2[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ TouchEvent, Unit]
      ] = js.undefined
    
    /**
      * Event will be fired when user touch and move finger over Swiper and move it. Receives `touchmove` event as an arguments.
      */
    var onSliderMove: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when slides grid has changed
      */
    var onSlidesGridLengthChange: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when number of slides has changed
      */
    var onSlidesLengthChange: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when snap grid has changed
      */
    var onSnapGridLengthChange: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired on snap index change
      */
    var onSnapIndexChange: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Get Swiper instance
      */
    var onSwiper: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when user click/tap on Swiper. Receives `touchend` event as an arguments.
      */
    var onTap: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired when Swiper goes to beginning or end position
      */
    var onToEdge: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired when user release Swiper. Receives `touchend` event as an arguments.
      */
    var onTouchEnd: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when user touch and move finger over Swiper. Receives `touchmove` event as an arguments.
      */
    var onTouchMove: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when user touch and move finger over Swiper in direction opposite to direction parameter. Receives `touchmove` event as an arguments.
      */
    var onTouchMoveOpposite: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when user touch Swiper. Receives `touchstart` event as an arguments.
      */
    var onTouchStart: js.UndefOr[
        js.Function2[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired after transition.
      */
    var onTransitionEnd: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired in the beginning of transition.
      */
    var onTransitionStart: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when swiper is unlocked (when `watchOverflow` enabled)
      */
    var onUnlock: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired after swiper.update() call
      */
    var onUpdate: js.UndefOr[js.Function1[/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Event will be fired on zoom change
      */
    var onZoomChange: js.UndefOr[
        js.Function4[
          /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, 
          /* scale */ Double, 
          /* imageEl */ HTMLElement, 
          /* slideEl */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Object with pagination parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   pagination: {
      *     el: '.swiper-pagination',
      *     type: 'bullets',
      *   },
      * });
      * ```
      */
    var pagination: js.UndefOr[PaginationOptions | Boolean] = js.undefined
    
    /**
      * Object with parallax parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   parallax: true,
      * });
      * ```
      */
    var parallax: js.UndefOr[ParallaxOptions | Boolean] = js.undefined
    
    /**
      * Passive event listeners will be used by default where possible to improve scrolling performance on mobile devices.
      * But if you need to use `e.preventDefault` and you have conflict with it, then you should disable this parameter
      *
      * @default true
      */
    var passiveListeners: js.UndefOr[Boolean] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    // Images
    /**
      * When enabled Swiper will force to load all images
      *
      * @default true
      */
    var preloadImages: js.UndefOr[Boolean] = js.undefined
    
    // Clicks
    /**
      * Set to `true` to prevent accidental unwanted clicks on links during swiping
      *
      * @default true
      */
    var preventClicks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` to stop clicks event propagation on links during swiping
      *
      * @default true
      */
    var preventClicksPropagation: js.UndefOr[Boolean] = js.undefined
    
    // Swiping / No swiping
    /**
      * When enabled it won't allow to change slides by swiping or navigation/pagination buttons during transition
      *
      * @default false
      */
    var preventInteractionOnTransition: js.UndefOr[Boolean] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    // Touch Resistance
    /**
      * Set to `false` if you want to disable resistant bounds
      *
      * @default true
      */
    var resistance: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This option allows you to control resistance ratio
      *
      * @default 0.85
      */
    var resistanceRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * When enabled it will use ResizeObserver (if supported by browser) on swiper container to detect container resize (instead of watching for window resize)
      *
      * @default true
      */
    var resizeObserver: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    /**
      * Set to `true` to enable "rewind" mode. When enabled, clicking "next" navigation button (or calling `.slideNext()`) when on last slide will slide back to the first slide. Clicking "prev" navigation button (or calling `.slidePrev()`) when on first slide will slide forward to the last slide.
      *
      * @default false
      *
      * @note Should not be used together with `loop` mode
      */
    var rewind: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    /**
      * Set to `true` to round values of slides width and height to prevent blurry texts on usual
      * resolution screens (if you have such)
      *
      * @default false
      */
    var roundLengths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Fire Transition/SlideChange/Start/End events on swiper initialization.
      * Such events will be fired on initialization in case of your initialSlide is not 0, or you use loop mode
      *
      * @default true
      */
    var runCallbacksOnInit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object with scrollbar parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   scrollbar: {
      *     el: '.swiper-scrollbar',
      *     draggable: true,
      *   },
      * });
      * ```
      */
    var scrollbar: js.UndefOr[ScrollbarOptions | Boolean] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    /**
      * Enabled this option and plugin will set width/height on swiper wrapper equal to total size of all slides.
      * Mostly should be used as compatibility fallback option for browser that don't support flexbox layout well
      *
      * @default false
      */
    var setWrapperSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `false` if you want to disable short swipes
      *
      * @default true
      */
    var shortSwipes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, Swiper will accept mouse events like touch events (click and drag to change slides)
      *
      * @default true
      */
    var simulateTouch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name of currently active slide
      *
      * @default 'swiper-slide-active'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper Angular/React/Svelte/Vue components
      */
    var slideActiveClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of blank slide append to fill groups in loop mode when `loopFillGroupWithBlank` is also enabled
      *
      * @default 'swiper-slide-invisible-blank'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper Angular/React/Svelte/Vue
      */
    var slideBlankClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of slide
      *
      * @default 'swiper-slide'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper Angular/React/Svelte/Vue components
      */
    var slideClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of duplicated slide which represents the currently active slide
      *
      * @default 'swiper-slide-duplicate-active'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper Angular/React/Svelte/Vue components
      */
    var slideDuplicateActiveClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of slide duplicated by loop mode
      *
      * @default 'swiper-slide-duplicate'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper Angular/React/Svelte/Vue
      */
    var slideDuplicateClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of duplicated slide which represents the slide next to active slide
      *
      * @default 'swiper-slide-duplicate-next'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper Angular/React/Svelte/Vue
      */
    var slideDuplicateNextClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of duplicated slide which represents the slide previous to active slide
      *
      * @default 'swiper-slide-duplicate-prev'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper Angular/React/Svelte/Vue
      */
    var slideDuplicatePrevClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of slide which is right after currently active slide
      *
      * @default 'swiper-slide-next'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper Angular/React/Svelte/Vue
      */
    var slideNextClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of slide which is right before currently active slide
      *
      * @default 'swiper-slide-prev'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper Angular/React/Svelte/Vue
      */
    var slidePrevClass: js.UndefOr[String] = js.undefined
    
    /**
      * Set to `true` and click on any slide will produce transition to this slide
      *
      * @default false
      */
    var slideToClickedSlide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name of currently visible slide
      *
      * @default 'swiper-slide-visible'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper Angular/React/Svelte/Vue
      */
    var slideVisibleClass: js.UndefOr[String] = js.undefined
    
    /**
      * Add (in px) additional slide offset in the end of the container (after all slides)
      *
      * @default 0
      */
    var slidesOffsetAfter: js.UndefOr[Double] = js.undefined
    
    /**
      * Add (in px) additional slide offset in the beginning of the container (before all slides)
      *
      * @default 0
      */
    var slidesOffsetBefore: js.UndefOr[Double] = js.undefined
    
    /**
      * Set numbers of slides to define and enable group sliding. Useful to use with slidesPerView > 1
      *
      * @default 1
      */
    var slidesPerGroup: js.UndefOr[Double] = js.undefined
    
    /**
      * This param intended to be used only with `slidesPerView: 'auto'` and `slidesPerGroup: 1`. When enabled, it will skip all slides in view on `.slideNext()` & `.slidePrev()` methods calls, on Navigation "buttons" clicks and in autoplay.
      *
      * @default false
      */
    var slidesPerGroupAuto: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The parameter works in the following way: If `slidesPerGroupSkip` equals `0` (default), no slides are excluded from grouping, and the resulting behaviour is the same as without this change.
      *
      * If `slidesPerGroupSkip` is equal or greater than `1` the first X slides are treated as single groups, whereas all following slides are grouped by the `slidesPerGroup` value.
      *
      * @default 0
      */
    var slidesPerGroupSkip: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of slides per view (slides visible at the same time on slider's container).
      * @note If you use it with "auto" value and along with `loop: true` then you need to specify `loopedSlides` parameter with amount of slides to loop (duplicate)
      * @note `slidesPerView: 'auto'` is currently not compatible with multirow mode, when `grid.rows` > 1
      *
      * @default 1
      */
    var slidesPerView: js.UndefOr[Double | auto] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    // Slides grid
    /**
      * Distance between slides in px.
      *
      * @default 0
      *
      * @note If you use "margin" css property to the elements which go into Swiper in which you pass "spaceBetween" into, navigation might not work properly.
      */
    var spaceBetween: js.UndefOr[Double] = js.undefined
    
    /**
      * Duration of transition between slides (in ms)
      *
      * @default 300
      */
    var speed: js.UndefOr[Double] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String with CSS selector or HTML element of the container with pagination that will work as only available handler for swiping
      *
      * @default null
      */
    var swipeHandler: js.UndefOr[CSSSelector | HTMLElement | Null] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Swiper container tag
      *
      * @default 'div'
      */
    var tag: js.UndefOr[String] = js.undefined
    
    /**
      * Threshold value in px. If "touch distance" will be lower than this value then swiper will not move
      *
      * @default 0
      */
    var threshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Object with thumbs component parameters
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   ...
      *   thumbs: {
      *     swiper: thumbsSwiper
      *   }
      * });
      * ```
      */
    var thumbs: js.UndefOr[ThumbsOptions] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Allowable angle (in degrees) to trigger touch move
      *
      * @default 45
      */
    var touchAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * Target element to listen touch events on. Can be `'container'` (to listen for touch events on swiper) or `'wrapper'`
      * (to listen for touch events on swiper-wrapper)
      *
      * @default 'wrapper'
      */
    var touchEventsTarget: js.UndefOr[container | wrapper] = js.undefined
    
    /**
      * If enabled, then propagation of "touchmove" will be stopped
      *
      * @default false
      */
    var touchMoveStopPropagation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Touch ratio
      *
      * @default 1
      */
    var touchRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable to release touch events on slider edge position (beginning, end) to allow for further page scrolling
      *
      * @default false
      */
    var touchReleaseOnEdges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Force to always prevent default for `touchstart` (`pointerdown`) event
      *
      * @default false
      */
    var touchStartForcePreventDefault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If disabled, `touchstart` (`pointerdown`) event won't be prevented
      *
      * @default true
      */
    var touchStartPreventDefault: js.UndefOr[Boolean] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    /**
      * If enabled (by default) and navigation elements' parameters passed as a string (like `".pagination"`)
      * then Swiper will look for such elements through child elements first.
      * Applies for pagination, prev/next buttons and scrollbar elements
      *
      * @default true
      */
    var uniqueNavElements: js.UndefOr[Boolean] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    /**
      * When enabled Swiper will be reinitialized after all inner images (<img> tags) are loaded. Required `preloadImages: true`
      *
      * @default true
      */
    var updateOnImagesReady: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Swiper will recalculate slides position on window resize (orientationchange)
      *
      * @default true
      */
    var updateOnWindowResize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Required for active slide detection when rendered on server-side and enabled history
      *
      * @default null
      */
    var url: js.UndefOr[String | Null] = js.undefined
    
    /**
      * userAgent string. Required for browser/device detection when rendered on server-side
      *
      * @default null
      */
    var userAgent: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Enables virtual slides functionality. Object with virtual slides parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   virtual: {
      *     slides: ['Slide 1', 'Slide 2', 'Slide 3', 'Slide 4', 'Slide 5'],
      *   },
      * });
      * ```
      */
    var virtual: js.UndefOr[VirtualOptions | Boolean] = js.undefined
    
    /**
      * Enabled this option and swiper will be operated as usual except it will not move, real translate values on wrapper will not be set.
      * Useful when you may need to create custom slide transition
      *
      * @default false
      */
    var virtualTranslate: js.UndefOr[Boolean] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
    /**
      * When enabled Swiper will be disabled and hide navigation buttons on
      * case there are not enough slides for sliding.
      *
      * @default true
      */
    var watchOverflow: js.UndefOr[Boolean] = js.undefined
    
    // Progress
    /**
      * Enable this feature to calculate each slides progress and visibility (slides in viewport will have additional visible class)
      *
      * @default false
      */
    var watchSlidesProgress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Swiper width (in px). Parameter allows to force Swiper width.
      * Useful only if you initialize Swiper when it is hidden and in SSR and Test environments for correct Swiper initialization
      *
      * @default null
      *
      * @note Setting this parameter will make Swiper not responsive
      */
    var width: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * CSS class name of slides' wrapper
      *
      * @default 'swiper-wrapper'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper Angular/React/Svelte/Vue
      *
      */
    var wrapperClass: js.UndefOr[String] = js.undefined
    
    /**
      * Swiper wrapper tag
      *
      * @default 'div'
      */
    var wrapperTag: js.UndefOr[String] = js.undefined
    
    /**
      * Enables zooming functionality. Object with zoom parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   zoom: {
      *     maxRatio: 5,
      *   },
      * });
      * ```
      */
    var zoom: js.UndefOr[ZoomOptions | Boolean] = js.undefined
  }
  object SwiperProps {
    
    inline def apply(): SwiperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwiperProps]
    }
    
    extension [Self <: SwiperProps](x: Self) {
      
      inline def setA11y(value: A11yOptions): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
      
      inline def setA11yUndefined: Self = StObject.set(x, "a11y", js.undefined)
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAllowSlideNext(value: Boolean): Self = StObject.set(x, "allowSlideNext", value.asInstanceOf[js.Any])
      
      inline def setAllowSlideNextUndefined: Self = StObject.set(x, "allowSlideNext", js.undefined)
      
      inline def setAllowSlidePrev(value: Boolean): Self = StObject.set(x, "allowSlidePrev", value.asInstanceOf[js.Any])
      
      inline def setAllowSlidePrevUndefined: Self = StObject.set(x, "allowSlidePrev", js.undefined)
      
      inline def setAllowTouchMove(value: Boolean): Self = StObject.set(x, "allowTouchMove", value.asInstanceOf[js.Any])
      
      inline def setAllowTouchMoveUndefined: Self = StObject.set(x, "allowTouchMove", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setAutoplay(value: AutoplayOptions | Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBreakpoints(value: StringDictionary[SwiperOptions] & NumberDictionary[SwiperOptions]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsBase(value: String): Self = StObject.set(x, "breakpointsBase", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsBaseUndefined: Self = StObject.set(x, "breakpointsBase", js.undefined)
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setCardsEffect(value: CardsEffectOptions): Self = StObject.set(x, "cardsEffect", value.asInstanceOf[js.Any])
      
      inline def setCardsEffectUndefined: Self = StObject.set(x, "cardsEffect", js.undefined)
      
      inline def setCenterInsufficientSlides(value: Boolean): Self = StObject.set(x, "centerInsufficientSlides", value.asInstanceOf[js.Any])
      
      inline def setCenterInsufficientSlidesUndefined: Self = StObject.set(x, "centerInsufficientSlides", js.undefined)
      
      inline def setCenteredSlides(value: Boolean): Self = StObject.set(x, "centeredSlides", value.asInstanceOf[js.Any])
      
      inline def setCenteredSlidesBounds(value: Boolean): Self = StObject.set(x, "centeredSlidesBounds", value.asInstanceOf[js.Any])
      
      inline def setCenteredSlidesBoundsUndefined: Self = StObject.set(x, "centeredSlidesBounds", js.undefined)
      
      inline def setCenteredSlidesUndefined: Self = StObject.set(x, "centeredSlides", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContainerModifierClass(value: String): Self = StObject.set(x, "containerModifierClass", value.asInstanceOf[js.Any])
      
      inline def setContainerModifierClassUndefined: Self = StObject.set(x, "containerModifierClass", js.undefined)
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setController(value: ControllerOptions): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      inline def setCoverflowEffect(value: CoverflowEffectOptions): Self = StObject.set(x, "coverflowEffect", value.asInstanceOf[js.Any])
      
      inline def setCoverflowEffectUndefined: Self = StObject.set(x, "coverflowEffect", js.undefined)
      
      inline def setCreateElements(value: Boolean): Self = StObject.set(x, "createElements", value.asInstanceOf[js.Any])
      
      inline def setCreateElementsUndefined: Self = StObject.set(x, "createElements", js.undefined)
      
      inline def setCreativeEffect(value: CreativeEffectOptions): Self = StObject.set(x, "creativeEffect", value.asInstanceOf[js.Any])
      
      inline def setCreativeEffectUndefined: Self = StObject.set(x, "creativeEffect", js.undefined)
      
      inline def setCssMode(value: Boolean): Self = StObject.set(x, "cssMode", value.asInstanceOf[js.Any])
      
      inline def setCssModeUndefined: Self = StObject.set(x, "cssMode", js.undefined)
      
      inline def setCubeEffect(value: CubeEffectOptions): Self = StObject.set(x, "cubeEffect", value.asInstanceOf[js.Any])
      
      inline def setCubeEffectUndefined: Self = StObject.set(x, "cubeEffect", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEdgeSwipeDetection(value: Boolean | String): Self = StObject.set(x, "edgeSwipeDetection", value.asInstanceOf[js.Any])
      
      inline def setEdgeSwipeDetectionUndefined: Self = StObject.set(x, "edgeSwipeDetection", js.undefined)
      
      inline def setEdgeSwipeThreshold(value: Double): Self = StObject.set(x, "edgeSwipeThreshold", value.asInstanceOf[js.Any])
      
      inline def setEdgeSwipeThresholdUndefined: Self = StObject.set(x, "edgeSwipeThreshold", js.undefined)
      
      inline def setEffect(value: slide | fade | cube | coverflow | flip | creative | cards): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFadeEffect(value: FadeEffectOptions): Self = StObject.set(x, "fadeEffect", value.asInstanceOf[js.Any])
      
      inline def setFadeEffectUndefined: Self = StObject.set(x, "fadeEffect", js.undefined)
      
      inline def setFlipEffect(value: FlipEffectOptions): Self = StObject.set(x, "flipEffect", value.asInstanceOf[js.Any])
      
      inline def setFlipEffectUndefined: Self = StObject.set(x, "flipEffect", js.undefined)
      
      inline def setFocusableElements(value: String): Self = StObject.set(x, "focusableElements", value.asInstanceOf[js.Any])
      
      inline def setFocusableElementsUndefined: Self = StObject.set(x, "focusableElements", js.undefined)
      
      inline def setFollowFinger(value: Boolean): Self = StObject.set(x, "followFinger", value.asInstanceOf[js.Any])
      
      inline def setFollowFingerUndefined: Self = StObject.set(x, "followFinger", js.undefined)
      
      inline def setFreeMode(value: FreeModeOptions | Boolean): Self = StObject.set(x, "freeMode", value.asInstanceOf[js.Any])
      
      inline def setFreeModeUndefined: Self = StObject.set(x, "freeMode", js.undefined)
      
      inline def setGrabCursor(value: Boolean): Self = StObject.set(x, "grabCursor", value.asInstanceOf[js.Any])
      
      inline def setGrabCursorUndefined: Self = StObject.set(x, "grabCursor", js.undefined)
      
      inline def setGrid(value: GridOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHashNavigation(value: HashNavigationOptions | Boolean): Self = StObject.set(x, "hashNavigation", value.asInstanceOf[js.Any])
      
      inline def setHashNavigationUndefined: Self = StObject.set(x, "hashNavigation", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHistory(value: HistoryOptions | Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setInitialSlide(value: Double): Self = StObject.set(x, "initialSlide", value.asInstanceOf[js.Any])
      
      inline def setInitialSlideUndefined: Self = StObject.set(x, "initialSlide", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setKeyboard(value: KeyboardOptions | Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLazy(value: LazyOptions | Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setLongSwipes(value: Boolean): Self = StObject.set(x, "longSwipes", value.asInstanceOf[js.Any])
      
      inline def setLongSwipesMs(value: Double): Self = StObject.set(x, "longSwipesMs", value.asInstanceOf[js.Any])
      
      inline def setLongSwipesMsUndefined: Self = StObject.set(x, "longSwipesMs", js.undefined)
      
      inline def setLongSwipesRatio(value: Double): Self = StObject.set(x, "longSwipesRatio", value.asInstanceOf[js.Any])
      
      inline def setLongSwipesRatioUndefined: Self = StObject.set(x, "longSwipesRatio", js.undefined)
      
      inline def setLongSwipesUndefined: Self = StObject.set(x, "longSwipes", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopAdditionalSlides(value: Double): Self = StObject.set(x, "loopAdditionalSlides", value.asInstanceOf[js.Any])
      
      inline def setLoopAdditionalSlidesUndefined: Self = StObject.set(x, "loopAdditionalSlides", js.undefined)
      
      inline def setLoopFillGroupWithBlank(value: Boolean): Self = StObject.set(x, "loopFillGroupWithBlank", value.asInstanceOf[js.Any])
      
      inline def setLoopFillGroupWithBlankUndefined: Self = StObject.set(x, "loopFillGroupWithBlank", js.undefined)
      
      inline def setLoopPreventsSlide(value: Boolean): Self = StObject.set(x, "loopPreventsSlide", value.asInstanceOf[js.Any])
      
      inline def setLoopPreventsSlideUndefined: Self = StObject.set(x, "loopPreventsSlide", js.undefined)
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setLoopedSlides(value: Double): Self = StObject.set(x, "loopedSlides", value.asInstanceOf[js.Any])
      
      inline def setLoopedSlidesLimit(value: Boolean): Self = StObject.set(x, "loopedSlidesLimit", value.asInstanceOf[js.Any])
      
      inline def setLoopedSlidesLimitUndefined: Self = StObject.set(x, "loopedSlidesLimit", js.undefined)
      
      inline def setLoopedSlidesNull: Self = StObject.set(x, "loopedSlides", null)
      
      inline def setLoopedSlidesUndefined: Self = StObject.set(x, "loopedSlides", js.undefined)
      
      inline def setMaxBackfaceHiddenSlides(value: Double): Self = StObject.set(x, "maxBackfaceHiddenSlides", value.asInstanceOf[js.Any])
      
      inline def setMaxBackfaceHiddenSlidesUndefined: Self = StObject.set(x, "maxBackfaceHiddenSlides", js.undefined)
      
      inline def setModules(value: js.Array[SwiperModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setModulesVarargs(value: SwiperModule*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setMousewheel(value: MousewheelOptions | Boolean): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
      
      inline def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
      
      inline def setNavigation(value: NavigationOptions | Boolean): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
      
      inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
      
      inline def setNoSwiping(value: Boolean): Self = StObject.set(x, "noSwiping", value.asInstanceOf[js.Any])
      
      inline def setNoSwipingClass(value: String): Self = StObject.set(x, "noSwipingClass", value.asInstanceOf[js.Any])
      
      inline def setNoSwipingClassUndefined: Self = StObject.set(x, "noSwipingClass", js.undefined)
      
      inline def setNoSwipingSelector(value: String): Self = StObject.set(x, "noSwipingSelector", value.asInstanceOf[js.Any])
      
      inline def setNoSwipingSelectorUndefined: Self = StObject.set(x, "noSwipingSelector", js.undefined)
      
      inline def setNoSwipingUndefined: Self = StObject.set(x, "noSwiping", js.undefined)
      
      inline def setNormalizeSlideIndex(value: Boolean): Self = StObject.set(x, "normalizeSlideIndex", value.asInstanceOf[js.Any])
      
      inline def setNormalizeSlideIndexUndefined: Self = StObject.set(x, "normalizeSlideIndex", js.undefined)
      
      inline def setObserveParents(value: Boolean): Self = StObject.set(x, "observeParents", value.asInstanceOf[js.Any])
      
      inline def setObserveParentsUndefined: Self = StObject.set(x, "observeParents", js.undefined)
      
      inline def setObserveSlideChildren(value: Boolean): Self = StObject.set(x, "observeSlideChildren", value.asInstanceOf[js.Any])
      
      inline def setObserveSlideChildrenUndefined: Self = StObject.set(x, "observeSlideChildren", js.undefined)
      
      inline def setObserver(value: Boolean): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      inline def setObserverUndefined: Self = StObject.set(x, "observer", js.undefined)
      
      inline def setOn(value: eventinkeyofSwiperEventsSActiveIndexChange): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnAbort(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnActiveIndexChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onActiveIndexChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnActiveIndexChangeUndefined: Self = StObject.set(x, "onActiveIndexChange", js.undefined)
      
      inline def setOnAfterInit(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onAfterInit", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnAfterInitUndefined: Self = StObject.set(x, "onAfterInit", js.undefined)
      
      inline def setOnAnimationEnd(value: ReactAnimationEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: ReactAnimationEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: ReactAnimationEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAny(value: /* handler */ js.Function2[/* eventName */ String, /* repeated */ Any, Unit] => Callback): Self = StObject.set(x, "onAny", js.Any.fromFunction1((t0: /* handler */ js.Function2[/* eventName */ String, /* repeated */ Any, Unit]) => value(t0).runNow()))
      
      inline def setOnAnyUndefined: Self = StObject.set(x, "onAny", js.undefined)
      
      inline def setOnAutoplay(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onAutoplay", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnAutoplayPause(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onAutoplayPause", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnAutoplayPauseUndefined: Self = StObject.set(x, "onAutoplayPause", js.undefined)
      
      inline def setOnAutoplayResume(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onAutoplayResume", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnAutoplayResumeUndefined: Self = StObject.set(x, "onAutoplayResume", js.undefined)
      
      inline def setOnAutoplayStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onAutoplayStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnAutoplayStartUndefined: Self = StObject.set(x, "onAutoplayStart", js.undefined)
      
      inline def setOnAutoplayStop(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onAutoplayStop", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnAutoplayStopUndefined: Self = StObject.set(x, "onAutoplayStop", js.undefined)
      
      inline def setOnAutoplayUndefined: Self = StObject.set(x, "onAutoplay", js.undefined)
      
      inline def setOnAuxClick(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeDestroy(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onBeforeDestroy", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnBeforeDestroyUndefined: Self = StObject.set(x, "onBeforeDestroy", js.undefined)
      
      inline def setOnBeforeInit(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onBeforeInit", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnBeforeInitUndefined: Self = StObject.set(x, "onBeforeInit", js.undefined)
      
      inline def setOnBeforeInput(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBeforeLoopFix(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onBeforeLoopFix", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnBeforeLoopFixUndefined: Self = StObject.set(x, "onBeforeLoopFix", js.undefined)
      
      inline def setOnBeforeResize(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onBeforeResize", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnBeforeResizeUndefined: Self = StObject.set(x, "onBeforeResize", js.undefined)
      
      inline def setOnBeforeSlideChangeStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onBeforeSlideChangeStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnBeforeSlideChangeStartUndefined: Self = StObject.set(x, "onBeforeSlideChangeStart", js.undefined)
      
      inline def setOnBeforeTransitionStart(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* speed */ Double, /* internal */ Any) => Callback
      ): Self = StObject.set(x, "onBeforeTransitionStart", js.Any.fromFunction3((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* speed */ Double, t2: /* internal */ Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnBeforeTransitionStartUndefined: Self = StObject.set(x, "onBeforeTransitionStart", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnBreakpoint(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* breakpointParams */ SwiperOptions) => Callback
      ): Self = StObject.set(x, "onBreakpoint", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* breakpointParams */ SwiperOptions) => (value(t0, t1)).runNow()))
      
      inline def setOnBreakpointUndefined: Self = StObject.set(x, "onBreakpoint", js.undefined)
      
      inline def setOnCanPlay(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThrough(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnChangeDirection(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onChangeDirection", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnChangeDirectionUndefined: Self = StObject.set(x, "onChangeDirection", js.undefined)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: ReactCompositionEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: ReactCompositionEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: ReactCompositionEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ReactClipboardEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ReactClipboardEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDestroy(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onDestroy", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
      
      inline def setOnDoubleClick(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
      ): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDoubleTap(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
      ): Self = StObject.set(x, "onDoubleTap", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnDoubleTapUndefined: Self = StObject.set(x, "onDoubleTap", js.undefined)
      
      inline def setOnDrag(value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEnd(value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnFromEdge(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onFromEdge", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnFromEdgeUndefined: Self = StObject.set(x, "onFromEdge", js.undefined)
      
      inline def setOnHashChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onHashChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnHashChangeUndefined: Self = StObject.set(x, "onHashChange", js.undefined)
      
      inline def setOnHashSet(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onHashSet", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnHashSetUndefined: Self = StObject.set(x, "onHashSet", js.undefined)
      
      inline def setOnImagesReady(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onImagesReady", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnImagesReadyUndefined: Self = StObject.set(x, "onImagesReady", js.undefined)
      
      inline def setOnInit(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Any): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOnInput(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* keyCode */ String) => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* keyCode */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLazyImageLoad(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* slideEl */ HTMLElement, /* imageEl */ HTMLElement) => Callback
      ): Self = StObject.set(x, "onLazyImageLoad", js.Any.fromFunction3((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* slideEl */ HTMLElement, t2: /* imageEl */ HTMLElement) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnLazyImageLoadUndefined: Self = StObject.set(x, "onLazyImageLoad", js.undefined)
      
      inline def setOnLazyImageReady(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* slideEl */ HTMLElement, /* imageEl */ HTMLElement) => Callback
      ): Self = StObject.set(x, "onLazyImageReady", js.Any.fromFunction3((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* slideEl */ HTMLElement, t2: /* imageEl */ HTMLElement) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnLazyImageReadyUndefined: Self = StObject.set(x, "onLazyImageReady", js.undefined)
      
      inline def setOnLoad(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadStart(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnLock(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onLock", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnLockUndefined: Self = StObject.set(x, "onLock", js.undefined)
      
      inline def setOnLoopFix(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onLoopFix", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnLoopFixUndefined: Self = StObject.set(x, "onLoopFix", js.undefined)
      
      inline def setOnMomentumBounce(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onMomentumBounce", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnMomentumBounceUndefined: Self = StObject.set(x, "onMomentumBounce", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnNavigationHide(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onNavigationHide", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnNavigationHideUndefined: Self = StObject.set(x, "onNavigationHide", js.undefined)
      
      inline def setOnNavigationNext(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onNavigationNext", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnNavigationNextUndefined: Self = StObject.set(x, "onNavigationNext", js.undefined)
      
      inline def setOnNavigationPrev(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onNavigationPrev", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnNavigationPrevUndefined: Self = StObject.set(x, "onNavigationPrev", js.undefined)
      
      inline def setOnNavigationShow(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onNavigationShow", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnNavigationShowUndefined: Self = StObject.set(x, "onNavigationShow", js.undefined)
      
      inline def setOnObserverUpdate(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onObserverUpdate", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnObserverUpdateUndefined: Self = StObject.set(x, "onObserverUpdate", js.undefined)
      
      inline def setOnOrientationchange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onOrientationchange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnOrientationchangeUndefined: Self = StObject.set(x, "onOrientationchange", js.undefined)
      
      inline def setOnPaginationHide(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onPaginationHide", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnPaginationHideUndefined: Self = StObject.set(x, "onPaginationHide", js.undefined)
      
      inline def setOnPaginationRender(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* paginationEl */ HTMLElement) => Callback
      ): Self = StObject.set(x, "onPaginationRender", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* paginationEl */ HTMLElement) => (value(t0, t1)).runNow()))
      
      inline def setOnPaginationRenderUndefined: Self = StObject.set(x, "onPaginationRender", js.undefined)
      
      inline def setOnPaginationShow(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onPaginationShow", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnPaginationShowUndefined: Self = StObject.set(x, "onPaginationShow", js.undefined)
      
      inline def setOnPaginationUpdate(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* paginationEl */ HTMLElement) => Callback
      ): Self = StObject.set(x, "onPaginationUpdate", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* paginationEl */ HTMLElement) => (value(t0, t1)).runNow()))
      
      inline def setOnPaginationUpdateUndefined: Self = StObject.set(x, "onPaginationUpdate", js.undefined)
      
      inline def setOnPaste(value: ReactClipboardEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* progress */ Double) => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* progress */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReachBeginning(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onReachBeginning", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnReachBeginningUndefined: Self = StObject.set(x, "onReachBeginning", js.undefined)
      
      inline def setOnReachEnd(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onReachEnd", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnReachEndUndefined: Self = StObject.set(x, "onReachEnd", js.undefined)
      
      inline def setOnRealIndexChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onRealIndexChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnRealIndexChangeUndefined: Self = StObject.set(x, "onRealIndexChange", js.undefined)
      
      inline def setOnReset(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnResize(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnScroll(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ WheelEvent) => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ WheelEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnScrollbarDragEnd(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
      ): Self = StObject.set(x, "onScrollbarDragEnd", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnScrollbarDragEndUndefined: Self = StObject.set(x, "onScrollbarDragEnd", js.undefined)
      
      inline def setOnScrollbarDragMove(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
      ): Self = StObject.set(x, "onScrollbarDragMove", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnScrollbarDragMoveUndefined: Self = StObject.set(x, "onScrollbarDragMove", js.undefined)
      
      inline def setOnScrollbarDragStart(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
      ): Self = StObject.set(x, "onScrollbarDragStart", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnScrollbarDragStartUndefined: Self = StObject.set(x, "onScrollbarDragStart", js.undefined)
      
      inline def setOnSeeked(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnSetTransition(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* transition */ Double) => Callback): Self = StObject.set(x, "onSetTransition", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* transition */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnSetTransitionUndefined: Self = StObject.set(x, "onSetTransition", js.undefined)
      
      inline def setOnSetTranslate(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* translate */ Double) => Callback): Self = StObject.set(x, "onSetTranslate", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* translate */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnSetTranslateUndefined: Self = StObject.set(x, "onSetTranslate", js.undefined)
      
      inline def setOnSlideChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSlideChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSlideChangeTransitionEnd(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSlideChangeTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSlideChangeTransitionEndUndefined: Self = StObject.set(x, "onSlideChangeTransitionEnd", js.undefined)
      
      inline def setOnSlideChangeTransitionStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSlideChangeTransitionStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSlideChangeTransitionStartUndefined: Self = StObject.set(x, "onSlideChangeTransitionStart", js.undefined)
      
      inline def setOnSlideChangeUndefined: Self = StObject.set(x, "onSlideChange", js.undefined)
      
      inline def setOnSlideNextTransitionEnd(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSlideNextTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSlideNextTransitionEndUndefined: Self = StObject.set(x, "onSlideNextTransitionEnd", js.undefined)
      
      inline def setOnSlideNextTransitionStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSlideNextTransitionStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSlideNextTransitionStartUndefined: Self = StObject.set(x, "onSlideNextTransitionStart", js.undefined)
      
      inline def setOnSlidePrevTransitionEnd(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSlidePrevTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSlidePrevTransitionEndUndefined: Self = StObject.set(x, "onSlidePrevTransitionEnd", js.undefined)
      
      inline def setOnSlidePrevTransitionStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSlidePrevTransitionStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSlidePrevTransitionStartUndefined: Self = StObject.set(x, "onSlidePrevTransitionStart", js.undefined)
      
      inline def setOnSlideResetTransitionEnd(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSlideResetTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSlideResetTransitionEndUndefined: Self = StObject.set(x, "onSlideResetTransitionEnd", js.undefined)
      
      inline def setOnSlideResetTransitionStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSlideResetTransitionStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSlideResetTransitionStartUndefined: Self = StObject.set(x, "onSlideResetTransitionStart", js.undefined)
      
      inline def setOnSliderFirstMove(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ TouchEvent) => Callback): Self = StObject.set(x, "onSliderFirstMove", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ TouchEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnSliderFirstMoveUndefined: Self = StObject.set(x, "onSliderFirstMove", js.undefined)
      
      inline def setOnSliderMove(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
      ): Self = StObject.set(x, "onSliderMove", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnSliderMoveUndefined: Self = StObject.set(x, "onSliderMove", js.undefined)
      
      inline def setOnSlidesGridLengthChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSlidesGridLengthChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSlidesGridLengthChangeUndefined: Self = StObject.set(x, "onSlidesGridLengthChange", js.undefined)
      
      inline def setOnSlidesLengthChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSlidesLengthChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSlidesLengthChangeUndefined: Self = StObject.set(x, "onSlidesLengthChange", js.undefined)
      
      inline def setOnSnapGridLengthChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSnapGridLengthChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSnapGridLengthChangeUndefined: Self = StObject.set(x, "onSnapGridLengthChange", js.undefined)
      
      inline def setOnSnapIndexChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSnapIndexChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSnapIndexChangeUndefined: Self = StObject.set(x, "onSnapIndexChange", js.undefined)
      
      inline def setOnStalled(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnSwiper(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onSwiper", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnSwiperUndefined: Self = StObject.set(x, "onSwiper", js.undefined)
      
      inline def setOnTap(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
      ): Self = StObject.set(x, "onTap", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      inline def setOnTimeUpdate(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnToEdge(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onToEdge", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnToEdgeUndefined: Self = StObject.set(x, "onToEdge", js.undefined)
      
      inline def setOnTouchCancel(value: ReactTouchEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
      ): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
      ): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnTouchMoveOpposite(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
      ): Self = StObject.set(x, "onTouchMoveOpposite", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnTouchMoveOppositeUndefined: Self = StObject.set(x, "onTouchMoveOpposite", js.undefined)
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
      ): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnTransitionStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setOnUnlock(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onUnlock", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnUnlockUndefined: Self = StObject.set(x, "onUnlock", js.undefined)
      
      inline def setOnUpdate(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setOnVolumeChange(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: ReactWheelEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOnZoomChange(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* scale */ Double, /* imageEl */ HTMLElement, /* slideEl */ HTMLElement) => Callback
      ): Self = StObject.set(x, "onZoomChange", js.Any.fromFunction4((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* scale */ Double, t2: /* imageEl */ HTMLElement, t3: /* slideEl */ HTMLElement) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnZoomChangeUndefined: Self = StObject.set(x, "onZoomChange", js.undefined)
      
      inline def setPagination(value: PaginationOptions | Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setParallax(value: ParallaxOptions | Boolean): Self = StObject.set(x, "parallax", value.asInstanceOf[js.Any])
      
      inline def setParallaxUndefined: Self = StObject.set(x, "parallax", js.undefined)
      
      inline def setPassiveListeners(value: Boolean): Self = StObject.set(x, "passiveListeners", value.asInstanceOf[js.Any])
      
      inline def setPassiveListenersUndefined: Self = StObject.set(x, "passiveListeners", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPreloadImages(value: Boolean): Self = StObject.set(x, "preloadImages", value.asInstanceOf[js.Any])
      
      inline def setPreloadImagesUndefined: Self = StObject.set(x, "preloadImages", js.undefined)
      
      inline def setPreventClicks(value: Boolean): Self = StObject.set(x, "preventClicks", value.asInstanceOf[js.Any])
      
      inline def setPreventClicksPropagation(value: Boolean): Self = StObject.set(x, "preventClicksPropagation", value.asInstanceOf[js.Any])
      
      inline def setPreventClicksPropagationUndefined: Self = StObject.set(x, "preventClicksPropagation", js.undefined)
      
      inline def setPreventClicksUndefined: Self = StObject.set(x, "preventClicks", js.undefined)
      
      inline def setPreventInteractionOnTransition(value: Boolean): Self = StObject.set(x, "preventInteractionOnTransition", value.asInstanceOf[js.Any])
      
      inline def setPreventInteractionOnTransitionUndefined: Self = StObject.set(x, "preventInteractionOnTransition", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setResistance(value: Boolean): Self = StObject.set(x, "resistance", value.asInstanceOf[js.Any])
      
      inline def setResistanceRatio(value: Double): Self = StObject.set(x, "resistanceRatio", value.asInstanceOf[js.Any])
      
      inline def setResistanceRatioUndefined: Self = StObject.set(x, "resistanceRatio", js.undefined)
      
      inline def setResistanceUndefined: Self = StObject.set(x, "resistance", js.undefined)
      
      inline def setResizeObserver(value: Boolean): Self = StObject.set(x, "resizeObserver", value.asInstanceOf[js.Any])
      
      inline def setResizeObserverUndefined: Self = StObject.set(x, "resizeObserver", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
      
      inline def setRewindUndefined: Self = StObject.set(x, "rewind", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRoundLengths(value: Boolean): Self = StObject.set(x, "roundLengths", value.asInstanceOf[js.Any])
      
      inline def setRoundLengthsUndefined: Self = StObject.set(x, "roundLengths", js.undefined)
      
      inline def setRunCallbacksOnInit(value: Boolean): Self = StObject.set(x, "runCallbacksOnInit", value.asInstanceOf[js.Any])
      
      inline def setRunCallbacksOnInitUndefined: Self = StObject.set(x, "runCallbacksOnInit", js.undefined)
      
      inline def setScrollbar(value: ScrollbarOptions | Boolean): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSetWrapperSize(value: Boolean): Self = StObject.set(x, "setWrapperSize", value.asInstanceOf[js.Any])
      
      inline def setSetWrapperSizeUndefined: Self = StObject.set(x, "setWrapperSize", js.undefined)
      
      inline def setShortSwipes(value: Boolean): Self = StObject.set(x, "shortSwipes", value.asInstanceOf[js.Any])
      
      inline def setShortSwipesUndefined: Self = StObject.set(x, "shortSwipes", js.undefined)
      
      inline def setSimulateTouch(value: Boolean): Self = StObject.set(x, "simulateTouch", value.asInstanceOf[js.Any])
      
      inline def setSimulateTouchUndefined: Self = StObject.set(x, "simulateTouch", js.undefined)
      
      inline def setSlideActiveClass(value: String): Self = StObject.set(x, "slideActiveClass", value.asInstanceOf[js.Any])
      
      inline def setSlideActiveClassUndefined: Self = StObject.set(x, "slideActiveClass", js.undefined)
      
      inline def setSlideBlankClass(value: String): Self = StObject.set(x, "slideBlankClass", value.asInstanceOf[js.Any])
      
      inline def setSlideBlankClassUndefined: Self = StObject.set(x, "slideBlankClass", js.undefined)
      
      inline def setSlideClass(value: String): Self = StObject.set(x, "slideClass", value.asInstanceOf[js.Any])
      
      inline def setSlideClassUndefined: Self = StObject.set(x, "slideClass", js.undefined)
      
      inline def setSlideDuplicateActiveClass(value: String): Self = StObject.set(x, "slideDuplicateActiveClass", value.asInstanceOf[js.Any])
      
      inline def setSlideDuplicateActiveClassUndefined: Self = StObject.set(x, "slideDuplicateActiveClass", js.undefined)
      
      inline def setSlideDuplicateClass(value: String): Self = StObject.set(x, "slideDuplicateClass", value.asInstanceOf[js.Any])
      
      inline def setSlideDuplicateClassUndefined: Self = StObject.set(x, "slideDuplicateClass", js.undefined)
      
      inline def setSlideDuplicateNextClass(value: String): Self = StObject.set(x, "slideDuplicateNextClass", value.asInstanceOf[js.Any])
      
      inline def setSlideDuplicateNextClassUndefined: Self = StObject.set(x, "slideDuplicateNextClass", js.undefined)
      
      inline def setSlideDuplicatePrevClass(value: String): Self = StObject.set(x, "slideDuplicatePrevClass", value.asInstanceOf[js.Any])
      
      inline def setSlideDuplicatePrevClassUndefined: Self = StObject.set(x, "slideDuplicatePrevClass", js.undefined)
      
      inline def setSlideNextClass(value: String): Self = StObject.set(x, "slideNextClass", value.asInstanceOf[js.Any])
      
      inline def setSlideNextClassUndefined: Self = StObject.set(x, "slideNextClass", js.undefined)
      
      inline def setSlidePrevClass(value: String): Self = StObject.set(x, "slidePrevClass", value.asInstanceOf[js.Any])
      
      inline def setSlidePrevClassUndefined: Self = StObject.set(x, "slidePrevClass", js.undefined)
      
      inline def setSlideToClickedSlide(value: Boolean): Self = StObject.set(x, "slideToClickedSlide", value.asInstanceOf[js.Any])
      
      inline def setSlideToClickedSlideUndefined: Self = StObject.set(x, "slideToClickedSlide", js.undefined)
      
      inline def setSlideVisibleClass(value: String): Self = StObject.set(x, "slideVisibleClass", value.asInstanceOf[js.Any])
      
      inline def setSlideVisibleClassUndefined: Self = StObject.set(x, "slideVisibleClass", js.undefined)
      
      inline def setSlidesOffsetAfter(value: Double): Self = StObject.set(x, "slidesOffsetAfter", value.asInstanceOf[js.Any])
      
      inline def setSlidesOffsetAfterUndefined: Self = StObject.set(x, "slidesOffsetAfter", js.undefined)
      
      inline def setSlidesOffsetBefore(value: Double): Self = StObject.set(x, "slidesOffsetBefore", value.asInstanceOf[js.Any])
      
      inline def setSlidesOffsetBeforeUndefined: Self = StObject.set(x, "slidesOffsetBefore", js.undefined)
      
      inline def setSlidesPerGroup(value: Double): Self = StObject.set(x, "slidesPerGroup", value.asInstanceOf[js.Any])
      
      inline def setSlidesPerGroupAuto(value: Boolean): Self = StObject.set(x, "slidesPerGroupAuto", value.asInstanceOf[js.Any])
      
      inline def setSlidesPerGroupAutoUndefined: Self = StObject.set(x, "slidesPerGroupAuto", js.undefined)
      
      inline def setSlidesPerGroupSkip(value: Double): Self = StObject.set(x, "slidesPerGroupSkip", value.asInstanceOf[js.Any])
      
      inline def setSlidesPerGroupSkipUndefined: Self = StObject.set(x, "slidesPerGroupSkip", js.undefined)
      
      inline def setSlidesPerGroupUndefined: Self = StObject.set(x, "slidesPerGroup", js.undefined)
      
      inline def setSlidesPerView(value: Double | auto): Self = StObject.set(x, "slidesPerView", value.asInstanceOf[js.Any])
      
      inline def setSlidesPerViewUndefined: Self = StObject.set(x, "slidesPerView", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpaceBetween(value: Double): Self = StObject.set(x, "spaceBetween", value.asInstanceOf[js.Any])
      
      inline def setSpaceBetweenUndefined: Self = StObject.set(x, "spaceBetween", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setSwipeHandler(value: CSSSelector | HTMLElement): Self = StObject.set(x, "swipeHandler", value.asInstanceOf[js.Any])
      
      inline def setSwipeHandlerNull: Self = StObject.set(x, "swipeHandler", null)
      
      inline def setSwipeHandlerUndefined: Self = StObject.set(x, "swipeHandler", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setThumbs(value: ThumbsOptions): Self = StObject.set(x, "thumbs", value.asInstanceOf[js.Any])
      
      inline def setThumbsUndefined: Self = StObject.set(x, "thumbs", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTouchAngle(value: Double): Self = StObject.set(x, "touchAngle", value.asInstanceOf[js.Any])
      
      inline def setTouchAngleUndefined: Self = StObject.set(x, "touchAngle", js.undefined)
      
      inline def setTouchEventsTarget(value: container | wrapper): Self = StObject.set(x, "touchEventsTarget", value.asInstanceOf[js.Any])
      
      inline def setTouchEventsTargetUndefined: Self = StObject.set(x, "touchEventsTarget", js.undefined)
      
      inline def setTouchMoveStopPropagation(value: Boolean): Self = StObject.set(x, "touchMoveStopPropagation", value.asInstanceOf[js.Any])
      
      inline def setTouchMoveStopPropagationUndefined: Self = StObject.set(x, "touchMoveStopPropagation", js.undefined)
      
      inline def setTouchRatio(value: Double): Self = StObject.set(x, "touchRatio", value.asInstanceOf[js.Any])
      
      inline def setTouchRatioUndefined: Self = StObject.set(x, "touchRatio", js.undefined)
      
      inline def setTouchReleaseOnEdges(value: Boolean): Self = StObject.set(x, "touchReleaseOnEdges", value.asInstanceOf[js.Any])
      
      inline def setTouchReleaseOnEdgesUndefined: Self = StObject.set(x, "touchReleaseOnEdges", js.undefined)
      
      inline def setTouchStartForcePreventDefault(value: Boolean): Self = StObject.set(x, "touchStartForcePreventDefault", value.asInstanceOf[js.Any])
      
      inline def setTouchStartForcePreventDefaultUndefined: Self = StObject.set(x, "touchStartForcePreventDefault", js.undefined)
      
      inline def setTouchStartPreventDefault(value: Boolean): Self = StObject.set(x, "touchStartPreventDefault", value.asInstanceOf[js.Any])
      
      inline def setTouchStartPreventDefaultUndefined: Self = StObject.set(x, "touchStartPreventDefault", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUniqueNavElements(value: Boolean): Self = StObject.set(x, "uniqueNavElements", value.asInstanceOf[js.Any])
      
      inline def setUniqueNavElementsUndefined: Self = StObject.set(x, "uniqueNavElements", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setUpdateOnImagesReady(value: Boolean): Self = StObject.set(x, "updateOnImagesReady", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnImagesReadyUndefined: Self = StObject.set(x, "updateOnImagesReady", js.undefined)
      
      inline def setUpdateOnWindowResize(value: Boolean): Self = StObject.set(x, "updateOnWindowResize", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnWindowResizeUndefined: Self = StObject.set(x, "updateOnWindowResize", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setVirtual(value: VirtualOptions | Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualTranslate(value: Boolean): Self = StObject.set(x, "virtualTranslate", value.asInstanceOf[js.Any])
      
      inline def setVirtualTranslateUndefined: Self = StObject.set(x, "virtualTranslate", js.undefined)
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWatchOverflow(value: Boolean): Self = StObject.set(x, "watchOverflow", value.asInstanceOf[js.Any])
      
      inline def setWatchOverflowUndefined: Self = StObject.set(x, "watchOverflow", js.undefined)
      
      inline def setWatchSlidesProgress(value: Boolean): Self = StObject.set(x, "watchSlidesProgress", value.asInstanceOf[js.Any])
      
      inline def setWatchSlidesProgressUndefined: Self = StObject.set(x, "watchSlidesProgress", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
      
      inline def setWrapperTag(value: String): Self = StObject.set(x, "wrapperTag", value.asInstanceOf[js.Any])
      
      inline def setWrapperTagUndefined: Self = StObject.set(x, "wrapperTag", js.undefined)
      
      inline def setZoom(value: ZoomOptions | Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
      
      inline def set_beforeBreakpoint(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* breakpointParams */ SwiperOptions) => Callback
      ): Self = StObject.set(x, "_beforeBreakpoint", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* breakpointParams */ SwiperOptions) => (value(t0, t1)).runNow()))
      
      inline def set_beforeBreakpointUndefined: Self = StObject.set(x, "_beforeBreakpoint", js.undefined)
      
      inline def set_containerClasses(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* classNames */ String) => Callback): Self = StObject.set(x, "_containerClasses", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* classNames */ String) => (value(t0, t1)).runNow()))
      
      inline def set_containerClassesUndefined: Self = StObject.set(x, "_containerClasses", js.undefined)
      
      inline def set_emitClasses(value: Boolean): Self = StObject.set(x, "_emitClasses", value.asInstanceOf[js.Any])
      
      inline def set_emitClassesUndefined: Self = StObject.set(x, "_emitClasses", js.undefined)
      
      inline def set_freeModeNoMomentumRelease(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "_freeModeNoMomentumRelease", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def set_freeModeNoMomentumReleaseUndefined: Self = StObject.set(x, "_freeModeNoMomentumRelease", js.undefined)
      
      inline def set_slideClass(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* slideEl */ HTMLElement, /* classNames */ String) => Callback
      ): Self = StObject.set(x, "_slideClass", js.Any.fromFunction3((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* slideEl */ HTMLElement, t2: /* classNames */ String) => (value(t0, t1, t2)).runNow()))
      
      inline def set_slideClassUndefined: Self = StObject.set(x, "_slideClass", js.undefined)
      
      inline def set_slideClasses(
        value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* slides */ js.Array[ClassNames]) => Callback
      ): Self = StObject.set(x, "_slideClasses", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* slides */ js.Array[ClassNames]) => (value(t0, t1)).runNow()))
      
      inline def set_slideClassesUndefined: Self = StObject.set(x, "_slideClasses", js.undefined)
      
      inline def set_swiper(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): Self = StObject.set(x, "_swiper", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
      
      inline def set_swiperUndefined: Self = StObject.set(x, "_swiper", js.undefined)
    }
  }
  
  trait SwiperSlideProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    /**
      * Slide's child element or render function
      *
      * @default undefined
      */
    @JSName("children")
    var children_SwiperSlideProps: js.UndefOr[Node | (js.Function1[/* slideData */ SlideData, Node])] = js.undefined
    
    /**
      * Slide tag
      *
      * @default 'div'
      */
    var tag: js.UndefOr[String] = js.undefined
    
    /**
      * Slide's index in slides array/collection
      *
      * @default false
      */
    var virtualIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Enables additional wrapper required for zoom mode
      *
      * @default false
      */
    var zoom: js.UndefOr[Boolean] = js.undefined
  }
  object SwiperSlideProps {
    
    inline def apply(): SwiperSlideProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwiperSlideProps]
    }
    
    extension [Self <: SwiperSlideProps](x: Self) {
      
      inline def setChildren(value: Node | (js.Function1[/* slideData */ SlideData, Node])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* slideData */ SlideData => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setVirtualIndex(value: Double): Self = StObject.set(x, "virtualIndex", value.asInstanceOf[js.Any])
      
      inline def setVirtualIndexUndefined: Self = StObject.set(x, "virtualIndex", js.undefined)
      
      inline def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
