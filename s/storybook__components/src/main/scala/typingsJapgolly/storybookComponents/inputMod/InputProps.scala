package typingsJapgolly.storybookComponents.inputMod

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
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.react.mod.TransitionEventHandler
import typingsJapgolly.react.mod.UIEventHandler
import typingsJapgolly.react.mod.WheelEventHandler
import typingsJapgolly.storybookComponents.storybookComponentsStrings.`additions text`
import typingsJapgolly.storybookComponents.storybookComponentsStrings.`inline`
import typingsJapgolly.storybookComponents.storybookComponentsStrings.additions
import typingsJapgolly.storybookComponents.storybookComponentsStrings.all
import typingsJapgolly.storybookComponents.storybookComponentsStrings.ascending
import typingsJapgolly.storybookComponents.storybookComponentsStrings.assertive
import typingsJapgolly.storybookComponents.storybookComponentsStrings.both
import typingsJapgolly.storybookComponents.storybookComponentsStrings.copy
import typingsJapgolly.storybookComponents.storybookComponentsStrings.date
import typingsJapgolly.storybookComponents.storybookComponentsStrings.decimal
import typingsJapgolly.storybookComponents.storybookComponentsStrings.descending
import typingsJapgolly.storybookComponents.storybookComponentsStrings.dialog
import typingsJapgolly.storybookComponents.storybookComponentsStrings.email
import typingsJapgolly.storybookComponents.storybookComponentsStrings.execute
import typingsJapgolly.storybookComponents.storybookComponentsStrings.grammar
import typingsJapgolly.storybookComponents.storybookComponentsStrings.grid
import typingsJapgolly.storybookComponents.storybookComponentsStrings.horizontal
import typingsJapgolly.storybookComponents.storybookComponentsStrings.inherit
import typingsJapgolly.storybookComponents.storybookComponentsStrings.link
import typingsJapgolly.storybookComponents.storybookComponentsStrings.list
import typingsJapgolly.storybookComponents.storybookComponentsStrings.listbox
import typingsJapgolly.storybookComponents.storybookComponentsStrings.location
import typingsJapgolly.storybookComponents.storybookComponentsStrings.menu
import typingsJapgolly.storybookComponents.storybookComponentsStrings.mixed
import typingsJapgolly.storybookComponents.storybookComponentsStrings.move
import typingsJapgolly.storybookComponents.storybookComponentsStrings.no
import typingsJapgolly.storybookComponents.storybookComponentsStrings.none
import typingsJapgolly.storybookComponents.storybookComponentsStrings.numeric
import typingsJapgolly.storybookComponents.storybookComponentsStrings.off
import typingsJapgolly.storybookComponents.storybookComponentsStrings.on
import typingsJapgolly.storybookComponents.storybookComponentsStrings.other
import typingsJapgolly.storybookComponents.storybookComponentsStrings.page
import typingsJapgolly.storybookComponents.storybookComponentsStrings.polite
import typingsJapgolly.storybookComponents.storybookComponentsStrings.popup
import typingsJapgolly.storybookComponents.storybookComponentsStrings.removals
import typingsJapgolly.storybookComponents.storybookComponentsStrings.search
import typingsJapgolly.storybookComponents.storybookComponentsStrings.spelling
import typingsJapgolly.storybookComponents.storybookComponentsStrings.step
import typingsJapgolly.storybookComponents.storybookComponentsStrings.tel
import typingsJapgolly.storybookComponents.storybookComponentsStrings.text
import typingsJapgolly.storybookComponents.storybookComponentsStrings.time
import typingsJapgolly.storybookComponents.storybookComponentsStrings.tree
import typingsJapgolly.storybookComponents.storybookComponentsStrings.url
import typingsJapgolly.storybookComponents.storybookComponentsStrings.vertical
import typingsJapgolly.storybookComponents.storybookComponentsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<react.react.HTMLProps<std.HTMLInputElement>, keyof @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps */
@js.native
trait InputProps extends js.Object {
  var about: js.UndefOr[String] = js.native
  var accept: js.UndefOr[String] = js.native
  var acceptCharset: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var action: js.UndefOr[String] = js.native
  var align: js.UndefOr[Alignments] = js.native
  var allowFullScreen: js.UndefOr[Boolean] = js.native
  var allowTransparency: js.UndefOr[Boolean] = js.native
  var alt: js.UndefOr[String] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var `aria-level`: js.UndefOr[Double] = js.native
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  var `aria-owns`: js.UndefOr[String] = js.native
  var `aria-placeholder`: js.UndefOr[String] = js.native
  var `aria-posinset`: js.UndefOr[Double] = js.native
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  var `aria-required`: js.UndefOr[Boolean] = js.native
  var `aria-roledescription`: js.UndefOr[String] = js.native
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  var `aria-setsize`: js.UndefOr[Double] = js.native
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var as: js.UndefOr[String] = js.native
  var async: js.UndefOr[Boolean] = js.native
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autoPlay: js.UndefOr[Boolean] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var capture: js.UndefOr[Boolean | String] = js.native
  var cellPadding: js.UndefOr[Double | String] = js.native
  var cellSpacing: js.UndefOr[Double | String] = js.native
  var challenge: js.UndefOr[String] = js.native
  var charSet: js.UndefOr[String] = js.native
  var checked: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[Node] = js.native
  var cite: js.UndefOr[String] = js.native
  var classID: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  var color: js.UndefOr[String] = js.native
  var cols: js.UndefOr[Double] = js.native
  var content: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var controls: js.UndefOr[Boolean] = js.native
  var coords: js.UndefOr[String] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.native
  var data: js.UndefOr[String] = js.native
  var datatype: js.UndefOr[String] = js.native
  var dateTime: js.UndefOr[String] = js.native
  var default: js.UndefOr[Boolean] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var defer: js.UndefOr[Boolean] = js.native
  var dir: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var download: js.UndefOr[js.Any] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var encType: js.UndefOr[String] = js.native
  var form: js.UndefOr[String] = js.native
  var formAction: js.UndefOr[String] = js.native
  var formEncType: js.UndefOr[String] = js.native
  var formMethod: js.UndefOr[String] = js.native
  var formNoValidate: js.UndefOr[Boolean] = js.native
  var formTarget: js.UndefOr[String] = js.native
  var frameBorder: js.UndefOr[Double | String] = js.native
  var headers: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var high: js.UndefOr[Double] = js.native
  var href: js.UndefOr[String] = js.native
  var hrefLang: js.UndefOr[String] = js.native
  var htmlFor: js.UndefOr[String] = js.native
  var httpEquiv: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var integrity: js.UndefOr[String] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var key: js.UndefOr[Key] = js.native
  var keyParams: js.UndefOr[String] = js.native
  var keyType: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var list: js.UndefOr[String] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var low: js.UndefOr[Double] = js.native
  var manifest: js.UndefOr[String] = js.native
  var marginHeight: js.UndefOr[Double] = js.native
  var marginWidth: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double | String] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var media: js.UndefOr[String] = js.native
  var mediaGroup: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var min: js.UndefOr[Double | String] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var noValidate: js.UndefOr[Boolean] = js.native
  var nonce: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var optimum: js.UndefOr[Double] = js.native
  var pattern: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var playsInline: js.UndefOr[Boolean] = js.native
  var poster: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var preload: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var ref: js.UndefOr[LegacyRef[HTMLInputElement]] = js.native
  var rel: js.UndefOr[String] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var reversed: js.UndefOr[Boolean] = js.native
  var role: js.UndefOr[String] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var rows: js.UndefOr[Double] = js.native
  var sandbox: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var scoped: js.UndefOr[Boolean] = js.native
  var scrolling: js.UndefOr[String] = js.native
  var seamless: js.UndefOr[Boolean] = js.native
  var security: js.UndefOr[String] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var shape: js.UndefOr[String] = js.native
  var size: js.UndefOr[Sizes] = js.native
  var sizes: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var span: js.UndefOr[Double] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var src: js.UndefOr[String] = js.native
  var srcDoc: js.UndefOr[String] = js.native
  var srcLang: js.UndefOr[String] = js.native
  var srcSet: js.UndefOr[String] = js.native
  var start: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double | String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var summary: js.UndefOr[String] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var target: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var `type`: js.UndefOr[String] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var useMap: js.UndefOr[String] = js.native
  var valid: js.UndefOr[ValidationStates] = js.native
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
  var vocab: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var wmode: js.UndefOr[String] = js.native
  var wrap: js.UndefOr[String] = js.native
}

