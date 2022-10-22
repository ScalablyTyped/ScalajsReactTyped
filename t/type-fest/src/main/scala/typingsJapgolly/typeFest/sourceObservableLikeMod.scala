package typingsJapgolly.typeFest

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceObservableLikeMod {
  
  @js.native
  trait ObservableLike[ValueType] extends StObject {
    
    def subscribe(): Unsubscribable = js.native
    def subscribe(observer: Partial[Observer[ValueType]]): Unsubscribable = js.native
  }
  
  trait Observer[ValueType] extends StObject {
    
    def complete(): Unit
    @JSName("complete")
    var complete_Original: OnComplete
    
    def error(error: Any): Unit
    @JSName("error")
    var error_Original: OnError
    
    def next(value: ValueType): Unit
    @JSName("next")
    var next_Original: OnNext[ValueType]
  }
  object Observer {
    
    inline def apply[ValueType](complete: Callback, error: /* error */ Any => Callback, next: ValueType => Callback): Observer[ValueType] = {
      val __obj = js.Dynamic.literal(complete = complete.toJsFn, error = js.Any.fromFunction1((t0: /* error */ Any) => error(t0).runNow()), next = js.Any.fromFunction1((t0: ValueType) => next(t0).runNow()))
      __obj.asInstanceOf[Observer[ValueType]]
    }
    
    extension [Self <: Observer[?], ValueType](x: Self & Observer[ValueType]) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
      
      inline def setError(value: /* error */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ Any) => value(t0).runNow()))
      
      inline def setNext(value: ValueType => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: ValueType) => value(t0).runNow()))
    }
  }
  
  /**
  @category Observable
  */
  type OnComplete = js.Function0[Unit]
  
  /**
  @category Observable
  */
  type OnError = js.Function1[/* error */ Any, Unit]
  
  /**
  @category Observable
  */
  type OnNext[ValueType] = js.Function1[/* value */ ValueType, Unit]
  
  trait Unsubscribable extends StObject {
    
    def unsubscribe(): Unit
  }
  object Unsubscribable {
    
    inline def apply(unsubscribe: Callback): Unsubscribable = {
      val __obj = js.Dynamic.literal(unsubscribe = unsubscribe.toJsFn)
      __obj.asInstanceOf[Unsubscribable]
    }
    
    extension [Self <: Unsubscribable](x: Self) {
      
      inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
    }
  }
  
  object global {
    
    // eslint-disable-next-line @typescript-eslint/consistent-type-definitions -- It has to be an `interface` so that it can be merged.
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
  }
}
