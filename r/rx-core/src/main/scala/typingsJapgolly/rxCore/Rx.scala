package typingsJapgolly.rxCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rx {
  
  @js.native
  trait GroupedObservable[TKey, TElement]
    extends StObject
       with Observable[TElement] {
    
    var key: TKey = js.native
    
    var underlyingObservable: Observable[TElement] = js.native
  }
  
  trait IDisposable extends StObject {
    
    def dispose(): Unit
  }
  object IDisposable {
    
    inline def apply(dispose: Callback): IDisposable = {
      val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
      __obj.asInstanceOf[IDisposable]
    }
    
    extension [Self <: IDisposable](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    }
  }
  
  /**
    * Promise A+
    */
  @js.native
  trait IPromise[T] extends StObject {
    
    def `then`[R](): IPromise[R] = js.native
    def `then`[R](onFulfilled: js.Function1[/* value */ T, IPromise[R] | R]): IPromise[R] = js.native
    def `then`[R](
      onFulfilled: js.Function1[/* value */ T, IPromise[R] | R],
      onRejected: js.Function1[/* reason */ Any, IPromise[R] | R]
    ): IPromise[R] = js.native
    def `then`[R](onFulfilled: Unit, onRejected: js.Function1[/* reason */ Any, R]): IPromise[R] = js.native
  }
  
  trait IScheduler extends StObject {
    
    def `catch`(handler: js.Function1[/* exception */ Any, Boolean]): IScheduler
    
    def catchException(handler: js.Function1[/* exception */ Any, Boolean]): IScheduler
  }
  object IScheduler {
    
    inline def apply(
      `catch`: js.Function1[/* exception */ Any, Boolean] => IScheduler,
      catchException: js.Function1[/* exception */ Any, Boolean] => IScheduler
    ): IScheduler = {
      val __obj = js.Dynamic.literal(catchException = js.Any.fromFunction1(catchException))
      __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
      __obj.asInstanceOf[IScheduler]
    }
    
    extension [Self <: IScheduler](x: Self) {
      
      inline def setCatch(value: js.Function1[/* exception */ Any, Boolean] => IScheduler): Self = StObject.set(x, "catch", js.Any.fromFunction1(value))
      
      inline def setCatchException(value: js.Function1[/* exception */ Any, Boolean] => IScheduler): Self = StObject.set(x, "catchException", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Observable[T] extends StObject {
    
    def amb(rightSource: IPromise[T]): Observable[T] = js.native
    def amb(rightSource: Observable[T]): Observable[T] = js.native
    
    def bufferWithCount(count: Double): Observable[js.Array[T]] = js.native
    def bufferWithCount(count: Double, skip: Double): Observable[js.Array[T]] = js.native
    
    def defaultIfEmpty(): Observable[T] = js.native
    def defaultIfEmpty(defaultValue: T): Observable[T] = js.native
    
    def distinct(skipParameter: Boolean, valueSerializer: js.Function1[/* value */ T, String]): Observable[T] = js.native
    def distinct[TKey](): Observable[T] = js.native
    def distinct[TKey](keySelector: js.Function1[/* value */ T, TKey]): Observable[T] = js.native
    def distinct[TKey](
      keySelector: js.Function1[/* value */ T, TKey],
      keySerializer: js.Function1[/* key */ TKey, String]
    ): Observable[T] = js.native
    def distinct[TKey](keySelector: Unit, keySerializer: js.Function1[/* key */ TKey, String]): Observable[T] = js.native
    
    def groupBy[TKey, TElement](keySelector: js.Function1[/* value */ T, TKey]): Observable[GroupedObservable[TKey, T]] = js.native
    def groupBy[TKey, TElement](
      keySelector: js.Function1[/* value */ T, TKey],
      elementSelector: js.Function1[/* value */ T, TElement]
    ): Observable[GroupedObservable[TKey, TElement]] = js.native
    def groupBy[TKey, TElement](
      keySelector: js.Function1[/* value */ T, TKey],
      elementSelector: js.Function1[/* value */ T, TElement],
      keySerializer: js.Function1[/* key */ TKey, String]
    ): Observable[GroupedObservable[TKey, TElement]] = js.native
    def groupBy[TKey, TElement](keySelector: js.Function1[/* value */ T, TKey], skipElementSelector: Boolean): Observable[GroupedObservable[TKey, T]] = js.native
    def groupBy[TKey, TElement](
      keySelector: js.Function1[/* value */ T, TKey],
      skipElementSelector: Boolean,
      keySerializer: js.Function1[/* key */ TKey, String]
    ): Observable[GroupedObservable[TKey, T]] = js.native
    def groupBy[TKey, TElement](
      keySelector: js.Function1[/* value */ T, TKey],
      skipElementSelector: Unit,
      keySerializer: js.Function1[/* key */ TKey, String]
    ): Observable[GroupedObservable[TKey, T]] = js.native
    
    def groupByUntil[TKey, TDuration](
      keySelector: js.Function1[/* value */ T, TKey],
      skipElementSelector: Boolean,
      durationSelector: js.Function1[/* group */ GroupedObservable[TKey, T], Observable[TDuration]]
    ): Observable[GroupedObservable[TKey, T]] = js.native
    def groupByUntil[TKey, TDuration](
      keySelector: js.Function1[/* value */ T, TKey],
      skipElementSelector: Boolean,
      durationSelector: js.Function1[/* group */ GroupedObservable[TKey, T], Observable[TDuration]],
      keySerializer: js.Function1[/* key */ TKey, String]
    ): Observable[GroupedObservable[TKey, T]] = js.native
    def groupByUntil[TKey, TElement, TDuration](
      keySelector: js.Function1[/* value */ T, TKey],
      elementSelector: js.Function1[/* value */ T, TElement],
      durationSelector: js.Function1[/* group */ GroupedObservable[TKey, TElement], Observable[TDuration]]
    ): Observable[GroupedObservable[TKey, TElement]] = js.native
    def groupByUntil[TKey, TElement, TDuration](
      keySelector: js.Function1[/* value */ T, TKey],
      elementSelector: js.Function1[/* value */ T, TElement],
      durationSelector: js.Function1[/* group */ GroupedObservable[TKey, TElement], Observable[TDuration]],
      keySerializer: js.Function1[/* key */ TKey, String]
    ): Observable[GroupedObservable[TKey, TElement]] = js.native
    
    def observeOn(scheduler: IScheduler): Observable[T] = js.native
    
    def onErrorResumeNext(second: IPromise[T]): Observable[T] = js.native
    def onErrorResumeNext(second: Observable[T]): Observable[T] = js.native
    
    def subscribeOn(scheduler: IScheduler): Observable[T] = js.native
    
    def windowWithCount(count: Double): Observable[Observable[T]] = js.native
    def windowWithCount(count: Double, skip: Double): Observable[Observable[T]] = js.native
  }
  
  @js.native
  trait ObservableStatic extends StObject {
    
    def amb[T](sources: (IPromise[T] | Observable[T])*): Observable[T] = js.native
    def amb[T](sources: js.Array[IPromise[T] | Observable[T]]): Observable[T] = js.native
    
    def onErrorResumeNext[T](sources: (IPromise[T] | Observable[T])*): Observable[T] = js.native
    def onErrorResumeNext[T](sources: js.Array[IPromise[T] | Observable[T]]): Observable[T] = js.native
    
    def `using`[TSource, TResource /* <: IDisposable */](
      resourceFactory: js.Function0[TResource],
      observableFactory: js.Function1[/* resource */ TResource, Observable[TSource]]
    ): Observable[TSource] = js.native
  }
  
  // Observer
  trait Observer[T] extends StObject {
    
    def checked(): Observer[Any]
  }
  object Observer {
    
    inline def apply[T](checked: CallbackTo[Observer[Any]]): Observer[T] = {
      val __obj = js.Dynamic.literal(checked = checked.toJsFn)
      __obj.asInstanceOf[Observer[T]]
    }
    
    extension [Self <: Observer[?], T](x: Self & Observer[T]) {
      
      inline def setChecked(value: CallbackTo[Observer[Any]]): Self = StObject.set(x, "checked", value.toJsFn)
    }
  }
  
  trait ObserverStatic extends StObject {
    
    /**
      * Schedules the invocation of observer methods on the given scheduler.
      * @param scheduler Scheduler to schedule observer messages on.
      * @returns Observer whose messages are scheduled on the given scheduler.
      */
    def notifyOn[T](scheduler: IScheduler): Observer[T]
  }
  object ObserverStatic {
    
    inline def apply(notifyOn: IScheduler => Observer[Any]): ObserverStatic = {
      val __obj = js.Dynamic.literal(notifyOn = js.Any.fromFunction1(notifyOn))
      __obj.asInstanceOf[ObserverStatic]
    }
    
    extension [Self <: ObserverStatic](x: Self) {
      
      inline def setNotifyOn(value: IScheduler => Observer[Any]): Self = StObject.set(x, "notifyOn", js.Any.fromFunction1(value))
    }
  }
}