object InputProps {
  @scala.inline
  def apply(
    about: String = null,
    accept: String = null,
    acceptCharset: String = null,
    accessKey: String = null,
    action: String = null,
    align: Alignments = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    allowTransparency: js.UndefOr[Boolean] = js.undefined,
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
    as: String = null,
    async: js.UndefOr[Boolean] = js.undefined,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    capture: Boolean | String = null,
    cellPadding: Double | String = null,
    cellSpacing: Double | String = null,
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
    download: js.Any = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    encType: String = null,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    frameBorder: Double | String = null,
    headers: String = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    high: Int | Double = null,
    href: String = null,
    hrefLang: String = null,
    htmlFor: String = null,
    httpEquiv: String = null,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    integrity: String = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    key: Key = null,
    keyParams: String = null,
    keyType: String = null,
    kind: String = null,
    label: String = null,
    lang: String = null,
    list: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    low: Int | Double = null,
    manifest: String = null,
    marginHeight: Int | Double = null,
    marginWidth: Int | Double = null,
    max: Double | String = null,
    maxLength: Int | Double = null,
    media: String = null,
    mediaGroup: String = null,
    method: String = null,
    min: Double | String = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    onAbort: ReactEventFrom[HTMLInputElement] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[HTMLInputElement] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[HTMLInputElement] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[HTMLInputElement] => Callback = null,
    onAuxClick: ReactMouseEventFrom[HTMLInputElement] => Callback = null,
    onBeforeInput: ReactEventFrom[HTMLInputElement] => Callback = null,
    onBlur: ReactFocusEventFrom[HTMLInputElement] => Callback = null,
    onCanPlay: ReactEventFrom[HTMLInputElement] => Callback = null,
    onCanPlayThrough: ReactEventFrom[HTMLInputElement] => Callback = null,
    onChange: ReactEventFrom[HTMLInputElement] => Callback = null,
    onClick: ReactMouseEventFrom[HTMLInputElement] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[HTMLInputElement] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[HTMLInputElement] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[HTMLInputElement] => Callback = null,
    onContextMenu: ReactMouseEventFrom[HTMLInputElement] => Callback = null,
    onCopy: ReactClipboardEventFrom[HTMLInputElement] => Callback = null,
    onCut: ReactClipboardEventFrom[HTMLInputElement] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[HTMLInputElement] => Callback = null,
    onDrag: ReactDragEventFrom[HTMLInputElement] => Callback = null,
    onDragEnd: ReactDragEventFrom[HTMLInputElement] => Callback = null,
    onDragEnter: ReactDragEventFrom[HTMLInputElement] => Callback = null,
    onDragExit: ReactDragEventFrom[HTMLInputElement] => Callback = null,
    onDragLeave: ReactDragEventFrom[HTMLInputElement] => Callback = null,
    onDragOver: ReactDragEventFrom[HTMLInputElement] => Callback = null,
    onDragStart: ReactDragEventFrom[HTMLInputElement] => Callback = null,
    onDrop: ReactDragEventFrom[HTMLInputElement] => Callback = null,
    onDurationChange: ReactEventFrom[HTMLInputElement] => Callback = null,
    onEmptied: ReactEventFrom[HTMLInputElement] => Callback = null,
    onEncrypted: ReactEventFrom[HTMLInputElement] => Callback = null,
    onEnded: ReactEventFrom[HTMLInputElement] => Callback = null,
    onError: ReactEventFrom[HTMLInputElement] => Callback = null,
    onFocus: ReactFocusEventFrom[HTMLInputElement] => Callback = null,
    onInput: ReactEventFrom[HTMLInputElement] => Callback = null,
    onInvalid: ReactEventFrom[HTMLInputElement] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[HTMLInputElement] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[HTMLInputElement] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[HTMLInputElement] => Callback = null,
    onLoad: ReactEventFrom[HTMLInputElement] => Callback = null,
    onLoadStart: ReactEventFrom[HTMLInputElement] => Callback = null,
    onLoadedData: ReactEventFrom[HTMLInputElement] => Callback = null,
    onLoadedMetadata: ReactEventFrom[HTMLInputElement] => Callback = null,
    onMouseDown: ReactMouseEventFrom[HTMLInputElement] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[HTMLInputElement] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[HTMLInputElement] => Callback = null,
    onMouseMove: ReactMouseEventFrom[HTMLInputElement] => Callback = null,
    onMouseOut: ReactMouseEventFrom[HTMLInputElement] => Callback = null,
    onMouseOver: ReactMouseEventFrom[HTMLInputElement] => Callback = null,
    onMouseUp: ReactMouseEventFrom[HTMLInputElement] => Callback = null,
    onPaste: ReactClipboardEventFrom[HTMLInputElement] => Callback = null,
    onPause: ReactEventFrom[HTMLInputElement] => Callback = null,
    onPlay: ReactEventFrom[HTMLInputElement] => Callback = null,
    onPlaying: ReactEventFrom[HTMLInputElement] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[HTMLInputElement] => Callback = null,
    onPointerDown: ReactPointerEventFrom[HTMLInputElement] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[HTMLInputElement] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[HTMLInputElement] => Callback = null,
    onPointerMove: ReactPointerEventFrom[HTMLInputElement] => Callback = null,
    onPointerOut: ReactPointerEventFrom[HTMLInputElement] => Callback = null,
    onPointerOver: ReactPointerEventFrom[HTMLInputElement] => Callback = null,
    onPointerUp: ReactPointerEventFrom[HTMLInputElement] => Callback = null,
    onProgress: ReactEventFrom[HTMLInputElement] => Callback = null,
    onRateChange: ReactEventFrom[HTMLInputElement] => Callback = null,
    onReset: ReactEventFrom[HTMLInputElement] => Callback = null,
    onScroll: ReactUIEventFrom[HTMLInputElement] => Callback = null,
    onSeeked: ReactEventFrom[HTMLInputElement] => Callback = null,
    onSeeking: ReactEventFrom[HTMLInputElement] => Callback = null,
    onSelect: ReactEventFrom[HTMLInputElement] => Callback = null,
    onStalled: ReactEventFrom[HTMLInputElement] => Callback = null,
    onSubmit: ReactEventFrom[HTMLInputElement] => Callback = null,
    onSuspend: ReactEventFrom[HTMLInputElement] => Callback = null,
    onTimeUpdate: ReactEventFrom[HTMLInputElement] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[HTMLInputElement] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[HTMLInputElement] => Callback = null,
    onTouchMove: ReactTouchEventFrom[HTMLInputElement] => Callback = null,
    onTouchStart: ReactTouchEventFrom[HTMLInputElement] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[HTMLInputElement] => Callback = null,
    onVolumeChange: ReactEventFrom[HTMLInputElement] => Callback = null,
    onWaiting: ReactEventFrom[HTMLInputElement] => Callback = null,
    onWheel: ReactWheelEventFrom[HTMLInputElement] => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    optimum: Int | Double = null,
    pattern: String = null,
    placeholder: String = null,
    playsInline: js.UndefOr[Boolean] = js.undefined,
    poster: String = null,
    prefix: String = null,
    preload: String = null,
    property: String = null,
    radioGroup: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[HTMLInputElement] = null,
    rel: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    rowSpan: Int | Double = null,
    rows: Int | Double = null,
    sandbox: String = null,
    scope: String = null,
    scoped: js.UndefOr[Boolean] = js.undefined,
    scrolling: String = null,
    seamless: js.UndefOr[Boolean] = js.undefined,
    security: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    shape: String = null,
    size: Sizes = null
  ): InputProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency.asInstanceOf[js.Any])
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
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
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
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (encType != null) __obj.updateDynamic("encType")(encType.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (marginHeight != null) __obj.updateDynamic("marginHeight")(marginHeight.asInstanceOf[js.Any])
    if (marginWidth != null) __obj.updateDynamic("marginWidth")(marginWidth.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onRateChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onWheel(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (optimum != null) __obj.updateDynamic("optimum")(optimum.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(playsInline)) __obj.updateDynamic("playsInline")(playsInline.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(seamless)) __obj.updateDynamic("seamless")(seamless.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps]
  }
}

