package typingsJapgolly.ionicReact

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
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.rangeInterfaceMod.RangeValue
import typingsJapgolly.ionicReact.ionicReactStrings.`additions text`
import typingsJapgolly.ionicReact.ionicReactStrings.`inline`
import typingsJapgolly.ionicReact.ionicReactStrings.additions
import typingsJapgolly.ionicReact.ionicReactStrings.all
import typingsJapgolly.ionicReact.ionicReactStrings.ascending
import typingsJapgolly.ionicReact.ionicReactStrings.assertive
import typingsJapgolly.ionicReact.ionicReactStrings.both
import typingsJapgolly.ionicReact.ionicReactStrings.copy
import typingsJapgolly.ionicReact.ionicReactStrings.date
import typingsJapgolly.ionicReact.ionicReactStrings.decimal
import typingsJapgolly.ionicReact.ionicReactStrings.descending
import typingsJapgolly.ionicReact.ionicReactStrings.dialog
import typingsJapgolly.ionicReact.ionicReactStrings.email
import typingsJapgolly.ionicReact.ionicReactStrings.execute
import typingsJapgolly.ionicReact.ionicReactStrings.grammar
import typingsJapgolly.ionicReact.ionicReactStrings.grid
import typingsJapgolly.ionicReact.ionicReactStrings.horizontal
import typingsJapgolly.ionicReact.ionicReactStrings.inherit
import typingsJapgolly.ionicReact.ionicReactStrings.ios
import typingsJapgolly.ionicReact.ionicReactStrings.link
import typingsJapgolly.ionicReact.ionicReactStrings.list
import typingsJapgolly.ionicReact.ionicReactStrings.listbox
import typingsJapgolly.ionicReact.ionicReactStrings.location
import typingsJapgolly.ionicReact.ionicReactStrings.md
import typingsJapgolly.ionicReact.ionicReactStrings.menu
import typingsJapgolly.ionicReact.ionicReactStrings.mixed
import typingsJapgolly.ionicReact.ionicReactStrings.move
import typingsJapgolly.ionicReact.ionicReactStrings.no
import typingsJapgolly.ionicReact.ionicReactStrings.none
import typingsJapgolly.ionicReact.ionicReactStrings.numeric
import typingsJapgolly.ionicReact.ionicReactStrings.off
import typingsJapgolly.ionicReact.ionicReactStrings.on
import typingsJapgolly.ionicReact.ionicReactStrings.other
import typingsJapgolly.ionicReact.ionicReactStrings.page
import typingsJapgolly.ionicReact.ionicReactStrings.polite
import typingsJapgolly.ionicReact.ionicReactStrings.popup
import typingsJapgolly.ionicReact.ionicReactStrings.removals
import typingsJapgolly.ionicReact.ionicReactStrings.search
import typingsJapgolly.ionicReact.ionicReactStrings.spelling
import typingsJapgolly.ionicReact.ionicReactStrings.step
import typingsJapgolly.ionicReact.ionicReactStrings.tel
import typingsJapgolly.ionicReact.ionicReactStrings.text
import typingsJapgolly.ionicReact.ionicReactStrings.time
import typingsJapgolly.ionicReact.ionicReactStrings.tree
import typingsJapgolly.ionicReact.ionicReactStrings.url
import typingsJapgolly.ionicReact.ionicReactStrings.vertical
import typingsJapgolly.ionicReact.ionicReactStrings.yes
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.Key
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

