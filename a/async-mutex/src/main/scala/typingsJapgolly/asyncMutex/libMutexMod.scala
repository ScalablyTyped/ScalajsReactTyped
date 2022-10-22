package typingsJapgolly.asyncMutex

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asyncMutex.libMutexInterfaceMod.MutexInterface
import typingsJapgolly.asyncMutex.libMutexInterfaceMod.MutexInterface.Releaser
import typingsJapgolly.asyncMutex.libMutexInterfaceMod.MutexInterface.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMutexMod {
  
  @JSImport("async-mutex/lib/Mutex", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Mutex {
    def this(cancelError: js.Error) = this()
    
    /* private */ /* CompleteClass */
    var _semaphore: Any = js.native
    
    /* CompleteClass */
    override def acquire(): js.Promise[Releaser] = js.native
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def isLocked(): Boolean = js.native
    
    /* CompleteClass */
    override def release(): Unit = js.native
    
    /* CompleteClass */
    override def runExclusive[T](callback: Worker[T]): js.Promise[T] = js.native
    
    /* CompleteClass */
    override def waitForUnlock(): js.Promise[Unit] = js.native
  }
  
  trait Mutex
    extends StObject
       with MutexInterface {
    
    /* private */ var _semaphore: Any
  }
  object Mutex {
    
    inline def apply(
      _semaphore: Any,
      acquire: CallbackTo[js.Promise[Releaser]],
      cancel: Callback,
      isLocked: CallbackTo[Boolean],
      release: Callback,
      runExclusive: Worker[Any] => js.Promise[Any],
      waitForUnlock: CallbackTo[js.Promise[Unit]]
    ): Mutex = {
      val __obj = js.Dynamic.literal(_semaphore = _semaphore.asInstanceOf[js.Any], acquire = acquire.toJsFn, cancel = cancel.toJsFn, isLocked = isLocked.toJsFn, release = release.toJsFn, runExclusive = js.Any.fromFunction1(runExclusive), waitForUnlock = waitForUnlock.toJsFn)
      __obj.asInstanceOf[Mutex]
    }
    
    extension [Self <: Mutex](x: Self) {
      
      inline def set_semaphore(value: Any): Self = StObject.set(x, "_semaphore", value.asInstanceOf[js.Any])
    }
  }
}
