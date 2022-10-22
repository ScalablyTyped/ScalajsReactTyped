package typingsJapgolly.webix.webix

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait history extends StObject {
  
  def push(view: String, url: String, value: Any): Unit
  
  def track(view: String, url: String): Unit
}
object history {
  
  inline def apply(push: (String, String, Any) => Callback, track: (String, String) => Callback): history = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction3((t0: String, t1: String, t2: Any) => (push(t0, t1, t2)).runNow()), track = js.Any.fromFunction2((t0: String, t1: String) => (track(t0, t1)).runNow()))
    __obj.asInstanceOf[history]
  }
  
  extension [Self <: history](x: Self) {
    
    inline def setPush(value: (String, String, Any) => Callback): Self = StObject.set(x, "push", js.Any.fromFunction3((t0: String, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setTrack(value: (String, String) => Callback): Self = StObject.set(x, "track", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
