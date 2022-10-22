package typingsJapgolly.promiseQueue

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-queue", JSImport.Namespace)
  @js.native
  /**
    *
    * @param maxPendingPromises [Infinity] Number of promises that can run at once.
    * @param maxQueuedPromises [Infinity] Number of promises generators that can be in the queue at once.
    *                                     `add()` will return a rejected promise if this limit would be exceeded.
    * @param options [{}] See QueueOptions
    */
  open class ^ ()
    extends StObject
       with PromiseQueue {
    def this(maxPendingPromises: Double) = this()
    def this(maxPendingPromises: Double, maxQueuedPromises: Double) = this()
    def this(maxPendingPromises: Unit, maxQueuedPromises: Double) = this()
    def this(maxPendingPromises: Double, maxQueuedPromises: Double, options: QueueOptions) = this()
    def this(maxPendingPromises: Double, maxQueuedPromises: Unit, options: QueueOptions) = this()
    def this(maxPendingPromises: Unit, maxQueuedPromises: Double, options: QueueOptions) = this()
    def this(maxPendingPromises: Unit, maxQueuedPromises: Unit, options: QueueOptions) = this()
    
    /**
      * Enqueue a promise generator. When the number of running promises is less than `maxPendingPromises`,
      * this function will be called and the returned promise will be held as a running promise until it
      * rejects or resolves.
      *
      * @throws If the global `Promise` is undefined and `Queue.configure` hasn't been called.
      * @param promiseGenerator A function that returns a promise when called.
      * @returns A promise that forwards the resolution/rejection of the promise returned by `promiseGenerator`,
      *          or immediately rejects if `maxQueuedPromise` is exceeded.
      */
    /* CompleteClass */
    override def add[T](promiseGenerator: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    /**
      * Returns the number of promiseGenerators waiting in queue.
      */
    /* CompleteClass */
    override def getPendingLength(): Double = js.native
    
    /**
      * Returns the number of in-flight promises
      */
    /* CompleteClass */
    override def getQueueLength(): Double = js.native
  }
  @JSImport("promise-queue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Set which promise constructor to use for the value returned by PromiseQueue#add.
    * If this isn't called, the global `Promise` constructor is used.
    * @param GlobalPromise A constructor for Promises
    */
  /* static member */
  inline def configure(GlobalPromise: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(GlobalPromise.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait PromiseQueue extends StObject {
    
    /**
      * Enqueue a promise generator. When the number of running promises is less than `maxPendingPromises`,
      * this function will be called and the returned promise will be held as a running promise until it
      * rejects or resolves.
      *
      * @throws If the global `Promise` is undefined and `Queue.configure` hasn't been called.
      * @param promiseGenerator A function that returns a promise when called.
      * @returns A promise that forwards the resolution/rejection of the promise returned by `promiseGenerator`,
      *          or immediately rejects if `maxQueuedPromise` is exceeded.
      */
    def add[T](promiseGenerator: js.Function0[js.Promise[T]]): js.Promise[T]
    
    /**
      * Returns the number of promiseGenerators waiting in queue.
      */
    def getPendingLength(): Double
    
    /**
      * Returns the number of in-flight promises
      */
    def getQueueLength(): Double
  }
  object PromiseQueue {
    
    inline def apply(
      add: js.Function0[js.Promise[Any]] => js.Promise[Any],
      getPendingLength: CallbackTo[Double],
      getQueueLength: CallbackTo[Double]
    ): PromiseQueue = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getPendingLength = getPendingLength.toJsFn, getQueueLength = getQueueLength.toJsFn)
      __obj.asInstanceOf[PromiseQueue]
    }
    
    extension [Self <: PromiseQueue](x: Self) {
      
      inline def setAdd(value: js.Function0[js.Promise[Any]] => js.Promise[Any]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setGetPendingLength(value: CallbackTo[Double]): Self = StObject.set(x, "getPendingLength", value.toJsFn)
      
      inline def setGetQueueLength(value: CallbackTo[Double]): Self = StObject.set(x, "getQueueLength", value.toJsFn)
    }
  }
  
  trait QueueOptions extends StObject {
    
    /**
      * Callback that is called when the queue is empty and all pending promises have resolved
      */
    def onEmpty(): Unit
  }
  object QueueOptions {
    
    inline def apply(onEmpty: Callback): QueueOptions = {
      val __obj = js.Dynamic.literal(onEmpty = onEmpty.toJsFn)
      __obj.asInstanceOf[QueueOptions]
    }
    
    extension [Self <: QueueOptions](x: Self) {
      
      inline def setOnEmpty(value: Callback): Self = StObject.set(x, "onEmpty", value.toJsFn)
    }
  }
}
