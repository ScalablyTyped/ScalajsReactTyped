package typingsJapgolly.electron.Electron

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextBridge extends StObject {
  
  // Docs: https://electronjs.org/docs/api/context-bridge
  def exposeInMainWorld(apiKey: String, api: Any): Unit
}
object ContextBridge {
  
  inline def apply(exposeInMainWorld: (String, Any) => Callback): ContextBridge = {
    val __obj = js.Dynamic.literal(exposeInMainWorld = js.Any.fromFunction2((t0: String, t1: Any) => (exposeInMainWorld(t0, t1)).runNow()))
    __obj.asInstanceOf[ContextBridge]
  }
  
  extension [Self <: ContextBridge](x: Self) {
    
    inline def setExposeInMainWorld(value: (String, Any) => Callback): Self = StObject.set(x, "exposeInMainWorld", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
