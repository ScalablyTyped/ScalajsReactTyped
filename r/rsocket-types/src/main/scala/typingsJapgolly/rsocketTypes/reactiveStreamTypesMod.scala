package typingsJapgolly.rsocketTypes

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactiveStreamTypesMod {
  
  @js.native
  trait IPublisher[T] extends StObject {
    
    def map[R](fn: js.Function1[/* data */ T, R]): IPublisher[R] = js.native
    
    def subscribe(): Unit = js.native
    def subscribe(subscriber: Partial[ISubscriber[T]]): Unit = js.native
  }
  
  trait ISubject[T] extends StObject {
    
    def onComplete(): Unit
    
    def onError(error: js.Error): Unit
    
    def onNext(value: T): Unit
  }
  object ISubject {
    
    inline def apply[T](onComplete: Callback, onError: js.Error => Callback, onNext: T => Callback): ISubject[T] = {
      val __obj = js.Dynamic.literal(onComplete = onComplete.toJsFn, onError = js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()), onNext = js.Any.fromFunction1((t0: T) => onNext(t0).runNow()))
      __obj.asInstanceOf[ISubject[T]]
    }
    
    extension [Self <: ISubject[?], T](x: Self & ISubject[T]) {
      
      inline def setOnComplete(value: Callback): Self = StObject.set(x, "onComplete", value.toJsFn)
      
      inline def setOnError(value: js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setOnNext(value: T => Callback): Self = StObject.set(x, "onNext", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
  
  trait ISubscriber[T] extends StObject {
    
    def onComplete(): Unit
    
    def onError(error: js.Error): Unit
    
    def onNext(value: T): Unit
    
    def onSubscribe(subscription: ISubscription): Unit
  }
  object ISubscriber {
    
    inline def apply[T](
      onComplete: Callback,
      onError: js.Error => Callback,
      onNext: T => Callback,
      onSubscribe: ISubscription => Callback
    ): ISubscriber[T] = {
      val __obj = js.Dynamic.literal(onComplete = onComplete.toJsFn, onError = js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()), onNext = js.Any.fromFunction1((t0: T) => onNext(t0).runNow()), onSubscribe = js.Any.fromFunction1((t0: ISubscription) => onSubscribe(t0).runNow()))
      __obj.asInstanceOf[ISubscriber[T]]
    }
    
    extension [Self <: ISubscriber[?], T](x: Self & ISubscriber[T]) {
      
      inline def setOnComplete(value: Callback): Self = StObject.set(x, "onComplete", value.toJsFn)
      
      inline def setOnError(value: js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setOnNext(value: T => Callback): Self = StObject.set(x, "onNext", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setOnSubscribe(value: ISubscription => Callback): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1((t0: ISubscription) => value(t0).runNow()))
    }
  }
  
  trait ISubscription extends StObject {
    
    def cancel(): Unit
    
    def request(n: Double): Unit
  }
  object ISubscription {
    
    inline def apply(cancel: Callback, request: Double => Callback): ISubscription = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, request = js.Any.fromFunction1((t0: Double) => request(t0).runNow()))
      __obj.asInstanceOf[ISubscription]
    }
    
    extension [Self <: ISubscription](x: Self) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setRequest(value: Double => Callback): Self = StObject.set(x, "request", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
