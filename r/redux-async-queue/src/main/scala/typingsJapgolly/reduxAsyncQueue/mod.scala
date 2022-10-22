package typingsJapgolly.reduxAsyncQueue

import japgolly.scalajs.react.Callback
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-async-queue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[/* next */ js.Function1[/* action */ AnyAction, Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* next */ js.Function1[/* action */ AnyAction, Any], Any]]
  
  trait AsyncQueueAction[T /* <: Action[Any] */] extends StObject {
    
    def callback(next: js.Function0[Unit], dispatch: Dispatch[T]): Unit
    
    var queue: String
  }
  object AsyncQueueAction {
    
    inline def apply[T /* <: Action[Any] */](callback: (js.Function0[Unit], Dispatch[T]) => Callback, queue: String): AsyncQueueAction[T] = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2((t0: js.Function0[Unit], t1: Dispatch[T]) => (callback(t0, t1)).runNow()), queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncQueueAction[T]]
    }
    
    extension [Self <: AsyncQueueAction[?], T /* <: Action[Any] */](x: Self & AsyncQueueAction[T]) {
      
      inline def setCallback(value: (js.Function0[Unit], Dispatch[T]) => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: js.Function0[Unit], t1: Dispatch[T]) => (value(t0, t1)).runNow()))
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
}
