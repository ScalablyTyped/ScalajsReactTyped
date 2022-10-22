package typingsJapgolly.atlaskitTree

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsDelayedFunctionMod {
  
  @JSImport("@atlaskit/tree/dist/types/utils/delayed-function", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DelayedFunction {
    def this(delay: Double) = this()
    
    /* CompleteClass */
    var delay: Double = js.native
    
    /* CompleteClass */
    override def start(fn: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  trait DelayedFunction extends StObject {
    
    var delay: Double
    
    var fn: js.UndefOr[js.Function] = js.undefined
    
    def start(fn: js.Function): Unit
    
    def stop(): Unit
    
    var timeoutId: js.UndefOr[Double] = js.undefined
  }
  object DelayedFunction {
    
    inline def apply(delay: Double, start: js.Function => Callback, stop: Callback): DelayedFunction = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], start = js.Any.fromFunction1((t0: js.Function) => start(t0).runNow()), stop = stop.toJsFn)
      __obj.asInstanceOf[DelayedFunction]
    }
    
    extension [Self <: DelayedFunction](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setFn(value: js.Function): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setStart(value: js.Function => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setTimeoutId(value: Double): Self = StObject.set(x, "timeoutId", value.asInstanceOf[js.Any])
      
      inline def setTimeoutIdUndefined: Self = StObject.set(x, "timeoutId", js.undefined)
    }
  }
}
