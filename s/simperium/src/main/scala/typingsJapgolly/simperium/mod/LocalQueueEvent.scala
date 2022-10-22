package typingsJapgolly.simperium.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalQueueEvent[T]
  extends StObject
     with SimperiumEvent {
  
  def queued(id: EntityId, change: Change[T], queue: js.Array[LocalQueuedChange[T]]): Unit
  
  def send(change: Change[T]): Unit
  
  def wait(id: EntityId): Unit
}
object LocalQueueEvent {
  
  inline def apply[T](
    queued: (EntityId, Change[T], js.Array[LocalQueuedChange[T]]) => Callback,
    send: Change[T] => Callback,
    wait_ : EntityId => Callback
  ): LocalQueueEvent[T] = {
    val __obj = js.Dynamic.literal(queued = js.Any.fromFunction3((t0: EntityId, t1: Change[T], t2: js.Array[LocalQueuedChange[T]]) => (queued(t0, t1, t2)).runNow()), send = js.Any.fromFunction1((t0: Change[T]) => send(t0).runNow()))
    __obj.updateDynamic("wait")(js.Any.fromFunction1((t0: EntityId) => wait_(t0).runNow()))
    __obj.asInstanceOf[LocalQueueEvent[T]]
  }
  
  extension [Self <: LocalQueueEvent[?], T](x: Self & LocalQueueEvent[T]) {
    
    inline def setQueued(value: (EntityId, Change[T], js.Array[LocalQueuedChange[T]]) => Callback): Self = StObject.set(x, "queued", js.Any.fromFunction3((t0: EntityId, t1: Change[T], t2: js.Array[LocalQueuedChange[T]]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSend(value: Change[T] => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: Change[T]) => value(t0).runNow()))
    
    inline def setWait_(value: EntityId => Callback): Self = StObject.set(x, "wait", js.Any.fromFunction1((t0: EntityId) => value(t0).runNow()))
  }
}