/* Inlined @ionic/core.@ionic/core.JSX.IonRange & std.Pick<react.react.HTMLAttributes<@ionic/core.@ionic/core/dist/types/components._Global_.HTMLIonRangeElement>, 'hidden' | 'dir' | 'slot' | 'title' | 'color' | 'children' | 'accessKey' | 'draggable' | 'lang' | 'translate' | 'className' | 'id' | 'prefix' | 'contentEditable' | 'inputMode' | 'tabIndex' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'contextMenu' | 'placeholder' | 'spellCheck' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture'> & @ionic/react.@ionic/react/dist/types/components/IonicReactProps.IonicReactProps & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components._Global_.HTMLIonRangeElement> */
trait IonRangePickHTMLAttribute extends js.Object {
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
  var autoSave: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var `class`: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color with String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value.
    */
  var debounce: js.UndefOr[Double] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the user cannot interact with the range.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  /**
    * Show two knobs.
    */
  var dualKnobs: js.UndefOr[Boolean] = js.undefined
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
  var key: js.UndefOr[Key] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  /**
    * Maximum integer value of the range.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Minimum integer value of the range.
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onAbortCapture: js.Any
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLIonRangeElement]] = js.undefined
  var onAnimationEndCapture: js.Any
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLIonRangeElement]] = js.undefined
  var onAnimationIterationCapture: js.Any
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLIonRangeElement]] = js.undefined
  var onAnimationStartCapture: js.Any
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLIonRangeElement]] = js.undefined
  var onAuxClickCapture: js.Any
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLIonRangeElement]] = js.undefined
  var onBeforeInputCapture: js.Any
  var onBlur: js.UndefOr[FocusEventHandler[HTMLIonRangeElement]] = js.undefined
  var onBlurCapture: js.Any
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onCanPlayCapture: js.Any
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onCanPlayThroughCapture: js.Any
  var onChange: js.UndefOr[FormEventHandler[HTMLIonRangeElement]] = js.undefined
  var onChangeCapture: js.Any
  var onClick: js.UndefOr[MouseEventHandler[HTMLIonRangeElement]] = js.undefined
  var onClickCapture: js.Any
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLIonRangeElement]] = js.undefined
  var onCompositionEndCapture: js.Any
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLIonRangeElement]] = js.undefined
  var onCompositionStartCapture: js.Any
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLIonRangeElement]] = js.undefined
  var onCompositionUpdateCapture: js.Any
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLIonRangeElement]] = js.undefined
  var onContextMenuCapture: js.Any
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLIonRangeElement]] = js.undefined
  var onCopyCapture: js.Any
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLIonRangeElement]] = js.undefined
  var onCutCapture: js.Any
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLIonRangeElement]] = js.undefined
  var onDoubleClickCapture: js.Any
  var onDrag: js.UndefOr[DragEventHandler[HTMLIonRangeElement]] = js.undefined
  var onDragCapture: js.Any
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLIonRangeElement]] = js.undefined
  var onDragEndCapture: js.Any
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLIonRangeElement]] = js.undefined
  var onDragEnterCapture: js.Any
  var onDragExit: js.UndefOr[DragEventHandler[HTMLIonRangeElement]] = js.undefined
  var onDragExitCapture: js.Any
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLIonRangeElement]] = js.undefined
  var onDragLeaveCapture: js.Any
  var onDragOver: js.UndefOr[DragEventHandler[HTMLIonRangeElement]] = js.undefined
  var onDragOverCapture: js.Any
  var onDragStart: js.UndefOr[DragEventHandler[HTMLIonRangeElement]] = js.undefined
  var onDragStartCapture: js.Any
  var onDrop: js.UndefOr[DragEventHandler[HTMLIonRangeElement]] = js.undefined
  var onDropCapture: js.Any
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onDurationChangeCapture: js.Any
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onEmptiedCapture: js.Any
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onEncryptedCapture: js.Any
  var onEnded: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onEndedCapture: js.Any
  var onError: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onErrorCapture: js.Any
  var onFocus: js.UndefOr[FocusEventHandler[HTMLIonRangeElement]] = js.undefined
  var onFocusCapture: js.Any
  var onGotPointerCapture: js.Any
  var onGotPointerCaptureCapture: js.Any
  var onInput: js.UndefOr[FormEventHandler[HTMLIonRangeElement]] = js.undefined
  var onInputCapture: js.Any
  var onInvalid: js.UndefOr[FormEventHandler[HTMLIonRangeElement]] = js.undefined
  var onInvalidCapture: js.Any
  /**
    * Emitted when the range loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the value property has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the range has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLIonRangeElement]] = js.undefined
  var onKeyDownCapture: js.Any
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLIonRangeElement]] = js.undefined
  var onKeyPressCapture: js.Any
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLIonRangeElement]] = js.undefined
  var onKeyUpCapture: js.Any
  var onLoad: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onLoadCapture: js.Any
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onLoadStartCapture: js.Any
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onLoadedDataCapture: js.Any
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onLoadedMetadataCapture: js.Any
  var onLostPointerCapture: js.Any
  var onLostPointerCaptureCapture: js.Any
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLIonRangeElement]] = js.undefined
  var onMouseDownCapture: js.Any
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLIonRangeElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLIonRangeElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLIonRangeElement]] = js.undefined
  var onMouseMoveCapture: js.Any
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLIonRangeElement]] = js.undefined
  var onMouseOutCapture: js.Any
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLIonRangeElement]] = js.undefined
  var onMouseOverCapture: js.Any
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLIonRangeElement]] = js.undefined
  var onMouseUpCapture: js.Any
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLIonRangeElement]] = js.undefined
  var onPasteCapture: js.Any
  var onPause: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onPauseCapture: js.Any
  var onPlay: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onPlayCapture: js.Any
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onPlayingCapture: js.Any
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLIonRangeElement]] = js.undefined
  var onPointerCancelCapture: js.Any
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLIonRangeElement]] = js.undefined
  var onPointerDownCapture: js.Any
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLIonRangeElement]] = js.undefined
  var onPointerEnterCapture: js.Any
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLIonRangeElement]] = js.undefined
  var onPointerLeaveCapture: js.Any
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLIonRangeElement]] = js.undefined
  var onPointerMoveCapture: js.Any
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLIonRangeElement]] = js.undefined
  var onPointerOutCapture: js.Any
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLIonRangeElement]] = js.undefined
  var onPointerOverCapture: js.Any
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLIonRangeElement]] = js.undefined
  var onPointerUpCapture: js.Any
  var onProgress: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onProgressCapture: js.Any
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onRateChangeCapture: js.Any
  var onReset: js.UndefOr[FormEventHandler[HTMLIonRangeElement]] = js.undefined
  var onResetCapture: js.Any
  var onScroll: js.UndefOr[UIEventHandler[HTMLIonRangeElement]] = js.undefined
  var onScrollCapture: js.Any
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onSeekedCapture: js.Any
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onSeekingCapture: js.Any
  var onSelect: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onSelectCapture: js.Any
  var onStalled: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onStalledCapture: js.Any
  var onSubmit: js.UndefOr[FormEventHandler[HTMLIonRangeElement]] = js.undefined
  var onSubmitCapture: js.Any
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onSuspendCapture: js.Any
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onTimeUpdateCapture: js.Any
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLIonRangeElement]] = js.undefined
  var onTouchCancelCapture: js.Any
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLIonRangeElement]] = js.undefined
  var onTouchEndCapture: js.Any
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLIonRangeElement]] = js.undefined
  var onTouchMoveCapture: js.Any
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLIonRangeElement]] = js.undefined
  var onTouchStartCapture: js.Any
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLIonRangeElement]] = js.undefined
  var onTransitionEndCapture: js.Any
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onVolumeChangeCapture: js.Any
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLIonRangeElement]] = js.undefined
  var onWaitingCapture: js.Any
  var onWheel: js.UndefOr[WheelEventHandler[HTMLIonRangeElement]] = js.undefined
  var onWheelCapture: js.Any
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  var pin: js.UndefOr[Boolean] = js.undefined
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
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  var snaps: js.UndefOr[Boolean] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  /**
    * Specifies the value granularity.
    */
  var step: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  var ticks: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  /**
    * the value of the range.
    */
  var value: js.UndefOr[RangeValue] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
}

