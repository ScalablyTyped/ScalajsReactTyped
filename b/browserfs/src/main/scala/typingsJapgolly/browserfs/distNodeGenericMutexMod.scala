package typingsJapgolly.browserfs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeGenericMutexMod {
  
  @JSImport("browserfs/dist/node/generic/mutex", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Mutex {
    
    /* private */ /* CompleteClass */
    var _locked: Any = js.native
    
    /* private */ /* CompleteClass */
    var _waiters: Any = js.native
    
    /* CompleteClass */
    override def isLocked(): Boolean = js.native
    
    /* CompleteClass */
    override def lock(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def tryLock(): Boolean = js.native
    
    /* CompleteClass */
    override def unlock(): Unit = js.native
  }
  
  trait Mutex extends StObject {
    
    /* private */ var _locked: Any
    
    /* private */ var _waiters: Any
    
    def isLocked(): Boolean
    
    def lock(cb: js.Function): Unit
    
    def tryLock(): Boolean
    
    def unlock(): Unit
  }
  object Mutex {
    
    inline def apply(
      _locked: Any,
      _waiters: Any,
      isLocked: CallbackTo[Boolean],
      lock: js.Function => Callback,
      tryLock: CallbackTo[Boolean],
      unlock: Callback
    ): Mutex = {
      val __obj = js.Dynamic.literal(_locked = _locked.asInstanceOf[js.Any], _waiters = _waiters.asInstanceOf[js.Any], isLocked = isLocked.toJsFn, lock = js.Any.fromFunction1((t0: js.Function) => lock(t0).runNow()), tryLock = tryLock.toJsFn, unlock = unlock.toJsFn)
      __obj.asInstanceOf[Mutex]
    }
    
    extension [Self <: Mutex](x: Self) {
      
      inline def setIsLocked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLocked", value.toJsFn)
      
      inline def setLock(value: js.Function => Callback): Self = StObject.set(x, "lock", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setTryLock(value: CallbackTo[Boolean]): Self = StObject.set(x, "tryLock", value.toJsFn)
      
      inline def setUnlock(value: Callback): Self = StObject.set(x, "unlock", value.toJsFn)
      
      inline def set_locked(value: Any): Self = StObject.set(x, "_locked", value.asInstanceOf[js.Any])
      
      inline def set_waiters(value: Any): Self = StObject.set(x, "_waiters", value.asInstanceOf[js.Any])
    }
  }
}
