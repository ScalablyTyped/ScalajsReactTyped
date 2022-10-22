package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.10
trait WebCLEvent extends StObject {
  
  def getInfo(name: EventInfo): Any
  
  def getProfilingInfo(name: ProfilingInfo): Double
  
  def release(): Unit
  
  def setCallback(commandExecCallbackType: CommandExecutionStatus, notify: WebCLCallback): Unit
}
object WebCLEvent {
  
  inline def apply(
    getInfo: EventInfo => Any,
    getProfilingInfo: ProfilingInfo => Double,
    release: Callback,
    setCallback: (CommandExecutionStatus, WebCLCallback) => Callback
  ): WebCLEvent = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), getProfilingInfo = js.Any.fromFunction1(getProfilingInfo), release = release.toJsFn, setCallback = js.Any.fromFunction2((t0: CommandExecutionStatus, t1: WebCLCallback) => (setCallback(t0, t1)).runNow()))
    __obj.asInstanceOf[WebCLEvent]
  }
  
  extension [Self <: WebCLEvent](x: Self) {
    
    inline def setGetInfo(value: EventInfo => Any): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
    
    inline def setGetProfilingInfo(value: ProfilingInfo => Double): Self = StObject.set(x, "getProfilingInfo", js.Any.fromFunction1(value))
    
    inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
    
    inline def setSetCallback(value: (CommandExecutionStatus, WebCLCallback) => Callback): Self = StObject.set(x, "setCallback", js.Any.fromFunction2((t0: CommandExecutionStatus, t1: WebCLCallback) => (value(t0, t1)).runNow()))
  }
}