object IonRangePickHTMLAttribute {
  @scala.inline
  def apply(
    onAbortCapture: js.Any,
    onAnimationEndCapture: js.Any,
    onAnimationIterationCapture: js.Any,
    onAnimationStartCapture: js.Any,
    onAuxClickCapture: js.Any,
    onBeforeInputCapture: js.Any,
    onBlurCapture: js.Any,
    onCanPlayCapture: js.Any,
    onCanPlayThroughCapture: js.Any,
    onChangeCapture: js.Any,
    onClickCapture: js.Any,
    onCompositionEndCapture: js.Any,
    onCompositionStartCapture: js.Any,
    onCompositionUpdateCapture: js.Any,
    onContextMenuCapture: js.Any,
    onCopyCapture: js.Any,
    onCutCapture: js.Any,
    onDoubleClickCapture: js.Any,
    onDragCapture: js.Any,
    onDragEndCapture: js.Any,
    onDragEnterCapture: js.Any,
    onDragExitCapture: js.Any,
    onDragLeaveCapture: js.Any,
    onDragOverCapture: js.Any,
    onDragStartCapture: js.Any,
    onDropCapture: js.Any,
    onDurationChangeCapture: js.Any,
    onEmptiedCapture: js.Any,
    onEncryptedCapture: js.Any,
    onEndedCapture: js.Any,
    onErrorCapture: js.Any,
    onFocusCapture: js.Any,
    onGotPointerCapture: js.Any,
    onGotPointerCaptureCapture: js.Any,
    onInputCapture: js.Any,
    onInvalidCapture: js.Any,
    onKeyDownCapture: js.Any,
    onKeyPressCapture: js.Any,
    onKeyUpCapture: js.Any,
    onLoadCapture: js.Any,
    onLoadStartCapture: js.Any,
    onLoadedDataCapture: js.Any,
    onLoadedMetadataCapture: js.Any,
    onLostPointerCapture: js.Any,
    onLostPointerCaptureCapture: js.Any,
    onMouseDownCapture: js.Any,
    onMouseMoveCapture: js.Any,
    onMouseOutCapture: js.Any,
    onMouseOverCapture: js.Any,
    onMouseUpCapture: js.Any,
    onPasteCapture: js.Any,
    onPauseCapture: js.Any,
    onPlayCapture: js.Any,
    onPlayingCapture: js.Any,
    onPointerCancelCapture: js.Any,
    onPointerDownCapture: js.Any,
    onPointerEnterCapture: js.Any,
    onPointerLeaveCapture: js.Any,
    onPointerMoveCapture: js.Any,
    onPointerOutCapture: js.Any,
    onPointerOverCapture: js.Any,
    onPointerUpCapture: js.Any,
    onProgressCapture: js.Any,
    onRateChangeCapture: js.Any,
    onResetCapture: js.Any,
    onScrollCapture: js.Any,
    onSeekedCapture: js.Any,
    onSeekingCapture: js.Any,
    onSelectCapture: js.Any,
    onStalledCapture: js.Any,
    onSubmitCapture: js.Any,
    onSuspendCapture: js.Any,
    onTimeUpdateCapture: js.Any,
    onTouchCancelCapture: js.Any,
    onTouchEndCapture: js.Any,
    onTouchMoveCapture: js.Any,
    onTouchStartCapture: js.Any,
    onTransitionEndCapture: js.Any,
    onVolumeChangeCapture: js.Any,
    onWaitingCapture: js.Any,
    onWheelCapture: js.Any,
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
    autoSave: String = null,
    children: VdomNode = null,
    `class`: String = null,
    className: String = null,
    color: Color with String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    debounce: Int | Double = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    dualKnobs: js.UndefOr[Boolean] = js.undefined,
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
    key: Key = null,
    lang: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    mode: ios | md = null,
    name: String = null,
    onAbort: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onAuxClick: ReactMouseEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onBeforeInput: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onBlur: ReactFocusEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onCanPlay: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onCanPlayThrough: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onChange: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onClick: ReactMouseEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onContextMenu: ReactMouseEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onCopy: ReactClipboardEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onCut: ReactClipboardEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onDrag: ReactDragEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onDragEnd: ReactDragEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onDragEnter: ReactDragEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onDragExit: ReactDragEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onDragLeave: ReactDragEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onDragOver: ReactDragEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onDragStart: ReactDragEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onDrop: ReactDragEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onDurationChange: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onEmptied: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onEncrypted: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onEnded: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onError: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onFocus: ReactFocusEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onInput: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onInvalid: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onIonBlur: /* event */ CustomEvent => Callback = null,
    onIonChange: /* event */ CustomEvent => Callback = null,
    onIonFocus: /* event */ CustomEvent => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onLoad: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onLoadStart: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onLoadedData: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onLoadedMetadata: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onMouseDown: ReactMouseEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onMouseMove: ReactMouseEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onMouseOut: ReactMouseEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onMouseOver: ReactMouseEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onMouseUp: ReactMouseEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onPaste: ReactClipboardEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onPause: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onPlay: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onPlaying: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onPointerDown: ReactPointerEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onPointerMove: ReactPointerEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onPointerOut: ReactPointerEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onPointerOver: ReactPointerEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onPointerUp: ReactPointerEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onProgress: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onRateChange: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onReset: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onScroll: ReactUIEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onSeeked: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onSeeking: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onSelect: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onStalled: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onSubmit: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onSuspend: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onTimeUpdate: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onTouchMove: ReactTouchEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onTouchStart: ReactTouchEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onVolumeChange: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onWaiting: ReactEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    onWheel: ReactWheelEventFrom[HTMLIonRangeElement with Element] => Callback = null,
    pin: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    ref: Ref = null,
    resource: String = null
  ): IonRangePickHTMLAttribute = {
    val __obj = js.Dynamic.literal(onAbortCapture = onAbortCapture.asInstanceOf[js.Any], onAnimationEndCapture = onAnimationEndCapture.asInstanceOf[js.Any], onAnimationIterationCapture = onAnimationIterationCapture.asInstanceOf[js.Any], onAnimationStartCapture = onAnimationStartCapture.asInstanceOf[js.Any], onAuxClickCapture = onAuxClickCapture.asInstanceOf[js.Any], onBeforeInputCapture = onBeforeInputCapture.asInstanceOf[js.Any], onBlurCapture = onBlurCapture.asInstanceOf[js.Any], onCanPlayCapture = onCanPlayCapture.asInstanceOf[js.Any], onCanPlayThroughCapture = onCanPlayThroughCapture.asInstanceOf[js.Any], onChangeCapture = onChangeCapture.asInstanceOf[js.Any], onClickCapture = onClickCapture.asInstanceOf[js.Any], onCompositionEndCapture = onCompositionEndCapture.asInstanceOf[js.Any], onCompositionStartCapture = onCompositionStartCapture.asInstanceOf[js.Any], onCompositionUpdateCapture = onCompositionUpdateCapture.asInstanceOf[js.Any], onContextMenuCapture = onContextMenuCapture.asInstanceOf[js.Any], onCopyCapture = onCopyCapture.asInstanceOf[js.Any], onCutCapture = onCutCapture.asInstanceOf[js.Any], onDoubleClickCapture = onDoubleClickCapture.asInstanceOf[js.Any], onDragCapture = onDragCapture.asInstanceOf[js.Any], onDragEndCapture = onDragEndCapture.asInstanceOf[js.Any], onDragEnterCapture = onDragEnterCapture.asInstanceOf[js.Any], onDragExitCapture = onDragExitCapture.asInstanceOf[js.Any], onDragLeaveCapture = onDragLeaveCapture.asInstanceOf[js.Any], onDragOverCapture = onDragOverCapture.asInstanceOf[js.Any], onDragStartCapture = onDragStartCapture.asInstanceOf[js.Any], onDropCapture = onDropCapture.asInstanceOf[js.Any], onDurationChangeCapture = onDurationChangeCapture.asInstanceOf[js.Any], onEmptiedCapture = onEmptiedCapture.asInstanceOf[js.Any], onEncryptedCapture = onEncryptedCapture.asInstanceOf[js.Any], onEndedCapture = onEndedCapture.asInstanceOf[js.Any], onErrorCapture = onErrorCapture.asInstanceOf[js.Any], onFocusCapture = onFocusCapture.asInstanceOf[js.Any], onGotPointerCapture = onGotPointerCapture.asInstanceOf[js.Any], onGotPointerCaptureCapture = onGotPointerCaptureCapture.asInstanceOf[js.Any], onInputCapture = onInputCapture.asInstanceOf[js.Any], onInvalidCapture = onInvalidCapture.asInstanceOf[js.Any], onKeyDownCapture = onKeyDownCapture.asInstanceOf[js.Any], onKeyPressCapture = onKeyPressCapture.asInstanceOf[js.Any], onKeyUpCapture = onKeyUpCapture.asInstanceOf[js.Any], onLoadCapture = onLoadCapture.asInstanceOf[js.Any], onLoadStartCapture = onLoadStartCapture.asInstanceOf[js.Any], onLoadedDataCapture = onLoadedDataCapture.asInstanceOf[js.Any], onLoadedMetadataCapture = onLoadedMetadataCapture.asInstanceOf[js.Any], onLostPointerCapture = onLostPointerCapture.asInstanceOf[js.Any], onLostPointerCaptureCapture = onLostPointerCaptureCapture.asInstanceOf[js.Any], onMouseDownCapture = onMouseDownCapture.asInstanceOf[js.Any], onMouseMoveCapture = onMouseMoveCapture.asInstanceOf[js.Any], onMouseOutCapture = onMouseOutCapture.asInstanceOf[js.Any], onMouseOverCapture = onMouseOverCapture.asInstanceOf[js.Any], onMouseUpCapture = onMouseUpCapture.asInstanceOf[js.Any], onPasteCapture = onPasteCapture.asInstanceOf[js.Any], onPauseCapture = onPauseCapture.asInstanceOf[js.Any], onPlayCapture = onPlayCapture.asInstanceOf[js.Any], onPlayingCapture = onPlayingCapture.asInstanceOf[js.Any], onPointerCancelCapture = onPointerCancelCapture.asInstanceOf[js.Any], onPointerDownCapture = onPointerDownCapture.asInstanceOf[js.Any], onPointerEnterCapture = onPointerEnterCapture.asInstanceOf[js.Any], onPointerLeaveCapture = onPointerLeaveCapture.asInstanceOf[js.Any], onPointerMoveCapture = onPointerMoveCapture.asInstanceOf[js.Any], onPointerOutCapture = onPointerOutCapture.asInstanceOf[js.Any], onPointerOverCapture = onPointerOverCapture.asInstanceOf[js.Any], onPointerUpCapture = onPointerUpCapture.asInstanceOf[js.Any], onProgressCapture = onProgressCapture.asInstanceOf[js.Any], onRateChangeCapture = onRateChangeCapture.asInstanceOf[js.Any], onResetCapture = onResetCapture.asInstanceOf[js.Any], onScrollCapture = onScrollCapture.asInstanceOf[js.Any], onSeekedCapture = onSeekedCapture.asInstanceOf[js.Any], onSeekingCapture = onSeekingCapture.asInstanceOf[js.Any], onSelectCapture = onSelectCapture.asInstanceOf[js.Any], onStalledCapture = onStalledCapture.asInstanceOf[js.Any], onSubmitCapture = onSubmitCapture.asInstanceOf[js.Any], onSuspendCapture = onSuspendCapture.asInstanceOf[js.Any], onTimeUpdateCapture = onTimeUpdateCapture.asInstanceOf[js.Any], onTouchCancelCapture = onTouchCancelCapture.asInstanceOf[js.Any], onTouchEndCapture = onTouchEndCapture.asInstanceOf[js.Any], onTouchMoveCapture = onTouchMoveCapture.asInstanceOf[js.Any], onTouchStartCapture = onTouchStartCapture.asInstanceOf[js.Any], onTransitionEndCapture = onTransitionEndCapture.asInstanceOf[js.Any], onVolumeChangeCapture = onVolumeChangeCapture.asInstanceOf[js.Any], onWaitingCapture = onWaitingCapture.asInstanceOf[js.Any], onWheelCapture = onWheelCapture.asInstanceOf[js.Any])
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
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(dualKnobs)) __obj.updateDynamic("dualKnobs")(dualKnobs.asInstanceOf[js.Any])
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
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onInvalid(t0).runNow()))
    if (onIonBlur != null) __obj.updateDynamic("onIonBlur")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonBlur(t0).runNow()))
    if (onIonChange != null) __obj.updateDynamic("onIonChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonChange(t0).runNow()))
    if (onIonFocus != null) __obj.updateDynamic("onIonFocus")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonFocus(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onRateChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onTransitionEnd(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onVolumeChange(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onWaiting(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactWheelEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonRangeElement with org.scalajs.dom.raw.Element]) => onWheel(t0).runNow()))
    if (!js.isUndefined(pin)) __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRangePickHTMLAttribute]
  }
}

