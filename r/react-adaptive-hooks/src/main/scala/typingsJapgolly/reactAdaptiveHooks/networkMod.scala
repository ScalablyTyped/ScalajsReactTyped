package typingsJapgolly.reactAdaptiveHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkMod {
  
  @JSImport("react-adaptive-hooks/network", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useNetworkStatus(): typingsJapgolly.reactAdaptiveHooks.anon.EffectiveConnectionType = ^.asInstanceOf[js.Dynamic].applyDynamic("useNetworkStatus")().asInstanceOf[typingsJapgolly.reactAdaptiveHooks.anon.EffectiveConnectionType]
  inline def useNetworkStatus(initialEffectiveConnectionType: EffectiveConnectionType): typingsJapgolly.reactAdaptiveHooks.anon.EffectiveConnectionType = ^.asInstanceOf[js.Dynamic].applyDynamic("useNetworkStatus")(initialEffectiveConnectionType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactAdaptiveHooks.anon.EffectiveConnectionType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactAdaptiveHooks.reactAdaptiveHooksStrings.`slow-2g`
    - typingsJapgolly.reactAdaptiveHooks.reactAdaptiveHooksStrings.`2g`
    - typingsJapgolly.reactAdaptiveHooks.reactAdaptiveHooksStrings.`3g`
    - typingsJapgolly.reactAdaptiveHooks.reactAdaptiveHooksStrings.`4g`
  */
  trait EffectiveConnectionType extends StObject
  object EffectiveConnectionType {
    
    inline def `2g`: typingsJapgolly.reactAdaptiveHooks.reactAdaptiveHooksStrings.`2g` = "2g".asInstanceOf[typingsJapgolly.reactAdaptiveHooks.reactAdaptiveHooksStrings.`2g`]
    
    inline def `3g`: typingsJapgolly.reactAdaptiveHooks.reactAdaptiveHooksStrings.`3g` = "3g".asInstanceOf[typingsJapgolly.reactAdaptiveHooks.reactAdaptiveHooksStrings.`3g`]
    
    inline def `4g`: typingsJapgolly.reactAdaptiveHooks.reactAdaptiveHooksStrings.`4g` = "4g".asInstanceOf[typingsJapgolly.reactAdaptiveHooks.reactAdaptiveHooksStrings.`4g`]
    
    inline def `slow-2g`: typingsJapgolly.reactAdaptiveHooks.reactAdaptiveHooksStrings.`slow-2g` = "slow-2g".asInstanceOf[typingsJapgolly.reactAdaptiveHooks.reactAdaptiveHooksStrings.`slow-2g`]
  }
}
