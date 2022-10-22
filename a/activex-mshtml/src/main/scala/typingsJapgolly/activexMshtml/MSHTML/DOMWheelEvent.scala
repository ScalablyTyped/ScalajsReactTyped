package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMWheelEvent extends StObject {
  
  /* private */ @JSName("MSHTML.DOMWheelEvent_typekey")
  var MSHTMLDotDOMWheelEvent_typekey: DOMWheelEvent
  
  val altKey: Boolean
  
  val bubbles: Boolean
  
  val button: Double
  
  val buttons: Double
  
  var cancelBubble: Boolean
  
  val cancelable: Boolean
  
  val clientX: Double
  
  val clientY: Double
  
  val ctrlKey: Boolean
  
  val currentTarget: IEventTarget
  
  val defaultPrevented: Boolean
  
  val deltaMode: Double
  
  val deltaX: Double
  
  val deltaY: Double
  
  val deltaZ: Double
  
  val detail: Double
  
  val eventPhase: Double
  
  val fromElement: IHTMLElement
  
  def getModifierState(keyArg: String): Boolean
  
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  
  def initMouseEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: Boolean,
    altKeyArg: Boolean,
    shiftKeyArg: Boolean,
    metaKeyArg: Boolean,
    buttonArg: Double,
    relatedTargetArg: IEventTarget
  ): Unit
  
  def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit
  
  def initWheelEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    buttonArg: Double,
    relatedTargetArg: IEventTarget,
    modifiersListArg: String,
    deltaX: Double,
    deltaY: Double,
    deltaZ: Double,
    deltaMode: Double
  ): Unit
  
  val isTrusted: Boolean
  
  val layerX: Double
  
  val layerY: Double
  
  val metaKey: Boolean
  
  val offsetX: Double
  
  val offsetY: Double
  
  val pageX: Double
  
  val pageY: Double
  
  def preventDefault(): Unit
  
  val relatedTarget: IEventTarget
  
  val screenX: Double
  
  val screenY: Double
  
  val shiftKey: Boolean
  
  val srcElement: IHTMLElement
  
  def stopImmediatePropagation(): Unit
  
  def stopPropagation(): Unit
  
  val target: IEventTarget
  
  val timeStamp: Double
  
  val toElement: IHTMLElement
  
  val `type`: String
  
  def view(pvarIndex: Any): Any
  @JSName("view")
  val view_Original: IHTMLWindow2
  
  val which: Double
  
  val x: Double
  
  val y: Double
}
object DOMWheelEvent {
  
