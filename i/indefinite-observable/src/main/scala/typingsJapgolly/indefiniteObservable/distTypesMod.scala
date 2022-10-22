package typingsJapgolly.indefiniteObservable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type Connect[T] = js.Function1[/* observer */ Observer[T], Disconnect]
  
  type Disconnect = js.Function0[Unit]
  
  type NextChannel[T] = js.Function1[/* value */ T, Unit]
  
  trait Observable[T] extends StObject {
    
    def subscribe(observerOrNext: ObserverOrNext[T]): Subscription
  }
  object Observable {
    
    inline def apply[T](subscribe: ObserverOrNext[T] => Subscription): Observable[T] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Observable[T]]
    }
    
    extension [Self <: Observable[?], T](x: Self & Observable[T]) {
      
      inline def setSubscribe(value: ObserverOrNext[T] => Subscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait Observer[T] extends StObject {
    
    def next(value: T): Unit
    @JSName("next")
    var next_Original: NextChannel[T]
  }
  object Observer {
    
    inline def apply[T](next: T => Callback): Observer[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1((t0: T) => next(t0).runNow()))
      __obj.asInstanceOf[Observer[T]]
    }
    
    extension [Self <: Observer[?], T](x: Self & Observer[T]) {
      
      inline def setNext(value: T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
  
  type ObserverOrNext[T] = Observer[T] | NextChannel[T]
  
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit
    @JSName("unsubscribe")
    var unsubscribe_Original: Unsubscribe
  }
  object Subscription {
    
    inline def apply(unsubscribe: Callback): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = unsubscribe.toJsFn)
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
    }
  }
  
  type Unsubscribe = js.Function0[Unit]
}
