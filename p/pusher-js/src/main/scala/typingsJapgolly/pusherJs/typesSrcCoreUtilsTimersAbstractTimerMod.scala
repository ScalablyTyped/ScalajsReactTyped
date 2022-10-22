package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pusherJs.typesSrcCoreUtilsTimersSchedulingMod.Canceller
import typingsJapgolly.pusherJs.typesSrcCoreUtilsTimersSchedulingMod.Delay
import typingsJapgolly.pusherJs.typesSrcCoreUtilsTimersSchedulingMod.Scheduler
import typingsJapgolly.pusherJs.typesSrcCoreUtilsTimersTimedCallbackMod.TimedCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreUtilsTimersAbstractTimerMod {
  
  /* note: abstract class */ @JSImport("pusher-js/types/src/core/utils/timers/abstract_timer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Timer {
    def this(set: Scheduler, clear: Canceller, delay: Delay, callback: TimedCallback) = this()
    
    /* protected */ /* CompleteClass */
    override def clear(number: Any): Unit = js.native
    /* protected */ /* CompleteClass */
    @JSName("clear")
    var clear_Original: Canceller = js.native
    
    /* CompleteClass */
    override def ensureAborted(): Unit = js.native
    
    /* CompleteClass */
    override def isRunning(): Boolean = js.native
    
    /* protected */ /* CompleteClass */
    var timer: Double | Unit = js.native
  }
  
  trait Timer extends StObject {
    
    /* protected */ def clear(number: Any): Unit
    /* protected */ @JSName("clear")
    var clear_Original: Canceller
    
    def ensureAborted(): Unit
    
    def isRunning(): Boolean
    
    /* protected */ var timer: Double | Unit
  }
  object Timer {
    
    inline def apply(
      clear: /* number */ Any => Callback,
      ensureAborted: Callback,
      isRunning: CallbackTo[Boolean],
      timer: Double | Unit
    ): Timer = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1((t0: /* number */ Any) => clear(t0).runNow()), ensureAborted = ensureAborted.toJsFn, isRunning = isRunning.toJsFn, timer = timer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timer]
    }
    
    extension [Self <: Timer](x: Self) {
      
      inline def setClear(value: /* number */ Any => Callback): Self = StObject.set(x, "clear", js.Any.fromFunction1((t0: /* number */ Any) => value(t0).runNow()))
      
      inline def setEnsureAborted(value: Callback): Self = StObject.set(x, "ensureAborted", value.toJsFn)
      
      inline def setIsRunning(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRunning", value.toJsFn)
      
      inline def setTimer(value: Double | Unit): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    }
  }
}
