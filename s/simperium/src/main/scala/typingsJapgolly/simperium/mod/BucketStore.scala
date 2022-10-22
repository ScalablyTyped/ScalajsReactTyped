package typingsJapgolly.simperium.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketStore[T, Q] extends StObject {
  
  def find(query: Q, callback: EntitiesCallback[BucketObject[T], js.Error | Null]): Unit
  
  def get(entityId: EntityId, callback: EntityCallback[BucketObject[T], js.Error | Null]): Unit
  
  def remove(entityId: EntityId, callback: js.Function0[Unit]): Unit
  
  def update(
    entityId: EntityId,
    entity: T,
    isIndexing: Boolean,
    callback: EntityCallback[BucketObject[T], js.Error | Null]
  ): Unit
}
object BucketStore {
  
  inline def apply[T, Q](
    find: (Q, EntitiesCallback[BucketObject[T], js.Error | Null]) => Callback,
    get: (EntityId, EntityCallback[BucketObject[T], js.Error | Null]) => Callback,
    remove: (EntityId, js.Function0[Unit]) => Callback,
    update: (EntityId, T, Boolean, EntityCallback[BucketObject[T], js.Error | Null]) => Callback
  ): BucketStore[T, Q] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction2((t0: Q, t1: EntitiesCallback[BucketObject[T], js.Error | Null]) => (find(t0, t1)).runNow()), get = js.Any.fromFunction2((t0: EntityId, t1: EntityCallback[BucketObject[T], js.Error | Null]) => (get(t0, t1)).runNow()), remove = js.Any.fromFunction2((t0: EntityId, t1: js.Function0[Unit]) => (remove(t0, t1)).runNow()), update = js.Any.fromFunction4((t0: EntityId, t1: T, t2: Boolean, t3: EntityCallback[BucketObject[T], js.Error | Null]) => (update(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[BucketStore[T, Q]]
  }
  
  extension [Self <: BucketStore[?, ?], T, Q](x: Self & (BucketStore[T, Q])) {
    
    inline def setFind(value: (Q, EntitiesCallback[BucketObject[T], js.Error | Null]) => Callback): Self = StObject.set(x, "find", js.Any.fromFunction2((t0: Q, t1: EntitiesCallback[BucketObject[T], js.Error | Null]) => (value(t0, t1)).runNow()))
    
    inline def setGet(value: (EntityId, EntityCallback[BucketObject[T], js.Error | Null]) => Callback): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: EntityId, t1: EntityCallback[BucketObject[T], js.Error | Null]) => (value(t0, t1)).runNow()))
    
    inline def setRemove(value: (EntityId, js.Function0[Unit]) => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction2((t0: EntityId, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setUpdate(value: (EntityId, T, Boolean, EntityCallback[BucketObject[T], js.Error | Null]) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction4((t0: EntityId, t1: T, t2: Boolean, t3: EntityCallback[BucketObject[T], js.Error | Null]) => (value(t0, t1, t2, t3)).runNow()))
  }
}
