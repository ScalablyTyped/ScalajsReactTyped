package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait history extends StObject {
  
  def push(view: String, url: String, value: Any): Unit
  
  def track(view: String, url: String): Unit
}
object history {
  
  @JSImport("webix", "history")
  @js.native
  val ^ : typingsJapgolly.webix.webix.history = js.native
  
  extension [Self <: history](x: Self) {
    
    inline def setPush(value: (String, String, Any) => Callback): Self = StObject.set(x, "push", js.Any.fromFunction3((t0: String, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setTrack(value: (String, String) => Callback): Self = StObject.set(x, "track", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
