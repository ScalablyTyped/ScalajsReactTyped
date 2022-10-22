package typingsJapgolly.pusherJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyMod.Strategy
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyOptionsMod.StrategyOptions
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyRunnerMod.StrategyRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesSequentialStrategyMod {
  
  @JSImport("pusher-js/types/src/core/strategies/sequential_strategy", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SequentialStrategy {
    def this(strategies: js.Array[Strategy], options: StrategyOptions) = this()
    
    /* CompleteClass */
    override def connect(minPriority: Double, callback: js.Function): StrategyRunner = js.native
    
    /* CompleteClass */
    var failFast: Boolean = js.native
    
    /* CompleteClass */
    override def isSupported(): Boolean = js.native
    
    /* CompleteClass */
    var loop: Boolean = js.native
    
    /* CompleteClass */
    var strategies: js.Array[Strategy] = js.native
    
    /* CompleteClass */
    var timeout: Double = js.native
    
    /* CompleteClass */
    var timeoutLimit: Double = js.native
    
    /* private */ /* CompleteClass */
    var tryStrategy: Any = js.native
  }
  
  trait SequentialStrategy
    extends StObject
       with Strategy {
    
    var failFast: Boolean
    
    var loop: Boolean
    
    var strategies: js.Array[Strategy]
    
    var timeout: Double
    
    var timeoutLimit: Double
    
    /* private */ var tryStrategy: Any
  }
  object SequentialStrategy {
    
    inline def apply(
      connect: (Double, js.Function) => StrategyRunner,
      failFast: Boolean,
      isSupported: CallbackTo[Boolean],
      loop: Boolean,
      strategies: js.Array[Strategy],
      timeout: Double,
      timeoutLimit: Double,
      tryStrategy: Any
    ): SequentialStrategy = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), failFast = failFast.asInstanceOf[js.Any], isSupported = isSupported.toJsFn, loop = loop.asInstanceOf[js.Any], strategies = strategies.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], timeoutLimit = timeoutLimit.asInstanceOf[js.Any], tryStrategy = tryStrategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[SequentialStrategy]
    }
    
    extension [Self <: SequentialStrategy](x: Self) {
      
      inline def setFailFast(value: Boolean): Self = StObject.set(x, "failFast", value.asInstanceOf[js.Any])
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setStrategies(value: js.Array[Strategy]): Self = StObject.set(x, "strategies", value.asInstanceOf[js.Any])
      
      inline def setStrategiesVarargs(value: Strategy*): Self = StObject.set(x, "strategies", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutLimit(value: Double): Self = StObject.set(x, "timeoutLimit", value.asInstanceOf[js.Any])
      
      inline def setTryStrategy(value: Any): Self = StObject.set(x, "tryStrategy", value.asInstanceOf[js.Any])
    }
  }
}
