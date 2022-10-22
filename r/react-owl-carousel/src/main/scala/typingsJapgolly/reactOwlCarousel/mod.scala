package typingsJapgolly.reactOwlCarousel

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
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.Component
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
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.`additions removals`
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.`additions text`
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.`inline`
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.`removals additions`
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.`removals text`
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.`text additions`
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.`text removals`
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
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.environment
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
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.user
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.vertical
import typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.yes
import typingsJapgolly.reactOwlCarousel.umdOptionsMod.HandlerCallback
import typingsJapgolly.reactOwlCarousel.umdOptionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-owl-carousel", JSImport.Default)
  @js.native
  open class default protected () extends ReactOwlCarousel {
    def this(props: OwlCarouselProps) = this()
  }
  
  /* Inlined std.Readonly<react.react.AllHTMLAttributes<std.HTMLDivElement> & {  children :react.react.ReactNode}> */
  trait ComponentProps extends StObject {
    
    val default: js.UndefOr[Boolean] = js.undefined
    
    val about: js.UndefOr[String] = js.undefined
    
    val accept: js.UndefOr[String] = js.undefined
    
    val acceptCharset: js.UndefOr[String] = js.undefined
    
    val accessKey: js.UndefOr[String] = js.undefined
    
    val action: js.UndefOr[String] = js.undefined
    
    val allowFullScreen: js.UndefOr[Boolean] = js.undefined
    
    val allowTransparency: js.UndefOr[Boolean] = js.undefined
    
    val alt: js.UndefOr[String] = js.undefined
    
    val `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    val `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-autocomplete`: js.UndefOr[
        none | `inline` | typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.list | both
      ] = js.undefined
    
    val `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
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
    
    val `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    val `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    val `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-flowto`: js.UndefOr[String] = js.undefined
    
    val `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    val `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    val `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    val `aria-label`: js.UndefOr[String] = js.undefined
    
    val `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    val `aria-level`: js.UndefOr[Double] = js.undefined
    
    val `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    val `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    val `aria-owns`: js.UndefOr[String] = js.undefined
    
    val `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    val `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    val `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    val `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    val `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    val `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    val `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    val `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    val `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
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
    
    val autoPlay: js.UndefOr[Boolean] = js.undefined
    
    val autoSave: js.UndefOr[String] = js.undefined
    
    val capture: js.UndefOr[Boolean | user | environment] = js.undefined
    
    val cellPadding: js.UndefOr[Double | String] = js.undefined
    
    val cellSpacing: js.UndefOr[Double | String] = js.undefined
    
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
    
    val coords: js.UndefOr[String] = js.undefined
    
    val crossOrigin: js.UndefOr[String] = js.undefined
    
    val dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    val data: js.UndefOr[String] = js.undefined
    
    val datatype: js.UndefOr[String] = js.undefined
    
    val dateTime: js.UndefOr[String] = js.undefined
    
    val defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    val defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    val defer: js.UndefOr[Boolean] = js.undefined
    
    val dir: js.UndefOr[String] = js.undefined
    
    val disabled: js.UndefOr[Boolean] = js.undefined
    
    val download: js.UndefOr[Any] = js.undefined
    
    val draggable: js.UndefOr[Booleanish] = js.undefined
    
    val encType: js.UndefOr[String] = js.undefined
    
    val form: js.UndefOr[String] = js.undefined
    
    val formAction: js.UndefOr[String] = js.undefined
    
    val formEncType: js.UndefOr[String] = js.undefined
    
    val formMethod: js.UndefOr[String] = js.undefined
    
    val formNoValidate: js.UndefOr[Boolean] = js.undefined
    
    val formTarget: js.UndefOr[String] = js.undefined
    
    val frameBorder: js.UndefOr[Double | String] = js.undefined
    
    val headers: js.UndefOr[String] = js.undefined
    
    val height: js.UndefOr[Double | String] = js.undefined
    
    val hidden: js.UndefOr[Boolean] = js.undefined
    
    val high: js.UndefOr[Double] = js.undefined
    
    val href: js.UndefOr[String] = js.undefined
    
    val hrefLang: js.UndefOr[String] = js.undefined
    
    val htmlFor: js.UndefOr[String] = js.undefined
    
    val httpEquiv: js.UndefOr[String] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val inlist: js.UndefOr[Any] = js.undefined
    
    val inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    val integrity: js.UndefOr[String] = js.undefined
    
    val is: js.UndefOr[String] = js.undefined
    
    val itemID: js.UndefOr[String] = js.undefined
    
    val itemProp: js.UndefOr[String] = js.undefined
    
    val itemRef: js.UndefOr[String] = js.undefined
    
    val itemScope: js.UndefOr[Boolean] = js.undefined
    
    val itemType: js.UndefOr[String] = js.undefined
    
    val keyParams: js.UndefOr[String] = js.undefined
    
    val keyType: js.UndefOr[String] = js.undefined
    
    val kind: js.UndefOr[String] = js.undefined
    
    val label: js.UndefOr[String] = js.undefined
    
    val lang: js.UndefOr[String] = js.undefined
    
    val list: js.UndefOr[String] = js.undefined
    
    val loop: js.UndefOr[Boolean] = js.undefined
    
    val low: js.UndefOr[Double] = js.undefined
    
    val manifest: js.UndefOr[String] = js.undefined
    
    val marginHeight: js.UndefOr[Double] = js.undefined
    
    val marginWidth: js.UndefOr[Double] = js.undefined
    
    val max: js.UndefOr[Double | String] = js.undefined
    
    val maxLength: js.UndefOr[Double] = js.undefined
    
    val media: js.UndefOr[String] = js.undefined
    
    val mediaGroup: js.UndefOr[String] = js.undefined
    
    val method: js.UndefOr[String] = js.undefined
    
    val min: js.UndefOr[Double | String] = js.undefined
    
    val minLength: js.UndefOr[Double] = js.undefined
    
    val multiple: js.UndefOr[Boolean] = js.undefined
    
    val muted: js.UndefOr[Boolean] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
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
    
    val onChange: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    val onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    val onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    val onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    val onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    val onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    val onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    val onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    val onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    val onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    val onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    val onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    val onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    val onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    val onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    val onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    val onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    val onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    val onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    val onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    val onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    val onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    val onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    val onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    val onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    val onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    val onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    val onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    val onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    val onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    val onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
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
    
    val onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    val onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.undefined
    
    val onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    val onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    val onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    val onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    val onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    val onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    val onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    val onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    val onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    val onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    val onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    val onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.undefined
    
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
    
    val radioGroup: js.UndefOr[String] = js.undefined
    
    val readOnly: js.UndefOr[Boolean] = js.undefined
    
    val rel: js.UndefOr[String] = js.undefined
    
    val required: js.UndefOr[Boolean] = js.undefined
    
    val resource: js.UndefOr[String] = js.undefined
    
    val results: js.UndefOr[Double] = js.undefined
    
    val reversed: js.UndefOr[Boolean] = js.undefined
    
    val role: js.UndefOr[AriaRole] = js.undefined
    
    val rowSpan: js.UndefOr[Double] = js.undefined
    
    val rows: js.UndefOr[Double] = js.undefined
    
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
    
    val slot: js.UndefOr[String] = js.undefined
    
    val span: js.UndefOr[Double] = js.undefined
    
    val spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    val src: js.UndefOr[String] = js.undefined
    
    val srcDoc: js.UndefOr[String] = js.undefined
    
    val srcLang: js.UndefOr[String] = js.undefined
    
    val srcSet: js.UndefOr[String] = js.undefined
    
    val start: js.UndefOr[Double] = js.undefined
    
    val step: js.UndefOr[Double | String] = js.undefined
    
    val style: js.UndefOr[CSSProperties] = js.undefined
    
    val summary: js.UndefOr[String] = js.undefined
    
    val suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    val suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    val tabIndex: js.UndefOr[Double] = js.undefined
    
    val target: js.UndefOr[String] = js.undefined
    
    val title: js.UndefOr[String] = js.undefined
    
    val translate: js.UndefOr[yes | no] = js.undefined
    
    val `type`: js.UndefOr[String] = js.undefined
    
    val typeof: js.UndefOr[String] = js.undefined
    
    val unselectable: js.UndefOr[on | off] = js.undefined
    
    val useMap: js.UndefOr[String] = js.undefined
    
    val value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    val vocab: js.UndefOr[String] = js.undefined
    
    val width: js.UndefOr[Double | String] = js.undefined
    
    val wmode: js.UndefOr[String] = js.undefined
    
    val wrap: js.UndefOr[String] = js.undefined
  }
  object ComponentProps {
    
    inline def apply(): ComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentProps]
    }
    
    extension [Self <: ComponentProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
      
      inline def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      inline def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
      
      inline def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
      
      inline def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
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
      
      inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setCapture(value: Boolean | user | environment): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      inline def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
      
      inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
      
      inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      inline def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
      
      inline def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDownload(value: Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      inline def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
      
      inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
      
      inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      inline def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
      
      inline def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
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
      
      inline def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
      
      inline def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
      
      inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      inline def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
      
      inline def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
      
      inline def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
      
      inline def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
      
      inline def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
      
      inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnAbort(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThrough(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEnd(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadStart(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnScroll(value: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: ReactTransitionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: ReactWheelEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      inline def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
      
      inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
      
      inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      inline def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
      
      inline def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
      
      inline def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
      
      inline def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
      
      inline def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
      
      inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  /* Inlined react-owl-carousel.react-owl-carousel/umd/options.Options & react-owl-carousel.react-owl-carousel.ComponentProps */
  trait OwlCarouselProps extends StObject {
    
    val default: js.UndefOr[Boolean] = js.undefined
    
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
    
    val `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-autocomplete`: js.UndefOr[
        none | `inline` | typingsJapgolly.reactOwlCarousel.reactOwlCarouselStrings.list | both
      ] = js.undefined
    
    val `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
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
    
    val `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    val `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    val `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-flowto`: js.UndefOr[String] = js.undefined
    
    val `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    val `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    val `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    val `aria-label`: js.UndefOr[String] = js.undefined
    
    val `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    val `aria-level`: js.UndefOr[Double] = js.undefined
    
    val `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    val `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    val `aria-owns`: js.UndefOr[String] = js.undefined
    
    val `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    val `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    val `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    val `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    val `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    val `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    val `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    val `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    val `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    val `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
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
    
    val capture: js.UndefOr[Boolean | user | environment] = js.undefined
    
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
    
    val dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    val data: js.UndefOr[String] = js.undefined
    
    val datatype: js.UndefOr[String] = js.undefined
    
    val dateTime: js.UndefOr[String] = js.undefined
    
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
    
    val download: js.UndefOr[Any] = js.undefined
    
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
    
    val inlist: js.UndefOr[Any] = js.undefined
    
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
    
    var onChange: js.UndefOr[HandlerCallback] & js.UndefOr[FormEventHandler[HTMLDivElement]]
    
    var onChanged: js.UndefOr[HandlerCallback] = js.undefined
    
    val onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    val onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    val onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    val onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    val onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    val onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    val onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    val onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onDrag: js.UndefOr[HandlerCallback] & js.UndefOr[DragEventHandler[HTMLDivElement]]
    
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
    
    var responsiveBaseElement: js.UndefOr[org.scalajs.dom.Element] = js.undefined
    
    var responsiveClass: js.UndefOr[String | Boolean] = js.undefined
    
    var responsiveRefreshRate: js.UndefOr[Double] = js.undefined
    
    val results: js.UndefOr[Double] = js.undefined
    
    val reversed: js.UndefOr[Boolean] = js.undefined
    
    var rewind: js.UndefOr[Boolean] = js.undefined
    
    val role: js.UndefOr[AriaRole] = js.undefined
    
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
    
    inline def apply(
      onChange: js.UndefOr[HandlerCallback] & js.UndefOr[FormEventHandler[HTMLDivElement]],
      onDrag: js.UndefOr[HandlerCallback] & js.UndefOr[DragEventHandler[HTMLDivElement]]
    ): OwlCarouselProps = {
      val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any], onDrag = onDrag.asInstanceOf[js.Any])
      __obj.asInstanceOf[OwlCarouselProps]
    }
    
    extension [Self <: OwlCarouselProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
      
      inline def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      inline def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
      
      inline def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
      
      inline def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setAnimateIn(value: String | Boolean): Self = StObject.set(x, "animateIn", value.asInstanceOf[js.Any])
      
      inline def setAnimateInUndefined: Self = StObject.set(x, "animateIn", js.undefined)
      
      inline def setAnimateOut(value: String | Boolean): Self = StObject.set(x, "animateOut", value.asInstanceOf[js.Any])
      
      inline def setAnimateOutUndefined: Self = StObject.set(x, "animateOut", js.undefined)
      
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
      
      inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoHeightClass(value: String): Self = StObject.set(x, "autoHeightClass", value.asInstanceOf[js.Any])
      
      inline def setAutoHeightClassUndefined: Self = StObject.set(x, "autoHeightClass", js.undefined)
      
      inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      inline def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
      
      inline def setAutoplayHoverPause(value: Boolean): Self = StObject.set(x, "autoplayHoverPause", value.asInstanceOf[js.Any])
      
      inline def setAutoplayHoverPauseUndefined: Self = StObject.set(x, "autoplayHoverPause", js.undefined)
      
      inline def setAutoplaySpeed(value: Double | Boolean): Self = StObject.set(x, "autoplaySpeed", value.asInstanceOf[js.Any])
      
      inline def setAutoplaySpeedUndefined: Self = StObject.set(x, "autoplaySpeed", js.undefined)
      
      inline def setAutoplayTimeout(value: Double): Self = StObject.set(x, "autoplayTimeout", value.asInstanceOf[js.Any])
      
      inline def setAutoplayTimeoutUndefined: Self = StObject.set(x, "autoplayTimeout", js.undefined)
      
      inline def setCallbacks(value: Boolean): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setCapture(value: Boolean | user | environment): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      inline def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
      
      inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
      
      inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      inline def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
      
      inline def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsClass(value: String): Self = StObject.set(x, "controlsClass", value.asInstanceOf[js.Any])
      
      inline def setControlsClassUndefined: Self = StObject.set(x, "controlsClass", js.undefined)
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDotClass(value: String): Self = StObject.set(x, "dotClass", value.asInstanceOf[js.Any])
      
      inline def setDotClassUndefined: Self = StObject.set(x, "dotClass", js.undefined)
      
      inline def setDotData(value: Boolean): Self = StObject.set(x, "dotData", value.asInstanceOf[js.Any])
      
      inline def setDotDataUndefined: Self = StObject.set(x, "dotData", js.undefined)
      
      inline def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      inline def setDotsClass(value: String): Self = StObject.set(x, "dotsClass", value.asInstanceOf[js.Any])
      
      inline def setDotsClassUndefined: Self = StObject.set(x, "dotsClass", js.undefined)
      
      inline def setDotsContainer(value: String | Boolean): Self = StObject.set(x, "dotsContainer", value.asInstanceOf[js.Any])
      
      inline def setDotsContainerUndefined: Self = StObject.set(x, "dotsContainer", js.undefined)
      
      inline def setDotsEach(value: Double | Boolean): Self = StObject.set(x, "dotsEach", value.asInstanceOf[js.Any])
      
      inline def setDotsEachUndefined: Self = StObject.set(x, "dotsEach", js.undefined)
      
      inline def setDotsSpeed(value: Double | Boolean): Self = StObject.set(x, "dotsSpeed", value.asInstanceOf[js.Any])
      
      inline def setDotsSpeedUndefined: Self = StObject.set(x, "dotsSpeed", js.undefined)
      
      inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      inline def setDownload(value: Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setDragClass(value: String): Self = StObject.set(x, "dragClass", value.asInstanceOf[js.Any])
      
      inline def setDragClassUndefined: Self = StObject.set(x, "dragClass", js.undefined)
      
      inline def setDragEndSpeed(value: Double | Boolean): Self = StObject.set(x, "dragEndSpeed", value.asInstanceOf[js.Any])
      
      inline def setDragEndSpeedUndefined: Self = StObject.set(x, "dragEndSpeed", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      inline def setFallbackEasing(value: String): Self = StObject.set(x, "fallbackEasing", value.asInstanceOf[js.Any])
      
      inline def setFallbackEasingUndefined: Self = StObject.set(x, "fallbackEasing", js.undefined)
      
      inline def setFluidSpeed(value: Double | Boolean): Self = StObject.set(x, "fluidSpeed", value.asInstanceOf[js.Any])
      
      inline def setFluidSpeedUndefined: Self = StObject.set(x, "fluidSpeed", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      inline def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
      
      inline def setFreeDrag(value: Boolean): Self = StObject.set(x, "freeDrag", value.asInstanceOf[js.Any])
      
      inline def setFreeDragUndefined: Self = StObject.set(x, "freeDrag", js.undefined)
      
      inline def setGrabClass(value: String): Self = StObject.set(x, "grabClass", value.asInstanceOf[js.Any])
      
      inline def setGrabClassUndefined: Self = StObject.set(x, "grabClass", js.undefined)
      
      inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
      
      inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      inline def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
      
      inline def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInfo(value: HandlerCallback): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemElement(value: String): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
      
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
      
      inline def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
      
      inline def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
      
      inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLazyContent(value: Boolean): Self = StObject.set(x, "lazyContent", value.asInstanceOf[js.Any])
      
      inline def setLazyContentUndefined: Self = StObject.set(x, "lazyContent", js.undefined)
      
      inline def setLazyLoad(value: Boolean): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
      
      inline def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setLoadedClass(value: String): Self = StObject.set(x, "loadedClass", value.asInstanceOf[js.Any])
      
      inline def setLoadedClassUndefined: Self = StObject.set(x, "loadedClass", js.undefined)
      
      inline def setLoadingClass(value: String): Self = StObject.set(x, "loadingClass", value.asInstanceOf[js.Any])
      
      inline def setLoadingClassUndefined: Self = StObject.set(x, "loadingClass", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
      
      inline def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
      
      inline def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
      
      inline def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeFit(value: Boolean): Self = StObject.set(x, "mergeFit", value.asInstanceOf[js.Any])
      
      inline def setMergeFitUndefined: Self = StObject.set(x, "mergeFit", js.undefined)
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMouseDrag(value: Boolean): Self = StObject.set(x, "mouseDrag", value.asInstanceOf[js.Any])
      
      inline def setMouseDragUndefined: Self = StObject.set(x, "mouseDrag", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNav(value: Boolean): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      inline def setNavClass(value: js.Array[String]): Self = StObject.set(x, "navClass", value.asInstanceOf[js.Any])
      
      inline def setNavClassUndefined: Self = StObject.set(x, "navClass", js.undefined)
      
      inline def setNavClassVarargs(value: String*): Self = StObject.set(x, "navClass", js.Array(value*))
      
      inline def setNavContainer(value: String | Boolean): Self = StObject.set(x, "navContainer", value.asInstanceOf[js.Any])
      
      inline def setNavContainerClass(value: String): Self = StObject.set(x, "navContainerClass", value.asInstanceOf[js.Any])
      
      inline def setNavContainerClassUndefined: Self = StObject.set(x, "navContainerClass", js.undefined)
      
      inline def setNavContainerUndefined: Self = StObject.set(x, "navContainer", js.undefined)
      
      inline def setNavElement(value: String): Self = StObject.set(x, "navElement", value.asInstanceOf[js.Any])
      
      inline def setNavElementUndefined: Self = StObject.set(x, "navElement", js.undefined)
      
      inline def setNavSpeed(value: Double | Boolean): Self = StObject.set(x, "navSpeed", value.asInstanceOf[js.Any])
      
      inline def setNavSpeedUndefined: Self = StObject.set(x, "navSpeed", js.undefined)
      
      inline def setNavText(value: js.Array[String]): Self = StObject.set(x, "navText", value.asInstanceOf[js.Any])
      
      inline def setNavTextUndefined: Self = StObject.set(x, "navText", js.undefined)
      
      inline def setNavTextVarargs(value: String*): Self = StObject.set(x, "navText", js.Array(value*))
      
      inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      inline def setNestedItemSelector(value: String): Self = StObject.set(x, "nestedItemSelector", value.asInstanceOf[js.Any])
      
      inline def setNestedItemSelectorUndefined: Self = StObject.set(x, "nestedItemSelector", js.undefined)
      
      inline def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
      
      inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnAbort(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThrough(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: js.UndefOr[HandlerCallback] & js.UndefOr[FormEventHandler[HTMLDivElement]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChanged(value: HandlerCallback): Self = StObject.set(x, "onChanged", value.asInstanceOf[js.Any])
      
      inline def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: js.UndefOr[HandlerCallback] & js.UndefOr[DragEventHandler[HTMLDivElement]]): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
      
      inline def setOnDragEnd(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragged(value: HandlerCallback): Self = StObject.set(x, "onDragged", value.asInstanceOf[js.Any])
      
      inline def setOnDraggedUndefined: Self = StObject.set(x, "onDragged", js.undefined)
      
      inline def setOnDrop(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInitialize(value: HandlerCallback): Self = StObject.set(x, "onInitialize", value.asInstanceOf[js.Any])
      
      inline def setOnInitializeUndefined: Self = StObject.set(x, "onInitialize", js.undefined)
      
      inline def setOnInitialized(value: HandlerCallback): Self = StObject.set(x, "onInitialized", value.asInstanceOf[js.Any])
      
      inline def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
      
      inline def setOnInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadLazy(value: HandlerCallback): Self = StObject.set(x, "onLoadLazy", value.asInstanceOf[js.Any])
      
      inline def setOnLoadLazyUndefined: Self = StObject.set(x, "onLoadLazy", js.undefined)
      
      inline def setOnLoadStart(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedLazy(value: HandlerCallback): Self = StObject.set(x, "onLoadedLazy", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedLazyUndefined: Self = StObject.set(x, "onLoadedLazy", js.undefined)
      
      inline def setOnLoadedMetadata(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlayVideo(value: HandlerCallback): Self = StObject.set(x, "onPlayVideo", value.asInstanceOf[js.Any])
      
      inline def setOnPlayVideoUndefined: Self = StObject.set(x, "onPlayVideo", js.undefined)
      
      inline def setOnPlaying(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnRefresh(value: HandlerCallback): Self = StObject.set(x, "onRefresh", value.asInstanceOf[js.Any])
      
      inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      inline def setOnRefreshed(value: HandlerCallback): Self = StObject.set(x, "onRefreshed", value.asInstanceOf[js.Any])
      
      inline def setOnRefreshedUndefined: Self = StObject.set(x, "onRefreshed", js.undefined)
      
      inline def setOnReset(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnResize(value: HandlerCallback): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnResized(value: HandlerCallback): Self = StObject.set(x, "onResized", value.asInstanceOf[js.Any])
      
      inline def setOnResizedUndefined: Self = StObject.set(x, "onResized", js.undefined)
      
      inline def setOnScroll(value: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnStopVideo(value: HandlerCallback): Self = StObject.set(x, "onStopVideo", value.asInstanceOf[js.Any])
      
      inline def setOnStopVideoUndefined: Self = StObject.set(x, "onStopVideo", js.undefined)
      
      inline def setOnSubmit(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: ReactTransitionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnTranslate(value: HandlerCallback): Self = StObject.set(x, "onTranslate", value.asInstanceOf[js.Any])
      
      inline def setOnTranslateUndefined: Self = StObject.set(x, "onTranslate", js.undefined)
      
      inline def setOnTranslated(value: HandlerCallback): Self = StObject.set(x, "onTranslated", value.asInstanceOf[js.Any])
      
      inline def setOnTranslatedUndefined: Self = StObject.set(x, "onTranslated", js.undefined)
      
      inline def setOnVolumeChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: ReactWheelEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      inline def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
      
      inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
      
      inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setPullDrag(value: Boolean): Self = StObject.set(x, "pullDrag", value.asInstanceOf[js.Any])
      
      inline def setPullDragUndefined: Self = StObject.set(x, "pullDrag", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRefreshClass(value: String): Self = StObject.set(x, "refreshClass", value.asInstanceOf[js.Any])
      
      inline def setRefreshClassUndefined: Self = StObject.set(x, "refreshClass", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResponsive(value: StringDictionary[Options]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveBaseElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "responsiveBaseElement", value.asInstanceOf[js.Any])
      
      inline def setResponsiveBaseElementUndefined: Self = StObject.set(x, "responsiveBaseElement", js.undefined)
      
      inline def setResponsiveClass(value: String | Boolean): Self = StObject.set(x, "responsiveClass", value.asInstanceOf[js.Any])
      
      inline def setResponsiveClassUndefined: Self = StObject.set(x, "responsiveClass", js.undefined)
      
      inline def setResponsiveRefreshRate(value: Double): Self = StObject.set(x, "responsiveRefreshRate", value.asInstanceOf[js.Any])
      
      inline def setResponsiveRefreshRateUndefined: Self = StObject.set(x, "responsiveRefreshRate", js.undefined)
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
      
      inline def setRewindUndefined: Self = StObject.set(x, "rewind", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRtlClass(value: String): Self = StObject.set(x, "rtlClass", value.asInstanceOf[js.Any])
      
      inline def setRtlClassUndefined: Self = StObject.set(x, "rtlClass", js.undefined)
      
      inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      inline def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
      
      inline def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSlideBy(value: Double | String): Self = StObject.set(x, "slideBy", value.asInstanceOf[js.Any])
      
      inline def setSlideByUndefined: Self = StObject.set(x, "slideBy", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSmartSpeed(value: Double | Boolean): Self = StObject.set(x, "smartSpeed", value.asInstanceOf[js.Any])
      
      inline def setSmartSpeedUndefined: Self = StObject.set(x, "smartSpeed", js.undefined)
      
      inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
      
      inline def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
      
      inline def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
      
      inline def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStageClass(value: String): Self = StObject.set(x, "stageClass", value.asInstanceOf[js.Any])
      
      inline def setStageClassUndefined: Self = StObject.set(x, "stageClass", js.undefined)
      
      inline def setStageElement(value: String): Self = StObject.set(x, "stageElement", value.asInstanceOf[js.Any])
      
      inline def setStageElementUndefined: Self = StObject.set(x, "stageElement", js.undefined)
      
      inline def setStageOuterClass(value: String): Self = StObject.set(x, "stageOuterClass", value.asInstanceOf[js.Any])
      
      inline def setStageOuterClassUndefined: Self = StObject.set(x, "stageOuterClass", js.undefined)
      
      inline def setStagePadding(value: Double): Self = StObject.set(x, "stagePadding", value.asInstanceOf[js.Any])
      
      inline def setStagePaddingUndefined: Self = StObject.set(x, "stagePadding", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartPosition(value: Double | String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
      
      inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTouchDrag(value: Boolean): Self = StObject.set(x, "touchDrag", value.asInstanceOf[js.Any])
      
      inline def setTouchDragUndefined: Self = StObject.set(x, "touchDrag", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setURLhashListener(value: Boolean): Self = StObject.set(x, "URLhashListener", value.asInstanceOf[js.Any])
      
      inline def setURLhashListenerUndefined: Self = StObject.set(x, "URLhashListener", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoHeight(value: Double | Boolean): Self = StObject.set(x, "videoHeight", value.asInstanceOf[js.Any])
      
      inline def setVideoHeightUndefined: Self = StObject.set(x, "videoHeight", js.undefined)
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      inline def setVideoWidth(value: Double | Boolean): Self = StObject.set(x, "videoWidth", value.asInstanceOf[js.Any])
      
      inline def setVideoWidthUndefined: Self = StObject.set(x, "videoWidth", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
      
      inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait ReactOwlCarousel
    extends Component[OwlCarouselProps, js.Object, Any] {
    
    @JSName("$ele")
    var $ele: js.UndefOr[JQuery[HTMLElement]] = js.native
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MReactOwlCarousel(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MReactOwlCarousel(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MReactOwlCarousel(): Unit = js.native
    
    /* private */ var container: Any = js.native
    
    /* private */ var containerRef: Any = js.native
    
    def create(): Unit = js.native
    def create(options: Options): Unit = js.native
    
    def destory(): Unit = js.native
    
    def next(speed: js.Array[Double]): Unit = js.native
    def next(speed: Double): Unit = js.native
    
    /* private */ var options: Any = js.native
    
    def play(timeout: Double, speed: Double): Unit = js.native
    
    def prev(speed: js.Array[Double]): Unit = js.native
    def prev(speed: Double): Unit = js.native
    
    /* private */ var propsWithoutOptions: Any = js.native
    
    def stop(): Unit = js.native
    
    def to(position: Double, speed: Double): Unit = js.native
  }
}
