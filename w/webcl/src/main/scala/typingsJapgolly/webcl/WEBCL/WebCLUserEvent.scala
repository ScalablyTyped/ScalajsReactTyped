package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.10.1
trait WebCLUserEvent
  extends StObject
     with WebCLEvent {
  
  def setStatus(executionStatus: CommandExecutionStatus): Unit
}
object WebCLUserEvent {
  
  inline def apply(
    getInfo: EventInfo => Any,
    getProfilingInfo: ProfilingInfo => Double,
    release: Callback,
    setCallback: (CommandExecutionStatus, WebCLCallback) => Callback,
    setStatus: CommandExecutionStatus => Callback
  ): WebCLUserEvent = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), getProfilingInfo = js.Any.fromFunction1(getProfilingInfo), release = release.toJsFn, setCallback = js.Any.fromFunction2((t0: CommandExecutionStatus, t1: WebCLCallback) => (setCallback(t0, t1)).runNow()), setStatus = js.Any.fromFunction1((t0: CommandExecutionStatus) => setStatus(t0).runNow()))
    __obj.asInstanceOf[WebCLUserEvent]
  }
  
  extension [Self <: WebCLUserEvent](x: Self) {
    
    inline def setSetStatus(value: CommandExecutionStatus => Callback): Self = StObject.set(x, "setStatus", js.Any.fromFunction1((t0: CommandExecutionStatus) => value(t0).runNow()))
  }
}
