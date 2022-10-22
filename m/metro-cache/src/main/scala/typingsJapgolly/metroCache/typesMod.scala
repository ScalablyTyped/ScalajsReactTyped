package typingsJapgolly.metroCache

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait CacheStore[T] extends StObject {
    
    def clear(): Unit | js.Promise[Unit]
    
    def get(key: Buffer): js.UndefOr[T | (js.Promise[T | Unit])]
    
    def set(key: Buffer, value: T): Unit | js.Promise[Unit]
  }
  object CacheStore {
    
    inline def apply[T](
      clear: CallbackTo[Unit | js.Promise[Unit]],
      get: Buffer => js.UndefOr[T | (js.Promise[T | Unit])],
      set: (Buffer, T) => Unit | js.Promise[Unit]
    ): CacheStore[T] = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[CacheStore[T]]
    }
    
    extension [Self <: CacheStore[?], T](x: Self & CacheStore[T]) {
      
      inline def setClear(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setGet(value: Buffer => js.UndefOr[T | (js.Promise[T | Unit])]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Buffer, T) => Unit | js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
