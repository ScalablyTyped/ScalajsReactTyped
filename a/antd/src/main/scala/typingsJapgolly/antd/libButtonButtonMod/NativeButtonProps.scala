package typingsJapgolly.antd.libButtonButtonMod

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
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.Anon_Delay
import typingsJapgolly.antd.antdStrings.`additions text`
import typingsJapgolly.antd.antdStrings.`inline`
import typingsJapgolly.antd.antdStrings.additions
import typingsJapgolly.antd.antdStrings.all
import typingsJapgolly.antd.antdStrings.ascending
import typingsJapgolly.antd.antdStrings.assertive
import typingsJapgolly.antd.antdStrings.both
import typingsJapgolly.antd.antdStrings.copy
import typingsJapgolly.antd.antdStrings.date
import typingsJapgolly.antd.antdStrings.decimal
import typingsJapgolly.antd.antdStrings.descending
import typingsJapgolly.antd.antdStrings.dialog
import typingsJapgolly.antd.antdStrings.email
import typingsJapgolly.antd.antdStrings.execute
import typingsJapgolly.antd.antdStrings.grammar
import typingsJapgolly.antd.antdStrings.grid
import typingsJapgolly.antd.antdStrings.horizontal
import typingsJapgolly.antd.antdStrings.link
import typingsJapgolly.antd.antdStrings.list
import typingsJapgolly.antd.antdStrings.listbox
import typingsJapgolly.antd.antdStrings.location
import typingsJapgolly.antd.antdStrings.menu
import typingsJapgolly.antd.antdStrings.mixed
import typingsJapgolly.antd.antdStrings.move
import typingsJapgolly.antd.antdStrings.none
import typingsJapgolly.antd.antdStrings.numeric
import typingsJapgolly.antd.antdStrings.off
import typingsJapgolly.antd.antdStrings.on
import typingsJapgolly.antd.antdStrings.other
import typingsJapgolly.antd.antdStrings.page
import typingsJapgolly.antd.antdStrings.polite
import typingsJapgolly.antd.antdStrings.popup
import typingsJapgolly.antd.antdStrings.removals
import typingsJapgolly.antd.antdStrings.search
import typingsJapgolly.antd.antdStrings.spelling
import typingsJapgolly.antd.antdStrings.step
import typingsJapgolly.antd.antdStrings.tel
import typingsJapgolly.antd.antdStrings.text
import typingsJapgolly.antd.antdStrings.time
import typingsJapgolly.antd.antdStrings.tree
import typingsJapgolly.antd.antdStrings.url
import typingsJapgolly.antd.antdStrings.vertical
import typingsJapgolly.react.Anon_Html
import typingsJapgolly.react.reactMod.AnimationEventHandler
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.ClipboardEventHandler
import typingsJapgolly.react.reactMod.CompositionEventHandler
import typingsJapgolly.react.reactMod.DragEventHandler
import typingsJapgolly.react.reactMod.FocusEventHandler
import typingsJapgolly.react.reactMod.FormEventHandler
import typingsJapgolly.react.reactMod.KeyboardEventHandler
import typingsJapgolly.react.reactMod.MouseEventHandler
import typingsJapgolly.react.reactMod.PointerEventHandler
import typingsJapgolly.react.reactMod.ReactEventHandler
import typingsJapgolly.react.reactMod.TouchEventHandler
import typingsJapgolly.react.reactMod.TransitionEventHandler
import typingsJapgolly.react.reactMod.UIEventHandler
import typingsJapgolly.react.reactMod.WheelEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  htmlType ? :antd.antd/lib/button/button.ButtonHTMLType,   onClick ? :react.react.MouseEventHandler<std.HTMLElement>} & antd.antd/lib/button/button.BaseButtonProps & antd.antd/lib/_util/type.Omit<react.react.ButtonHTMLAttributes<any>, 'type' | 'onClick'> */
trait NativeButtonProps extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
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
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var block: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Boolean] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Anon_Html] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var formAction: js.UndefOr[String] = js.undefined
  var formEncType: js.UndefOr[String] = js.undefined
  var formMethod: js.UndefOr[String] = js.undefined
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  var formTarget: js.UndefOr[String] = js.undefined
  var ghost: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var htmlType: js.UndefOr[ButtonHTMLType] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
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
  var loading: js.UndefOr[Boolean | Anon_Delay] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[_]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[_]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[_]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[_]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[_]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[_]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[_]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[_]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[_]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[_]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[_]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[_]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[_]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[_]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[_]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[_]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[_]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[_]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[_]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[_]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[_]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[_]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[_]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[_]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[_]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[_]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[_]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[_]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[_]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[_]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[_]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[_]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[_]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[_]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[_]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[_]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[_]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[_]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[_]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[_]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[_]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[_]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[_]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[ButtonShape] = js.undefined
  var size: js.UndefOr[ButtonSize] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[ButtonType] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
}

object NativeButtonProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
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
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    block: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    color: String = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    ghost: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    htmlType: ButtonHTMLType = null,
    icon: String = null,
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
    loading: Boolean | Anon_Delay = null,
    name: String = null,
    onAbort: ReactEventFrom[js.Any with Element] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[js.Any with Element] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[js.Any with Element] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[js.Any with Element] => Callback = null,
    onAuxClick: ReactMouseEventFrom[js.Any with Element] => Callback = null,
    onBeforeInput: ReactEventFrom[js.Any with Element] => Callback = null,
    onBlur: ReactFocusEventFrom[js.Any with Element] => Callback = null,
    onCanPlay: ReactEventFrom[js.Any with Element] => Callback = null,
    onCanPlayThrough: ReactEventFrom[js.Any with Element] => Callback = null,
    onChange: ReactEventFrom[js.Any with Element] => Callback = null,
    onClick: ReactMouseEventFrom[HTMLElement] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[js.Any with Element] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[js.Any with Element] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[js.Any with Element] => Callback = null,
    onContextMenu: ReactMouseEventFrom[js.Any with Element] => Callback = null,
    onCopy: ReactClipboardEventFrom[js.Any with Element] => Callback = null,
    onCut: ReactClipboardEventFrom[js.Any with Element] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[js.Any with Element] => Callback = null,
    onDrag: ReactDragEventFrom[js.Any with Element] => Callback = null,
    onDragEnd: ReactDragEventFrom[js.Any with Element] => Callback = null,
    onDragEnter: ReactDragEventFrom[js.Any with Element] => Callback = null,
    onDragExit: ReactDragEventFrom[js.Any with Element] => Callback = null,
    onDragLeave: ReactDragEventFrom[js.Any with Element] => Callback = null,
    onDragOver: ReactDragEventFrom[js.Any with Element] => Callback = null,
    onDragStart: ReactDragEventFrom[js.Any with Element] => Callback = null,
    onDrop: ReactDragEventFrom[js.Any with Element] => Callback = null,
    onDurationChange: ReactEventFrom[js.Any with Element] => Callback = null,
    onEmptied: ReactEventFrom[js.Any with Element] => Callback = null,
    onEncrypted: ReactEventFrom[js.Any with Element] => Callback = null,
    onEnded: ReactEventFrom[js.Any with Element] => Callback = null,
    onError: ReactEventFrom[js.Any with Element] => Callback = null,
    onFocus: ReactFocusEventFrom[js.Any with Element] => Callback = null,
    onInput: ReactEventFrom[js.Any with Element] => Callback = null,
    onInvalid: ReactEventFrom[js.Any with Element] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[js.Any with Element] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[js.Any with Element] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[js.Any with Element] => Callback = null,
    onLoad: ReactEventFrom[js.Any with Element] => Callback = null,
    onLoadStart: ReactEventFrom[js.Any with Element] => Callback = null,
    onLoadedData: ReactEventFrom[js.Any with Element] => Callback = null,
    onLoadedMetadata: ReactEventFrom[js.Any with Element] => Callback = null,
    onMouseDown: ReactMouseEventFrom[js.Any with Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[js.Any with Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[js.Any with Element] => Callback = null,
    onMouseMove: ReactMouseEventFrom[js.Any with Element] => Callback = null,
    onMouseOut: ReactMouseEventFrom[js.Any with Element] => Callback = null,
    onMouseOver: ReactMouseEventFrom[js.Any with Element] => Callback = null,
    onMouseUp: ReactMouseEventFrom[js.Any with Element] => Callback = null,
    onPaste: ReactClipboardEventFrom[js.Any with Element] => Callback = null,
    onPause: ReactEventFrom[js.Any with Element] => Callback = null,
    onPlay: ReactEventFrom[js.Any with Element] => Callback = null,
    onPlaying: ReactEventFrom[js.Any with Element] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[js.Any with Element] => Callback = null,
    onPointerDown: ReactPointerEventFrom[js.Any with Element] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[js.Any with Element] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[js.Any with Element] => Callback = null,
    onPointerMove: ReactPointerEventFrom[js.Any with Element] => Callback = null,
    onPointerOut: ReactPointerEventFrom[js.Any with Element] => Callback = null,
    onPointerOver: ReactPointerEventFrom[js.Any with Element] => Callback = null,
    onPointerUp: ReactPointerEventFrom[js.Any with Element] => Callback = null,
    onProgress: ReactEventFrom[js.Any with Element] => Callback = null,
    onRateChange: ReactEventFrom[js.Any with Element] => Callback = null,
    onReset: ReactEventFrom[js.Any with Element] => Callback = null,
    onScroll: ReactUIEventFrom[js.Any with Element] => Callback = null,
    onSeeked: ReactEventFrom[js.Any with Element] => Callback = null,
    onSeeking: ReactEventFrom[js.Any with Element] => Callback = null,
    onSelect: ReactEventFrom[js.Any with Element] => Callback = null,
    onStalled: ReactEventFrom[js.Any with Element] => Callback = null,
    onSubmit: ReactEventFrom[js.Any with Element] => Callback = null,
    onSuspend: ReactEventFrom[js.Any with Element] => Callback = null,
    onTimeUpdate: ReactEventFrom[js.Any with Element] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[js.Any with Element] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[js.Any with Element] => Callback = null,
    onTouchMove: ReactTouchEventFrom[js.Any with Element] => Callback = null,
    onTouchStart: ReactTouchEventFrom[js.Any with Element] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[js.Any with Element] => Callback = null,
    onVolumeChange: ReactEventFrom[js.Any with Element] => Callback = null,
    onWaiting: ReactEventFrom[js.Any with Element] => Callback = null,
    onWheel: ReactWheelEventFrom[js.Any with Element] => Callback = null,
    placeholder: String = null,
    prefix: String = null,
    prefixCls: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    shape: ButtonShape = null,
    size: ButtonSize = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: String = null,
    `type`: ButtonType = null,
    typeof: String = null,
    unselectable: on | off = null,
    value: String | js.Array[String] | Double = null,
    vocab: String = null
  ): NativeButtonProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
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
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(ghost)) __obj.updateDynamic("ghost")(ghost.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (htmlType != null) __obj.updateDynamic("htmlType")(htmlType.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
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
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onRateChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onWheel(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeButtonProps]
  }
}

