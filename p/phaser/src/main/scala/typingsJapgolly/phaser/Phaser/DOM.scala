package typingsJapgolly.phaser.Phaser

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.DOMHighResTimeStamp
import typingsJapgolly.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DOM {
  
  /**
    * Abstracts away the use of RAF or setTimeOut for the core game update loop.
    * This is invoked automatically by the Phaser.Game instance.
    */
  trait RequestAnimationFrame extends StObject {
    
    /**
      * The callback to be invoked each step.
      */
    def callback(time: DOMHighResTimeStamp): Unit
    /**
      * The callback to be invoked each step.
      */
    @JSName("callback")
    var callback_Original: FrameRequestCallback
    
    /**
      * Stops the step from running and clears the callback reference.
      */
    def destroy(): Unit
    
    /**
      * True if RequestAnimationFrame is running, otherwise false.
      */
    var isRunning: Boolean
    
    /**
      * True if the step is using setTimeout instead of RAF.
      */
    var isSetTimeOut: Boolean
    
    /**
      * The previous time the step was called.
      */
    var lastTime: Double
    
    /**
      * Starts the requestAnimationFrame or setTimeout process running.
      * @param callback The callback to invoke each step.
      * @param forceSetTimeOut Should it use SetTimeout, even if RAF is available?
      * @param targetFPS The target fps rate (in ms). Only used when setTimeout is used.
      */
    def start(callback: FrameRequestCallback, forceSetTimeOut: Boolean, targetFPS: Double): Unit
    
    /**
      * The RAF step function.
      * Updates the local tick value, invokes the callback and schedules another call to requestAnimationFrame.
      */
    def step(time: DOMHighResTimeStamp): Unit
    
    /**
      * The SetTimeout step function.
      * Updates the local tick value, invokes the callback and schedules another call to setTimeout.
      */
    var stepTimeout: js.Function
    
    /**
      * The RAF step function.
      * Updates the local tick value, invokes the callback and schedules another call to requestAnimationFrame.
      */
    @JSName("step")
    var step_Original: FrameRequestCallback
    
    /**
      * Stops the requestAnimationFrame or setTimeout from running.
      */
    def stop(): Unit
    
    /**
      * The target FPS rate in ms.
      * Only used when setTimeout is used instead of RAF.
      */
    var target: Double
    
    /**
      * The most recent timestamp. Either a DOMHighResTimeStamp under RAF or `Date.now` under SetTimeout.
      */
    var tick: Double
    
    /**
      * The setTimeout or RAF callback ID used when canceling them.
      */
    var timeOutID: Double
  }
  object RequestAnimationFrame {
    
    inline def apply(
      callback: /* time */ DOMHighResTimeStamp => Callback,
      destroy: Callback,
      isRunning: Boolean,
      isSetTimeOut: Boolean,
      lastTime: Double,
      start: (FrameRequestCallback, Boolean, Double) => Callback,
      step: /* time */ DOMHighResTimeStamp => Callback,
      stepTimeout: js.Function,
      stop: Callback,
      target: Double,
      tick: Double,
      timeOutID: Double
    ): RequestAnimationFrame = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: /* time */ DOMHighResTimeStamp) => callback(t0).runNow()), destroy = destroy.toJsFn, isRunning = isRunning.asInstanceOf[js.Any], isSetTimeOut = isSetTimeOut.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], start = js.Any.fromFunction3((t0: FrameRequestCallback, t1: Boolean, t2: Double) => (start(t0, t1, t2)).runNow()), step = js.Any.fromFunction1((t0: /* time */ DOMHighResTimeStamp) => step(t0).runNow()), stepTimeout = stepTimeout.asInstanceOf[js.Any], stop = stop.toJsFn, target = target.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], timeOutID = timeOutID.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestAnimationFrame]
    }
    
    extension [Self <: RequestAnimationFrame](x: Self) {
      
      inline def setCallback(value: /* time */ DOMHighResTimeStamp => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* time */ DOMHighResTimeStamp) => value(t0).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      inline def setIsSetTimeOut(value: Boolean): Self = StObject.set(x, "isSetTimeOut", value.asInstanceOf[js.Any])
      
      inline def setLastTime(value: Double): Self = StObject.set(x, "lastTime", value.asInstanceOf[js.Any])
      
      inline def setStart(value: (FrameRequestCallback, Boolean, Double) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction3((t0: FrameRequestCallback, t1: Boolean, t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setStep(value: /* time */ DOMHighResTimeStamp => Callback): Self = StObject.set(x, "step", js.Any.fromFunction1((t0: /* time */ DOMHighResTimeStamp) => value(t0).runNow()))
      
      inline def setStepTimeout(value: js.Function): Self = StObject.set(x, "stepTimeout", value.asInstanceOf[js.Any])
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTick(value: Double): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
      
      inline def setTimeOutID(value: Double): Self = StObject.set(x, "timeOutID", value.asInstanceOf[js.Any])
    }
  }
}
