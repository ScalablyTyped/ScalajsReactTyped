package typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lookup[T]
  extends StObject
     with Clonable[Lookup[T]] {
  
  def add(serviceIdentifier: ServiceIdentifier[Any], value: T): Unit
  
  def get(serviceIdentifier: ServiceIdentifier[Any]): js.Array[T]
  
  def getMap(): Map[ServiceIdentifier[Any], js.Array[T]]
  
  def hasKey(serviceIdentifier: ServiceIdentifier[Any]): Boolean
  
  def remove(serviceIdentifier: ServiceIdentifier[Any]): Unit
  
  def removeByCondition(condition: js.Function1[/* item */ T, Boolean]): js.Array[T]
  
  def removeIntersection(lookup: Lookup[T]): Unit
  
  def traverse(func: js.Function2[/* key */ ServiceIdentifier[Any], /* value */ js.Array[T], Unit]): Unit
}
object Lookup {
  
  inline def apply[T](
    add: (ServiceIdentifier[Any], T) => Callback,
    get: ServiceIdentifier[Any] => js.Array[T],
    getMap: CallbackTo[Map[ServiceIdentifier[Any], js.Array[T]]],
    hasKey: ServiceIdentifier[Any] => Boolean,
    remove: ServiceIdentifier[Any] => Callback,
    removeByCondition: js.Function1[/* item */ T, Boolean] => js.Array[T],
    removeIntersection: Lookup[T] => Callback,
    traverse: js.Function2[/* key */ ServiceIdentifier[Any], /* value */ js.Array[T], Unit] => Callback
  ): Lookup[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: ServiceIdentifier[Any], t1: T) => (add(t0, t1)).runNow()), get = js.Any.fromFunction1(get), getMap = getMap.toJsFn, hasKey = js.Any.fromFunction1(hasKey), remove = js.Any.fromFunction1((t0: ServiceIdentifier[Any]) => remove(t0).runNow()), removeByCondition = js.Any.fromFunction1(removeByCondition), removeIntersection = js.Any.fromFunction1((t0: Lookup[T]) => removeIntersection(t0).runNow()), traverse = js.Any.fromFunction1((t0: js.Function2[/* key */ ServiceIdentifier[Any], /* value */ js.Array[T], Unit]) => traverse(t0).runNow()))
    __obj.asInstanceOf[Lookup[T]]
  }
  
  extension [Self <: Lookup[?], T](x: Self & Lookup[T]) {
    
    inline def setAdd(value: (ServiceIdentifier[Any], T) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: ServiceIdentifier[Any], t1: T) => (value(t0, t1)).runNow()))
    
    inline def setGet(value: ServiceIdentifier[Any] => js.Array[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetMap(value: CallbackTo[Map[ServiceIdentifier[Any], js.Array[T]]]): Self = StObject.set(x, "getMap", value.toJsFn)
    
    inline def setHasKey(value: ServiceIdentifier[Any] => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
    
    inline def setRemove(value: ServiceIdentifier[Any] => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: ServiceIdentifier[Any]) => value(t0).runNow()))
    
    inline def setRemoveByCondition(value: js.Function1[/* item */ T, Boolean] => js.Array[T]): Self = StObject.set(x, "removeByCondition", js.Any.fromFunction1(value))
    
    inline def setRemoveIntersection(value: Lookup[T] => Callback): Self = StObject.set(x, "removeIntersection", js.Any.fromFunction1((t0: Lookup[T]) => value(t0).runNow()))
    
    inline def setTraverse(value: js.Function2[/* key */ ServiceIdentifier[Any], /* value */ js.Array[T], Unit] => Callback): Self = StObject.set(x, "traverse", js.Any.fromFunction1((t0: js.Function2[/* key */ ServiceIdentifier[Any], /* value */ js.Array[T], Unit]) => value(t0).runNow()))
  }
}
