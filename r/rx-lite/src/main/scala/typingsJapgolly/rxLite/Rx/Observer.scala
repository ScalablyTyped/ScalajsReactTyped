package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Observer[T]
  extends StObject
     with IObserver[T] {
  
  def asObserver(): Observer[T]
  
  def toNotifier(): js.Function1[/* notification */ Notification[T], Unit]
}
object Observer {
  
  inline def apply[T](
    asObserver: CallbackTo[Observer[T]],
    onCompleted: Callback,
    onError: Any => Callback,
    onNext: T => Callback,
    toNotifier: CallbackTo[js.Function1[/* notification */ Notification[T], Unit]]
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(asObserver = asObserver.toJsFn, onCompleted = onCompleted.toJsFn, onError = js.Any.fromFunction1((t0: Any) => onError(t0).runNow()), onNext = js.Any.fromFunction1((t0: T) => onNext(t0).runNow()), toNotifier = toNotifier.toJsFn)
    __obj.asInstanceOf[Observer[T]]
  }
  
  extension [Self <: Observer[?], T](x: Self & Observer[T]) {
    
    inline def setAsObserver(value: CallbackTo[Observer[T]]): Self = StObject.set(x, "asObserver", value.toJsFn)
    
    inline def setToNotifier(value: CallbackTo[js.Function1[/* notification */ Notification[T], Unit]]): Self = StObject.set(x, "toNotifier", value.toJsFn)
  }
}
