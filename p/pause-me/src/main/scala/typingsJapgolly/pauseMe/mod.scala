package typingsJapgolly.pauseMe

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.timersMod.global.NodeJS.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    *
    * @param callback function or lambda that you want executed after duration
    * @param duration Milliseconds to set the timeout to
    * @param repeating When true the timeout is treated as an interval
    */
  inline def apply(callback: js.Function0[Unit], duration: Double): PausableTimeout = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[PausableTimeout]
  inline def apply(callback: js.Function0[Unit], duration: Double, repeating: Boolean): PausableTimeout = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], repeating.asInstanceOf[js.Any])).asInstanceOf[PausableTimeout]
  
  @JSImport("pause-me", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PausableTimeout extends StObject {
    
    def pause(): Unit
    
    def resume(): Unit
    
    def start(): Unit
    
    def stop(): Unit
    
    def timer(): Timeout | Null
  }
  object PausableTimeout {
    
    inline def apply(
      pause: Callback,
      resume: Callback,
      start: Callback,
      stop: Callback,
      timer: CallbackTo[Timeout | Null]
    ): PausableTimeout = {
      val __obj = js.Dynamic.literal(pause = pause.toJsFn, resume = resume.toJsFn, start = start.toJsFn, stop = stop.toJsFn, timer = timer.toJsFn)
      __obj.asInstanceOf[PausableTimeout]
    }
    
    extension [Self <: PausableTimeout](x: Self) {
      
      inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
      
      inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setTimer(value: CallbackTo[Timeout | Null]): Self = StObject.set(x, "timer", value.toJsFn)
    }
  }
}
