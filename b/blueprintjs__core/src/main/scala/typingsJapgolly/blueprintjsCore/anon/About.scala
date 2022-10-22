package typingsJapgolly.blueprintjsCore.anon

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
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`additions removals`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`additions text`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`inline`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`removals additions`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`removals text`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`text additions`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.`text removals`
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
import typingsJapgolly.react.mod.AnimationEventHandler
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait About extends StObject {
  
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
  
  var `aria-current`: js.UndefOr[Boolean | time | location | page | step | date] = js.undefined
  
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
  
  var `aria-relevant`: js.UndefOr[
    text | additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | (`text additions`) | (`text removals`)
  ] = js.undefined
  
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  
  var `aria-valuemax`: Double
  
  var `aria-valuemin`: Double
  
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
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var inlist: js.UndefOr[Any] = js.undefined
  
  var inputMode: js.UndefOr[none | text | search | tel | url | email | numeric | decimal] = js.undefined
  
  var is: js.UndefOr[String] = js.undefined
  
  var itemID: js.UndefOr[String] = js.undefined
  
  var itemProp: js.UndefOr[String] = js.undefined
  
  var itemRef: js.UndefOr[String] = js.undefined
  
  var itemScope: js.UndefOr[Boolean] = js.undefined
  
  var itemType: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var onAbort: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onAbortCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[Any]] = js.undefined
  
  var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[Any]] = js.undefined
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[Any]] = js.undefined
  
  var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[Any]] = js.undefined
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[Any]] = js.undefined
  
  var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[Any]] = js.undefined
  
  var onAuxClick: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onAuxClickCapture: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onBeforeInput: js.UndefOr[FormEventHandler[Any]] = js.undefined
  
  var onBeforeInputCapture: js.UndefOr[FormEventHandler[Any]] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[Any]] = js.undefined
  
  var onBlurCapture: js.UndefOr[FocusEventHandler[Any]] = js.undefined
  
  var onCanPlay: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onCanPlayCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onCanPlayThroughCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onChange: js.UndefOr[FormEventHandler[Any]] = js.undefined
  
  var onChangeCapture: js.UndefOr[FormEventHandler[Any]] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onClickCapture: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[Any]] = js.undefined
  
  var onCompositionEndCapture: js.UndefOr[CompositionEventHandler[Any]] = js.undefined
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[Any]] = js.undefined
  
  var onCompositionStartCapture: js.UndefOr[CompositionEventHandler[Any]] = js.undefined
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[Any]] = js.undefined
  
  var onCompositionUpdateCapture: js.UndefOr[CompositionEventHandler[Any]] = js.undefined
  
  var onContextMenu: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onContextMenuCapture: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onCopy: js.UndefOr[ClipboardEventHandler[Any]] = js.undefined
  
  var onCopyCapture: js.UndefOr[ClipboardEventHandler[Any]] = js.undefined
  
  var onCut: js.UndefOr[ClipboardEventHandler[Any]] = js.undefined
  
  var onCutCapture: js.UndefOr[ClipboardEventHandler[Any]] = js.undefined
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onDoubleClickCapture: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onDrag: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDragCapture: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDragEnd: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDragEndCapture: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDragEnter: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDragEnterCapture: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDragExit: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDragExitCapture: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDragLeave: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDragLeaveCapture: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDragOver: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDragOverCapture: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDragStart: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDragStartCapture: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDrop: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDropCapture: js.UndefOr[DragEventHandler[Any]] = js.undefined
  
  var onDurationChange: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onDurationChangeCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onEmptied: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onEmptiedCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onEncrypted: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onEncryptedCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onEnded: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onEndedCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onError: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onErrorCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onFocus: js.UndefOr[FocusEventHandler[Any]] = js.undefined
  
  var onFocusCapture: js.UndefOr[FocusEventHandler[Any]] = js.undefined
  
  var onGotPointerCapture: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onInput: js.UndefOr[FormEventHandler[Any]] = js.undefined
  
  var onInputCapture: js.UndefOr[FormEventHandler[Any]] = js.undefined
  
  var onInvalid: js.UndefOr[FormEventHandler[Any]] = js.undefined
  
  var onInvalidCapture: js.UndefOr[FormEventHandler[Any]] = js.undefined
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[Any]] = js.undefined
  
  var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[Any]] = js.undefined
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[Any]] = js.undefined
  
  var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[Any]] = js.undefined
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[Any]] = js.undefined
  
  var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[Any]] = js.undefined
  
  var onLoad: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onLoadCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onLoadStart: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onLoadStartCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onLoadedData: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onLoadedDataCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onLoadedMetadataCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onLostPointerCapture: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onMouseDown: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onMouseDownCapture: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onMouseMoveCapture: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onMouseOut: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onMouseOutCapture: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onMouseOver: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onMouseOverCapture: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onMouseUp: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onMouseUpCapture: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  
  var onPaste: js.UndefOr[ClipboardEventHandler[Any]] = js.undefined
  
  var onPasteCapture: js.UndefOr[ClipboardEventHandler[Any]] = js.undefined
  
  var onPause: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onPauseCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onPlay: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onPlayCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onPlaying: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onPlayingCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerCancelCapture: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerDown: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerDownCapture: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerEnterCapture: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerMove: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerMoveCapture: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerOut: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerOutCapture: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerOver: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerOverCapture: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerUp: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onPointerUpCapture: js.UndefOr[PointerEventHandler[Any]] = js.undefined
  
  var onProgress: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onProgressCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onRateChange: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onRateChangeCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onReset: js.UndefOr[FormEventHandler[Any]] = js.undefined
  
  var onResetCapture: js.UndefOr[FormEventHandler[Any]] = js.undefined
  
  var onScroll: js.UndefOr[UIEventHandler[Any]] = js.undefined
  
  var onScrollCapture: js.UndefOr[UIEventHandler[Any]] = js.undefined
  
  var onSeeked: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onSeekedCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onSeeking: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onSeekingCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onSelect: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onSelectCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onStalled: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onStalledCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onSubmit: js.UndefOr[FormEventHandler[Any]] = js.undefined
  
  var onSubmitCapture: js.UndefOr[FormEventHandler[Any]] = js.undefined
  
  var onSuspend: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onSuspendCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onTimeUpdateCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onTouchCancel: js.UndefOr[TouchEventHandler[Any]] = js.undefined
  
  var onTouchCancelCapture: js.UndefOr[TouchEventHandler[Any]] = js.undefined
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[Any]] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[TouchEventHandler[Any]] = js.undefined
  
  var onTouchMove: js.UndefOr[TouchEventHandler[Any]] = js.undefined
  
  var onTouchMoveCapture: js.UndefOr[TouchEventHandler[Any]] = js.undefined
  
  var onTouchStart: js.UndefOr[TouchEventHandler[Any]] = js.undefined
  
  var onTouchStartCapture: js.UndefOr[TouchEventHandler[Any]] = js.undefined
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[Any]] = js.undefined
  
  var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[Any]] = js.undefined
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onVolumeChangeCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onWaiting: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onWaitingCapture: js.UndefOr[ReactEventHandler[Any]] = js.undefined
  
  var onWheel: js.UndefOr[WheelEventHandler[Any]] = js.undefined
  
  var onWheelCapture: js.UndefOr[WheelEventHandler[Any]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
  
  var radioGroup: js.UndefOr[String] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[Double] = js.undefined
  
  var role: String
  
  var security: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
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
object About {
  
  inline def apply(`aria-valuemax`: Double, `aria-valuemin`: Double, className: String, role: String): About = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    __obj.asInstanceOf[About]
  }
  
  extension [Self <: About](x: Self) {
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    inline def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    inline def `setAria-autocomplete`(value: none | list | `inline` | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    inline def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
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
    
    inline def `setAria-current`(value: Boolean | time | location | page | step | date): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
    inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
    
    inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
    
    inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    inline def `setAria-dropeffect`(value: none | link | move | copy | execute | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    inline def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    inline def `setAria-haspopup`(value: Boolean | grid | menu | tree | dialog | listbox): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    inline def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
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
    
    inline def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    inline def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    inline def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
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
    
    inline def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    inline def `setAria-relevant`(
      value: text | additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | (`text additions`) | (`text removals`)
    ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContentEditable(value: Boolean | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
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
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    inline def setInputMode(value: none | text | search | tel | url | email | numeric | decimal): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
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
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setOnAbort(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAbortCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAbortCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationEnd(value: ReactAnimationEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationEndCapture(value: ReactAnimationEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationEndCapture", js.Any.fromFunction1((t0: ReactAnimationEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationIteration(value: ReactAnimationEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationIterationCapture(value: ReactAnimationEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationIterationCapture", js.Any.fromFunction1((t0: ReactAnimationEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
    
    inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    inline def setOnAnimationStart(value: ReactAnimationEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationStartCapture(value: ReactAnimationEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationStartCapture", js.Any.fromFunction1((t0: ReactAnimationEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnAuxClick(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAuxClickCapture(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAuxClickCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAuxClickCaptureUndefined: Self = StObject.set(x, "onAuxClickCapture", js.undefined)
    
    inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    inline def setOnBeforeInput(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBeforeInputCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBeforeInputCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBeforeInputCaptureUndefined: Self = StObject.set(x, "onBeforeInputCapture", js.undefined)
    
    inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    inline def setOnBlur(value: ReactFocusEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBlurCapture(value: ReactFocusEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlurCapture", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCanPlay(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCanPlayCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlayCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
    
    inline def setOnCanPlayThrough(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCanPlayThroughCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlayThroughCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
    
    inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    inline def setOnChange(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnChangeCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChangeCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnClickCapture(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClickCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionEnd(value: ReactCompositionEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionEndCapture(value: ReactCompositionEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionEndCapture", js.Any.fromFunction1((t0: ReactCompositionEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
    
    inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    inline def setOnCompositionStart(value: ReactCompositionEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionStartCapture(value: ReactCompositionEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionStartCapture", js.Any.fromFunction1((t0: ReactCompositionEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
    
    inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    inline def setOnCompositionUpdate(value: ReactCompositionEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionUpdateCapture(value: ReactCompositionEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionUpdateCapture", js.Any.fromFunction1((t0: ReactCompositionEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
    
    inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    inline def setOnContextMenu(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnContextMenuCapture(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenuCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnCopy(value: ReactClipboardEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCopyCapture(value: ReactClipboardEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCopyCapture", js.Any.fromFunction1((t0: ReactClipboardEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: ReactClipboardEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCutCapture(value: ReactClipboardEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCutCapture", js.Any.fromFunction1((t0: ReactClipboardEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDoubleClick(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDoubleClickCapture(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDoubleClickCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDoubleClickCaptureUndefined: Self = StObject.set(x, "onDoubleClickCapture", js.undefined)
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnDrag(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragCapture(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
    
    inline def setOnDragEnd(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragEndCapture(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEndCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragEnterCapture(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnterCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragExit(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragExitCapture(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragExitCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
    
    inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    inline def setOnDragLeave(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragLeaveCapture(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragLeaveCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragOverCapture(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragOverCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragStartCapture(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragStartCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDrop(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDropCapture(value: ReactDragEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDropCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationChange(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDurationChangeCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDurationChangeCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEmptied(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEmptiedCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEmptiedCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEncryptedCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEncryptedCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEndedCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEndedCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnErrorCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onErrorCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(value: ReactFocusEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnFocusCapture(value: ReactFocusEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocusCapture", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnGotPointerCapture(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onGotPointerCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnGotPointerCaptureCapture(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onGotPointerCaptureCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
    
    inline def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
    
    inline def setOnInput(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnInputCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInputCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnInvalidCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInvalidCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnKeyDown(value: ReactKeyboardEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyDownCapture(value: ReactKeyboardEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDownCapture", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress(value: ReactKeyboardEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyPressCapture(value: ReactKeyboardEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyPressCapture", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnKeyUp(value: ReactKeyboardEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyUpCapture(value: ReactKeyboardEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUpCapture", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnLoad(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
    
    inline def setOnLoadStart(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadStartCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadStartCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadedData(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadedDataCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedDataCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
    
    inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    inline def setOnLoadedMetadata(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadedMetadataCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedMetadataCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
    
    inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    inline def setOnLostPointerCapture(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLostPointerCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLostPointerCaptureCapture(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLostPointerCaptureCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
    
    inline def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
    
    inline def setOnMouseDown(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseDownCapture(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDownCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseMoveCapture(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMoveCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseOutCapture(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOutCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseOverCapture(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOverCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseUpCapture(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUpCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(value: ReactClipboardEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPasteCapture(value: ReactClipboardEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPasteCapture", js.Any.fromFunction1((t0: ReactClipboardEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPauseCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPauseCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPlayCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlayCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPlayingCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlayingCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPointerCancel(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerCancelCapture(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerDownCapture(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerEnterCapture(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerLeaveCapture(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerMoveCapture(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerOutCapture(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOutCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerOverCapture(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOverCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerUpCapture(value: ReactPointerEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnProgress(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnProgressCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onProgressCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRateChange(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnRateChangeCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onRateChangeCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
    
    inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    inline def setOnReset(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnResetCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onResetCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnScroll(value: ReactUIEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnScrollCapture(value: ReactUIEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onScrollCapture", js.Any.fromFunction1((t0: ReactUIEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSeekedCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeekedCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSeekingCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeekingCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSelectCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSelectCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnStalledCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onStalledCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSubmitCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSubmitCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSuspendCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSuspendCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnTimeUpdate(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTimeUpdateCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTimeUpdateCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
    
    inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    inline def setOnTouchCancel(value: ReactTouchEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchCancelCapture(value: ReactTouchEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchCancelCapture", js.Any.fromFunction1((t0: ReactTouchEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: ReactTouchEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchEndCapture(value: ReactTouchEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1((t0: ReactTouchEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: ReactTouchEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchMoveCapture(value: ReactTouchEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchMoveCapture", js.Any.fromFunction1((t0: ReactTouchEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: ReactTouchEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchStartCapture(value: ReactTouchEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchStartCapture", js.Any.fromFunction1((t0: ReactTouchEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd(value: ReactTransitionEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTransitionEndCapture(value: ReactTransitionEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTransitionEndCapture", js.Any.fromFunction1((t0: ReactTransitionEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnVolumeChange(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnVolumeChangeCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onVolumeChangeCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnWaitingCapture(value: ReactEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWaitingCapture", js.Any.fromFunction1((t0: ReactEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel(value: ReactWheelEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnWheelCapture(value: ReactWheelEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWheelCapture", js.Any.fromFunction1((t0: ReactWheelEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
    
    inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
  }
}
