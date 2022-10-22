package typingsJapgolly.simperium.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeartbeatEvent
  extends StObject
     with SimperiumEvent {
  
  def beat(count: Double): Unit
  
  def timeout(): Unit
}
object HeartbeatEvent {
  
  inline def apply(beat: Double => Callback, timeout: Callback): HeartbeatEvent = {
    val __obj = js.Dynamic.literal(beat = js.Any.fromFunction1((t0: Double) => beat(t0).runNow()), timeout = timeout.toJsFn)
    __obj.asInstanceOf[HeartbeatEvent]
  }
  
  extension [Self <: HeartbeatEvent](x: Self) {
    
    inline def setBeat(value: Double => Callback): Self = StObject.set(x, "beat", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTimeout(value: Callback): Self = StObject.set(x, "timeout", value.toJsFn)
  }
}
