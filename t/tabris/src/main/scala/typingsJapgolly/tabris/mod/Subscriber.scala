package typingsJapgolly.tabris.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscriber[T]
  extends StObject
     with Observer[T] {
  
  val closed: Boolean
}
object Subscriber {
  
  inline def apply[T](closed: Boolean, complete: Callback, error: /* value */ Any => Callback, next: T => Callback): Subscriber[T] = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], complete = complete.toJsFn, error = js.Any.fromFunction1((t0: /* value */ Any) => error(t0).runNow()), next = js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[Subscriber[T]]
  }
  
  extension [Self <: Subscriber[?], T](x: Self & Subscriber[T]) {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
  }
}
