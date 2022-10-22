package typingsJapgolly.pQueue

import typingsJapgolly.eventemitter3.mod.^
import typingsJapgolly.pQueue.distOptionsMod.Options
import typingsJapgolly.pQueue.distOptionsMod.QueueAddOptions
import typingsJapgolly.pQueue.distOptionsMod.TaskOptions
import typingsJapgolly.pQueue.distQueueMod.Queue
import typingsJapgolly.pQueue.distQueueMod.RunFunction
import typingsJapgolly.std.Error
import typingsJapgolly.std.Partial
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-queue", JSImport.Default)
  @js.native
  open class default[QueueType /* <: Queue[RunFunction, EnqueueOptionsType] */, EnqueueOptionsType /* <: QueueAddOptions */] () extends PQueue[QueueType, EnqueueOptionsType] {
    def this(options: Options[QueueType, EnqueueOptionsType]) = this()
  }
  
  @JSImport("p-queue", "AbortError")
  @js.native
  open class AbortError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pQueue.pQueueStrings.active
    - typingsJapgolly.pQueue.pQueueStrings.idle
    - typingsJapgolly.pQueue.pQueueStrings.empty
    - typingsJapgolly.pQueue.pQueueStrings.add
    - typingsJapgolly.pQueue.pQueueStrings.next
    - typingsJapgolly.pQueue.pQueueStrings.completed
    - typingsJapgolly.pQueue.pQueueStrings.error
  */
  trait EventName extends StObject
  object EventName {
    
    inline def active: typingsJapgolly.pQueue.pQueueStrings.active = "active".asInstanceOf[typingsJapgolly.pQueue.pQueueStrings.active]
    
    inline def add: typingsJapgolly.pQueue.pQueueStrings.add = "add".asInstanceOf[typingsJapgolly.pQueue.pQueueStrings.add]
    
    inline def completed: typingsJapgolly.pQueue.pQueueStrings.completed = "completed".asInstanceOf[typingsJapgolly.pQueue.pQueueStrings.completed]
    
    inline def empty: typingsJapgolly.pQueue.pQueueStrings.empty = "empty".asInstanceOf[typingsJapgolly.pQueue.pQueueStrings.empty]
    
    inline def error: typingsJapgolly.pQueue.pQueueStrings.error = "error".asInstanceOf[typingsJapgolly.pQueue.pQueueStrings.error]
    
    inline def idle: typingsJapgolly.pQueue.pQueueStrings.idle = "idle".asInstanceOf[typingsJapgolly.pQueue.pQueueStrings.idle]
    
    inline def next: typingsJapgolly.pQueue.pQueueStrings.next = "next".asInstanceOf[typingsJapgolly.pQueue.pQueueStrings.next]
  }
  
  @js.native
  trait PQueue[QueueType /* <: Queue[RunFunction, EnqueueOptionsType] */, EnqueueOptionsType /* <: QueueAddOptions */] extends ^[EventName, Any] {
    
    /**
      Adds a sync or async task to the queue. Always returns a promise.
      */
    def add[TaskResultType](fn: Task[TaskResultType]): js.Promise[TaskResultType] = js.native
    def add[TaskResultType](fn: Task[TaskResultType], options: Partial[EnqueueOptionsType]): js.Promise[TaskResultType] = js.native
    
    /**
      Same as `.add()`, but accepts an array of sync or async functions.
      @returns A promise that resolves when all functions are resolved.
      */
    def addAll[TaskResultsType](functions: js.Array[Task[TaskResultsType]]): js.Promise[js.Array[TaskResultsType]] = js.native
    def addAll[TaskResultsType](functions: js.Array[Task[TaskResultsType]], options: EnqueueOptionsType): js.Promise[js.Array[TaskResultsType]] = js.native
    
    /**
      Clear the queue.
      */
    def clear(): Unit = js.native
    
    def concurrency: Double = js.native
    def concurrency_=(newConcurrency: Double): Unit = js.native
    
    /**
      Whether the queue is currently paused.
      */
    def isPaused: Boolean = js.native
    
    /**
      Can be called multiple times. Useful if you for example add additional items at a later time.
      @returns A promise that settles when the queue becomes empty.
      */
    def onEmpty(): js.Promise[Unit] = js.native
    
    /**
      The difference with `.onEmpty` is that `.onIdle` guarantees that all work from the queue has finished. `.onEmpty` merely signals that the queue is empty, but it could mean that some promises haven't completed yet.
      @returns A promise that settles when the queue becomes empty, and all promises have completed; `queue.size === 0 && queue.pending === 0`.
      */
    def onIdle(): js.Promise[Unit] = js.native
    
    /**
      @returns A promise that settles when the queue size is less than the given limit: `queue.size < limit`.
      If you want to avoid having the queue grow beyond a certain size you can `await queue.onSizeLessThan()` before adding a new item.
      Note that this only limits the number of items waiting to start. There could still be up to `concurrency` jobs already running that this call does not include in its calculation.
      */
    def onSizeLessThan(limit: Double): js.Promise[Unit] = js.native
    
    /**
      Put queue execution on hold.
      */
    def pause(): Unit = js.native
    
    /**
      Number of running items (no longer in the queue).
      */
    def pending: Double = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      Size of the queue, the number of queued items waiting to run.
      */
    def size: Double = js.native
    
    /**
      Size of the queue, filtered by the given options.
      For example, this can be used to find the number of items remaining in the queue with a specific priority level.
      */
    def sizeBy(options: Partial[EnqueueOptionsType]): Double = js.native
    
    /**
      Start (or resume) executing enqueued tasks within concurrency limit. No need to call this if queue is not paused (via `options.autoStart = false` or by `.pause()` method.)
      */
    def start(): this.type = js.native
    
    /**
      Per-operation timeout in milliseconds. Operations fulfill once `timeout` elapses if they haven't already.
      Applies to each future operation.
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  
  type Task[TaskResultType] = js.Function1[/* options */ TaskOptions, PromiseLike[TaskResultType] | TaskResultType]
}
