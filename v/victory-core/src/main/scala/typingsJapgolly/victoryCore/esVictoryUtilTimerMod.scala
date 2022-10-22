package typingsJapgolly.victoryCore

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryUtilTimerMod {
  
  @JSImport("victory-core/es/victory-util/timer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Timer {
    
    /* private */ /* CompleteClass */
    var activeSubscriptions: Any = js.native
    
    /* CompleteClass */
    override def bypassAnimation(): Unit = js.native
    
    /* CompleteClass */
    override def loop(): Unit = js.native
    
    /* CompleteClass */
    override def resumeAnimation(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var shouldAnimate: Any = js.native
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /* CompleteClass */
    override def subscribe(callback: TimerCallback, duration: Double): Double = js.native
    
    /* private */ /* CompleteClass */
    override val subscribers: Any = js.native
    
    /* private */ /* CompleteClass */
    var timer: Any = js.native
    
    /* CompleteClass */
    override def unsubscribe(id: Any): Unit = js.native
  }
  
  trait Timer extends StObject {
    
    /* private */ var activeSubscriptions: Any
    
    def bypassAnimation(): Unit
    
    def loop(): Unit
    
    def resumeAnimation(): Unit
    
    /* private */ var shouldAnimate: Any
    
    def start(): Unit
    
    def stop(): Unit
    
    def subscribe(callback: TimerCallback, duration: Double): Double
    
    /* private */ val subscribers: Any
    
    /* private */ var timer: Any
    
    def unsubscribe(id: Any): Unit
  }
  object Timer {
    
    inline def apply(
      activeSubscriptions: Any,
      bypassAnimation: Callback,
      loop: Callback,
      resumeAnimation: Callback,
      shouldAnimate: Any,
      start: Callback,
      stop: Callback,
      subscribe: (TimerCallback, Double) => Double,
      subscribers: Any,
      timer: Any,
      unsubscribe: Any => Callback
    ): Timer = {
      val __obj = js.Dynamic.literal(activeSubscriptions = activeSubscriptions.asInstanceOf[js.Any], bypassAnimation = bypassAnimation.toJsFn, loop = loop.toJsFn, resumeAnimation = resumeAnimation.toJsFn, shouldAnimate = shouldAnimate.asInstanceOf[js.Any], start = start.toJsFn, stop = stop.toJsFn, subscribe = js.Any.fromFunction2(subscribe), subscribers = subscribers.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction1((t0: Any) => unsubscribe(t0).runNow()))
      __obj.asInstanceOf[Timer]
    }
    
    extension [Self <: Timer](x: Self) {
      
      inline def setActiveSubscriptions(value: Any): Self = StObject.set(x, "activeSubscriptions", value.asInstanceOf[js.Any])
      
      inline def setBypassAnimation(value: Callback): Self = StObject.set(x, "bypassAnimation", value.toJsFn)
      
      inline def setLoop(value: Callback): Self = StObject.set(x, "loop", value.toJsFn)
      
      inline def setResumeAnimation(value: Callback): Self = StObject.set(x, "resumeAnimation", value.toJsFn)
      
      inline def setShouldAnimate(value: Any): Self = StObject.set(x, "shouldAnimate", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setSubscribe(value: (TimerCallback, Double) => Double): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
      
      inline def setSubscribers(value: Any): Self = StObject.set(x, "subscribers", value.asInstanceOf[js.Any])
      
      inline def setTimer(value: Any): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribe(value: Any => Callback): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  type TimerCallback = js.Function2[/* elapsed */ Double, /* duration */ Double, Unit]
}
