package typingsJapgolly.zenObservable

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike
import typingsJapgolly.zenObservable.mod.global.ZenObservable.Observer
import typingsJapgolly.zenObservable.mod.global.ZenObservable.Subscriber
import typingsJapgolly.zenObservable.mod.global.ZenObservable.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zen-observable", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with Observable[T] {
    def this(subscriber: Subscriber[T]) = this()
  }
  @JSImport("zen-observable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def from[R](observable: ArrayLike[R]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  /* static member */
  inline def from[R](observable: Observable[R]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  inline def from[R](observable: ObservableLike[R]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  
  /* static member */
  inline def of[R](items: R*): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Observable[R]]
  
  @js.native
  trait Observable[T] extends StObject {
    
    def concat[R](observable: Observable[R]*): Observable[R] = js.native
    
    def filter(callback: js.Function1[/* value */ T, Boolean]): Observable[T] = js.native
    @JSName("filter")
    def filter_S[S /* <: T */](callback: js.Function1[/* value */ T, /* is S */ Boolean]): Observable[S] = js.native
    
    def flatMap[R](callback: js.Function1[/* value */ T, ObservableLike[R]]): Observable[R] = js.native
    
    def forEach(callback: js.Function1[/* value */ T, Unit]): js.Promise[Unit] = js.native
    
    def map[R](callback: js.Function1[/* value */ T, R]): Observable[R] = js.native
    
    def reduce(callback: js.Function2[/* previousValue */ T, /* currentValue */ T, T]): Observable[T] = js.native
    def reduce(callback: js.Function2[/* previousValue */ T, /* currentValue */ T, T], initialValue: T): Observable[T] = js.native
    @JSName("reduce")
    def reduce_R[R](callback: js.Function2[/* previousValue */ R, /* currentValue */ T, R]): Observable[R] = js.native
    @JSName("reduce")
    def reduce_R[R](callback: js.Function2[/* previousValue */ R, /* currentValue */ T, R], initialValue: R): Observable[R] = js.native
    
    def subscribe(observer: Observer[T]): Subscription = js.native
    def subscribe(onNext: js.Function1[/* value */ T, Unit]): Subscription = js.native
    def subscribe(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* error */ Any, Unit]): Subscription = js.native
    def subscribe(
      onNext: js.Function1[/* value */ T, Unit],
      onError: js.Function1[/* error */ Any, Unit],
      onComplete: js.Function0[Unit]
    ): Subscription = js.native
    def subscribe(onNext: js.Function1[/* value */ T, Unit], onError: Unit, onComplete: js.Function0[Unit]): Subscription = js.native
  }
  
  object global {
    
    trait SymbolConstructor extends StObject {
      
      val observable: js.Symbol
    }
    object SymbolConstructor {
      
      inline def apply(observable: js.Symbol): SymbolConstructor = {
        val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
        __obj.asInstanceOf[SymbolConstructor]
      }
      
      extension [Self <: SymbolConstructor](x: Self) {
        
        inline def setObservable(value: js.Symbol): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      }
    }
    
    object ZenObservable {
      
      @js.native
      trait ObservableLike[T] extends StObject {
        
        var subscribe: js.UndefOr[Subscriber[T]] = js.native
      }
      
      trait Observer[T] extends StObject {
        
        var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        var error: js.UndefOr[js.Function1[/* errorValue */ Any, Unit]] = js.undefined
        
        var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
        
        var start: js.UndefOr[js.Function1[/* subscription */ Subscription, Any]] = js.undefined
      }
      object Observer {
        
        inline def apply[T](): Observer[T] = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Observer[T]]
        }
        
        extension [Self <: Observer[?], T](x: Self & Observer[T]) {
          
          inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
          
          inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
          
          inline def setError(value: /* errorValue */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* errorValue */ Any) => value(t0).runNow()))
          
          inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
          
          inline def setNext(value: /* value */ T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: /* value */ T) => value(t0).runNow()))
          
          inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
          
          inline def setStart(value: /* subscription */ Subscription => Any): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
          
          inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        }
      }
      
      type Subscriber[T] = js.Function1[/* observer */ SubscriptionObserver[T], Unit | js.Function0[Unit] | Subscription]
      
      trait Subscription extends StObject {
        
        var closed: Boolean
        
        def unsubscribe(): Unit
      }
      object Subscription {
        
        inline def apply(closed: Boolean, unsubscribe: Callback): Subscription = {
          val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], unsubscribe = unsubscribe.toJsFn)
          __obj.asInstanceOf[Subscription]
        }
        
        extension [Self <: Subscription](x: Self) {
          
          inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
          
          inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
        }
      }
      
      trait SubscriptionObserver[T] extends StObject {
        
        var closed: Boolean
        
        def complete(): Unit
        
        def error(errorValue: Any): Unit
        
        def next(value: T): Unit
      }
      object SubscriptionObserver {
        
        inline def apply[T](closed: Boolean, complete: Callback, error: Any => Callback, next: T => Callback): SubscriptionObserver[T] = {
          val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], complete = complete.toJsFn, error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()), next = js.Any.fromFunction1((t0: T) => next(t0).runNow()))
          __obj.asInstanceOf[SubscriptionObserver[T]]
        }
        
        extension [Self <: SubscriptionObserver[?], T](x: Self & SubscriptionObserver[T]) {
          
          inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
          
          inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
          
          inline def setError(value: Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
          
          inline def setNext(value: T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
        }
      }
    }
  }
}
