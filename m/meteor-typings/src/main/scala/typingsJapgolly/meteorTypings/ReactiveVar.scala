package typingsJapgolly.meteorTypings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactiveVar[T] extends StObject {
  
  def get(): T
  
  def set(newValue: T): Unit
}
object ReactiveVar {
  
  inline def apply[T](get: CallbackTo[T], set: T => Callback): ReactiveVar[T] = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, set = js.Any.fromFunction1((t0: T) => set(t0).runNow()))
    __obj.asInstanceOf[ReactiveVar[T]]
  }
  
  extension [Self <: ReactiveVar[?], T](x: Self & ReactiveVar[T]) {
    
    inline def setGet(value: CallbackTo[T]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setSet(value: T => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