  inline def apply(
    MSHTMLDotDOMWheelEvent_typekey: DOMWheelEvent,
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    cancelBubble: Boolean,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    deltaMode: Double,
    deltaX: Double,
    deltaY: Double,
    deltaZ: Double,
    detail: Double,
    eventPhase: Double,
    fromElement: IHTMLElement,
    getModifierState: String => Boolean,
    initEvent: (String, Boolean, Boolean) => Callback,
    initMouseEvent: (String, Boolean, Boolean, IHTMLWindow2, Double, Double, Double, Double, Double, Boolean, Boolean, Boolean, Boolean, Double, IEventTarget) => Callback,
    initUIEvent: (String, Boolean, Boolean, IHTMLWindow2, Double) => Callback,
    initWheelEvent: (String, Boolean, Boolean, IHTMLWindow2, Double, Double, Double, Double, Double, Double, IEventTarget, String, Double, Double, Double, Double) => Callback,
    isTrusted: Boolean,
    layerX: Double,
    layerY: Double,
    metaKey: Boolean,
    offsetX: Double,
    offsetY: Double,
    pageX: Double,
    pageY: Double,
    preventDefault: Callback,
    relatedTarget: IEventTarget,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    srcElement: IHTMLElement,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: IEventTarget,
    timeStamp: Double,
    toElement: IHTMLElement,
    `type`: String,
    view: IHTMLWindow2,
    which: Double,
    x: Double,
    y: Double
  ): DOMWheelEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], deltaMode = deltaMode.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], deltaZ = deltaZ.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], fromElement = fromElement.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), initEvent = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (initEvent(t0, t1, t2)).runNow()), initMouseEvent = js.Any.fromFunction15((t0: String, t1: Boolean, t2: Boolean, t3: IHTMLWindow2, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double, t9: Boolean, t10: Boolean, t11: Boolean, t12: Boolean, t13: Double, t14: IEventTarget) => (initMouseEvent(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14)).runNow()), initUIEvent = js.Any.fromFunction5((t0: String, t1: Boolean, t2: Boolean, t3: IHTMLWindow2, t4: Double) => (initUIEvent(t0, t1, t2, t3, t4)).runNow()), initWheelEvent = js.Any.fromFunction16((t0: String, t1: Boolean, t2: Boolean, t3: IHTMLWindow2, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double, t9: Double, t10: IEventTarget, t11: String, t12: Double, t13: Double, t14: Double, t15: Double) => (initWheelEvent(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15)).runNow()), isTrusted = isTrusted.asInstanceOf[js.Any], layerX = layerX.asInstanceOf[js.Any], layerY = layerY.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, relatedTarget = relatedTarget.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMWheelEvent_typekey")(MSHTMLDotDOMWheelEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMWheelEvent]
  }
  
  extension [Self <: DOMWheelEvent](x: Self) {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setCurrentTarget(value: IEventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setDeltaMode(value: Double): Self = StObject.set(x, "deltaMode", value.asInstanceOf[js.Any])
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDeltaZ(value: Double): Self = StObject.set(x, "deltaZ", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setFromElement(value: IHTMLElement): Self = StObject.set(x, "fromElement", value.asInstanceOf[js.Any])
    
    inline def setGetModifierState(value: String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
    
    inline def setInitEvent(value: (String, Boolean, Boolean) => Callback): Self = StObject.set(x, "initEvent", js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setInitMouseEvent(
      value: (String, Boolean, Boolean, IHTMLWindow2, Double, Double, Double, Double, Double, Boolean, Boolean, Boolean, Boolean, Double, IEventTarget) => Callback
    ): Self = StObject.set(x, "initMouseEvent", js.Any.fromFunction15((t0: String, t1: Boolean, t2: Boolean, t3: IHTMLWindow2, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double, t9: Boolean, t10: Boolean, t11: Boolean, t12: Boolean, t13: Double, t14: IEventTarget) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14)).runNow()))
    
    inline def setInitUIEvent(value: (String, Boolean, Boolean, IHTMLWindow2, Double) => Callback): Self = StObject.set(x, "initUIEvent", js.Any.fromFunction5((t0: String, t1: Boolean, t2: Boolean, t3: IHTMLWindow2, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setInitWheelEvent(
      value: (String, Boolean, Boolean, IHTMLWindow2, Double, Double, Double, Double, Double, Double, IEventTarget, String, Double, Double, Double, Double) => Callback
    ): Self = StObject.set(x, "initWheelEvent", js.Any.fromFunction16((t0: String, t1: Boolean, t2: Boolean, t3: IHTMLWindow2, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double, t9: Double, t10: IEventTarget, t11: String, t12: Double, t13: Double, t14: Double, t15: Double) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15)).runNow()))
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setLayerX(value: Double): Self = StObject.set(x, "layerX", value.asInstanceOf[js.Any])
    
    inline def setLayerY(value: Double): Self = StObject.set(x, "layerY", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotDOMWheelEvent_typekey(value: DOMWheelEvent): Self = StObject.set(x, "MSHTML.DOMWheelEvent_typekey", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
    
    inline def setRelatedTarget(value: IEventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setSrcElement(value: IHTMLElement): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    inline def setStopImmediatePropagation(value: Callback): Self = StObject.set(x, "stopImmediatePropagation", value.toJsFn)
    
    inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
    
    inline def setTarget(value: IEventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setToElement(value: IHTMLElement): Self = StObject.set(x, "toElement", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setView(value: IHTMLWindow2): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
