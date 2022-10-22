package typingsJapgolly.tabris

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEvent
  extends StObject
     with Event {
  
  val data: Any
  
  def initMessageEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    dataArg: Any,
    originArg: String,
    lastEventIdArg: String,
    sourceArg: Any
  ): Unit
  
  val origin: String
  
  val ports: Any
  
  val source: Any
}
object MessageEvent {
  
  inline def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget,
    data: Any,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Callback,
    initMessageEvent: (String, Boolean, Boolean, Any, String, String, Any) => Callback,
    isTrusted: Boolean,
    origin: String,
    ports: Any,
    preventDefault: Callback,
    source: Any,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  ): MessageEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (initEvent(t0, t1, t2)).runNow()), initMessageEvent = js.Any.fromFunction7((t0: String, t1: Boolean, t2: Boolean, t3: Any, t4: String, t5: String, t6: Any) => (initMessageEvent(t0, t1, t2, t3, t4, t5, t6)).runNow()), isTrusted = isTrusted.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, source = source.asInstanceOf[js.Any], stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  extension [Self <: MessageEvent](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setInitMessageEvent(value: (String, Boolean, Boolean, Any, String, String, Any) => Callback): Self = StObject.set(x, "initMessageEvent", js.Any.fromFunction7((t0: String, t1: Boolean, t2: Boolean, t3: Any, t4: String, t5: String, t6: Any) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPorts(value: Any): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
