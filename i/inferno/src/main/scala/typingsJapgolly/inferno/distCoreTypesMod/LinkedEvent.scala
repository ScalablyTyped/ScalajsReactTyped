package typingsJapgolly.inferno.distCoreTypesMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedEvent[T, E /* <: Event */] extends StObject {
  
  var data: T
  
  def event(data: T, event: E): Unit
}
object LinkedEvent {
  
  inline def apply[T, E /* <: Event */](data: T, event: (T, E) => Callback): LinkedEvent[T, E] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = js.Any.fromFunction2((t0: T, t1: E) => (event(t0, t1)).runNow()))
    __obj.asInstanceOf[LinkedEvent[T, E]]
  }
  
  extension [Self <: LinkedEvent[?, ?], T, E /* <: Event */](x: Self & (LinkedEvent[T, E])) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: (T, E) => Callback): Self = StObject.set(x, "event", js.Any.fromFunction2((t0: T, t1: E) => (value(t0, t1)).runNow()))
  }
}
