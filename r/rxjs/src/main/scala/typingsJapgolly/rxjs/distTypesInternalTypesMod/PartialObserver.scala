package typingsJapgolly.rxjs.distTypesInternalTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rxjs.distTypesInternalTypesMod.NextObserver[T]
  - typingsJapgolly.rxjs.distTypesInternalTypesMod.ErrorObserver[T]
  - typingsJapgolly.rxjs.distTypesInternalTypesMod.CompletionObserver[T]
*/
trait PartialObserver[T] extends StObject
object PartialObserver {
  
  inline def CompletionObserver[T](complete: Callback): typingsJapgolly.rxjs.distTypesInternalTypesMod.CompletionObserver[T] = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.rxjs.distTypesInternalTypesMod.CompletionObserver[T]]
  }
  
  inline def ErrorObserver[T](error: Any => Callback): typingsJapgolly.rxjs.distTypesInternalTypesMod.ErrorObserver[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()))
    __obj.asInstanceOf[typingsJapgolly.rxjs.distTypesInternalTypesMod.ErrorObserver[T]]
  }
  
  inline def NextObserver[T](next: T => Callback): typingsJapgolly.rxjs.distTypesInternalTypesMod.NextObserver[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[typingsJapgolly.rxjs.distTypesInternalTypesMod.NextObserver[T]]
  }
}
