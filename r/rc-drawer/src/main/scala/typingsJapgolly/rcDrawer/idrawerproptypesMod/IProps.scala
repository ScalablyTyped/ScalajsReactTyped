package typingsJapgolly.rcDrawer.idrawerproptypesMod

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
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.rcDrawer.AnonTarget
import typingsJapgolly.rcDrawer.rcDrawerBooleans.`false`
import typingsJapgolly.rcDrawer.rcDrawerStrings.`additions text`
import typingsJapgolly.rcDrawer.rcDrawerStrings.`inline`
import typingsJapgolly.rcDrawer.rcDrawerStrings.additions
import typingsJapgolly.rcDrawer.rcDrawerStrings.all
import typingsJapgolly.rcDrawer.rcDrawerStrings.ascending
import typingsJapgolly.rcDrawer.rcDrawerStrings.assertive
import typingsJapgolly.rcDrawer.rcDrawerStrings.both
import typingsJapgolly.rcDrawer.rcDrawerStrings.copy
import typingsJapgolly.rcDrawer.rcDrawerStrings.date
import typingsJapgolly.rcDrawer.rcDrawerStrings.decimal
import typingsJapgolly.rcDrawer.rcDrawerStrings.descending
import typingsJapgolly.rcDrawer.rcDrawerStrings.dialog
import typingsJapgolly.rcDrawer.rcDrawerStrings.email
import typingsJapgolly.rcDrawer.rcDrawerStrings.execute
import typingsJapgolly.rcDrawer.rcDrawerStrings.grammar
import typingsJapgolly.rcDrawer.rcDrawerStrings.grid
import typingsJapgolly.rcDrawer.rcDrawerStrings.horizontal
import typingsJapgolly.rcDrawer.rcDrawerStrings.inherit
import typingsJapgolly.rcDrawer.rcDrawerStrings.link
import typingsJapgolly.rcDrawer.rcDrawerStrings.list
import typingsJapgolly.rcDrawer.rcDrawerStrings.listbox
import typingsJapgolly.rcDrawer.rcDrawerStrings.location
import typingsJapgolly.rcDrawer.rcDrawerStrings.menu
import typingsJapgolly.rcDrawer.rcDrawerStrings.mixed
import typingsJapgolly.rcDrawer.rcDrawerStrings.move
import typingsJapgolly.rcDrawer.rcDrawerStrings.no
import typingsJapgolly.rcDrawer.rcDrawerStrings.none
import typingsJapgolly.rcDrawer.rcDrawerStrings.numeric
import typingsJapgolly.rcDrawer.rcDrawerStrings.off
import typingsJapgolly.rcDrawer.rcDrawerStrings.on
import typingsJapgolly.rcDrawer.rcDrawerStrings.other
import typingsJapgolly.rcDrawer.rcDrawerStrings.page
import typingsJapgolly.rcDrawer.rcDrawerStrings.polite
import typingsJapgolly.rcDrawer.rcDrawerStrings.popup
import typingsJapgolly.rcDrawer.rcDrawerStrings.removals
import typingsJapgolly.rcDrawer.rcDrawerStrings.search
import typingsJapgolly.rcDrawer.rcDrawerStrings.spelling
import typingsJapgolly.rcDrawer.rcDrawerStrings.step
import typingsJapgolly.rcDrawer.rcDrawerStrings.tel
import typingsJapgolly.rcDrawer.rcDrawerStrings.text
import typingsJapgolly.rcDrawer.rcDrawerStrings.time
import typingsJapgolly.rcDrawer.rcDrawerStrings.tree
import typingsJapgolly.rcDrawer.rcDrawerStrings.url
import typingsJapgolly.rcDrawer.rcDrawerStrings.vertical
import typingsJapgolly.rcDrawer.rcDrawerStrings.yes
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

