package typingsJapgolly.svelte

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeInternalLoopMod {
  
  @JSImport("svelte/types/runtime/internal/loop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearLoops(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear_loops")().asInstanceOf[Unit]
  
  inline def loop(callback: TaskCallback): Task = ^.asInstanceOf[js.Dynamic].applyDynamic("loop")(callback.asInstanceOf[js.Any]).asInstanceOf[Task]
  
  trait Task extends StObject {
    
    def abort(): Unit
    
    var promise: js.Promise[Unit]
  }
  object Task {
    
    inline def apply(abort: Callback, promise: js.Promise[Unit]): Task = {
      val __obj = js.Dynamic.literal(abort = abort.toJsFn, promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
      
      inline def setPromise(value: js.Promise[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
  
  type TaskCallback = js.Function1[/* now */ Double, Boolean | Unit]
}
