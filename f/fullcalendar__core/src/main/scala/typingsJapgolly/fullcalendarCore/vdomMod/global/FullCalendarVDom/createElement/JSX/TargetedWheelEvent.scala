package typingsJapgolly.fullcalendarCore.vdomMod.global.FullCalendarVDom.createElement.JSX

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.EventTarget
import org.scalajs.dom.Window
import typingsJapgolly.std.DOMHighResTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.WheelEvent> */
trait TargetedWheelEvent[Target /* <: EventTarget */] extends StObject {
  
  var AT_TARGET: Double
  
  var BUBBLING_PHASE: Double
  
  var CAPTURING_PHASE: Double
  
  var DOM_DELTA_LINE: Double
  
  var DOM_DELTA_PAGE: Double
  
  var DOM_DELTA_PIXEL: Double
  
  var NONE: Double
  
  var altKey: Boolean
  
  var bubbles: Boolean
  
  var button: Double
  
  var buttons: Double
  
  var cancelBubble: Boolean
  
  var cancelable: Boolean
  
  var clientX: Double
  
  var clientY: Double
  
  var composed: Boolean
  
  def composedPath(): js.Array[EventTarget]
  @JSName("composedPath")
  var composedPath_Original: js.Function0[js.Array[EventTarget]]
  
  var ctrlKey: Boolean
  
  val currentTarget: Target
  
  var defaultPrevented: Boolean
  
  var deltaMode: Double
  
  var deltaX: Double
  
  var deltaY: Double
  
  var deltaZ: Double
  
  var detail: Double
  
  var eventPhase: Double
  
  def getModifierState(keyArg: String): Boolean
  @JSName("getModifierState")
  var getModifierState_Original: js.Function1[/* keyArg */ String, Boolean]
  
  def initEvent(`type`: String): Unit
  @JSName("initEvent")
  var initEvent_Original: js.Function1[/* type */ String, Unit]
  
  def initMouseEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: Boolean,
    altKeyArg: Boolean,
    shiftKeyArg: Boolean,
    metaKeyArg: Boolean,
    buttonArg: Double
  ): Unit
  @JSName("initMouseEvent")
  var initMouseEvent_Original: js.Function14[
    /* typeArg */ String, 
    /* canBubbleArg */ Boolean, 
    /* cancelableArg */ Boolean, 
    /* viewArg */ Window, 
    /* detailArg */ Double, 
    /* screenXArg */ Double, 
    /* screenYArg */ Double, 
    /* clientXArg */ Double, 
    /* clientYArg */ Double, 
    /* ctrlKeyArg */ Boolean, 
    /* altKeyArg */ Boolean, 
    /* shiftKeyArg */ Boolean, 
    /* metaKeyArg */ Boolean, 
    /* buttonArg */ Double, 
    Unit
  ]
  
  def initUIEvent(typeArg: String): Unit
  @JSName("initUIEvent")
  var initUIEvent_Original: js.Function1[/* typeArg */ String, Unit]
  
  var isTrusted: Boolean
  
  var metaKey: Boolean
  
  var movementX: Double
  
  var movementY: Double
  
  var offsetX: Double
  
  var offsetY: Double
  
  var pageX: Double
  
  var pageY: Double
  
  def preventDefault(): Unit
  @JSName("preventDefault")
  var preventDefault_Original: js.Function0[Unit]
  
  var relatedTarget: js.UndefOr[EventTarget | Null] = js.undefined
  
  var returnValue: Boolean
  
  var screenX: Double
  
  var screenY: Double
  
  var shiftKey: Boolean
  
  var srcElement: js.UndefOr[EventTarget | Null] = js.undefined
  
  def stopImmediatePropagation(): Unit
  @JSName("stopImmediatePropagation")
  var stopImmediatePropagation_Original: js.Function0[Unit]
  
  def stopPropagation(): Unit
  @JSName("stopPropagation")
  var stopPropagation_Original: js.Function0[Unit]
  
  var target: js.UndefOr[EventTarget | Null] = js.undefined
  
  var timeStamp: DOMHighResTimeStamp
  
  var `type`: String
  
  var view: js.UndefOr[Window | Null] = js.undefined
  
  var which: Double
  
  var x: Double
  
  var y: Double
}
object TargetedWheelEvent {
  
