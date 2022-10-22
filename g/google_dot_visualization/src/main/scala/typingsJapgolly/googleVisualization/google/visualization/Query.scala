package typingsJapgolly.googleVisualization.google.visualization

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  def abort(): Unit
  
  def send(callback: js.Function1[/* response */ QueryResponse, Unit]): Unit
  
  def setQuery(queryString: String): Unit
  
  def setRefreshInterval(intervalSeconds: Double): Unit
  
  def setTimeout(timeoutSeconds: Double): Unit
}
object Query {
  
  inline def apply(
    abort: Callback,
    send: js.Function1[/* response */ QueryResponse, Unit] => Callback,
    setQuery: String => Callback,
    setRefreshInterval: Double => Callback,
    setTimeout: Double => Callback
  ): Query = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, send = js.Any.fromFunction1((t0: js.Function1[/* response */ QueryResponse, Unit]) => send(t0).runNow()), setQuery = js.Any.fromFunction1((t0: String) => setQuery(t0).runNow()), setRefreshInterval = js.Any.fromFunction1((t0: Double) => setRefreshInterval(t0).runNow()), setTimeout = js.Any.fromFunction1((t0: Double) => setTimeout(t0).runNow()))
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setSend(value: js.Function1[/* response */ QueryResponse, Unit] => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: js.Function1[/* response */ QueryResponse, Unit]) => value(t0).runNow()))
    
    inline def setSetQuery(value: String => Callback): Self = StObject.set(x, "setQuery", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetRefreshInterval(value: Double => Callback): Self = StObject.set(x, "setRefreshInterval", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTimeout(value: Double => Callback): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
