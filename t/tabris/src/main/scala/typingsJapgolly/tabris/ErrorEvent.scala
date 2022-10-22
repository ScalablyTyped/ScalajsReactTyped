package typingsJapgolly.tabris

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorEvent
  extends StObject
     with Event {
  
  val colno: Double
  
  val error: Any
  
  val filename: String
  
  def initErrorEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    messageArg: String,
    filenameArg: String,
    linenoArg: Double
  ): Unit
  
  val lineno: Double
  
  val message: String
}
object ErrorEvent {
  
  inline def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    bubbles: Boolean,
    cancelable: Boolean,
    colno: Double,
    currentTarget: EventTarget,
    defaultPrevented: Boolean,
    error: Any,
    eventPhase: Double,
    filename: String,
    initErrorEvent: (String, Boolean, Boolean, String, String, Double) => Callback,
    initEvent: (String, Boolean, Boolean) => Callback,
    isTrusted: Boolean,
    lineno: Double,
    message: String,
    preventDefault: Callback,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  ): ErrorEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], colno = colno.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], initErrorEvent = js.Any.fromFunction6((t0: String, t1: Boolean, t2: Boolean, t3: String, t4: String, t5: Double) => (initErrorEvent(t0, t1, t2, t3, t4, t5)).runNow()), initEvent = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (initEvent(t0, t1, t2)).runNow()), isTrusted = isTrusted.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  
  extension [Self <: ErrorEvent](x: Self) {
    
    inline def setColno(value: Double): Self = StObject.set(x, "colno", value.asInstanceOf[js.Any])
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setInitErrorEvent(value: (String, Boolean, Boolean, String, String, Double) => Callback): Self = StObject.set(x, "initErrorEvent", js.Any.fromFunction6((t0: String, t1: Boolean, t2: Boolean, t3: String, t4: String, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
