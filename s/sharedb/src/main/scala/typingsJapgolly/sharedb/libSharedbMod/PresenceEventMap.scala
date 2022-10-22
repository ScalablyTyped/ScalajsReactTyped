package typingsJapgolly.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresenceEventMap[T] extends StObject {
  
  def error(error: Error): Unit
  
  def receive(id: String, value: T): Unit
  @JSName("receive")
  var receive_Original: ReceivePresenceListener[T]
}
object PresenceEventMap {
  
  inline def apply[T](
    error: Error => japgolly.scalajs.react.Callback,
    receive: (/* id */ String, T) => japgolly.scalajs.react.Callback
  ): PresenceEventMap[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: Error) => error(t0).runNow()), receive = js.Any.fromFunction2((t0: /* id */ String, t1: T) => (receive(t0, t1)).runNow()))
    __obj.asInstanceOf[PresenceEventMap[T]]
  }
  
  extension [Self <: PresenceEventMap[?], T](x: Self & PresenceEventMap[T]) {
    
    inline def setError(value: Error => japgolly.scalajs.react.Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Error) => value(t0).runNow()))
    
    inline def setReceive(value: (/* id */ String, T) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "receive", js.Any.fromFunction2((t0: /* id */ String, t1: T) => (value(t0, t1)).runNow()))
  }
}
