package typingsJapgolly.pusherJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pusherJs.anon.Delay
import typingsJapgolly.pusherJs.anon.DelayNumber
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyMod.Strategy
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyRunnerMod.StrategyRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesDelayedStrategyMod {
  
  @JSImport("pusher-js/types/src/core/strategies/delayed_strategy", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DelayedStrategy {
    def this(strategy: Strategy, hasNumber: Delay) = this()
    
    /* CompleteClass */
    override def connect(minPriority: Double, callback: js.Function): StrategyRunner = js.native
    
    /* CompleteClass */
    override def isSupported(): Boolean = js.native
    
    /* CompleteClass */
    var options: DelayNumber = js.native
    
    /* CompleteClass */
    var strategy: Strategy = js.native
  }
  
  trait DelayedStrategy
    extends StObject
       with Strategy {
    
    var options: DelayNumber
    
    var strategy: Strategy
  }
  object DelayedStrategy {
    
    inline def apply(
      connect: (Double, js.Function) => StrategyRunner,
      isSupported: CallbackTo[Boolean],
      options: DelayNumber,
      strategy: Strategy
    ): DelayedStrategy = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), isSupported = isSupported.toJsFn, options = options.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelayedStrategy]
    }
    
    extension [Self <: DelayedStrategy](x: Self) {
      
      inline def setOptions(value: DelayNumber): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
}
