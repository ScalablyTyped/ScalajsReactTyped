package typingsJapgolly.reactEventListener.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
import org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
import org.scalajs.dom.raw.BeforeUnloadEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HashChangeEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.PopStateEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.StorageEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsJapgolly.reactEventListener.mod.EventListenerProps
import typingsJapgolly.reactEventListener.mod.default
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Event_
import typingsJapgolly.std.MSGestureEvent
import typingsJapgolly.std.MSPointerEvent
import typingsJapgolly.std.PageTransitionEvent
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactEventListener {
  def apply(
    target: Window_ | Document_ | String,
    oNmsPointerUp: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    oNmsPointerUpCapture: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onAbort: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onAbortCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onAfterPrint: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onAfterPrintCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onBeforePrint: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onBeforePrintCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onBeforeUnload: /* ev */ BeforeUnloadEvent => CallbackTo[js.Any] = null,
    onBeforeUnloadCapture: /* ev */ BeforeUnloadEvent => CallbackTo[js.Any] = null,
    onBlur: /* ev */ FocusEvent => CallbackTo[js.Any] = null,
    onBlurCapture: /* ev */ FocusEvent => CallbackTo[js.Any] = null,
    onCanPlay: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onCanPlayCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onCanPlayThrough: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onCanPlayThroughCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onChange: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onChangeCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onClick: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onClickCapture: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onCompassNeedsCalibration: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onCompassNeedsCalibrationCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onContextMenu: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onContextMenuCapture: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onDblClick: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onDblClickCapture: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onDeviceMotion: /* ev */ DeviceMotionEvent => CallbackTo[js.Any] = null,
    onDeviceMotionCapture: /* ev */ DeviceMotionEvent => CallbackTo[js.Any] = null,
    onDeviceOrientation: /* ev */ DeviceOrientationEvent => CallbackTo[js.Any] = null,
    onDeviceOrientationCapture: /* ev */ DeviceOrientationEvent => CallbackTo[js.Any] = null,
    onDrag: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDragCapture: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDragEnd: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDragEndCapture: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDragEnter: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDragEnterCapture: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDragLeave: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDragLeaveCapture: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDragOver: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDragOverCapture: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDragStart: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDragStartCapture: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDrop: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDropCapture: /* ev */ DragEvent => CallbackTo[js.Any] = null,
    onDurationChange: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onDurationChangeCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onEmptied: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onEmptiedCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onEnded: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onEndedCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onError: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any = null,
    onErrorCapture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any = null,
    onFocus: /* ev */ FocusEvent => CallbackTo[js.Any] = null,
    onFocusCapture: /* ev */ FocusEvent => CallbackTo[js.Any] = null,
    onHashChange: /* ev */ HashChangeEvent => CallbackTo[js.Any] = null,
    onHashChangeCapture: /* ev */ HashChangeEvent => CallbackTo[js.Any] = null,
    onInput: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onInputCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onKeyDown: /* ev */ KeyboardEvent => CallbackTo[js.Any] = null,
    onKeyDownCapture: /* ev */ KeyboardEvent => CallbackTo[js.Any] = null,
    onKeyPress: /* ev */ KeyboardEvent => CallbackTo[js.Any] = null,
    onKeyPressCapture: /* ev */ KeyboardEvent => CallbackTo[js.Any] = null,
    onKeyUp: /* ev */ KeyboardEvent => CallbackTo[js.Any] = null,
    onKeyUpCapture: /* ev */ KeyboardEvent => CallbackTo[js.Any] = null,
    onLoad: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onLoadCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onLoadStart: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onLoadStartCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onLoadedData: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onLoadedDataCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onLoadedMetadata: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onLoadedMetadataCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onMessage: /* ev */ MessageEvent => CallbackTo[js.Any] = null,
    onMessageCapture: /* ev */ MessageEvent => CallbackTo[js.Any] = null,
    onMouseDown: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseDownCapture: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseEnter: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseEnterCapture: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseLeave: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseLeaveCapture: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseMove: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseMoveCapture: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseOut: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseOutCapture: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseOver: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseOverCapture: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseUp: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseUpCapture: /* ev */ MouseEvent => CallbackTo[js.Any] = null,
    onMouseWheel: /* ev */ WheelEvent => CallbackTo[js.Any] = null,
    onMouseWheelCapture: /* ev */ WheelEvent => CallbackTo[js.Any] = null,
    onMsGestureChange: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsGestureChangeCapture: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsGestureDoubleTap: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsGestureDoubleTapCapture: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsGestureEnd: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsGestureEndCapture: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsGestureHold: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsGestureHoldCapture: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsGestureStart: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsGestureStartCapture: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsGestureTap: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsGestureTapCapture: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsInertiaStart: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsInertiaStartCapture: /* ev */ MSGestureEvent => CallbackTo[js.Any] = null,
    onMsPointerCancel: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onMsPointerCancelCapture: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onMsPointerDown: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onMsPointerDownCapture: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onMsPointerEnter: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onMsPointerEnterCapture: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onMsPointerLeave: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onMsPointerLeaveCapture: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onMsPointerMove: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onMsPointerMoveCapture: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onMsPointerOut: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onMsPointerOutCapture: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onMsPointerOver: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onMsPointerOverCapture: /* ev */ MSPointerEvent => CallbackTo[js.Any] = null,
    onOffline: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onOfflineCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onOnline: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onOnlineCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onOrientationChange: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onOrientationChangeCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onPageHide: /* ev */ PageTransitionEvent => CallbackTo[js.Any] = null,
    onPageHideCapture: /* ev */ PageTransitionEvent => CallbackTo[js.Any] = null,
    onPageShow: /* ev */ PageTransitionEvent => CallbackTo[js.Any] = null,
    onPageShowCapture: /* ev */ PageTransitionEvent => CallbackTo[js.Any] = null,
    onPause: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onPauseCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onPlay: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onPlayCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onPlaying: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onPlayingCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onPointerCancel: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerCancelCapture: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerDown: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerDownCapture: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerEnter: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerEnterCapture: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerLeave: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerLeaveCapture: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerMove: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerMoveCapture: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerOut: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerOutCapture: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerOver: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerOverCapture: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerUp: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPointerUpCapture: /* ev */ PointerEvent => CallbackTo[js.Any] = null,
    onPopState: /* ev */ PopStateEvent => CallbackTo[js.Any] = null,
    onPopStateCapture: /* ev */ PopStateEvent => CallbackTo[js.Any] = null,
    onProgress: /* ev */ ProgressEvent => CallbackTo[js.Any] = null,
    onProgressCapture: /* ev */ ProgressEvent => CallbackTo[js.Any] = null,
    onRateChange: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onRateChangeCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onReadyStateChange: /* ev */ ProgressEvent => CallbackTo[js.Any] = null,
    onReadyStateChangeCapture: /* ev */ ProgressEvent => CallbackTo[js.Any] = null,
    onReset: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onResetCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onResize: /* ev */ UIEvent => CallbackTo[js.Any] = null,
    onResizeCapture: /* ev */ UIEvent => CallbackTo[js.Any] = null,
    onScroll: /* ev */ UIEvent => CallbackTo[js.Any] = null,
    onScrollCapture: /* ev */ UIEvent => CallbackTo[js.Any] = null,
    onSeeked: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onSeekedCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onSeeking: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onSeekingCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onSelect: /* ev */ UIEvent => CallbackTo[js.Any] = null,
    onSelectCapture: /* ev */ UIEvent => CallbackTo[js.Any] = null,
    onSelectionChange: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onSelectionChangeCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onStalled: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onStalledCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onStorage: /* ev */ StorageEvent => CallbackTo[js.Any] = null,
    onStorageCapture: /* ev */ StorageEvent => CallbackTo[js.Any] = null,
    onSubmit: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onSubmitCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onSuspend: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onSuspendCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onTimeUpdate: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onTimeUpdateCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onTouchCancel: js.Any = null,
    onTouchCancelCapture: js.Any = null,
    onTouchEnd: js.Any = null,
    onTouchEndCapture: js.Any = null,
    onTouchMove: js.Any = null,
    onTouchMoveCapture: js.Any = null,
    onTouchStart: js.Any = null,
    onTouchStartCapture: js.Any = null,
    onUnload: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onUnloadCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onVolumeChange: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onVolumeChangeCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onWaiting: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onWaitingCapture: /* ev */ Event_ => CallbackTo[js.Any] = null,
    onWheel: /* ev */ WheelEvent => CallbackTo[js.Any] = null,
    onWheelCapture: /* ev */ WheelEvent => CallbackTo[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[EventListenerProps, default, Unit, EventListenerProps] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
  
      if (oNmsPointerUp != null) __obj.updateDynamic("oNmsPointerUp")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => oNmsPointerUp(t0).runNow()))
    if (oNmsPointerUpCapture != null) __obj.updateDynamic("oNmsPointerUpCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => oNmsPointerUpCapture(t0).runNow()))
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onAbort(t0).runNow()))
    if (onAbortCapture != null) __obj.updateDynamic("onAbortCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onAbortCapture(t0).runNow()))
    if (onAfterPrint != null) __obj.updateDynamic("onAfterPrint")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onAfterPrint(t0).runNow()))
    if (onAfterPrintCapture != null) __obj.updateDynamic("onAfterPrintCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onAfterPrintCapture(t0).runNow()))
    if (onBeforePrint != null) __obj.updateDynamic("onBeforePrint")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onBeforePrint(t0).runNow()))
    if (onBeforePrintCapture != null) __obj.updateDynamic("onBeforePrintCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onBeforePrintCapture(t0).runNow()))
    if (onBeforeUnload != null) __obj.updateDynamic("onBeforeUnload")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.BeforeUnloadEvent) => onBeforeUnload(t0).runNow()))
    if (onBeforeUnloadCapture != null) __obj.updateDynamic("onBeforeUnloadCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.BeforeUnloadEvent) => onBeforeUnloadCapture(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.FocusEvent) => onBlur(t0).runNow()))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.FocusEvent) => onBlurCapture(t0).runNow()))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onCanPlay(t0).runNow()))
    if (onCanPlayCapture != null) __obj.updateDynamic("onCanPlayCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onCanPlayCapture(t0).runNow()))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onCanPlayThrough(t0).runNow()))
    if (onCanPlayThroughCapture != null) __obj.updateDynamic("onCanPlayThroughCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onCanPlayThroughCapture(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onChange(t0).runNow()))
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onChangeCapture(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onClick(t0).runNow()))
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onClickCapture(t0).runNow()))
    if (onCompassNeedsCalibration != null) __obj.updateDynamic("onCompassNeedsCalibration")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onCompassNeedsCalibration(t0).runNow()))
    if (onCompassNeedsCalibrationCapture != null) __obj.updateDynamic("onCompassNeedsCalibrationCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onCompassNeedsCalibrationCapture(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onContextMenu(t0).runNow()))
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onContextMenuCapture(t0).runNow()))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onDblClick(t0).runNow()))
    if (onDblClickCapture != null) __obj.updateDynamic("onDblClickCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onDblClickCapture(t0).runNow()))
    if (onDeviceMotion != null) __obj.updateDynamic("onDeviceMotion")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent) => onDeviceMotion(t0).runNow()))
    if (onDeviceMotionCapture != null) __obj.updateDynamic("onDeviceMotionCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent) => onDeviceMotionCapture(t0).runNow()))
    if (onDeviceOrientation != null) __obj.updateDynamic("onDeviceOrientation")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent) => onDeviceOrientation(t0).runNow()))
    if (onDeviceOrientationCapture != null) __obj.updateDynamic("onDeviceOrientationCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent) => onDeviceOrientationCapture(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDrag(t0).runNow()))
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDragCapture(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDragEnd(t0).runNow()))
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDragEndCapture(t0).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDragEnter(t0).runNow()))
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDragEnterCapture(t0).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDragLeave(t0).runNow()))
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDragLeaveCapture(t0).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDragOver(t0).runNow()))
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDragOverCapture(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDragStart(t0).runNow()))
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDragStartCapture(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDrop(t0).runNow()))
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => onDropCapture(t0).runNow()))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onDurationChange(t0).runNow()))
    if (onDurationChangeCapture != null) __obj.updateDynamic("onDurationChangeCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onDurationChangeCapture(t0).runNow()))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onEmptied(t0).runNow()))
    if (onEmptiedCapture != null) __obj.updateDynamic("onEmptiedCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onEmptiedCapture(t0).runNow()))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onEnded(t0).runNow()))
    if (onEndedCapture != null) __obj.updateDynamic("onEndedCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onEndedCapture(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(onErrorCapture.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.FocusEvent) => onFocus(t0).runNow()))
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.FocusEvent) => onFocusCapture(t0).runNow()))
    if (onHashChange != null) __obj.updateDynamic("onHashChange")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.HashChangeEvent) => onHashChange(t0).runNow()))
    if (onHashChangeCapture != null) __obj.updateDynamic("onHashChangeCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.HashChangeEvent) => onHashChangeCapture(t0).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onInput(t0).runNow()))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onInputCapture(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.KeyboardEvent) => onKeyDown(t0).runNow()))
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.KeyboardEvent) => onKeyDownCapture(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.KeyboardEvent) => onKeyPress(t0).runNow()))
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.KeyboardEvent) => onKeyPressCapture(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.KeyboardEvent) => onKeyUp(t0).runNow()))
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.KeyboardEvent) => onKeyUpCapture(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onLoad(t0).runNow()))
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onLoadCapture(t0).runNow()))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onLoadStart(t0).runNow()))
    if (onLoadStartCapture != null) __obj.updateDynamic("onLoadStartCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onLoadStartCapture(t0).runNow()))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onLoadedData(t0).runNow()))
    if (onLoadedDataCapture != null) __obj.updateDynamic("onLoadedDataCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onLoadedDataCapture(t0).runNow()))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onLoadedMetadata(t0).runNow()))
    if (onLoadedMetadataCapture != null) __obj.updateDynamic("onLoadedMetadataCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onLoadedMetadataCapture(t0).runNow()))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MessageEvent) => onMessage(t0).runNow()))
    if (onMessageCapture != null) __obj.updateDynamic("onMessageCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MessageEvent) => onMessageCapture(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseDown(t0).runNow()))
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseDownCapture(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseEnter(t0).runNow()))
    if (onMouseEnterCapture != null) __obj.updateDynamic("onMouseEnterCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseEnterCapture(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseLeave(t0).runNow()))
    if (onMouseLeaveCapture != null) __obj.updateDynamic("onMouseLeaveCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseLeaveCapture(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseMove(t0).runNow()))
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseMoveCapture(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseOut(t0).runNow()))
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseOutCapture(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseOver(t0).runNow()))
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseOverCapture(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseUp(t0).runNow()))
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onMouseUpCapture(t0).runNow()))
    if (onMouseWheel != null) __obj.updateDynamic("onMouseWheel")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.WheelEvent) => onMouseWheel(t0).runNow()))
    if (onMouseWheelCapture != null) __obj.updateDynamic("onMouseWheelCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.WheelEvent) => onMouseWheelCapture(t0).runNow()))
    if (onMsGestureChange != null) __obj.updateDynamic("onMsGestureChange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsGestureChange(t0).runNow()))
    if (onMsGestureChangeCapture != null) __obj.updateDynamic("onMsGestureChangeCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsGestureChangeCapture(t0).runNow()))
    if (onMsGestureDoubleTap != null) __obj.updateDynamic("onMsGestureDoubleTap")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsGestureDoubleTap(t0).runNow()))
    if (onMsGestureDoubleTapCapture != null) __obj.updateDynamic("onMsGestureDoubleTapCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsGestureDoubleTapCapture(t0).runNow()))
    if (onMsGestureEnd != null) __obj.updateDynamic("onMsGestureEnd")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsGestureEnd(t0).runNow()))
    if (onMsGestureEndCapture != null) __obj.updateDynamic("onMsGestureEndCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsGestureEndCapture(t0).runNow()))
    if (onMsGestureHold != null) __obj.updateDynamic("onMsGestureHold")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsGestureHold(t0).runNow()))
    if (onMsGestureHoldCapture != null) __obj.updateDynamic("onMsGestureHoldCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsGestureHoldCapture(t0).runNow()))
    if (onMsGestureStart != null) __obj.updateDynamic("onMsGestureStart")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsGestureStart(t0).runNow()))
    if (onMsGestureStartCapture != null) __obj.updateDynamic("onMsGestureStartCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsGestureStartCapture(t0).runNow()))
    if (onMsGestureTap != null) __obj.updateDynamic("onMsGestureTap")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsGestureTap(t0).runNow()))
    if (onMsGestureTapCapture != null) __obj.updateDynamic("onMsGestureTapCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsGestureTapCapture(t0).runNow()))
    if (onMsInertiaStart != null) __obj.updateDynamic("onMsInertiaStart")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsInertiaStart(t0).runNow()))
    if (onMsInertiaStartCapture != null) __obj.updateDynamic("onMsInertiaStartCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSGestureEvent) => onMsInertiaStartCapture(t0).runNow()))
    if (onMsPointerCancel != null) __obj.updateDynamic("onMsPointerCancel")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerCancel(t0).runNow()))
    if (onMsPointerCancelCapture != null) __obj.updateDynamic("onMsPointerCancelCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerCancelCapture(t0).runNow()))
    if (onMsPointerDown != null) __obj.updateDynamic("onMsPointerDown")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerDown(t0).runNow()))
    if (onMsPointerDownCapture != null) __obj.updateDynamic("onMsPointerDownCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerDownCapture(t0).runNow()))
    if (onMsPointerEnter != null) __obj.updateDynamic("onMsPointerEnter")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerEnter(t0).runNow()))
    if (onMsPointerEnterCapture != null) __obj.updateDynamic("onMsPointerEnterCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerEnterCapture(t0).runNow()))
    if (onMsPointerLeave != null) __obj.updateDynamic("onMsPointerLeave")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerLeave(t0).runNow()))
    if (onMsPointerLeaveCapture != null) __obj.updateDynamic("onMsPointerLeaveCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerLeaveCapture(t0).runNow()))
    if (onMsPointerMove != null) __obj.updateDynamic("onMsPointerMove")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerMove(t0).runNow()))
    if (onMsPointerMoveCapture != null) __obj.updateDynamic("onMsPointerMoveCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerMoveCapture(t0).runNow()))
    if (onMsPointerOut != null) __obj.updateDynamic("onMsPointerOut")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerOut(t0).runNow()))
    if (onMsPointerOutCapture != null) __obj.updateDynamic("onMsPointerOutCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerOutCapture(t0).runNow()))
    if (onMsPointerOver != null) __obj.updateDynamic("onMsPointerOver")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerOver(t0).runNow()))
    if (onMsPointerOverCapture != null) __obj.updateDynamic("onMsPointerOverCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.MSPointerEvent) => onMsPointerOverCapture(t0).runNow()))
    if (onOffline != null) __obj.updateDynamic("onOffline")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onOffline(t0).runNow()))
    if (onOfflineCapture != null) __obj.updateDynamic("onOfflineCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onOfflineCapture(t0).runNow()))
    if (onOnline != null) __obj.updateDynamic("onOnline")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onOnline(t0).runNow()))
    if (onOnlineCapture != null) __obj.updateDynamic("onOnlineCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onOnlineCapture(t0).runNow()))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onOrientationChange(t0).runNow()))
    if (onOrientationChangeCapture != null) __obj.updateDynamic("onOrientationChangeCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onOrientationChangeCapture(t0).runNow()))
    if (onPageHide != null) __obj.updateDynamic("onPageHide")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.PageTransitionEvent) => onPageHide(t0).runNow()))
    if (onPageHideCapture != null) __obj.updateDynamic("onPageHideCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.PageTransitionEvent) => onPageHideCapture(t0).runNow()))
    if (onPageShow != null) __obj.updateDynamic("onPageShow")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.PageTransitionEvent) => onPageShow(t0).runNow()))
    if (onPageShowCapture != null) __obj.updateDynamic("onPageShowCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.PageTransitionEvent) => onPageShowCapture(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onPause(t0).runNow()))
    if (onPauseCapture != null) __obj.updateDynamic("onPauseCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onPauseCapture(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onPlay(t0).runNow()))
    if (onPlayCapture != null) __obj.updateDynamic("onPlayCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onPlayCapture(t0).runNow()))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onPlaying(t0).runNow()))
    if (onPlayingCapture != null) __obj.updateDynamic("onPlayingCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onPlayingCapture(t0).runNow()))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerCancel(t0).runNow()))
    if (onPointerCancelCapture != null) __obj.updateDynamic("onPointerCancelCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerCancelCapture(t0).runNow()))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerDown(t0).runNow()))
    if (onPointerDownCapture != null) __obj.updateDynamic("onPointerDownCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerDownCapture(t0).runNow()))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerEnter(t0).runNow()))
    if (onPointerEnterCapture != null) __obj.updateDynamic("onPointerEnterCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerEnterCapture(t0).runNow()))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerLeave(t0).runNow()))
    if (onPointerLeaveCapture != null) __obj.updateDynamic("onPointerLeaveCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerLeaveCapture(t0).runNow()))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerMove(t0).runNow()))
    if (onPointerMoveCapture != null) __obj.updateDynamic("onPointerMoveCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerMoveCapture(t0).runNow()))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerOut(t0).runNow()))
    if (onPointerOutCapture != null) __obj.updateDynamic("onPointerOutCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerOutCapture(t0).runNow()))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerOver(t0).runNow()))
    if (onPointerOverCapture != null) __obj.updateDynamic("onPointerOverCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerOverCapture(t0).runNow()))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerUp(t0).runNow()))
    if (onPointerUpCapture != null) __obj.updateDynamic("onPointerUpCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => onPointerUpCapture(t0).runNow()))
    if (onPopState != null) __obj.updateDynamic("onPopState")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PopStateEvent) => onPopState(t0).runNow()))
    if (onPopStateCapture != null) __obj.updateDynamic("onPopStateCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PopStateEvent) => onPopStateCapture(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.ProgressEvent) => onProgress(t0).runNow()))
    if (onProgressCapture != null) __obj.updateDynamic("onProgressCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.ProgressEvent) => onProgressCapture(t0).runNow()))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onRateChange(t0).runNow()))
    if (onRateChangeCapture != null) __obj.updateDynamic("onRateChangeCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onRateChangeCapture(t0).runNow()))
    if (onReadyStateChange != null) __obj.updateDynamic("onReadyStateChange")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.ProgressEvent) => onReadyStateChange(t0).runNow()))
    if (onReadyStateChangeCapture != null) __obj.updateDynamic("onReadyStateChangeCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.ProgressEvent) => onReadyStateChangeCapture(t0).runNow()))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onReset(t0).runNow()))
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onResetCapture(t0).runNow()))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.UIEvent) => onResize(t0).runNow()))
    if (onResizeCapture != null) __obj.updateDynamic("onResizeCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.UIEvent) => onResizeCapture(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.UIEvent) => onScroll(t0).runNow()))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.UIEvent) => onScrollCapture(t0).runNow()))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onSeeked(t0).runNow()))
    if (onSeekedCapture != null) __obj.updateDynamic("onSeekedCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onSeekedCapture(t0).runNow()))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onSeeking(t0).runNow()))
    if (onSeekingCapture != null) __obj.updateDynamic("onSeekingCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onSeekingCapture(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.UIEvent) => onSelect(t0).runNow()))
    if (onSelectCapture != null) __obj.updateDynamic("onSelectCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.UIEvent) => onSelectCapture(t0).runNow()))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onSelectionChange(t0).runNow()))
    if (onSelectionChangeCapture != null) __obj.updateDynamic("onSelectionChangeCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onSelectionChangeCapture(t0).runNow()))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onStalled(t0).runNow()))
    if (onStalledCapture != null) __obj.updateDynamic("onStalledCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onStalledCapture(t0).runNow()))
    if (onStorage != null) __obj.updateDynamic("onStorage")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.StorageEvent) => onStorage(t0).runNow()))
    if (onStorageCapture != null) __obj.updateDynamic("onStorageCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.StorageEvent) => onStorageCapture(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onSubmit(t0).runNow()))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onSubmitCapture(t0).runNow()))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onSuspend(t0).runNow()))
    if (onSuspendCapture != null) __obj.updateDynamic("onSuspendCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onSuspendCapture(t0).runNow()))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onTimeUpdate(t0).runNow()))
    if (onTimeUpdateCapture != null) __obj.updateDynamic("onTimeUpdateCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onTimeUpdateCapture(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchCancelCapture != null) __obj.updateDynamic("onTouchCancelCapture")(onTouchCancelCapture.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchMoveCapture != null) __obj.updateDynamic("onTouchMoveCapture")(onTouchMoveCapture.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(onTouchStartCapture.asInstanceOf[js.Any])
    if (onUnload != null) __obj.updateDynamic("onUnload")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onUnload(t0).runNow()))
    if (onUnloadCapture != null) __obj.updateDynamic("onUnloadCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onUnloadCapture(t0).runNow()))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onVolumeChange(t0).runNow()))
    if (onVolumeChangeCapture != null) __obj.updateDynamic("onVolumeChangeCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onVolumeChangeCapture(t0).runNow()))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onWaiting(t0).runNow()))
    if (onWaitingCapture != null) __obj.updateDynamic("onWaitingCapture")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onWaitingCapture(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.WheelEvent) => onWheel(t0).runNow()))
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.WheelEvent) => onWheelCapture(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactEventListener.mod.EventListenerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactEventListener.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactEventListener.mod.EventListenerProps])(children: _*)
  }
  @JSImport("react-event-listener", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

