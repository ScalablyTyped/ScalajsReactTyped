package typingsJapgolly.simperium.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketEvent[T]
  extends StObject
     with SimperiumEvent {
  
  def error(err: js.Error, change: Change[T]): Unit
  
  def index(cv: ChangeVersion): Unit
  
  def indexing(): Unit
  
  def remove(entityId: EntityId): Unit
  
  def update(entityId: EntityId, updatedEntity: T, remoteInfo: RemoteInfo[T]): Unit
}
object BucketEvent {
  
  inline def apply[T](
    error: (js.Error, Change[T]) => Callback,
    index: ChangeVersion => Callback,
    indexing: Callback,
    remove: EntityId => Callback,
    update: (EntityId, T, RemoteInfo[T]) => Callback
  ): BucketEvent[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction2((t0: js.Error, t1: Change[T]) => (error(t0, t1)).runNow()), index = js.Any.fromFunction1((t0: ChangeVersion) => index(t0).runNow()), indexing = indexing.toJsFn, remove = js.Any.fromFunction1((t0: EntityId) => remove(t0).runNow()), update = js.Any.fromFunction3((t0: EntityId, t1: T, t2: RemoteInfo[T]) => (update(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[BucketEvent[T]]
  }
  
  extension [Self <: BucketEvent[?], T](x: Self & BucketEvent[T]) {
    
    inline def setError(value: (js.Error, Change[T]) => Callback): Self = StObject.set(x, "error", js.Any.fromFunction2((t0: js.Error, t1: Change[T]) => (value(t0, t1)).runNow()))
    
    inline def setIndex(value: ChangeVersion => Callback): Self = StObject.set(x, "index", js.Any.fromFunction1((t0: ChangeVersion) => value(t0).runNow()))
    
    inline def setIndexing(value: Callback): Self = StObject.set(x, "indexing", value.toJsFn)
    
    inline def setRemove(value: EntityId => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: EntityId) => value(t0).runNow()))
    
    inline def setUpdate(value: (EntityId, T, RemoteInfo[T]) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: EntityId, t1: T, t2: RemoteInfo[T]) => (value(t0, t1, t2)).runNow()))
  }
}
