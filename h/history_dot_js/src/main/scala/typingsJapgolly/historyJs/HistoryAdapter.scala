package typingsJapgolly.historyJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryAdapter extends StObject {
  
  def bind(element: Any, event: String, callback: js.Function0[Unit]): Unit
  
  def onDomLoad(callback: js.Function0[Unit]): Unit
  
  def trigger(element: Any, event: String): Unit
}
object HistoryAdapter {
  
  inline def apply(
    bind: (Any, String, js.Function0[Unit]) => Callback,
    onDomLoad: js.Function0[Unit] => Callback,
    trigger: (Any, String) => Callback
  ): HistoryAdapter = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3((t0: Any, t1: String, t2: js.Function0[Unit]) => (bind(t0, t1, t2)).runNow()), onDomLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => onDomLoad(t0).runNow()), trigger = js.Any.fromFunction2((t0: Any, t1: String) => (trigger(t0, t1)).runNow()))
    __obj.asInstanceOf[HistoryAdapter]
  }
  
  extension [Self <: HistoryAdapter](x: Self) {
    
    inline def setBind(value: (Any, String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "bind", js.Any.fromFunction3((t0: Any, t1: String, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnDomLoad(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onDomLoad", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setTrigger(value: (Any, String) => Callback): Self = StObject.set(x, "trigger", js.Any.fromFunction2((t0: Any, t1: String) => (value(t0, t1)).runNow()))
  }
}