/* Inlined parent rc-drawer.rc-drawer/lib/IDrawerPropTypes.Omit<react.react.HTMLAttributes<any>, 'onChange'> */
trait IProps extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var afterVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
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
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var ease: js.UndefOr[String] = js.undefined
  var handler: js.UndefOr[Element | Null | `false`] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
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
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[Null | String | js.Array[String]] = js.undefined
  var levelMove: js.UndefOr[ILevelMove | (js.Function1[/* e */ AnonTarget, ILevelMove])] = js.undefined
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskStyle: js.UndefOr[CSSProperties] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[_]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[_]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[_]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[_]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[_]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[_]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* open */ js.UndefOr[Boolean], Unit]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var onClose: js.UndefOr[
    js.Function1[
      /* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element] | ReactKeyboardEventFrom[org.scalajs.dom.raw.Element], 
      Unit
    ]
  ] = js.undefined
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
  var onHandleClick: js.UndefOr[
    js.Function1[
      /* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element] | ReactKeyboardEventFrom[org.scalajs.dom.raw.Element], 
      Unit
    ]
  ] = js.undefined
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
  var open: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var placement: js.UndefOr[IPlacement] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var showMask: js.UndefOr[Boolean] = js.undefined
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
  var width: js.UndefOr[String | Double] = js.undefined
}

object IProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    afterVisibleChange: /* open */ Boolean => Callback = null,
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
    children: VdomNode = null,
    className: String = null,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    duration: String = null,
    ease: String = null,
    handler: Element | `false` = null,
    height: String | Double = null,
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
    keyboard: js.UndefOr[Boolean] = js.undefined,
    lang: String = null,
    level: String | js.Array[String] = null,
    levelMove: ILevelMove | (js.Function1[/* e */ AnonTarget, ILevelMove]) = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: CSSProperties = null,
    onAbort: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onAuxClick: ReactMouseEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onBeforeInput: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onBlur: ReactFocusEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onCanPlay: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onCanPlayThrough: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onChange: /* open */ js.UndefOr[Boolean] => Callback = null,
    onClick: ReactMouseEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onClose: /* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element] | ReactKeyboardEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onContextMenu: ReactMouseEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onCopy: ReactClipboardEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onCut: ReactClipboardEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onDrag: ReactDragEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onDragEnd: ReactDragEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onDragEnter: ReactDragEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onDragExit: ReactDragEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onDragLeave: ReactDragEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onDragOver: ReactDragEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onDragStart: ReactDragEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onDrop: ReactDragEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onDurationChange: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onEmptied: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onEncrypted: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onEnded: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onError: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onFocus: ReactFocusEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onHandleClick: /* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element] | ReactKeyboardEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onInput: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onInvalid: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onLoad: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onLoadStart: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onLoadedData: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onLoadedMetadata: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onMouseDown: ReactMouseEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onMouseMove: ReactMouseEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onMouseOut: ReactMouseEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onMouseOver: ReactMouseEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onMouseUp: ReactMouseEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onPaste: ReactClipboardEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onPause: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onPlay: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onPlaying: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onPointerDown: ReactPointerEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onPointerMove: ReactPointerEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onPointerOut: ReactPointerEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onPointerOver: ReactPointerEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onPointerUp: ReactPointerEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onProgress: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onRateChange: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onReset: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onScroll: ReactUIEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onSeeked: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onSeeking: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onSelect: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onStalled: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onSubmit: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onSuspend: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onTimeUpdate: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onTouchMove: ReactTouchEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onTouchStart: ReactTouchEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onVolumeChange: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onWaiting: ReactEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    onWheel: ReactWheelEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    placement: IPlacement = null,
    prefix: String = null,
    prefixCls: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    showMask: js.UndefOr[Boolean] = js.undefined,
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
    vocab: String = null,
    width: String | Double = null
  ): IProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(js.Any.fromFunction1((t0: /* open */ scala.Boolean) => afterVisibleChange(t0).runNow()))
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
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
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
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelMove != null) __obj.updateDynamic("levelMove")(levelMove.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.Element]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.Element]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.Element]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* open */ js.UndefOr[scala.Boolean]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onClose(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.Element]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.Element]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.Element]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.Element]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.Element]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onHandleClick != null) __obj.updateDynamic("onHandleClick")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onHandleClick(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onInvalid(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.Element]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.Element]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.Element]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.Element]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.Element]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.Element]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.Element]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.Element]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.Element]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onRateChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.Element]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.Element]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[org.scalajs.dom.raw.Element]) => onWheel(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(showMask)) __obj.updateDynamic("showMask")(showMask.asInstanceOf[js.Any])
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
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
}