  inline def apply[Target /* <: EventTarget */](
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    DOM_DELTA_LINE: Double,
    DOM_DELTA_PAGE: Double,
    DOM_DELTA_PIXEL: Double,
    NONE: Double,
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    cancelBubble: Boolean,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    composed: Boolean,
    composedPath: CallbackTo[js.Array[EventTarget]],
    ctrlKey: Boolean,
    currentTarget: Target,
    defaultPrevented: Boolean,
    deltaMode: Double,
    deltaX: Double,
    deltaY: Double,
    deltaZ: Double,
    detail: Double,
    eventPhase: Double,
    getModifierState: /* keyArg */ String => Boolean,
    initEvent: /* type */ String => Callback,
    initMouseEvent: (/* typeArg */ String, /* canBubbleArg */ Boolean, /* cancelableArg */ Boolean, /* viewArg */ Window, /* detailArg */ Double, /* screenXArg */ Double, /* screenYArg */ Double, /* clientXArg */ Double, /* clientYArg */ Double, /* ctrlKeyArg */ Boolean, /* altKeyArg */ Boolean, /* shiftKeyArg */ Boolean, /* metaKeyArg */ Boolean, /* buttonArg */ Double) => Callback,
    initUIEvent: /* typeArg */ String => Callback,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    offsetX: Double,
    offsetY: Double,
    pageX: Double,
    pageY: Double,
    preventDefault: Callback,
    returnValue: Boolean,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    timeStamp: DOMHighResTimeStamp,
    `type`: String,
    which: Double,
    x: Double,
    y: Double
  ): TargetedWheelEvent[Target] = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], DOM_DELTA_LINE = DOM_DELTA_LINE.asInstanceOf[js.Any], DOM_DELTA_PAGE = DOM_DELTA_PAGE.asInstanceOf[js.Any], DOM_DELTA_PIXEL = DOM_DELTA_PIXEL.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = composedPath.toJsFn, ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], deltaMode = deltaMode.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], deltaZ = deltaZ.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), initEvent = js.Any.fromFunction1((t0: /* type */ String) => initEvent(t0).runNow()), initMouseEvent = js.Any.fromFunction14((t0: /* typeArg */ String, t1: /* canBubbleArg */ Boolean, t2: /* cancelableArg */ Boolean, t3: /* viewArg */ Window, t4: /* detailArg */ Double, t5: /* screenXArg */ Double, t6: /* screenYArg */ Double, t7: /* clientXArg */ Double, t8: /* clientYArg */ Double, t9: /* ctrlKeyArg */ Boolean, t10: /* altKeyArg */ Boolean, t11: /* shiftKeyArg */ Boolean, t12: /* metaKeyArg */ Boolean, t13: /* buttonArg */ Double) => (initMouseEvent(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13)).runNow()), initUIEvent = js.Any.fromFunction1((t0: /* typeArg */ String) => initUIEvent(t0).runNow()), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, returnValue = returnValue.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, timeStamp = timeStamp.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedWheelEvent[Target]]
  }
  
  extension [Self <: TargetedWheelEvent[?], Target /* <: EventTarget */](x: Self & TargetedWheelEvent[Target]) {
    
    inline def setAT_TARGET(value: Double): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setBUBBLING_PHASE(value: Double): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setCAPTURING_PHASE(value: Double): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setComposedPath(value: CallbackTo[js.Array[EventTarget]]): Self = StObject.set(x, "composedPath", value.toJsFn)
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setCurrentTarget(value: Target): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDOM_DELTA_LINE(value: Double): Self = StObject.set(x, "DOM_DELTA_LINE", value.asInstanceOf[js.Any])
    
    inline def setDOM_DELTA_PAGE(value: Double): Self = StObject.set(x, "DOM_DELTA_PAGE", value.asInstanceOf[js.Any])
    
    inline def setDOM_DELTA_PIXEL(value: Double): Self = StObject.set(x, "DOM_DELTA_PIXEL", value.asInstanceOf[js.Any])
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setDeltaMode(value: Double): Self = StObject.set(x, "deltaMode", value.asInstanceOf[js.Any])
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDeltaZ(value: Double): Self = StObject.set(x, "deltaZ", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setGetModifierState(value: /* keyArg */ String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
    
    inline def setInitEvent(value: /* type */ String => Callback): Self = StObject.set(x, "initEvent", js.Any.fromFunction1((t0: /* type */ String) => value(t0).runNow()))
    
    inline def setInitMouseEvent(
      value: (/* typeArg */ String, /* canBubbleArg */ Boolean, /* cancelableArg */ Boolean, /* viewArg */ Window, /* detailArg */ Double, /* screenXArg */ Double, /* screenYArg */ Double, /* clientXArg */ Double, /* clientYArg */ Double, /* ctrlKeyArg */ Boolean, /* altKeyArg */ Boolean, /* shiftKeyArg */ Boolean, /* metaKeyArg */ Boolean, /* buttonArg */ Double) => Callback
    ): Self = StObject.set(x, "initMouseEvent", js.Any.fromFunction14((t0: /* typeArg */ String, t1: /* canBubbleArg */ Boolean, t2: /* cancelableArg */ Boolean, t3: /* viewArg */ Window, t4: /* detailArg */ Double, t5: /* screenXArg */ Double, t6: /* screenYArg */ Double, t7: /* clientXArg */ Double, t8: /* clientYArg */ Double, t9: /* ctrlKeyArg */ Boolean, t10: /* altKeyArg */ Boolean, t11: /* shiftKeyArg */ Boolean, t12: /* metaKeyArg */ Boolean, t13: /* buttonArg */ Double) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13)).runNow()))
    
    inline def setInitUIEvent(value: /* typeArg */ String => Callback): Self = StObject.set(x, "initUIEvent", js.Any.fromFunction1((t0: /* typeArg */ String) => value(t0).runNow()))
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
    
    inline def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
    
    inline def setRelatedTarget(value: EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    inline def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
    
    inline def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
    
    inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
    
    inline def setStopImmediatePropagation(value: Callback): Self = StObject.set(x, "stopImmediatePropagation", value.toJsFn)
    
    inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
    
    inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTimeStamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setView(value: Window): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
