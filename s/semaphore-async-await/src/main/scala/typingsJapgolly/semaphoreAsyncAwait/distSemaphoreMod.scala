package typingsJapgolly.semaphoreAsyncAwait

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSemaphoreMod {
  
  @JSImport("semaphore-async-await/dist/Semaphore", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Semaphore {
    /**
      * Creates a semaphore.
      * @param permits  The number of permits, i.e. things being allowed to run in parallel.
      * To create a lock that only lets one thing run at a time, set this to 1.
      * This number can also be negative.
      */
    def this(permits: Double) = this()
    
    /**
      * Alias for {@linkcode Semaphore.wait}.
      * @returns  A promise that gets resolved when execution is allowed to proceed.
      */
    /* CompleteClass */
    override def acquire(): js.Promise[Boolean] = js.native
    
    /**
      * Acquires all permits that are currently available and returns the number of acquired permits.
      * @returns  Number of acquired permits.
      */
    /* CompleteClass */
    override def drainPermits(): Double = js.native
    
    /**
      * Schedules func to be called once a permit becomes available.
      * Returns a promise that resolves to the return value of func.
      * @typeparam T  The return type of func.
      * @param func  The function to be executed.
      * @return  A promise that gets resolved with the return value of the function.
      */
    /* CompleteClass */
    override def execute[T](func: js.Function0[T | PromiseLike[T]]): js.Promise[T] = js.native
    
    /**
      * Returns the number of available permits.
      * @returns  The number of available permits.
      */
    /* CompleteClass */
    override def getPermits(): Double = js.native
    
    /* private */ /* CompleteClass */
    var permits: Any = js.native
    
    /* private */ /* CompleteClass */
    var promiseResolverQueue: Any = js.native
    
    /**
      * Alias for {@linkcode Semaphore.signal}.
      */
    /* CompleteClass */
    override def release(): Unit = js.native
    
    /**
      * Increases the number of permits by one. If there are other functions waiting, one of them will
      * continue to execute in a future iteration of the event loop.
      */
    /* CompleteClass */
    override def signal(): Unit = js.native
    
    /**
      * Synchronous function that tries to acquire a permit and returns true if successful, false otherwise.
      * @returns  Whether a permit could be acquired.
      */
    /* CompleteClass */
    override def tryAcquire(): Boolean = js.native
    
    /**
      * Same as {@linkcode Semaphore.wait} except the promise returned gets resolved with false if no
      * permit becomes available in time.
      * @param milliseconds  The time spent waiting before the wait is aborted. This is a lower bound,
      * don't rely on it being precise.
      * @returns  A promise that gets resolved with true when execution is allowed to proceed or
      * false if the time given elapses before a permit becomes available.
      */
    /* CompleteClass */
    override def waitFor(milliseconds: Double): js.Promise[Boolean] = js.native
  }
  
  trait Semaphore extends StObject {
    
    /**
      * Alias for {@linkcode Semaphore.wait}.
      * @returns  A promise that gets resolved when execution is allowed to proceed.
      */
    def acquire(): js.Promise[Boolean]
    
    /**
      * Acquires all permits that are currently available and returns the number of acquired permits.
      * @returns  Number of acquired permits.
      */
    def drainPermits(): Double
    
    /**
      * Schedules func to be called once a permit becomes available.
      * Returns a promise that resolves to the return value of func.
      * @typeparam T  The return type of func.
      * @param func  The function to be executed.
      * @return  A promise that gets resolved with the return value of the function.
      */
    def execute[T](func: js.Function0[T | PromiseLike[T]]): js.Promise[T]
    
    /**
      * Returns the number of available permits.
      * @returns  The number of available permits.
      */
    def getPermits(): Double
    
    /* private */ var permits: Any
    
    /* private */ var promiseResolverQueue: Any
    
    /**
      * Alias for {@linkcode Semaphore.signal}.
      */
    def release(): Unit
    
    /**
      * Increases the number of permits by one. If there are other functions waiting, one of them will
      * continue to execute in a future iteration of the event loop.
      */
    def signal(): Unit
    
    /**
      * Synchronous function that tries to acquire a permit and returns true if successful, false otherwise.
      * @returns  Whether a permit could be acquired.
      */
    def tryAcquire(): Boolean
    
    /**
      * Same as {@linkcode Semaphore.wait} except the promise returned gets resolved with false if no
      * permit becomes available in time.
      * @param milliseconds  The time spent waiting before the wait is aborted. This is a lower bound,
      * don't rely on it being precise.
      * @returns  A promise that gets resolved with true when execution is allowed to proceed or
      * false if the time given elapses before a permit becomes available.
      */
    def waitFor(milliseconds: Double): js.Promise[Boolean]
  }
  object Semaphore {
    
    inline def apply(
      acquire: CallbackTo[js.Promise[Boolean]],
      drainPermits: CallbackTo[Double],
      execute: js.Function0[Any | PromiseLike[Any]] => js.Promise[Any],
      getPermits: CallbackTo[Double],
      permits: Any,
      promiseResolverQueue: Any,
      release: Callback,
      signal: Callback,
      tryAcquire: CallbackTo[Boolean],
      waitFor: Double => js.Promise[Boolean]
    ): Semaphore = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, drainPermits = drainPermits.toJsFn, execute = js.Any.fromFunction1(execute), getPermits = getPermits.toJsFn, permits = permits.asInstanceOf[js.Any], promiseResolverQueue = promiseResolverQueue.asInstanceOf[js.Any], release = release.toJsFn, signal = signal.toJsFn, tryAcquire = tryAcquire.toJsFn, waitFor = js.Any.fromFunction1(waitFor))
      __obj.asInstanceOf[Semaphore]
    }
    
    extension [Self <: Semaphore](x: Self) {
      
      inline def setAcquire(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "acquire", value.toJsFn)
      
      inline def setDrainPermits(value: CallbackTo[Double]): Self = StObject.set(x, "drainPermits", value.toJsFn)
      
      inline def setExecute(value: js.Function0[Any | PromiseLike[Any]] => js.Promise[Any]): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setGetPermits(value: CallbackTo[Double]): Self = StObject.set(x, "getPermits", value.toJsFn)
      
      inline def setPermits(value: Any): Self = StObject.set(x, "permits", value.asInstanceOf[js.Any])
      
      inline def setPromiseResolverQueue(value: Any): Self = StObject.set(x, "promiseResolverQueue", value.asInstanceOf[js.Any])
      
      inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
      
      inline def setSignal(value: Callback): Self = StObject.set(x, "signal", value.toJsFn)
      
      inline def setTryAcquire(value: CallbackTo[Boolean]): Self = StObject.set(x, "tryAcquire", value.toJsFn)
      
      inline def setWaitFor(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
    }
  }
}
