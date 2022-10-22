package typingsJapgolly.wonderFrp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wonderFrp.distEs2015DisposableIdisposableMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ObserverIobserverMod {
  
  trait IObserver
    extends StObject
       with IDisposable {
    
    def completed(): Any
    
    def error(error: Any): Any
    
    def next(value: Any): Any
  }
  object IObserver {
    
    inline def apply(completed: CallbackTo[Any], dispose: Callback, error: Any => Any, next: Any => Any): IObserver = {
      val __obj = js.Dynamic.literal(completed = completed.toJsFn, dispose = dispose.toJsFn, error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[IObserver]
    }
    
    extension [Self <: IObserver](x: Self) {
      
      inline def setCompleted(value: CallbackTo[Any]): Self = StObject.set(x, "completed", value.toJsFn)
      
      inline def setError(value: Any => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: Any => Any): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
}
