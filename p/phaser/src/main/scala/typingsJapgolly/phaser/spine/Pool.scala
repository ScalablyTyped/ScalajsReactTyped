package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pool[T] extends StObject {
  
  def clear(): Unit
  
  def free(item: T): Unit
  
  def freeAll(items: ArrayLike[T]): Unit
  
  /* private */ var instantiator: Any
  
  /* private */ var items: Any
  
  def obtain(): T
}
object Pool {
  
  inline def apply[T](
    clear: Callback,
    free: T => Callback,
    freeAll: ArrayLike[T] => Callback,
    instantiator: Any,
    items: Any,
    obtain: CallbackTo[T]
  ): Pool[T] = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, free = js.Any.fromFunction1((t0: T) => free(t0).runNow()), freeAll = js.Any.fromFunction1((t0: ArrayLike[T]) => freeAll(t0).runNow()), instantiator = instantiator.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], obtain = obtain.toJsFn)
    __obj.asInstanceOf[Pool[T]]
  }
  
  extension [Self <: Pool[?], T](x: Self & Pool[T]) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setFree(value: T => Callback): Self = StObject.set(x, "free", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setFreeAll(value: ArrayLike[T] => Callback): Self = StObject.set(x, "freeAll", js.Any.fromFunction1((t0: ArrayLike[T]) => value(t0).runNow()))
    
    inline def setInstantiator(value: Any): Self = StObject.set(x, "instantiator", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setObtain(value: CallbackTo[T]): Self = StObject.set(x, "obtain", value.toJsFn)
  }
}
