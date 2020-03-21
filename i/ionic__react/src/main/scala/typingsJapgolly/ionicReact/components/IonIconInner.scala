package typingsJapgolly.ionicReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.CompositionEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.UIEvent
import typingsJapgolly.ionicReact.PickIonicReactExternalProAbout
import typingsJapgolly.ionicReact.ionicReactStrings.`additions text`
import typingsJapgolly.ionicReact.ionicReactStrings.`inline`
import typingsJapgolly.ionicReact.ionicReactStrings.additions
import typingsJapgolly.ionicReact.ionicReactStrings.all
import typingsJapgolly.ionicReact.ionicReactStrings.ascending
import typingsJapgolly.ionicReact.ionicReactStrings.assertive
import typingsJapgolly.ionicReact.ionicReactStrings.both
import typingsJapgolly.ionicReact.ionicReactStrings.copy
import typingsJapgolly.ionicReact.ionicReactStrings.date
import typingsJapgolly.ionicReact.ionicReactStrings.descending
import typingsJapgolly.ionicReact.ionicReactStrings.dialog
import typingsJapgolly.ionicReact.ionicReactStrings.execute
import typingsJapgolly.ionicReact.ionicReactStrings.grammar
import typingsJapgolly.ionicReact.ionicReactStrings.grid
import typingsJapgolly.ionicReact.ionicReactStrings.horizontal
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
import typingsJapgolly.ionicReact.ionicReactStrings.off
import typingsJapgolly.ionicReact.ionicReactStrings.other
import typingsJapgolly.ionicReact.ionicReactStrings.page
import typingsJapgolly.ionicReact.ionicReactStrings.polite
import typingsJapgolly.ionicReact.ionicReactStrings.popup
import typingsJapgolly.ionicReact.ionicReactStrings.removals
import typingsJapgolly.ionicReact.ionicReactStrings.spelling
import typingsJapgolly.ionicReact.ionicReactStrings.step
import typingsJapgolly.ionicReact.ionicReactStrings.text
import typingsJapgolly.ionicReact.ionicReactStrings.time
import typingsJapgolly.ionicReact.ionicReactStrings.tree
import typingsJapgolly.ionicReact.ionicReactStrings.vertical
import typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement
import typingsJapgolly.react.AnonHtml
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonIconInner {
  def apply(
    onAbortCapture: js.Any,
    onAuxClickCapture: js.Any,
    onBeforeInputCapture: js.Any,
    onCanPlayCapture: js.Any,
    onCanPlayThroughCapture: js.Any,
    onDoubleClickCapture: js.Any,
    onDurationChangeCapture: js.Any,
    onEmptiedCapture: js.Any,
    onEncryptedCapture: js.Any,
    onEndedCapture: js.Any,
    onLoadStartCapture: js.Any,
    onLoadedDataCapture: js.Any,
    onLoadedMetadataCapture: js.Any,
    onPauseCapture: js.Any,
    onPlayCapture: js.Any,
    onPlayingCapture: js.Any,
    onProgressCapture: js.Any,
    onRateChangeCapture: js.Any,
    onSeekedCapture: js.Any,
    onSeekingCapture: js.Any,
    onSelectCapture: js.Any,
    onStalledCapture: js.Any,
    onSuspendCapture: js.Any,
    onTimeUpdateCapture: js.Any,
    onVolumeChangeCapture: js.Any,
    onWaitingCapture: js.Any,
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
    ariaLabel: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    autocapitalize: String = null,
    autocorrect: String = null,
    autosave: String = null,
    `class`: String | StringDictionary[Boolean] = null,
    className: String = null,
    color: String = null,
    contentEditable: Boolean | String = null,
    contenteditable: Boolean | String = null,
    contextMenu: String = null,
    contextmenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    flipRtl: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: js.Any = null,
    id: String = null,
    inlist: js.Any = null,
    innerHTML: String = null,
    inputMode: String = null,
    inputmode: String = null,
    ios: String = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    itemid: String = null,
    itemprop: String = null,
    itemref: String = null,
    itemscope: js.UndefOr[Boolean] = js.undefined,
    itemtype: String = null,
    lang: String = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    md: String = null,
    mode: ios | md = null,
    name: String = null,
    onAbort: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onAnimationEnd: /* event */ AnimationEvent => Callback = null,
    onAnimationEndCapture: /* event */ AnimationEvent => Callback = null,
    onAnimationIteration: /* event */ AnimationEvent => Callback = null,
    onAnimationIterationCapture: /* event */ AnimationEvent => Callback = null,
    onAnimationStart: /* event */ AnimationEvent => Callback = null,
    onAnimationStartCapture: /* event */ AnimationEvent => Callback = null,
    onAuxClick: /* event */ MouseEvent => Callback = null,
    onBeforeInput: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onBlur: /* event */ FocusEvent => Callback = null,
    onBlurCapture: /* event */ FocusEvent => Callback = null,
    onCanPlay: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onCanPlayThrough: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onChange: /* event */ Event_ => Callback = null,
    onChangeCapture: /* event */ Event_ => Callback = null,
    onClick: /* event */ MouseEvent => Callback = null,
    onClickCapture: /* event */ MouseEvent => Callback = null,
    onCompositionEnd: /* event */ CompositionEvent => Callback = null,
    onCompositionEndCapture: /* event */ CompositionEvent => Callback = null,
    onCompositionStart: /* event */ CompositionEvent => Callback = null,
    onCompositionStartCapture: /* event */ CompositionEvent => Callback = null,
    onCompositionUpdate: /* event */ CompositionEvent => Callback = null,
    onCompositionUpdateCapture: /* event */ CompositionEvent => Callback = null,
    onContextMenu: /* event */ MouseEvent => Callback = null,
    onContextMenuCapture: /* event */ MouseEvent => Callback = null,
    onCopy: /* event */ ClipboardEvent => Callback = null,
    onCopyCapture: /* event */ ClipboardEvent => Callback = null,
    onCut: /* event */ ClipboardEvent => Callback = null,
    onCutCapture: /* event */ ClipboardEvent => Callback = null,
    onDblClick: /* event */ MouseEvent => Callback = null,
    onDblClickCapture: /* event */ MouseEvent => Callback = null,
    onDoubleClick: ReactMouseEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onDrag: /* event */ DragEvent => Callback = null,
    onDragCapture: /* event */ DragEvent => Callback = null,
    onDragEnd: /* event */ DragEvent => Callback = null,
    onDragEndCapture: /* event */ DragEvent => Callback = null,
    onDragEnter: /* event */ DragEvent => Callback = null,
    onDragEnterCapture: /* event */ DragEvent => Callback = null,
    onDragExit: /* event */ DragEvent => Callback = null,
    onDragExitCapture: /* event */ DragEvent => Callback = null,
    onDragLeave: /* event */ DragEvent => Callback = null,
    onDragLeaveCapture: /* event */ DragEvent => Callback = null,
    onDragOver: /* event */ DragEvent => Callback = null,
    onDragOverCapture: /* event */ DragEvent => Callback = null,
    onDragStart: /* event */ DragEvent => Callback = null,
    onDragStartCapture: /* event */ DragEvent => Callback = null,
    onDrop: /* event */ DragEvent => Callback = null,
    onDropCapture: /* event */ DragEvent => Callback = null,
    onDurationChange: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onEmptied: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onEncrypted: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onEnded: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onError: /* event */ Event_ => Callback = null,
    onErrorCapture: /* event */ Event_ => Callback = null,
    onFocus: /* event */ FocusEvent => Callback = null,
    onFocusCapture: /* event */ FocusEvent => Callback = null,
    onGotPointerCapture: /* event */ PointerEvent => Callback = null,
    onGotPointerCaptureCapture: /* event */ PointerEvent => Callback = null,
    onInput: /* event */ Event_ => Callback = null,
    onInputCapture: /* event */ Event_ => Callback = null,
    onInvalid: /* event */ Event_ => Callback = null,
    onInvalidCapture: /* event */ Event_ => Callback = null,
    onKeyDown: /* event */ KeyboardEvent => Callback = null,
    onKeyDownCapture: /* event */ KeyboardEvent => Callback = null,
    onKeyPress: /* event */ KeyboardEvent => Callback = null,
    onKeyPressCapture: /* event */ KeyboardEvent => Callback = null,
    onKeyUp: /* event */ KeyboardEvent => Callback = null,
    onKeyUpCapture: /* event */ KeyboardEvent => Callback = null,
    onLoad: /* event */ Event_ => Callback = null,
    onLoadCapture: /* event */ Event_ => Callback = null,
    onLoadStart: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onLoadedData: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onLoadedMetadata: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onLostPointerCapture: /* event */ PointerEvent => Callback = null,
    onLostPointerCaptureCapture: /* event */ PointerEvent => Callback = null,
    onMouseDown: /* event */ MouseEvent => Callback = null,
    onMouseDownCapture: /* event */ MouseEvent => Callback = null,
    onMouseEnter: /* event */ MouseEvent => Callback = null,
    onMouseLeave: /* event */ MouseEvent => Callback = null,
    onMouseMove: /* event */ MouseEvent => Callback = null,
    onMouseMoveCapture: /* event */ MouseEvent => Callback = null,
    onMouseOut: /* event */ MouseEvent => Callback = null,
    onMouseOutCapture: /* event */ MouseEvent => Callback = null,
    onMouseOver: /* event */ MouseEvent => Callback = null,
    onMouseOverCapture: /* event */ MouseEvent => Callback = null,
    onMouseUp: /* event */ MouseEvent => Callback = null,
    onMouseUpCapture: /* event */ MouseEvent => Callback = null,
    onPaste: /* event */ ClipboardEvent => Callback = null,
    onPasteCapture: /* event */ ClipboardEvent => Callback = null,
    onPause: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onPlay: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onPlaying: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onPointerCancel: /* event */ PointerEvent => Callback = null,
    onPointerCancelCapture: /* event */ PointerEvent => Callback = null,
    onPointerDown: /* event */ PointerEvent => Callback = null,
    onPointerDownCapture: /* event */ PointerEvent => Callback = null,
    onPointerEnter: /* event */ PointerEvent => Callback = null,
    onPointerEnterCapture: /* event */ PointerEvent => Callback = null,
    onPointerLeave: /* event */ PointerEvent => Callback = null,
    onPointerLeaveCapture: /* event */ PointerEvent => Callback = null,
    onPointerMove: /* event */ PointerEvent => Callback = null,
    onPointerMoveCapture: /* event */ PointerEvent => Callback = null,
    onPointerOut: /* event */ PointerEvent => Callback = null,
    onPointerOutCapture: /* event */ PointerEvent => Callback = null,
    onPointerOver: /* event */ PointerEvent => Callback = null,
    onPointerOverCapture: /* event */ PointerEvent => Callback = null,
    onPointerUp: /* event */ PointerEvent => Callback = null,
    onPointerUpCapture: /* event */ PointerEvent => Callback = null,
    onProgress: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onRateChange: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onReset: /* event */ Event_ => Callback = null,
    onResetCapture: /* event */ Event_ => Callback = null,
    onScroll: /* event */ UIEvent => Callback = null,
    onScrollCapture: /* event */ UIEvent => Callback = null,
    onSeeked: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onSeeking: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onSelect: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onStalled: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onSubmit: /* event */ Event_ => Callback = null,
    onSubmitCapture: /* event */ Event_ => Callback = null,
    onSuspend: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onTimeUpdate: ReactEventFrom[HTMLIonIconElement with Element] => Callback = null,
    onTouchCancel: /* event */ TouchEvent => Callback = null,
    onTouchCancelCapture: /* event */ TouchEvent => Callback = null,
    onTouchEnd: /* event */ TouchEvent => Callback = null,
    onTouchEndCapture: /* event */ TouchEvent => Callback = null,
    onTouchMove: /* event */ TouchEvent => Callback = null,
    onTouchMoveCapture: /* event */ TouchEvent => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PickIonicReactExternalProAbout, 
    MountedWithRawType[
      PickIonicReactExternalProAbout, 
      js.Object, 
      RawMounted[PickIonicReactExternalProAbout, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(onAbortCapture = onAbortCapture.asInstanceOf[js.Any], onAuxClickCapture = onAuxClickCapture.asInstanceOf[js.Any], onBeforeInputCapture = onBeforeInputCapture.asInstanceOf[js.Any], onCanPlayCapture = onCanPlayCapture.asInstanceOf[js.Any], onCanPlayThroughCapture = onCanPlayThroughCapture.asInstanceOf[js.Any], onDoubleClickCapture = onDoubleClickCapture.asInstanceOf[js.Any], onDurationChangeCapture = onDurationChangeCapture.asInstanceOf[js.Any], onEmptiedCapture = onEmptiedCapture.asInstanceOf[js.Any], onEncryptedCapture = onEncryptedCapture.asInstanceOf[js.Any], onEndedCapture = onEndedCapture.asInstanceOf[js.Any], onLoadStartCapture = onLoadStartCapture.asInstanceOf[js.Any], onLoadedDataCapture = onLoadedDataCapture.asInstanceOf[js.Any], onLoadedMetadataCapture = onLoadedMetadataCapture.asInstanceOf[js.Any], onPauseCapture = onPauseCapture.asInstanceOf[js.Any], onPlayCapture = onPlayCapture.asInstanceOf[js.Any], onPlayingCapture = onPlayingCapture.asInstanceOf[js.Any], onProgressCapture = onProgressCapture.asInstanceOf[js.Any], onRateChangeCapture = onRateChangeCapture.asInstanceOf[js.Any], onSeekedCapture = onSeekedCapture.asInstanceOf[js.Any], onSeekingCapture = onSeekingCapture.asInstanceOf[js.Any], onSelectCapture = onSelectCapture.asInstanceOf[js.Any], onStalledCapture = onStalledCapture.asInstanceOf[js.Any], onSuspendCapture = onSuspendCapture.asInstanceOf[js.Any], onTimeUpdateCapture = onTimeUpdateCapture.asInstanceOf[js.Any], onVolumeChangeCapture = onVolumeChangeCapture.asInstanceOf[js.Any], onWaitingCapture = onWaitingCapture.asInstanceOf[js.Any])
  
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
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (autocapitalize != null) __obj.updateDynamic("autocapitalize")(autocapitalize.asInstanceOf[js.Any])
    if (autocorrect != null) __obj.updateDynamic("autocorrect")(autocorrect.asInstanceOf[js.Any])
    if (autosave != null) __obj.updateDynamic("autosave")(autosave.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contenteditable != null) __obj.updateDynamic("contenteditable")(contenteditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(contextmenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(flipRtl)) __obj.updateDynamic("flipRtl")(flipRtl.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (inputmode != null) __obj.updateDynamic("inputmode")(inputmode.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (itemid != null) __obj.updateDynamic("itemid")(itemid.asInstanceOf[js.Any])
    if (itemprop != null) __obj.updateDynamic("itemprop")(itemprop.asInstanceOf[js.Any])
    if (itemref != null) __obj.updateDynamic("itemref")(itemref.asInstanceOf[js.Any])
    if (!js.isUndefined(itemscope)) __obj.updateDynamic("itemscope")(itemscope.asInstanceOf[js.Any])
    if (itemtype != null) __obj.updateDynamic("itemtype")(itemtype.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onAbort(t0).runNow()))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.AnimationEvent) => onAnimationEnd(t0).runNow()))
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.AnimationEvent) => onAnimationEndCapture(t0).runNow()))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.AnimationEvent) => onAnimationIteration(t0).runNow()))
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.AnimationEvent) => onAnimationIterationCapture(t0).runNow()))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.AnimationEvent) => onAnimationStart(t0).runNow()))
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.AnimationEvent) => onAnimationStartCapture(t0).runNow()))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onAuxClick(t0).runNow()))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onBeforeInput(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.FocusEvent) => onBlur(t0).runNow()))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.FocusEvent) => onBlurCapture(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onCanPlay(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onCanPlayThrough(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onChange(t0).runNow()))
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onChangeCapture(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onClick(t0).runNow()))
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onClickCapture(t0).runNow()))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CompositionEvent) => onCompositionEnd(t0).runNow()))
    if (onCompositionEndCapture != null) __obj.updateDynamic("onCompositionEndCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CompositionEvent) => onCompositionEndCapture(t0).runNow()))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CompositionEvent) => onCompositionStart(t0).runNow()))
    if (onCompositionStartCapture != null) __obj.updateDynamic("onCompositionStartCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CompositionEvent) => onCompositionStartCapture(t0).runNow()))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CompositionEvent) => onCompositionUpdate(t0).runNow()))
    if (onCompositionUpdateCapture != null) __obj.updateDynamic("onCompositionUpdateCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CompositionEvent) => onCompositionUpdateCapture(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onContextMenu(t0).runNow()))
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onContextMenuCapture(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.ClipboardEvent) => onCopy(t0).runNow()))
    if (onCopyCapture != null) __obj.updateDynamic("onCopyCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.ClipboardEvent) => onCopyCapture(t0).runNow()))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.ClipboardEvent) => onCut(t0).runNow()))
    if (onCutCapture != null) __obj.updateDynamic("onCutCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.ClipboardEvent) => onCutCapture(t0).runNow()))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onDblClick(t0).runNow()))
    if (onDblClickCapture != null) __obj.updateDynamic("onDblClickCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onDblClickCapture(t0).runNow()))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onDoubleClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDrag(t0).runNow()))
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragCapture(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragEnd(t0).runNow()))
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragEndCapture(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragEnter(t0).runNow()))
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragEnterCapture(t0).runNow()))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragExit(t0).runNow()))
    if (onDragExitCapture != null) __obj.updateDynamic("onDragExitCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragExitCapture(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragLeave(t0).runNow()))
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragLeaveCapture(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragOver(t0).runNow()))
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragOverCapture(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragStart(t0).runNow()))
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDragStartCapture(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDrop(t0).runNow()))
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDropCapture(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onDurationChange(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onEmptied(t0).runNow()))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onEncrypted(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onEnded(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onError(t0).runNow()))
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onErrorCapture(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.FocusEvent) => onFocus(t0).runNow()))
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.FocusEvent) => onFocusCapture(t0).runNow()))
    if (onGotPointerCapture != null) __obj.updateDynamic("onGotPointerCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onGotPointerCapture(t0).runNow()))
    if (onGotPointerCaptureCapture != null) __obj.updateDynamic("onGotPointerCaptureCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onGotPointerCaptureCapture(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onInput(t0).runNow()))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onInputCapture(t0).runNow()))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onInvalid(t0).runNow()))
    if (onInvalidCapture != null) __obj.updateDynamic("onInvalidCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onInvalidCapture(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyDown(t0).runNow()))
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyDownCapture(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyPress(t0).runNow()))
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyPressCapture(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyUp(t0).runNow()))
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyUpCapture(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onLoad(t0).runNow()))
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onLoadCapture(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onLoadStart(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onLoadedData(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onLoadedMetadata(t0).runNow()))
    if (onLostPointerCapture != null) __obj.updateDynamic("onLostPointerCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onLostPointerCapture(t0).runNow()))
    if (onLostPointerCaptureCapture != null) __obj.updateDynamic("onLostPointerCaptureCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onLostPointerCaptureCapture(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseDown(t0).runNow()))
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseDownCapture(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseMove(t0).runNow()))
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseMoveCapture(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseOut(t0).runNow()))
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseOutCapture(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseOver(t0).runNow()))
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseOverCapture(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseUp(t0).runNow()))
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseUpCapture(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.ClipboardEvent) => onPaste(t0).runNow()))
    if (onPasteCapture != null) __obj.updateDynamic("onPasteCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.ClipboardEvent) => onPasteCapture(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onPlay(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onPlaying(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerCancel(t0).runNow()))
    if (onPointerCancelCapture != null) __obj.updateDynamic("onPointerCancelCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerCancelCapture(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerDown(t0).runNow()))
    if (onPointerDownCapture != null) __obj.updateDynamic("onPointerDownCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerDownCapture(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerEnter(t0).runNow()))
    if (onPointerEnterCapture != null) __obj.updateDynamic("onPointerEnterCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerEnterCapture(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerLeave(t0).runNow()))
    if (onPointerLeaveCapture != null) __obj.updateDynamic("onPointerLeaveCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerLeaveCapture(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerMove(t0).runNow()))
    if (onPointerMoveCapture != null) __obj.updateDynamic("onPointerMoveCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerMoveCapture(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerOut(t0).runNow()))
    if (onPointerOutCapture != null) __obj.updateDynamic("onPointerOutCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerOutCapture(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerOver(t0).runNow()))
    if (onPointerOverCapture != null) __obj.updateDynamic("onPointerOverCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerOverCapture(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerUp(t0).runNow()))
    if (onPointerUpCapture != null) __obj.updateDynamic("onPointerUpCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.PointerEvent) => onPointerUpCapture(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onProgress(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onRateChange(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onReset(t0).runNow()))
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onResetCapture(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.UIEvent) => onScroll(t0).runNow()))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.UIEvent) => onScrollCapture(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onSeeked(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onSeeking(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onSelect(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onStalled(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onSubmit(t0).runNow()))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onSubmitCapture(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onSuspend(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.ionicons.componentsMod._Global_.HTMLIonIconElement with org.scalajs.dom.raw.Element]) => onTimeUpdate(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchCancel(t0).runNow()))
    if (onTouchCancelCapture != null) __obj.updateDynamic("onTouchCancelCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchCancelCapture(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchEnd(t0).runNow()))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchEndCapture(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchMove(t0).runNow()))
    if (onTouchMoveCapture != null) __obj.updateDynamic("onTouchMoveCapture")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.TouchEvent) => onTouchMoveCapture(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.ionicReact.PickIonicReactExternalProAbout, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.ionicReact.PickIonicReactExternalProAbout])(children: _*)
  }
  @JSImport("@ionic/react/dist/types/components/inner-proxies", "IonIconInner")
  @js.native
  object componentImport extends js.Object
  
}

