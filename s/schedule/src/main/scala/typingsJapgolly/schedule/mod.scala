package typingsJapgolly.schedule

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.schedule.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("schedule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unstableCancelScheduledWork(callbackNode: CallbackNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_cancelScheduledWork")(callbackNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unstableNow(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_now")().asInstanceOf[Double]
  
  inline def unstableScheduleWork(callback: FrameCallbackType): CallbackNode = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_scheduleWork")(callback.asInstanceOf[js.Any]).asInstanceOf[CallbackNode]
  inline def unstableScheduleWork(callback: FrameCallbackType, options: Timeout): CallbackNode = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_scheduleWork")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CallbackNode]
  
  trait CallbackNode extends StObject {
    
    def callback(deadline: Deadline): Unit
    @JSName("callback")
    var callback_Original: FrameCallbackType
    
    var next: CallbackNode | Null
    
    var prev: CallbackNode | Null
    
    var timesOutAt: Double
  }
  object CallbackNode {
    
    inline def apply(callback: /* deadline */ Deadline => Callback, timesOutAt: Double): CallbackNode = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: /* deadline */ Deadline) => callback(t0).runNow()), timesOutAt = timesOutAt.asInstanceOf[js.Any], next = null, prev = null)
      __obj.asInstanceOf[CallbackNode]
    }
    
    extension [Self <: CallbackNode](x: Self) {
      
      inline def setCallback(value: /* deadline */ Deadline => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* deadline */ Deadline) => value(t0).runNow()))
      
      inline def setNext(value: CallbackNode): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setPrev(value: CallbackNode): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
      
      inline def setTimesOutAt(value: Double): Self = StObject.set(x, "timesOutAt", value.asInstanceOf[js.Any])
    }
  }
  
  trait Deadline extends StObject {
    
    var didTimeout: Boolean
    
    def timeRemaining(): Double
  }
  object Deadline {
    
    inline def apply(didTimeout: Boolean, timeRemaining: CallbackTo[Double]): Deadline = {
      val __obj = js.Dynamic.literal(didTimeout = didTimeout.asInstanceOf[js.Any], timeRemaining = timeRemaining.toJsFn)
      __obj.asInstanceOf[Deadline]
    }
    
    extension [Self <: Deadline](x: Self) {
      
      inline def setDidTimeout(value: Boolean): Self = StObject.set(x, "didTimeout", value.asInstanceOf[js.Any])
      
      inline def setTimeRemaining(value: CallbackTo[Double]): Self = StObject.set(x, "timeRemaining", value.toJsFn)
    }
  }
  
  type FrameCallbackType = js.Function1[/* deadline */ Deadline, Unit]
}
