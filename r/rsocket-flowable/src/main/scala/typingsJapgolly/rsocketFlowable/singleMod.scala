package typingsJapgolly.rsocketFlowable

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleMod {
  
  @JSImport("rsocket-flowable/Single", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with Single[T] {
    def this(source: Source[T]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rsocket-flowable/Single", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(error: js.Error): Single[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(error.asInstanceOf[js.Any]).asInstanceOf[Single[scala.Nothing]]
    
    inline def never(): Single[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Single[scala.Nothing]]
    
    inline def of[U](value: U): Single[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[Single[U]]
  }
  
  type CancelCallback = js.Function0[Unit]
  
  @js.native
  trait IFutureSubject[T] extends StObject {
    
    def onComplete(value: T): Unit = js.native
    
    def onError(error: js.Error): Unit = js.native
    
    def onSubscribe(): Unit = js.native
    def onSubscribe(cancel: CancelCallback): Unit = js.native
  }
  
  trait IFutureSubscriber[T] extends StObject {
    
    def onComplete(value: T): Unit
    
    def onError(error: js.Error): Unit
    
    def onSubscribe(cancel: CancelCallback): Unit
  }
  object IFutureSubscriber {
    
    inline def apply[T](onComplete: T => Callback, onError: js.Error => Callback, onSubscribe: CancelCallback => Callback): IFutureSubscriber[T] = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1((t0: T) => onComplete(t0).runNow()), onError = js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()), onSubscribe = js.Any.fromFunction1((t0: CancelCallback) => onSubscribe(t0).runNow()))
      __obj.asInstanceOf[IFutureSubscriber[T]]
    }
    
    extension [Self <: IFutureSubscriber[?], T](x: Self & IFutureSubscriber[T]) {
      
      inline def setOnComplete(value: T => Callback): Self = StObject.set(x, "onComplete", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setOnError(value: js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setOnSubscribe(value: CancelCallback => Callback): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1((t0: CancelCallback) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait Single[T] extends StObject {
    
    def flatMap[R](fn: js.Function1[/* data */ T, Single[R]]): Single[R] = js.native
    
    /**
      * Return a new Single that resolves to the value of this Single applied to
      * the given mapping function.
      */
    def map[R](fn: js.Function1[/* data */ T, R]): Single[R] = js.native
    
    def subscribe(): Unit = js.native
    def subscribe(partialSubscriber: Partial[IFutureSubscriber[T]]): Unit = js.native
    
    def `then`(): Unit = js.native
    def `then`(successFn: js.Function1[/* data */ T, Unit]): Unit = js.native
    def `then`(successFn: js.Function1[/* data */ T, Unit], errorFn: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    def `then`(successFn: Unit, errorFn: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  }
  
  type Source[T] = js.Function1[/* subject */ IFutureSubject[T], Unit]
}
