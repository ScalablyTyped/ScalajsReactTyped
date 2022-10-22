package typingsJapgolly.pusherJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyMod.Strategy
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyRunnerMod.StrategyRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesIfStrategyMod {
  
  @JSImport("pusher-js/types/src/core/strategies/if_strategy", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with IfStrategy {
    def this(test: js.Function0[Boolean], trueBranch: Strategy, falseBranch: Strategy) = this()
    
    /* CompleteClass */
    override def connect(minPriority: Double, callback: js.Function): StrategyRunner = js.native
    
    /* CompleteClass */
    var falseBranch: Strategy = js.native
    
    /* CompleteClass */
    override def isSupported(): Boolean = js.native
    
    /* CompleteClass */
    override def test(): Boolean = js.native
    
    /* CompleteClass */
    var trueBranch: Strategy = js.native
  }
  
  trait IfStrategy
    extends StObject
       with Strategy {
    
    var falseBranch: Strategy
    
    def test(): Boolean
    
    var trueBranch: Strategy
  }
  object IfStrategy {
    
    inline def apply(
      connect: (Double, js.Function) => StrategyRunner,
      falseBranch: Strategy,
      isSupported: CallbackTo[Boolean],
      test: CallbackTo[Boolean],
      trueBranch: Strategy
    ): IfStrategy = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), falseBranch = falseBranch.asInstanceOf[js.Any], isSupported = isSupported.toJsFn, test = test.toJsFn, trueBranch = trueBranch.asInstanceOf[js.Any])
      __obj.asInstanceOf[IfStrategy]
    }
    
    extension [Self <: IfStrategy](x: Self) {
      
      inline def setFalseBranch(value: Strategy): Self = StObject.set(x, "falseBranch", value.asInstanceOf[js.Any])
      
      inline def setTest(value: CallbackTo[Boolean]): Self = StObject.set(x, "test", value.toJsFn)
      
      inline def setTrueBranch(value: Strategy): Self = StObject.set(x, "trueBranch", value.asInstanceOf[js.Any])
    }
  }
}
