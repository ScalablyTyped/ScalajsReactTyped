package typingsJapgolly.pusherJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyMod.Strategy
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyRunnerMod.StrategyRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesFirstConnectedStrategyMod {
  
  @JSImport("pusher-js/types/src/core/strategies/first_connected_strategy", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with FirstConnectedStrategy {
    def this(strategy: Strategy) = this()
    
    /* CompleteClass */
    override def connect(minPriority: Double, callback: js.Function): StrategyRunner = js.native
    
    /* CompleteClass */
    override def isSupported(): Boolean = js.native
    
    /* CompleteClass */
    var strategy: Strategy = js.native
  }
  
  trait FirstConnectedStrategy
    extends StObject
       with Strategy {
    
    var strategy: Strategy
  }
  object FirstConnectedStrategy {
    
    inline def apply(
      connect: (Double, js.Function) => StrategyRunner,
      isSupported: CallbackTo[Boolean],
      strategy: Strategy
    ): FirstConnectedStrategy = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), isSupported = isSupported.toJsFn, strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirstConnectedStrategy]
    }
    
    extension [Self <: FirstConnectedStrategy](x: Self) {
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
}
