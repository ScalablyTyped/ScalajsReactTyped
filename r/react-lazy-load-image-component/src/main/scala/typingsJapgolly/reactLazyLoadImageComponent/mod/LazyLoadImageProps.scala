package typingsJapgolly.reactLazyLoadImageComponent.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
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
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLImageElement
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
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings._empty
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`additions text`
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`inline`
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`lazy`
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`no-referrer`
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`unsafe-url`
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`use-credentials`
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.additions
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.all
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.anonymous
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.ascending
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.assertive
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.async
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.auto
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.both
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.copy
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.date
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.decimal
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.descending
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.dialog
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.eager
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.email
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.execute
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.grammar
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.grid
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.horizontal
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.inherit
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.link
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.list
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.listbox
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.location
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.menu
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.mixed
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.move
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.no
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.none
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.numeric
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.off
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.on
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.origin
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.other
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.page
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.polite
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.popup
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.removals
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.search
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.spelling
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.step
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.sync
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.tel
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.text
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.time
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.tree
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.url
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.vertical
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-lazy-load-image-component.react-lazy-load-image-component.CommonProps */
/* Inlined parent std.Omit<react.react.ImgHTMLAttributes<std.HTMLImageElement>, 'placeholder' | 'onload'> */
trait LazyLoadImageProps extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  /** Function called after the image has been completely loaded. */
  var afterLoad: js.UndefOr[js.Function0[_]] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  /** Function called right before the placeholder is replaced with the image element. */
  var beforeLoad: js.UndefOr[js.Function0[_]] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var decoding: js.UndefOr[async | auto | sync] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  /* Method from lodash to use to delay the scroll/resize events. */
  var delayMethod: js.UndefOr[DelayMethod] = js.undefined
  /** Time in ms sent to the delayMethod. */
  var delayTime: js.UndefOr[Double] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  /** Name of the effect to use. Requires importing CSS, see README.md. */
  var effect: js.UndefOr[Effect] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[eager | `lazy`] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLImageElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLImageElement]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLImageElement]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLImageElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLImageElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLImageElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLImageElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLImageElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLImageElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLImageElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLImageElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLImageElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLImageElement]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLImageElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[HTMLImageElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLImageElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLImageElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLImageElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLImageElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLImageElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[HTMLImageElement]] = js.undefined
  /** React element to use as a placeholder. Default is <span>. */
  var placeholder: js.UndefOr[Element | Null] = js.undefined
  /** Image src to display while the image is not visible or loaded. */
  var placeholderSrc: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var referrerPolicy: js.UndefOr[`no-referrer` | origin | `unsafe-url`] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  /** See trackWindowScroll(). */
  var scrollPosition: js.UndefOr[ScrollPosition] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcSet: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  /** Threshold in pixels. So the image starts loading before it appears in the viewport. */
  var threshold: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  /** Whether to use browser's IntersectionObserver when available. */
  var useIntersectionObserver: js.UndefOr[Boolean] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  /** Whether the image must be visible from the beginning. */
  var visibleByDefault: js.UndefOr[Boolean] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  /** In some occasions (for example, when using a placeholderSrc) a wrapper span tag is rendered. This prop allows setting a class to that element. */
  var wrapperClassName: js.UndefOr[String] = js.undefined
}

object LazyLoadImageProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    afterLoad: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    alt: String = null,
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
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    beforeLoad: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    crossOrigin: anonymous | `use-credentials` | _empty = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    decoding: async | auto | sync = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    delayMethod: DelayMethod = null,
    delayTime: Int | Double = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    effect: Effect = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    loading: eager | `lazy` = null,
    onAbort: ReactEventFrom[HTMLImageElement] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[HTMLImageElement] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[HTMLImageElement] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[HTMLImageElement] => Callback = null,
    onAuxClick: ReactMouseEventFrom[HTMLImageElement] => Callback = null,
    onBeforeInput: ReactEventFrom[HTMLImageElement] => Callback = null,
    onBlur: ReactFocusEventFrom[HTMLImageElement] => Callback = null,
    onCanPlay: ReactEventFrom[HTMLImageElement] => Callback = null,
    onCanPlayThrough: ReactEventFrom[HTMLImageElement] => Callback = null,
    onChange: ReactEventFrom[HTMLImageElement] => Callback = null,
    onClick: ReactMouseEventFrom[HTMLImageElement] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[HTMLImageElement] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[HTMLImageElement] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[HTMLImageElement] => Callback = null,
    onContextMenu: ReactMouseEventFrom[HTMLImageElement] => Callback = null,
    onCopy: ReactClipboardEventFrom[HTMLImageElement] => Callback = null,
    onCut: ReactClipboardEventFrom[HTMLImageElement] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[HTMLImageElement] => Callback = null,
    onDrag: ReactDragEventFrom[HTMLImageElement] => Callback = null,
    onDragEnd: ReactDragEventFrom[HTMLImageElement] => Callback = null,
    onDragEnter: ReactDragEventFrom[HTMLImageElement] => Callback = null,
    onDragExit: ReactDragEventFrom[HTMLImageElement] => Callback = null,
    onDragLeave: ReactDragEventFrom[HTMLImageElement] => Callback = null,
    onDragOver: ReactDragEventFrom[HTMLImageElement] => Callback = null,
    onDragStart: ReactDragEventFrom[HTMLImageElement] => Callback = null,
    onDrop: ReactDragEventFrom[HTMLImageElement] => Callback = null,
    onDurationChange: ReactEventFrom[HTMLImageElement] => Callback = null,
    onEmptied: ReactEventFrom[HTMLImageElement] => Callback = null,
    onEncrypted: ReactEventFrom[HTMLImageElement] => Callback = null,
    onEnded: ReactEventFrom[HTMLImageElement] => Callback = null,
    onError: ReactEventFrom[HTMLImageElement] => Callback = null,
    onFocus: ReactFocusEventFrom[HTMLImageElement] => Callback = null,
    onInput: ReactEventFrom[HTMLImageElement] => Callback = null,
    onInvalid: ReactEventFrom[HTMLImageElement] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[HTMLImageElement] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[HTMLImageElement] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[HTMLImageElement] => Callback = null,
    onLoad: ReactEventFrom[HTMLImageElement] => Callback = null,
    onLoadStart: ReactEventFrom[HTMLImageElement] => Callback = null,
    onLoadedData: ReactEventFrom[HTMLImageElement] => Callback = null,
    onLoadedMetadata: ReactEventFrom[HTMLImageElement] => Callback = null,
    onMouseDown: ReactMouseEventFrom[HTMLImageElement] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[HTMLImageElement] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[HTMLImageElement] => Callback = null,
    onMouseMove: ReactMouseEventFrom[HTMLImageElement] => Callback = null,
    onMouseOut: ReactMouseEventFrom[HTMLImageElement] => Callback = null,
    onMouseOver: ReactMouseEventFrom[HTMLImageElement] => Callback = null,
    onMouseUp: ReactMouseEventFrom[HTMLImageElement] => Callback = null,
    onPaste: ReactClipboardEventFrom[HTMLImageElement] => Callback = null,
    onPause: ReactEventFrom[HTMLImageElement] => Callback = null,
    onPlay: ReactEventFrom[HTMLImageElement] => Callback = null,
    onPlaying: ReactEventFrom[HTMLImageElement] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[HTMLImageElement] => Callback = null,
    onPointerDown: ReactPointerEventFrom[HTMLImageElement] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[HTMLImageElement] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[HTMLImageElement] => Callback = null,
    onPointerMove: ReactPointerEventFrom[HTMLImageElement] => Callback = null,
    onPointerOut: ReactPointerEventFrom[HTMLImageElement] => Callback = null,
    onPointerOver: ReactPointerEventFrom[HTMLImageElement] => Callback = null,
    onPointerUp: ReactPointerEventFrom[HTMLImageElement] => Callback = null,
    onProgress: ReactEventFrom[HTMLImageElement] => Callback = null,
    onRateChange: ReactEventFrom[HTMLImageElement] => Callback = null,
    onReset: ReactEventFrom[HTMLImageElement] => Callback = null,
    onScroll: ReactUIEventFrom[HTMLImageElement] => Callback = null,
    onSeeked: ReactEventFrom[HTMLImageElement] => Callback = null,
    onSeeking: ReactEventFrom[HTMLImageElement] => Callback = null,
    onSelect: ReactEventFrom[HTMLImageElement] => Callback = null,
    onStalled: ReactEventFrom[HTMLImageElement] => Callback = null,
    onSubmit: ReactEventFrom[HTMLImageElement] => Callback = null,
    onSuspend: ReactEventFrom[HTMLImageElement] => Callback = null,
    onTimeUpdate: ReactEventFrom[HTMLImageElement] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[HTMLImageElement] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[HTMLImageElement] => Callback = null,
    onTouchMove: ReactTouchEventFrom[HTMLImageElement] => Callback = null,
    onTouchStart: ReactTouchEventFrom[HTMLImageElement] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[HTMLImageElement] => Callback = null,
    onVolumeChange: ReactEventFrom[HTMLImageElement] => Callback = null,
    onWaiting: ReactEventFrom[HTMLImageElement] => Callback = null,
    onWheel: ReactWheelEventFrom[HTMLImageElement] => Callback = null,
    placeholder: VdomElement = null,
    placeholderSrc: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    referrerPolicy: `no-referrer` | origin | `unsafe-url` = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    scrollPosition: ScrollPosition = null,
    security: String = null,
    sizes: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    srcSet: String = null,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    threshold: Int | Double = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    useIntersectionObserver: js.UndefOr[Boolean] = js.undefined,
    useMap: String = null,
    visibleByDefault: js.UndefOr[Boolean] = js.undefined,
    vocab: String = null,
    width: Double | String = null,
    wrapperClassName: String = null
  ): LazyLoadImageProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    afterLoad.foreach(p => __obj.updateDynamic("afterLoad")(p.toJsFn))
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
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
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    beforeLoad.foreach(p => __obj.updateDynamic("beforeLoad")(p.toJsFn))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (decoding != null) __obj.updateDynamic("decoding")(decoding.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delayMethod != null) __obj.updateDynamic("delayMethod")(delayMethod.asInstanceOf[js.Any])
    if (delayTime != null) __obj.updateDynamic("delayTime")(delayTime.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onRateChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onWheel(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.rawElement.asInstanceOf[js.Any])
    if (placeholderSrc != null) __obj.updateDynamic("placeholderSrc")(placeholderSrc.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (!js.isUndefined(useIntersectionObserver)) __obj.updateDynamic("useIntersectionObserver")(useIntersectionObserver.asInstanceOf[js.Any])
    if (useMap != null) __obj.updateDynamic("useMap")(useMap.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleByDefault)) __obj.updateDynamic("visibleByDefault")(visibleByDefault.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyLoadImageProps]
  }
}

