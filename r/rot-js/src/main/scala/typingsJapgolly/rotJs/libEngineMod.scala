package typingsJapgolly.rotJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEngineMod {
  
  @JSImport("rot-js/lib/engine", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Engine {
    def this(scheduler: typingsJapgolly.rotJs.libSchedulerSchedulerMod.default[Any]) = this()
    
    /* CompleteClass */
    var _lock: Double = js.native
    
    /* CompleteClass */
    var _scheduler: typingsJapgolly.rotJs.libSchedulerSchedulerMod.default[Any] = js.native
    
    /**
      * Interrupt the engine by an asynchronous action
      */
    /* CompleteClass */
    override def lock(): this.type = js.native
    
    /**
      * Start the main loop. When this call returns, the loop is locked.
      */
    /* CompleteClass */
    override def start(): this.type = js.native
    
    /**
      * Resume execution (paused by a previous lock)
      */
    /* CompleteClass */
    override def unlock(): this.type = js.native
  }
  
  trait Engine extends StObject {
    
    var _lock: Double
    
    var _scheduler: typingsJapgolly.rotJs.libSchedulerSchedulerMod.default[Any]
    
    /**
      * Interrupt the engine by an asynchronous action
      */
    def lock(): this.type
    
    /**
      * Start the main loop. When this call returns, the loop is locked.
      */
    def start(): this.type
    
    /**
      * Resume execution (paused by a previous lock)
      */
    def unlock(): this.type
  }
  object Engine {
    
    inline def apply(
      _lock: Double,
      _scheduler: typingsJapgolly.rotJs.libSchedulerSchedulerMod.default[Any],
      lock: CallbackTo[Engine],
      start: CallbackTo[Engine],
      unlock: CallbackTo[Engine]
    ): Engine = {
      val __obj = js.Dynamic.literal(_lock = _lock.asInstanceOf[js.Any], _scheduler = _scheduler.asInstanceOf[js.Any], lock = lock.toJsFn, start = start.toJsFn, unlock = unlock.toJsFn)
      __obj.asInstanceOf[Engine]
    }
    
    extension [Self <: Engine](x: Self) {
      
      inline def setLock(value: CallbackTo[Engine]): Self = StObject.set(x, "lock", value.toJsFn)
      
      inline def setStart(value: CallbackTo[Engine]): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setUnlock(value: CallbackTo[Engine]): Self = StObject.set(x, "unlock", value.toJsFn)
      
      inline def set_lock(value: Double): Self = StObject.set(x, "_lock", value.asInstanceOf[js.Any])
      
      inline def set_scheduler(value: typingsJapgolly.rotJs.libSchedulerSchedulerMod.default[Any]): Self = StObject.set(x, "_scheduler", value.asInstanceOf[js.Any])
    }
  }
}
