package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesStrategyRunnerMod {
  
  trait StrategyRunner extends StObject {
    
    def abort(): Unit
    
    def forceMinPriority(number: Any): Unit
  }
  object StrategyRunner {
    
    inline def apply(abort: Callback, forceMinPriority: Any => Callback): StrategyRunner = {
      val __obj = js.Dynamic.literal(abort = abort.toJsFn, forceMinPriority = js.Any.fromFunction1((t0: Any) => forceMinPriority(t0).runNow()))
      __obj.asInstanceOf[StrategyRunner]
    }
    
    extension [Self <: StrategyRunner](x: Self) {
      
      inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
      
      inline def setForceMinPriority(value: Any => Callback): Self = StObject.set(x, "forceMinPriority", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
