package typingsJapgolly.fundamentalReact

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
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`1`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`2`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`3`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`4`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`5`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`6`
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.`additions text`
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.`inline`
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.additions
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.all
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.ascending
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.assertive
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.both
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.copy
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.date
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.decimal
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.descending
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.dialog
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.email
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.execute
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.grammar
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.grid
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.horizontal
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.inherit
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.link_
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.list
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.listbox
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.location
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.menu_
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.mixed
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.move
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.no
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.none
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.numeric
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.off
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.on
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.other
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.page
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.polite
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.popup
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.removals
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.search
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.spelling
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.step
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.tel
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.text
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.time_
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.tree
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.url
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.vertical
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.yes
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/LayoutGrid/LayoutGrid.LayoutGridProps> */
trait PartialLayoutGridProps extends js.Object {
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
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time_] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link_ | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu_ | listbox | tree | grid | dialog] = js.undefined
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
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var cols: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
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
  var nogap: js.UndefOr[Boolean] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLAnchorElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLAnchorElement]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLAnchorElement]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLAnchorElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLAnchorElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLAnchorElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLAnchorElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLAnchorElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLAnchorElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLAnchorElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLAnchorElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLAnchorElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLAnchorElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLAnchorElement]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLAnchorElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLAnchorElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[HTMLAnchorElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLAnchorElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLAnchorElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLAnchorElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLAnchorElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLAnchorElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLAnchorElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLAnchorElement]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[HTMLAnchorElement]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[Ref] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
}

object PartialLayoutGridProps {
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
    `aria-current`: Boolean | page | step | location | date | time_ = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link_ | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu_ | listbox | tree | grid | dialog = null,
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
    children: VdomNode = null,
    className: String = null,
    color: String = null,
    cols: `1` | `2` | `3` | `4` | `5` | `6` = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    customStyles: StringDictionary[js.Any] = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
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
    nogap: js.UndefOr[Boolean] = js.undefined,
    onAbort: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[HTMLAnchorElement] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[HTMLAnchorElement] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[HTMLAnchorElement] => Callback = null,
    onAuxClick: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onBeforeInput: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onBlur: ReactFocusEventFrom[HTMLAnchorElement] => Callback = null,
    onCanPlay: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onCanPlayThrough: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onChange: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onClick: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[HTMLAnchorElement] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[HTMLAnchorElement] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[HTMLAnchorElement] => Callback = null,
    onContextMenu: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onCopy: ReactClipboardEventFrom[HTMLAnchorElement] => Callback = null,
    onCut: ReactClipboardEventFrom[HTMLAnchorElement] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onDrag: ReactDragEventFrom[HTMLAnchorElement] => Callback = null,
    onDragEnd: ReactDragEventFrom[HTMLAnchorElement] => Callback = null,
    onDragEnter: ReactDragEventFrom[HTMLAnchorElement] => Callback = null,
    onDragExit: ReactDragEventFrom[HTMLAnchorElement] => Callback = null,
    onDragLeave: ReactDragEventFrom[HTMLAnchorElement] => Callback = null,
    onDragOver: ReactDragEventFrom[HTMLAnchorElement] => Callback = null,
    onDragStart: ReactDragEventFrom[HTMLAnchorElement] => Callback = null,
    onDrop: ReactDragEventFrom[HTMLAnchorElement] => Callback = null,
    onDurationChange: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onEmptied: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onEncrypted: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onEnded: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onError: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onFocus: ReactFocusEventFrom[HTMLAnchorElement] => Callback = null,
    onInput: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onInvalid: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[HTMLAnchorElement] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[HTMLAnchorElement] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[HTMLAnchorElement] => Callback = null,
    onLoad: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onLoadStart: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onLoadedData: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onLoadedMetadata: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onMouseDown: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onMouseMove: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onMouseOut: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onMouseOver: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onMouseUp: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    onPaste: ReactClipboardEventFrom[HTMLAnchorElement] => Callback = null,
    onPause: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onPlay: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onPlaying: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[HTMLAnchorElement] => Callback = null,
    onPointerDown: ReactPointerEventFrom[HTMLAnchorElement] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[HTMLAnchorElement] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[HTMLAnchorElement] => Callback = null,
    onPointerMove: ReactPointerEventFrom[HTMLAnchorElement] => Callback = null,
    onPointerOut: ReactPointerEventFrom[HTMLAnchorElement] => Callback = null,
    onPointerOver: ReactPointerEventFrom[HTMLAnchorElement] => Callback = null,
    onPointerUp: ReactPointerEventFrom[HTMLAnchorElement] => Callback = null,
    onProgress: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onRateChange: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onReset: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onScroll: ReactUIEventFrom[HTMLAnchorElement] => Callback = null,
    onSeeked: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onSeeking: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onSelect: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onStalled: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onSubmit: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onSuspend: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onTimeUpdate: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[HTMLAnchorElement] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[HTMLAnchorElement] => Callback = null,
    onTouchMove: ReactTouchEventFrom[HTMLAnchorElement] => Callback = null,
    onTouchStart: ReactTouchEventFrom[HTMLAnchorElement] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[HTMLAnchorElement] => Callback = null,
    onVolumeChange: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onWaiting: ReactEventFrom[HTMLAnchorElement] => Callback = null,
    onWheel: ReactWheelEventFrom[HTMLAnchorElement] => Callback = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    ref: Ref = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null
  ): PartialLayoutGridProps = {
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
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
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
    if (!js.isUndefined(nogap)) __obj.updateDynamic("nogap")(nogap.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onRateChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onWheel(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLayoutGridProps]
  }
}

