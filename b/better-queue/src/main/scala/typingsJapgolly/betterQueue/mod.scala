package typingsJapgolly.betterQueue

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.betterQueue.betterQueueStrings.task_failed
import typingsJapgolly.betterQueue.betterQueueStrings.task_finish
import typingsJapgolly.betterQueue.betterQueueStrings.task_progress
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.eventsMod.EventEmitterOptions
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("better-queue", JSImport.Namespace)
  @js.native
  open class ^[T, K] protected () extends BetterQueue[T, K] {
    def this(options: QueueOptions[T, K]) = this()
    def this(process: ProcessFunction[T, K]) = this()
    def this(process: ProcessFunction[T, K], options: Partial[QueueOptions[T, K]]) = this()
  }
  
  @JSImport("better-queue", "Ticket")
  @js.native
  open class Ticket () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def on(event: TicketEvent, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  }
  
  @js.native
  trait BetterQueue[T, K] extends EventEmitter {
    
    def cancel(taskId: Any): Unit = js.native
    def cancel(taskId: Any, cb: js.Function0[Unit]): Unit = js.native
    
    def destroy(cb: js.Function0[Unit]): Unit = js.native
    
    def getStats(): QueueStats = js.native
    
    def on(event: QueueEvent, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_taskfailed(event: task_failed, listener: js.Function2[/* taskId */ Any, /* errorMessage */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_taskfinish(event: task_finish, listener: js.Function2[/* taskId */ Any, /* result */ K, Unit]): this.type = js.native
    @JSName("on")
    def on_taskprogress(
      event: task_progress,
      listener: js.Function3[/* taskId */ Any, /* completed */ Double, /* total */ Double, Unit]
    ): this.type = js.native
    
    def pause(): Unit = js.native
    
    def push(task: T): Ticket = js.native
    def push(task: T, cb: js.Function2[/* err */ Any, /* result */ K, Unit]): Ticket = js.native
    
    def resetStats(): Unit = js.native
    
    def resume(): Unit = js.native
    
    def use(store: Store[T]): Unit = js.native
  }
  
  // TODO reflect task types somehow (task: T | T[])
  type ProcessFunction[T, K] = js.Function2[/* task */ Any, /* cb */ ProcessFunctionCb[K], Unit]
  
  type ProcessFunctionCb[K] = js.Function2[/* error */ js.UndefOr[Any], /* result */ js.UndefOr[K], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.betterQueue.betterQueueStrings.task_queued
    - typingsJapgolly.betterQueue.betterQueueStrings.task_accepted
    - typingsJapgolly.betterQueue.betterQueueStrings.task_started
    - typingsJapgolly.betterQueue.betterQueueStrings.task_finish
    - typingsJapgolly.betterQueue.betterQueueStrings.task_failed
    - typingsJapgolly.betterQueue.betterQueueStrings.task_progress
    - typingsJapgolly.betterQueue.betterQueueStrings.batch_finish
    - typingsJapgolly.betterQueue.betterQueueStrings.batch_failed
    - typingsJapgolly.betterQueue.betterQueueStrings.batch_progress
    - typingsJapgolly.betterQueue.betterQueueStrings.drain
    - typingsJapgolly.betterQueue.betterQueueStrings.empty
    - typingsJapgolly.betterQueue.betterQueueStrings.error
  */
  trait QueueEvent extends StObject
  object QueueEvent {
    
    inline def batch_failed: typingsJapgolly.betterQueue.betterQueueStrings.batch_failed = "batch_failed".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.batch_failed]
    
    inline def batch_finish: typingsJapgolly.betterQueue.betterQueueStrings.batch_finish = "batch_finish".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.batch_finish]
    
    inline def batch_progress: typingsJapgolly.betterQueue.betterQueueStrings.batch_progress = "batch_progress".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.batch_progress]
    
    inline def drain: typingsJapgolly.betterQueue.betterQueueStrings.drain = "drain".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.drain]
    
    inline def empty: typingsJapgolly.betterQueue.betterQueueStrings.empty = "empty".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.empty]
    
    inline def error: typingsJapgolly.betterQueue.betterQueueStrings.error = "error".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.error]
    
    inline def task_accepted: typingsJapgolly.betterQueue.betterQueueStrings.task_accepted = "task_accepted".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.task_accepted]
    
    inline def task_failed: typingsJapgolly.betterQueue.betterQueueStrings.task_failed = "task_failed".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.task_failed]
    
    inline def task_finish: typingsJapgolly.betterQueue.betterQueueStrings.task_finish = "task_finish".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.task_finish]
    
    inline def task_progress: typingsJapgolly.betterQueue.betterQueueStrings.task_progress = "task_progress".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.task_progress]
    
    inline def task_queued: typingsJapgolly.betterQueue.betterQueueStrings.task_queued = "task_queued".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.task_queued]
    
    inline def task_started: typingsJapgolly.betterQueue.betterQueueStrings.task_started = "task_started".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.task_started]
  }
  
  trait QueueOptions[T, K] extends StObject {
    
    var afterProcessDelay: js.UndefOr[Double] = js.undefined
    
    var autoResume: js.UndefOr[Boolean] = js.undefined
    
    var batchDelay: js.UndefOr[Double] = js.undefined
    
    var batchDelayTimeout: js.UndefOr[Double] = js.undefined
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var cancelIfRunning: js.UndefOr[Boolean] = js.undefined
    
    var concurrent: js.UndefOr[Double] = js.undefined
    
    var failTaskOnProcessException: js.UndefOr[Boolean] = js.undefined
    
    var filo: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[
        js.Function2[/* task */ T, /* cb */ js.Function2[/* error */ Any, /* task */ T, Unit], Unit]
      ] = js.undefined
    
    var id: js.UndefOr[
        (/* keyof T */ String) | (js.Function2[
          /* task */ T, 
          /* cb */ js.Function2[/* error */ Any, /* keyof T */ /* id */ String, Unit], 
          Unit
        ])
      ] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var maxTimeout: js.UndefOr[Double] = js.undefined
    
    var merge: js.UndefOr[
        js.Function3[
          /* oldTask */ T, 
          /* newTask */ T, 
          /* cb */ js.Function2[/* error */ Any, /* mergedTask */ T, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var precondition: js.UndefOr[
        js.Function1[/* cb */ js.Function2[/* error */ Any, /* passOrFail */ Boolean, Unit], Unit]
      ] = js.undefined
    
    var preconditionRetryTimeout: js.UndefOr[Double] = js.undefined
    
    var priority: js.UndefOr[
        js.Function2[
          /* task */ T, 
          /* cb */ js.Function2[/* error */ Any, /* priority */ Double, Unit], 
          Unit
        ]
      ] = js.undefined
    
    def process(task: Any, cb: ProcessFunctionCb[K]): Unit
    @JSName("process")
    var process_Original: ProcessFunction[T, K]
    
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    var store: js.UndefOr[String | StoreOptions | Store[T]] = js.undefined
    
    var storeMaxRetries: js.UndefOr[Double] = js.undefined
    
    var storeRetryTimeout: js.UndefOr[Double] = js.undefined
  }
  object QueueOptions {
    
    inline def apply[T, K](process: (/* task */ Any, /* cb */ ProcessFunctionCb[K]) => Callback): QueueOptions[T, K] = {
      val __obj = js.Dynamic.literal(process = js.Any.fromFunction2((t0: /* task */ Any, t1: /* cb */ ProcessFunctionCb[K]) => (process(t0, t1)).runNow()))
      __obj.asInstanceOf[QueueOptions[T, K]]
    }
    
    extension [Self <: QueueOptions[?, ?], T, K](x: Self & (QueueOptions[T, K])) {
      
      inline def setAfterProcessDelay(value: Double): Self = StObject.set(x, "afterProcessDelay", value.asInstanceOf[js.Any])
      
      inline def setAfterProcessDelayUndefined: Self = StObject.set(x, "afterProcessDelay", js.undefined)
      
      inline def setAutoResume(value: Boolean): Self = StObject.set(x, "autoResume", value.asInstanceOf[js.Any])
      
      inline def setAutoResumeUndefined: Self = StObject.set(x, "autoResume", js.undefined)
      
      inline def setBatchDelay(value: Double): Self = StObject.set(x, "batchDelay", value.asInstanceOf[js.Any])
      
      inline def setBatchDelayTimeout(value: Double): Self = StObject.set(x, "batchDelayTimeout", value.asInstanceOf[js.Any])
      
      inline def setBatchDelayTimeoutUndefined: Self = StObject.set(x, "batchDelayTimeout", js.undefined)
      
      inline def setBatchDelayUndefined: Self = StObject.set(x, "batchDelay", js.undefined)
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setCancelIfRunning(value: Boolean): Self = StObject.set(x, "cancelIfRunning", value.asInstanceOf[js.Any])
      
      inline def setCancelIfRunningUndefined: Self = StObject.set(x, "cancelIfRunning", js.undefined)
      
      inline def setConcurrent(value: Double): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
      
      inline def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
      
      inline def setFailTaskOnProcessException(value: Boolean): Self = StObject.set(x, "failTaskOnProcessException", value.asInstanceOf[js.Any])
      
      inline def setFailTaskOnProcessExceptionUndefined: Self = StObject.set(x, "failTaskOnProcessException", js.undefined)
      
      inline def setFilo(value: Boolean): Self = StObject.set(x, "filo", value.asInstanceOf[js.Any])
      
      inline def setFiloUndefined: Self = StObject.set(x, "filo", js.undefined)
      
      inline def setFilter(value: (/* task */ T, /* cb */ js.Function2[/* error */ Any, /* task */ T, Unit]) => Callback): Self = StObject.set(x, "filter", js.Any.fromFunction2((t0: /* task */ T, t1: /* cb */ js.Function2[/* error */ Any, /* task */ T, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setId(
        value: (/* keyof T */ String) | (js.Function2[
              /* task */ T, 
              /* cb */ js.Function2[/* error */ Any, /* keyof T */ /* id */ String, Unit], 
              Unit
            ])
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdFunction2(
        value: (/* task */ T, /* cb */ js.Function2[/* error */ Any, /* keyof T */ /* id */ String, Unit]) => Callback
      ): Self = StObject.set(x, "id", js.Any.fromFunction2((t0: /* task */ T, t1: /* cb */ js.Function2[/* error */ Any, /* keyof T */ /* id */ String, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setMaxTimeout(value: Double): Self = StObject.set(x, "maxTimeout", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeoutUndefined: Self = StObject.set(x, "maxTimeout", js.undefined)
      
      inline def setMerge(
        value: (/* oldTask */ T, /* newTask */ T, /* cb */ js.Function2[/* error */ Any, /* mergedTask */ T, Unit]) => Callback
      ): Self = StObject.set(x, "merge", js.Any.fromFunction3((t0: /* oldTask */ T, t1: /* newTask */ T, t2: /* cb */ js.Function2[/* error */ Any, /* mergedTask */ T, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      inline def setPrecondition(value: /* cb */ js.Function2[/* error */ Any, /* passOrFail */ Boolean, Unit] => Callback): Self = StObject.set(x, "precondition", js.Any.fromFunction1((t0: /* cb */ js.Function2[/* error */ Any, /* passOrFail */ Boolean, Unit]) => value(t0).runNow()))
      
      inline def setPreconditionRetryTimeout(value: Double): Self = StObject.set(x, "preconditionRetryTimeout", value.asInstanceOf[js.Any])
      
      inline def setPreconditionRetryTimeoutUndefined: Self = StObject.set(x, "preconditionRetryTimeout", js.undefined)
      
      inline def setPreconditionUndefined: Self = StObject.set(x, "precondition", js.undefined)
      
      inline def setPriority(
        value: (/* task */ T, /* cb */ js.Function2[/* error */ Any, /* priority */ Double, Unit]) => Callback
      ): Self = StObject.set(x, "priority", js.Any.fromFunction2((t0: /* task */ T, t1: /* cb */ js.Function2[/* error */ Any, /* priority */ Double, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setProcess(value: (/* task */ Any, /* cb */ ProcessFunctionCb[K]) => Callback): Self = StObject.set(x, "process", js.Any.fromFunction2((t0: /* task */ Any, t1: /* cb */ ProcessFunctionCb[K]) => (value(t0, t1)).runNow()))
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setStore(value: String | StoreOptions | Store[T]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreMaxRetries(value: Double): Self = StObject.set(x, "storeMaxRetries", value.asInstanceOf[js.Any])
      
      inline def setStoreMaxRetriesUndefined: Self = StObject.set(x, "storeMaxRetries", js.undefined)
      
      inline def setStoreRetryTimeout(value: Double): Self = StObject.set(x, "storeRetryTimeout", value.asInstanceOf[js.Any])
      
      inline def setStoreRetryTimeoutUndefined: Self = StObject.set(x, "storeRetryTimeout", js.undefined)
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  trait QueueStats extends StObject {
    
    var average: Double
    
    var peak: Double
    
    var successRate: Double
    
    var total: Double
  }
  object QueueStats {
    
    inline def apply(average: Double, peak: Double, successRate: Double, total: Double): QueueStats = {
      val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], peak = peak.asInstanceOf[js.Any], successRate = successRate.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueStats]
    }
    
    extension [Self <: QueueStats](x: Self) {
      
      inline def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
      
      inline def setPeak(value: Double): Self = StObject.set(x, "peak", value.asInstanceOf[js.Any])
      
      inline def setSuccessRate(value: Double): Self = StObject.set(x, "successRate", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Store[T] extends StObject {
    
    def connect(cb: js.Function2[/* error */ Any, /* length */ Double, Unit]): Unit
    
    def deleteTask(taskId: Any, cb: js.Function0[Unit]): Unit
    
    def getLock(lockId: String, cb: js.Function2[/* error */ Any, /* tasks */ StringDictionary[T], Unit]): Unit
    
    def getTask(taskId: Any, cb: js.Function2[/* error */ Any, /* task */ T, Unit]): Unit
    
    def putTask(taskId: Any, task: T, priority: Double, cb: js.Function1[/* error */ Any, Unit]): Unit
    
    def releaseLock(lockId: String, cb: js.Function1[/* error */ Any, Unit]): Unit
    
    def takeFirstN(n: Double, cb: js.Function2[/* error */ Any, /* lockId */ String, Unit]): Unit
    
    def takeLastN(n: Double, cb: js.Function2[/* error */ Any, /* lockId */ String, Unit]): Unit
  }
  object Store {
    
    inline def apply[T](
      connect: js.Function2[/* error */ Any, /* length */ Double, Unit] => Callback,
      deleteTask: (Any, js.Function0[Unit]) => Callback,
      getLock: (String, js.Function2[/* error */ Any, /* tasks */ StringDictionary[T], Unit]) => Callback,
      getTask: (Any, js.Function2[/* error */ Any, /* task */ T, Unit]) => Callback,
      putTask: (Any, T, Double, js.Function1[/* error */ Any, Unit]) => Callback,
      releaseLock: (String, js.Function1[/* error */ Any, Unit]) => Callback,
      takeFirstN: (Double, js.Function2[/* error */ Any, /* lockId */ String, Unit]) => Callback,
      takeLastN: (Double, js.Function2[/* error */ Any, /* lockId */ String, Unit]) => Callback
    ): Store[T] = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1((t0: js.Function2[/* error */ Any, /* length */ Double, Unit]) => connect(t0).runNow()), deleteTask = js.Any.fromFunction2((t0: Any, t1: js.Function0[Unit]) => (deleteTask(t0, t1)).runNow()), getLock = js.Any.fromFunction2((t0: String, t1: js.Function2[/* error */ Any, /* tasks */ StringDictionary[T], Unit]) => (getLock(t0, t1)).runNow()), getTask = js.Any.fromFunction2((t0: Any, t1: js.Function2[/* error */ Any, /* task */ T, Unit]) => (getTask(t0, t1)).runNow()), putTask = js.Any.fromFunction4((t0: Any, t1: T, t2: Double, t3: js.Function1[/* error */ Any, Unit]) => (putTask(t0, t1, t2, t3)).runNow()), releaseLock = js.Any.fromFunction2((t0: String, t1: js.Function1[/* error */ Any, Unit]) => (releaseLock(t0, t1)).runNow()), takeFirstN = js.Any.fromFunction2((t0: Double, t1: js.Function2[/* error */ Any, /* lockId */ String, Unit]) => (takeFirstN(t0, t1)).runNow()), takeLastN = js.Any.fromFunction2((t0: Double, t1: js.Function2[/* error */ Any, /* lockId */ String, Unit]) => (takeLastN(t0, t1)).runNow()))
      __obj.asInstanceOf[Store[T]]
    }
    
    extension [Self <: Store[?], T](x: Self & Store[T]) {
      
      inline def setConnect(value: js.Function2[/* error */ Any, /* length */ Double, Unit] => Callback): Self = StObject.set(x, "connect", js.Any.fromFunction1((t0: js.Function2[/* error */ Any, /* length */ Double, Unit]) => value(t0).runNow()))
      
      inline def setDeleteTask(value: (Any, js.Function0[Unit]) => Callback): Self = StObject.set(x, "deleteTask", js.Any.fromFunction2((t0: Any, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setGetLock(value: (String, js.Function2[/* error */ Any, /* tasks */ StringDictionary[T], Unit]) => Callback): Self = StObject.set(x, "getLock", js.Any.fromFunction2((t0: String, t1: js.Function2[/* error */ Any, /* tasks */ StringDictionary[T], Unit]) => (value(t0, t1)).runNow()))
      
      inline def setGetTask(value: (Any, js.Function2[/* error */ Any, /* task */ T, Unit]) => Callback): Self = StObject.set(x, "getTask", js.Any.fromFunction2((t0: Any, t1: js.Function2[/* error */ Any, /* task */ T, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setPutTask(value: (Any, T, Double, js.Function1[/* error */ Any, Unit]) => Callback): Self = StObject.set(x, "putTask", js.Any.fromFunction4((t0: Any, t1: T, t2: Double, t3: js.Function1[/* error */ Any, Unit]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setReleaseLock(value: (String, js.Function1[/* error */ Any, Unit]) => Callback): Self = StObject.set(x, "releaseLock", js.Any.fromFunction2((t0: String, t1: js.Function1[/* error */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setTakeFirstN(value: (Double, js.Function2[/* error */ Any, /* lockId */ String, Unit]) => Callback): Self = StObject.set(x, "takeFirstN", js.Any.fromFunction2((t0: Double, t1: js.Function2[/* error */ Any, /* lockId */ String, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setTakeLastN(value: (Double, js.Function2[/* error */ Any, /* lockId */ String, Unit]) => Callback): Self = StObject.set(x, "takeLastN", js.Any.fromFunction2((t0: Double, t1: js.Function2[/* error */ Any, /* lockId */ String, Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait StoreOptions
    extends StObject
       with // store-specific options
  /* key */ StringDictionary[Any] {
    
    var `type`: String
  }
  object StoreOptions {
    
    inline def apply(`type`: String): StoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreOptions]
    }
    
    extension [Self <: StoreOptions](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TickerProgress extends StObject {
    
    var complete: Double
    
    var eta: String
    
    var message: String
    
    var pct: Double
    
    var total: Double
  }
  object TickerProgress {
    
    inline def apply(complete: Double, eta: String, message: String, pct: Double, total: Double): TickerProgress = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pct = pct.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[TickerProgress]
    }
    
    extension [Self <: TickerProgress](x: Self) {
      
      inline def setComplete(value: Double): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setEta(value: String): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPct(value: Double): Self = StObject.set(x, "pct", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.betterQueue.betterQueueStrings.accept
    - typingsJapgolly.betterQueue.betterQueueStrings.queued
    - typingsJapgolly.betterQueue.betterQueueStrings.started
    - typingsJapgolly.betterQueue.betterQueueStrings.progress
    - typingsJapgolly.betterQueue.betterQueueStrings.finish
    - typingsJapgolly.betterQueue.betterQueueStrings.failed
    - typingsJapgolly.betterQueue.betterQueueStrings.error
  */
  trait TicketEvent extends StObject
  object TicketEvent {
    
    inline def accept: typingsJapgolly.betterQueue.betterQueueStrings.accept = "accept".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.accept]
    
    inline def error: typingsJapgolly.betterQueue.betterQueueStrings.error = "error".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.error]
    
    inline def failed: typingsJapgolly.betterQueue.betterQueueStrings.failed = "failed".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.failed]
    
    inline def finish: typingsJapgolly.betterQueue.betterQueueStrings.finish = "finish".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.finish]
    
    inline def progress: typingsJapgolly.betterQueue.betterQueueStrings.progress = "progress".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.progress]
    
    inline def queued: typingsJapgolly.betterQueue.betterQueueStrings.queued = "queued".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.queued]
    
    inline def started: typingsJapgolly.betterQueue.betterQueueStrings.started = "started".asInstanceOf[typingsJapgolly.betterQueue.betterQueueStrings.started]
  }
}
