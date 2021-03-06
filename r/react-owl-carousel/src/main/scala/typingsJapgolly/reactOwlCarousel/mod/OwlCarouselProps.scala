package typingsJapgolly.reactOwlCarousel.mod

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
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.react.mod.TransitionEventHandler
import typingsJapgolly.react.mod.UIEventHandler
import typingsJapgolly.react.mod.WheelEventHandler
import typingsJapgolly.reactOwlCarousel.optionsMod.HandlerCallback
import typingsJapgolly.reactOwlCarousel.optionsMod.Options
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.`additions text`
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.`inline`
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.additions
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.all
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.ascending
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.assertive
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.both
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.copy
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.date
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.decimal
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.descending
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.dialog
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.email
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.execute
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.grammar
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.grid
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.horizontal
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.inherit
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.link
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.list
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.listbox
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.location
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.menu
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.mixed
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.move
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.no
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.none
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.numeric
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.off
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.on
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.other
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.page
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.polite
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.popup
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.removals
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.search
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.spelling
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.step
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.tel
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.text
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.time
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.tree
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.url
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.vertical
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-owl-carousel.react-owl-carousel/umd/options.Options & react-owl-carousel.react-owl-carousel.ComponentProps */
trait OwlCarouselProps extends js.Object {
  var URLhashListener: js.UndefOr[Boolean] = js.undefined
  val about: js.UndefOr[String] = js.undefined
  val accept: js.UndefOr[String] = js.undefined
  val acceptCharset: js.UndefOr[String] = js.undefined
  val accessKey: js.UndefOr[String] = js.undefined
  val action: js.UndefOr[String] = js.undefined
  val allowFullScreen: js.UndefOr[Boolean] = js.undefined
  val allowTransparency: js.UndefOr[Boolean] = js.undefined
  val alt: js.UndefOr[String] = js.undefined
  var animateIn: js.UndefOr[String | Boolean] = js.undefined
  var animateOut: js.UndefOr[String | Boolean] = js.undefined
  val `aria-activedescendant`: js.UndefOr[String] = js.undefined
  val `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  val `aria-autocomplete`: js.UndefOr[
    none | `inline` | typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.list | both
  ] = js.undefined
  val `aria-busy`: js.UndefOr[Boolean] = js.undefined
  val `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  val `aria-colcount`: js.UndefOr[Double] = js.undefined
  val `aria-colindex`: js.UndefOr[Double] = js.undefined
  val `aria-colspan`: js.UndefOr[Double] = js.undefined
  val `aria-controls`: js.UndefOr[String] = js.undefined
  val `aria-current`: js.UndefOr[
    Boolean | page | typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.step | location | date | time
  ] = js.undefined
  val `aria-describedby`: js.UndefOr[String] = js.undefined
  val `aria-details`: js.UndefOr[String] = js.undefined
  val `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  val `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  val `aria-errormessage`: js.UndefOr[String] = js.undefined
  val `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  val `aria-flowto`: js.UndefOr[String] = js.undefined
  val `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  val `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  val `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  val `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  val `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  val `aria-label`: js.UndefOr[String] = js.undefined
  val `aria-labelledby`: js.UndefOr[String] = js.undefined
  val `aria-level`: js.UndefOr[Double] = js.undefined
  val `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  val `aria-modal`: js.UndefOr[Boolean] = js.undefined
  val `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  val `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  val `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  val `aria-owns`: js.UndefOr[String] = js.undefined
  val `aria-placeholder`: js.UndefOr[String] = js.undefined
  val `aria-posinset`: js.UndefOr[Double] = js.undefined
  val `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  val `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  val `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  val `aria-required`: js.UndefOr[Boolean] = js.undefined
  val `aria-roledescription`: js.UndefOr[String] = js.undefined
  val `aria-rowcount`: js.UndefOr[Double] = js.undefined
  val `aria-rowindex`: js.UndefOr[Double] = js.undefined
  val `aria-rowspan`: js.UndefOr[Double] = js.undefined
  val `aria-selected`: js.UndefOr[Boolean] = js.undefined
  val `aria-setsize`: js.UndefOr[Double] = js.undefined
  val `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  val `aria-valuemax`: js.UndefOr[Double] = js.undefined
  val `aria-valuemin`: js.UndefOr[Double] = js.undefined
  val `aria-valuenow`: js.UndefOr[Double] = js.undefined
  val `aria-valuetext`: js.UndefOr[String] = js.undefined
  val as: js.UndefOr[String] = js.undefined
  val async: js.UndefOr[Boolean] = js.undefined
  val autoCapitalize: js.UndefOr[String] = js.undefined
  val autoComplete: js.UndefOr[String] = js.undefined
  val autoCorrect: js.UndefOr[String] = js.undefined
  val autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoHeightClass: js.UndefOr[String] = js.undefined
  val autoPlay: js.UndefOr[Boolean] = js.undefined
  val autoSave: js.UndefOr[String] = js.undefined
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var autoplayHoverPause: js.UndefOr[Boolean] = js.undefined
  var autoplaySpeed: js.UndefOr[Double | Boolean] = js.undefined
  var autoplayTimeout: js.UndefOr[Double] = js.undefined
  var callbacks: js.UndefOr[Boolean] = js.undefined
  val capture: js.UndefOr[Boolean | String] = js.undefined
  val cellPadding: js.UndefOr[Double | String] = js.undefined
  val cellSpacing: js.UndefOr[Double | String] = js.undefined
  var center: js.UndefOr[Boolean] = js.undefined
  val challenge: js.UndefOr[String] = js.undefined
  val charSet: js.UndefOr[String] = js.undefined
  val checked: js.UndefOr[Boolean] = js.undefined
  val children: js.UndefOr[Node] = js.undefined
  val cite: js.UndefOr[String] = js.undefined
  val classID: js.UndefOr[String] = js.undefined
  val className: js.UndefOr[String] = js.undefined
  val colSpan: js.UndefOr[Double] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val cols: js.UndefOr[Double] = js.undefined
  val content: js.UndefOr[String] = js.undefined
  val contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  val contextMenu: js.UndefOr[String] = js.undefined
  val controls: js.UndefOr[Boolean] = js.undefined
  var controlsClass: js.UndefOr[String] = js.undefined
  val coords: js.UndefOr[String] = js.undefined
  val crossOrigin: js.UndefOr[String] = js.undefined
  val dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  val data: js.UndefOr[String] = js.undefined
  val datatype: js.UndefOr[String] = js.undefined
  val dateTime: js.UndefOr[String] = js.undefined
  val default: js.UndefOr[Boolean] = js.undefined
  val defaultChecked: js.UndefOr[Boolean] = js.undefined
  val defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  val defer: js.UndefOr[Boolean] = js.undefined
  val dir: js.UndefOr[String] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  var dotClass: js.UndefOr[String] = js.undefined
  var dotData: js.UndefOr[Boolean] = js.undefined
  var dots: js.UndefOr[Boolean] = js.undefined
  var dotsClass: js.UndefOr[String] = js.undefined
  var dotsContainer: js.UndefOr[String | Boolean] = js.undefined
  var dotsEach: js.UndefOr[Double | Boolean] = js.undefined
  var dotsSpeed: js.UndefOr[Double | Boolean] = js.undefined
  val download: js.UndefOr[js.Any] = js.undefined
  var dragClass: js.UndefOr[String] = js.undefined
  var dragEndSpeed: js.UndefOr[Double | Boolean] = js.undefined
  val draggable: js.UndefOr[Booleanish] = js.undefined
  val encType: js.UndefOr[String] = js.undefined
  var fallbackEasing: js.UndefOr[String] = js.undefined
  var fluidSpeed: js.UndefOr[Double | Boolean] = js.undefined
  val form: js.UndefOr[String] = js.undefined
  val formAction: js.UndefOr[String] = js.undefined
  val formEncType: js.UndefOr[String] = js.undefined
  val formMethod: js.UndefOr[String] = js.undefined
  val formNoValidate: js.UndefOr[Boolean] = js.undefined
  val formTarget: js.UndefOr[String] = js.undefined
  val frameBorder: js.UndefOr[Double | String] = js.undefined
  var freeDrag: js.UndefOr[Boolean] = js.undefined
  var grabClass: js.UndefOr[String] = js.undefined
  val headers: js.UndefOr[String] = js.undefined
  val height: js.UndefOr[Double | String] = js.undefined
  val hidden: js.UndefOr[Boolean] = js.undefined
  val high: js.UndefOr[Double] = js.undefined
  val href: js.UndefOr[String] = js.undefined
  val hrefLang: js.UndefOr[String] = js.undefined
  val htmlFor: js.UndefOr[String] = js.undefined
  val httpEquiv: js.UndefOr[String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[HandlerCallback] = js.undefined
  val inlist: js.UndefOr[js.Any] = js.undefined
  val inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  val integrity: js.UndefOr[String] = js.undefined
  val is: js.UndefOr[String] = js.undefined
  var itemElement: js.UndefOr[String] = js.undefined
  val itemID: js.UndefOr[String] = js.undefined
  val itemProp: js.UndefOr[String] = js.undefined
  val itemRef: js.UndefOr[String] = js.undefined
  val itemScope: js.UndefOr[Boolean] = js.undefined
  val itemType: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[Double] = js.undefined
  val keyParams: js.UndefOr[String] = js.undefined
  val keyType: js.UndefOr[String] = js.undefined
  val kind: js.UndefOr[String] = js.undefined
  val label: js.UndefOr[String] = js.undefined
  val lang: js.UndefOr[String] = js.undefined
  var lazyContent: js.UndefOr[Boolean] = js.undefined
  var lazyLoad: js.UndefOr[Boolean] = js.undefined
  val list: js.UndefOr[String] = js.undefined
  var loadedClass: js.UndefOr[String] = js.undefined
  var loadingClass: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  val low: js.UndefOr[Double] = js.undefined
  val manifest: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  val marginHeight: js.UndefOr[Double] = js.undefined
  val marginWidth: js.UndefOr[Double] = js.undefined
  val max: js.UndefOr[Double | String] = js.undefined
  val maxLength: js.UndefOr[Double] = js.undefined
  val media: js.UndefOr[String] = js.undefined
  val mediaGroup: js.UndefOr[String] = js.undefined
  var merge: js.UndefOr[Boolean] = js.undefined
  var mergeFit: js.UndefOr[Boolean] = js.undefined
  val method: js.UndefOr[String] = js.undefined
  val min: js.UndefOr[Double | String] = js.undefined
  val minLength: js.UndefOr[Double] = js.undefined
  var mouseDrag: js.UndefOr[Boolean] = js.undefined
  val multiple: js.UndefOr[Boolean] = js.undefined
  val muted: js.UndefOr[Boolean] = js.undefined
  val name: js.UndefOr[String] = js.undefined
  var nav: js.UndefOr[Boolean] = js.undefined
  var navClass: js.UndefOr[js.Array[String]] = js.undefined
  var navContainer: js.UndefOr[String | Boolean] = js.undefined
  var navContainerClass: js.UndefOr[String] = js.undefined
  var navElement: js.UndefOr[String] = js.undefined
  var navSpeed: js.UndefOr[Double | Boolean] = js.undefined
  var navText: js.UndefOr[js.Array[String]] = js.undefined
  var nestedItemSelector: js.UndefOr[String] = js.undefined
  val noValidate: js.UndefOr[Boolean] = js.undefined
  val nonce: js.UndefOr[String] = js.undefined
  val onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
  val onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
  val onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
  val onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  val onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
  val onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  var onChange: js.UndefOr[HandlerCallback with FormEventHandler[HTMLDivElement]] = js.undefined
  var onChanged: js.UndefOr[HandlerCallback] = js.undefined
  val onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
  val onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
  val onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
  val onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
  val onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
  val onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onDrag: js.UndefOr[HandlerCallback with DragEventHandler[HTMLDivElement]] = js.undefined
  val onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  val onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  val onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  val onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  val onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  val onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  var onDragged: js.UndefOr[HandlerCallback] = js.undefined
  val onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
  val onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
  var onInitialize: js.UndefOr[HandlerCallback] = js.undefined
  var onInitialized: js.UndefOr[HandlerCallback] = js.undefined
  val onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  val onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  val onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  val onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  val onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  val onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  var onLoadLazy: js.UndefOr[HandlerCallback] = js.undefined
  val onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  var onLoadedLazy: js.UndefOr[HandlerCallback] = js.undefined
  val onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  val onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
  val onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  var onPlayVideo: js.UndefOr[HandlerCallback] = js.undefined
  val onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
  val onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  var onRefresh: js.UndefOr[HandlerCallback] = js.undefined
  var onRefreshed: js.UndefOr[HandlerCallback] = js.undefined
  val onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  var onResize: js.UndefOr[HandlerCallback] = js.undefined
  var onResized: js.UndefOr[HandlerCallback] = js.undefined
  val onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.undefined
  val onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  var onStopVideo: js.UndefOr[HandlerCallback] = js.undefined
  val onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
  val onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
  val onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
  val onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
  val onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
  val onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.undefined
  var onTranslate: js.UndefOr[HandlerCallback] = js.undefined
  var onTranslated: js.UndefOr[HandlerCallback] = js.undefined
  val onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
  val onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.undefined
  val open: js.UndefOr[Boolean] = js.undefined
  val optimum: js.UndefOr[Double] = js.undefined
  val pattern: js.UndefOr[String] = js.undefined
  val placeholder: js.UndefOr[String] = js.undefined
  val playsInline: js.UndefOr[Boolean] = js.undefined
  val poster: js.UndefOr[String] = js.undefined
  val prefix: js.UndefOr[String] = js.undefined
  val preload: js.UndefOr[String] = js.undefined
  val property: js.UndefOr[String] = js.undefined
  var pullDrag: js.UndefOr[Boolean] = js.undefined
  val radioGroup: js.UndefOr[String] = js.undefined
  val readOnly: js.UndefOr[Boolean] = js.undefined
  var refreshClass: js.UndefOr[String] = js.undefined
  val rel: js.UndefOr[String] = js.undefined
  val required: js.UndefOr[Boolean] = js.undefined
  val resource: js.UndefOr[String] = js.undefined
  var responsive: js.UndefOr[StringDictionary[Options]] = js.undefined
  var responsiveBaseElement: js.UndefOr[Element] = js.undefined
  var responsiveClass: js.UndefOr[String | Boolean] = js.undefined
  var responsiveRefreshRate: js.UndefOr[Double] = js.undefined
  val results: js.UndefOr[Double] = js.undefined
  val reversed: js.UndefOr[Boolean] = js.undefined
  var rewind: js.UndefOr[Boolean] = js.undefined
  val role: js.UndefOr[String] = js.undefined
  val rowSpan: js.UndefOr[Double] = js.undefined
  val rows: js.UndefOr[Double] = js.undefined
  var rtlClass: js.UndefOr[String] = js.undefined
  val sandbox: js.UndefOr[String] = js.undefined
  val scope: js.UndefOr[String] = js.undefined
  val scoped: js.UndefOr[Boolean] = js.undefined
  val scrolling: js.UndefOr[String] = js.undefined
  val seamless: js.UndefOr[Boolean] = js.undefined
  val security: js.UndefOr[String] = js.undefined
  val selected: js.UndefOr[Boolean] = js.undefined
  val shape: js.UndefOr[String] = js.undefined
  val size: js.UndefOr[Double] = js.undefined
  val sizes: js.UndefOr[String] = js.undefined
  var slideBy: js.UndefOr[Double | String] = js.undefined
  val slot: js.UndefOr[String] = js.undefined
  var smartSpeed: js.UndefOr[Double | Boolean] = js.undefined
  val span: js.UndefOr[Double] = js.undefined
  val spellCheck: js.UndefOr[Booleanish] = js.undefined
  val src: js.UndefOr[String] = js.undefined
  val srcDoc: js.UndefOr[String] = js.undefined
  val srcLang: js.UndefOr[String] = js.undefined
  val srcSet: js.UndefOr[String] = js.undefined
  var stageClass: js.UndefOr[String] = js.undefined
  var stageElement: js.UndefOr[String] = js.undefined
  var stageOuterClass: js.UndefOr[String] = js.undefined
  var stagePadding: js.UndefOr[Double] = js.undefined
  val start: js.UndefOr[Double] = js.undefined
  var startPosition: js.UndefOr[Double | String] = js.undefined
  val step: js.UndefOr[Double | String] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val summary: js.UndefOr[String] = js.undefined
  val suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  val suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  val tabIndex: js.UndefOr[Double] = js.undefined
  val target: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[String] = js.undefined
  var touchDrag: js.UndefOr[Boolean] = js.undefined
  val translate: js.UndefOr[yes | no] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
  val typeof: js.UndefOr[String] = js.undefined
  val unselectable: js.UndefOr[on | off] = js.undefined
  val useMap: js.UndefOr[String] = js.undefined
  val value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var video: js.UndefOr[Boolean] = js.undefined
  var videoHeight: js.UndefOr[Double | Boolean] = js.undefined
  var videoWidth: js.UndefOr[Double | Boolean] = js.undefined
  val vocab: js.UndefOr[String] = js.undefined
  val width: js.UndefOr[Double | String] = js.undefined
  val wmode: js.UndefOr[String] = js.undefined
  val wrap: js.UndefOr[String] = js.undefined
}

object OwlCarouselProps {
  @scala.inline
  def apply(
    URLhashListener: js.UndefOr[Boolean] = js.undefined,
    about: String = null,
    accept: String = null,
    acceptCharset: String = null,
    accessKey: String = null,
    action: String = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    allowTransparency: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    animateIn: String | Boolean = null,
    animateOut: String | Boolean = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    as: String = null,
    async: js.UndefOr[Boolean] = js.undefined,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoHeightClass: String = null,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayHoverPause: js.UndefOr[Boolean] = js.undefined,
    autoplaySpeed: Double | Boolean = null,
    autoplayTimeout: Int | Double = null,
    callbacks: js.UndefOr[Boolean] = js.undefined,
    capture: Boolean | String = null,
    cellPadding: Double | String = null,
    cellSpacing: Double | String = null,
    center: js.UndefOr[Boolean] = js.undefined,
    challenge: String = null,
    charSet: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    cite: String = null,
    classID: String = null,
    className: String = null,
    colSpan: Int | Double = null,
    color: String = null,
    cols: Int | Double = null,
    content: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    controlsClass: String = null,
    coords: String = null,
    crossOrigin: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    data: String = null,
    datatype: String = null,
    dateTime: String = null,
    default: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dotClass: String = null,
    dotData: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    dotsClass: String = null,
    dotsContainer: String | Boolean = null,
    dotsEach: Double | Boolean = null,
    dotsSpeed: Double | Boolean = null,
    download: js.Any = null,
    dragClass: String = null,
    dragEndSpeed: Double | Boolean = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    encType: String = null,
    fallbackEasing: String = null,
    fluidSpeed: Double | Boolean = null,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    frameBorder: Double | String = null,
    freeDrag: js.UndefOr[Boolean] = js.undefined,
    grabClass: String = null,
    headers: String = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    high: Int | Double = null,
    href: String = null,
    hrefLang: String = null,
    htmlFor: String = null,
    httpEquiv: String = null,
    id: String = null,
    info: /* repeated */ js.Any => Callback = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    integrity: String = null,
    is: String = null,
    itemElement: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    items: Int | Double = null,
    keyParams: String = null,
    keyType: String = null,
    kind: String = null,
    label: String = null,
    lang: String = null,
    lazyContent: js.UndefOr[Boolean] = js.undefined,
    lazyLoad: js.UndefOr[Boolean] = js.undefined,
    list: String = null,
    loadedClass: String = null,
    loadingClass: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    low: Int | Double = null,
    manifest: String = null,
    margin: Int | Double = null,
    marginHeight: Int | Double = null,
    marginWidth: Int | Double = null,
    max: Double | String = null,
    maxLength: Int | Double = null,
    media: String = null,
    mediaGroup: String = null,
    merge: js.UndefOr[Boolean] = js.undefined,
    mergeFit: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    min: Double | String = null,
    minLength: Int | Double = null,
    mouseDrag: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    nav: js.UndefOr[Boolean] = js.undefined,
    navClass: js.Array[String] = null,
    navContainer: String | Boolean = null,
    navContainerClass: String = null,
    navElement: String = null,
    navSpeed: Double | Boolean = null,
    navText: js.Array[String] = null,
    nestedItemSelector: String = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    onAbort: ReactEventFrom[HTMLDivElement] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[HTMLDivElement] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[HTMLDivElement] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[HTMLDivElement] => Callback = null,
    onAuxClick: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onBeforeInput: ReactEventFrom[HTMLDivElement] => Callback = null,
    onBlur: ReactFocusEventFrom[HTMLDivElement] => Callback = null,
    onCanPlay: ReactEventFrom[HTMLDivElement] => Callback = null,
    onCanPlayThrough: ReactEventFrom[HTMLDivElement] => Callback = null,
    onChange: HandlerCallback with FormEventHandler[HTMLDivElement] = null,
    onChanged: /* repeated */ js.Any => Callback = null,
    onClick: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[HTMLDivElement] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[HTMLDivElement] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[HTMLDivElement] => Callback = null,
    onContextMenu: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onCopy: ReactClipboardEventFrom[HTMLDivElement] => Callback = null,
    onCut: ReactClipboardEventFrom[HTMLDivElement] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onDrag: HandlerCallback with DragEventHandler[HTMLDivElement] = null,
    onDragEnd: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDragEnter: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDragExit: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDragLeave: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDragOver: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDragStart: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDragged: /* repeated */ js.Any => Callback = null,
    onDrop: ReactDragEventFrom[HTMLDivElement] => Callback = null,
    onDurationChange: ReactEventFrom[HTMLDivElement] => Callback = null,
    onEmptied: ReactEventFrom[HTMLDivElement] => Callback = null,
    onEncrypted: ReactEventFrom[HTMLDivElement] => Callback = null,
    onEnded: ReactEventFrom[HTMLDivElement] => Callback = null,
    onError: ReactEventFrom[HTMLDivElement] => Callback = null,
    onFocus: ReactFocusEventFrom[HTMLDivElement] => Callback = null,
    onInitialize: /* repeated */ js.Any => Callback = null,
    onInitialized: /* repeated */ js.Any => Callback = null,
    onInput: ReactEventFrom[HTMLDivElement] => Callback = null,
    onInvalid: ReactEventFrom[HTMLDivElement] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[HTMLDivElement] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[HTMLDivElement] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[HTMLDivElement] => Callback = null,
    onLoad: ReactEventFrom[HTMLDivElement] => Callback = null,
    onLoadLazy: /* repeated */ js.Any => Callback = null,
    onLoadStart: ReactEventFrom[HTMLDivElement] => Callback = null,
    onLoadedData: ReactEventFrom[HTMLDivElement] => Callback = null,
    onLoadedLazy: /* repeated */ js.Any => Callback = null,
    onLoadedMetadata: ReactEventFrom[HTMLDivElement] => Callback = null,
    onMouseDown: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onMouseMove: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onMouseOut: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onMouseOver: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onMouseUp: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onPaste: ReactClipboardEventFrom[HTMLDivElement] => Callback = null,
    onPause: ReactEventFrom[HTMLDivElement] => Callback = null,
    onPlay: ReactEventFrom[HTMLDivElement] => Callback = null,
    onPlayVideo: /* repeated */ js.Any => Callback = null,
    onPlaying: ReactEventFrom[HTMLDivElement] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onPointerDown: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onPointerMove: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onPointerOut: ReactPointerEventFrom[HTMLDivElement] => Callback = null,
    onPointerOver: ReactPointerEventFrom[HTMLDivElement] => Callback = null
  ): OwlCarouselProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(URLhashListener)) __obj.updateDynamic("URLhashListener")(URLhashListener.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (animateIn != null) __obj.updateDynamic("animateIn")(animateIn.asInstanceOf[js.Any])
    if (animateOut != null) __obj.updateDynamic("animateOut")(animateOut.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoHeightClass != null) __obj.updateDynamic("autoHeightClass")(autoHeightClass.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayHoverPause)) __obj.updateDynamic("autoplayHoverPause")(autoplayHoverPause.asInstanceOf[js.Any])
    if (autoplaySpeed != null) __obj.updateDynamic("autoplaySpeed")(autoplaySpeed.asInstanceOf[js.Any])
    if (autoplayTimeout != null) __obj.updateDynamic("autoplayTimeout")(autoplayTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(callbacks)) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge.asInstanceOf[js.Any])
    if (charSet != null) __obj.updateDynamic("charSet")(charSet.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (cite != null) __obj.updateDynamic("cite")(cite.asInstanceOf[js.Any])
    if (classID != null) __obj.updateDynamic("classID")(classID.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (controlsClass != null) __obj.updateDynamic("controlsClass")(controlsClass.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dotClass != null) __obj.updateDynamic("dotClass")(dotClass.asInstanceOf[js.Any])
    if (!js.isUndefined(dotData)) __obj.updateDynamic("dotData")(dotData.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (dotsClass != null) __obj.updateDynamic("dotsClass")(dotsClass.asInstanceOf[js.Any])
    if (dotsContainer != null) __obj.updateDynamic("dotsContainer")(dotsContainer.asInstanceOf[js.Any])
    if (dotsEach != null) __obj.updateDynamic("dotsEach")(dotsEach.asInstanceOf[js.Any])
    if (dotsSpeed != null) __obj.updateDynamic("dotsSpeed")(dotsSpeed.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (dragClass != null) __obj.updateDynamic("dragClass")(dragClass.asInstanceOf[js.Any])
    if (dragEndSpeed != null) __obj.updateDynamic("dragEndSpeed")(dragEndSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (encType != null) __obj.updateDynamic("encType")(encType.asInstanceOf[js.Any])
    if (fallbackEasing != null) __obj.updateDynamic("fallbackEasing")(fallbackEasing.asInstanceOf[js.Any])
    if (fluidSpeed != null) __obj.updateDynamic("fluidSpeed")(fluidSpeed.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (!js.isUndefined(freeDrag)) __obj.updateDynamic("freeDrag")(freeDrag.asInstanceOf[js.Any])
    if (grabClass != null) __obj.updateDynamic("grabClass")(grabClass.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => info(t0).runNow()))
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyContent)) __obj.updateDynamic("lazyContent")(lazyContent.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyLoad)) __obj.updateDynamic("lazyLoad")(lazyLoad.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (loadedClass != null) __obj.updateDynamic("loadedClass")(loadedClass.asInstanceOf[js.Any])
    if (loadingClass != null) __obj.updateDynamic("loadingClass")(loadingClass.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginHeight != null) __obj.updateDynamic("marginHeight")(marginHeight.asInstanceOf[js.Any])
    if (marginWidth != null) __obj.updateDynamic("marginWidth")(marginWidth.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeFit)) __obj.updateDynamic("mergeFit")(mergeFit.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseDrag)) __obj.updateDynamic("mouseDrag")(mouseDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav.asInstanceOf[js.Any])
    if (navClass != null) __obj.updateDynamic("navClass")(navClass.asInstanceOf[js.Any])
    if (navContainer != null) __obj.updateDynamic("navContainer")(navContainer.asInstanceOf[js.Any])
    if (navContainerClass != null) __obj.updateDynamic("navContainerClass")(navContainerClass.asInstanceOf[js.Any])
    if (navElement != null) __obj.updateDynamic("navElement")(navElement.asInstanceOf[js.Any])
    if (navSpeed != null) __obj.updateDynamic("navSpeed")(navSpeed.asInstanceOf[js.Any])
    if (navText != null) __obj.updateDynamic("navText")(navText.asInstanceOf[js.Any])
    if (nestedItemSelector != null) __obj.updateDynamic("nestedItemSelector")(nestedItemSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onChanged(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDragStart(t0).runNow()))
    if (onDragged != null) __obj.updateDynamic("onDragged")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onDragged(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onFocus(t0).runNow()))
    if (onInitialize != null) __obj.updateDynamic("onInitialize")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onInitialize(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onInitialized(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onLoad(t0).runNow()))
    if (onLoadLazy != null) __obj.updateDynamic("onLoadLazy")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onLoadLazy(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onLoadedData(t0).runNow()))
    if (onLoadedLazy != null) __obj.updateDynamic("onLoadedLazy")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onLoadedLazy(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPlay(t0).runNow()))
    if (onPlayVideo != null) __obj.updateDynamic("onPlayVideo")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onPlayVideo(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onPointerOver(t0).runNow()))
    __obj.asInstanceOf[OwlCarouselProps]
  }
}

