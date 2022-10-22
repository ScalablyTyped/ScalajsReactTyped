package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Observer
trait IObserver[T] extends StObject {
  
  def onCompleted(): Unit
  
  def onError(exception: Any): Unit
  
  def onNext(value: T): Unit
}
object IObserver {
  
  inline def apply[T](onCompleted: Callback, onError: Any => Callback, onNext: T => Callback): IObserver[T] = {
    val __obj = js.Dynamic.literal(onCompleted = onCompleted.toJsFn, onError = js.Any.fromFunction1((t0: Any) => onError(t0).runNow()), onNext = js.Any.fromFunction1((t0: T) => onNext(t0).runNow()))
    __obj.asInstanceOf[IObserver[T]]
  }
  
  extension [Self <: IObserver[?], T](x: Self & IObserver[T]) {
    
    inline def setOnCompleted(value: Callback): Self = StObject.set(x, "onCompleted", value.toJsFn)
    
    inline def setOnError(value: Any => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnNext(value: T => Callback): Self = StObject.set(x, "onNext", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
