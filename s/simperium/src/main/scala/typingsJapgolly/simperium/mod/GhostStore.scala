package typingsJapgolly.simperium.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GhostStore[T] extends StObject {
  
  def eachGhost(iterator: js.Function1[/* ghost */ Ghost[T], Unit]): Unit
  
  def get(entityId: EntityId): js.Promise[Ghost[T]]
  
  def getChangeVersion(): js.Promise[ChangeVersion]
  
  def put(entityId: EntityId, version: Double, data: T): js.Promise[Ghost[T]]
  
  def remove(entityId: EntityId): js.Promise[Ghost[T]]
  
  def setChangeVersion(version: ChangeVersion): js.Promise[Unit]
}
object GhostStore {
  
  inline def apply[T](
    eachGhost: js.Function1[/* ghost */ Ghost[T], Unit] => Callback,
    get: EntityId => js.Promise[Ghost[T]],
    getChangeVersion: CallbackTo[js.Promise[ChangeVersion]],
    put: (EntityId, Double, T) => js.Promise[Ghost[T]],
    remove: EntityId => js.Promise[Ghost[T]],
    setChangeVersion: ChangeVersion => js.Promise[Unit]
  ): GhostStore[T] = {
    val __obj = js.Dynamic.literal(eachGhost = js.Any.fromFunction1((t0: js.Function1[/* ghost */ Ghost[T], Unit]) => eachGhost(t0).runNow()), get = js.Any.fromFunction1(get), getChangeVersion = getChangeVersion.toJsFn, put = js.Any.fromFunction3(put), remove = js.Any.fromFunction1(remove), setChangeVersion = js.Any.fromFunction1(setChangeVersion))
    __obj.asInstanceOf[GhostStore[T]]
  }
  
  extension [Self <: GhostStore[?], T](x: Self & GhostStore[T]) {
    
    inline def setEachGhost(value: js.Function1[/* ghost */ Ghost[T], Unit] => Callback): Self = StObject.set(x, "eachGhost", js.Any.fromFunction1((t0: js.Function1[/* ghost */ Ghost[T], Unit]) => value(t0).runNow()))
    
    inline def setGet(value: EntityId => js.Promise[Ghost[T]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetChangeVersion(value: CallbackTo[js.Promise[ChangeVersion]]): Self = StObject.set(x, "getChangeVersion", value.toJsFn)
    
    inline def setPut(value: (EntityId, Double, T) => js.Promise[Ghost[T]]): Self = StObject.set(x, "put", js.Any.fromFunction3(value))
    
    inline def setRemove(value: EntityId => js.Promise[Ghost[T]]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSetChangeVersion(value: ChangeVersion => js.Promise[Unit]): Self = StObject.set(x, "setChangeVersion", js.Any.fromFunction1(value))
  }
}
