package typingsJapgolly.pusherJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyRunnerMod.StrategyRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesStrategyMod {
  
  trait Strategy extends StObject {
    
    def connect(minPriority: Double, callback: js.Function): StrategyRunner
    
    def isSupported(): Boolean
  }
  object Strategy {
    
    inline def apply(connect: (Double, js.Function) => StrategyRunner, isSupported: CallbackTo[Boolean]): Strategy = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), isSupported = isSupported.toJsFn)
      __obj.asInstanceOf[Strategy]
    }
    
    extension [Self <: Strategy](x: Self) {
      
      inline def setConnect(value: (Double, js.Function) => StrategyRunner): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
      
      inline def setIsSupported(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSupported", value.toJsFn)
    }
  }
}
