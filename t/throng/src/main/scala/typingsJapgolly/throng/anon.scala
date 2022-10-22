package typingsJapgolly.throng

import japgolly.scalajs.react.Callback
import typingsJapgolly.throng.mod.MasterCallback
import typingsJapgolly.throng.mod.Options
import typingsJapgolly.throng.mod.WorkerCallback
import typingsJapgolly.throng.mod.WorkerCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  start :throng.throng.WorkerCallback} & {  signals :std.Array<string> | undefined,   grace :number | undefined,   lifetime :number | undefined,   master :throng.throng.MasterCallback | undefined,   count :number | undefined,   workers :throng.throng.WorkerCount | undefined} */
  trait startWorkerCallbacksignal
    extends StObject
       with Options {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var grace: js.UndefOr[Double] = js.undefined
    
    var lifetime: js.UndefOr[Double] = js.undefined
    
    var master: js.UndefOr[MasterCallback] = js.undefined
    
    var signals: js.UndefOr[js.Array[String]] = js.undefined
    
    def start(id: Double, disconnect: js.Function0[Unit]): Unit
    @JSName("start")
    var start_Original: WorkerCallback
    
    var workers: js.UndefOr[WorkerCount] = js.undefined
  }
  object startWorkerCallbacksignal {
    
    inline def apply(start: (/* id */ Double, /* disconnect */ js.Function0[Unit]) => Callback): startWorkerCallbacksignal = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction2((t0: /* id */ Double, t1: /* disconnect */ js.Function0[Unit]) => (start(t0, t1)).runNow()))
      __obj.asInstanceOf[startWorkerCallbacksignal]
    }
    
    extension [Self <: startWorkerCallbacksignal](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setGrace(value: Double): Self = StObject.set(x, "grace", value.asInstanceOf[js.Any])
      
      inline def setGraceUndefined: Self = StObject.set(x, "grace", js.undefined)
      
      inline def setLifetime(value: Double): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
      
      inline def setMaster(value: Callback): Self = StObject.set(x, "master", value.toJsFn)
      
      inline def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
      
      inline def setSignals(value: js.Array[String]): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      inline def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      inline def setSignalsVarargs(value: String*): Self = StObject.set(x, "signals", js.Array(value*))
      
      inline def setStart(value: (/* id */ Double, /* disconnect */ js.Function0[Unit]) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: /* id */ Double, t1: /* disconnect */ js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setWorkers(value: WorkerCount): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  /* Inlined {  worker :throng.throng.WorkerCallback} & {  signals :std.Array<string> | undefined,   grace :number | undefined,   lifetime :number | undefined,   master :throng.throng.MasterCallback | undefined,   count :number | undefined,   workers :throng.throng.WorkerCount | undefined} */
  trait workerWorkerCallbacksigna
    extends StObject
       with Options {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var grace: js.UndefOr[Double] = js.undefined
    
    var lifetime: js.UndefOr[Double] = js.undefined
    
    var master: js.UndefOr[MasterCallback] = js.undefined
    
    var signals: js.UndefOr[js.Array[String]] = js.undefined
    
    def worker(id: Double, disconnect: js.Function0[Unit]): Unit
    @JSName("worker")
    var worker_Original: WorkerCallback
    
    var workers: js.UndefOr[WorkerCount] = js.undefined
  }
  object workerWorkerCallbacksigna {
    
    inline def apply(worker: (/* id */ Double, /* disconnect */ js.Function0[Unit]) => Callback): workerWorkerCallbacksigna = {
      val __obj = js.Dynamic.literal(worker = js.Any.fromFunction2((t0: /* id */ Double, t1: /* disconnect */ js.Function0[Unit]) => (worker(t0, t1)).runNow()))
      __obj.asInstanceOf[workerWorkerCallbacksigna]
    }
    
    extension [Self <: workerWorkerCallbacksigna](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setGrace(value: Double): Self = StObject.set(x, "grace", value.asInstanceOf[js.Any])
      
      inline def setGraceUndefined: Self = StObject.set(x, "grace", js.undefined)
      
      inline def setLifetime(value: Double): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
      
      inline def setMaster(value: Callback): Self = StObject.set(x, "master", value.toJsFn)
      
      inline def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
      
      inline def setSignals(value: js.Array[String]): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      inline def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      inline def setSignalsVarargs(value: String*): Self = StObject.set(x, "signals", js.Array(value*))
      
      inline def setWorker(value: (/* id */ Double, /* disconnect */ js.Function0[Unit]) => Callback): Self = StObject.set(x, "worker", js.Any.fromFunction2((t0: /* id */ Double, t1: /* disconnect */ js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setWorkers(value: WorkerCount): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
}
