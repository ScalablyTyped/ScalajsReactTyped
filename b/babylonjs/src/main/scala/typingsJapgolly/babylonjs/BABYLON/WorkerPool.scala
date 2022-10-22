package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerPool
  extends StObject
     with IDisposable {
  
  /* protected */ def _execute(
    workerInfo: WorkerInfo,
    action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]
  ): Unit
  
  /* protected */ def _executeOnIdleWorker(action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]): Boolean
  
  /* protected */ var _pendingActions: js.Array[js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]]
  
  /* protected */ var _workerInfos: js.Array[WorkerInfo]
  
  /**
    * Pushes an action to the worker pool. If all the workers are active, the action will be
    * pended until a worker has completed its action.
    * @param action The action to perform. Call onComplete when the action is complete.
    */
  def push(action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]): Unit
}
object WorkerPool {
  
  inline def apply(
    _execute: (WorkerInfo, js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]) => Callback,
    _executeOnIdleWorker: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Boolean,
    _pendingActions: js.Array[js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]],
    _workerInfos: js.Array[WorkerInfo],
    dispose: Callback,
    push: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Callback
  ): WorkerPool = {
    val __obj = js.Dynamic.literal(_execute = js.Any.fromFunction2((t0: WorkerInfo, t1: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]) => (_execute(t0, t1)).runNow()), _executeOnIdleWorker = js.Any.fromFunction1(_executeOnIdleWorker), _pendingActions = _pendingActions.asInstanceOf[js.Any], _workerInfos = _workerInfos.asInstanceOf[js.Any], dispose = dispose.toJsFn, push = js.Any.fromFunction1((t0: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]) => push(t0).runNow()))
    __obj.asInstanceOf[WorkerPool]
  }
  
  extension [Self <: WorkerPool](x: Self) {
    
    inline def setPush(value: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]) => value(t0).runNow()))
    
    inline def set_execute(
      value: (WorkerInfo, js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]) => Callback
    ): Self = StObject.set(x, "_execute", js.Any.fromFunction2((t0: WorkerInfo, t1: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]) => (value(t0, t1)).runNow()))
    
    inline def set_executeOnIdleWorker(value: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Boolean): Self = StObject.set(x, "_executeOnIdleWorker", js.Any.fromFunction1(value))
    
    inline def set_pendingActions(value: js.Array[js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]]): Self = StObject.set(x, "_pendingActions", value.asInstanceOf[js.Any])
    
    inline def set_pendingActionsVarargs(value: (js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit])*): Self = StObject.set(x, "_pendingActions", js.Array(value*))
    
    inline def set_workerInfos(value: js.Array[WorkerInfo]): Self = StObject.set(x, "_workerInfos", value.asInstanceOf[js.Any])
    
    inline def set_workerInfosVarargs(value: WorkerInfo*): Self = StObject.set(x, "_workerInfos", js.Array(value*))
  }
}
