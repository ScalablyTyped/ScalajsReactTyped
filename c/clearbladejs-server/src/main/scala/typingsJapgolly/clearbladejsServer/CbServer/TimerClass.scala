package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimerClass extends StObject {
  
  def Create(name: String, options: TimerCreateOptions, callback: CbCallback): Unit
  
  def Fetch(name: String, callback: CbCallback): Unit
}
object TimerClass {
  
  inline def apply(
    Create: (String, TimerCreateOptions, CbCallback) => Callback,
    Fetch: (String, CbCallback) => Callback
  ): TimerClass = {
    val __obj = js.Dynamic.literal(Create = js.Any.fromFunction3((t0: String, t1: TimerCreateOptions, t2: CbCallback) => (Create(t0, t1, t2)).runNow()), Fetch = js.Any.fromFunction2((t0: String, t1: CbCallback) => (Fetch(t0, t1)).runNow()))
    __obj.asInstanceOf[TimerClass]
  }
  
  extension [Self <: TimerClass](x: Self) {
    
    inline def setCreate(value: (String, TimerCreateOptions, CbCallback) => Callback): Self = StObject.set(x, "Create", js.Any.fromFunction3((t0: String, t1: TimerCreateOptions, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setFetch(value: (String, CbCallback) => Callback): Self = StObject.set(x, "Fetch", js.Any.fromFunction2((t0: String, t1: CbCallback) => (value(t0, t1)).runNow()))
  }
}
