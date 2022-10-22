package typingsJapgolly.reactEventListener.components

import org.scalajs.dom.BeforeUnloadEvent
import org.scalajs.dom.DeviceMotionEvent
import org.scalajs.dom.DeviceOrientationEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HashChangeEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MessageEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.PopStateEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.StorageEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactEventListener.mod.EventListenerProps
import typingsJapgolly.reactEventListener.mod.EventListenerThisType
import typingsJapgolly.reactEventListener.mod.OnErrorEventHandlerArgs
import typingsJapgolly.reactEventListener.mod.WindowEventTargets
import typingsJapgolly.reactEventListener.mod.default
import typingsJapgolly.std.PageTransitionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactEventListener {
  
  inline def apply[T /* <: EventTarget | WindowEventTargets */](target: T): Builder[T] = {
    val __props = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[EventListenerProps[T]]))
  }
  
  @JSImport("react-event-listener", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: EventTarget | WindowEventTargets */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[T]] {
    
    inline def onAbort(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onAbort", value.asInstanceOf[js.Any])
    
    inline def onAbortCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
    
    inline def onAfterPrint(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onAfterPrint", value.asInstanceOf[js.Any])
    
    inline def onAfterPrintCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onAfterPrintCapture", value.asInstanceOf[js.Any])
    
    inline def onBeforePrint(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onBeforePrint", value.asInstanceOf[js.Any])
    
    inline def onBeforePrintCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onBeforePrintCapture", value.asInstanceOf[js.Any])
    
    inline def onBeforeUnload(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, Any]): this.type = set("onBeforeUnload", value.asInstanceOf[js.Any])
    
    inline def onBeforeUnloadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, Any]): this.type = set("onBeforeUnloadCapture", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, Any]): this.type = set("onBlur", value.asInstanceOf[js.Any])
    
    inline def onBlurCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, Any]): this.type = set("onBlurCapture", value.asInstanceOf[js.Any])
    
    inline def onCanPlay(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onCanPlay", value.asInstanceOf[js.Any])
    
    inline def onCanPlayCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
    
    inline def onCanPlayThrough(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onCanPlayThrough", value.asInstanceOf[js.Any])
    
    inline def onCanPlayThroughCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    inline def onChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onChange", value.asInstanceOf[js.Any])
    
    inline def onChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onClick(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    inline def onClickCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onClickCapture", value.asInstanceOf[js.Any])
    
    inline def onCompassNeedsCalibration(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onCompassNeedsCalibration", value.asInstanceOf[js.Any])
    
    inline def onCompassNeedsCalibrationCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onCompassNeedsCalibrationCapture", value.asInstanceOf[js.Any])
    
    inline def onContextMenu(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onContextMenu", value.asInstanceOf[js.Any])
    
    inline def onContextMenuCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onContextMenuCapture", value.asInstanceOf[js.Any])
    
    inline def onDblClick(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onDblClick", value.asInstanceOf[js.Any])
    
    inline def onDblClickCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onDblClickCapture", value.asInstanceOf[js.Any])
    
    inline def onDeviceMotion(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, Any]): this.type = set("onDeviceMotion", value.asInstanceOf[js.Any])
    
    inline def onDeviceMotionCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, Any]): this.type = set("onDeviceMotionCapture", value.asInstanceOf[js.Any])
    
    inline def onDeviceOrientation(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, Any]): this.type = set("onDeviceOrientation", value.asInstanceOf[js.Any])
    
    inline def onDeviceOrientationCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, Any]): this.type = set("onDeviceOrientationCapture", value.asInstanceOf[js.Any])
    
    inline def onDrag(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDrag", value.asInstanceOf[js.Any])
    
    inline def onDragCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDragCapture", value.asInstanceOf[js.Any])
    
    inline def onDragEnd(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDragEnd", value.asInstanceOf[js.Any])
    
    inline def onDragEndCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDragEndCapture", value.asInstanceOf[js.Any])
    
    inline def onDragEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDragEnter", value.asInstanceOf[js.Any])
    
    inline def onDragEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDragEnterCapture", value.asInstanceOf[js.Any])
    
    inline def onDragLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDragLeave", value.asInstanceOf[js.Any])
    
    inline def onDragLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def onDragOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDragOver", value.asInstanceOf[js.Any])
    
    inline def onDragOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDragOverCapture", value.asInstanceOf[js.Any])
    
    inline def onDragStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDragStart", value.asInstanceOf[js.Any])
    
    inline def onDragStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDragStartCapture", value.asInstanceOf[js.Any])
    
    inline def onDrop(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDrop", value.asInstanceOf[js.Any])
    
    inline def onDropCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): this.type = set("onDropCapture", value.asInstanceOf[js.Any])
    
    inline def onDurationChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onDurationChange", value.asInstanceOf[js.Any])
    
    inline def onDurationChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onEmptied(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onEmptied", value.asInstanceOf[js.Any])
    
    inline def onEmptiedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
    
    inline def onEnded(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onEnded", value.asInstanceOf[js.Any])
    
    inline def onEndedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
    
    inline def onError(
      value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, Any]
    ): this.type = set("onError", value.asInstanceOf[js.Any])
    
    inline def onErrorCapture(
      value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, Any]
    ): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
    
    inline def onFocus(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, Any]): this.type = set("onFocus", value.asInstanceOf[js.Any])
    
    inline def onFocusCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, Any]): this.type = set("onFocusCapture", value.asInstanceOf[js.Any])
    
    inline def onHashChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, Any]): this.type = set("onHashChange", value.asInstanceOf[js.Any])
    
    inline def onHashChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, Any]): this.type = set("onHashChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onInput(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onInput", value.asInstanceOf[js.Any])
    
    inline def onInputCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onInputCapture", value.asInstanceOf[js.Any])
    
    inline def onKeyDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]): this.type = set("onKeyDown", value.asInstanceOf[js.Any])
    
    inline def onKeyDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]): this.type = set("onKeyDownCapture", value.asInstanceOf[js.Any])
    
    inline def onKeyPress(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]): this.type = set("onKeyPress", value.asInstanceOf[js.Any])
    
    inline def onKeyPressCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]): this.type = set("onKeyPressCapture", value.asInstanceOf[js.Any])
    
    inline def onKeyUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]): this.type = set("onKeyUp", value.asInstanceOf[js.Any])
    
    inline def onKeyUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]): this.type = set("onKeyUpCapture", value.asInstanceOf[js.Any])
    
    inline def onLoad(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onLoad", value.asInstanceOf[js.Any])
    
    inline def onLoadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onLoadCapture", value.asInstanceOf[js.Any])
    
    inline def onLoadStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onLoadStart", value.asInstanceOf[js.Any])
    
    inline def onLoadStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
    
    inline def onLoadedData(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onLoadedData", value.asInstanceOf[js.Any])
    
    inline def onLoadedDataCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    inline def onLoadedMetadata(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onLoadedMetadata", value.asInstanceOf[js.Any])
    
    inline def onLoadedMetadataCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    inline def onMessage(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent, Any]): this.type = set("onMessage", value.asInstanceOf[js.Any])
    
    inline def onMessageCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent, Any]): this.type = set("onMessageCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
    
    inline def onMouseDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseDownCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def onMouseEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseEnterCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def onMouseLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
    
    inline def onMouseMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseOut(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseOut", value.asInstanceOf[js.Any])
    
    inline def onMouseOutCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseOutCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseOver", value.asInstanceOf[js.Any])
    
    inline def onMouseOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseOverCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
    
    inline def onMouseUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): this.type = set("onMouseUpCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseWheel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, Any]): this.type = set("onMouseWheel", value.asInstanceOf[js.Any])
    
    inline def onMouseWheelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, Any]): this.type = set("onMouseWheelCapture", value.asInstanceOf[js.Any])
    
    inline def onOffline(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onOffline", value.asInstanceOf[js.Any])
    
    inline def onOfflineCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onOfflineCapture", value.asInstanceOf[js.Any])
    
    inline def onOnline(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onOnline", value.asInstanceOf[js.Any])
    
    inline def onOnlineCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onOnlineCapture", value.asInstanceOf[js.Any])
    
    inline def onOrientationChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onOrientationChange", value.asInstanceOf[js.Any])
    
    inline def onOrientationChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onOrientationChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onPageHide(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, Any]): this.type = set("onPageHide", value.asInstanceOf[js.Any])
    
    inline def onPageHideCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, Any]): this.type = set("onPageHideCapture", value.asInstanceOf[js.Any])
    
    inline def onPageShow(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, Any]): this.type = set("onPageShow", value.asInstanceOf[js.Any])
    
    inline def onPageShowCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, Any]): this.type = set("onPageShowCapture", value.asInstanceOf[js.Any])
    
    inline def onPause(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onPause", value.asInstanceOf[js.Any])
    
    inline def onPauseCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
    
    inline def onPlay(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onPlay", value.asInstanceOf[js.Any])
    
    inline def onPlayCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
    
    inline def onPlaying(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onPlaying", value.asInstanceOf[js.Any])
    
    inline def onPlayingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerCancel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerCancel", value.asInstanceOf[js.Any])
    
    inline def onPointerCancelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerDown", value.asInstanceOf[js.Any])
    
    inline def onPointerDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerEnter", value.asInstanceOf[js.Any])
    
    inline def onPointerEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerLeave", value.asInstanceOf[js.Any])
    
    inline def onPointerLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerMove", value.asInstanceOf[js.Any])
    
    inline def onPointerMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerOut(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerOut", value.asInstanceOf[js.Any])
    
    inline def onPointerOutCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerOutCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerOver", value.asInstanceOf[js.Any])
    
    inline def onPointerOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerOverCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerUp", value.asInstanceOf[js.Any])
    
    inline def onPointerUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
    
    inline def onPopState(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, Any]): this.type = set("onPopState", value.asInstanceOf[js.Any])
    
    inline def onPopStateCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, Any]): this.type = set("onPopStateCapture", value.asInstanceOf[js.Any])
    
    inline def onProgress(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent, Any]): this.type = set("onProgress", value.asInstanceOf[js.Any])
    
    inline def onProgressCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent, Any]): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
    
    inline def onRateChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onRateChange", value.asInstanceOf[js.Any])
    
    inline def onRateChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onReadyStateChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent, Any]): this.type = set("onReadyStateChange", value.asInstanceOf[js.Any])
    
    inline def onReadyStateChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent, Any]): this.type = set("onReadyStateChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onReset(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onReset", value.asInstanceOf[js.Any])
    
    inline def onResetCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onResetCapture", value.asInstanceOf[js.Any])
    
    inline def onResize(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]): this.type = set("onResize", value.asInstanceOf[js.Any])
    
    inline def onResizeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]): this.type = set("onResizeCapture", value.asInstanceOf[js.Any])
    
    inline def onScroll(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]): this.type = set("onScroll", value.asInstanceOf[js.Any])
    
    inline def onScrollCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]): this.type = set("onScrollCapture", value.asInstanceOf[js.Any])
    
    inline def onSeeked(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onSeeked", value.asInstanceOf[js.Any])
    
    inline def onSeekedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
    
    inline def onSeeking(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onSeeking", value.asInstanceOf[js.Any])
    
    inline def onSeekingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
    
    inline def onSelect(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]): this.type = set("onSelect", value.asInstanceOf[js.Any])
    
    inline def onSelectCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
    
    inline def onSelectionChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onSelectionChange", value.asInstanceOf[js.Any])
    
    inline def onSelectionChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onSelectionChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onStalled(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onStalled", value.asInstanceOf[js.Any])
    
    inline def onStalledCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
    
    inline def onStorage(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, Any]): this.type = set("onStorage", value.asInstanceOf[js.Any])
    
    inline def onStorageCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, Any]): this.type = set("onStorageCapture", value.asInstanceOf[js.Any])
    
    inline def onSubmit(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onSubmit", value.asInstanceOf[js.Any])
    
    inline def onSubmitCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onSubmitCapture", value.asInstanceOf[js.Any])
    
    inline def onSuspend(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onSuspend", value.asInstanceOf[js.Any])
    
    inline def onSuspendCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
    
    inline def onTimeUpdate(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onTimeUpdate", value.asInstanceOf[js.Any])
    
    inline def onTimeUpdateCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchCancel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def onTouchCancelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchEnd(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def onTouchEndCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    inline def onTouchMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    inline def onTouchStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
    
    inline def onUnload(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onUnload", value.asInstanceOf[js.Any])
    
    inline def onUnloadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onUnloadCapture", value.asInstanceOf[js.Any])
    
    inline def onVolumeChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onVolumeChange", value.asInstanceOf[js.Any])
    
    inline def onVolumeChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onWaiting(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onWaiting", value.asInstanceOf[js.Any])
    
    inline def onWaitingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
    
    inline def onWheel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, Any]): this.type = set("onWheel", value.asInstanceOf[js.Any])
    
    inline def onWheelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, Any]): this.type = set("onWheelCapture", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: EventTarget | WindowEventTargets */](p: EventListenerProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
