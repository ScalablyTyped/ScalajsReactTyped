package typingsJapgolly.vueReactivity

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Get[T] extends StObject {
    
    def get(): T
    
    def set(value: T): Unit
  }
  object Get {
    
    inline def apply[T](get: CallbackTo[T], set: T => Callback): Get[T] = {
      val __obj = js.Dynamic.literal(get = get.toJsFn, set = js.Any.fromFunction1((t0: T) => set(t0).runNow()))
      __obj.asInstanceOf[Get[T]]
    }
    
    extension [Self <: Get[?], T](x: Self & Get[T]) {
      
      inline def setGet(value: CallbackTo[T]): Self = StObject.set(x, "get", value.toJsFn)
      
      inline def setSet(value: T => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait RawSymbol extends StObject
  
  @js.native
  trait ShallowReactiveMarker extends StObject
}
