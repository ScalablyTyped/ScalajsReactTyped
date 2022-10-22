package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerClass extends StObject {
  
  def Create(name: String, options: TriggerCreateOptions, callback: CbCallback): Unit
  
  def Fetch(name: String, callback: CbCallback): Unit
}
object TriggerClass {
  
  inline def apply(
    Create: (String, TriggerCreateOptions, CbCallback) => Callback,
    Fetch: (String, CbCallback) => Callback
  ): TriggerClass = {
    val __obj = js.Dynamic.literal(Create = js.Any.fromFunction3((t0: String, t1: TriggerCreateOptions, t2: CbCallback) => (Create(t0, t1, t2)).runNow()), Fetch = js.Any.fromFunction2((t0: String, t1: CbCallback) => (Fetch(t0, t1)).runNow()))
    __obj.asInstanceOf[TriggerClass]
  }
  
  extension [Self <: TriggerClass](x: Self) {
    
    inline def setCreate(value: (String, TriggerCreateOptions, CbCallback) => Callback): Self = StObject.set(x, "Create", js.Any.fromFunction3((t0: String, t1: TriggerCreateOptions, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setFetch(value: (String, CbCallback) => Callback): Self = StObject.set(x, "Fetch", js.Any.fromFunction2((t0: String, t1: CbCallback) => (value(t0, t1)).runNow()))
  }
}
