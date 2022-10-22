package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMCustomEvent extends StObject {
  
  /* private */ @JSName("MSHTML.DOMCustomEvent_typekey")
  var MSHTMLDotDOMCustomEvent_typekey: DOMCustomEvent
  
  val bubbles: Boolean
  
  var cancelBubble: Boolean
  
  val cancelable: Boolean
  
  val currentTarget: IEventTarget
  
  val defaultPrevented: Boolean
  
  val detail: Any
  
  val eventPhase: Double
  
  def initCustomEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, detail: Any): Unit
  
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  
  val isTrusted: Boolean
  
  def preventDefault(): Unit
  
  val srcElement: IHTMLElement
  
  def stopImmediatePropagation(): Unit
  
  def stopPropagation(): Unit
  
  val target: IEventTarget
  
  val timeStamp: Double
  
  val `type`: String
}
object DOMCustomEvent {
  
  inline def apply(
    MSHTMLDotDOMCustomEvent_typekey: DOMCustomEvent,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    detail: Any,
    eventPhase: Double,
    initCustomEvent: (String, Boolean, Boolean, Any) => Callback,
    initEvent: (String, Boolean, Boolean) => Callback,
    isTrusted: Boolean,
    preventDefault: Callback,
    srcElement: IHTMLElement,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String
  ): DOMCustomEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initCustomEvent = js.Any.fromFunction4((t0: String, t1: Boolean, t2: Boolean, t3: Any) => (initCustomEvent(t0, t1, t2, t3)).runNow()), initEvent = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (initEvent(t0, t1, t2)).runNow()), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMCustomEvent_typekey")(MSHTMLDotDOMCustomEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMCustomEvent]
  }
  
  extension [Self <: DOMCustomEvent](x: Self) {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCurrentTarget(value: IEventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setInitCustomEvent(value: (String, Boolean, Boolean, Any) => Callback): Self = StObject.set(x, "initCustomEvent", js.Any.fromFunction4((t0: String, t1: Boolean, t2: Boolean, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setInitEvent(value: (String, Boolean, Boolean) => Callback): Self = StObject.set(x, "initEvent", js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotDOMCustomEvent_typekey(value: DOMCustomEvent): Self = StObject.set(x, "MSHTML.DOMCustomEvent_typekey", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
    
    inline def setSrcElement(value: IHTMLElement): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    inline def setStopImmediatePropagation(value: Callback): Self = StObject.set(x, "stopImmediatePropagation", value.toJsFn)
    
    inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
    
    inline def setTarget(value: IEventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
