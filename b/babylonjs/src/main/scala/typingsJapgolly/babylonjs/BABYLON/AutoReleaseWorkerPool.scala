package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoReleaseWorkerPool
  extends StObject
     with WorkerPool {
  
  /* private */ val _createWorkerAsync: Any
  
  /* private */ val _maxWorkers: Any
  
  /* private */ val _options: Any
}
object AutoReleaseWorkerPool {
  
  inline def apply(
    _createWorkerAsync: Any,
    _execute: (WorkerInfo, js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]) => Callback,
    _executeOnIdleWorker: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Boolean,
    _maxWorkers: Any,
    _options: Any,
    _pendingActions: js.Array[js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]],
    _workerInfos: js.Array[WorkerInfo],
    dispose: Callback,
    push: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Callback
  ): AutoReleaseWorkerPool = {
    val __obj = js.Dynamic.literal(_createWorkerAsync = _createWorkerAsync.asInstanceOf[js.Any], _execute = js.Any.fromFunction2((t0: WorkerInfo, t1: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]) => (_execute(t0, t1)).runNow()), _executeOnIdleWorker = js.Any.fromFunction1(_executeOnIdleWorker), _maxWorkers = _maxWorkers.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _pendingActions = _pendingActions.asInstanceOf[js.Any], _workerInfos = _workerInfos.asInstanceOf[js.Any], dispose = dispose.toJsFn, push = js.Any.fromFunction1((t0: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]) => push(t0).runNow()))
    __obj.asInstanceOf[AutoReleaseWorkerPool]
  }
  
  extension [Self <: AutoReleaseWorkerPool](x: Self) {
    
    inline def set_createWorkerAsync(value: Any): Self = StObject.set(x, "_createWorkerAsync", value.asInstanceOf[js.Any])
    
    inline def set_maxWorkers(value: Any): Self = StObject.set(x, "_maxWorkers", value.asInstanceOf[js.Any])
    
    inline def set_options(value: Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
  }
}
