package typingsJapgolly.pusherJs

import typingsJapgolly.pusherJs.typesSrcCoreConfigMod.Config
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyMod.Strategy
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyOptionsMod.StrategyOptions
import typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportManagerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesStrategyBuilderMod {
  
  @JSImport("pusher-js/types/src/core/strategies/strategy_builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pusher-js/types/src/core/strategies/strategy_builder", "defineTransport")
  @js.native
  def defineTransport: js.Function6[
    /* config */ Config, 
    /* name */ String, 
    /* type */ String, 
    /* priority */ Double, 
    /* options */ StrategyOptions, 
    /* manager */ js.UndefOr[default], 
    Strategy
  ] = js.native
  inline def defineTransport_=(
    x: js.Function6[
      /* config */ Config, 
      /* name */ String, 
      /* type */ String, 
      /* priority */ Double, 
      /* options */ StrategyOptions, 
      /* manager */ js.UndefOr[default], 
      Strategy
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defineTransport")(x.asInstanceOf[js.Any])
}
