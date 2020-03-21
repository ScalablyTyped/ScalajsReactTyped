package typingsJapgolly.ionicReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
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
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement
import typingsJapgolly.ionicReact.IonSlidesPickHTMLAttribut
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
import typingsJapgolly.ionicReact.ionicReactStrings.none
import typingsJapgolly.ionicReact.ionicReactStrings.numeric
import typingsJapgolly.ionicReact.ionicReactStrings.off
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
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.react.mod.Booleanish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonSlides {
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
    `class`: String = null,
    className: String = null,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
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
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    mode: ios | md = null,
    onAbort: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onAnimationEnd: ReactAnimationEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onAnimationIteration: ReactAnimationEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onAnimationStart: ReactAnimationEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onAuxClick: ReactMouseEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onBeforeInput: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onBlur: ReactFocusEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onCanPlay: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onCanPlayThrough: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onChange: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onClick: ReactMouseEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onCompositionEnd: ReactCompositionEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onCompositionStart: ReactCompositionEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onCompositionUpdate: ReactCompositionEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onContextMenu: ReactMouseEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onCopy: ReactClipboardEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onCut: ReactClipboardEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onDoubleClick: ReactMouseEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onDrag: ReactDragEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onDragEnd: ReactDragEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onDragEnter: ReactDragEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onDragExit: ReactDragEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onDragLeave: ReactDragEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onDragOver: ReactDragEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onDragStart: ReactDragEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onDrop: ReactDragEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onDurationChange: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onEmptied: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onEncrypted: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onEnded: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onError: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onFocus: ReactFocusEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onInput: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onInvalid: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onIonSlideDidChange: /* event */ CustomEvent => Callback = null,
    onIonSlideDoubleTap: /* event */ CustomEvent => Callback = null,
    onIonSlideDrag: /* event */ CustomEvent => Callback = null,
    onIonSlideNextEnd: /* event */ CustomEvent => Callback = null,
    onIonSlideNextStart: /* event */ CustomEvent => Callback = null,
    onIonSlidePrevEnd: /* event */ CustomEvent => Callback = null,
    onIonSlidePrevStart: /* event */ CustomEvent => Callback = null,
    onIonSlideReachEnd: /* event */ CustomEvent => Callback = null,
    onIonSlideReachStart: /* event */ CustomEvent => Callback = null,
    onIonSlideTap: /* event */ CustomEvent => Callback = null,
    onIonSlideTouchEnd: /* event */ CustomEvent => Callback = null,
    onIonSlideTouchStart: /* event */ CustomEvent => Callback = null,
    onIonSlideTransitionEnd: /* event */ CustomEvent => Callback = null,
    onIonSlideTransitionStart: /* event */ CustomEvent => Callback = null,
    onIonSlideWillChange: /* event */ CustomEvent => Callback = null,
    onIonSlidesDidLoad: /* event */ CustomEvent => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onLoad: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onLoadStart: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onLoadedData: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onLoadedMetadata: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onMouseDown: ReactMouseEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onMouseMove: ReactMouseEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onMouseOut: ReactMouseEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onMouseOver: ReactMouseEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onMouseUp: ReactMouseEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onPaste: ReactClipboardEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onPause: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onPlay: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onPlaying: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onPointerCancel: ReactPointerEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onPointerDown: ReactPointerEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onPointerEnter: ReactPointerEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onPointerLeave: ReactPointerEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onPointerMove: ReactPointerEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onPointerOut: ReactPointerEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onPointerOver: ReactPointerEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onPointerUp: ReactPointerEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onProgress: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onRateChange: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onReset: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onScroll: ReactUIEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onSeeked: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onSeeking: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onSelect: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onStalled: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onSubmit: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onSuspend: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onTimeUpdate: ReactEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onTouchCancel: ReactTouchEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onTouchMove: ReactTouchEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onTouchStart: ReactTouchEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    onTransitionEnd: ReactTransitionEventFrom[HTMLIonSlidesElement with Element] => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IonSlidesPickHTMLAttribut, 
    MountedWithRawType[
      IonSlidesPickHTMLAttribut, 
      js.Object, 
      RawMounted[IonSlidesPickHTMLAttribut, js.Object]
    ]
  ] = {
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
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
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
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onAnimationEnd(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onAnimationIteration(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactAnimationEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onAnimationStart(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onCompositionEnd(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onCompositionStart(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactCompositionEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onCompositionUpdate(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onContextMenu(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onCopy(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onCut(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onDragEnd(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onDragEnter(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onDragExit(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onDragLeave(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onDragOver(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onDragStart(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactDragEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onDrop(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onError(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onInput(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onInvalid(t0).runNow()))
    if (onIonSlideDidChange != null) __obj.updateDynamic("onIonSlideDidChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideDidChange(t0).runNow()))
    if (onIonSlideDoubleTap != null) __obj.updateDynamic("onIonSlideDoubleTap")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideDoubleTap(t0).runNow()))
    if (onIonSlideDrag != null) __obj.updateDynamic("onIonSlideDrag")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideDrag(t0).runNow()))
    if (onIonSlideNextEnd != null) __obj.updateDynamic("onIonSlideNextEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideNextEnd(t0).runNow()))
    if (onIonSlideNextStart != null) __obj.updateDynamic("onIonSlideNextStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideNextStart(t0).runNow()))
    if (onIonSlidePrevEnd != null) __obj.updateDynamic("onIonSlidePrevEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlidePrevEnd(t0).runNow()))
    if (onIonSlidePrevStart != null) __obj.updateDynamic("onIonSlidePrevStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlidePrevStart(t0).runNow()))
    if (onIonSlideReachEnd != null) __obj.updateDynamic("onIonSlideReachEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideReachEnd(t0).runNow()))
    if (onIonSlideReachStart != null) __obj.updateDynamic("onIonSlideReachStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideReachStart(t0).runNow()))
    if (onIonSlideTap != null) __obj.updateDynamic("onIonSlideTap")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideTap(t0).runNow()))
    if (onIonSlideTouchEnd != null) __obj.updateDynamic("onIonSlideTouchEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideTouchEnd(t0).runNow()))
    if (onIonSlideTouchStart != null) __obj.updateDynamic("onIonSlideTouchStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideTouchStart(t0).runNow()))
    if (onIonSlideTransitionEnd != null) __obj.updateDynamic("onIonSlideTransitionEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideTransitionEnd(t0).runNow()))
    if (onIonSlideTransitionStart != null) __obj.updateDynamic("onIonSlideTransitionStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideTransitionStart(t0).runNow()))
    if (onIonSlideWillChange != null) __obj.updateDynamic("onIonSlideWillChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideWillChange(t0).runNow()))
    if (onIonSlidesDidLoad != null) __obj.updateDynamic("onIonSlidesDidLoad")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlidesDidLoad(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onLoad(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onLoadedMetadata(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onMouseOut(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onMouseOver(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onMouseUp(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactClipboardEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onPaste(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onPointerCancel(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onPointerDown(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onPointerEnter(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onPointerLeave(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onPointerMove(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onPointerOut(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onPointerOver(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactPointerEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onPointerUp(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onRateChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onReset(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onScroll(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onSubmit(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[
  typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonSlidesElement with org.scalajs.dom.raw.Element]) => onTransitionEnd(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.ionicReact.IonSlidesPickHTMLAttribut, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.ionicReact.IonSlidesPickHTMLAttribut])(children: _*)
  }
  @JSImport("@ionic/react", "IonSlides")
  @js.native
  object componentImport extends js.Object
  
}

