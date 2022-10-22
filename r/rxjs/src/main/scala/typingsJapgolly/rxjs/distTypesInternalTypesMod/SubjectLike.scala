package typingsJapgolly.rxjs.distTypesInternalTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectLike[T]
  extends StObject
     with Observer[T]
     with Subscribable[T]
object SubjectLike {
  
  inline def apply[T](
    complete: Callback,
    error: Any => Callback,
    next: T => Callback,
    subscribe: Partial[Observer[T]] => Unsubscribable
  ): SubjectLike[T] = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn, error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()), next = js.Any.fromFunction1((t0: T) => next(t0).runNow()), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[SubjectLike[T]]
  }
}
