package typingsJapgolly.tabris

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseEvent
  extends StObject
     with Event {
  
  val code: Double
  
  def initCloseEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    wasCleanArg: Boolean,
    codeArg: Double,
    reasonArg: String
  ): Unit
  
  val reason: String
  
  val wasClean: Boolean
}
object CloseEvent {
  
  inline def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    bubbles: Boolean,
    cancelable: Boolean,
    code: Double,
    currentTarget: EventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initCloseEvent: (String, Boolean, Boolean, Boolean, Double, String) => Callback,
    initEvent: (String, Boolean, Boolean) => Callback,
    isTrusted: Boolean,
    preventDefault: Callback,
    reason: String,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: EventTarget,
    timeStamp: Double,
    `type`: String,
    wasClean: Boolean
  ): CloseEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initCloseEvent = js.Any.fromFunction6((t0: String, t1: Boolean, t2: Boolean, t3: Boolean, t4: Double, t5: String) => (initCloseEvent(t0, t1, t2, t3, t4, t5)).runNow()), initEvent = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (initEvent(t0, t1, t2)).runNow()), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, reason = reason.asInstanceOf[js.Any], stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseEvent]
  }
  
  extension [Self <: CloseEvent](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setInitCloseEvent(value: (String, Boolean, Boolean, Boolean, Double, String) => Callback): Self = StObject.set(x, "initCloseEvent", js.Any.fromFunction6((t0: String, t1: Boolean, t2: Boolean, t3: Boolean, t4: Double, t5: String) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
  }
}
