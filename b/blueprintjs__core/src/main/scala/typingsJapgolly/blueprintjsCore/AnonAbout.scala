package typingsJapgolly.blueprintjsCore

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
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`additions text`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`inline`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.additions
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.all
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.ascending
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.assertive
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.both
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.copy
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.date
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.decimal
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.descending
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.dialog
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.email
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.execute
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.grammar
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.grid
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.horizontal
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.inherit
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.link
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.list
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.listbox
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.location
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.menu
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.mixed
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.move
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.no
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.none
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.numeric
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.off
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.on
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.other
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.page
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.polite
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.popup
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.removals
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.search
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.spelling
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.step
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.tel
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.text
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.time
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.tree
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.url
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.vertical
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.yes
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbout extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | list | `inline` | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | time | page | step | location | date] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | link | move | copy | execute | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | grid | menu | tree | dialog | listbox] = js.undefined
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
  var `aria-relevant`: js.UndefOr[text | additions | (`additions text`) | all | removals] = js.undefined
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
  var className: String
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Boolean | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | search | text | tel | url | email | numeric | decimal] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onAbortCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function1[/* event */ ReactAnimationEventFrom[HTMLElement], Unit]] = js.undefined
  var onAnimationEndCapture: js.UndefOr[js.Function1[/* event */ ReactAnimationEventFrom[HTMLElement], Unit]] = js.undefined
  var onAnimationIteration: js.UndefOr[js.Function1[/* event */ ReactAnimationEventFrom[HTMLElement], Unit]] = js.undefined
  var onAnimationIterationCapture: js.UndefOr[js.Function1[/* event */ ReactAnimationEventFrom[HTMLElement], Unit]] = js.undefined
  var onAnimationStart: js.UndefOr[js.Function1[/* event */ ReactAnimationEventFrom[HTMLElement], Unit]] = js.undefined
  var onAnimationStartCapture: js.UndefOr[js.Function1[/* event */ ReactAnimationEventFrom[HTMLElement], Unit]] = js.undefined
  var onAuxClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onAuxClickCapture: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onBeforeInput: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onBeforeInputCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLElement], Unit]] = js.undefined
  var onBlurCapture: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLElement], Unit]] = js.undefined
  var onCanPlay: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onCanPlayCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onCanPlayThrough: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onCanPlayThroughCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onChangeCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onClickCapture: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onCompositionEnd: js.UndefOr[js.Function1[/* event */ ReactCompositionEventFrom[HTMLElement], Unit]] = js.undefined
  var onCompositionEndCapture: js.UndefOr[js.Function1[/* event */ ReactCompositionEventFrom[HTMLElement], Unit]] = js.undefined
  var onCompositionStart: js.UndefOr[js.Function1[/* event */ ReactCompositionEventFrom[HTMLElement], Unit]] = js.undefined
  var onCompositionStartCapture: js.UndefOr[js.Function1[/* event */ ReactCompositionEventFrom[HTMLElement], Unit]] = js.undefined
  var onCompositionUpdate: js.UndefOr[js.Function1[/* event */ ReactCompositionEventFrom[HTMLElement], Unit]] = js.undefined
  var onCompositionUpdateCapture: js.UndefOr[js.Function1[/* event */ ReactCompositionEventFrom[HTMLElement], Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onContextMenuCapture: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onCopy: js.UndefOr[js.Function1[/* event */ ReactClipboardEventFrom[HTMLElement], Unit]] = js.undefined
  var onCopyCapture: js.UndefOr[js.Function1[/* event */ ReactClipboardEventFrom[HTMLElement], Unit]] = js.undefined
  var onCut: js.UndefOr[js.Function1[/* event */ ReactClipboardEventFrom[HTMLElement], Unit]] = js.undefined
  var onCutCapture: js.UndefOr[js.Function1[/* event */ ReactClipboardEventFrom[HTMLElement], Unit]] = js.undefined
  var onDoubleClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onDoubleClickCapture: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onDrag: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDragCapture: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDragEndCapture: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDragEnter: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDragEnterCapture: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDragExit: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDragExitCapture: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDragLeave: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDragLeaveCapture: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDragOverCapture: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDragStartCapture: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDrop: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDropCapture: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
  var onDurationChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onDurationChangeCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onEmptied: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onEmptiedCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onEncrypted: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onEncryptedCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onEnded: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onEndedCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onErrorCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLElement], Unit]] = js.undefined
  var onFocusCapture: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLElement], Unit]] = js.undefined
  var onGotPointerCapture: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onGotPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onInput: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onInputCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onInvalid: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onInvalidCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* event */ ReactKeyboardEventFrom[HTMLElement], Unit]] = js.undefined
  var onKeyDownCapture: js.UndefOr[js.Function1[/* event */ ReactKeyboardEventFrom[HTMLElement], Unit]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function1[/* event */ ReactKeyboardEventFrom[HTMLElement], Unit]] = js.undefined
  var onKeyPressCapture: js.UndefOr[js.Function1[/* event */ ReactKeyboardEventFrom[HTMLElement], Unit]] = js.undefined
  var onKeyUp: js.UndefOr[js.Function1[/* event */ ReactKeyboardEventFrom[HTMLElement], Unit]] = js.undefined
  var onKeyUpCapture: js.UndefOr[js.Function1[/* event */ ReactKeyboardEventFrom[HTMLElement], Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onLoadCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onLoadStart: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onLoadStartCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onLoadedData: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onLoadedDataCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onLoadedMetadata: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onLoadedMetadataCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onLostPointerCapture: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onLostPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onMouseDownCapture: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onMouseMoveCapture: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onMouseOut: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onMouseOutCapture: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onMouseOver: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onMouseOverCapture: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onMouseUpCapture: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onPaste: js.UndefOr[js.Function1[/* event */ ReactClipboardEventFrom[HTMLElement], Unit]] = js.undefined
  var onPasteCapture: js.UndefOr[js.Function1[/* event */ ReactClipboardEventFrom[HTMLElement], Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onPauseCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onPlayCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onPlaying: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onPlayingCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerCancel: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerDown: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerEnter: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerLeave: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerMove: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerOut: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerOutCapture: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerOver: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerOverCapture: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerUp: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ ReactPointerEventFrom[HTMLElement], Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onProgressCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onRateChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onRateChangeCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onResetCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* event */ ReactUIEventFrom[HTMLElement], Unit]] = js.undefined
  var onScrollCapture: js.UndefOr[js.Function1[/* event */ ReactUIEventFrom[HTMLElement], Unit]] = js.undefined
  var onSeeked: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onSeekedCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onSeeking: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onSeekingCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onSelectCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onStalled: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onStalledCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onSubmitCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onSuspend: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onSuspendCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onTimeUpdate: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onTimeUpdateCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ ReactTouchEventFrom[HTMLElement], Unit]] = js.undefined
  var onTouchCancelCapture: js.UndefOr[js.Function1[/* event */ ReactTouchEventFrom[HTMLElement], Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ ReactTouchEventFrom[HTMLElement], Unit]] = js.undefined
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ ReactTouchEventFrom[HTMLElement], Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[/* event */ ReactTouchEventFrom[HTMLElement], Unit]] = js.undefined
  var onTouchMoveCapture: js.UndefOr[js.Function1[/* event */ ReactTouchEventFrom[HTMLElement], Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[/* event */ ReactTouchEventFrom[HTMLElement], Unit]] = js.undefined
  var onTouchStartCapture: js.UndefOr[js.Function1[/* event */ ReactTouchEventFrom[HTMLElement], Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function1[/* event */ ReactTransitionEventFrom[HTMLElement], Unit]] = js.undefined
  var onTransitionEndCapture: js.UndefOr[js.Function1[/* event */ ReactTransitionEventFrom[HTMLElement], Unit]] = js.undefined
  var onVolumeChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onVolumeChangeCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onWaiting: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onWaitingCapture: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var onWheel: js.UndefOr[js.Function1[/* event */ ReactWheelEventFrom[HTMLElement], Unit]] = js.undefined
  var onWheelCapture: js.UndefOr[js.Function1[/* event */ ReactWheelEventFrom[HTMLElement], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Boolean] = js.undefined
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

object AnonAbout {
  @scala.inline
  def apply(
    className: String,
    about: String = null,
    accessKey: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | list | `inline` | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | time | page | step | location | date = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | link | move | copy | execute | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | grid | menu | tree | dialog | listbox = null,
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
    `aria-relevant`: text | additions | (`additions text`) | all | removals = null,
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
    color: String = null,
    contentEditable: Boolean | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | search | text | tel | url | email | numeric | decimal = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    onAbort: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onAbortCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onAnimationEnd: /* event */ ReactAnimationEventFrom[HTMLElement] => Callback = null,
    onAnimationEndCapture: /* event */ ReactAnimationEventFrom[HTMLElement] => Callback = null,
    onAnimationIteration: /* event */ ReactAnimationEventFrom[HTMLElement] => Callback = null,
    onAnimationIterationCapture: /* event */ ReactAnimationEventFrom[HTMLElement] => Callback = null,
    onAnimationStart: /* event */ ReactAnimationEventFrom[HTMLElement] => Callback = null,
    onAnimationStartCapture: /* event */ ReactAnimationEventFrom[HTMLElement] => Callback = null,
    onAuxClick: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onAuxClickCapture: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onBeforeInput: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onBeforeInputCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onBlur: /* event */ ReactFocusEventFrom[HTMLElement] => Callback = null,
    onBlurCapture: /* event */ ReactFocusEventFrom[HTMLElement] => Callback = null,
    onCanPlay: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onCanPlayCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onCanPlayThrough: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onCanPlayThroughCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onChange: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onChangeCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onClick: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onClickCapture: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onCompositionEnd: /* event */ ReactCompositionEventFrom[HTMLElement] => Callback = null,
    onCompositionEndCapture: /* event */ ReactCompositionEventFrom[HTMLElement] => Callback = null,
    onCompositionStart: /* event */ ReactCompositionEventFrom[HTMLElement] => Callback = null,
    onCompositionStartCapture: /* event */ ReactCompositionEventFrom[HTMLElement] => Callback = null,
    onCompositionUpdate: /* event */ ReactCompositionEventFrom[HTMLElement] => Callback = null,
    onCompositionUpdateCapture: /* event */ ReactCompositionEventFrom[HTMLElement] => Callback = null,
    onContextMenu: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onContextMenuCapture: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onCopy: /* event */ ReactClipboardEventFrom[HTMLElement] => Callback = null,
    onCopyCapture: /* event */ ReactClipboardEventFrom[HTMLElement] => Callback = null,
    onCut: /* event */ ReactClipboardEventFrom[HTMLElement] => Callback = null,
    onCutCapture: /* event */ ReactClipboardEventFrom[HTMLElement] => Callback = null,
    onDoubleClick: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onDoubleClickCapture: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onDrag: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDragCapture: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDragEnd: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDragEndCapture: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDragEnter: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDragEnterCapture: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDragExit: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDragExitCapture: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDragLeave: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDragLeaveCapture: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDragOver: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDragOverCapture: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDragStart: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDragStartCapture: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDrop: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDropCapture: /* event */ ReactDragEventFrom[HTMLElement] => Callback = null,
    onDurationChange: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onDurationChangeCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onEmptied: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onEmptiedCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onEncrypted: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onEncryptedCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onEnded: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onEndedCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onError: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onErrorCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onFocus: /* event */ ReactFocusEventFrom[HTMLElement] => Callback = null,
    onFocusCapture: /* event */ ReactFocusEventFrom[HTMLElement] => Callback = null,
    onGotPointerCapture: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onGotPointerCaptureCapture: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onInput: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onInputCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onInvalid: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onInvalidCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onKeyDown: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onKeyDownCapture: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onKeyPress: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onKeyPressCapture: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onKeyUp: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onKeyUpCapture: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onLoad: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onLoadCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onLoadStart: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onLoadStartCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onLoadedData: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onLoadedDataCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onLoadedMetadata: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onLoadedMetadataCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onLostPointerCapture: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onLostPointerCaptureCapture: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onMouseDown: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onMouseDownCapture: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onMouseEnter: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onMouseLeave: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onMouseMove: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onMouseMoveCapture: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onMouseOut: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onMouseOutCapture: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onMouseOver: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onMouseOverCapture: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onMouseUp: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onMouseUpCapture: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onPaste: /* event */ ReactClipboardEventFrom[HTMLElement] => Callback = null,
    onPasteCapture: /* event */ ReactClipboardEventFrom[HTMLElement] => Callback = null,
    onPause: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onPauseCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onPlay: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onPlayCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onPlaying: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onPlayingCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onPointerCancel: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerCancelCapture: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerDown: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerDownCapture: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerEnter: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerEnterCapture: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerLeave: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerLeaveCapture: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerMove: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerMoveCapture: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerOut: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerOutCapture: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerOver: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerOverCapture: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerUp: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onPointerUpCapture: /* event */ ReactPointerEventFrom[HTMLElement] => Callback = null,
    onProgress: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onProgressCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onRateChange: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onRateChangeCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onReset: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onResetCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onScroll: /* event */ ReactUIEventFrom[HTMLElement] => Callback = null,
    onScrollCapture: /* event */ ReactUIEventFrom[HTMLElement] => Callback = null,
    onSeeked: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onSeekedCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onSeeking: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onSeekingCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onSelect: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onSelectCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onStalled: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onStalledCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onSubmit: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onSubmitCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onSuspend: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onSuspendCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onTimeUpdate: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onTimeUpdateCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onTouchCancel: /* event */ ReactTouchEventFrom[HTMLElement] => Callback = null,
    onTouchCancelCapture: /* event */ ReactTouchEventFrom[HTMLElement] => Callback = null,
    onTouchEnd: /* event */ ReactTouchEventFrom[HTMLElement] => Callback = null,
    onTouchEndCapture: /* event */ ReactTouchEventFrom[HTMLElement] => Callback = null,
    onTouchMove: /* event */ ReactTouchEventFrom[HTMLElement] => Callback = null,
    onTouchMoveCapture: /* event */ ReactTouchEventFrom[HTMLElement] => Callback = null,
    onTouchStart: /* event */ ReactTouchEventFrom[HTMLElement] => Callback = null,
    onTouchStartCapture: /* event */ ReactTouchEventFrom[HTMLElement] => Callback = null,
    onTransitionEnd: /* event */ ReactTransitionEventFrom[HTMLElement] => Callback = null,
    onTransitionEndCapture: /* event */ ReactTransitionEventFrom[HTMLElement] => Callback = null,
    onVolumeChange: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onVolumeChangeCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onWaiting: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onWaitingCapture: /* event */ ReactEventFrom[HTMLElement] => Callback = null,
    onWheel: /* event */ ReactWheelEventFrom[HTMLElement] => Callback = null,
    onWheelCapture: /* event */ ReactWheelEventFrom[HTMLElement] => Callback = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
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
  ): AnonAbout = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
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
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
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
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onAbort(t0).runNow()))
    if (onAbortCapture != null) __obj.updateDynamic("onAbortCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onAbortCapture(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]) => onAnimationEnd(t0).runNow()))
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]) => onAnimationEndCapture(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]) => onAnimationIteration(t0).runNow()))
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]) => onAnimationIterationCapture(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]) => onAnimationStart(t0).runNow()))
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]) => onAnimationStartCapture(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onAuxClick(t0).runNow()))
    if (onAuxClickCapture != null) __obj.updateDynamic("onAuxClickCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onAuxClickCapture(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onBeforeInput(t0).runNow()))
    if (onBeforeInputCapture != null) __obj.updateDynamic("onBeforeInputCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onBeforeInputCapture(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onBlur(t0).runNow()))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onBlurCapture(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCanPlay(t0).runNow()))
    if (onCanPlayCapture != null) __obj.updateDynamic("onCanPlayCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCanPlayCapture(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCanPlayThrough(t0).runNow()))
    if (onCanPlayThroughCapture != null) __obj.updateDynamic("onCanPlayThroughCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCanPlayThroughCapture(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onChange(t0).runNow()))
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onChangeCapture(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0).runNow()))
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClickCapture(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCompositionEnd(t0).runNow()))
    if (onCompositionEndCapture != null) __obj.updateDynamic("onCompositionEndCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCompositionEndCapture(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCompositionStart(t0).runNow()))
    if (onCompositionStartCapture != null) __obj.updateDynamic("onCompositionStartCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCompositionStartCapture(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCompositionUpdate(t0).runNow()))
    if (onCompositionUpdateCapture != null) __obj.updateDynamic("onCompositionUpdateCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactCompositionEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCompositionUpdateCapture(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onContextMenu(t0).runNow()))
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onContextMenuCapture(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCopy(t0).runNow()))
    if (onCopyCapture != null) __obj.updateDynamic("onCopyCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCopyCapture(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCut(t0).runNow()))
    if (onCutCapture != null) __obj.updateDynamic("onCutCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCutCapture(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDoubleClick(t0).runNow()))
    if (onDoubleClickCapture != null) __obj.updateDynamic("onDoubleClickCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDoubleClickCapture(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDrag(t0).runNow()))
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragCapture(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragEnd(t0).runNow()))
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragEndCapture(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragEnter(t0).runNow()))
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragEnterCapture(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragExit(t0).runNow()))
    if (onDragExitCapture != null) __obj.updateDynamic("onDragExitCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragExitCapture(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragLeave(t0).runNow()))
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragLeaveCapture(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragOver(t0).runNow()))
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragOverCapture(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragStart(t0).runNow()))
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDragStartCapture(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDrop(t0).runNow()))
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDropCapture(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDurationChange(t0).runNow()))
    if (onDurationChangeCapture != null) __obj.updateDynamic("onDurationChangeCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onDurationChangeCapture(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onEmptied(t0).runNow()))
    if (onEmptiedCapture != null) __obj.updateDynamic("onEmptiedCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onEmptiedCapture(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onEncrypted(t0).runNow()))
    if (onEncryptedCapture != null) __obj.updateDynamic("onEncryptedCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onEncryptedCapture(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onEnded(t0).runNow()))
    if (onEndedCapture != null) __obj.updateDynamic("onEndedCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onEndedCapture(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onError(t0).runNow()))
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onErrorCapture(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onFocus(t0).runNow()))
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onFocusCapture(t0).runNow()))
    if (onGotPointerCapture != null) __obj.updateDynamic("onGotPointerCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onGotPointerCapture(t0).runNow()))
    if (onGotPointerCaptureCapture != null) __obj.updateDynamic("onGotPointerCaptureCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onGotPointerCaptureCapture(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onInput(t0).runNow()))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onInputCapture(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onInvalid(t0).runNow()))
    if (onInvalidCapture != null) __obj.updateDynamic("onInvalidCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onInvalidCapture(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyDown(t0).runNow()))
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyDownCapture(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyPress(t0).runNow()))
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyPressCapture(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyUp(t0).runNow()))
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyUpCapture(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onLoad(t0).runNow()))
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onLoadCapture(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onLoadStart(t0).runNow()))
    if (onLoadStartCapture != null) __obj.updateDynamic("onLoadStartCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onLoadStartCapture(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onLoadedData(t0).runNow()))
    if (onLoadedDataCapture != null) __obj.updateDynamic("onLoadedDataCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onLoadedDataCapture(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onLoadedMetadata(t0).runNow()))
    if (onLoadedMetadataCapture != null) __obj.updateDynamic("onLoadedMetadataCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onLoadedMetadataCapture(t0).runNow()))
    if (onLostPointerCapture != null) __obj.updateDynamic("onLostPointerCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onLostPointerCapture(t0).runNow()))
    if (onLostPointerCaptureCapture != null) __obj.updateDynamic("onLostPointerCaptureCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onLostPointerCaptureCapture(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseDown(t0).runNow()))
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseDownCapture(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseMove(t0).runNow()))
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseMoveCapture(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseOut(t0).runNow()))
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseOutCapture(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseOver(t0).runNow()))
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseOverCapture(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseUp(t0).runNow()))
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseUpCapture(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPaste(t0).runNow()))
    if (onPasteCapture != null) __obj.updateDynamic("onPasteCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactClipboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPasteCapture(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPause(t0).runNow()))
    if (onPauseCapture != null) __obj.updateDynamic("onPauseCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPauseCapture(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPlay(t0).runNow()))
    if (onPlayCapture != null) __obj.updateDynamic("onPlayCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPlayCapture(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPlaying(t0).runNow()))
    if (onPlayingCapture != null) __obj.updateDynamic("onPlayingCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPlayingCapture(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerCancel(t0).runNow()))
    if (onPointerCancelCapture != null) __obj.updateDynamic("onPointerCancelCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerCancelCapture(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerDown(t0).runNow()))
    if (onPointerDownCapture != null) __obj.updateDynamic("onPointerDownCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerDownCapture(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerEnter(t0).runNow()))
    if (onPointerEnterCapture != null) __obj.updateDynamic("onPointerEnterCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerEnterCapture(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerLeave(t0).runNow()))
    if (onPointerLeaveCapture != null) __obj.updateDynamic("onPointerLeaveCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerLeaveCapture(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerMove(t0).runNow()))
    if (onPointerMoveCapture != null) __obj.updateDynamic("onPointerMoveCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerMoveCapture(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerOut(t0).runNow()))
    if (onPointerOutCapture != null) __obj.updateDynamic("onPointerOutCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerOutCapture(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerOver(t0).runNow()))
    if (onPointerOverCapture != null) __obj.updateDynamic("onPointerOverCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerOverCapture(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerUp(t0).runNow()))
    if (onPointerUpCapture != null) __obj.updateDynamic("onPointerUpCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactPointerEventFrom[org.scalajs.dom.raw.HTMLElement]) => onPointerUpCapture(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onProgress(t0).runNow()))
    if (onProgressCapture != null) __obj.updateDynamic("onProgressCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onProgressCapture(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onRateChange(t0).runNow()))
    if (onRateChangeCapture != null) __obj.updateDynamic("onRateChangeCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onRateChangeCapture(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onReset(t0).runNow()))
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onResetCapture(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.HTMLElement]) => onScroll(t0).runNow()))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.HTMLElement]) => onScrollCapture(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSeeked(t0).runNow()))
    if (onSeekedCapture != null) __obj.updateDynamic("onSeekedCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSeekedCapture(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSeeking(t0).runNow()))
    if (onSeekingCapture != null) __obj.updateDynamic("onSeekingCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSeekingCapture(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSelect(t0).runNow()))
    if (onSelectCapture != null) __obj.updateDynamic("onSelectCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSelectCapture(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onStalled(t0).runNow()))
    if (onStalledCapture != null) __obj.updateDynamic("onStalledCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onStalledCapture(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSubmit(t0).runNow()))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSubmitCapture(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSuspend(t0).runNow()))
    if (onSuspendCapture != null) __obj.updateDynamic("onSuspendCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSuspendCapture(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTimeUpdate(t0).runNow()))
    if (onTimeUpdateCapture != null) __obj.updateDynamic("onTimeUpdateCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTimeUpdateCapture(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTouchCancel(t0).runNow()))
    if (onTouchCancelCapture != null) __obj.updateDynamic("onTouchCancelCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTouchCancelCapture(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTouchEnd(t0).runNow()))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTouchEndCapture(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTouchMove(t0).runNow()))
    if (onTouchMoveCapture != null) __obj.updateDynamic("onTouchMoveCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTouchMoveCapture(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTouchStart(t0).runNow()))
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTouchStartCapture(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTransitionEnd(t0).runNow()))
    if (onTransitionEndCapture != null) __obj.updateDynamic("onTransitionEndCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTransitionEndCapture(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onVolumeChange(t0).runNow()))
    if (onVolumeChangeCapture != null) __obj.updateDynamic("onVolumeChangeCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onVolumeChangeCapture(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onWaiting(t0).runNow()))
    if (onWaitingCapture != null) __obj.updateDynamic("onWaitingCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onWaitingCapture(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactWheelEventFrom[org.scalajs.dom.raw.HTMLElement]) => onWheel(t0).runNow()))
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactWheelEventFrom[org.scalajs.dom.raw.HTMLElement]) => onWheelCapture(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[AnonAbout]
  }
}

