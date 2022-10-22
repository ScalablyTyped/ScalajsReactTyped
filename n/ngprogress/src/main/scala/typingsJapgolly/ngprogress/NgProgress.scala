package typingsJapgolly.ngprogress

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NgProgress {
  
  trait INgProgress extends StObject {
    
    def color(color: String): Unit
    
    def complete(): Unit
    
    def height(height: String): Unit
    
    def reset(): Unit
    
    def set(value: Double): Unit
    
    def start(): Unit
    
    def status(): Double
    
    def stop(): Unit
  }
  object INgProgress {
    
    inline def apply(
      color: String => Callback,
      complete: Callback,
      height: String => Callback,
      reset: Callback,
      set: Double => Callback,
      start: Callback,
      status: CallbackTo[Double],
      stop: Callback
    ): INgProgress = {
      val __obj = js.Dynamic.literal(color = js.Any.fromFunction1((t0: String) => color(t0).runNow()), complete = complete.toJsFn, height = js.Any.fromFunction1((t0: String) => height(t0).runNow()), reset = reset.toJsFn, set = js.Any.fromFunction1((t0: Double) => set(t0).runNow()), start = start.toJsFn, status = status.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[INgProgress]
    }
    
    extension [Self <: INgProgress](x: Self) {
      
      inline def setColor(value: String => Callback): Self = StObject.set(x, "color", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
      
      inline def setHeight(value: String => Callback): Self = StObject.set(x, "height", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setSet(value: Double => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStatus(value: CallbackTo[Double]): Self = StObject.set(x, "status", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
  
  trait INgProgressFactory extends StObject {
    
    def createInstance(): INgProgress
  }
  object INgProgressFactory {
    
    inline def apply(createInstance: CallbackTo[INgProgress]): INgProgressFactory = {
      val __obj = js.Dynamic.literal(createInstance = createInstance.toJsFn)
      __obj.asInstanceOf[INgProgressFactory]
    }
    
    extension [Self <: INgProgressFactory](x: Self) {
      
      inline def setCreateInstance(value: CallbackTo[INgProgress]): Self = StObject.set(x, "createInstance", value.toJsFn)
    }
  }
}
