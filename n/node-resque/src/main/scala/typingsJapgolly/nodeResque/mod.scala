package typingsJapgolly.nodeResque

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.nodeResque.anon.Args
import typingsJapgolly.nodeResque.anon.RTimestamp
import typingsJapgolly.nodeResque.nodeResqueStrings.cleanStuckWorker
import typingsJapgolly.nodeResque.nodeResqueStrings.cleaning_worker
import typingsJapgolly.nodeResque.nodeResqueStrings.end
import typingsJapgolly.nodeResque.nodeResqueStrings.error
import typingsJapgolly.nodeResque.nodeResqueStrings.failure
import typingsJapgolly.nodeResque.nodeResqueStrings.job
import typingsJapgolly.nodeResque.nodeResqueStrings.master
import typingsJapgolly.nodeResque.nodeResqueStrings.pause
import typingsJapgolly.nodeResque.nodeResqueStrings.ping
import typingsJapgolly.nodeResque.nodeResqueStrings.poll
import typingsJapgolly.nodeResque.nodeResqueStrings.reEnqueue
import typingsJapgolly.nodeResque.nodeResqueStrings.start
import typingsJapgolly.nodeResque.nodeResqueStrings.success
import typingsJapgolly.nodeResque.nodeResqueStrings.transferredJob
import typingsJapgolly.nodeResque.nodeResqueStrings.workingTimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-resque", "Connection")
  @js.native
  open class Connection protected () extends EventEmitter {
    def this(options: ConnectionOptions) = this()
    
    def connect(): js.Promise[Unit] = js.native
    
    def end(): js.Promise[Unit] = js.native
  }
  
  @JSImport("node-resque", "Queue")
  @js.native
  open class Queue protected () extends EventEmitter {
    def this(options: QueueOptions) = this()
    def this(options: QueueOptions, jobs: JobsHash) = this()
    
    def allDelayed(): js.Promise[js.Array[Double]] = js.native
    
    def allWorkingOn(): js.Promise[StringDictionary[WorkerStatus]] = js.native
    
    def cleanOldWorkers(age: Double): js.Promise[StringDictionary[ErrorPayload] | js.Object] = js.native
    
    def connect(): js.Promise[Unit] = js.native
    
    def del(queue: String, jobName: String): js.Promise[Double] = js.native
    def del(queue: String, jobName: String, args: js.Array[Any]): js.Promise[Double] = js.native
    def del(queue: String, jobName: String, args: js.Array[Any], count: Double): js.Promise[Double] = js.native
    def del(queue: String, jobName: String, args: Unit, count: Double): js.Promise[Double] = js.native
    
    def delDelayed(queue: String, jobName: String): js.Promise[js.Array[Double]] = js.native
    def delDelayed(queue: String, jobName: String, args: js.Array[Any]): js.Promise[js.Array[Double]] = js.native
    def delDelayed(queue: String, jobName: String, args: js.Array[Any], count: Double): js.Promise[js.Array[Double]] = js.native
    def delDelayed(queue: String, jobName: String, args: Unit, count: Double): js.Promise[js.Array[Double]] = js.native
    
    def delLock(lockName: String): js.Promise[Double] = js.native
    
    def delQueue(queue: String): js.Promise[Unit] = js.native
    
    def delayedAt(timestamp: Double): js.Promise[RTimestamp] = js.native
    
    def encode(queue: String, jobName: String): String = js.native
    def encode(queue: String, jobName: String, args: js.Array[Any]): String = js.native
    
    def end(): js.Promise[Unit] = js.native
    
    def enqueue(queue: String, jobName: String): js.Promise[Unit] = js.native
    def enqueue(queue: String, jobName: String, args: js.Array[Any]): js.Promise[Unit] = js.native
    
    def enqueueAt(timestamp: Double, queue: String, jobName: String): js.Promise[Unit] = js.native
    def enqueueAt(timestamp: Double, queue: String, jobName: String, args: js.Array[Any]): js.Promise[Unit] = js.native
    
    def enqueueIn(milliseconds: Double, queue: String, jobName: String): js.Promise[Unit] = js.native
    def enqueueIn(milliseconds: Double, queue: String, jobName: String, args: js.Array[Any]): js.Promise[Unit] = js.native
    
    def failed(start: Double, stop: Double): js.Promise[js.Array[ErrorPayload]] = js.native
    
    def failedCount(): js.Promise[Double] = js.native
    
    def forceCleanWorker(workerName: String): js.Promise[js.Array[ErrorPayload] | Unit] = js.native
    
    def length(queue: String): js.Promise[Double] = js.native
    
    def locks(): js.Promise[StringDictionary[String]] = js.native
    
    @JSName("on")
    def on_error(event: error, cb: js.Function2[/* error */ js.Error, /* queue */ String, Unit]): this.type = js.native
    
    @JSName("once")
    def once_error(event: error, cb: js.Function2[/* error */ js.Error, /* queue */ String, Unit]): this.type = js.native
    
    def queued(queue: String, start: Double, stop: Double): js.Promise[js.Array[Job[Any]]] = js.native
    
    def queues(): js.Promise[js.Array[String]] = js.native
    
    def removeFailed(failedJob: ErrorPayload): js.Promise[Unit] = js.native
    
    def retryAndRemoveFailed(failedJob: ErrorPayload): js.Promise[Unit] = js.native
    
    def scheduledAt(queue: String, jobName: String): js.Promise[js.Array[Double]] = js.native
    def scheduledAt(queue: String, jobName: String, args: js.Array[Any]): js.Promise[js.Array[Double]] = js.native
    
    def stats(): js.Promise[Any] = js.native
    
    def timestamps(): js.Promise[js.Array[Double]] = js.native
    
    def workers(): js.Promise[StringDictionary[String]] = js.native
    
    def workingOn(workerName: String, queues: js.Array[String]): js.Promise[WorkerStatus] = js.native
  }
  
  @JSImport("node-resque", "Scheduler")
  @js.native
  open class Scheduler protected () extends EventEmitter {
    def this(options: SchedulerOptions) = this()
    def this(options: SchedulerOptions, jobs: JobsHash) = this()
    
    def connect(): js.Promise[Unit] = js.native
    
    def end(): js.Promise[Unit] = js.native
    
    def on(event: start | end | poll | master, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_cleanStuckWorker(
      event: cleanStuckWorker,
      cb: js.Function3[/* workerName */ String, /* errorPayload */ ErrorPayload, /* delta */ Double, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.Function2[/* error */ js.Error, /* queue */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_transferredJob(event: transferredJob, cb: js.Function2[/* timestamp */ Double, /* job */ Job[Any], Unit]): this.type = js.native
    @JSName("on")
    def on_workingTimestamp(event: workingTimestamp, cb: js.Function1[/* timestamp */ Double, Unit]): this.type = js.native
    
    def once(event: start | end | poll | master, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_cleanStuckWorker(
      event: cleanStuckWorker,
      cb: js.Function3[/* workerName */ String, /* errorPayload */ ErrorPayload, /* delta */ Double, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_error(event: error, cb: js.Function2[/* error */ js.Error, /* queue */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_transferredJob(event: transferredJob, cb: js.Function2[/* timestamp */ Double, /* job */ Job[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_workingTimestamp(event: workingTimestamp, cb: js.Function1[/* timestamp */ Double, Unit]): this.type = js.native
    
    def removeAllListeners(event: SchedulerEvent): this.type = js.native
    
    def start(): js.Promise[Unit] = js.native
  }
  
  @JSImport("node-resque", "Worker")
  @js.native
  open class Worker protected () extends EventEmitter {
    def this(options: WorkerOptions) = this()
    def this(options: WorkerOptions, jobs: JobsHash) = this()
    
    def connect(): js.Promise[Unit] = js.native
    
    def end(): js.Promise[Unit] = js.native
    
    def on(event: start | end | pause, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_cleaningworker(event: cleaning_worker, cb: js.Function2[/* worker */ String, /* pid */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.Function3[/* error */ js.Error, /* queue */ String, /* job */ Job[Any], Unit]): this.type = js.native
    @JSName("on")
    def on_failure(event: failure, cb: js.Function3[/* queue */ String, /* job */ Job[Any], /* failure */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_job(event: job, cb: js.Function2[/* queue */ String, /* job */ Job[Any], Unit]): this.type = js.native
    @JSName("on")
    def on_ping(event: ping, cb: js.Function1[/* time */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_poll(event: poll, cb: js.Function1[/* queue */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_reEnqueue(
      event: reEnqueue,
      cb: js.Function3[/* queue */ String, /* job */ Job[Any], /* plugin */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_success(event: success, cb: js.Function3[/* queue */ String, /* job */ Job[Any], /* result */ Any, Unit]): this.type = js.native
    
    def once(event: start | end | pause, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_cleaningworker(event: cleaning_worker, cb: js.Function2[/* worker */ String, /* pid */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, cb: js.Function3[/* error */ js.Error, /* queue */ String, /* job */ Job[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_failure(event: failure, cb: js.Function3[/* queue */ String, /* job */ Job[Any], /* failure */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_job(event: job, cb: js.Function2[/* queue */ String, /* job */ Job[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_ping(event: ping, cb: js.Function1[/* time */ Double, Unit]): this.type = js.native
    @JSName("once")
    def once_poll(event: poll, cb: js.Function1[/* queue */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_reEnqueue(
      event: reEnqueue,
      cb: js.Function3[/* queue */ String, /* job */ Job[Any], /* plugin */ String, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_success(event: success, cb: js.Function3[/* queue */ String, /* job */ Job[Any], /* result */ Any, Unit]): this.type = js.native
    
    def removeAllListeners(event: WorkerEvent): this.type = js.native
    
    def start(): js.Promise[Unit] = js.native
  }
  
  trait ConnectionOptions extends StObject {
    
    var database: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var looping: js.UndefOr[Boolean] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[Any] = js.undefined
    
    var pkg: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var redis: js.UndefOr[Any] = js.undefined
  }
  object ConnectionOptions {
    
    inline def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    extension [Self <: ConnectionOptions](x: Self) {
      
      inline def setDatabase(value: Double): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLooping(value: Boolean): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
      
      inline def setLoopingUndefined: Self = StObject.set(x, "looping", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRedis(value: Any): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      
      inline def setRedisUndefined: Self = StObject.set(x, "redis", js.undefined)
    }
  }
  
  trait ErrorPayload extends StObject {
    
    var backtrace: js.Array[String] | Null
    
    var error: String
    
    var exception: String
    
    var failed_at: String
    
    var payload: Any
    
    var queue: String
    
    var worker: String
  }
  object ErrorPayload {
    
    inline def apply(error: String, exception: String, failed_at: String, payload: Any, queue: String, worker: String): ErrorPayload = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], failed_at = failed_at.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any], backtrace = null)
      __obj.asInstanceOf[ErrorPayload]
    }
    
    extension [Self <: ErrorPayload](x: Self) {
      
      inline def setBacktrace(value: js.Array[String]): Self = StObject.set(x, "backtrace", value.asInstanceOf[js.Any])
      
      inline def setBacktraceNull: Self = StObject.set(x, "backtrace", null)
      
      inline def setBacktraceVarargs(value: String*): Self = StObject.set(x, "backtrace", js.Array(value*))
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      inline def setFailed_at(value: String): Self = StObject.set(x, "failed_at", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    }
  }
  
  trait Job[TResult] extends StObject {
    
    def perform(args: Any*): js.Promise[TResult]
    
    var pluginOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var plugins: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Job {
    
    inline def apply[TResult](perform: /* repeated */ Any => js.Promise[TResult]): Job[TResult] = {
      val __obj = js.Dynamic.literal(perform = js.Any.fromFunction1(perform))
      __obj.asInstanceOf[Job[TResult]]
    }
    
    extension [Self <: Job[?], TResult](x: Self & Job[TResult]) {
      
      inline def setPerform(value: /* repeated */ Any => js.Promise[TResult]): Self = StObject.set(x, "perform", js.Any.fromFunction1(value))
      
      inline def setPluginOptions(value: StringDictionary[Any]): Self = StObject.set(x, "pluginOptions", value.asInstanceOf[js.Any])
      
      inline def setPluginOptionsUndefined: Self = StObject.set(x, "pluginOptions", js.undefined)
      
      inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  type JobsHash = StringDictionary[Job[Any]]
  
  trait QueueOptions extends StObject {
    
    var connection: js.UndefOr[ConnectionOptions] = js.undefined
  }
  object QueueOptions {
    
    inline def apply(): QueueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueOptions]
    }
    
    extension [Self <: QueueOptions](x: Self) {
      
      inline def setConnection(value: ConnectionOptions): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeResque.nodeResqueStrings.start
    - typingsJapgolly.nodeResque.nodeResqueStrings.end
    - typingsJapgolly.nodeResque.nodeResqueStrings.poll
    - typingsJapgolly.nodeResque.nodeResqueStrings.master
    - typingsJapgolly.nodeResque.nodeResqueStrings.cleanStuckWorker
    - typingsJapgolly.nodeResque.nodeResqueStrings.error
    - typingsJapgolly.nodeResque.nodeResqueStrings.workingTimestamp
    - typingsJapgolly.nodeResque.nodeResqueStrings.transferredJob
  */
  trait SchedulerEvent extends StObject
  object SchedulerEvent {
    
    inline def cleanStuckWorker: typingsJapgolly.nodeResque.nodeResqueStrings.cleanStuckWorker = "cleanStuckWorker".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.cleanStuckWorker]
    
    inline def end: typingsJapgolly.nodeResque.nodeResqueStrings.end = "end".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.end]
    
    inline def error: typingsJapgolly.nodeResque.nodeResqueStrings.error = "error".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.error]
    
    inline def master: typingsJapgolly.nodeResque.nodeResqueStrings.master = "master".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.master]
    
    inline def poll: typingsJapgolly.nodeResque.nodeResqueStrings.poll = "poll".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.poll]
    
    inline def start: typingsJapgolly.nodeResque.nodeResqueStrings.start = "start".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.start]
    
    inline def transferredJob: typingsJapgolly.nodeResque.nodeResqueStrings.transferredJob = "transferredJob".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.transferredJob]
    
    inline def workingTimestamp: typingsJapgolly.nodeResque.nodeResqueStrings.workingTimestamp = "workingTimestamp".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.workingTimestamp]
  }
  
  trait SchedulerOptions extends StObject {
    
    var connection: js.UndefOr[ConnectionOptions] = js.undefined
    
    var masterLockTimeout: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var stuckWorkerTimeout: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object SchedulerOptions {
    
    inline def apply(): SchedulerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchedulerOptions]
    }
    
    extension [Self <: SchedulerOptions](x: Self) {
      
      inline def setConnection(value: ConnectionOptions): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setMasterLockTimeout(value: Double): Self = StObject.set(x, "masterLockTimeout", value.asInstanceOf[js.Any])
      
      inline def setMasterLockTimeoutUndefined: Self = StObject.set(x, "masterLockTimeout", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStuckWorkerTimeout(value: Double): Self = StObject.set(x, "stuckWorkerTimeout", value.asInstanceOf[js.Any])
      
      inline def setStuckWorkerTimeoutUndefined: Self = StObject.set(x, "stuckWorkerTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeResque.nodeResqueStrings.start
    - typingsJapgolly.nodeResque.nodeResqueStrings.end
    - typingsJapgolly.nodeResque.nodeResqueStrings.cleaning_worker
    - typingsJapgolly.nodeResque.nodeResqueStrings.poll
    - typingsJapgolly.nodeResque.nodeResqueStrings.ping
    - typingsJapgolly.nodeResque.nodeResqueStrings.job
    - typingsJapgolly.nodeResque.nodeResqueStrings.reEnqueue
    - typingsJapgolly.nodeResque.nodeResqueStrings.success
    - typingsJapgolly.nodeResque.nodeResqueStrings.failure
    - typingsJapgolly.nodeResque.nodeResqueStrings.error
    - typingsJapgolly.nodeResque.nodeResqueStrings.pause
  */
  trait WorkerEvent extends StObject
  object WorkerEvent {
    
    inline def cleaning_worker: typingsJapgolly.nodeResque.nodeResqueStrings.cleaning_worker = "cleaning_worker".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.cleaning_worker]
    
    inline def end: typingsJapgolly.nodeResque.nodeResqueStrings.end = "end".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.end]
    
    inline def error: typingsJapgolly.nodeResque.nodeResqueStrings.error = "error".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.error]
    
    inline def failure: typingsJapgolly.nodeResque.nodeResqueStrings.failure = "failure".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.failure]
    
    inline def job: typingsJapgolly.nodeResque.nodeResqueStrings.job = "job".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.job]
    
    inline def pause: typingsJapgolly.nodeResque.nodeResqueStrings.pause = "pause".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.pause]
    
    inline def ping: typingsJapgolly.nodeResque.nodeResqueStrings.ping = "ping".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.ping]
    
    inline def poll: typingsJapgolly.nodeResque.nodeResqueStrings.poll = "poll".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.poll]
    
    inline def reEnqueue: typingsJapgolly.nodeResque.nodeResqueStrings.reEnqueue = "reEnqueue".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.reEnqueue]
    
    inline def start: typingsJapgolly.nodeResque.nodeResqueStrings.start = "start".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.start]
    
    inline def success: typingsJapgolly.nodeResque.nodeResqueStrings.success = "success".asInstanceOf[typingsJapgolly.nodeResque.nodeResqueStrings.success]
  }
  
  trait WorkerOptions extends StObject {
    
    var connection: js.UndefOr[ConnectionOptions] = js.undefined
    
    var looping: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var queues: js.Array[String]
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object WorkerOptions {
    
    inline def apply(queues: js.Array[String]): WorkerOptions = {
      val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerOptions]
    }
    
    extension [Self <: WorkerOptions](x: Self) {
      
      inline def setConnection(value: ConnectionOptions): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setLooping(value: Boolean): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
      
      inline def setLoopingUndefined: Self = StObject.set(x, "looping", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setQueues(value: js.Array[String]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
      
      inline def setQueuesVarargs(value: String*): Self = StObject.set(x, "queues", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait WorkerStatus extends StObject {
    
    var payload: Args
    
    var queue: String
    
    var run_at: String
    
    var worker: String
  }
  object WorkerStatus {
    
    inline def apply(payload: Args, queue: String, run_at: String, worker: String): WorkerStatus = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], run_at = run_at.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerStatus]
    }
    
    extension [Self <: WorkerStatus](x: Self) {
      
      inline def setPayload(value: Args): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setRun_at(value: String): Self = StObject.set(x, "run_at", value.asInstanceOf[js.Any])
      
      inline def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    }
  }
}
