package typingsJapgolly.reduxSagaDeferred

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@redux-saga/deferred", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[R](): Deferred[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Deferred[R]]
  
  inline def arrayOfDeferred[R](length: Double): js.Array[Deferred[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOfDeferred")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[Deferred[R]]]
  
  trait Deferred[R] extends StObject {
    
    var promise: js.Promise[R]
    
    def reject(error: Any): Unit
    
    def resolve(result: R): Unit
  }
  object Deferred {
    
    inline def apply[R](promise: js.Promise[R], reject: Any => Callback, resolve: R => Callback): Deferred[R] = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1((t0: Any) => reject(t0).runNow()), resolve = js.Any.fromFunction1((t0: R) => resolve(t0).runNow()))
      __obj.asInstanceOf[Deferred[R]]
    }
    
    extension [Self <: Deferred[?], R](x: Self & Deferred[R]) {
      
      inline def setPromise(value: js.Promise[R]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setReject(value: Any => Callback): Self = StObject.set(x, "reject", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setResolve(value: R => Callback): Self = StObject.set(x, "resolve", js.Any.fromFunction1((t0: R) => value(t0).runNow()))
    }
  }
}
