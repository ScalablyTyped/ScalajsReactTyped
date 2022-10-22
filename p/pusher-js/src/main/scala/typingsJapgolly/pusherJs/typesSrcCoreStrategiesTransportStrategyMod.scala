package typingsJapgolly.pusherJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyMod.Strategy
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyOptionsMod.StrategyOptions
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyRunnerMod.StrategyRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesTransportStrategyMod {
  
  @JSImport("pusher-js/types/src/core/strategies/transport_strategy", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TransportStrategy {
    def this(
      name: String,
      priority: Double,
      transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default,
      options: StrategyOptions
    ) = this()
    
    /* CompleteClass */
    override def connect(minPriority: Double, callback: js.Function): StrategyRunner = js.native
    
    /* CompleteClass */
    override def isSupported(): Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var options: StrategyOptions = js.native
    
    /* CompleteClass */
    var priority: Double = js.native
    
    /* CompleteClass */
    var transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default = js.native
  }
  
  trait TransportStrategy
    extends StObject
       with Strategy {
    
    var name: String
    
    var options: StrategyOptions
    
    var priority: Double
    
    var transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default
  }
  object TransportStrategy {
    
    inline def apply(
      connect: (Double, js.Function) => StrategyRunner,
      isSupported: CallbackTo[Boolean],
      name: String,
      options: StrategyOptions,
      priority: Double,
      transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default
    ): TransportStrategy = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), isSupported = isSupported.toJsFn, name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportStrategy]
    }
    
    extension [Self <: TransportStrategy](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: StrategyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportMod.default): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
