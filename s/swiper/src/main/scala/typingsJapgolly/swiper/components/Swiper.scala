package typingsJapgolly.swiper.components

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
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.swiper.anon.ClassNames
import typingsJapgolly.swiper.anon.eventinkeyofSwiperEventsSActiveIndexChange
import typingsJapgolly.swiper.reactSwiperReactMod.SwiperProps
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

object Swiper {
  
  @JSImport("swiper/react", "Swiper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def _beforeBreakpoint(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* breakpointParams */ SwiperOptions) => Callback
    ): this.type = set("_beforeBreakpoint", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* breakpointParams */ SwiperOptions) => (value(t0, t1)).runNow()))
    
    inline def _containerClasses(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* classNames */ String) => Callback): this.type = set("_containerClasses", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* classNames */ String) => (value(t0, t1)).runNow()))
    
    inline def _emitClasses(value: Boolean): this.type = set("_emitClasses", value.asInstanceOf[js.Any])
    
    inline def _freeModeNoMomentumRelease(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("_freeModeNoMomentumRelease", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def _slideClass(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* slideEl */ HTMLElement, /* classNames */ String) => Callback
    ): this.type = set("_slideClass", js.Any.fromFunction3((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* slideEl */ HTMLElement, t2: /* classNames */ String) => (value(t0, t1, t2)).runNow()))
    
    inline def _slideClasses(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* slides */ js.Array[ClassNames]) => Callback
    ): this.type = set("_slideClasses", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* slides */ js.Array[ClassNames]) => (value(t0, t1)).runNow()))
    
    inline def _swiper(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("_swiper", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def a11y(value: A11yOptions): this.type = set("a11y", value.asInstanceOf[js.Any])
    
    inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    inline def allowSlideNext(value: Boolean): this.type = set("allowSlideNext", value.asInstanceOf[js.Any])
    
    inline def allowSlidePrev(value: Boolean): this.type = set("allowSlidePrev", value.asInstanceOf[js.Any])
    
    inline def allowTouchMove(value: Boolean): this.type = set("allowTouchMove", value.asInstanceOf[js.Any])
    
    inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    inline def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    inline def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    inline def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    inline def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    inline def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    inline def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    inline def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    inline def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    inline def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    inline def autoHeight(value: Boolean): this.type = set("autoHeight", value.asInstanceOf[js.Any])
    
    inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    inline def autoplay(value: AutoplayOptions | Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    inline def breakpoints(value: StringDictionary[SwiperOptions] & NumberDictionary[SwiperOptions]): this.type = set("breakpoints", value.asInstanceOf[js.Any])
    
    inline def breakpointsBase(value: String): this.type = set("breakpointsBase", value.asInstanceOf[js.Any])
    
    inline def cardsEffect(value: CardsEffectOptions): this.type = set("cardsEffect", value.asInstanceOf[js.Any])
    
    inline def centerInsufficientSlides(value: Boolean): this.type = set("centerInsufficientSlides", value.asInstanceOf[js.Any])
    
    inline def centeredSlides(value: Boolean): this.type = set("centeredSlides", value.asInstanceOf[js.Any])
    
    inline def centeredSlidesBounds(value: Boolean): this.type = set("centeredSlidesBounds", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def containerModifierClass(value: String): this.type = set("containerModifierClass", value.asInstanceOf[js.Any])
    
    inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    inline def controller(value: ControllerOptions): this.type = set("controller", value.asInstanceOf[js.Any])
    
    inline def coverflowEffect(value: CoverflowEffectOptions): this.type = set("coverflowEffect", value.asInstanceOf[js.Any])
    
    inline def createElements(value: Boolean): this.type = set("createElements", value.asInstanceOf[js.Any])
    
    inline def creativeEffect(value: CreativeEffectOptions): this.type = set("creativeEffect", value.asInstanceOf[js.Any])
    
    inline def cssMode(value: Boolean): this.type = set("cssMode", value.asInstanceOf[js.Any])
    
    inline def cubeEffect(value: CubeEffectOptions): this.type = set("cubeEffect", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def edgeSwipeDetection(value: Boolean | String): this.type = set("edgeSwipeDetection", value.asInstanceOf[js.Any])
    
    inline def edgeSwipeThreshold(value: Double): this.type = set("edgeSwipeThreshold", value.asInstanceOf[js.Any])
    
    inline def effect(value: slide | fade | cube | coverflow | flip | creative | cards): this.type = set("effect", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def fadeEffect(value: FadeEffectOptions): this.type = set("fadeEffect", value.asInstanceOf[js.Any])
    
    inline def flipEffect(value: FlipEffectOptions): this.type = set("flipEffect", value.asInstanceOf[js.Any])
    
    inline def focusableElements(value: String): this.type = set("focusableElements", value.asInstanceOf[js.Any])
    
    inline def followFinger(value: Boolean): this.type = set("followFinger", value.asInstanceOf[js.Any])
    
    inline def freeMode(value: FreeModeOptions | Boolean): this.type = set("freeMode", value.asInstanceOf[js.Any])
    
    inline def grabCursor(value: Boolean): this.type = set("grabCursor", value.asInstanceOf[js.Any])
    
    inline def grid(value: GridOptions): this.type = set("grid", value.asInstanceOf[js.Any])
    
    inline def hashNavigation(value: HashNavigationOptions | Boolean): this.type = set("hashNavigation", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def heightNull: this.type = set("height", null)
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def history(value: HistoryOptions | Boolean): this.type = set("history", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def init(value: Boolean): this.type = set("init", value.asInstanceOf[js.Any])
    
    inline def initialSlide(value: Double): this.type = set("initialSlide", value.asInstanceOf[js.Any])
    
    inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    inline def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    inline def keyboard(value: KeyboardOptions | Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
    
    inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def `lazy`(value: LazyOptions | Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    inline def longSwipes(value: Boolean): this.type = set("longSwipes", value.asInstanceOf[js.Any])
    
    inline def longSwipesMs(value: Double): this.type = set("longSwipesMs", value.asInstanceOf[js.Any])
    
    inline def longSwipesRatio(value: Double): this.type = set("longSwipesRatio", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def loopAdditionalSlides(value: Double): this.type = set("loopAdditionalSlides", value.asInstanceOf[js.Any])
    
    inline def loopFillGroupWithBlank(value: Boolean): this.type = set("loopFillGroupWithBlank", value.asInstanceOf[js.Any])
    
    inline def loopPreventsSlide(value: Boolean): this.type = set("loopPreventsSlide", value.asInstanceOf[js.Any])
    
    inline def loopedSlides(value: Double): this.type = set("loopedSlides", value.asInstanceOf[js.Any])
    
    inline def loopedSlidesLimit(value: Boolean): this.type = set("loopedSlidesLimit", value.asInstanceOf[js.Any])
    
    inline def loopedSlidesNull: this.type = set("loopedSlides", null)
    
    inline def maxBackfaceHiddenSlides(value: Double): this.type = set("maxBackfaceHiddenSlides", value.asInstanceOf[js.Any])
    
    inline def modules(value: js.Array[SwiperModule]): this.type = set("modules", value.asInstanceOf[js.Any])
    
    inline def modulesVarargs(value: SwiperModule*): this.type = set("modules", js.Array(value*))
    
    inline def mousewheel(value: MousewheelOptions | Boolean): this.type = set("mousewheel", value.asInstanceOf[js.Any])
    
    inline def navigation(value: NavigationOptions | Boolean): this.type = set("navigation", value.asInstanceOf[js.Any])
    
    inline def nested(value: Boolean): this.type = set("nested", value.asInstanceOf[js.Any])
    
    inline def noSwiping(value: Boolean): this.type = set("noSwiping", value.asInstanceOf[js.Any])
    
    inline def noSwipingClass(value: String): this.type = set("noSwipingClass", value.asInstanceOf[js.Any])
    
    inline def noSwipingSelector(value: String): this.type = set("noSwipingSelector", value.asInstanceOf[js.Any])
    
    inline def normalizeSlideIndex(value: Boolean): this.type = set("normalizeSlideIndex", value.asInstanceOf[js.Any])
    
    inline def observeParents(value: Boolean): this.type = set("observeParents", value.asInstanceOf[js.Any])
    
    inline def observeSlideChildren(value: Boolean): this.type = set("observeSlideChildren", value.asInstanceOf[js.Any])
    
    inline def observer(value: Boolean): this.type = set("observer", value.asInstanceOf[js.Any])
    
    inline def on(value: eventinkeyofSwiperEventsSActiveIndexChange): this.type = set("on", value.asInstanceOf[js.Any])
    
    inline def onAbort(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onActiveIndexChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onActiveIndexChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onAfterInit(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onAfterInit", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLElement & Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLElement & Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLElement & Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onAny(value: /* handler */ js.Function2[/* eventName */ String, /* repeated */ Any, Unit] => Callback): this.type = set("onAny", js.Any.fromFunction1((t0: /* handler */ js.Function2[/* eventName */ String, /* repeated */ Any, Unit]) => value(t0).runNow()))
    
    inline def onAutoplay(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onAutoplay", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onAutoplayPause(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onAutoplayPause", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onAutoplayResume(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onAutoplayResume", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onAutoplayStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onAutoplayStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onAutoplayStop(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onAutoplayStop", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onAuxClick(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onBeforeDestroy(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onBeforeDestroy", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onBeforeInit(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onBeforeInit", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onBeforeInput(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onBeforeLoopFix(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onBeforeLoopFix", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onBeforeResize(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onBeforeResize", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onBeforeSlideChangeStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onBeforeSlideChangeStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onBeforeTransitionStart(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* speed */ Double, /* internal */ Any) => Callback
    ): this.type = set("onBeforeTransitionStart", js.Any.fromFunction3((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* speed */ Double, t2: /* internal */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLElement & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onBreakpoint(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* breakpointParams */ SwiperOptions) => Callback
    ): this.type = set("onBreakpoint", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* breakpointParams */ SwiperOptions) => (value(t0, t1)).runNow()))
    
    inline def onCanPlay(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onCanPlayThrough(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onChangeDirection(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onChangeDirection", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onClick(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLElement & Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLElement & Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLElement & Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onContextMenu(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onCopy(value: ReactClipboardEventFrom[HTMLElement & Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onCut(value: ReactClipboardEventFrom[HTMLElement & Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onDestroy(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onDestroy", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onDoubleClick(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
    ): this.type = set("onDoubleClick", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def onDoubleTap(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
    ): this.type = set("onDoubleTap", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def onDrag(value: ReactDragEventFrom[HTMLElement & Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onDragEnd(value: ReactDragEventFrom[HTMLElement & Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onDragEnter(value: ReactDragEventFrom[HTMLElement & Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onDragExit(value: ReactDragEventFrom[HTMLElement & Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onDragLeave(value: ReactDragEventFrom[HTMLElement & Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onDragOver(value: ReactDragEventFrom[HTMLElement & Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onDragStart(value: ReactDragEventFrom[HTMLElement & Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onDrop(value: ReactDragEventFrom[HTMLElement & Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onDurationChange(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onEmptied(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onEncrypted(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onEnded(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onError(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLElement & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onFromEdge(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onFromEdge", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onHashChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onHashChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onHashSet(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onHashSet", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onImagesReady(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onImagesReady", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onInit(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Any): this.type = set("onInit", js.Any.fromFunction1(value))
    
    inline def onInput(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onInvalid(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLElement & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* keyCode */ String) => Callback): this.type = set("onKeyPress", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* keyCode */ String) => (value(t0, t1)).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLElement & Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onLazyImageLoad(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* slideEl */ HTMLElement, /* imageEl */ HTMLElement) => Callback
    ): this.type = set("onLazyImageLoad", js.Any.fromFunction3((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* slideEl */ HTMLElement, t2: /* imageEl */ HTMLElement) => (value(t0, t1, t2)).runNow()))
    
    inline def onLazyImageReady(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* slideEl */ HTMLElement, /* imageEl */ HTMLElement) => Callback
    ): this.type = set("onLazyImageReady", js.Any.fromFunction3((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* slideEl */ HTMLElement, t2: /* imageEl */ HTMLElement) => (value(t0, t1, t2)).runNow()))
    
    inline def onLoad(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onLoadStart(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onLoadedData(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onLoadedMetadata(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onLock(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onLock", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onLoopFix(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onLoopFix", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onMomentumBounce(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onMomentumBounce", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onMouseMove(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onMouseOut(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onMouseOver(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onMouseUp(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onNavigationHide(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onNavigationHide", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onNavigationNext(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onNavigationNext", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onNavigationPrev(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onNavigationPrev", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onNavigationShow(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onNavigationShow", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onObserverUpdate(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onObserverUpdate", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onOrientationchange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onOrientationchange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onPaginationHide(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onPaginationHide", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onPaginationRender(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* paginationEl */ HTMLElement) => Callback
    ): this.type = set("onPaginationRender", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* paginationEl */ HTMLElement) => (value(t0, t1)).runNow()))
    
    inline def onPaginationShow(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onPaginationShow", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onPaginationUpdate(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* paginationEl */ HTMLElement) => Callback
    ): this.type = set("onPaginationUpdate", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* paginationEl */ HTMLElement) => (value(t0, t1)).runNow()))
    
    inline def onPaste(value: ReactClipboardEventFrom[HTMLElement & Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onPause(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onPlay(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onPlaying(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onPointerCancel(value: ReactPointerEventFrom[HTMLElement & Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onPointerDown(value: ReactPointerEventFrom[HTMLElement & Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onPointerEnter(value: ReactPointerEventFrom[HTMLElement & Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onPointerLeave(value: ReactPointerEventFrom[HTMLElement & Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onPointerMove(value: ReactPointerEventFrom[HTMLElement & Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onPointerOut(value: ReactPointerEventFrom[HTMLElement & Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onPointerOver(value: ReactPointerEventFrom[HTMLElement & Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onPointerUp(value: ReactPointerEventFrom[HTMLElement & Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onProgress(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* progress */ Double) => Callback): this.type = set("onProgress", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* progress */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRateChange(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onReachBeginning(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onReachBeginning", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onReachEnd(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onReachEnd", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onRealIndexChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onRealIndexChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onReset(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onResize(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onResize", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onScroll(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ WheelEvent) => Callback): this.type = set("onScroll", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ WheelEvent) => (value(t0, t1)).runNow()))
    
    inline def onScrollbarDragEnd(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
    ): this.type = set("onScrollbarDragEnd", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def onScrollbarDragMove(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
    ): this.type = set("onScrollbarDragMove", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def onScrollbarDragStart(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
    ): this.type = set("onScrollbarDragStart", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def onSeeked(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onSeeking(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onSelect(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onSetTransition(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* transition */ Double) => Callback): this.type = set("onSetTransition", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* transition */ Double) => (value(t0, t1)).runNow()))
    
    inline def onSetTranslate(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* translate */ Double) => Callback): this.type = set("onSetTranslate", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* translate */ Double) => (value(t0, t1)).runNow()))
    
    inline def onSlideChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSlideChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onSlideChangeTransitionEnd(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSlideChangeTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onSlideChangeTransitionStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSlideChangeTransitionStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onSlideNextTransitionEnd(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSlideNextTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onSlideNextTransitionStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSlideNextTransitionStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onSlidePrevTransitionEnd(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSlidePrevTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onSlidePrevTransitionStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSlidePrevTransitionStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onSlideResetTransitionEnd(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSlideResetTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onSlideResetTransitionStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSlideResetTransitionStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onSliderFirstMove(value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ TouchEvent) => Callback): this.type = set("onSliderFirstMove", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ TouchEvent) => (value(t0, t1)).runNow()))
    
    inline def onSliderMove(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
    ): this.type = set("onSliderMove", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def onSlidesGridLengthChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSlidesGridLengthChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onSlidesLengthChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSlidesLengthChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onSnapGridLengthChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSnapGridLengthChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onSnapIndexChange(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSnapIndexChange", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onStalled(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onSubmit(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onSuspend(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onSwiper(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onSwiper", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onTap(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
    ): this.type = set("onTap", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def onTimeUpdate(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onToEdge(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onToEdge", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onTouchCancel(value: ReactTouchEventFrom[HTMLElement & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
    ): this.type = set("onTouchEnd", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def onTouchMove(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
    ): this.type = set("onTouchMove", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def onTouchMoveOpposite(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
    ): this.type = set("onTouchMoveOpposite", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def onTouchStart(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Callback
    ): this.type = set("onTouchStart", js.Any.fromFunction2((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* event */ MouseEvent | TouchEvent | PointerEvent) => (value(t0, t1)).runNow()))
    
    inline def onTransitionEnd(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onTransitionStart(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onTransitionStart", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onUnlock(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onUnlock", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onUpdate(value: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper => Callback): this.type = set("onUpdate", js.Any.fromFunction1((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper) => value(t0).runNow()))
    
    inline def onVolumeChange(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onWaiting(value: ReactEventFrom[HTMLElement & Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onWheel(value: ReactWheelEventFrom[HTMLElement & Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onZoomChange(
      value: (/* swiper */ typingsJapgolly.swiper.typesMod.Swiper, /* scale */ Double, /* imageEl */ HTMLElement, /* slideEl */ HTMLElement) => Callback
    ): this.type = set("onZoomChange", js.Any.fromFunction4((t0: /* swiper */ typingsJapgolly.swiper.typesMod.Swiper, t1: /* scale */ Double, t2: /* imageEl */ HTMLElement, t3: /* slideEl */ HTMLElement) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def pagination(value: PaginationOptions | Boolean): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    inline def parallax(value: ParallaxOptions | Boolean): this.type = set("parallax", value.asInstanceOf[js.Any])
    
    inline def passiveListeners(value: Boolean): this.type = set("passiveListeners", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def preloadImages(value: Boolean): this.type = set("preloadImages", value.asInstanceOf[js.Any])
    
    inline def preventClicks(value: Boolean): this.type = set("preventClicks", value.asInstanceOf[js.Any])
    
    inline def preventClicksPropagation(value: Boolean): this.type = set("preventClicksPropagation", value.asInstanceOf[js.Any])
    
    inline def preventInteractionOnTransition(value: Boolean): this.type = set("preventInteractionOnTransition", value.asInstanceOf[js.Any])
    
    inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    inline def resistance(value: Boolean): this.type = set("resistance", value.asInstanceOf[js.Any])
    
    inline def resistanceRatio(value: Double): this.type = set("resistanceRatio", value.asInstanceOf[js.Any])
    
    inline def resizeObserver(value: Boolean): this.type = set("resizeObserver", value.asInstanceOf[js.Any])
    
    inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def rewind(value: Boolean): this.type = set("rewind", value.asInstanceOf[js.Any])
    
    inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def roundLengths(value: Boolean): this.type = set("roundLengths", value.asInstanceOf[js.Any])
    
    inline def runCallbacksOnInit(value: Boolean): this.type = set("runCallbacksOnInit", value.asInstanceOf[js.Any])
    
    inline def scrollbar(value: ScrollbarOptions | Boolean): this.type = set("scrollbar", value.asInstanceOf[js.Any])
    
    inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    inline def setWrapperSize(value: Boolean): this.type = set("setWrapperSize", value.asInstanceOf[js.Any])
    
    inline def shortSwipes(value: Boolean): this.type = set("shortSwipes", value.asInstanceOf[js.Any])
    
    inline def simulateTouch(value: Boolean): this.type = set("simulateTouch", value.asInstanceOf[js.Any])
    
    inline def slideActiveClass(value: String): this.type = set("slideActiveClass", value.asInstanceOf[js.Any])
    
    inline def slideBlankClass(value: String): this.type = set("slideBlankClass", value.asInstanceOf[js.Any])
    
    inline def slideClass(value: String): this.type = set("slideClass", value.asInstanceOf[js.Any])
    
    inline def slideDuplicateActiveClass(value: String): this.type = set("slideDuplicateActiveClass", value.asInstanceOf[js.Any])
    
    inline def slideDuplicateClass(value: String): this.type = set("slideDuplicateClass", value.asInstanceOf[js.Any])
    
    inline def slideDuplicateNextClass(value: String): this.type = set("slideDuplicateNextClass", value.asInstanceOf[js.Any])
    
    inline def slideDuplicatePrevClass(value: String): this.type = set("slideDuplicatePrevClass", value.asInstanceOf[js.Any])
    
    inline def slideNextClass(value: String): this.type = set("slideNextClass", value.asInstanceOf[js.Any])
    
    inline def slidePrevClass(value: String): this.type = set("slidePrevClass", value.asInstanceOf[js.Any])
    
    inline def slideToClickedSlide(value: Boolean): this.type = set("slideToClickedSlide", value.asInstanceOf[js.Any])
    
    inline def slideVisibleClass(value: String): this.type = set("slideVisibleClass", value.asInstanceOf[js.Any])
    
    inline def slidesOffsetAfter(value: Double): this.type = set("slidesOffsetAfter", value.asInstanceOf[js.Any])
    
    inline def slidesOffsetBefore(value: Double): this.type = set("slidesOffsetBefore", value.asInstanceOf[js.Any])
    
    inline def slidesPerGroup(value: Double): this.type = set("slidesPerGroup", value.asInstanceOf[js.Any])
    
    inline def slidesPerGroupAuto(value: Boolean): this.type = set("slidesPerGroupAuto", value.asInstanceOf[js.Any])
    
    inline def slidesPerGroupSkip(value: Double): this.type = set("slidesPerGroupSkip", value.asInstanceOf[js.Any])
    
    inline def slidesPerView(value: Double | auto): this.type = set("slidesPerView", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def spaceBetween(value: Double): this.type = set("spaceBetween", value.asInstanceOf[js.Any])
    
    inline def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def swipeHandler(value: CSSSelector | HTMLElement): this.type = set("swipeHandler", value.asInstanceOf[js.Any])
    
    inline def swipeHandlerNull: this.type = set("swipeHandler", null)
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def tag(value: String): this.type = set("tag", value.asInstanceOf[js.Any])
    
    inline def threshold(value: Double): this.type = set("threshold", value.asInstanceOf[js.Any])
    
    inline def thumbs(value: ThumbsOptions): this.type = set("thumbs", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def touchAngle(value: Double): this.type = set("touchAngle", value.asInstanceOf[js.Any])
    
    inline def touchEventsTarget(value: container | wrapper): this.type = set("touchEventsTarget", value.asInstanceOf[js.Any])
    
    inline def touchMoveStopPropagation(value: Boolean): this.type = set("touchMoveStopPropagation", value.asInstanceOf[js.Any])
    
    inline def touchRatio(value: Double): this.type = set("touchRatio", value.asInstanceOf[js.Any])
    
    inline def touchReleaseOnEdges(value: Boolean): this.type = set("touchReleaseOnEdges", value.asInstanceOf[js.Any])
    
    inline def touchStartForcePreventDefault(value: Boolean): this.type = set("touchStartForcePreventDefault", value.asInstanceOf[js.Any])
    
    inline def touchStartPreventDefault(value: Boolean): this.type = set("touchStartPreventDefault", value.asInstanceOf[js.Any])
    
    inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def uniqueNavElements(value: Boolean): this.type = set("uniqueNavElements", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def updateOnImagesReady(value: Boolean): this.type = set("updateOnImagesReady", value.asInstanceOf[js.Any])
    
    inline def updateOnWindowResize(value: Boolean): this.type = set("updateOnWindowResize", value.asInstanceOf[js.Any])
    
    inline def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
    
    inline def urlNull: this.type = set("url", null)
    
    inline def userAgent(value: String): this.type = set("userAgent", value.asInstanceOf[js.Any])
    
    inline def userAgentNull: this.type = set("userAgent", null)
    
    inline def virtual(value: VirtualOptions | Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
    
    inline def virtualTranslate(value: Boolean): this.type = set("virtualTranslate", value.asInstanceOf[js.Any])
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    
    inline def watchOverflow(value: Boolean): this.type = set("watchOverflow", value.asInstanceOf[js.Any])
    
    inline def watchSlidesProgress(value: Boolean): this.type = set("watchSlidesProgress", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def widthNull: this.type = set("width", null)
    
    inline def wrapperClass(value: String): this.type = set("wrapperClass", value.asInstanceOf[js.Any])
    
    inline def wrapperTag(value: String): this.type = set("wrapperTag", value.asInstanceOf[js.Any])
    
    inline def zoom(value: ZoomOptions | Boolean): this.type = set("zoom", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Swiper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwiperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
