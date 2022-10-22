package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventLog extends StObject {
  
  def init(): Unit
  
  def log(id: Any, payload: js.Object): Unit
  
  def show(): Unit
  
  def startEvent(name: String): Unit
}
object EventLog {
  
  inline def apply(init: Callback, log: (Any, js.Object) => Callback, show: Callback, startEvent: String => Callback): EventLog = {
    val __obj = js.Dynamic.literal(init = init.toJsFn, log = js.Any.fromFunction2((t0: Any, t1: js.Object) => (log(t0, t1)).runNow()), show = show.toJsFn, startEvent = js.Any.fromFunction1((t0: String) => startEvent(t0).runNow()))
    __obj.asInstanceOf[EventLog]
  }
  
  extension [Self <: EventLog](x: Self) {
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setLog(value: (Any, js.Object) => Callback): Self = StObject.set(x, "log", js.Any.fromFunction2((t0: Any, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setStartEvent(value: String => Callback): Self = StObject.set(x, "startEvent", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
