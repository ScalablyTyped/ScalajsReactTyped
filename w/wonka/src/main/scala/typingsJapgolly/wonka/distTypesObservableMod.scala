package typingsJapgolly.wonka

import japgolly.scalajs.react.Callback
import typingsJapgolly.wonka.distTypesTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesObservableMod {
  
  @JSImport("wonka/dist/types/observable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromObservable[T](input: Observable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObservable")(input.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def toObservable[T](source: Source[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObservable")(source.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  trait Observable[T] extends StObject {
    
    def subscribe(observer: ObservableObserver[T]): ObservableSubscription
  }
  object Observable {
    
    inline def apply[T](subscribe: ObservableObserver[T] => ObservableSubscription): Observable[T] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Observable[T]]
    }
    
    extension [Self <: Observable[?], T](x: Self & Observable[T]) {
      
      inline def setSubscribe(value: ObservableObserver[T] => ObservableSubscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait ObservableObserver[T] extends StObject {
    
    def complete(): Unit
    
    def error(error: Any): Unit
    
    def next(value: T): Unit
  }
  object ObservableObserver {
    
    inline def apply[T](complete: Callback, error: Any => Callback, next: T => Callback): ObservableObserver[T] = {
      val __obj = js.Dynamic.literal(complete = complete.toJsFn, error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()), next = js.Any.fromFunction1((t0: T) => next(t0).runNow()))
      __obj.asInstanceOf[ObservableObserver[T]]
    }
    
    extension [Self <: ObservableObserver[?], T](x: Self & ObservableObserver[T]) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
      
      inline def setError(value: Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setNext(value: T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
  
  trait ObservableSubscription extends StObject {
    
    var closed: js.UndefOr[Boolean] = js.undefined
    
    def unsubscribe(): Unit
  }
  object ObservableSubscription {
    
    inline def apply(unsubscribe: Callback): ObservableSubscription = {
      val __obj = js.Dynamic.literal(unsubscribe = unsubscribe.toJsFn)
      __obj.asInstanceOf[ObservableSubscription]
    }
    
    extension [Self <: ObservableSubscription](x: Self) {
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
    }
  }
}
