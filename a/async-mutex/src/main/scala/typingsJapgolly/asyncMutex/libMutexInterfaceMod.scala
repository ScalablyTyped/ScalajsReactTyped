package typingsJapgolly.asyncMutex

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asyncMutex.libMutexInterfaceMod.MutexInterface.Releaser
import typingsJapgolly.asyncMutex.libMutexInterfaceMod.MutexInterface.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMutexInterfaceMod {
  
  trait MutexInterface extends StObject {
    
    def acquire(): js.Promise[Releaser]
    
    def cancel(): Unit
    
    def isLocked(): Boolean
    
    def release(): Unit
    
    def runExclusive[T](callback: Worker[T]): js.Promise[T]
    
    def waitForUnlock(): js.Promise[Unit]
  }
  object MutexInterface {
    
    inline def apply(
      acquire: CallbackTo[js.Promise[Releaser]],
      cancel: Callback,
      isLocked: CallbackTo[Boolean],
      release: Callback,
      runExclusive: Worker[Any] => js.Promise[Any],
      waitForUnlock: CallbackTo[js.Promise[Unit]]
    ): MutexInterface = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, cancel = cancel.toJsFn, isLocked = isLocked.toJsFn, release = release.toJsFn, runExclusive = js.Any.fromFunction1(runExclusive), waitForUnlock = waitForUnlock.toJsFn)
      __obj.asInstanceOf[MutexInterface]
    }
    
    extension [Self <: MutexInterface](x: Self) {
      
      inline def setAcquire(value: CallbackTo[js.Promise[Releaser]]): Self = StObject.set(x, "acquire", value.toJsFn)
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setIsLocked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLocked", value.toJsFn)
      
      inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
      
      inline def setRunExclusive(value: Worker[Any] => js.Promise[Any]): Self = StObject.set(x, "runExclusive", js.Any.fromFunction1(value))
      
      inline def setWaitForUnlock(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "waitForUnlock", value.toJsFn)
    }
    
    type Releaser = js.Function0[Unit]
    
    type Worker[T] = js.Function0[js.Promise[T] | T]
  }
}
